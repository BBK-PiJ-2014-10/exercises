class Spy {
	public static int spyCount;
	private int ID;

	public Spy(int id){
		this.spyCount += 1;
		this.ID = id;
		System.out.println("Spy ID: "  + id);
		System.out.println("Total spies: " + this.spyCount);
	}
	
	public void die(){
		this.spyCount -= 1;
		System.out.println("Spy " + this.ID + " eliminated.");
		System.out.println("Total spies: " + this.spyCount);
	}

	public static void main(String[] args) {
		Spy spy1 = new Spy(1);
		spy1.die();
		Spy spy2 = new Spy(1);
		Spy spy3 = new Spy(1);
		Spy spy4 = new Spy(1);
		spy4.die();
		Spy spy5 = new Spy(1);
		spy5.die();
		Spy spy6 = new Spy(1);
	}
}