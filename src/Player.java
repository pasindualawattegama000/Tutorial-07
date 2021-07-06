class Player {
    String Name;
    int age;
    String type;
    int wickets;
    int runs;
    double strikeRate;

    Player (String name,int age,String type,int wickets,int runs, double strikeRate){
        Name= name;
        this.age=age;
        this.type=type;
        this.wickets=wickets;
        this.runs=runs;
        this.strikeRate = strikeRate;

    }
    String getName(){
        return Name;
    }
    void setName(String name){
        Name=name;
    }
    void  setAge(int age){
        this.age=age;
    }
    int getage(){
        return age;

    }
    void setType(String type){
        this.type=type;

    }
    String getType(){
        return type;
    }
    void setwickets(int wickets){
        this.wickets=wickets;

    }
    int getwickets(){
        return wickets;

    }
    void setRuns(int runs){
        this.runs= runs;
    }
    int getRuns(){
        return runs;
    }

}
