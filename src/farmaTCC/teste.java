package farmaTCC;

public class teste {
	
	public static void main(String[] args){
		conn.getConn();
		conn.statusConn();
		conn.closeConn();
		conn.statusConn();
		conn.getConn();
		conn.statusConn();
		conn.restartConn();
		conn.statusConn();
	}

}
