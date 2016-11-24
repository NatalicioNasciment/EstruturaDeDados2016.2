package exercicio9;

public class BuscaBinaria{

    public static int buscaBinaria( Comparable [ ] a, Comparable x )
    {
        return buscaBinaria( a, x, 0, a.length -1 );
    }
    
    
    private static int buscaBinaria( Comparable [ ] a, Comparable x, int i, int j ){
        if( i > j )
        	//caso não encontrado
            return -1;

        int meio = ( i + j ) / 2;

        if( a[ meio ].compareTo( x ) < 0 )
            return buscaBinaria( a, x, meio + 1, j );
        else if( a[ meio ].compareTo( x ) > 0 )
            return buscaBinaria( a, x, i, meio - 1 );
        else
            return meio;
    }
}

