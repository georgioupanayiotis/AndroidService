public class MyService extends Service {
  @Override
  public void onCreate() {
  }
 
  @Override
  public void onStart(Intent intent, int startId) {
    //do something
  }
 
  @Override
  public IBinder onBind(Intent intent) {
    return null;
  }
}
