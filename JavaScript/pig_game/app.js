/*
GAME RULES:

  The game has 2 players, playing in rounds
  Every round, a player rolls a dice as many times as he whishes. Each result get added to his ROUND score
  BUT, if the player rolls a 1, all his ROUND score gets lost. After that, it's the next player's turn
  The player can choose to 'Hold', which means that his ROUND score gets added to his GLBAL score. After that, it's the next player's turn
  The first player to reach 100 points on GLOBAL score wins the game
*/

// ******************************** DECLARATIONS/INITIALIZAITIONS ********************************
let activePlayer, score, roundScore, dice, winCondition, winScreen;
activePlayer = 0;
winCondition = 100;

setup();

// ******************************** ONCLICK FUNCTIONS ********************************
// ROLL ONCLICK
document.querySelector('.btn-roll').onclick = function(){
    console.log('roll');
    if(!winScreen) {
        dice = Math.floor(Math.random()*6)+1;
        document.querySelector('.dice').src='dice-' + dice +'.png';

        // Check for lose condition
        if(dice === 1) {lose();}
        else {
            roundScore = roundScore + dice;
            // Check for win condition
            if (score[activePlayer]+roundScore >= winCondition) {
                // Update screen (CAN WIN WITHOUT CLICKING HOLD)
                console.log("WINNER!");
                winScreen = true;
                document.getElementById('current-' + activePlayer).textContent = roundScore;
                document.getElementById('score-' + activePlayer).textContent = score[activePlayer]+roundScore;
                document.querySelector('.player-'+ activePlayer + '-panel').classList.toggle('winner');
            } else {
                document.getElementById('current-' + activePlayer).textContent = roundScore;
            }
        }
    }
};

// HOLD ONCLICK
document.querySelector('.btn-hold').onclick = function() {
    console.log('hold');
    if (!winScreen) {
        score[activePlayer] = score[activePlayer] + roundScore; 
        roundScore = 0;
        document.getElementById('score-' + activePlayer).textContent = score[activePlayer];
        document.getElementById('current-' + activePlayer).textContent = 0;
        changePlayer();
    }
};

//  NEW GAME ONCLICK
document.querySelector('.btn-new').onclick = function() {
    console.log('new game');
    setup();
}

// ******************************** FUNCTIONS ********************************
function setup() {
    if(winScreen){
        document.querySelector('.player-'+ activePlayer + '-panel').classList.toggle('winner');
    } 
    score = [0,0];
    roundScore = 0;
    winScreen = false;
    document.getElementById('current-0').textContent = 0;
    document.getElementById('score-0').textContent = 0; 
    document.getElementById('current-1').textContent = 0;
    document.getElementById('score-1').textContent = 0; 
}

function changePlayer() {
    if(activePlayer === 1) {
        activePlayer--;
        document.querySelector('.player-0-panel').classList.toggle("active");
        document.querySelector('.player-1-panel').classList.toggle("active");                         
    } else { 
        activePlayer++;
        document.querySelector('.player-0-panel').classList.toggle("active");             
        document.querySelector('.player-1-panel').classList.toggle("active");          
    }
}

function lose() {
    roundScore = 0;
    document.getElementById('current-' + activePlayer).textContent = 0;
    changePlayer();
}
