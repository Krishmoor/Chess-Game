
import java.util.ArrayList;
import java.util.List;

public class Pawn extends Piece
{
    Pawn(byte row, byte col, byte teamNo,String pieceName)
    {
        super(row,col,teamNo,pieceName);
    }
    @Override
    public List<Integer[]> getMoves()
    {
        List<Integer[]> moves = new ArrayList<>();
        if(teamNo==0) {
            moves.add(new Integer[]{(int)row,col + 1});
            //if()
        }
        else
            moves.add(new Integer[]{row,col-1});
        return moves;
    }
    @Override
    public void move(List<Integer[]> moves)
    {
        byte moveRow=Input.getByte();
        byte moveCol=Input.getByte();
        byte[] currMove={moveRow,moveCol};
        if(moves.contains(currMove))
        {
            this.row=moveRow;
            this.col=moveCol;
        }
    }
}
