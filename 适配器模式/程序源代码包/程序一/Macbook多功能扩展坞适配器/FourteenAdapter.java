//ʮ����������ģʽ
public class FourteenAdapter implements HDMI, VGA, Thunder, Micro, TypeC, OMTP, TFCard, CFCard, SDCard, miniSDCard, USB3One, Lightning, USB3Two, RJ45{
	HDMI hdmi;
	VGA vga;
	Thunder thunder;
	Micro micro;
	TypeC typec;
	OMTP omtp;
	TFCard tfcard;
	CFCard cfcard;
	SDCard sdcard;
	miniSDCard minisdcard;
	USB3One usb3one;
	Lightning lightning;
	USB3Two usb3two;
	RJ45 rj45;
	FourteenAdapter(HDMI hdmi, VGA vga, Thunder thunder, Micro micro, TypeC typec, OMTP omtp, TFCard tfcard, CFCard cfcard, SDCard sdcard, miniSDCard minisdcard, USB3One usb3one, Lightning lightning, USB3Two usb3two, RJ45 rj45){
       this.hdmi=hdmi;
       this.vga=vga;
       this.thunder=thunder;
       this.micro=micro;
       this.typec=typec;
       this.omtp=omtp;
       this.tfcard=tfcard;
       this.cfcard=cfcard;
       this.sdcard=sdcard;
       this.minisdcard=minisdcard;
       this.usb3one=usb3one;
       this.lightning=lightning;
       this.usb3two=usb3two;
       this.rj45=rj45;
    }
public void connectMacbook(){
	if(this instanceof HDMI) {
		System.out.println("\tת����HDMI�ӿ�:");
		vga.connectMacbook();	
	}
	if(this instanceof VGA) {
		System.out.println("\tת����VGA�ӿ�:");
		hdmi.connectMacbook();	
	}
	if(this instanceof Thunder) {
		System.out.println("\tת�����׵�ӿ�:");
		micro.connectMacbook();	
	}
	if(this instanceof Micro) {
		System.out.println("\tת���ɰ�׿�ӿ�:");
		thunder.connectMacbook();
	}
	if(this instanceof TypeC) {
		System.out.println("\tת����TypeC�ӿ�:");
		omtp.connectMacbook();	
	}
	if(this instanceof OMTP) {
		System.out.println("\tת����VGA�ӿ�:");
		typec.connectMacbook();	
	}
	if(this instanceof TFCard) {
		System.out.println("\tת����TF����:");
		cfcard.connectMacbook();	
	}
	if(this instanceof CFCard) {
		System.out.println("\tת����CF����:");
		tfcard.connectMacbook();	
	}
	if(this instanceof SDCard) {
		System.out.println("\tת����SDCard����:");
		minisdcard.connectMacbook();	
	}
	if(this instanceof miniSDCard) {
		System.out.println("\tת����miniSDCard����:");
		sdcard.connectMacbook();	
	}
	if(this instanceof USB3One) {
		System.out.println("\tת����HDMI�ӿ�:");
		lightning.connectMacbook();	
	}
	if(this instanceof Lightning) {
		System.out.println("\tת����VGA�ӿ�:");
		usb3one.connectMacbook();	
	}
	if(this instanceof USB3Two) {
		System.out.println("\tת����HDMI�ӿ�:");
		rj45.connectMacbook();	
	}
	if(this instanceof RJ45) {
		System.out.println("\tת����VGA�ӿ�:");
		usb3two.connectMacbook();	
	}
   }
}