package day17;

public enum ChessPiece {
    KING_WHITE(100,"♔"), KING_BLACK(100,"♚"), QUEEN_WHITE(9,"♕"), QUEEN_BLACK(9,"♛"),
    ROOK_BLACK(5,"♜"), ROOK_WHITE(5,"♖"), BISHOP_BLACK(3.5,"♝"), BISHOP_WHITE(3.5,"♗"),
    PAWN_BLACK(1,"♟"), PAWN_WHITE(1,"♙"), KNIGHT_WHITE(3, "♘"), KNIGHT_BLACK(3,"♞"),
    EMPTY(-1,"_");

    private double i;
    private String s;

    ChessPiece(double i, String s) {
        this.i = i;
        this.s = s;
    }

    public double getI() {
        return i;
    }

    public String getS() {
        return s;
    }
}
