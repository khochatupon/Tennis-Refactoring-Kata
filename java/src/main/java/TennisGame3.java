
public class TennisGame3 implements TennisGame {
    
    private int p2;
    private int p1;
    private String p1N;
    private String p2N;

    public TennisGame3(String p1N, String p2N) {
        this.p1N = p1N;
        this.p2N = p2N;
    }

    public String getScore() {
       /* String s;
        if (p1 < 4 && p2 < 4 && !(p1 + p2 == 6)) {
            String[] p = new String[]{"Love", "Fifteen", "Thirty", "Forty"}; 
            s = p[p1];
            return (p1 == p2) ? s + "-All" : s + "-" + p[p2];
        } else {
            if (p1 == p2)
                return "Deuce";
            s = p1 > p2 ? p1N : p2N;
            return ((p1-p2)*(p1-p2) == 1) ? "Advantage " + s : "Win for " + s;
        }*/
        ////////////////////////////////
        if (p1==p2 && p1>=3) {
            return "Deuce";
        }
        else if (Math.abs(p1-p2)==1 && (p1+p2)>6){
            if (p1>p2)
                return "Advantage "+p1N;
            return "Advantage "+p2N;
        }
        else if (Math.abs(p1-p2)>=2 && (p1>3||p2>3)){
            if (p1>p2)
                return "Win for " + p1N;
            return "Win for " + p2N;
        }
        else {
            String[] p = new String[]{"Love", "Fifteen", "Thirty", "Forty"};
            if (p1 == p2)
                return  p[p1] + "-All";
            return p[p1] + "-" + p[p2];
        }

    }
    
    public void wonPoint(String playerName) {
        if (playerName == "player1")
            this.p1 += 1;
        else
            this.p2 += 1;
        
    }

}
