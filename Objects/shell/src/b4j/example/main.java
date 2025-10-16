
package b4j.example;

import java.io.IOException;
import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RDebug;
import anywheresoftware.b4a.pc.RemoteObject;
import anywheresoftware.b4a.pc.RDebug.IRemote;
import anywheresoftware.b4a.pc.Debug;
import anywheresoftware.b4a.pc.B4XTypes.B4XClass;
import anywheresoftware.b4a.pc.B4XTypes.DeviceClass;

public class main implements IRemote{
	public static main mostCurrent;
	public static RemoteObject ba;
    public static boolean processGlobalsRun;
    public static RemoteObject myClass;
    public static RemoteObject remoteMe;
	public main() {
		mostCurrent = this;
	}
    public RemoteObject getRemoteMe() {
        return remoteMe;    
    }
    
public boolean isSingleton() {
		return true;
	}
    static {
		mostCurrent = new main();
		remoteMe = RemoteObject.declareNull("b4j.example.main");
        anywheresoftware.b4a.pc.RapidSub.moduleToObject.put(new B4XClass("main"), "b4j.example.main");
	}
    public static void main (String[] args) throws Exception {
		new RDebug(args[0], Integer.parseInt(args[1]), Integer.parseInt(args[2]), args[3]);
		RDebug.INSTANCE.waitForTask();

	}
    private static PCBA pcBA = new PCBA(null, main.class);
	public static RemoteObject runMethod(boolean notUsed, String method, Object... args) throws Exception{
		return (RemoteObject) pcBA.raiseEvent(method.substring(1), args);
	}
    public static void runVoidMethod(String method, Object... args) throws Exception{
		runMethod(false, method, args);
	}
    public static RemoteObject getObject() {
		return myClass;
	 }
	public PCBA create(Object[] args) throws ClassNotFoundException{
		ba = (RemoteObject) args[1];
		pcBA = new PCBA(this, main.class);
        main_subs_0.initializeProcessGlobals();
		return pcBA;
	}
public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _fx = RemoteObject.declareNull("anywheresoftware.b4j.objects.JFX");
public static RemoteObject _xui = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");
public static RemoteObject _mainform = RemoteObject.declareNull("anywheresoftware.b4j.objects.Form");
public static RemoteObject _pnlbackground = RemoteObject.declareNull("anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper");
public static RemoteObject _lblclock = RemoteObject.declareNull("anywheresoftware.b4j.objects.LabelWrapper");
public static RemoteObject _lbldate = RemoteObject.declareNull("anywheresoftware.b4j.objects.LabelWrapper");
public static RemoteObject _lblweather = RemoteObject.declareNull("anywheresoftware.b4j.objects.LabelWrapper");
public static RemoteObject _lbltemperature = RemoteObject.declareNull("anywheresoftware.b4j.objects.LabelWrapper");
public static RemoteObject _lblweathericon = RemoteObject.declareNull("anywheresoftware.b4j.objects.LabelWrapper");
public static RemoteObject _lblweatherdetails = RemoteObject.declareNull("anywheresoftware.b4j.objects.LabelWrapper");
public static RemoteObject _pnlanalogclock = RemoteObject.declareNull("anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper");
public static RemoteObject _cvsanalogclock = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XCanvas");
public static RemoteObject _isanalogmode = RemoteObject.createImmutable(false);
public static RemoteObject _pnlinfooverlay = RemoteObject.declareNull("anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper");
public static RemoteObject _showinfopanel = RemoteObject.createImmutable(false);
public static RemoteObject _timupdate = RemoteObject.declareNull("anywheresoftware.b4a.objects.Timer");
public static RemoteObject _timimagechange = RemoteObject.declareNull("anywheresoftware.b4a.objects.Timer");
public static RemoteObject _jo = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
public static RemoteObject _jstage = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
public static RemoteObject _job = RemoteObject.declareNull("b4j.example.httpjob");
public static RemoteObject _imgview = RemoteObject.declareNull("anywheresoftware.b4j.objects.ImageViewWrapper");
public static RemoteObject _showimage = RemoteObject.createImmutable(false);
public static RemoteObject _currentimageinterval = RemoteObject.createImmutable(0);
public static RemoteObject _imageintervals = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
public static RemoteObject _imageintervalnames = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
public static RemoteObject _lastimagechangetime = RemoteObject.createImmutable(0L);
public static RemoteObject _pnlsettings = RemoteObject.declareNull("anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper");
public static RemoteObject _btnsettings = RemoteObject.declareNull("anywheresoftware.b4j.objects.ButtonWrapper");
public static RemoteObject _btntheme = RemoteObject.declareNull("anywheresoftware.b4j.objects.ButtonWrapper");
public static RemoteObject _btnimagetimer = RemoteObject.declareNull("anywheresoftware.b4j.objects.ButtonWrapper");
public static RemoteObject _btnbackground = RemoteObject.declareNull("anywheresoftware.b4j.objects.ButtonWrapper");
public static RemoteObject _btnbgcolor = RemoteObject.declareNull("anywheresoftware.b4j.objects.ButtonWrapper");
public static RemoteObject _btnclockmode = RemoteObject.declareNull("anywheresoftware.b4j.objects.ButtonWrapper");
public static RemoteObject _btnprayertoggle = RemoteObject.declareNull("anywheresoftware.b4j.objects.ButtonWrapper");
public static RemoteObject _btnlanguage = RemoteObject.declareNull("anywheresoftware.b4j.objects.ButtonWrapper");
public static RemoteObject _btninfopanel = RemoteObject.declareNull("anywheresoftware.b4j.objects.ButtonWrapper");
public static RemoteObject _settingsvisible = RemoteObject.createImmutable(false);
public static RemoteObject _colorschemes = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
public static RemoteObject _currentthemeindex = RemoteObject.createImmutable(0);
public static RemoteObject _currentbgindex = RemoteObject.createImmutable(0);
public static RemoteObject _currentclockcolor = RemoteObject.createImmutable(0);
public static RemoteObject _weatherdata = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
public static RemoteObject _latitude = RemoteObject.createImmutable(0);
public static RemoteObject _longitude = RemoteObject.createImmutable(0);
public static RemoteObject _cityname = RemoteObject.createImmutable("");
public static RemoteObject _weatheremoji = RemoteObject.createImmutable("");
public static RemoteObject _showprayertimes = RemoteObject.createImmutable(false);
public static RemoteObject _lblprayertimes = RemoteObject.declareNull("anywheresoftware.b4j.objects.LabelWrapper");
public static RemoteObject _pnlprayercards = RemoteObject.declareNull("anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper");
public static RemoteObject _prayerlabels = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
public static RemoteObject _currentlanguage = RemoteObject.createImmutable("");
public static RemoteObject _translations = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
public static RemoteObject _settingsfile = RemoteObject.createImmutable("");
public static RemoteObject _btnchangecity = RemoteObject.declareNull("anywheresoftware.b4j.objects.ButtonWrapper");
public static RemoteObject _citysearchdialog = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
public static b4j.example.httputils2service _httputils2service = null;
  public Object[] GetGlobals() {
		return new Object[] {"btnBackground",main._btnbackground,"btnBgColor",main._btnbgcolor,"btnChangeCity",main._btnchangecity,"btnClockMode",main._btnclockmode,"btnImageTimer",main._btnimagetimer,"btnInfoPanel",main._btninfopanel,"btnLanguage",main._btnlanguage,"btnPrayerToggle",main._btnprayertoggle,"btnSettings",main._btnsettings,"btnTheme",main._btntheme,"cityName",main._cityname,"citySearchDialog",main._citysearchdialog,"colorSchemes",main._colorschemes,"currentBgIndex",main._currentbgindex,"currentClockColor",main._currentclockcolor,"currentImageInterval",main._currentimageinterval,"currentLanguage",main._currentlanguage,"currentThemeIndex",main._currentthemeindex,"cvsAnalogClock",main._cvsanalogclock,"fx",main._fx,"HttpUtils2Service",Debug.moduleToString(b4j.example.httputils2service.class),"imageIntervalNames",main._imageintervalnames,"imageIntervals",main._imageintervals,"imgView",main._imgview,"isAnalogMode",main._isanalogmode,"jo",main._jo,"job",main._job,"jStage",main._jstage,"lastImageChangeTime",main._lastimagechangetime,"latitude",main._latitude,"lblClock",main._lblclock,"lblDate",main._lbldate,"lblPrayerTimes",main._lblprayertimes,"lblTemperature",main._lbltemperature,"lblWeather",main._lblweather,"lblWeatherDetails",main._lblweatherdetails,"lblWeatherIcon",main._lblweathericon,"longitude",main._longitude,"MainForm",main._mainform,"pnlAnalogClock",main._pnlanalogclock,"pnlBackground",main._pnlbackground,"pnlInfoOverlay",main._pnlinfooverlay,"pnlPrayerCards",main._pnlprayercards,"pnlSettings",main._pnlsettings,"prayerLabels",main._prayerlabels,"settingsFile",main._settingsfile,"settingsVisible",main._settingsvisible,"showImage",main._showimage,"showInfoPanel",main._showinfopanel,"showPrayerTimes",main._showprayertimes,"timImageChange",main._timimagechange,"timUpdate",main._timupdate,"translations",main._translations,"weatherData",main._weatherdata,"weatherEmoji",main._weatheremoji,"xui",main._xui};
}
}