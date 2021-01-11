public class App {
    public static void main(String[] args) throws Exception {
        byte myNewByte = 2;
        short myNewShort = 365;
        int myNewInt = 551235;
        long myNewLong = 50000 + (10L * (myNewByte + myNewShort+ myNewInt));
        System.out.println("My new value = " + myNewLong);

        short shortTotal = (short)(100 + 10 * (myNewByte + myNewShort + myNewInt));
    }
}
