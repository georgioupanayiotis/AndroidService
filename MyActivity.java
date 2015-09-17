public class MyActivity extends Activity {
  @Override
  public void onCreate() {
    …
    startService(new Intent(this, MyService.class);
  }
 
  @Override
  public void onStop() {
    …
    stopService(new Intent(this, MyService.class));
  }
}
