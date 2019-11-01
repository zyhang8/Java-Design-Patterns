public class Application{
    public static void main(String args[]){
       HDMI hdmi;        
       Thunder thunder;
       TypeC typec;
       TFCard tfcard;
       SDCard sdcard;
       USB3One usb3one;
       USB3Two usb3two;
       LCD lcd=new LCD(); //��ʾ��
       ThundeRobot thunderobot=new ThundeRobot();//����
       Watch watch=new Watch();//�ֱ�
       XiaoMi xiaomi=new XiaoMi();//��׿�ֻ�
       Pixel pixel=new Pixel();	//TypeC�ֻ�
       Sony sony=new Sony(); //����
       TF tf=new TF();	//TF��
       CF cf=new CF(); 	//CF��
       SD sd=new SD();	//SD��
       miniSD minisd=new miniSD();	//miniSD��
       UsbDisk usbdisk=new UsbDisk();	//U��
       iPad ipad=new iPad();	//ƽ��
       HardDisk harddisk=new HardDisk();	//�ƶ�Ӳ��
       WIFI wifi=new WIFI();	//·��
       FourteenAdapter adapter = new FourteenAdapter(lcd, thunderobot, watch, xiaomi, pixel, sony, tf, cf, sd, minisd, usbdisk, ipad, harddisk, wifi);
       System.out.println("��չ�����ӣ�");
       adapter.connectMacbook();
    }
}
class LCD implements HDMI{
	String name;
	LCD (){
		name = "LCD��ʾ��";
	}
	LCD (String name){
		this.name = name;
	}
	public void connectMacbook() {
		System.out.println("\t" + name + "���ӳɹ�");
	}
}
class ThundeRobot implements VGA{
	String name;
	ThundeRobot (){
		name = "����RTX";
	}
	ThundeRobot (String name){
		this.name = name;
	}
	public void connectMacbook() {
		System.out.println("\t" + name + "���ӳɹ�");
	}
}
class Watch implements Thunder{
	String name;
	Watch (){
		name = "HUAWEI WATCH 2";
	}
	Watch (String name){
		this.name = name;
	}
	public void connectMacbook() {
		System.out.println("\t" + name + "���ӳɹ�");
	}
}
class XiaoMi implements Micro{
	String name;
	XiaoMi (){
		name = "С��8";
	}
	XiaoMi (String name){
		this.name = name;
	}
	public void connectMacbook() {
		System.out.println("\t" + name + "���ӳɹ�");
	}
}
class Pixel implements TypeC{
	String name;
	Pixel (){
		name = "Google Pixel3 XL";
	}
	Pixel (String name){
		this.name = name;
	}
	public void connectMacbook() {
		System.out.println("\t" + name + "���ӳɹ�");
	}
}
class Sony implements OMTP{
	String name;
	Sony (){
		name = "Sony WH-1000XM3";
	}
	Sony (String name){
		this.name = name;
	}
	public void connectMacbook() {
		System.out.println("\t" + name + "���ӳɹ�");
	}
}
class TF implements TFCard{
	String name;
	TF (){
		name = "Kingstom TF��";
	}
	TF (String name){
		this.name = name;
	}
	public void connectMacbook() {
		System.out.println("\t" + name + "���ӳɹ�");
	}
}
class CF implements CFCard{
	String name;
	CF (){
		name = "Lenovo CF��";
	}
	CF (String name){
		this.name = name;
	}
	public void connectMacbook() {
		System.out.println("\t" + name + "���ӳɹ�");
	}
}
class SD implements SDCard{
	String name;
	SD (){
		name = "Sumsung SD��";
	}
	SD (String name){
		this.name = name;
	}
	public void connectMacbook() {
		System.out.println("\t" + name + "���ӳɹ�");
	}
}
class miniSD implements miniSDCard{
	String name;
	miniSD (){
		name = "SanDisk ����SD��";
	}
	miniSD (String name){
		this.name = name;
	}
	public void connectMacbook() {
		System.out.println("\t" + name + "���ӳɹ�");
	}
}
class UsbDisk implements USB3One{
	String name;
	UsbDisk (){
		name = "Dell U��";
	}
	UsbDisk (String name){
		this.name = name;
	}
	public void connectMacbook() {
		System.out.println("\t" + name + "���ӳɹ�");
	}
}
class iPad implements Lightning{
	String name;
	iPad (){
		name = "iPad 3";
	}
	iPad (String name){
		this.name = name;
	}
	public void connectMacbook() {
		System.out.println("\t" + name + "���ӳɹ�");
	}
}
class HardDisk implements USB3Two{
	String name;
	HardDisk (){
		name = "Toshiba������";
	}
	HardDisk (String name){
		this.name = name;
	}
	public void connectMacbook() {
		System.out.println("\t" + name + "���ӳɹ�");
	}
}
class WIFI implements RJ45{
	String name;
	WIFI (){
		name = "TP-LINK·����";
	}
	WIFI (String name){
		this.name = name;
	}
	public void connectMacbook() {
		System.out.println("\t" + name + "���ӳɹ�");
	}
}