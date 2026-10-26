package zadaci;

public class Player {
	
	
	private String ime;
	private int x;
	private int y;
	private int width;
	private int height;
	private int health;
	
		
	

	public Player(String ime, int x, int y, int width, int height, int health) {
	this.ime = ime;
	this.x = x;
	this.y = y;
	this.width = width;
	this.height = height;
	this.health = health;
}




	public String getIme() {
		return ime;
		
	}


	public void setIme(String ime) {
		if (ime == null || ime.trim().isEmpty()) {
            this.ime = "Nepoznati Igrač"; 
        } else {
            
            String cistoIme = ime.trim().replaceAll("\\s+", " ");
            
           
            String[] rijeci = cistoIme.split(" ");
            String konacnoIme = "";
            for (String rijec : rijeci) {
                konacnoIme += rijec.substring(0, 1).toUpperCase() + rijec.substring(1).toLowerCase() + " ";
            }
            this.ime = konacnoIme.trim();
        }
	}




	public int getX() {
		return x;
	}




	public void setX(int x) {
		this.x = x;
	}




	public int getY() {
		return y;
	}




	public void setY(int y) {
		this.y = y;
	}




	public int getWidth() {
		return width;
	}




	public void setWidth(int width) {
		this.width = width;
	}




	public int getHeight() {
		return height;
	}




	public void setHeight(int height) {
		this.height = height;
	}




	public int getHealth() {
		return health;
	}




	public void setHealth(int health) {
		
	
		if (health < 0) {
            this.health = 0;
        } else if (health > 100) {
            this.health = 100;
        } else {
            this.health = health;
	}
	}




	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
