public class People {
    boolean gender;
    String First_Name;
    String Last_Name;
    double height;
    double weight;
    public boolean Speak(People o){
        if((this.gender==true&o.gender==true)||(this.gender==false&o.gender==true)||(this.gender==true&o.gender==false)){
            return true;
        }
        else
            return false;
    }
    public boolean Like_Socium(People o){
        if((this.gender==true&o.gender==true)||(this.gender==false&o.gender==true)||(this.gender==true&o.gender==false)){
            return true;
        }
        else
            return false;
    }
    public boolean SpendTimeTogether(People o){
        if (this.height-o.height<20&this.height-o.height>-20){
            return  true;
        }
        else
            return false;
    }
    public People Make_People(People o){
        return o;
    }

    @Override
    public String toString() {
        return "People{" +
                "gender=" + gender +
                ", First_Name='" + First_Name + '\'' +
                ", Last_Name='" + Last_Name + '\'' +
                ", height=" + height +
                ", weight=" + weight +
                '}';
    }

    public void To_have_relation(People o){
        if (this.Speak(o)==true&this.Like_Socium(o)==true&this.SpendTimeTogether(o)==true&(this.gender!=o.gender)){
            People s=this.Make_People(o);
            System.out.println(s.toString());
        }

    }

}
