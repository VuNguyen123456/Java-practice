class Animal{
	protected boolean nocturnal;
	protected String type;
	protected String name;

	public void printFeed(){}

	public void printSleepInfo(){
		if (nocturnal){
			System.out.println(this.type+"s sleep during day.");
		}else{
			System.out.println(this.type+"s sleep during night.");
		}
	}

	public void printInfo(){
		System.out.println(this.name+" is a(n) "+this.type+".");
	}

	public void printRoam(){
		System.out.println(this.name+" walks around.");
	}
}

class Monkey extends Animal{
	public Monkey(String name){
		this.type = "Monkey";
		this.nocturnal = false;
		this.name = name;
	}
	
	@Override
	public void printFeed(){
		System.out.println("You give" + name +" some bananas.");
	}
	public void printClimb(){
		System.out.println(name + " climb a tree!");
	}
}

class Owl extends Animal{
	public Owl(String name){
		this.type = "Owl";
		this.nocturnal = true;
		this.name = name;
	}
	
	@Override
	public void printFeed(){
		System.out.println("You give" + name +" some mice.");
	}
	public void printRoam(){
		System.out.println(name + " flies around.");
	}
}

class Zoo {
	protected Animal[] animals = new Animal[2];
	 
	public void main(String[] args){
	Monkey mon = new Monkey("key");
	Owl mon2 = new Owl("O");
	animals[0] = mon;
	animals[1] = mon2;
	for (int i = 0; i < animals.length; ++i){
		// Looking into the object and figuring out the class of the object.
		 animals[i].printInfo();
		 animals[i].printSleepInfo();
		 animals[i].printFeed();
		 animals[i].printRoam();
	}
	((Monkey)animals[1]).printClimb();
	}
}
