package BaiTap1_Test;

public class Tenis {
    public static String getScore(String player1Name, String player2Name, int scoreOfPlayer1, int scoreOfPlayer2) {
        String score = "";
        int tempScore = 0;
        if (scoreOfPlayer1 == scoreOfPlayer2) {
            score = getDeuce(scoreOfPlayer1);
        } else if (scoreOfPlayer1 >= 4 || scoreOfPlayer2 >= 4) {
            score = getAdvantage(scoreOfPlayer1, scoreOfPlayer2);
        } else {
            score = getScore(scoreOfPlayer1, scoreOfPlayer2, score);
        }
        return score;
    }

    private static String getScore(int scoreOfPlayer1, int scoreOfPlayer2, String score) {
        int tempScore;
        for (int i = 1; i < 3; i++) {
            if (i == 1) tempScore = scoreOfPlayer1;
            else {
                score += "-";
                tempScore = scoreOfPlayer2;
            }
            switch (tempScore) {
                case 0:
                    score += "Love";
                    break;
                case 1:
                    score += "Fifteen";
                    break;
                case 2:
                    score += "Thirty";
                    break;
                case 3:
                    score += "Forty";
                    break;
            }
        }
        return score;
    }

    private static String getAdvantage(int scoreOfPlayer1, int scoreOfPlayer2) {
        String score;
        int minusResult = scoreOfPlayer1 - scoreOfPlayer2;
        boolean player1_advantaged = minusResult == 1;
        boolean player2_Advantage = minusResult == -1;
        boolean player1Win = minusResult >= 2;
        if (player1_advantaged) score = "Advantage player1";
        else {
            if (player2_Advantage) score = "Advantage player2";
            else {
                if (player1Win) score = "Win for player1";
                else score = "Win for player2";
            }
        }
        return score;
    }

    private static String getDeuce(int scoreOfPlayer1) {
        String score;
        switch (scoreOfPlayer1) {
            case 0:
                score = "Love-All";
                break;
            case 1:
                score = "Fifteen-All";
                break;
            case 2:
                score = "Thirty-All";
                break;
            case 3:
                score = "Forty-All";
                break;
            default:
                score = "Deuce";
                break;

        }
        return score;
    }
}
