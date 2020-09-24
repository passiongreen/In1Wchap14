class Main {
  public static void main(String[] args) {

    Wearable[] a = new Wearable[2];
    a[0] = new Headphone();
    a[1] = new WearableComputer();

    for (int i = 0 ; i < a.length ; i++)
      a[i].putOn();

    for (int i = 0 ; i < a.length ; i++)
      a[i].putOff();

  }
}

public class Headphone implements Wearable {

    
  int volume = 0;


  public void putOn() {
    System.out.println("헤드폰을 착용했습니다.");
  }

  public void putOff() {
    System.out.println("헤드폰을 벗었습니다.");
  }

  public void setVolume(int volume) {

    this.volume = volume;
    System.out.println("볼륨을 " + volume + "로 변경했습니다.");
  }


}

//인터페이스는 설계도, 작업지시서 
// public 과 abstract 개념

public interface Wearable {

  void putOn();
  void putOff();

}

public class WearableComputer implements Wearable {

  public void putOn() {
    System.out.println("컴퓨터를 실행했습니다.");
  }

  public void putOff() {
    System.out.println("컴퓨터를 껏습니다.");
  }

  public void reset() {
    System.out.println("컴퓨터를 재시작했습니다.");
  }

}
