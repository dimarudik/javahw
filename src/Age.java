public class Age {

    public static void main(String[] args) {

        int vasyaAge = 35;
        int katyaAge = 31;
        int mishaAge = 33;
        int min = (vasyaAge < katyaAge && vasyaAge < mishaAge) ? vasyaAge : Math.min(katyaAge, mishaAge);
        int max = (vasyaAge > katyaAge && vasyaAge > mishaAge) ? vasyaAge : Math.max(katyaAge, mishaAge);
        int middle = 0;

        if ( vasyaAge < max && vasyaAge > min)
            middle = vasyaAge;
        if ( katyaAge < max && katyaAge > min)
            middle = katyaAge;
        if ( mishaAge < max && mishaAge > min)
            middle = mishaAge;

        System.out.println("min = " + min + "; middle = " + middle + "; max = " + max);

    }

}
