package ss8_clean_code.bai_tap;

public class TennisGame {
	public static String getScore(String player1Name, String player2Name, int m_score1, int m_score2) {
        String result = "";
        int tempScore=0;
        if (m_score1==m_score2)
        {
            switch (m_score1)
            {
                case 0:
                    result = "Love-All";
                    break;
                case 1:
                    result = "Fifteen-All";
                    break;
                case 2:
                    result = "Thirty-All";
                    break;
                case 3:
                    result = "Forty-All";
                    break;
                default:
                    result = "Deuce";
                    break;

            }
        }
        else if (m_score1>=4 || m_score2>=4)
        {
            int minusResult = m_score1-m_score2;
            if (minusResult==1) result ="Advantage player1";
            else if (minusResult ==-1) result ="Advantage player2";
            else if (minusResult>=2) result = "Win for player1";
            else result ="Win for player2";
        }
        else
        {
            for (int i=1; i<3; i++)
            {
                if (i==1) tempScore = m_score1;
                else { result+="-"; tempScore = m_score2;}
                switch(tempScore)
                {
                    case 0:
                        result+="Love";
                        break;
                    case 1:
                        result+="Fifteen";
                        break;
                    case 2:
                        result+="Thirty";
                        break;
                    case 3:
                        result+="Forty";
                        break;
                }
            }
        }
        return result;
    }
	
//	public static 
}
