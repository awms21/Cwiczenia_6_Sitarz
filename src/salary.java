public interface salary {
    float salaryToPay(float payPerHour, int numberOfHours);

    default float salaryForOvertime(float payPerHour, int extraHours){
        return (float)(payPerHour * extraHours * 1.5);
    }

    static boolean bonusYesOrNo(float experienceYears){
        if(experienceYears>3){
            return true;}
        else{
            return false;}
    }
}
