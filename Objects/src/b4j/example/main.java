package b4j.example;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;

public class main extends javafx.application.Application{
public static main mostCurrent = new main();

public static BA ba;
static {
		ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.example", "b4j.example.main", null);
		ba.loadHtSubs(main.class);
        if (ba.getClass().getName().endsWith("ShellBA")) {
			anywheresoftware.b4a.shell.ShellBA.delegateBA = new anywheresoftware.b4j.objects.FxBA("b4j.example", null, null);
			ba.raiseEvent2(null, true, "SHELL", false);
			ba.raiseEvent2(null, true, "CREATE", true, "b4j.example.main", ba);
		}
	}
    public static Class<?> getObject() {
		return main.class;
	}

 
    public static void main(String[] args) {
    	launch(args);
    }
    public void start (javafx.stage.Stage stage) {
        try {
            if (!false)
                System.setProperty("prism.lcdtext", "false");
            anywheresoftware.b4j.objects.FxBA.application = this;
		    anywheresoftware.b4a.keywords.Common.setDensity(javafx.stage.Screen.getPrimary().getDpi());
            anywheresoftware.b4a.keywords.Common.LogDebug("Program started.");
            initializeProcessGlobals();
            anywheresoftware.b4j.objects.Form frm = new anywheresoftware.b4j.objects.Form();
            frm.initWithStage(ba, stage, 1280, 800);
            ba.raiseEvent(null, "appstart", frm, (String[])getParameters().getRaw().toArray(new String[0]));
        } catch (Throwable t) {
            BA.printException(t, true);
            System.exit(1);
        }
    }


private static boolean processGlobalsRun;
public static void initializeProcessGlobals() {
    
    if (main.processGlobalsRun == false) {
	    main.processGlobalsRun = true;
		try {
		        		
        } catch (Exception e) {
			throw new RuntimeException(e);
		}
    }
}public static anywheresoftware.b4a.keywords.Common __c = null;
public static anywheresoftware.b4j.objects.JFX _fx = null;
public static anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
public static anywheresoftware.b4j.objects.Form _mainform = null;
public static anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper _pnlbackground = null;
public static anywheresoftware.b4j.objects.LabelWrapper _lblclock = null;
public static anywheresoftware.b4j.objects.LabelWrapper _lbldate = null;
public static anywheresoftware.b4j.objects.LabelWrapper _lblweather = null;
public static anywheresoftware.b4j.objects.LabelWrapper _lbltemperature = null;
public static anywheresoftware.b4j.objects.LabelWrapper _lblweathericon = null;
public static anywheresoftware.b4j.objects.LabelWrapper _lblweatherdetails = null;
public static anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper _pnlanalogclock = null;
public static anywheresoftware.b4a.objects.B4XCanvas _cvsanalogclock = null;
public static boolean _isanalogmode = false;
public static anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper _pnlinfooverlay = null;
public static boolean _showinfopanel = false;
public static anywheresoftware.b4a.objects.Timer _timupdate = null;
public static anywheresoftware.b4a.objects.Timer _timimagechange = null;
public static anywheresoftware.b4j.object.JavaObject _jo = null;
public static anywheresoftware.b4j.object.JavaObject _jstage = null;
public static b4j.example.httpjob _job = null;
public static anywheresoftware.b4j.objects.ImageViewWrapper _imgview = null;
public static boolean _showimage = false;
public static int _currentimageinterval = 0;
public static anywheresoftware.b4a.objects.collections.List _imageintervals = null;
public static anywheresoftware.b4a.objects.collections.List _imageintervalnames = null;
public static long _lastimagechangetime = 0L;
public static anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper _pnlsettings = null;
public static anywheresoftware.b4j.objects.ButtonWrapper _btnsettings = null;
public static anywheresoftware.b4j.objects.ButtonWrapper _btntheme = null;
public static anywheresoftware.b4j.objects.ButtonWrapper _btnimagetimer = null;
public static anywheresoftware.b4j.objects.ButtonWrapper _btnbackground = null;
public static anywheresoftware.b4j.objects.ButtonWrapper _btnbgcolor = null;
public static anywheresoftware.b4j.objects.ButtonWrapper _btnclockmode = null;
public static anywheresoftware.b4j.objects.ButtonWrapper _btnprayertoggle = null;
public static anywheresoftware.b4j.objects.ButtonWrapper _btnlanguage = null;
public static anywheresoftware.b4j.objects.ButtonWrapper _btninfopanel = null;
public static boolean _settingsvisible = false;
public static anywheresoftware.b4a.objects.collections.List _colorschemes = null;
public static int _currentthemeindex = 0;
public static int _currentbgindex = 0;
public static int _currentclockcolor = 0;
public static anywheresoftware.b4a.objects.collections.Map _weatherdata = null;
public static double _latitude = 0;
public static double _longitude = 0;
public static String _cityname = "";
public static String _weatheremoji = "";
public static boolean _showprayertimes = false;
public static anywheresoftware.b4j.objects.LabelWrapper _lblprayertimes = null;
public static anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper _pnlprayercards = null;
public static anywheresoftware.b4a.objects.collections.Map _prayerlabels = null;
public static String _currentlanguage = "";
public static anywheresoftware.b4a.objects.collections.Map _translations = null;
public static String _settingsfile = "";
public static anywheresoftware.b4j.objects.ButtonWrapper _btnchangecity = null;
public static anywheresoftware.b4j.object.JavaObject _citysearchdialog = null;
public static b4j.example.httputils2service _httputils2service = null;
public static String  _appstart(anywheresoftware.b4j.objects.Form _form1,String[] _args) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "appstart", false))
	 {return ((String) Debug.delegate(ba, "appstart", new Object[] {_form1,_args}));}
RDebugUtils.currentLine=131072;
 //BA.debugLineNum = 131072;BA.debugLine="Sub AppStart (Form1 As Form, Args() As String)";
RDebugUtils.currentLine=131073;
 //BA.debugLineNum = 131073;BA.debugLine="Try";
try {RDebugUtils.currentLine=131074;
 //BA.debugLineNum = 131074;BA.debugLine="MainForm = Form1";
_mainform = _form1;
RDebugUtils.currentLine=131076;
 //BA.debugLineNum = 131076;BA.debugLine="colorSchemes.Initialize";
_colorschemes.Initialize();
RDebugUtils.currentLine=131077;
 //BA.debugLineNum = 131077;BA.debugLine="weatherData.Initialize";
_weatherdata.Initialize();
RDebugUtils.currentLine=131078;
 //BA.debugLineNum = 131078;BA.debugLine="translations.Initialize";
_translations.Initialize();
RDebugUtils.currentLine=131079;
 //BA.debugLineNum = 131079;BA.debugLine="prayerLabels.Initialize";
_prayerlabels.Initialize();
RDebugUtils.currentLine=131080;
 //BA.debugLineNum = 131080;BA.debugLine="SetupColorSchemes";
_setupcolorschemes();
RDebugUtils.currentLine=131081;
 //BA.debugLineNum = 131081;BA.debugLine="SetupTranslations";
_setuptranslations();
RDebugUtils.currentLine=131082;
 //BA.debugLineNum = 131082;BA.debugLine="currentClockColor = xui.Color_RGB(0, 255, 255)";
_currentclockcolor = _xui.Color_RGB((int) (0),(int) (255),(int) (255));
RDebugUtils.currentLine=131083;
 //BA.debugLineNum = 131083;BA.debugLine="LoadSettings";
_loadsettings();
RDebugUtils.currentLine=131085;
 //BA.debugLineNum = 131085;BA.debugLine="pnlBackground.Initialize(\"\")";
_pnlbackground.Initialize(ba,"");
RDebugUtils.currentLine=131086;
 //BA.debugLineNum = 131086;BA.debugLine="pnlBackground.Style = \"-fx-background-color: #00";
_pnlbackground.setStyle("-fx-background-color: #000000;");
RDebugUtils.currentLine=131087;
 //BA.debugLineNum = 131087;BA.debugLine="MainForm.RootPane.AddNode(pnlBackground, 0, 0, 1";
_mainform.getRootPane().AddNode((javafx.scene.Node)(_pnlbackground.getObject()),0,0,1280,800);
RDebugUtils.currentLine=131090;
 //BA.debugLineNum = 131090;BA.debugLine="imgView.Initialize(\"\")";
_imgview.Initialize(ba,"");
RDebugUtils.currentLine=131091;
 //BA.debugLineNum = 131091;BA.debugLine="MainForm.RootPane.AddNode(imgView, 0, 0, 1280, 8";
_mainform.getRootPane().AddNode((javafx.scene.Node)(_imgview.getObject()),0,0,1280,800);
RDebugUtils.currentLine=131094;
 //BA.debugLineNum = 131094;BA.debugLine="pnlAnalogClock.Initialize(\"\")";
_pnlanalogclock.Initialize(ba,"");
RDebugUtils.currentLine=131095;
 //BA.debugLineNum = 131095;BA.debugLine="MainForm.RootPane.AddNode(pnlAnalogClock, 440, 2";
_mainform.getRootPane().AddNode((javafx.scene.Node)(_pnlanalogclock.getObject()),440,200,400,400);
RDebugUtils.currentLine=131096;
 //BA.debugLineNum = 131096;BA.debugLine="cvsAnalogClock.Initialize(pnlAnalogClock)";
_cvsanalogclock.Initialize(ba,(anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_pnlanalogclock.getObject())));
RDebugUtils.currentLine=131097;
 //BA.debugLineNum = 131097;BA.debugLine="pnlAnalogClock.Visible = False";
_pnlanalogclock.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=131100;
 //BA.debugLineNum = 131100;BA.debugLine="lblClock.Initialize(\"\")";
_lblclock.Initialize(ba,"");
RDebugUtils.currentLine=131101;
 //BA.debugLineNum = 131101;BA.debugLine="lblClock.Text = \"00:00:00\"";
_lblclock.setText("00:00:00");
RDebugUtils.currentLine=131102;
 //BA.debugLineNum = 131102;BA.debugLine="lblClock.TextColor = fx.Colors.RGB(0, 255, 255)";
_lblclock.setTextColor((javafx.scene.paint.Paint)(_fx.Colors.RGB((int) (0),(int) (255),(int) (255))));
RDebugUtils.currentLine=131103;
 //BA.debugLineNum = 131103;BA.debugLine="lblClock.TextSize = 96";
_lblclock.setTextSize(96);
RDebugUtils.currentLine=131104;
 //BA.debugLineNum = 131104;BA.debugLine="lblClock.Style = \"-fx-font-weight: bold; -fx-eff";
_lblclock.setStyle("-fx-font-weight: bold; -fx-effect: dropshadow(three-pass-box, black, 15, 0, 0, 0);");
RDebugUtils.currentLine=131105;
 //BA.debugLineNum = 131105;BA.debugLine="lblClock.Alignment = \"CENTER\"";
_lblclock.setAlignment("CENTER");
RDebugUtils.currentLine=131106;
 //BA.debugLineNum = 131106;BA.debugLine="MainForm.RootPane.AddNode(lblClock, 0, 280, 1280";
_mainform.getRootPane().AddNode((javafx.scene.Node)(_lblclock.getObject()),0,280,1280,120);
RDebugUtils.currentLine=131110;
 //BA.debugLineNum = 131110;BA.debugLine="pnlInfoOverlay.Initialize(\"\")";
_pnlinfooverlay.Initialize(ba,"");
RDebugUtils.currentLine=131111;
 //BA.debugLineNum = 131111;BA.debugLine="pnlInfoOverlay.Style = \"-fx-background-color: rg";
_pnlinfooverlay.setStyle("-fx-background-color: rgba(0, 0, 0, 0.75); -fx-background-radius: 20px; -fx-border-color: rgba(0, 200, 255, 0.5); -fx-border-width: 2px; -fx-border-radius: 20px; -fx-effect: dropshadow(three-pass-box, black, 20, 0, 0, 0);");
RDebugUtils.currentLine=131112;
 //BA.debugLineNum = 131112;BA.debugLine="MainForm.RootPane.AddNode(pnlInfoOverlay, 50, 48";
_mainform.getRootPane().AddNode((javafx.scene.Node)(_pnlinfooverlay.getObject()),50,480,1180,280);
RDebugUtils.currentLine=131115;
 //BA.debugLineNum = 131115;BA.debugLine="lblDate.Initialize(\"\")";
_lbldate.Initialize(ba,"");
RDebugUtils.currentLine=131116;
 //BA.debugLineNum = 131116;BA.debugLine="lblDate.Text = \"\"";
_lbldate.setText("");
RDebugUtils.currentLine=131117;
 //BA.debugLineNum = 131117;BA.debugLine="lblDate.TextColor = fx.Colors.RGB(200, 200, 200)";
_lbldate.setTextColor((javafx.scene.paint.Paint)(_fx.Colors.RGB((int) (200),(int) (200),(int) (200))));
RDebugUtils.currentLine=131118;
 //BA.debugLineNum = 131118;BA.debugLine="lblDate.TextSize = 20";
_lbldate.setTextSize(20);
RDebugUtils.currentLine=131119;
 //BA.debugLineNum = 131119;BA.debugLine="lblDate.Style = \"-fx-font-weight: normal;\"";
_lbldate.setStyle("-fx-font-weight: normal;");
RDebugUtils.currentLine=131120;
 //BA.debugLineNum = 131120;BA.debugLine="lblDate.Alignment = \"CENTER\"";
_lbldate.setAlignment("CENTER");
RDebugUtils.currentLine=131121;
 //BA.debugLineNum = 131121;BA.debugLine="pnlInfoOverlay.AddNode(lblDate, 10, 10, 1160, 30";
_pnlinfooverlay.AddNode((javafx.scene.Node)(_lbldate.getObject()),10,10,1160,30);
RDebugUtils.currentLine=131128;
 //BA.debugLineNum = 131128;BA.debugLine="lblWeatherIcon.Initialize(\"\")";
_lblweathericon.Initialize(ba,"");
RDebugUtils.currentLine=131129;
 //BA.debugLineNum = 131129;BA.debugLine="lblWeatherIcon.Text = \"🌤️\"";
_lblweathericon.setText("🌤️");
RDebugUtils.currentLine=131130;
 //BA.debugLineNum = 131130;BA.debugLine="lblWeatherIcon.TextSize = 72";
_lblweathericon.setTextSize(72);
RDebugUtils.currentLine=131131;
 //BA.debugLineNum = 131131;BA.debugLine="lblWeatherIcon.Alignment = \"CENTER\"";
_lblweathericon.setAlignment("CENTER");
RDebugUtils.currentLine=131132;
 //BA.debugLineNum = 131132;BA.debugLine="pnlInfoOverlay.AddNode(lblWeatherIcon, 245, 50,";
_pnlinfooverlay.AddNode((javafx.scene.Node)(_lblweathericon.getObject()),245,50,120,100);
RDebugUtils.currentLine=131135;
 //BA.debugLineNum = 131135;BA.debugLine="lblTemperature.Initialize(\"\")";
_lbltemperature.Initialize(ba,"");
RDebugUtils.currentLine=131136;
 //BA.debugLineNum = 131136;BA.debugLine="lblTemperature.Text = \"--°\"";
_lbltemperature.setText("--°");
RDebugUtils.currentLine=131137;
 //BA.debugLineNum = 131137;BA.debugLine="lblTemperature.TextColor = fx.Colors.RGB(255, 20";
_lbltemperature.setTextColor((javafx.scene.paint.Paint)(_fx.Colors.RGB((int) (255),(int) (200),(int) (0))));
RDebugUtils.currentLine=131138;
 //BA.debugLineNum = 131138;BA.debugLine="lblTemperature.TextSize = 64";
_lbltemperature.setTextSize(64);
RDebugUtils.currentLine=131139;
 //BA.debugLineNum = 131139;BA.debugLine="lblTemperature.Style = \"-fx-font-weight: bold;\"";
_lbltemperature.setStyle("-fx-font-weight: bold;");
RDebugUtils.currentLine=131140;
 //BA.debugLineNum = 131140;BA.debugLine="lblTemperature.Alignment = \"CENTER\"";
_lbltemperature.setAlignment("CENTER");
RDebugUtils.currentLine=131141;
 //BA.debugLineNum = 131141;BA.debugLine="pnlInfoOverlay.AddNode(lblTemperature, 365, 50,";
_pnlinfooverlay.AddNode((javafx.scene.Node)(_lbltemperature.getObject()),365,50,150,100);
RDebugUtils.currentLine=131144;
 //BA.debugLineNum = 131144;BA.debugLine="lblWeatherDetails.Initialize(\"\")";
_lblweatherdetails.Initialize(ba,"");
RDebugUtils.currentLine=131145;
 //BA.debugLineNum = 131145;BA.debugLine="lblWeatherDetails.Text = GetTranslation(\"loading";
_lblweatherdetails.setText(_gettranslation("loading_weather"));
RDebugUtils.currentLine=131146;
 //BA.debugLineNum = 131146;BA.debugLine="lblWeatherDetails.TextColor = fx.Colors.RGB(180,";
_lblweatherdetails.setTextColor((javafx.scene.paint.Paint)(_fx.Colors.RGB((int) (180),(int) (180),(int) (180))));
RDebugUtils.currentLine=131147;
 //BA.debugLineNum = 131147;BA.debugLine="lblWeatherDetails.TextSize = 16";
_lblweatherdetails.setTextSize(16);
RDebugUtils.currentLine=131148;
 //BA.debugLineNum = 131148;BA.debugLine="lblWeatherDetails.Style = \"-fx-font-weight: norm";
_lblweatherdetails.setStyle("-fx-font-weight: normal;");
RDebugUtils.currentLine=131149;
 //BA.debugLineNum = 131149;BA.debugLine="lblWeatherDetails.Alignment = \"CENTER_LEFT\"";
_lblweatherdetails.setAlignment("CENTER_LEFT");
RDebugUtils.currentLine=131150;
 //BA.debugLineNum = 131150;BA.debugLine="pnlInfoOverlay.AddNode(lblWeatherDetails, 525, 6";
_pnlinfooverlay.AddNode((javafx.scene.Node)(_lblweatherdetails.getObject()),525,60,400,80);
RDebugUtils.currentLine=131153;
 //BA.debugLineNum = 131153;BA.debugLine="pnlPrayerCards.Initialize(\"\")";
_pnlprayercards.Initialize(ba,"");
RDebugUtils.currentLine=131154;
 //BA.debugLineNum = 131154;BA.debugLine="pnlPrayerCards.Style = \"-fx-background-color: tr";
_pnlprayercards.setStyle("-fx-background-color: transparent;");
RDebugUtils.currentLine=131155;
 //BA.debugLineNum = 131155;BA.debugLine="pnlInfoOverlay.AddNode(pnlPrayerCards, 30, 170,";
_pnlinfooverlay.AddNode((javafx.scene.Node)(_pnlprayercards.getObject()),30,170,1120,80);
RDebugUtils.currentLine=131157;
 //BA.debugLineNum = 131157;BA.debugLine="CreatePrayerTimeCards";
_createprayertimecards();
RDebugUtils.currentLine=131160;
 //BA.debugLineNum = 131160;BA.debugLine="btnSettings.Initialize(\"btnSettings\")";
_btnsettings.Initialize(ba,"btnSettings");
RDebugUtils.currentLine=131161;
 //BA.debugLineNum = 131161;BA.debugLine="btnSettings.Text = \"⚙️\"";
_btnsettings.setText("⚙️");
RDebugUtils.currentLine=131162;
 //BA.debugLineNum = 131162;BA.debugLine="btnSettings.Style = \"-fx-font-size: 28px; -fx-ba";
_btnsettings.setStyle("-fx-font-size: 28px; -fx-background-color: rgba(0,0,0,0.7); -fx-text-fill: cyan; -fx-background-radius: 25px;");
RDebugUtils.currentLine=131163;
 //BA.debugLineNum = 131163;BA.debugLine="MainForm.RootPane.AddNode(btnSettings, 1200, 20,";
_mainform.getRootPane().AddNode((javafx.scene.Node)(_btnsettings.getObject()),1200,20,60,60);
RDebugUtils.currentLine=131166;
 //BA.debugLineNum = 131166;BA.debugLine="pnlSettings.Initialize(\"\")";
_pnlsettings.Initialize(ba,"");
RDebugUtils.currentLine=131167;
 //BA.debugLineNum = 131167;BA.debugLine="pnlSettings.Style = \"-fx-background-color: rgba(";
_pnlsettings.setStyle("-fx-background-color: rgba(0,0,0,0.9); -fx-border-color: cyan; -fx-border-width: 2px; -fx-border-radius: 10px;");
RDebugUtils.currentLine=131168;
 //BA.debugLineNum = 131168;BA.debugLine="MainForm.RootPane.AddNode(pnlSettings, 40, 20, 1";
_mainform.getRootPane().AddNode((javafx.scene.Node)(_pnlsettings.getObject()),40,20,1200,80);
RDebugUtils.currentLine=131169;
 //BA.debugLineNum = 131169;BA.debugLine="pnlSettings.Visible = False";
_pnlsettings.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=131172;
 //BA.debugLineNum = 131172;BA.debugLine="btnClockMode.Initialize(\"btnClockMode\")";
_btnclockmode.Initialize(ba,"btnClockMode");
RDebugUtils.currentLine=131173;
 //BA.debugLineNum = 131173;BA.debugLine="btnClockMode.Text = \"🔢 Digital\"";
_btnclockmode.setText("🔢 Digital");
RDebugUtils.currentLine=131174;
 //BA.debugLineNum = 131174;BA.debugLine="btnClockMode.Style = \"-fx-font-size: 14px; -fx-b";
_btnclockmode.setStyle("-fx-font-size: 14px; -fx-background-color: #333; -fx-text-fill: white; -fx-background-radius: 5px;");
RDebugUtils.currentLine=131175;
 //BA.debugLineNum = 131175;BA.debugLine="pnlSettings.AddNode(btnClockMode, 10, 20, 120, 4";
_pnlsettings.AddNode((javafx.scene.Node)(_btnclockmode.getObject()),10,20,120,40);
RDebugUtils.currentLine=131177;
 //BA.debugLineNum = 131177;BA.debugLine="btnTheme.Initialize(\"btnTheme\")";
_btntheme.Initialize(ba,"btnTheme");
RDebugUtils.currentLine=131178;
 //BA.debugLineNum = 131178;BA.debugLine="btnTheme.Text = \"🎨 Cyan\"";
_btntheme.setText("🎨 Cyan");
RDebugUtils.currentLine=131179;
 //BA.debugLineNum = 131179;BA.debugLine="btnTheme.Style = \"-fx-font-size: 14px; -fx-backg";
_btntheme.setStyle("-fx-font-size: 14px; -fx-background-color: #333; -fx-text-fill: white; -fx-background-radius: 5px;");
RDebugUtils.currentLine=131180;
 //BA.debugLineNum = 131180;BA.debugLine="pnlSettings.AddNode(btnTheme, 140, 20, 120, 40)";
_pnlsettings.AddNode((javafx.scene.Node)(_btntheme.getObject()),140,20,120,40);
RDebugUtils.currentLine=131182;
 //BA.debugLineNum = 131182;BA.debugLine="btnImageTimer.Initialize(\"btnImageTimer\")";
_btnimagetimer.Initialize(ba,"btnImageTimer");
RDebugUtils.currentLine=131183;
 //BA.debugLineNum = 131183;BA.debugLine="btnImageTimer.Text = \"⏱️ OFF\"";
_btnimagetimer.setText("⏱️ OFF");
RDebugUtils.currentLine=131184;
 //BA.debugLineNum = 131184;BA.debugLine="btnImageTimer.Style = \"-fx-font-size: 14px; -fx-";
_btnimagetimer.setStyle("-fx-font-size: 14px; -fx-background-color: #333; -fx-text-fill: white; -fx-background-radius: 5px;");
RDebugUtils.currentLine=131185;
 //BA.debugLineNum = 131185;BA.debugLine="pnlSettings.AddNode(btnImageTimer, 270, 20, 120,";
_pnlsettings.AddNode((javafx.scene.Node)(_btnimagetimer.getObject()),270,20,120,40);
RDebugUtils.currentLine=131187;
 //BA.debugLineNum = 131187;BA.debugLine="btnBackground.Initialize(\"btnBackground\")";
_btnbackground.Initialize(ba,"btnBackground");
RDebugUtils.currentLine=131188;
 //BA.debugLineNum = 131188;BA.debugLine="btnBackground.Text = \"🖼️ Image ON\"";
_btnbackground.setText("🖼️ Image ON");
RDebugUtils.currentLine=131189;
 //BA.debugLineNum = 131189;BA.debugLine="btnBackground.Style = \"-fx-font-size: 14px; -fx-";
_btnbackground.setStyle("-fx-font-size: 14px; -fx-background-color: #333; -fx-text-fill: white; -fx-background-radius: 5px;");
RDebugUtils.currentLine=131190;
 //BA.debugLineNum = 131190;BA.debugLine="pnlSettings.AddNode(btnBackground, 400, 20, 140,";
_pnlsettings.AddNode((javafx.scene.Node)(_btnbackground.getObject()),400,20,140,40);
RDebugUtils.currentLine=131192;
 //BA.debugLineNum = 131192;BA.debugLine="btnBgColor.Initialize(\"btnBgColor\")";
_btnbgcolor.Initialize(ba,"btnBgColor");
RDebugUtils.currentLine=131193;
 //BA.debugLineNum = 131193;BA.debugLine="btnBgColor.Text = \"🎨 BG Color\"";
_btnbgcolor.setText("🎨 BG Color");
RDebugUtils.currentLine=131194;
 //BA.debugLineNum = 131194;BA.debugLine="btnBgColor.Style = \"-fx-font-size: 14px; -fx-bac";
_btnbgcolor.setStyle("-fx-font-size: 14px; -fx-background-color: #333; -fx-text-fill: white; -fx-background-radius: 5px;");
RDebugUtils.currentLine=131195;
 //BA.debugLineNum = 131195;BA.debugLine="pnlSettings.AddNode(btnBgColor, 550, 20, 140, 40";
_pnlsettings.AddNode((javafx.scene.Node)(_btnbgcolor.getObject()),550,20,140,40);
RDebugUtils.currentLine=131196;
 //BA.debugLineNum = 131196;BA.debugLine="btnBgColor.Enabled = False";
_btnbgcolor.setEnabled(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=131198;
 //BA.debugLineNum = 131198;BA.debugLine="btnPrayerToggle.Initialize(\"btnPrayerToggle\")";
_btnprayertoggle.Initialize(ba,"btnPrayerToggle");
RDebugUtils.currentLine=131199;
 //BA.debugLineNum = 131199;BA.debugLine="btnPrayerToggle.Text = \"🕌 Prayer ON\"";
_btnprayertoggle.setText("🕌 Prayer ON");
RDebugUtils.currentLine=131200;
 //BA.debugLineNum = 131200;BA.debugLine="btnPrayerToggle.Style = \"-fx-font-size: 14px; -f";
_btnprayertoggle.setStyle("-fx-font-size: 14px; -fx-background-color: #333; -fx-text-fill: white; -fx-background-radius: 5px;");
RDebugUtils.currentLine=131201;
 //BA.debugLineNum = 131201;BA.debugLine="pnlSettings.AddNode(btnPrayerToggle, 700, 20, 14";
_pnlsettings.AddNode((javafx.scene.Node)(_btnprayertoggle.getObject()),700,20,140,40);
RDebugUtils.currentLine=131203;
 //BA.debugLineNum = 131203;BA.debugLine="btnLanguage.Initialize(\"btnLanguage\")";
_btnlanguage.Initialize(ba,"btnLanguage");
RDebugUtils.currentLine=131204;
 //BA.debugLineNum = 131204;BA.debugLine="btnLanguage.Text = \"🌐 EN\"";
_btnlanguage.setText("🌐 EN");
RDebugUtils.currentLine=131205;
 //BA.debugLineNum = 131205;BA.debugLine="btnLanguage.Style = \"-fx-font-size: 14px; -fx-ba";
_btnlanguage.setStyle("-fx-font-size: 14px; -fx-background-color: #333; -fx-text-fill: white; -fx-background-radius: 5px;");
RDebugUtils.currentLine=131206;
 //BA.debugLineNum = 131206;BA.debugLine="pnlSettings.AddNode(btnLanguage, 850, 20, 100, 4";
_pnlsettings.AddNode((javafx.scene.Node)(_btnlanguage.getObject()),850,20,100,40);
RDebugUtils.currentLine=131208;
 //BA.debugLineNum = 131208;BA.debugLine="btnInfoPanel.Initialize(\"btnInfoPanel\")";
_btninfopanel.Initialize(ba,"btnInfoPanel");
RDebugUtils.currentLine=131209;
 //BA.debugLineNum = 131209;BA.debugLine="btnInfoPanel.Text = \"📋 Info\"";
_btninfopanel.setText("📋 Info");
RDebugUtils.currentLine=131210;
 //BA.debugLineNum = 131210;BA.debugLine="btnInfoPanel.Style = \"-fx-font-size: 14px; -fx-b";
_btninfopanel.setStyle("-fx-font-size: 14px; -fx-background-color: #333; -fx-text-fill: white; -fx-background-radius: 5px;");
RDebugUtils.currentLine=131211;
 //BA.debugLineNum = 131211;BA.debugLine="pnlSettings.AddNode(btnInfoPanel, 960, 20, 100,";
_pnlsettings.AddNode((javafx.scene.Node)(_btninfopanel.getObject()),960,20,100,40);
RDebugUtils.currentLine=131214;
 //BA.debugLineNum = 131214;BA.debugLine="btnChangeCity.Initialize(\"btnChangeCity\")";
_btnchangecity.Initialize(ba,"btnChangeCity");
RDebugUtils.currentLine=131215;
 //BA.debugLineNum = 131215;BA.debugLine="btnChangeCity.Text = \"🌍 City\"";
_btnchangecity.setText("🌍 City");
RDebugUtils.currentLine=131216;
 //BA.debugLineNum = 131216;BA.debugLine="btnChangeCity.Style = \"-fx-font-size: 14px; -fx-";
_btnchangecity.setStyle("-fx-font-size: 14px; -fx-background-color: #333; -fx-text-fill: white; -fx-background-radius: 5px;");
RDebugUtils.currentLine=131217;
 //BA.debugLineNum = 131217;BA.debugLine="pnlSettings.AddNode(btnChangeCity, 1070, 20, 100";
_pnlsettings.AddNode((javafx.scene.Node)(_btnchangecity.getObject()),1070,20,100,40);
RDebugUtils.currentLine=131220;
 //BA.debugLineNum = 131220;BA.debugLine="MainForm.SetFormStyle(\"UNDECORATED\")";
_mainform.SetFormStyle("UNDECORATED");
RDebugUtils.currentLine=131221;
 //BA.debugLineNum = 131221;BA.debugLine="jo = MainForm";
_jo = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_mainform));
RDebugUtils.currentLine=131222;
 //BA.debugLineNum = 131222;BA.debugLine="jStage = jo.GetFieldJO(\"stage\")";
_jstage = _jo.GetFieldJO("stage");
RDebugUtils.currentLine=131223;
 //BA.debugLineNum = 131223;BA.debugLine="jStage.RunMethod(\"setFullScreen\", Array(True))";
_jstage.RunMethod("setFullScreen",new Object[]{(Object)(anywheresoftware.b4a.keywords.Common.True)});
RDebugUtils.currentLine=131224;
 //BA.debugLineNum = 131224;BA.debugLine="jStage.RunMethod(\"setAlwaysOnTop\", Array(True))";
_jstage.RunMethod("setAlwaysOnTop",new Object[]{(Object)(anywheresoftware.b4a.keywords.Common.True)});
RDebugUtils.currentLine=131225;
 //BA.debugLineNum = 131225;BA.debugLine="MainForm.Resizable = False";
_mainform.setResizable(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=131226;
 //BA.debugLineNum = 131226;BA.debugLine="MainForm.Show";
_mainform.Show();
RDebugUtils.currentLine=131229;
 //BA.debugLineNum = 131229;BA.debugLine="CenterAllElements";
_centerallelements();
RDebugUtils.currentLine=131232;
 //BA.debugLineNum = 131232;BA.debugLine="LoadBackgroundImage";
_loadbackgroundimage();
RDebugUtils.currentLine=131233;
 //BA.debugLineNum = 131233;BA.debugLine="lastImageChangeTime = DateTime.Now / 1000";
_lastimagechangetime = (long) (anywheresoftware.b4a.keywords.Common.DateTime.getNow()/(double)1000);
RDebugUtils.currentLine=131235;
 //BA.debugLineNum = 131235;BA.debugLine="timUpdate.Initialize(\"timUpdate\", 1000)";
_timupdate.Initialize(ba,"timUpdate",(long) (1000));
RDebugUtils.currentLine=131236;
 //BA.debugLineNum = 131236;BA.debugLine="timUpdate.Enabled = True";
_timupdate.setEnabled(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=131238;
 //BA.debugLineNum = 131238;BA.debugLine="timImageChange.Initialize(\"timImageChange\", 1000";
_timimagechange.Initialize(ba,"timImageChange",(long) (1000));
RDebugUtils.currentLine=131239;
 //BA.debugLineNum = 131239;BA.debugLine="timImageChange.Enabled = False";
_timimagechange.setEnabled(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=131241;
 //BA.debugLineNum = 131241;BA.debugLine="FetchWeather";
_fetchweather();
RDebugUtils.currentLine=131242;
 //BA.debugLineNum = 131242;BA.debugLine="FetchPrayerTimes";
_fetchprayertimes();
RDebugUtils.currentLine=131243;
 //BA.debugLineNum = 131243;BA.debugLine="UpdateClock";
_updateclock();
RDebugUtils.currentLine=131245;
 //BA.debugLineNum = 131245;BA.debugLine="Log(\"Modern clock UI started with proper z-order";
anywheresoftware.b4a.keywords.Common.LogImpl("2131245","Modern clock UI started with proper z-ordering",0);
 } 
       catch (Exception e124) {
			ba.setLastException(e124);RDebugUtils.currentLine=131247;
 //BA.debugLineNum = 131247;BA.debugLine="Log(\"AppStart error: \" & LastException.Message)";
anywheresoftware.b4a.keywords.Common.LogImpl("2131247","AppStart error: "+anywheresoftware.b4a.keywords.Common.LastException(ba).getMessage(),0);
 };
RDebugUtils.currentLine=131249;
 //BA.debugLineNum = 131249;BA.debugLine="End Sub";
return "";
}
public static String  _setupcolorschemes() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "setupcolorschemes", false))
	 {return ((String) Debug.delegate(ba, "setupcolorschemes", null));}
RDebugUtils.currentLine=327680;
 //BA.debugLineNum = 327680;BA.debugLine="Sub SetupColorSchemes";
RDebugUtils.currentLine=327681;
 //BA.debugLineNum = 327681;BA.debugLine="colorSchemes.Add(CreateMap(\"name\": \"Cyan\", \"paint";
_colorschemes.Add((Object)(anywheresoftware.b4a.keywords.Common.createMap(new Object[] {(Object)("name"),(Object)("Cyan"),(Object)("paint"),(Object)(_fx.Colors.RGB((int) (0),(int) (255),(int) (255))),(Object)("int"),(Object)(_xui.Color_RGB((int) (0),(int) (255),(int) (255)))}).getObject()));
RDebugUtils.currentLine=327682;
 //BA.debugLineNum = 327682;BA.debugLine="colorSchemes.Add(CreateMap(\"name\": \"White\", \"pain";
_colorschemes.Add((Object)(anywheresoftware.b4a.keywords.Common.createMap(new Object[] {(Object)("name"),(Object)("White"),(Object)("paint"),(Object)(_fx.Colors.RGB((int) (255),(int) (255),(int) (255))),(Object)("int"),(Object)(_xui.Color_RGB((int) (255),(int) (255),(int) (255)))}).getObject()));
RDebugUtils.currentLine=327683;
 //BA.debugLineNum = 327683;BA.debugLine="colorSchemes.Add(CreateMap(\"name\": \"Yellow\", \"pai";
_colorschemes.Add((Object)(anywheresoftware.b4a.keywords.Common.createMap(new Object[] {(Object)("name"),(Object)("Yellow"),(Object)("paint"),(Object)(_fx.Colors.RGB((int) (255),(int) (255),(int) (0))),(Object)("int"),(Object)(_xui.Color_RGB((int) (255),(int) (255),(int) (0)))}).getObject()));
RDebugUtils.currentLine=327684;
 //BA.debugLineNum = 327684;BA.debugLine="colorSchemes.Add(CreateMap(\"name\": \"Orange\", \"pai";
_colorschemes.Add((Object)(anywheresoftware.b4a.keywords.Common.createMap(new Object[] {(Object)("name"),(Object)("Orange"),(Object)("paint"),(Object)(_fx.Colors.RGB((int) (255),(int) (165),(int) (0))),(Object)("int"),(Object)(_xui.Color_RGB((int) (255),(int) (165),(int) (0)))}).getObject()));
RDebugUtils.currentLine=327685;
 //BA.debugLineNum = 327685;BA.debugLine="colorSchemes.Add(CreateMap(\"name\": \"Magenta\", \"pa";
_colorschemes.Add((Object)(anywheresoftware.b4a.keywords.Common.createMap(new Object[] {(Object)("name"),(Object)("Magenta"),(Object)("paint"),(Object)(_fx.Colors.RGB((int) (255),(int) (0),(int) (255))),(Object)("int"),(Object)(_xui.Color_RGB((int) (255),(int) (0),(int) (255)))}).getObject()));
RDebugUtils.currentLine=327686;
 //BA.debugLineNum = 327686;BA.debugLine="colorSchemes.Add(CreateMap(\"name\": \"Lime\", \"paint";
_colorschemes.Add((Object)(anywheresoftware.b4a.keywords.Common.createMap(new Object[] {(Object)("name"),(Object)("Lime"),(Object)("paint"),(Object)(_fx.Colors.RGB((int) (0),(int) (255),(int) (0))),(Object)("int"),(Object)(_xui.Color_RGB((int) (0),(int) (255),(int) (0)))}).getObject()));
RDebugUtils.currentLine=327687;
 //BA.debugLineNum = 327687;BA.debugLine="colorSchemes.Add(CreateMap(\"name\": \"Pink\", \"paint";
_colorschemes.Add((Object)(anywheresoftware.b4a.keywords.Common.createMap(new Object[] {(Object)("name"),(Object)("Pink"),(Object)("paint"),(Object)(_fx.Colors.RGB((int) (255),(int) (192),(int) (203))),(Object)("int"),(Object)(_xui.Color_RGB((int) (255),(int) (192),(int) (203)))}).getObject()));
RDebugUtils.currentLine=327688;
 //BA.debugLineNum = 327688;BA.debugLine="colorSchemes.Add(CreateMap(\"name\": \"Red\", \"paint\"";
_colorschemes.Add((Object)(anywheresoftware.b4a.keywords.Common.createMap(new Object[] {(Object)("name"),(Object)("Red"),(Object)("paint"),(Object)(_fx.Colors.RGB((int) (255),(int) (0),(int) (0))),(Object)("int"),(Object)(_xui.Color_RGB((int) (255),(int) (0),(int) (0)))}).getObject()));
RDebugUtils.currentLine=327689;
 //BA.debugLineNum = 327689;BA.debugLine="colorSchemes.Add(CreateMap(\"name\": \"Green\", \"pain";
_colorschemes.Add((Object)(anywheresoftware.b4a.keywords.Common.createMap(new Object[] {(Object)("name"),(Object)("Green"),(Object)("paint"),(Object)(_fx.Colors.RGB((int) (0),(int) (128),(int) (0))),(Object)("int"),(Object)(_xui.Color_RGB((int) (0),(int) (128),(int) (0)))}).getObject()));
RDebugUtils.currentLine=327690;
 //BA.debugLineNum = 327690;BA.debugLine="colorSchemes.Add(CreateMap(\"name\": \"Random\", \"pai";
_colorschemes.Add((Object)(anywheresoftware.b4a.keywords.Common.createMap(new Object[] {(Object)("name"),(Object)("Random"),(Object)("paint"),anywheresoftware.b4a.keywords.Common.Null,(Object)("int"),(Object)(0)}).getObject()));
RDebugUtils.currentLine=327691;
 //BA.debugLineNum = 327691;BA.debugLine="End Sub";
return "";
}
public static String  _setuptranslations() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "setuptranslations", false))
	 {return ((String) Debug.delegate(ba, "setuptranslations", null));}
anywheresoftware.b4a.objects.collections.Map _enmap = null;
anywheresoftware.b4a.objects.collections.Map _frmap = null;
anywheresoftware.b4a.objects.collections.Map _armap = null;
RDebugUtils.currentLine=5505024;
 //BA.debugLineNum = 5505024;BA.debugLine="Sub SetupTranslations";
RDebugUtils.currentLine=5505025;
 //BA.debugLineNum = 5505025;BA.debugLine="Try";
try {RDebugUtils.currentLine=5505027;
 //BA.debugLineNum = 5505027;BA.debugLine="Dim enMap As Map";
_enmap = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=5505028;
 //BA.debugLineNum = 5505028;BA.debugLine="enMap.Initialize";
_enmap.Initialize();
RDebugUtils.currentLine=5505029;
 //BA.debugLineNum = 5505029;BA.debugLine="enMap.Put(\"loading_weather\", \"Loading weather...";
_enmap.Put((Object)("loading_weather"),(Object)("Loading weather..."));
RDebugUtils.currentLine=5505030;
 //BA.debugLineNum = 5505030;BA.debugLine="enMap.Put(\"loading_prayer\", \"Loading prayer time";
_enmap.Put((Object)("loading_prayer"),(Object)("Loading prayer times..."));
RDebugUtils.currentLine=5505031;
 //BA.debugLineNum = 5505031;BA.debugLine="enMap.Put(\"sunday\", \"Sunday\")";
_enmap.Put((Object)("sunday"),(Object)("Sunday"));
RDebugUtils.currentLine=5505032;
 //BA.debugLineNum = 5505032;BA.debugLine="enMap.Put(\"monday\", \"Monday\")";
_enmap.Put((Object)("monday"),(Object)("Monday"));
RDebugUtils.currentLine=5505033;
 //BA.debugLineNum = 5505033;BA.debugLine="enMap.Put(\"tuesday\", \"Tuesday\")";
_enmap.Put((Object)("tuesday"),(Object)("Tuesday"));
RDebugUtils.currentLine=5505034;
 //BA.debugLineNum = 5505034;BA.debugLine="enMap.Put(\"wednesday\", \"Wednesday\")";
_enmap.Put((Object)("wednesday"),(Object)("Wednesday"));
RDebugUtils.currentLine=5505035;
 //BA.debugLineNum = 5505035;BA.debugLine="enMap.Put(\"thursday\", \"Thursday\")";
_enmap.Put((Object)("thursday"),(Object)("Thursday"));
RDebugUtils.currentLine=5505036;
 //BA.debugLineNum = 5505036;BA.debugLine="enMap.Put(\"friday\", \"Friday\")";
_enmap.Put((Object)("friday"),(Object)("Friday"));
RDebugUtils.currentLine=5505037;
 //BA.debugLineNum = 5505037;BA.debugLine="enMap.Put(\"saturday\", \"Saturday\")";
_enmap.Put((Object)("saturday"),(Object)("Saturday"));
RDebugUtils.currentLine=5505038;
 //BA.debugLineNum = 5505038;BA.debugLine="enMap.Put(\"january\", \"January\")";
_enmap.Put((Object)("january"),(Object)("January"));
RDebugUtils.currentLine=5505039;
 //BA.debugLineNum = 5505039;BA.debugLine="enMap.Put(\"february\", \"February\")";
_enmap.Put((Object)("february"),(Object)("February"));
RDebugUtils.currentLine=5505040;
 //BA.debugLineNum = 5505040;BA.debugLine="enMap.Put(\"march\", \"March\")";
_enmap.Put((Object)("march"),(Object)("March"));
RDebugUtils.currentLine=5505041;
 //BA.debugLineNum = 5505041;BA.debugLine="enMap.Put(\"april\", \"April\")";
_enmap.Put((Object)("april"),(Object)("April"));
RDebugUtils.currentLine=5505042;
 //BA.debugLineNum = 5505042;BA.debugLine="enMap.Put(\"may\", \"May\")";
_enmap.Put((Object)("may"),(Object)("May"));
RDebugUtils.currentLine=5505043;
 //BA.debugLineNum = 5505043;BA.debugLine="enMap.Put(\"june\", \"June\")";
_enmap.Put((Object)("june"),(Object)("June"));
RDebugUtils.currentLine=5505044;
 //BA.debugLineNum = 5505044;BA.debugLine="enMap.Put(\"july\", \"July\")";
_enmap.Put((Object)("july"),(Object)("July"));
RDebugUtils.currentLine=5505045;
 //BA.debugLineNum = 5505045;BA.debugLine="enMap.Put(\"august\", \"August\")";
_enmap.Put((Object)("august"),(Object)("August"));
RDebugUtils.currentLine=5505046;
 //BA.debugLineNum = 5505046;BA.debugLine="enMap.Put(\"september\", \"September\")";
_enmap.Put((Object)("september"),(Object)("September"));
RDebugUtils.currentLine=5505047;
 //BA.debugLineNum = 5505047;BA.debugLine="enMap.Put(\"october\", \"October\")";
_enmap.Put((Object)("october"),(Object)("October"));
RDebugUtils.currentLine=5505048;
 //BA.debugLineNum = 5505048;BA.debugLine="enMap.Put(\"november\", \"November\")";
_enmap.Put((Object)("november"),(Object)("November"));
RDebugUtils.currentLine=5505049;
 //BA.debugLineNum = 5505049;BA.debugLine="enMap.Put(\"december\", \"December\")";
_enmap.Put((Object)("december"),(Object)("December"));
RDebugUtils.currentLine=5505050;
 //BA.debugLineNum = 5505050;BA.debugLine="enMap.Put(\"fajr\", \"Fajr\")";
_enmap.Put((Object)("fajr"),(Object)("Fajr"));
RDebugUtils.currentLine=5505051;
 //BA.debugLineNum = 5505051;BA.debugLine="enMap.Put(\"sunrise\", \"Sunrise\")";
_enmap.Put((Object)("sunrise"),(Object)("Sunrise"));
RDebugUtils.currentLine=5505052;
 //BA.debugLineNum = 5505052;BA.debugLine="enMap.Put(\"dhuhr\", \"Dhuhr\")";
_enmap.Put((Object)("dhuhr"),(Object)("Dhuhr"));
RDebugUtils.currentLine=5505053;
 //BA.debugLineNum = 5505053;BA.debugLine="enMap.Put(\"asr\", \"Asr\")";
_enmap.Put((Object)("asr"),(Object)("Asr"));
RDebugUtils.currentLine=5505054;
 //BA.debugLineNum = 5505054;BA.debugLine="enMap.Put(\"maghrib\", \"Maghrib\")";
_enmap.Put((Object)("maghrib"),(Object)("Maghrib"));
RDebugUtils.currentLine=5505055;
 //BA.debugLineNum = 5505055;BA.debugLine="enMap.Put(\"isha\", \"Isha\")";
_enmap.Put((Object)("isha"),(Object)("Isha"));
RDebugUtils.currentLine=5505056;
 //BA.debugLineNum = 5505056;BA.debugLine="translations.Put(\"en\", enMap)";
_translations.Put((Object)("en"),(Object)(_enmap.getObject()));
RDebugUtils.currentLine=5505059;
 //BA.debugLineNum = 5505059;BA.debugLine="Dim frMap As Map";
_frmap = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=5505060;
 //BA.debugLineNum = 5505060;BA.debugLine="frMap.Initialize";
_frmap.Initialize();
RDebugUtils.currentLine=5505061;
 //BA.debugLineNum = 5505061;BA.debugLine="frMap.Put(\"loading_weather\", \"Chargement météo..";
_frmap.Put((Object)("loading_weather"),(Object)("Chargement météo..."));
RDebugUtils.currentLine=5505062;
 //BA.debugLineNum = 5505062;BA.debugLine="frMap.Put(\"loading_prayer\", \"Chargement horaires";
_frmap.Put((Object)("loading_prayer"),(Object)("Chargement horaires..."));
RDebugUtils.currentLine=5505063;
 //BA.debugLineNum = 5505063;BA.debugLine="frMap.Put(\"sunday\", \"Dimanche\")";
_frmap.Put((Object)("sunday"),(Object)("Dimanche"));
RDebugUtils.currentLine=5505064;
 //BA.debugLineNum = 5505064;BA.debugLine="frMap.Put(\"monday\", \"Lundi\")";
_frmap.Put((Object)("monday"),(Object)("Lundi"));
RDebugUtils.currentLine=5505065;
 //BA.debugLineNum = 5505065;BA.debugLine="frMap.Put(\"tuesday\", \"Mardi\")";
_frmap.Put((Object)("tuesday"),(Object)("Mardi"));
RDebugUtils.currentLine=5505066;
 //BA.debugLineNum = 5505066;BA.debugLine="frMap.Put(\"wednesday\", \"Mercredi\")";
_frmap.Put((Object)("wednesday"),(Object)("Mercredi"));
RDebugUtils.currentLine=5505067;
 //BA.debugLineNum = 5505067;BA.debugLine="frMap.Put(\"thursday\", \"Jeudi\")";
_frmap.Put((Object)("thursday"),(Object)("Jeudi"));
RDebugUtils.currentLine=5505068;
 //BA.debugLineNum = 5505068;BA.debugLine="frMap.Put(\"friday\", \"Vendredi\")";
_frmap.Put((Object)("friday"),(Object)("Vendredi"));
RDebugUtils.currentLine=5505069;
 //BA.debugLineNum = 5505069;BA.debugLine="frMap.Put(\"saturday\", \"Samedi\")";
_frmap.Put((Object)("saturday"),(Object)("Samedi"));
RDebugUtils.currentLine=5505070;
 //BA.debugLineNum = 5505070;BA.debugLine="frMap.Put(\"january\", \"Janvier\")";
_frmap.Put((Object)("january"),(Object)("Janvier"));
RDebugUtils.currentLine=5505071;
 //BA.debugLineNum = 5505071;BA.debugLine="frMap.Put(\"february\", \"Février\")";
_frmap.Put((Object)("february"),(Object)("Février"));
RDebugUtils.currentLine=5505072;
 //BA.debugLineNum = 5505072;BA.debugLine="frMap.Put(\"march\", \"Mars\")";
_frmap.Put((Object)("march"),(Object)("Mars"));
RDebugUtils.currentLine=5505073;
 //BA.debugLineNum = 5505073;BA.debugLine="frMap.Put(\"april\", \"Avril\")";
_frmap.Put((Object)("april"),(Object)("Avril"));
RDebugUtils.currentLine=5505074;
 //BA.debugLineNum = 5505074;BA.debugLine="frMap.Put(\"may\", \"Mai\")";
_frmap.Put((Object)("may"),(Object)("Mai"));
RDebugUtils.currentLine=5505075;
 //BA.debugLineNum = 5505075;BA.debugLine="frMap.Put(\"june\", \"Juin\")";
_frmap.Put((Object)("june"),(Object)("Juin"));
RDebugUtils.currentLine=5505076;
 //BA.debugLineNum = 5505076;BA.debugLine="frMap.Put(\"july\", \"Juillet\")";
_frmap.Put((Object)("july"),(Object)("Juillet"));
RDebugUtils.currentLine=5505077;
 //BA.debugLineNum = 5505077;BA.debugLine="frMap.Put(\"august\", \"Août\")";
_frmap.Put((Object)("august"),(Object)("Août"));
RDebugUtils.currentLine=5505078;
 //BA.debugLineNum = 5505078;BA.debugLine="frMap.Put(\"september\", \"Septembre\")";
_frmap.Put((Object)("september"),(Object)("Septembre"));
RDebugUtils.currentLine=5505079;
 //BA.debugLineNum = 5505079;BA.debugLine="frMap.Put(\"october\", \"Octobre\")";
_frmap.Put((Object)("october"),(Object)("Octobre"));
RDebugUtils.currentLine=5505080;
 //BA.debugLineNum = 5505080;BA.debugLine="frMap.Put(\"november\", \"Novembre\")";
_frmap.Put((Object)("november"),(Object)("Novembre"));
RDebugUtils.currentLine=5505081;
 //BA.debugLineNum = 5505081;BA.debugLine="frMap.Put(\"december\", \"Décembre\")";
_frmap.Put((Object)("december"),(Object)("Décembre"));
RDebugUtils.currentLine=5505082;
 //BA.debugLineNum = 5505082;BA.debugLine="frMap.Put(\"fajr\", \"Fajr\")";
_frmap.Put((Object)("fajr"),(Object)("Fajr"));
RDebugUtils.currentLine=5505083;
 //BA.debugLineNum = 5505083;BA.debugLine="frMap.Put(\"sunrise\", \"Lever\")";
_frmap.Put((Object)("sunrise"),(Object)("Lever"));
RDebugUtils.currentLine=5505084;
 //BA.debugLineNum = 5505084;BA.debugLine="frMap.Put(\"dhuhr\", \"Dhuhr\")";
_frmap.Put((Object)("dhuhr"),(Object)("Dhuhr"));
RDebugUtils.currentLine=5505085;
 //BA.debugLineNum = 5505085;BA.debugLine="frMap.Put(\"asr\", \"Asr\")";
_frmap.Put((Object)("asr"),(Object)("Asr"));
RDebugUtils.currentLine=5505086;
 //BA.debugLineNum = 5505086;BA.debugLine="frMap.Put(\"maghrib\", \"Maghrib\")";
_frmap.Put((Object)("maghrib"),(Object)("Maghrib"));
RDebugUtils.currentLine=5505087;
 //BA.debugLineNum = 5505087;BA.debugLine="frMap.Put(\"isha\", \"Isha\")";
_frmap.Put((Object)("isha"),(Object)("Isha"));
RDebugUtils.currentLine=5505088;
 //BA.debugLineNum = 5505088;BA.debugLine="translations.Put(\"fr\", frMap)";
_translations.Put((Object)("fr"),(Object)(_frmap.getObject()));
RDebugUtils.currentLine=5505091;
 //BA.debugLineNum = 5505091;BA.debugLine="Dim arMap As Map";
_armap = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=5505092;
 //BA.debugLineNum = 5505092;BA.debugLine="arMap.Initialize";
_armap.Initialize();
RDebugUtils.currentLine=5505093;
 //BA.debugLineNum = 5505093;BA.debugLine="arMap.Put(\"loading_weather\", \"تحميل الطقس...\")";
_armap.Put((Object)("loading_weather"),(Object)("تحميل الطقس..."));
RDebugUtils.currentLine=5505094;
 //BA.debugLineNum = 5505094;BA.debugLine="arMap.Put(\"loading_prayer\", \"تحميل الصلاة...\")";
_armap.Put((Object)("loading_prayer"),(Object)("تحميل الصلاة..."));
RDebugUtils.currentLine=5505095;
 //BA.debugLineNum = 5505095;BA.debugLine="arMap.Put(\"sunday\", \"الأحد\")";
_armap.Put((Object)("sunday"),(Object)("الأحد"));
RDebugUtils.currentLine=5505096;
 //BA.debugLineNum = 5505096;BA.debugLine="arMap.Put(\"monday\", \"الاثنين\")";
_armap.Put((Object)("monday"),(Object)("الاثنين"));
RDebugUtils.currentLine=5505097;
 //BA.debugLineNum = 5505097;BA.debugLine="arMap.Put(\"tuesday\", \"الثلاثاء\")";
_armap.Put((Object)("tuesday"),(Object)("الثلاثاء"));
RDebugUtils.currentLine=5505098;
 //BA.debugLineNum = 5505098;BA.debugLine="arMap.Put(\"wednesday\", \"الأربعاء\")";
_armap.Put((Object)("wednesday"),(Object)("الأربعاء"));
RDebugUtils.currentLine=5505099;
 //BA.debugLineNum = 5505099;BA.debugLine="arMap.Put(\"thursday\", \"الخميس\")";
_armap.Put((Object)("thursday"),(Object)("الخميس"));
RDebugUtils.currentLine=5505100;
 //BA.debugLineNum = 5505100;BA.debugLine="arMap.Put(\"friday\", \"الجمعة\")";
_armap.Put((Object)("friday"),(Object)("الجمعة"));
RDebugUtils.currentLine=5505101;
 //BA.debugLineNum = 5505101;BA.debugLine="arMap.Put(\"saturday\", \"السبت\")";
_armap.Put((Object)("saturday"),(Object)("السبت"));
RDebugUtils.currentLine=5505102;
 //BA.debugLineNum = 5505102;BA.debugLine="arMap.Put(\"january\", \"يناير\")";
_armap.Put((Object)("january"),(Object)("يناير"));
RDebugUtils.currentLine=5505103;
 //BA.debugLineNum = 5505103;BA.debugLine="arMap.Put(\"february\", \"فبراير\")";
_armap.Put((Object)("february"),(Object)("فبراير"));
RDebugUtils.currentLine=5505104;
 //BA.debugLineNum = 5505104;BA.debugLine="arMap.Put(\"march\", \"مارس\")";
_armap.Put((Object)("march"),(Object)("مارس"));
RDebugUtils.currentLine=5505105;
 //BA.debugLineNum = 5505105;BA.debugLine="arMap.Put(\"april\", \"أبريل\")";
_armap.Put((Object)("april"),(Object)("أبريل"));
RDebugUtils.currentLine=5505106;
 //BA.debugLineNum = 5505106;BA.debugLine="arMap.Put(\"may\", \"مايو\")";
_armap.Put((Object)("may"),(Object)("مايو"));
RDebugUtils.currentLine=5505107;
 //BA.debugLineNum = 5505107;BA.debugLine="arMap.Put(\"june\", \"يونيو\")";
_armap.Put((Object)("june"),(Object)("يونيو"));
RDebugUtils.currentLine=5505108;
 //BA.debugLineNum = 5505108;BA.debugLine="arMap.Put(\"july\", \"يوليو\")";
_armap.Put((Object)("july"),(Object)("يوليو"));
RDebugUtils.currentLine=5505109;
 //BA.debugLineNum = 5505109;BA.debugLine="arMap.Put(\"august\", \"أغسطس\")";
_armap.Put((Object)("august"),(Object)("أغسطس"));
RDebugUtils.currentLine=5505110;
 //BA.debugLineNum = 5505110;BA.debugLine="arMap.Put(\"september\", \"سبتمبر\")";
_armap.Put((Object)("september"),(Object)("سبتمبر"));
RDebugUtils.currentLine=5505111;
 //BA.debugLineNum = 5505111;BA.debugLine="arMap.Put(\"october\", \"أكتوبر\")";
_armap.Put((Object)("october"),(Object)("أكتوبر"));
RDebugUtils.currentLine=5505112;
 //BA.debugLineNum = 5505112;BA.debugLine="arMap.Put(\"november\", \"نوفمبر\")";
_armap.Put((Object)("november"),(Object)("نوفمبر"));
RDebugUtils.currentLine=5505113;
 //BA.debugLineNum = 5505113;BA.debugLine="arMap.Put(\"december\", \"ديسمبر\")";
_armap.Put((Object)("december"),(Object)("ديسمبر"));
RDebugUtils.currentLine=5505114;
 //BA.debugLineNum = 5505114;BA.debugLine="arMap.Put(\"fajr\", \"الفجر\")";
_armap.Put((Object)("fajr"),(Object)("الفجر"));
RDebugUtils.currentLine=5505115;
 //BA.debugLineNum = 5505115;BA.debugLine="arMap.Put(\"sunrise\", \"الشروق\")";
_armap.Put((Object)("sunrise"),(Object)("الشروق"));
RDebugUtils.currentLine=5505116;
 //BA.debugLineNum = 5505116;BA.debugLine="arMap.Put(\"dhuhr\", \"الظهر\")";
_armap.Put((Object)("dhuhr"),(Object)("الظهر"));
RDebugUtils.currentLine=5505117;
 //BA.debugLineNum = 5505117;BA.debugLine="arMap.Put(\"asr\", \"العصر\")";
_armap.Put((Object)("asr"),(Object)("العصر"));
RDebugUtils.currentLine=5505118;
 //BA.debugLineNum = 5505118;BA.debugLine="arMap.Put(\"maghrib\", \"المغرب\")";
_armap.Put((Object)("maghrib"),(Object)("المغرب"));
RDebugUtils.currentLine=5505119;
 //BA.debugLineNum = 5505119;BA.debugLine="arMap.Put(\"isha\", \"العشاء\")";
_armap.Put((Object)("isha"),(Object)("العشاء"));
RDebugUtils.currentLine=5505120;
 //BA.debugLineNum = 5505120;BA.debugLine="translations.Put(\"ar\", arMap)";
_translations.Put((Object)("ar"),(Object)(_armap.getObject()));
 } 
       catch (Exception e93) {
			ba.setLastException(e93);RDebugUtils.currentLine=5505122;
 //BA.debugLineNum = 5505122;BA.debugLine="Log(\"Translation setup error: \" & LastException.";
anywheresoftware.b4a.keywords.Common.LogImpl("25505122","Translation setup error: "+anywheresoftware.b4a.keywords.Common.LastException(ba).getMessage(),0);
 };
RDebugUtils.currentLine=5505124;
 //BA.debugLineNum = 5505124;BA.debugLine="End Sub";
return "";
}
public static String  _loadsettings() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "loadsettings", false))
	 {return ((String) Debug.delegate(ba, "loadsettings", null));}
anywheresoftware.b4a.objects.collections.List _settings = null;
RDebugUtils.currentLine=7929856;
 //BA.debugLineNum = 7929856;BA.debugLine="Sub LoadSettings";
RDebugUtils.currentLine=7929857;
 //BA.debugLineNum = 7929857;BA.debugLine="Try";
try {RDebugUtils.currentLine=7929858;
 //BA.debugLineNum = 7929858;BA.debugLine="If File.Exists(File.DirApp, settingsFile) Then";
if (anywheresoftware.b4a.keywords.Common.File.Exists(anywheresoftware.b4a.keywords.Common.File.getDirApp(),_settingsfile)) { 
RDebugUtils.currentLine=7929859;
 //BA.debugLineNum = 7929859;BA.debugLine="Dim settings As List = File.ReadList(File.DirAp";
_settings = new anywheresoftware.b4a.objects.collections.List();
_settings = anywheresoftware.b4a.keywords.Common.File.ReadList(anywheresoftware.b4a.keywords.Common.File.getDirApp(),_settingsfile);
RDebugUtils.currentLine=7929860;
 //BA.debugLineNum = 7929860;BA.debugLine="If settings.Size >= 3 Then";
if (_settings.getSize()>=3) { 
RDebugUtils.currentLine=7929861;
 //BA.debugLineNum = 7929861;BA.debugLine="cityName = settings.Get(0)";
_cityname = BA.ObjectToString(_settings.Get((int) (0)));
RDebugUtils.currentLine=7929862;
 //BA.debugLineNum = 7929862;BA.debugLine="latitude = settings.Get(1)";
_latitude = (double)(BA.ObjectToNumber(_settings.Get((int) (1))));
RDebugUtils.currentLine=7929863;
 //BA.debugLineNum = 7929863;BA.debugLine="longitude = settings.Get(2)";
_longitude = (double)(BA.ObjectToNumber(_settings.Get((int) (2))));
RDebugUtils.currentLine=7929864;
 //BA.debugLineNum = 7929864;BA.debugLine="Log(\"Settings loaded: \" & cityName & \" (\" & la";
anywheresoftware.b4a.keywords.Common.LogImpl("27929864","Settings loaded: "+_cityname+" ("+BA.NumberToString(_latitude)+", "+BA.NumberToString(_longitude)+")",0);
 }else {
RDebugUtils.currentLine=7929866;
 //BA.debugLineNum = 7929866;BA.debugLine="Log(\"Invalid settings file, using defaults\")";
anywheresoftware.b4a.keywords.Common.LogImpl("27929866","Invalid settings file, using defaults",0);
 };
 }else {
RDebugUtils.currentLine=7929869;
 //BA.debugLineNum = 7929869;BA.debugLine="Log(\"No settings file found, using default loca";
anywheresoftware.b4a.keywords.Common.LogImpl("27929869","No settings file found, using default location: "+_cityname,0);
 };
 } 
       catch (Exception e16) {
			ba.setLastException(e16);RDebugUtils.currentLine=7929872;
 //BA.debugLineNum = 7929872;BA.debugLine="Log(\"LoadSettings error: \" & LastException.Messa";
anywheresoftware.b4a.keywords.Common.LogImpl("27929872","LoadSettings error: "+anywheresoftware.b4a.keywords.Common.LastException(ba).getMessage(),0);
 };
RDebugUtils.currentLine=7929875;
 //BA.debugLineNum = 7929875;BA.debugLine="End Sub";
return "";
}
public static String  _gettranslation(String _key) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "gettranslation", false))
	 {return ((String) Debug.delegate(ba, "gettranslation", new Object[] {_key}));}
anywheresoftware.b4a.objects.collections.Map _langmap = null;
RDebugUtils.currentLine=5570560;
 //BA.debugLineNum = 5570560;BA.debugLine="Sub GetTranslation(key As String) As String";
RDebugUtils.currentLine=5570561;
 //BA.debugLineNum = 5570561;BA.debugLine="Try";
try {RDebugUtils.currentLine=5570562;
 //BA.debugLineNum = 5570562;BA.debugLine="Dim langMap As Map = translations.Get(currentLan";
_langmap = new anywheresoftware.b4a.objects.collections.Map();
_langmap = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_translations.Get((Object)(_currentlanguage))));
RDebugUtils.currentLine=5570563;
 //BA.debugLineNum = 5570563;BA.debugLine="Return langMap.GetDefault(key, key)";
if (true) return BA.ObjectToString(_langmap.GetDefault((Object)(_key),(Object)(_key)));
 } 
       catch (Exception e5) {
			ba.setLastException(e5);RDebugUtils.currentLine=5570565;
 //BA.debugLineNum = 5570565;BA.debugLine="Return key";
if (true) return _key;
 };
RDebugUtils.currentLine=5570567;
 //BA.debugLineNum = 5570567;BA.debugLine="End Sub";
return "";
}
public static String  _createprayertimecards() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "createprayertimecards", false))
	 {return ((String) Debug.delegate(ba, "createprayertimecards", null));}
anywheresoftware.b4a.objects.collections.List _prayernames = null;
anywheresoftware.b4a.objects.collections.List _prayericons = null;
int _cardwidth = 0;
int _spacing = 0;
int _i = 0;
anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper _pnlcard = null;
anywheresoftware.b4j.objects.LabelWrapper _lblicon = null;
anywheresoftware.b4j.objects.LabelWrapper _lblname = null;
anywheresoftware.b4j.objects.LabelWrapper _lbltime = null;
RDebugUtils.currentLine=7667712;
 //BA.debugLineNum = 7667712;BA.debugLine="Sub CreatePrayerTimeCards";
RDebugUtils.currentLine=7667713;
 //BA.debugLineNum = 7667713;BA.debugLine="Try";
try {RDebugUtils.currentLine=7667714;
 //BA.debugLineNum = 7667714;BA.debugLine="Dim prayerNames As List = Array As String(\"fajr\"";
_prayernames = new anywheresoftware.b4a.objects.collections.List();
_prayernames = anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{"fajr","sunrise","dhuhr","asr","maghrib","isha"});
RDebugUtils.currentLine=7667715;
 //BA.debugLineNum = 7667715;BA.debugLine="Dim prayerIcons As List = Array As String(\"🌅\",";
_prayericons = new anywheresoftware.b4a.objects.collections.List();
_prayericons = anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{"🌅","☀️","🌞","🌤️","🌆","🌙"});
RDebugUtils.currentLine=7667716;
 //BA.debugLineNum = 7667716;BA.debugLine="Dim cardWidth As Int = 170";
_cardwidth = (int) (170);
RDebugUtils.currentLine=7667717;
 //BA.debugLineNum = 7667717;BA.debugLine="Dim spacing As Int = 15";
_spacing = (int) (15);
RDebugUtils.currentLine=7667719;
 //BA.debugLineNum = 7667719;BA.debugLine="For i = 0 To 5";
{
final int step6 = 1;
final int limit6 = (int) (5);
_i = (int) (0) ;
for (;_i <= limit6 ;_i = _i + step6 ) {
RDebugUtils.currentLine=7667720;
 //BA.debugLineNum = 7667720;BA.debugLine="Dim pnlCard As Pane";
_pnlcard = new anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper();
RDebugUtils.currentLine=7667721;
 //BA.debugLineNum = 7667721;BA.debugLine="pnlCard.Initialize(\"\")";
_pnlcard.Initialize(ba,"");
RDebugUtils.currentLine=7667722;
 //BA.debugLineNum = 7667722;BA.debugLine="pnlCard.Style = \"-fx-background-color: rgba(40,";
_pnlcard.setStyle("-fx-background-color: rgba(40, 40, 60, 0.8); -fx-background-radius: 10px; -fx-border-color: rgba(0, 200, 255, 0.4); -fx-border-width: 1px; -fx-border-radius: 10px;");
RDebugUtils.currentLine=7667723;
 //BA.debugLineNum = 7667723;BA.debugLine="pnlPrayerCards.AddNode(pnlCard, i * (cardWidth";
_pnlprayercards.AddNode((javafx.scene.Node)(_pnlcard.getObject()),_i*(_cardwidth+_spacing),0,_cardwidth,70);
RDebugUtils.currentLine=7667726;
 //BA.debugLineNum = 7667726;BA.debugLine="Dim lblIcon As Label";
_lblicon = new anywheresoftware.b4j.objects.LabelWrapper();
RDebugUtils.currentLine=7667727;
 //BA.debugLineNum = 7667727;BA.debugLine="lblIcon.Initialize(\"\")";
_lblicon.Initialize(ba,"");
RDebugUtils.currentLine=7667728;
 //BA.debugLineNum = 7667728;BA.debugLine="lblIcon.Text = prayerIcons.Get(i)";
_lblicon.setText(BA.ObjectToString(_prayericons.Get(_i)));
RDebugUtils.currentLine=7667729;
 //BA.debugLineNum = 7667729;BA.debugLine="lblIcon.TextSize = 24";
_lblicon.setTextSize(24);
RDebugUtils.currentLine=7667730;
 //BA.debugLineNum = 7667730;BA.debugLine="lblIcon.Alignment = \"CENTER\"";
_lblicon.setAlignment("CENTER");
RDebugUtils.currentLine=7667731;
 //BA.debugLineNum = 7667731;BA.debugLine="pnlCard.AddNode(lblIcon, 5, 5, 40, 30)";
_pnlcard.AddNode((javafx.scene.Node)(_lblicon.getObject()),5,5,40,30);
RDebugUtils.currentLine=7667734;
 //BA.debugLineNum = 7667734;BA.debugLine="Dim lblName As Label";
_lblname = new anywheresoftware.b4j.objects.LabelWrapper();
RDebugUtils.currentLine=7667735;
 //BA.debugLineNum = 7667735;BA.debugLine="lblName.Initialize(\"\")";
_lblname.Initialize(ba,"");
RDebugUtils.currentLine=7667736;
 //BA.debugLineNum = 7667736;BA.debugLine="lblName.Text = GetTranslation(prayerNames.Get(i";
_lblname.setText(_gettranslation(BA.ObjectToString(_prayernames.Get(_i))));
RDebugUtils.currentLine=7667737;
 //BA.debugLineNum = 7667737;BA.debugLine="lblName.TextColor = fx.Colors.RGB(200, 200, 200";
_lblname.setTextColor((javafx.scene.paint.Paint)(_fx.Colors.RGB((int) (200),(int) (200),(int) (200))));
RDebugUtils.currentLine=7667738;
 //BA.debugLineNum = 7667738;BA.debugLine="lblName.TextSize = 12";
_lblname.setTextSize(12);
RDebugUtils.currentLine=7667739;
 //BA.debugLineNum = 7667739;BA.debugLine="lblName.Style = \"-fx-font-weight: normal;\"";
_lblname.setStyle("-fx-font-weight: normal;");
RDebugUtils.currentLine=7667740;
 //BA.debugLineNum = 7667740;BA.debugLine="lblName.Alignment = \"CENTER_LEFT\"";
_lblname.setAlignment("CENTER_LEFT");
RDebugUtils.currentLine=7667741;
 //BA.debugLineNum = 7667741;BA.debugLine="pnlCard.AddNode(lblName, 50, 5, 110, 25)";
_pnlcard.AddNode((javafx.scene.Node)(_lblname.getObject()),50,5,110,25);
RDebugUtils.currentLine=7667744;
 //BA.debugLineNum = 7667744;BA.debugLine="Dim lblTime As Label";
_lbltime = new anywheresoftware.b4j.objects.LabelWrapper();
RDebugUtils.currentLine=7667745;
 //BA.debugLineNum = 7667745;BA.debugLine="lblTime.Initialize(\"\")";
_lbltime.Initialize(ba,"");
RDebugUtils.currentLine=7667746;
 //BA.debugLineNum = 7667746;BA.debugLine="lblTime.Text = \"--:--\"";
_lbltime.setText("--:--");
RDebugUtils.currentLine=7667747;
 //BA.debugLineNum = 7667747;BA.debugLine="lblTime.TextColor = fx.Colors.RGB(150, 255, 150";
_lbltime.setTextColor((javafx.scene.paint.Paint)(_fx.Colors.RGB((int) (150),(int) (255),(int) (150))));
RDebugUtils.currentLine=7667748;
 //BA.debugLineNum = 7667748;BA.debugLine="lblTime.TextSize = 18";
_lbltime.setTextSize(18);
RDebugUtils.currentLine=7667749;
 //BA.debugLineNum = 7667749;BA.debugLine="lblTime.Style = \"-fx-font-weight: bold;\"";
_lbltime.setStyle("-fx-font-weight: bold;");
RDebugUtils.currentLine=7667750;
 //BA.debugLineNum = 7667750;BA.debugLine="lblTime.Alignment = \"CENTER\"";
_lbltime.setAlignment("CENTER");
RDebugUtils.currentLine=7667751;
 //BA.debugLineNum = 7667751;BA.debugLine="pnlCard.AddNode(lblTime, 5, 40, 160, 25)";
_pnlcard.AddNode((javafx.scene.Node)(_lbltime.getObject()),5,40,160,25);
RDebugUtils.currentLine=7667754;
 //BA.debugLineNum = 7667754;BA.debugLine="prayerLabels.Put(prayerNames.Get(i), lblTime)";
_prayerlabels.Put(_prayernames.Get(_i),(Object)(_lbltime.getObject()));
 }
};
 } 
       catch (Exception e36) {
			ba.setLastException(e36);RDebugUtils.currentLine=7667757;
 //BA.debugLineNum = 7667757;BA.debugLine="Log(\"CreatePrayerTimeCards error: \" & LastExcept";
anywheresoftware.b4a.keywords.Common.LogImpl("27667757","CreatePrayerTimeCards error: "+anywheresoftware.b4a.keywords.Common.LastException(ba).getMessage(),0);
 };
RDebugUtils.currentLine=7667759;
 //BA.debugLineNum = 7667759;BA.debugLine="End Sub";
return "";
}
public static String  _centerallelements() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "centerallelements", false))
	 {return ((String) Debug.delegate(ba, "centerallelements", null));}
double _w = 0;
double _h = 0;
double _clockwidth = 0;
double _clockheight = 0;
double _analogsize = 0;
double _overlaywidth = 0;
double _overlayheight = 0;
double _weathertotalwidth = 0;
double _weatherstartx = 0;
double _prayertotalwidth = 0;
double _prayercardswidth = 0;
double _settingswidth = 0;
RDebugUtils.currentLine=196608;
 //BA.debugLineNum = 196608;BA.debugLine="Sub CenterAllElements";
RDebugUtils.currentLine=196609;
 //BA.debugLineNum = 196609;BA.debugLine="Try";
try {RDebugUtils.currentLine=196610;
 //BA.debugLineNum = 196610;BA.debugLine="Dim w As Double = MainForm.Width";
_w = _mainform.getWidth();
RDebugUtils.currentLine=196611;
 //BA.debugLineNum = 196611;BA.debugLine="Dim h As Double = MainForm.Height";
_h = _mainform.getHeight();
RDebugUtils.currentLine=196613;
 //BA.debugLineNum = 196613;BA.debugLine="Log(\"Screen resolution: \" & w & \"x\" & h)";
anywheresoftware.b4a.keywords.Common.LogImpl("2196613","Screen resolution: "+BA.NumberToString(_w)+"x"+BA.NumberToString(_h),0);
RDebugUtils.currentLine=196616;
 //BA.debugLineNum = 196616;BA.debugLine="ClearAllClocks";
_clearallclocks();
RDebugUtils.currentLine=196619;
 //BA.debugLineNum = 196619;BA.debugLine="pnlBackground.prefWidth = w";
_pnlbackground.setPrefWidth(_w);
RDebugUtils.currentLine=196620;
 //BA.debugLineNum = 196620;BA.debugLine="pnlBackground.prefHeight = h";
_pnlbackground.setPrefHeight(_h);
RDebugUtils.currentLine=196621;
 //BA.debugLineNum = 196621;BA.debugLine="pnlBackground.Left = 0";
_pnlbackground.setLeft(0);
RDebugUtils.currentLine=196622;
 //BA.debugLineNum = 196622;BA.debugLine="pnlBackground.Top = 0";
_pnlbackground.setTop(0);
RDebugUtils.currentLine=196624;
 //BA.debugLineNum = 196624;BA.debugLine="If imgView <> Null Then";
if (_imgview!= null) { 
RDebugUtils.currentLine=196625;
 //BA.debugLineNum = 196625;BA.debugLine="imgView.prefWidth = w";
_imgview.setPrefWidth(_w);
RDebugUtils.currentLine=196626;
 //BA.debugLineNum = 196626;BA.debugLine="imgView.prefHeight = h";
_imgview.setPrefHeight(_h);
RDebugUtils.currentLine=196627;
 //BA.debugLineNum = 196627;BA.debugLine="imgView.Left = 0";
_imgview.setLeft(0);
RDebugUtils.currentLine=196628;
 //BA.debugLineNum = 196628;BA.debugLine="imgView.Top = 0";
_imgview.setTop(0);
 };
RDebugUtils.currentLine=196632;
 //BA.debugLineNum = 196632;BA.debugLine="Dim clockWidth As Double = w * 0.8";
_clockwidth = _w*0.8;
RDebugUtils.currentLine=196633;
 //BA.debugLineNum = 196633;BA.debugLine="If clockWidth > 1000 Then clockWidth = 1000";
if (_clockwidth>1000) { 
_clockwidth = 1000;};
RDebugUtils.currentLine=196634;
 //BA.debugLineNum = 196634;BA.debugLine="Dim clockHeight As Double = 120";
_clockheight = 120;
RDebugUtils.currentLine=196637;
 //BA.debugLineNum = 196637;BA.debugLine="If Not(showInfoPanel) Then";
if (anywheresoftware.b4a.keywords.Common.Not(_showinfopanel)) { 
RDebugUtils.currentLine=196638;
 //BA.debugLineNum = 196638;BA.debugLine="lblClock.TextSize = 128 ' Larger font";
_lblclock.setTextSize(128);
RDebugUtils.currentLine=196639;
 //BA.debugLineNum = 196639;BA.debugLine="clockHeight = 150";
_clockheight = 150;
RDebugUtils.currentLine=196640;
 //BA.debugLineNum = 196640;BA.debugLine="lblClock.Left = (w - clockWidth) / 2";
_lblclock.setLeft((_w-_clockwidth)/(double)2);
RDebugUtils.currentLine=196641;
 //BA.debugLineNum = 196641;BA.debugLine="lblClock.Top = (h - clockHeight) / 2 ' Perfect";
_lblclock.setTop((_h-_clockheight)/(double)2);
 }else {
RDebugUtils.currentLine=196643;
 //BA.debugLineNum = 196643;BA.debugLine="lblClock.TextSize = 96 ' Normal font";
_lblclock.setTextSize(96);
RDebugUtils.currentLine=196644;
 //BA.debugLineNum = 196644;BA.debugLine="clockHeight = 120";
_clockheight = 120;
RDebugUtils.currentLine=196645;
 //BA.debugLineNum = 196645;BA.debugLine="lblClock.Left = (w - clockWidth) / 2";
_lblclock.setLeft((_w-_clockwidth)/(double)2);
RDebugUtils.currentLine=196646;
 //BA.debugLineNum = 196646;BA.debugLine="lblClock.Top = (h * 0.25) ' 25% from top";
_lblclock.setTop((_h*0.25));
 };
RDebugUtils.currentLine=196649;
 //BA.debugLineNum = 196649;BA.debugLine="lblClock.prefWidth = clockWidth";
_lblclock.setPrefWidth(_clockwidth);
RDebugUtils.currentLine=196650;
 //BA.debugLineNum = 196650;BA.debugLine="lblClock.prefHeight = clockHeight";
_lblclock.setPrefHeight(_clockheight);
RDebugUtils.currentLine=196653;
 //BA.debugLineNum = 196653;BA.debugLine="Dim analogSize As Double";
_analogsize = 0;
RDebugUtils.currentLine=196656;
 //BA.debugLineNum = 196656;BA.debugLine="If Not(showInfoPanel) Then";
if (anywheresoftware.b4a.keywords.Common.Not(_showinfopanel)) { 
RDebugUtils.currentLine=196657;
 //BA.debugLineNum = 196657;BA.debugLine="analogSize = Min(w, h) * 0.5 ' 50% of screen (L";
_analogsize = anywheresoftware.b4a.keywords.Common.Min(_w,_h)*0.5;
RDebugUtils.currentLine=196658;
 //BA.debugLineNum = 196658;BA.debugLine="If analogSize > 700 Then analogSize = 700 ' Max";
if (_analogsize>700) { 
_analogsize = 700;};
RDebugUtils.currentLine=196659;
 //BA.debugLineNum = 196659;BA.debugLine="If analogSize < 400 Then analogSize = 400 ' Min";
if (_analogsize<400) { 
_analogsize = 400;};
RDebugUtils.currentLine=196661;
 //BA.debugLineNum = 196661;BA.debugLine="pnlAnalogClock.Left = (w - analogSize) / 2";
_pnlanalogclock.setLeft((_w-_analogsize)/(double)2);
RDebugUtils.currentLine=196662;
 //BA.debugLineNum = 196662;BA.debugLine="pnlAnalogClock.Top = (h - analogSize) / 2 ' Per";
_pnlanalogclock.setTop((_h-_analogsize)/(double)2);
 }else {
RDebugUtils.currentLine=196664;
 //BA.debugLineNum = 196664;BA.debugLine="analogSize = Min(w, h) * 0.25 ' 25% of screen (";
_analogsize = anywheresoftware.b4a.keywords.Common.Min(_w,_h)*0.25;
RDebugUtils.currentLine=196665;
 //BA.debugLineNum = 196665;BA.debugLine="If analogSize < 250 Then analogSize = 250 ' Min";
if (_analogsize<250) { 
_analogsize = 250;};
RDebugUtils.currentLine=196666;
 //BA.debugLineNum = 196666;BA.debugLine="If analogSize > 450 Then analogSize = 450 ' Max";
if (_analogsize>450) { 
_analogsize = 450;};
RDebugUtils.currentLine=196668;
 //BA.debugLineNum = 196668;BA.debugLine="pnlAnalogClock.Left = (w - analogSize) / 2";
_pnlanalogclock.setLeft((_w-_analogsize)/(double)2);
RDebugUtils.currentLine=196669;
 //BA.debugLineNum = 196669;BA.debugLine="pnlAnalogClock.Top = (h * 0.15) ' 15% from top";
_pnlanalogclock.setTop((_h*0.15));
 };
RDebugUtils.currentLine=196672;
 //BA.debugLineNum = 196672;BA.debugLine="pnlAnalogClock.prefWidth = analogSize";
_pnlanalogclock.setPrefWidth(_analogsize);
RDebugUtils.currentLine=196673;
 //BA.debugLineNum = 196673;BA.debugLine="pnlAnalogClock.prefHeight = analogSize";
_pnlanalogclock.setPrefHeight(_analogsize);
RDebugUtils.currentLine=196676;
 //BA.debugLineNum = 196676;BA.debugLine="Try";
try {RDebugUtils.currentLine=196677;
 //BA.debugLineNum = 196677;BA.debugLine="cvsAnalogClock.Release";
_cvsanalogclock.Release();
 } 
       catch (Exception e51) {
			ba.setLastException(e51); };
RDebugUtils.currentLine=196681;
 //BA.debugLineNum = 196681;BA.debugLine="cvsAnalogClock.Initialize(pnlAnalogClock)";
_cvsanalogclock.Initialize(ba,(anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_pnlanalogclock.getObject())));
RDebugUtils.currentLine=196684;
 //BA.debugLineNum = 196684;BA.debugLine="If showInfoPanel Then";
if (_showinfopanel) { 
RDebugUtils.currentLine=196685;
 //BA.debugLineNum = 196685;BA.debugLine="Dim overlayWidth As Double = Min(1180, w - 100)";
_overlaywidth = anywheresoftware.b4a.keywords.Common.Min(1180,_w-100);
RDebugUtils.currentLine=196686;
 //BA.debugLineNum = 196686;BA.debugLine="Dim overlayHeight As Double = 280";
_overlayheight = 280;
RDebugUtils.currentLine=196688;
 //BA.debugLineNum = 196688;BA.debugLine="pnlInfoOverlay.prefWidth = overlayWidth";
_pnlinfooverlay.setPrefWidth(_overlaywidth);
RDebugUtils.currentLine=196689;
 //BA.debugLineNum = 196689;BA.debugLine="pnlInfoOverlay.prefHeight = overlayHeight";
_pnlinfooverlay.setPrefHeight(_overlayheight);
RDebugUtils.currentLine=196690;
 //BA.debugLineNum = 196690;BA.debugLine="pnlInfoOverlay.Left = (w - overlayWidth) / 2";
_pnlinfooverlay.setLeft((_w-_overlaywidth)/(double)2);
RDebugUtils.currentLine=196691;
 //BA.debugLineNum = 196691;BA.debugLine="pnlInfoOverlay.Top = (h * 0.6)";
_pnlinfooverlay.setTop((_h*0.6));
RDebugUtils.currentLine=196694;
 //BA.debugLineNum = 196694;BA.debugLine="If pnlInfoOverlay.Top + overlayHeight > h - 20";
if (_pnlinfooverlay.getTop()+_overlayheight>_h-20) { 
RDebugUtils.currentLine=196695;
 //BA.debugLineNum = 196695;BA.debugLine="pnlInfoOverlay.Top = h - overlayHeight - 20";
_pnlinfooverlay.setTop(_h-_overlayheight-20);
 };
RDebugUtils.currentLine=196699;
 //BA.debugLineNum = 196699;BA.debugLine="Dim weatherTotalWidth As Double = 670";
_weathertotalwidth = 670;
RDebugUtils.currentLine=196700;
 //BA.debugLineNum = 196700;BA.debugLine="Dim weatherStartX As Double = (overlayWidth - w";
_weatherstartx = (_overlaywidth-_weathertotalwidth)/(double)2;
RDebugUtils.currentLine=196702;
 //BA.debugLineNum = 196702;BA.debugLine="lblWeatherIcon.Left = weatherStartX";
_lblweathericon.setLeft(_weatherstartx);
RDebugUtils.currentLine=196703;
 //BA.debugLineNum = 196703;BA.debugLine="lblTemperature.Left = weatherStartX + 120";
_lbltemperature.setLeft(_weatherstartx+120);
RDebugUtils.currentLine=196704;
 //BA.debugLineNum = 196704;BA.debugLine="lblWeatherDetails.Left = weatherStartX + 270";
_lblweatherdetails.setLeft(_weatherstartx+270);
RDebugUtils.currentLine=196707;
 //BA.debugLineNum = 196707;BA.debugLine="Dim prayerTotalWidth As Double = 1095";
_prayertotalwidth = 1095;
RDebugUtils.currentLine=196708;
 //BA.debugLineNum = 196708;BA.debugLine="Dim prayerCardsWidth As Double = Min(prayerTota";
_prayercardswidth = anywheresoftware.b4a.keywords.Common.Min(_prayertotalwidth,_overlaywidth-60);
RDebugUtils.currentLine=196710;
 //BA.debugLineNum = 196710;BA.debugLine="pnlPrayerCards.prefWidth = prayerCardsWidth";
_pnlprayercards.setPrefWidth(_prayercardswidth);
RDebugUtils.currentLine=196711;
 //BA.debugLineNum = 196711;BA.debugLine="pnlPrayerCards.Left = (overlayWidth - prayerCar";
_pnlprayercards.setLeft((_overlaywidth-_prayercardswidth)/(double)2);
RDebugUtils.currentLine=196714;
 //BA.debugLineNum = 196714;BA.debugLine="If prayerCardsWidth < 1095 Then";
if (_prayercardswidth<1095) { 
RDebugUtils.currentLine=196715;
 //BA.debugLineNum = 196715;BA.debugLine="RecreateScaledPrayerCards(prayerCardsWidth)";
_recreatescaledprayercards(_prayercardswidth);
 };
 };
RDebugUtils.currentLine=196720;
 //BA.debugLineNum = 196720;BA.debugLine="btnSettings.Left = w - 80";
_btnsettings.setLeft(_w-80);
RDebugUtils.currentLine=196721;
 //BA.debugLineNum = 196721;BA.debugLine="btnSettings.Top = 20";
_btnsettings.setTop(20);
RDebugUtils.currentLine=196724;
 //BA.debugLineNum = 196724;BA.debugLine="Dim settingsWidth As Double = Min(1200, w - 130)";
_settingswidth = anywheresoftware.b4a.keywords.Common.Min(1200,_w-130);
RDebugUtils.currentLine=196725;
 //BA.debugLineNum = 196725;BA.debugLine="pnlSettings.prefWidth = settingsWidth";
_pnlsettings.setPrefWidth(_settingswidth);
RDebugUtils.currentLine=196726;
 //BA.debugLineNum = 196726;BA.debugLine="pnlSettings.Left = (w - settingsWidth) / 2";
_pnlsettings.setLeft((_w-_settingswidth)/(double)2);
RDebugUtils.currentLine=196730;
 //BA.debugLineNum = 196730;BA.debugLine="Log(\"Centered - InfoPanel: \" & showInfoPanel & \"";
anywheresoftware.b4a.keywords.Common.LogImpl("2196730","Centered - InfoPanel: "+BA.ObjectToString(_showinfopanel)+", Analog size: "+BA.NumberToString(_analogsize)+"px",0);
 } 
       catch (Exception e83) {
			ba.setLastException(e83);RDebugUtils.currentLine=196732;
 //BA.debugLineNum = 196732;BA.debugLine="Log(\"CenterAllElements error: \" & LastException.";
anywheresoftware.b4a.keywords.Common.LogImpl("2196732","CenterAllElements error: "+anywheresoftware.b4a.keywords.Common.LastException(ba).getMessage(),0);
 };
RDebugUtils.currentLine=196734;
 //BA.debugLineNum = 196734;BA.debugLine="End Sub";
return "";
}
public static void  _loadbackgroundimage() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "loadbackgroundimage", false))
	 {Debug.delegate(ba, "loadbackgroundimage", null); return;}
ResumableSub_LoadBackgroundImage rsub = new ResumableSub_LoadBackgroundImage(null);
rsub.resume(ba, null);
}
public static class ResumableSub_LoadBackgroundImage extends BA.ResumableSub {
public ResumableSub_LoadBackgroundImage(b4j.example.main parent) {
this.parent = parent;
}
b4j.example.main parent;
String _url = "";
b4j.example.httpjob _j = null;
String _tempfile = "";
anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper _out = null;
anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper _bmp = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="main";

    while (true) {
try {

        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=1114113;
 //BA.debugLineNum = 1114113;BA.debugLine="Try";
if (true) break;

case 1:
//try
this.state = 22;
this.catchState = 15;
this.state = 3;
if (true) break;

case 3:
//C
this.state = 4;
this.catchState = 15;
RDebugUtils.currentLine=1114114;
 //BA.debugLineNum = 1114114;BA.debugLine="If Not(showImage) Then Return";
if (true) break;

case 4:
//if
this.state = 9;
if (anywheresoftware.b4a.keywords.Common.Not(parent._showimage)) { 
this.state = 6;
;}if (true) break;

case 6:
//C
this.state = 9;
if (true) return ;
if (true) break;

case 9:
//C
this.state = 10;
;
RDebugUtils.currentLine=1114115;
 //BA.debugLineNum = 1114115;BA.debugLine="Dim url As String = \"https://picsum.photos/1280/";
_url = "https://picsum.photos/1280/800?random="+BA.NumberToString(anywheresoftware.b4a.keywords.Common.Rnd((int) (1),(int) (10000)));
RDebugUtils.currentLine=1114116;
 //BA.debugLineNum = 1114116;BA.debugLine="job.Initialize(\"bg\", Me)";
parent._job._initialize /*String*/ (null,ba,"bg",main.getObject());
RDebugUtils.currentLine=1114117;
 //BA.debugLineNum = 1114117;BA.debugLine="job.Download(url)";
parent._job._download /*String*/ (null,_url);
RDebugUtils.currentLine=1114118;
 //BA.debugLineNum = 1114118;BA.debugLine="Wait For (job) JobDone(j As HttpJob)";
anywheresoftware.b4a.keywords.Common.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "main", "loadbackgroundimage"), (Object)(parent._job));
this.state = 23;
return;
case 23:
//C
this.state = 10;
_j = (b4j.example.httpjob) result[0];
;
RDebugUtils.currentLine=1114119;
 //BA.debugLineNum = 1114119;BA.debugLine="If j.Success Then";
if (true) break;

case 10:
//if
this.state = 13;
if (_j._success /*boolean*/ ) { 
this.state = 12;
}if (true) break;

case 12:
//C
this.state = 13;
RDebugUtils.currentLine=1114120;
 //BA.debugLineNum = 1114120;BA.debugLine="Dim tempFile As String = \"temp_bg.jpg\"";
_tempfile = "temp_bg.jpg";
RDebugUtils.currentLine=1114121;
 //BA.debugLineNum = 1114121;BA.debugLine="Dim out As OutputStream = File.OpenOutput(File.";
_out = new anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper();
_out = anywheresoftware.b4a.keywords.Common.File.OpenOutput(anywheresoftware.b4a.keywords.Common.File.getDirTemp(),_tempfile,anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=1114122;
 //BA.debugLineNum = 1114122;BA.debugLine="File.Copy2(j.GetInputStream, out)";
anywheresoftware.b4a.keywords.Common.File.Copy2((java.io.InputStream)(_j._getinputstream /*anywheresoftware.b4a.objects.streams.File.InputStreamWrapper*/ (null).getObject()),(java.io.OutputStream)(_out.getObject()));
RDebugUtils.currentLine=1114123;
 //BA.debugLineNum = 1114123;BA.debugLine="out.Close";
_out.Close();
RDebugUtils.currentLine=1114124;
 //BA.debugLineNum = 1114124;BA.debugLine="Dim bmp As Image = fx.LoadImage(File.DirTemp, t";
_bmp = new anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper();
_bmp = parent._fx.LoadImage(anywheresoftware.b4a.keywords.Common.File.getDirTemp(),_tempfile);
RDebugUtils.currentLine=1114125;
 //BA.debugLineNum = 1114125;BA.debugLine="imgView.SetImage(bmp)";
parent._imgview.SetImage((javafx.scene.image.Image)(_bmp.getObject()));
RDebugUtils.currentLine=1114126;
 //BA.debugLineNum = 1114126;BA.debugLine="imgView.prefWidth = MainForm.Width";
parent._imgview.setPrefWidth(parent._mainform.getWidth());
RDebugUtils.currentLine=1114127;
 //BA.debugLineNum = 1114127;BA.debugLine="imgView.prefHeight = MainForm.Height";
parent._imgview.setPrefHeight(parent._mainform.getHeight());
RDebugUtils.currentLine=1114128;
 //BA.debugLineNum = 1114128;BA.debugLine="File.Delete(File.DirTemp, tempFile)";
anywheresoftware.b4a.keywords.Common.File.Delete(anywheresoftware.b4a.keywords.Common.File.getDirTemp(),_tempfile);
 if (true) break;

case 13:
//C
this.state = 22;
;
RDebugUtils.currentLine=1114130;
 //BA.debugLineNum = 1114130;BA.debugLine="job.Release";
parent._job._release /*String*/ (null);
 if (true) break;

case 15:
//C
this.state = 16;
this.catchState = 0;
RDebugUtils.currentLine=1114132;
 //BA.debugLineNum = 1114132;BA.debugLine="Log(\"Image error: \" & LastException.Message)";
anywheresoftware.b4a.keywords.Common.LogImpl("21114132","Image error: "+anywheresoftware.b4a.keywords.Common.LastException(ba).getMessage(),0);
RDebugUtils.currentLine=1114133;
 //BA.debugLineNum = 1114133;BA.debugLine="If job <> Null Then job.Release";
if (true) break;

case 16:
//if
this.state = 21;
if (parent._job!= null) { 
this.state = 18;
;}if (true) break;

case 18:
//C
this.state = 21;
parent._job._release /*String*/ (null);
if (true) break;

case 21:
//C
this.state = 22;
;
 if (true) break;
if (true) break;

case 22:
//C
this.state = -1;
this.catchState = 0;
;
RDebugUtils.currentLine=1114135;
 //BA.debugLineNum = 1114135;BA.debugLine="End Sub";
if (true) break;
}} 
       catch (Exception e0) {
			
if (catchState == 0)
    throw e0;
else {
    state = catchState;
ba.setLastException(e0);}
            }
        }
    }
}
public static void  _fetchweather() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "fetchweather", false))
	 {Debug.delegate(ba, "fetchweather", null); return;}
ResumableSub_FetchWeather rsub = new ResumableSub_FetchWeather(null);
rsub.resume(ba, null);
}
public static class ResumableSub_FetchWeather extends BA.ResumableSub {
public ResumableSub_FetchWeather(b4j.example.main parent) {
this.parent = parent;
}
b4j.example.main parent;
String _url = "";
b4j.example.httpjob _j = null;
anywheresoftware.b4j.objects.collections.JSONParser _jp = null;
anywheresoftware.b4a.objects.collections.Map _data = null;
anywheresoftware.b4a.objects.collections.Map _current = null;
int _wcode = 0;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="main";

    while (true) {
try {

        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=1179649;
 //BA.debugLineNum = 1179649;BA.debugLine="Try";
if (true) break;

case 1:
//try
this.state = 16;
this.catchState = 9;
this.state = 3;
if (true) break;

case 3:
//C
this.state = 4;
this.catchState = 9;
RDebugUtils.currentLine=1179650;
 //BA.debugLineNum = 1179650;BA.debugLine="Dim url As String = \"https://api.open-meteo.com/";
_url = "https://api.open-meteo.com/v1/forecast?latitude="+BA.NumberToString(parent._latitude)+"&longitude="+BA.NumberToString(parent._longitude)+"&current=temperature_2m,relative_humidity_2m,wind_speed_10m,weather_code&timezone=auto";
RDebugUtils.currentLine=1179651;
 //BA.debugLineNum = 1179651;BA.debugLine="job.Initialize(\"weather\", Me)";
parent._job._initialize /*String*/ (null,ba,"weather",main.getObject());
RDebugUtils.currentLine=1179652;
 //BA.debugLineNum = 1179652;BA.debugLine="job.Download(url)";
parent._job._download /*String*/ (null,_url);
RDebugUtils.currentLine=1179653;
 //BA.debugLineNum = 1179653;BA.debugLine="Wait For (job) JobDone(j As HttpJob)";
anywheresoftware.b4a.keywords.Common.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "main", "fetchweather"), (Object)(parent._job));
this.state = 17;
return;
case 17:
//C
this.state = 4;
_j = (b4j.example.httpjob) result[0];
;
RDebugUtils.currentLine=1179654;
 //BA.debugLineNum = 1179654;BA.debugLine="If j.Success Then";
if (true) break;

case 4:
//if
this.state = 7;
if (_j._success /*boolean*/ ) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
RDebugUtils.currentLine=1179655;
 //BA.debugLineNum = 1179655;BA.debugLine="Dim jp As JSONParser";
_jp = new anywheresoftware.b4j.objects.collections.JSONParser();
RDebugUtils.currentLine=1179656;
 //BA.debugLineNum = 1179656;BA.debugLine="jp.Initialize(j.GetString)";
_jp.Initialize(_j._getstring /*String*/ (null));
RDebugUtils.currentLine=1179657;
 //BA.debugLineNum = 1179657;BA.debugLine="Dim data As Map = jp.NextObject";
_data = new anywheresoftware.b4a.objects.collections.Map();
_data = _jp.NextObject();
RDebugUtils.currentLine=1179658;
 //BA.debugLineNum = 1179658;BA.debugLine="Dim current As Map = data.Get(\"current\")";
_current = new anywheresoftware.b4a.objects.collections.Map();
_current = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_data.Get((Object)("current"))));
RDebugUtils.currentLine=1179659;
 //BA.debugLineNum = 1179659;BA.debugLine="weatherData.Put(\"temperature\", NumberFormat2(cu";
parent._weatherdata.Put((Object)("temperature"),(Object)(anywheresoftware.b4a.keywords.Common.NumberFormat2((double)(BA.ObjectToNumber(_current.Get((Object)("temperature_2m")))),(int) (1),(int) (1),(int) (1),anywheresoftware.b4a.keywords.Common.False)));
RDebugUtils.currentLine=1179660;
 //BA.debugLineNum = 1179660;BA.debugLine="weatherData.Put(\"humidity\", current.Get(\"relati";
parent._weatherdata.Put((Object)("humidity"),_current.Get((Object)("relative_humidity_2m")));
RDebugUtils.currentLine=1179661;
 //BA.debugLineNum = 1179661;BA.debugLine="weatherData.Put(\"wind_speed\", NumberFormat2(cur";
parent._weatherdata.Put((Object)("wind_speed"),(Object)(anywheresoftware.b4a.keywords.Common.NumberFormat2((double)(BA.ObjectToNumber(_current.Get((Object)("wind_speed_10m")))),(int) (1),(int) (1),(int) (1),anywheresoftware.b4a.keywords.Common.False)));
RDebugUtils.currentLine=1179662;
 //BA.debugLineNum = 1179662;BA.debugLine="Dim wCode As Int = current.Get(\"weather_code\")";
_wcode = (int)(BA.ObjectToNumber(_current.Get((Object)("weather_code"))));
RDebugUtils.currentLine=1179663;
 //BA.debugLineNum = 1179663;BA.debugLine="weatherEmoji = GetWeatherEmoji(wCode)";
parent._weatheremoji = _getweatheremoji(_wcode);
RDebugUtils.currentLine=1179664;
 //BA.debugLineNum = 1179664;BA.debugLine="Log(\"Weather updated: \" & weatherEmoji)";
anywheresoftware.b4a.keywords.Common.LogImpl("21179664","Weather updated: "+parent._weatheremoji,0);
 if (true) break;

case 7:
//C
this.state = 16;
;
RDebugUtils.currentLine=1179666;
 //BA.debugLineNum = 1179666;BA.debugLine="job.Release";
parent._job._release /*String*/ (null);
 if (true) break;

case 9:
//C
this.state = 10;
this.catchState = 0;
RDebugUtils.currentLine=1179668;
 //BA.debugLineNum = 1179668;BA.debugLine="Log(\"Weather error: \" & LastException.Message)";
anywheresoftware.b4a.keywords.Common.LogImpl("21179668","Weather error: "+anywheresoftware.b4a.keywords.Common.LastException(ba).getMessage(),0);
RDebugUtils.currentLine=1179669;
 //BA.debugLineNum = 1179669;BA.debugLine="If job <> Null Then job.Release";
if (true) break;

case 10:
//if
this.state = 15;
if (parent._job!= null) { 
this.state = 12;
;}if (true) break;

case 12:
//C
this.state = 15;
parent._job._release /*String*/ (null);
if (true) break;

case 15:
//C
this.state = 16;
;
 if (true) break;
if (true) break;

case 16:
//C
this.state = -1;
this.catchState = 0;
;
RDebugUtils.currentLine=1179671;
 //BA.debugLineNum = 1179671;BA.debugLine="End Sub";
if (true) break;
}} 
       catch (Exception e0) {
			
if (catchState == 0)
    throw e0;
else {
    state = catchState;
ba.setLastException(e0);}
            }
        }
    }
}
public static String  _fetchprayertimes() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "fetchprayertimes", false))
	 {return ((String) Debug.delegate(ba, "fetchprayertimes", null));}
long _now = 0L;
int _currentmonth = 0;
int _currentday = 0;
Object[] _prayertimes = null;
anywheresoftware.b4a.objects.collections.List _prayernames = null;
int _i = 0;
anywheresoftware.b4j.objects.LabelWrapper _lbltime = null;
RDebugUtils.currentLine=262144;
 //BA.debugLineNum = 262144;BA.debugLine="Sub FetchPrayerTimes";
RDebugUtils.currentLine=262145;
 //BA.debugLineNum = 262145;BA.debugLine="Try";
try {RDebugUtils.currentLine=262146;
 //BA.debugLineNum = 262146;BA.debugLine="Dim now As Long = DateTime.Now";
_now = anywheresoftware.b4a.keywords.Common.DateTime.getNow();
RDebugUtils.currentLine=262147;
 //BA.debugLineNum = 262147;BA.debugLine="Dim currentMonth As Int = DateTime.GetMonth(now)";
_currentmonth = anywheresoftware.b4a.keywords.Common.DateTime.GetMonth(_now);
RDebugUtils.currentLine=262148;
 //BA.debugLineNum = 262148;BA.debugLine="Dim currentDay As Int = DateTime.GetDayOfMonth(n";
_currentday = anywheresoftware.b4a.keywords.Common.DateTime.GetDayOfMonth(_now);
RDebugUtils.currentLine=262150;
 //BA.debugLineNum = 262150;BA.debugLine="Dim prayerTimes() As Object = GetReligious_times";
_prayertimes = _getreligious_times(_currentmonth,_currentday,_longitude,_latitude,anywheresoftware.b4a.keywords.Common.False,anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=262152;
 //BA.debugLineNum = 262152;BA.debugLine="If prayerTimes = Null Then";
if (_prayertimes== null) { 
RDebugUtils.currentLine=262153;
 //BA.debugLineNum = 262153;BA.debugLine="Log(\"Prayer times calculation failed\")";
anywheresoftware.b4a.keywords.Common.LogImpl("2262153","Prayer times calculation failed",0);
RDebugUtils.currentLine=262154;
 //BA.debugLineNum = 262154;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=262158;
 //BA.debugLineNum = 262158;BA.debugLine="Dim prayerNames As List = Array As String(\"fajr\"";
_prayernames = new anywheresoftware.b4a.objects.collections.List();
_prayernames = anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{"fajr","sunrise","dhuhr","asr","maghrib","isha"});
RDebugUtils.currentLine=262160;
 //BA.debugLineNum = 262160;BA.debugLine="For i = 0 To 5";
{
final int step11 = 1;
final int limit11 = (int) (5);
_i = (int) (0) ;
for (;_i <= limit11 ;_i = _i + step11 ) {
RDebugUtils.currentLine=262161;
 //BA.debugLineNum = 262161;BA.debugLine="Dim lblTime As Label = prayerLabels.Get(prayerN";
_lbltime = new anywheresoftware.b4j.objects.LabelWrapper();
_lbltime = (anywheresoftware.b4j.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.LabelWrapper(), (javafx.scene.control.Label)(_prayerlabels.Get(_prayernames.Get(_i))));
RDebugUtils.currentLine=262162;
 //BA.debugLineNum = 262162;BA.debugLine="lblTime.Text = prayerTimes(i)";
_lbltime.setText(BA.ObjectToString(_prayertimes[_i]));
 }
};
RDebugUtils.currentLine=262165;
 //BA.debugLineNum = 262165;BA.debugLine="Log(\"Prayer times updated successfully\")";
anywheresoftware.b4a.keywords.Common.LogImpl("2262165","Prayer times updated successfully",0);
 } 
       catch (Exception e17) {
			ba.setLastException(e17);RDebugUtils.currentLine=262167;
 //BA.debugLineNum = 262167;BA.debugLine="Log(\"Prayer times error: \" & LastException.Messa";
anywheresoftware.b4a.keywords.Common.LogImpl("2262167","Prayer times error: "+anywheresoftware.b4a.keywords.Common.LastException(ba).getMessage(),0);
 };
RDebugUtils.currentLine=262169;
 //BA.debugLineNum = 262169;BA.debugLine="End Sub";
return "";
}
public static String  _updateclock() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "updateclock", false))
	 {return ((String) Debug.delegate(ba, "updateclock", null));}
long _now = 0L;
String _timestr = "";
int _hour = 0;
int _minute = 0;
anywheresoftware.b4a.objects.collections.List _daynames = null;
anywheresoftware.b4a.objects.collections.List _monthnames = null;
int _dayofweek = 0;
int _dayofmonth = 0;
int _month = 0;
int _year = 0;
String _datestr = "";
String _temp = "";
String _hum = "";
String _wind = "";
RDebugUtils.currentLine=458752;
 //BA.debugLineNum = 458752;BA.debugLine="Sub UpdateClock";
RDebugUtils.currentLine=458753;
 //BA.debugLineNum = 458753;BA.debugLine="Try";
try {RDebugUtils.currentLine=458754;
 //BA.debugLineNum = 458754;BA.debugLine="Dim now As Long = DateTime.Now";
_now = anywheresoftware.b4a.keywords.Common.DateTime.getNow();
RDebugUtils.currentLine=458755;
 //BA.debugLineNum = 458755;BA.debugLine="Dim timeStr As String = DateTime.Time(now)";
_timestr = anywheresoftware.b4a.keywords.Common.DateTime.Time(_now);
RDebugUtils.currentLine=458756;
 //BA.debugLineNum = 458756;BA.debugLine="Dim hour As Int = DateTime.GetHour(now)";
_hour = anywheresoftware.b4a.keywords.Common.DateTime.GetHour(_now);
RDebugUtils.currentLine=458757;
 //BA.debugLineNum = 458757;BA.debugLine="Dim minute As Int = DateTime.GetMinute(now)";
_minute = anywheresoftware.b4a.keywords.Common.DateTime.GetMinute(_now);
RDebugUtils.currentLine=458759;
 //BA.debugLineNum = 458759;BA.debugLine="If hour = 0 And minute = 0 Then";
if (_hour==0 && _minute==0) { 
RDebugUtils.currentLine=458760;
 //BA.debugLineNum = 458760;BA.debugLine="FetchPrayerTimes";
_fetchprayertimes();
 };
RDebugUtils.currentLine=458763;
 //BA.debugLineNum = 458763;BA.debugLine="Dim dayNames As List = Array As String(\"sunday\",";
_daynames = new anywheresoftware.b4a.objects.collections.List();
_daynames = anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{"sunday","monday","tuesday","wednesday","thursday","friday","saturday"});
RDebugUtils.currentLine=458764;
 //BA.debugLineNum = 458764;BA.debugLine="Dim monthNames As List = Array As String(\"januar";
_monthnames = new anywheresoftware.b4a.objects.collections.List();
_monthnames = anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{"january","february","march","april","may","june","july","august","september","october","november","december"});
RDebugUtils.currentLine=458766;
 //BA.debugLineNum = 458766;BA.debugLine="Dim dayOfWeek As Int = DateTime.GetDayOfWeek(now";
_dayofweek = anywheresoftware.b4a.keywords.Common.DateTime.GetDayOfWeek(_now);
RDebugUtils.currentLine=458767;
 //BA.debugLineNum = 458767;BA.debugLine="Dim dayOfMonth As Int = DateTime.GetDayOfMonth(n";
_dayofmonth = anywheresoftware.b4a.keywords.Common.DateTime.GetDayOfMonth(_now);
RDebugUtils.currentLine=458768;
 //BA.debugLineNum = 458768;BA.debugLine="Dim month As Int = DateTime.GetMonth(now)";
_month = anywheresoftware.b4a.keywords.Common.DateTime.GetMonth(_now);
RDebugUtils.currentLine=458769;
 //BA.debugLineNum = 458769;BA.debugLine="Dim year As Int = DateTime.GetYear(now)";
_year = anywheresoftware.b4a.keywords.Common.DateTime.GetYear(_now);
RDebugUtils.currentLine=458771;
 //BA.debugLineNum = 458771;BA.debugLine="Dim dateStr As String";
_datestr = "";
RDebugUtils.currentLine=458772;
 //BA.debugLineNum = 458772;BA.debugLine="If currentLanguage = \"ar\" Then";
if ((_currentlanguage).equals("ar")) { 
RDebugUtils.currentLine=458773;
 //BA.debugLineNum = 458773;BA.debugLine="dateStr = GetTranslation(dayNames.Get(dayOfWeek";
_datestr = _gettranslation(BA.ObjectToString(_daynames.Get(_dayofweek)))+"، "+BA.NumberToString(_dayofmonth)+" "+_gettranslation(BA.ObjectToString(_monthnames.Get((int) (_month-1))))+" "+BA.NumberToString(_year);
RDebugUtils.currentLine=458774;
 //BA.debugLineNum = 458774;BA.debugLine="lblDate.Style = \"-fx-font-weight: normal; -fx-n";
_lbldate.setStyle("-fx-font-weight: normal; -fx-node-orientation: right-to-left;");
 }else {
RDebugUtils.currentLine=458776;
 //BA.debugLineNum = 458776;BA.debugLine="dateStr = GetTranslation(dayNames.Get(dayOfWeek";
_datestr = _gettranslation(BA.ObjectToString(_daynames.Get(_dayofweek)))+", "+_gettranslation(BA.ObjectToString(_monthnames.Get((int) (_month-1))))+" "+BA.NumberToString(_dayofmonth)+", "+BA.NumberToString(_year);
RDebugUtils.currentLine=458777;
 //BA.debugLineNum = 458777;BA.debugLine="lblDate.Style = \"-fx-font-weight: normal; -fx-n";
_lbldate.setStyle("-fx-font-weight: normal; -fx-node-orientation: left-to-right;");
 };
RDebugUtils.currentLine=458780;
 //BA.debugLineNum = 458780;BA.debugLine="If isAnalogMode Then";
if (_isanalogmode) { 
RDebugUtils.currentLine=458781;
 //BA.debugLineNum = 458781;BA.debugLine="DrawAnalogClock";
_drawanalogclock();
 }else {
RDebugUtils.currentLine=458783;
 //BA.debugLineNum = 458783;BA.debugLine="lblClock.Text = timeStr";
_lblclock.setText(_timestr);
 };
RDebugUtils.currentLine=458786;
 //BA.debugLineNum = 458786;BA.debugLine="lblDate.Text = dateStr";
_lbldate.setText(_datestr);
RDebugUtils.currentLine=458789;
 //BA.debugLineNum = 458789;BA.debugLine="If weatherData.Size > 0 Then";
if (_weatherdata.getSize()>0) { 
RDebugUtils.currentLine=458790;
 //BA.debugLineNum = 458790;BA.debugLine="Dim temp As String = weatherData.GetDefault(\"te";
_temp = BA.ObjectToString(_weatherdata.GetDefault((Object)("temperature"),(Object)("N/A")));
RDebugUtils.currentLine=458791;
 //BA.debugLineNum = 458791;BA.debugLine="Dim hum As String = weatherData.GetDefault(\"hum";
_hum = BA.ObjectToString(_weatherdata.GetDefault((Object)("humidity"),(Object)("N/A")));
RDebugUtils.currentLine=458792;
 //BA.debugLineNum = 458792;BA.debugLine="Dim wind As String = weatherData.GetDefault(\"wi";
_wind = BA.ObjectToString(_weatherdata.GetDefault((Object)("wind_speed"),(Object)("N/A")));
RDebugUtils.currentLine=458794;
 //BA.debugLineNum = 458794;BA.debugLine="lblTemperature.Text = temp & \"°C\"";
_lbltemperature.setText(_temp+"°C");
RDebugUtils.currentLine=458795;
 //BA.debugLineNum = 458795;BA.debugLine="lblWeatherIcon.Text = weatherEmoji";
_lblweathericon.setText(_weatheremoji);
RDebugUtils.currentLine=458796;
 //BA.debugLineNum = 458796;BA.debugLine="lblWeatherDetails.Text = cityName & CRLF & \"💧";
_lblweatherdetails.setText(_cityname+anywheresoftware.b4a.keywords.Common.CRLF+"💧 Humidity: "+_hum+"%"+anywheresoftware.b4a.keywords.Common.CRLF+"💨 Wind: "+_wind+" km/h");
 };
 } 
       catch (Exception e38) {
			ba.setLastException(e38);RDebugUtils.currentLine=458799;
 //BA.debugLineNum = 458799;BA.debugLine="Log(\"Clock error: \" & LastException.Message)";
anywheresoftware.b4a.keywords.Common.LogImpl("2458799","Clock error: "+anywheresoftware.b4a.keywords.Common.LastException(ba).getMessage(),0);
 };
RDebugUtils.currentLine=458801;
 //BA.debugLineNum = 458801;BA.debugLine="End Sub";
return "";
}
public static String  _btnbackground_click() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "btnbackground_click", false))
	 {return ((String) Debug.delegate(ba, "btnbackground_click", null));}
RDebugUtils.currentLine=983040;
 //BA.debugLineNum = 983040;BA.debugLine="Sub btnBackground_Click";
RDebugUtils.currentLine=983041;
 //BA.debugLineNum = 983041;BA.debugLine="showImage = Not(showImage)";
_showimage = anywheresoftware.b4a.keywords.Common.Not(_showimage);
RDebugUtils.currentLine=983042;
 //BA.debugLineNum = 983042;BA.debugLine="If showImage Then";
if (_showimage) { 
RDebugUtils.currentLine=983043;
 //BA.debugLineNum = 983043;BA.debugLine="btnBackground.Text = \"🖼️ Image ON\"";
_btnbackground.setText("🖼️ Image ON");
RDebugUtils.currentLine=983044;
 //BA.debugLineNum = 983044;BA.debugLine="btnBgColor.Enabled = False";
_btnbgcolor.setEnabled(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=983045;
 //BA.debugLineNum = 983045;BA.debugLine="LoadBackgroundImage";
_loadbackgroundimage();
RDebugUtils.currentLine=983046;
 //BA.debugLineNum = 983046;BA.debugLine="lastImageChangeTime = DateTime.Now / 1000";
_lastimagechangetime = (long) (anywheresoftware.b4a.keywords.Common.DateTime.getNow()/(double)1000);
 }else {
RDebugUtils.currentLine=983048;
 //BA.debugLineNum = 983048;BA.debugLine="btnBackground.Text = \"🌈 Image OFF\"";
_btnbackground.setText("🌈 Image OFF");
RDebugUtils.currentLine=983049;
 //BA.debugLineNum = 983049;BA.debugLine="btnBgColor.Enabled = True";
_btnbgcolor.setEnabled(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=983050;
 //BA.debugLineNum = 983050;BA.debugLine="imgView.SetImage(Null)";
_imgview.SetImage((javafx.scene.image.Image)(anywheresoftware.b4a.keywords.Common.Null));
RDebugUtils.currentLine=983051;
 //BA.debugLineNum = 983051;BA.debugLine="timImageChange.Enabled = False";
_timimagechange.setEnabled(anywheresoftware.b4a.keywords.Common.False);
 };
RDebugUtils.currentLine=983053;
 //BA.debugLineNum = 983053;BA.debugLine="End Sub";
return "";
}
public static String  _btnbgcolor_click() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "btnbgcolor_click", false))
	 {return ((String) Debug.delegate(ba, "btnbgcolor_click", null));}
anywheresoftware.b4a.objects.collections.List _bgcolorhex = null;
anywheresoftware.b4a.objects.collections.List _bgnames = null;
RDebugUtils.currentLine=1048576;
 //BA.debugLineNum = 1048576;BA.debugLine="Sub btnBgColor_Click";
RDebugUtils.currentLine=1048577;
 //BA.debugLineNum = 1048577;BA.debugLine="Try";
try {RDebugUtils.currentLine=1048578;
 //BA.debugLineNum = 1048578;BA.debugLine="Dim bgColorHex As List = Array As String(\"#00000";
_bgcolorhex = new anywheresoftware.b4a.objects.collections.List();
_bgcolorhex = anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{"#000000","#404040","#00008B","#006400","#8B0000"});
RDebugUtils.currentLine=1048579;
 //BA.debugLineNum = 1048579;BA.debugLine="Dim bgNames As List = Array As String(\"Black\", \"";
_bgnames = new anywheresoftware.b4a.objects.collections.List();
_bgnames = anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{"Black","Gray","Blue","Green","Red"});
RDebugUtils.currentLine=1048580;
 //BA.debugLineNum = 1048580;BA.debugLine="currentBgIndex = (currentBgIndex + 1) Mod bgColo";
_currentbgindex = (int) ((_currentbgindex+1)%_bgcolorhex.getSize());
RDebugUtils.currentLine=1048581;
 //BA.debugLineNum = 1048581;BA.debugLine="pnlBackground.Style = \"-fx-background-color: \" &";
_pnlbackground.setStyle("-fx-background-color: "+BA.ObjectToString(_bgcolorhex.Get(_currentbgindex))+";");
RDebugUtils.currentLine=1048582;
 //BA.debugLineNum = 1048582;BA.debugLine="Log(\"BG Color: \" & bgNames.Get(currentBgIndex))";
anywheresoftware.b4a.keywords.Common.LogImpl("21048582","BG Color: "+BA.ObjectToString(_bgnames.Get(_currentbgindex)),0);
 } 
       catch (Exception e8) {
			ba.setLastException(e8);RDebugUtils.currentLine=1048584;
 //BA.debugLineNum = 1048584;BA.debugLine="Log(\"BG error: \" & LastException.Message)";
anywheresoftware.b4a.keywords.Common.LogImpl("21048584","BG error: "+anywheresoftware.b4a.keywords.Common.LastException(ba).getMessage(),0);
 };
RDebugUtils.currentLine=1048586;
 //BA.debugLineNum = 1048586;BA.debugLine="End Sub";
return "";
}
public static String  _btnchangecity_click() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "btnchangecity_click", false))
	 {return ((String) Debug.delegate(ba, "btnchangecity_click", null));}
anywheresoftware.b4j.object.JavaObject _inputdialog = null;
anywheresoftware.b4j.object.JavaObject _editor = null;
anywheresoftware.b4j.object.JavaObject _result = null;
boolean _ispresent = false;
String _searchquery = "";
RDebugUtils.currentLine=8060928;
 //BA.debugLineNum = 8060928;BA.debugLine="Sub btnChangeCity_Click";
RDebugUtils.currentLine=8060929;
 //BA.debugLineNum = 8060929;BA.debugLine="Try";
try {RDebugUtils.currentLine=8060931;
 //BA.debugLineNum = 8060931;BA.debugLine="Dim inputDialog As JavaObject";
_inputdialog = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=8060932;
 //BA.debugLineNum = 8060932;BA.debugLine="inputDialog.InitializeNewInstance(\"javafx.scene.";
_inputdialog.InitializeNewInstance("javafx.scene.control.TextInputDialog",new Object[]{(Object)("")});
RDebugUtils.currentLine=8060933;
 //BA.debugLineNum = 8060933;BA.debugLine="inputDialog.RunMethod(\"setTitle\", Array(\"Change";
_inputdialog.RunMethod("setTitle",new Object[]{(Object)("Change City")});
RDebugUtils.currentLine=8060934;
 //BA.debugLineNum = 8060934;BA.debugLine="inputDialog.RunMethod(\"setHeaderText\", Array(\"Se";
_inputdialog.RunMethod("setHeaderText",new Object[]{(Object)("Search for your city")});
RDebugUtils.currentLine=8060935;
 //BA.debugLineNum = 8060935;BA.debugLine="inputDialog.RunMethod(\"setContentText\", Array(\"E";
_inputdialog.RunMethod("setContentText",new Object[]{(Object)("Enter city name:")});
RDebugUtils.currentLine=8060938;
 //BA.debugLineNum = 8060938;BA.debugLine="Dim editor As JavaObject = inputDialog.RunMethod";
_editor = new anywheresoftware.b4j.object.JavaObject();
_editor = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_inputdialog.RunMethod("getEditor",(Object[])(anywheresoftware.b4a.keywords.Common.Null))));
RDebugUtils.currentLine=8060939;
 //BA.debugLineNum = 8060939;BA.debugLine="editor.RunMethod(\"setText\", Array(cityName))";
_editor.RunMethod("setText",new Object[]{(Object)(_cityname)});
RDebugUtils.currentLine=8060941;
 //BA.debugLineNum = 8060941;BA.debugLine="Dim result As JavaObject = inputDialog.RunMethod";
_result = new anywheresoftware.b4j.object.JavaObject();
_result = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_inputdialog.RunMethod("showAndWait",(Object[])(anywheresoftware.b4a.keywords.Common.Null))));
RDebugUtils.currentLine=8060942;
 //BA.debugLineNum = 8060942;BA.debugLine="Dim isPresent As Boolean = result.RunMethod(\"isP";
_ispresent = BA.ObjectToBoolean(_result.RunMethod("isPresent",(Object[])(anywheresoftware.b4a.keywords.Common.Null)));
RDebugUtils.currentLine=8060944;
 //BA.debugLineNum = 8060944;BA.debugLine="If isPresent Then";
if (_ispresent) { 
RDebugUtils.currentLine=8060945;
 //BA.debugLineNum = 8060945;BA.debugLine="Dim searchQuery As String = result.RunMethod(\"g";
_searchquery = BA.ObjectToString(_result.RunMethod("get",(Object[])(anywheresoftware.b4a.keywords.Common.Null)));
RDebugUtils.currentLine=8060946;
 //BA.debugLineNum = 8060946;BA.debugLine="If searchQuery.Trim.Length > 0 Then";
if (_searchquery.trim().length()>0) { 
RDebugUtils.currentLine=8060947;
 //BA.debugLineNum = 8060947;BA.debugLine="SearchCity(searchQuery.Trim)  ' Now no conflic";
_searchcity(_searchquery.trim());
 };
 };
 } 
       catch (Exception e18) {
			ba.setLastException(e18);RDebugUtils.currentLine=8060951;
 //BA.debugLineNum = 8060951;BA.debugLine="Log(\"City dialog error: \" & LastException.Messag";
anywheresoftware.b4a.keywords.Common.LogImpl("28060951","City dialog error: "+anywheresoftware.b4a.keywords.Common.LastException(ba).getMessage(),0);
 };
RDebugUtils.currentLine=8060953;
 //BA.debugLineNum = 8060953;BA.debugLine="End Sub";
return "";
}
public static void  _searchcity(String _cityquery) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "searchcity", false))
	 {Debug.delegate(ba, "searchcity", new Object[] {_cityquery}); return;}
ResumableSub_SearchCity rsub = new ResumableSub_SearchCity(null,_cityquery);
rsub.resume(ba, null);
}
public static class ResumableSub_SearchCity extends BA.ResumableSub {
public ResumableSub_SearchCity(b4j.example.main parent,String _cityquery) {
this.parent = parent;
this._cityquery = _cityquery;
}
b4j.example.main parent;
String _cityquery;
String _url = "";
b4j.example.httpjob _j = null;
anywheresoftware.b4j.objects.collections.JSONParser _jp = null;
anywheresoftware.b4a.objects.collections.Map _response = null;
anywheresoftware.b4a.objects.collections.List _results = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="main";

    while (true) {
try {

        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=8126465;
 //BA.debugLineNum = 8126465;BA.debugLine="Try";
if (true) break;

case 1:
//try
this.state = 36;
this.catchState = 29;
this.state = 3;
if (true) break;

case 3:
//C
this.state = 4;
this.catchState = 29;
RDebugUtils.currentLine=8126466;
 //BA.debugLineNum = 8126466;BA.debugLine="Log(\"Searching for city: \" & cityQuery)";
anywheresoftware.b4a.keywords.Common.LogImpl("28126466","Searching for city: "+_cityquery,0);
RDebugUtils.currentLine=8126469;
 //BA.debugLineNum = 8126469;BA.debugLine="Dim url As String = \"https://geocoding-api.open-";
_url = "https://geocoding-api.open-meteo.com/v1/search?name="+_cityquery.replace(" ","%20")+"&count=10&language=en&format=json";
RDebugUtils.currentLine=8126472;
 //BA.debugLineNum = 8126472;BA.debugLine="job.Initialize(\"geocode\", Me)";
parent._job._initialize /*String*/ (null,ba,"geocode",main.getObject());
RDebugUtils.currentLine=8126473;
 //BA.debugLineNum = 8126473;BA.debugLine="job.Download(url)";
parent._job._download /*String*/ (null,_url);
RDebugUtils.currentLine=8126474;
 //BA.debugLineNum = 8126474;BA.debugLine="Wait For (job) JobDone(j As HttpJob)";
anywheresoftware.b4a.keywords.Common.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "main", "searchcity"), (Object)(parent._job));
this.state = 37;
return;
case 37:
//C
this.state = 4;
_j = (b4j.example.httpjob) result[0];
;
RDebugUtils.currentLine=8126476;
 //BA.debugLineNum = 8126476;BA.debugLine="If j.Success Then";
if (true) break;

case 4:
//if
this.state = 27;
if (_j._success /*boolean*/ ) { 
this.state = 6;
}else {
this.state = 26;
}if (true) break;

case 6:
//C
this.state = 7;
RDebugUtils.currentLine=8126477;
 //BA.debugLineNum = 8126477;BA.debugLine="Dim jp As JSONParser";
_jp = new anywheresoftware.b4j.objects.collections.JSONParser();
RDebugUtils.currentLine=8126478;
 //BA.debugLineNum = 8126478;BA.debugLine="jp.Initialize(j.GetString)";
_jp.Initialize(_j._getstring /*String*/ (null));
RDebugUtils.currentLine=8126479;
 //BA.debugLineNum = 8126479;BA.debugLine="Dim response As Map = jp.NextObject";
_response = new anywheresoftware.b4a.objects.collections.Map();
_response = _jp.NextObject();
RDebugUtils.currentLine=8126481;
 //BA.debugLineNum = 8126481;BA.debugLine="If response.ContainsKey(\"results\") Then";
if (true) break;

case 7:
//if
this.state = 24;
if (_response.ContainsKey((Object)("results"))) { 
this.state = 9;
}else {
this.state = 23;
}if (true) break;

case 9:
//C
this.state = 10;
RDebugUtils.currentLine=8126482;
 //BA.debugLineNum = 8126482;BA.debugLine="Dim results As List = response.Get(\"results\")";
_results = new anywheresoftware.b4a.objects.collections.List();
_results = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_response.Get((Object)("results"))));
RDebugUtils.currentLine=8126484;
 //BA.debugLineNum = 8126484;BA.debugLine="If results.Size > 0 Then";
if (true) break;

case 10:
//if
this.state = 21;
if (_results.getSize()>0) { 
this.state = 12;
}else {
this.state = 20;
}if (true) break;

case 12:
//C
this.state = 13;
RDebugUtils.currentLine=8126486;
 //BA.debugLineNum = 8126486;BA.debugLine="If results.Size > 1 Then";
if (true) break;

case 13:
//if
this.state = 18;
if (_results.getSize()>1) { 
this.state = 15;
}else {
this.state = 17;
}if (true) break;

case 15:
//C
this.state = 18;
RDebugUtils.currentLine=8126487;
 //BA.debugLineNum = 8126487;BA.debugLine="ShowCitySelectionDialog(results)";
_showcityselectiondialog(_results);
 if (true) break;

case 17:
//C
this.state = 18;
RDebugUtils.currentLine=8126490;
 //BA.debugLineNum = 8126490;BA.debugLine="SelectCity(results.Get(0))";
_selectcity((anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_results.Get((int) (0)))));
 if (true) break;

case 18:
//C
this.state = 21;
;
 if (true) break;

case 20:
//C
this.state = 21;
RDebugUtils.currentLine=8126493;
 //BA.debugLineNum = 8126493;BA.debugLine="ShowAlert(\"City Not Found\", \"No results found";
_showalert("City Not Found","No results found for: "+_cityquery);
 if (true) break;

case 21:
//C
this.state = 24;
;
 if (true) break;

case 23:
//C
this.state = 24;
RDebugUtils.currentLine=8126496;
 //BA.debugLineNum = 8126496;BA.debugLine="ShowAlert(\"Search Error\", \"No results found. P";
_showalert("Search Error","No results found. Please try a different city name.");
 if (true) break;

case 24:
//C
this.state = 27;
;
 if (true) break;

case 26:
//C
this.state = 27;
RDebugUtils.currentLine=8126499;
 //BA.debugLineNum = 8126499;BA.debugLine="ShowAlert(\"Network Error\", \"Failed to search fo";
_showalert("Network Error","Failed to search for city. Please check your internet connection.");
 if (true) break;

case 27:
//C
this.state = 36;
;
RDebugUtils.currentLine=8126502;
 //BA.debugLineNum = 8126502;BA.debugLine="job.Release";
parent._job._release /*String*/ (null);
 if (true) break;

case 29:
//C
this.state = 30;
this.catchState = 0;
RDebugUtils.currentLine=8126504;
 //BA.debugLineNum = 8126504;BA.debugLine="Log(\"SearchCity error: \" & LastException.Message";
anywheresoftware.b4a.keywords.Common.LogImpl("28126504","SearchCity error: "+anywheresoftware.b4a.keywords.Common.LastException(ba).getMessage(),0);
RDebugUtils.currentLine=8126505;
 //BA.debugLineNum = 8126505;BA.debugLine="If job <> Null Then job.Release";
if (true) break;

case 30:
//if
this.state = 35;
if (parent._job!= null) { 
this.state = 32;
;}if (true) break;

case 32:
//C
this.state = 35;
parent._job._release /*String*/ (null);
if (true) break;

case 35:
//C
this.state = 36;
;
 if (true) break;
if (true) break;

case 36:
//C
this.state = -1;
this.catchState = 0;
;
RDebugUtils.currentLine=8126507;
 //BA.debugLineNum = 8126507;BA.debugLine="End Sub";
if (true) break;
}} 
       catch (Exception e0) {
			
if (catchState == 0)
    throw e0;
else {
    state = catchState;
ba.setLastException(e0);}
            }
        }
    }
}
public static String  _btnclockmode_click() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "btnclockmode_click", false))
	 {return ((String) Debug.delegate(ba, "btnclockmode_click", null));}
anywheresoftware.b4a.objects.B4XCanvas.B4XRect _rect = null;
RDebugUtils.currentLine=786432;
 //BA.debugLineNum = 786432;BA.debugLine="Sub btnClockMode_Click";
RDebugUtils.currentLine=786433;
 //BA.debugLineNum = 786433;BA.debugLine="Try";
try {RDebugUtils.currentLine=786434;
 //BA.debugLineNum = 786434;BA.debugLine="isAnalogMode = Not(isAnalogMode)";
_isanalogmode = anywheresoftware.b4a.keywords.Common.Not(_isanalogmode);
RDebugUtils.currentLine=786436;
 //BA.debugLineNum = 786436;BA.debugLine="If isAnalogMode Then";
if (_isanalogmode) { 
RDebugUtils.currentLine=786437;
 //BA.debugLineNum = 786437;BA.debugLine="btnClockMode.Text = \"🕐 Analog\"";
_btnclockmode.setText("🕐 Analog");
RDebugUtils.currentLine=786440;
 //BA.debugLineNum = 786440;BA.debugLine="lblClock.Visible = False";
_lblclock.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=786441;
 //BA.debugLineNum = 786441;BA.debugLine="lblClock.Text = \"\"";
_lblclock.setText("");
RDebugUtils.currentLine=786444;
 //BA.debugLineNum = 786444;BA.debugLine="pnlAnalogClock.Visible = True";
_pnlanalogclock.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=786447;
 //BA.debugLineNum = 786447;BA.debugLine="CenterAllElements";
_centerallelements();
RDebugUtils.currentLine=786450;
 //BA.debugLineNum = 786450;BA.debugLine="DrawAnalogClock";
_drawanalogclock();
 }else {
RDebugUtils.currentLine=786453;
 //BA.debugLineNum = 786453;BA.debugLine="btnClockMode.Text = \"🔢 Digital\"";
_btnclockmode.setText("🔢 Digital");
RDebugUtils.currentLine=786456;
 //BA.debugLineNum = 786456;BA.debugLine="Dim rect As B4XRect";
_rect = new anywheresoftware.b4a.objects.B4XCanvas.B4XRect();
RDebugUtils.currentLine=786457;
 //BA.debugLineNum = 786457;BA.debugLine="rect.Initialize(0, 0, pnlAnalogClock.prefWidth,";
_rect.Initialize((float) (0),(float) (0),(float) (_pnlanalogclock.getPrefWidth()),(float) (_pnlanalogclock.getPrefHeight()));
RDebugUtils.currentLine=786458;
 //BA.debugLineNum = 786458;BA.debugLine="cvsAnalogClock.ClearRect(rect)";
_cvsanalogclock.ClearRect(_rect);
RDebugUtils.currentLine=786459;
 //BA.debugLineNum = 786459;BA.debugLine="cvsAnalogClock.Invalidate";
_cvsanalogclock.Invalidate();
RDebugUtils.currentLine=786460;
 //BA.debugLineNum = 786460;BA.debugLine="pnlAnalogClock.Visible = False";
_pnlanalogclock.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=786463;
 //BA.debugLineNum = 786463;BA.debugLine="lblClock.Visible = True";
_lblclock.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=786466;
 //BA.debugLineNum = 786466;BA.debugLine="CenterAllElements";
_centerallelements();
RDebugUtils.currentLine=786469;
 //BA.debugLineNum = 786469;BA.debugLine="UpdateClock";
_updateclock();
 };
RDebugUtils.currentLine=786472;
 //BA.debugLineNum = 786472;BA.debugLine="Log(\"Clock mode changed to: \" & IIf(isAnalogMode";
anywheresoftware.b4a.keywords.Common.LogImpl("2786472","Clock mode changed to: "+BA.ObjectToString(((_isanalogmode) ? ((Object)("Analog")) : ((Object)("Digital")))),0);
 } 
       catch (Exception e23) {
			ba.setLastException(e23);RDebugUtils.currentLine=786474;
 //BA.debugLineNum = 786474;BA.debugLine="Log(\"Clock mode error: \" & LastException.Message";
anywheresoftware.b4a.keywords.Common.LogImpl("2786474","Clock mode error: "+anywheresoftware.b4a.keywords.Common.LastException(ba).getMessage(),0);
 };
RDebugUtils.currentLine=786476;
 //BA.debugLineNum = 786476;BA.debugLine="End Sub";
return "";
}
public static String  _drawanalogclock() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "drawanalogclock", false))
	 {return ((String) Debug.delegate(ba, "drawanalogclock", null));}
long _now = 0L;
int _hour = 0;
int _minute = 0;
int _second = 0;
double _size = 0;
double _center = 0;
double _radius = 0;
anywheresoftware.b4a.objects.B4XCanvas.B4XRect _rect = null;
anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont _textfont = null;
int _i = 0;
double _angle = 0;
double _x = 0;
double _y = 0;
double _hourangle = 0;
double _minuteangle = 0;
double _secondangle = 0;
double _hourx = 0;
double _houry = 0;
double _minutex = 0;
double _minutey = 0;
double _secondx = 0;
double _secondy = 0;
RDebugUtils.currentLine=524288;
 //BA.debugLineNum = 524288;BA.debugLine="Sub DrawAnalogClock";
RDebugUtils.currentLine=524289;
 //BA.debugLineNum = 524289;BA.debugLine="Try";
try {RDebugUtils.currentLine=524290;
 //BA.debugLineNum = 524290;BA.debugLine="Dim now As Long = DateTime.Now";
_now = anywheresoftware.b4a.keywords.Common.DateTime.getNow();
RDebugUtils.currentLine=524291;
 //BA.debugLineNum = 524291;BA.debugLine="Dim hour As Int = DateTime.GetHour(now)";
_hour = anywheresoftware.b4a.keywords.Common.DateTime.GetHour(_now);
RDebugUtils.currentLine=524292;
 //BA.debugLineNum = 524292;BA.debugLine="Dim minute As Int = DateTime.GetMinute(now)";
_minute = anywheresoftware.b4a.keywords.Common.DateTime.GetMinute(_now);
RDebugUtils.currentLine=524293;
 //BA.debugLineNum = 524293;BA.debugLine="Dim second As Int = DateTime.GetSecond(now)";
_second = anywheresoftware.b4a.keywords.Common.DateTime.GetSecond(_now);
RDebugUtils.currentLine=524296;
 //BA.debugLineNum = 524296;BA.debugLine="Dim size As Double = pnlAnalogClock.prefWidth";
_size = _pnlanalogclock.getPrefWidth();
RDebugUtils.currentLine=524297;
 //BA.debugLineNum = 524297;BA.debugLine="Dim center As Double = size / 2";
_center = _size/(double)2;
RDebugUtils.currentLine=524298;
 //BA.debugLineNum = 524298;BA.debugLine="Dim radius As Double = center - 10";
_radius = _center-10;
RDebugUtils.currentLine=524301;
 //BA.debugLineNum = 524301;BA.debugLine="Dim rect As B4XRect";
_rect = new anywheresoftware.b4a.objects.B4XCanvas.B4XRect();
RDebugUtils.currentLine=524302;
 //BA.debugLineNum = 524302;BA.debugLine="rect.Initialize(0, 0, size, size)";
_rect.Initialize((float) (0),(float) (0),(float) (_size),(float) (_size));
RDebugUtils.currentLine=524303;
 //BA.debugLineNum = 524303;BA.debugLine="cvsAnalogClock.ClearRect(rect)";
_cvsanalogclock.ClearRect(_rect);
RDebugUtils.currentLine=524306;
 //BA.debugLineNum = 524306;BA.debugLine="cvsAnalogClock.DrawCircle(center, center, radius";
_cvsanalogclock.DrawCircle((float) (_center),(float) (_center),(float) (_radius),_xui.Color_ARGB((int) (180),(int) (0),(int) (0),(int) (0)),anywheresoftware.b4a.keywords.Common.True,(float) (0));
RDebugUtils.currentLine=524307;
 //BA.debugLineNum = 524307;BA.debugLine="cvsAnalogClock.DrawCircle(center, center, radius";
_cvsanalogclock.DrawCircle((float) (_center),(float) (_center),(float) (_radius),_currentclockcolor,anywheresoftware.b4a.keywords.Common.False,(float) (3));
RDebugUtils.currentLine=524310;
 //BA.debugLineNum = 524310;BA.debugLine="Dim textFont As B4XFont = xui.CreateDefaultFont(";
_textfont = new anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont();
_textfont = _xui.CreateDefaultFont((float) (_size*0.045));
RDebugUtils.currentLine=524311;
 //BA.debugLineNum = 524311;BA.debugLine="For i = 1 To 12";
{
final int step15 = 1;
final int limit15 = (int) (12);
_i = (int) (1) ;
for (;_i <= limit15 ;_i = _i + step15 ) {
RDebugUtils.currentLine=524312;
 //BA.debugLineNum = 524312;BA.debugLine="Dim angle As Double = cPI / 6 * (i - 3)";
_angle = anywheresoftware.b4a.keywords.Common.cPI/(double)6*(_i-3);
RDebugUtils.currentLine=524313;
 //BA.debugLineNum = 524313;BA.debugLine="Dim x As Double = center + Cos(angle) * (radius";
_x = _center+anywheresoftware.b4a.keywords.Common.Cos(_angle)*(_radius*0.75);
RDebugUtils.currentLine=524314;
 //BA.debugLineNum = 524314;BA.debugLine="Dim y As Double = center + Sin(angle) * (radius";
_y = _center+anywheresoftware.b4a.keywords.Common.Sin(_angle)*(_radius*0.75);
RDebugUtils.currentLine=524315;
 //BA.debugLineNum = 524315;BA.debugLine="cvsAnalogClock.DrawText(i, x, y, textFont, curr";
_cvsanalogclock.DrawText(BA.NumberToString(_i),_x,_y,_textfont,_currentclockcolor,BA.getEnumFromString(javafx.scene.text.TextAlignment.class,"CENTER"));
 }
};
RDebugUtils.currentLine=524319;
 //BA.debugLineNum = 524319;BA.debugLine="cvsAnalogClock.DrawCircle(center, center, size *";
_cvsanalogclock.DrawCircle((float) (_center),(float) (_center),(float) (_size*0.02),_currentclockcolor,anywheresoftware.b4a.keywords.Common.True,(float) (0));
RDebugUtils.currentLine=524322;
 //BA.debugLineNum = 524322;BA.debugLine="hour = hour Mod 12";
_hour = (int) (_hour%12);
RDebugUtils.currentLine=524323;
 //BA.debugLineNum = 524323;BA.debugLine="Dim hourAngle As Double = (cPI / 6) * hour + (cP";
_hourangle = (anywheresoftware.b4a.keywords.Common.cPI/(double)6)*_hour+(anywheresoftware.b4a.keywords.Common.cPI/(double)360)*_minute-anywheresoftware.b4a.keywords.Common.cPI/(double)2;
RDebugUtils.currentLine=524324;
 //BA.debugLineNum = 524324;BA.debugLine="Dim minuteAngle As Double = (cPI / 30) * minute";
_minuteangle = (anywheresoftware.b4a.keywords.Common.cPI/(double)30)*_minute+(anywheresoftware.b4a.keywords.Common.cPI/(double)1800)*_second-anywheresoftware.b4a.keywords.Common.cPI/(double)2;
RDebugUtils.currentLine=524325;
 //BA.debugLineNum = 524325;BA.debugLine="Dim secondAngle As Double = (cPI / 30) * second";
_secondangle = (anywheresoftware.b4a.keywords.Common.cPI/(double)30)*_second-anywheresoftware.b4a.keywords.Common.cPI/(double)2;
RDebugUtils.currentLine=524328;
 //BA.debugLineNum = 524328;BA.debugLine="Dim hourX As Double = center + Cos(hourAngle) *";
_hourx = _center+anywheresoftware.b4a.keywords.Common.Cos(_hourangle)*(_radius*0.4);
RDebugUtils.currentLine=524329;
 //BA.debugLineNum = 524329;BA.debugLine="Dim hourY As Double = center + Sin(hourAngle) *";
_houry = _center+anywheresoftware.b4a.keywords.Common.Sin(_hourangle)*(_radius*0.4);
RDebugUtils.currentLine=524330;
 //BA.debugLineNum = 524330;BA.debugLine="cvsAnalogClock.DrawLine(center, center, hourX, h";
_cvsanalogclock.DrawLine((float) (_center),(float) (_center),(float) (_hourx),(float) (_houry),_currentclockcolor,(float) (anywheresoftware.b4a.keywords.Common.Max(2,_size*0.015)));
RDebugUtils.currentLine=524332;
 //BA.debugLineNum = 524332;BA.debugLine="Dim minuteX As Double = center + Cos(minuteAngle";
_minutex = _center+anywheresoftware.b4a.keywords.Common.Cos(_minuteangle)*(_radius*0.65);
RDebugUtils.currentLine=524333;
 //BA.debugLineNum = 524333;BA.debugLine="Dim minuteY As Double = center + Sin(minuteAngle";
_minutey = _center+anywheresoftware.b4a.keywords.Common.Sin(_minuteangle)*(_radius*0.65);
RDebugUtils.currentLine=524334;
 //BA.debugLineNum = 524334;BA.debugLine="cvsAnalogClock.DrawLine(center, center, minuteX,";
_cvsanalogclock.DrawLine((float) (_center),(float) (_center),(float) (_minutex),(float) (_minutey),_currentclockcolor,(float) (anywheresoftware.b4a.keywords.Common.Max(2,_size*0.01)));
RDebugUtils.currentLine=524336;
 //BA.debugLineNum = 524336;BA.debugLine="Dim secondX As Double = center + Cos(secondAngle";
_secondx = _center+anywheresoftware.b4a.keywords.Common.Cos(_secondangle)*(_radius*0.75);
RDebugUtils.currentLine=524337;
 //BA.debugLineNum = 524337;BA.debugLine="Dim secondY As Double = center + Sin(secondAngle";
_secondy = _center+anywheresoftware.b4a.keywords.Common.Sin(_secondangle)*(_radius*0.75);
RDebugUtils.currentLine=524338;
 //BA.debugLineNum = 524338;BA.debugLine="cvsAnalogClock.DrawLine(center, center, secondX,";
_cvsanalogclock.DrawLine((float) (_center),(float) (_center),(float) (_secondx),(float) (_secondy),_xui.Color_RGB((int) (255),(int) (0),(int) (0)),(float) (anywheresoftware.b4a.keywords.Common.Max(1,_size*0.005)));
RDebugUtils.currentLine=524341;
 //BA.debugLineNum = 524341;BA.debugLine="cvsAnalogClock.Invalidate";
_cvsanalogclock.Invalidate();
 } 
       catch (Exception e37) {
			ba.setLastException(e37);RDebugUtils.currentLine=524343;
 //BA.debugLineNum = 524343;BA.debugLine="Log(\"Analog draw error: \" & LastException.Messag";
anywheresoftware.b4a.keywords.Common.LogImpl("2524343","Analog draw error: "+anywheresoftware.b4a.keywords.Common.LastException(ba).getMessage(),0);
 };
RDebugUtils.currentLine=524345;
 //BA.debugLineNum = 524345;BA.debugLine="End Sub";
return "";
}
public static String  _btnimagetimer_click() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "btnimagetimer_click", false))
	 {return ((String) Debug.delegate(ba, "btnimagetimer_click", null));}
RDebugUtils.currentLine=917504;
 //BA.debugLineNum = 917504;BA.debugLine="Sub btnImageTimer_Click";
RDebugUtils.currentLine=917505;
 //BA.debugLineNum = 917505;BA.debugLine="currentImageInterval = (currentImageInterval + 1)";
_currentimageinterval = (int) ((_currentimageinterval+1)%_imageintervals.getSize());
RDebugUtils.currentLine=917506;
 //BA.debugLineNum = 917506;BA.debugLine="btnImageTimer.Text = \"⏱️ \" & imageIntervalNames.G";
_btnimagetimer.setText("⏱️ "+BA.ObjectToString(_imageintervalnames.Get(_currentimageinterval)));
RDebugUtils.currentLine=917507;
 //BA.debugLineNum = 917507;BA.debugLine="If currentImageInterval = 0 Then";
if (_currentimageinterval==0) { 
RDebugUtils.currentLine=917508;
 //BA.debugLineNum = 917508;BA.debugLine="timImageChange.Enabled = False";
_timimagechange.setEnabled(anywheresoftware.b4a.keywords.Common.False);
 }else {
RDebugUtils.currentLine=917510;
 //BA.debugLineNum = 917510;BA.debugLine="timImageChange.Enabled = True";
_timimagechange.setEnabled(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=917511;
 //BA.debugLineNum = 917511;BA.debugLine="lastImageChangeTime = DateTime.Now / 1000";
_lastimagechangetime = (long) (anywheresoftware.b4a.keywords.Common.DateTime.getNow()/(double)1000);
 };
RDebugUtils.currentLine=917513;
 //BA.debugLineNum = 917513;BA.debugLine="End Sub";
return "";
}
public static String  _btninfopanel_click() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "btninfopanel_click", false))
	 {return ((String) Debug.delegate(ba, "btninfopanel_click", null));}
RDebugUtils.currentLine=7733248;
 //BA.debugLineNum = 7733248;BA.debugLine="Sub btnInfoPanel_Click";
RDebugUtils.currentLine=7733249;
 //BA.debugLineNum = 7733249;BA.debugLine="Try";
try {RDebugUtils.currentLine=7733250;
 //BA.debugLineNum = 7733250;BA.debugLine="showInfoPanel = Not(showInfoPanel)";
_showinfopanel = anywheresoftware.b4a.keywords.Common.Not(_showinfopanel);
RDebugUtils.currentLine=7733251;
 //BA.debugLineNum = 7733251;BA.debugLine="pnlInfoOverlay.Visible = showInfoPanel";
_pnlinfooverlay.setVisible(_showinfopanel);
RDebugUtils.currentLine=7733253;
 //BA.debugLineNum = 7733253;BA.debugLine="If showInfoPanel Then";
if (_showinfopanel) { 
RDebugUtils.currentLine=7733254;
 //BA.debugLineNum = 7733254;BA.debugLine="btnInfoPanel.Text = \"📋 Info\"";
_btninfopanel.setText("📋 Info");
 }else {
RDebugUtils.currentLine=7733256;
 //BA.debugLineNum = 7733256;BA.debugLine="btnInfoPanel.Text = \"📋 Show\"";
_btninfopanel.setText("📋 Show");
 };
RDebugUtils.currentLine=7733260;
 //BA.debugLineNum = 7733260;BA.debugLine="CenterAllElements";
_centerallelements();
RDebugUtils.currentLine=7733263;
 //BA.debugLineNum = 7733263;BA.debugLine="If isAnalogMode Then";
if (_isanalogmode) { 
RDebugUtils.currentLine=7733264;
 //BA.debugLineNum = 7733264;BA.debugLine="DrawAnalogClock";
_drawanalogclock();
 };
RDebugUtils.currentLine=7733267;
 //BA.debugLineNum = 7733267;BA.debugLine="Log(\"Info panel toggled: \" & showInfoPanel)";
anywheresoftware.b4a.keywords.Common.LogImpl("27733267","Info panel toggled: "+BA.ObjectToString(_showinfopanel),0);
 } 
       catch (Exception e15) {
			ba.setLastException(e15);RDebugUtils.currentLine=7733269;
 //BA.debugLineNum = 7733269;BA.debugLine="Log(\"Info panel toggle error: \" & LastException.";
anywheresoftware.b4a.keywords.Common.LogImpl("27733269","Info panel toggle error: "+anywheresoftware.b4a.keywords.Common.LastException(ba).getMessage(),0);
 };
RDebugUtils.currentLine=7733271;
 //BA.debugLineNum = 7733271;BA.debugLine="End Sub";
return "";
}
public static String  _btnlanguage_click() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "btnlanguage_click", false))
	 {return ((String) Debug.delegate(ba, "btnlanguage_click", null));}
anywheresoftware.b4a.objects.collections.List _prayernames = null;
int _i = 0;
anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper _pnlcard = null;
anywheresoftware.b4j.objects.LabelWrapper _lblname = null;
RDebugUtils.currentLine=5701632;
 //BA.debugLineNum = 5701632;BA.debugLine="Sub btnLanguage_Click";
RDebugUtils.currentLine=5701633;
 //BA.debugLineNum = 5701633;BA.debugLine="Try";
try {RDebugUtils.currentLine=5701634;
 //BA.debugLineNum = 5701634;BA.debugLine="Select currentLanguage";
switch (BA.switchObjectToInt(_currentlanguage,"en","fr","ar")) {
case 0: {
RDebugUtils.currentLine=5701636;
 //BA.debugLineNum = 5701636;BA.debugLine="currentLanguage = \"fr\"";
_currentlanguage = "fr";
RDebugUtils.currentLine=5701637;
 //BA.debugLineNum = 5701637;BA.debugLine="btnLanguage.Text = \"🌐 FR\"";
_btnlanguage.setText("🌐 FR");
 break; }
case 1: {
RDebugUtils.currentLine=5701639;
 //BA.debugLineNum = 5701639;BA.debugLine="currentLanguage = \"ar\"";
_currentlanguage = "ar";
RDebugUtils.currentLine=5701640;
 //BA.debugLineNum = 5701640;BA.debugLine="btnLanguage.Text = \"🌐 AR\"";
_btnlanguage.setText("🌐 AR");
 break; }
case 2: {
RDebugUtils.currentLine=5701642;
 //BA.debugLineNum = 5701642;BA.debugLine="currentLanguage = \"en\"";
_currentlanguage = "en";
RDebugUtils.currentLine=5701643;
 //BA.debugLineNum = 5701643;BA.debugLine="btnLanguage.Text = \"🌐 EN\"";
_btnlanguage.setText("🌐 EN");
 break; }
}
;
RDebugUtils.currentLine=5701646;
 //BA.debugLineNum = 5701646;BA.debugLine="FetchPrayerTimes";
_fetchprayertimes();
RDebugUtils.currentLine=5701647;
 //BA.debugLineNum = 5701647;BA.debugLine="UpdateClock";
_updateclock();
RDebugUtils.currentLine=5701650;
 //BA.debugLineNum = 5701650;BA.debugLine="Dim prayerNames As List = Array As String(\"fajr\"";
_prayernames = new anywheresoftware.b4a.objects.collections.List();
_prayernames = anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{"fajr","sunrise","dhuhr","asr","maghrib","isha"});
RDebugUtils.currentLine=5701651;
 //BA.debugLineNum = 5701651;BA.debugLine="For i = 0 To 5";
{
final int step16 = 1;
final int limit16 = (int) (5);
_i = (int) (0) ;
for (;_i <= limit16 ;_i = _i + step16 ) {
RDebugUtils.currentLine=5701652;
 //BA.debugLineNum = 5701652;BA.debugLine="If pnlPrayerCards.NumberOfNodes > 0 Then";
if (_pnlprayercards.getNumberOfNodes()>0) { 
RDebugUtils.currentLine=5701653;
 //BA.debugLineNum = 5701653;BA.debugLine="Dim pnlCard As Pane = pnlPrayerCards.GetNode(i";
_pnlcard = new anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper();
_pnlcard = (anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper(), (javafx.scene.layout.Pane)(_pnlprayercards.GetNode(_i).getObject()));
RDebugUtils.currentLine=5701654;
 //BA.debugLineNum = 5701654;BA.debugLine="If pnlCard.NumberOfNodes > 1 Then";
if (_pnlcard.getNumberOfNodes()>1) { 
RDebugUtils.currentLine=5701655;
 //BA.debugLineNum = 5701655;BA.debugLine="Dim lblName As Label = pnlCard.GetNode(1)";
_lblname = new anywheresoftware.b4j.objects.LabelWrapper();
_lblname = (anywheresoftware.b4j.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.LabelWrapper(), (javafx.scene.control.Label)(_pnlcard.GetNode((int) (1)).getObject()));
RDebugUtils.currentLine=5701656;
 //BA.debugLineNum = 5701656;BA.debugLine="lblName.Text = GetTranslation(prayerNames.Get";
_lblname.setText(_gettranslation(BA.ObjectToString(_prayernames.Get(_i))));
 };
 };
 }
};
RDebugUtils.currentLine=5701661;
 //BA.debugLineNum = 5701661;BA.debugLine="Log(\"Language changed to: \" & currentLanguage)";
anywheresoftware.b4a.keywords.Common.LogImpl("25701661","Language changed to: "+_currentlanguage,0);
 } 
       catch (Exception e27) {
			ba.setLastException(e27);RDebugUtils.currentLine=5701663;
 //BA.debugLineNum = 5701663;BA.debugLine="Log(\"Language switch error: \" & LastException.Me";
anywheresoftware.b4a.keywords.Common.LogImpl("25701663","Language switch error: "+anywheresoftware.b4a.keywords.Common.LastException(ba).getMessage(),0);
 };
RDebugUtils.currentLine=5701665;
 //BA.debugLineNum = 5701665;BA.debugLine="End Sub";
return "";
}
public static String  _btnprayertoggle_click() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "btnprayertoggle_click", false))
	 {return ((String) Debug.delegate(ba, "btnprayertoggle_click", null));}
RDebugUtils.currentLine=5636096;
 //BA.debugLineNum = 5636096;BA.debugLine="Sub btnPrayerToggle_Click";
RDebugUtils.currentLine=5636097;
 //BA.debugLineNum = 5636097;BA.debugLine="Try";
try {RDebugUtils.currentLine=5636098;
 //BA.debugLineNum = 5636098;BA.debugLine="showPrayerTimes = Not(showPrayerTimes)";
_showprayertimes = anywheresoftware.b4a.keywords.Common.Not(_showprayertimes);
RDebugUtils.currentLine=5636099;
 //BA.debugLineNum = 5636099;BA.debugLine="pnlPrayerCards.Visible = showPrayerTimes";
_pnlprayercards.setVisible(_showprayertimes);
RDebugUtils.currentLine=5636100;
 //BA.debugLineNum = 5636100;BA.debugLine="If showPrayerTimes Then";
if (_showprayertimes) { 
RDebugUtils.currentLine=5636101;
 //BA.debugLineNum = 5636101;BA.debugLine="btnPrayerToggle.Text = \"🕌 Prayer ON\"";
_btnprayertoggle.setText("🕌 Prayer ON");
 }else {
RDebugUtils.currentLine=5636103;
 //BA.debugLineNum = 5636103;BA.debugLine="btnPrayerToggle.Text = \"🕌 Prayer OFF\"";
_btnprayertoggle.setText("🕌 Prayer OFF");
 };
RDebugUtils.currentLine=5636105;
 //BA.debugLineNum = 5636105;BA.debugLine="Log(\"Prayer times visibility: \" & showPrayerTime";
anywheresoftware.b4a.keywords.Common.LogImpl("25636105","Prayer times visibility: "+BA.ObjectToString(_showprayertimes),0);
 } 
       catch (Exception e11) {
			ba.setLastException(e11);RDebugUtils.currentLine=5636107;
 //BA.debugLineNum = 5636107;BA.debugLine="Log(\"Prayer toggle error: \" & LastException.Mess";
anywheresoftware.b4a.keywords.Common.LogImpl("25636107","Prayer toggle error: "+anywheresoftware.b4a.keywords.Common.LastException(ba).getMessage(),0);
 };
RDebugUtils.currentLine=5636109;
 //BA.debugLineNum = 5636109;BA.debugLine="End Sub";
return "";
}
public static String  _btnsettings_click() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "btnsettings_click", false))
	 {return ((String) Debug.delegate(ba, "btnsettings_click", null));}
RDebugUtils.currentLine=720896;
 //BA.debugLineNum = 720896;BA.debugLine="Sub btnSettings_Click";
RDebugUtils.currentLine=720897;
 //BA.debugLineNum = 720897;BA.debugLine="settingsVisible = Not(settingsVisible)";
_settingsvisible = anywheresoftware.b4a.keywords.Common.Not(_settingsvisible);
RDebugUtils.currentLine=720898;
 //BA.debugLineNum = 720898;BA.debugLine="pnlSettings.Visible = settingsVisible";
_pnlsettings.setVisible(_settingsvisible);
RDebugUtils.currentLine=720899;
 //BA.debugLineNum = 720899;BA.debugLine="End Sub";
return "";
}
public static String  _btntheme_click() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "btntheme_click", false))
	 {return ((String) Debug.delegate(ba, "btntheme_click", null));}
anywheresoftware.b4a.objects.collections.Map _scheme = null;
String _themename = "";
Object _themepaint = null;
int _themeint = 0;
int _r = 0;
int _g = 0;
int _b = 0;
RDebugUtils.currentLine=851968;
 //BA.debugLineNum = 851968;BA.debugLine="Sub btnTheme_Click";
RDebugUtils.currentLine=851969;
 //BA.debugLineNum = 851969;BA.debugLine="currentThemeIndex = (currentThemeIndex + 1) Mod c";
_currentthemeindex = (int) ((_currentthemeindex+1)%_colorschemes.getSize());
RDebugUtils.currentLine=851970;
 //BA.debugLineNum = 851970;BA.debugLine="Dim scheme As Map = colorSchemes.Get(currentTheme";
_scheme = new anywheresoftware.b4a.objects.collections.Map();
_scheme = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_colorschemes.Get(_currentthemeindex)));
RDebugUtils.currentLine=851971;
 //BA.debugLineNum = 851971;BA.debugLine="Dim themeName As String = scheme.Get(\"name\")";
_themename = BA.ObjectToString(_scheme.Get((Object)("name")));
RDebugUtils.currentLine=851972;
 //BA.debugLineNum = 851972;BA.debugLine="Dim themePaint As Object = scheme.Get(\"paint\")";
_themepaint = _scheme.Get((Object)("paint"));
RDebugUtils.currentLine=851973;
 //BA.debugLineNum = 851973;BA.debugLine="Dim themeInt As Int = scheme.Get(\"int\")";
_themeint = (int)(BA.ObjectToNumber(_scheme.Get((Object)("int"))));
RDebugUtils.currentLine=851975;
 //BA.debugLineNum = 851975;BA.debugLine="If themeName = \"Random\" Then";
if ((_themename).equals("Random")) { 
RDebugUtils.currentLine=851976;
 //BA.debugLineNum = 851976;BA.debugLine="Dim r As Int = Rnd(0, 256)";
_r = anywheresoftware.b4a.keywords.Common.Rnd((int) (0),(int) (256));
RDebugUtils.currentLine=851977;
 //BA.debugLineNum = 851977;BA.debugLine="Dim g As Int = Rnd(0, 256)";
_g = anywheresoftware.b4a.keywords.Common.Rnd((int) (0),(int) (256));
RDebugUtils.currentLine=851978;
 //BA.debugLineNum = 851978;BA.debugLine="Dim b As Int = Rnd(0, 256)";
_b = anywheresoftware.b4a.keywords.Common.Rnd((int) (0),(int) (256));
RDebugUtils.currentLine=851979;
 //BA.debugLineNum = 851979;BA.debugLine="themePaint = fx.Colors.RGB(r, g, b)";
_themepaint = (Object)(_fx.Colors.RGB(_r,_g,_b));
RDebugUtils.currentLine=851980;
 //BA.debugLineNum = 851980;BA.debugLine="themeInt = xui.Color_RGB(r, g, b)";
_themeint = _xui.Color_RGB(_r,_g,_b);
 };
RDebugUtils.currentLine=851983;
 //BA.debugLineNum = 851983;BA.debugLine="lblClock.TextColor = themePaint";
_lblclock.setTextColor((javafx.scene.paint.Paint)(_themepaint));
RDebugUtils.currentLine=851984;
 //BA.debugLineNum = 851984;BA.debugLine="currentClockColor = themeInt";
_currentclockcolor = _themeint;
RDebugUtils.currentLine=851985;
 //BA.debugLineNum = 851985;BA.debugLine="btnTheme.Text = \"🎨 \" & themeName";
_btntheme.setText("🎨 "+_themename);
RDebugUtils.currentLine=851986;
 //BA.debugLineNum = 851986;BA.debugLine="End Sub";
return "";
}
public static String  _clearallclocks() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "clearallclocks", false))
	 {return ((String) Debug.delegate(ba, "clearallclocks", null));}
anywheresoftware.b4a.objects.B4XCanvas.B4XRect _rect = null;
RDebugUtils.currentLine=7864320;
 //BA.debugLineNum = 7864320;BA.debugLine="Sub ClearAllClocks";
RDebugUtils.currentLine=7864321;
 //BA.debugLineNum = 7864321;BA.debugLine="Try";
try {RDebugUtils.currentLine=7864323;
 //BA.debugLineNum = 7864323;BA.debugLine="lblClock.Text = \"\"";
_lblclock.setText("");
RDebugUtils.currentLine=7864326;
 //BA.debugLineNum = 7864326;BA.debugLine="Try";
try {RDebugUtils.currentLine=7864327;
 //BA.debugLineNum = 7864327;BA.debugLine="Dim rect As B4XRect";
_rect = new anywheresoftware.b4a.objects.B4XCanvas.B4XRect();
RDebugUtils.currentLine=7864328;
 //BA.debugLineNum = 7864328;BA.debugLine="rect.Initialize(0, 0, pnlAnalogClock.prefWidth,";
_rect.Initialize((float) (0),(float) (0),(float) (_pnlanalogclock.getPrefWidth()),(float) (_pnlanalogclock.getPrefHeight()));
RDebugUtils.currentLine=7864329;
 //BA.debugLineNum = 7864329;BA.debugLine="cvsAnalogClock.ClearRect(rect)";
_cvsanalogclock.ClearRect(_rect);
RDebugUtils.currentLine=7864330;
 //BA.debugLineNum = 7864330;BA.debugLine="cvsAnalogClock.Invalidate";
_cvsanalogclock.Invalidate();
 } 
       catch (Exception e9) {
			ba.setLastException(e9); };
RDebugUtils.currentLine=7864335;
 //BA.debugLineNum = 7864335;BA.debugLine="Log(\"All clocks cleared\")";
anywheresoftware.b4a.keywords.Common.LogImpl("27864335","All clocks cleared",0);
 } 
       catch (Exception e12) {
			ba.setLastException(e12);RDebugUtils.currentLine=7864337;
 //BA.debugLineNum = 7864337;BA.debugLine="Log(\"ClearAllClocks error: \" & LastException.Mes";
anywheresoftware.b4a.keywords.Common.LogImpl("27864337","ClearAllClocks error: "+anywheresoftware.b4a.keywords.Common.LastException(ba).getMessage(),0);
 };
RDebugUtils.currentLine=7864339;
 //BA.debugLineNum = 7864339;BA.debugLine="End Sub";
return "";
}
public static String  _recreatescaledprayercards(double _availablewidth) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "recreatescaledprayercards", false))
	 {return ((String) Debug.delegate(ba, "recreatescaledprayercards", new Object[] {_availablewidth}));}
anywheresoftware.b4a.objects.collections.List _prayernames = null;
anywheresoftware.b4a.objects.collections.List _prayericons = null;
int _spacing = 0;
int _cardwidth = 0;
int _i = 0;
anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper _pnlcard = null;
anywheresoftware.b4j.objects.LabelWrapper _lblicon = null;
anywheresoftware.b4j.objects.LabelWrapper _lblname = null;
anywheresoftware.b4j.objects.LabelWrapper _lbltime = null;
RDebugUtils.currentLine=7798784;
 //BA.debugLineNum = 7798784;BA.debugLine="Sub RecreateScaledPrayerCards(availableWidth As Do";
RDebugUtils.currentLine=7798785;
 //BA.debugLineNum = 7798785;BA.debugLine="Try";
try {RDebugUtils.currentLine=7798787;
 //BA.debugLineNum = 7798787;BA.debugLine="pnlPrayerCards.RemoveAllNodes";
_pnlprayercards.RemoveAllNodes();
RDebugUtils.currentLine=7798789;
 //BA.debugLineNum = 7798789;BA.debugLine="Dim prayerNames As List = Array As String(\"fajr\"";
_prayernames = new anywheresoftware.b4a.objects.collections.List();
_prayernames = anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{"fajr","sunrise","dhuhr","asr","maghrib","isha"});
RDebugUtils.currentLine=7798790;
 //BA.debugLineNum = 7798790;BA.debugLine="Dim prayerIcons As List = Array As String(\"🌅\",";
_prayericons = new anywheresoftware.b4a.objects.collections.List();
_prayericons = anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{"🌅","☀️","🌞","🌤️","🌆","🌙"});
RDebugUtils.currentLine=7798793;
 //BA.debugLineNum = 7798793;BA.debugLine="Dim spacing As Int = 10";
_spacing = (int) (10);
RDebugUtils.currentLine=7798794;
 //BA.debugLineNum = 7798794;BA.debugLine="Dim cardWidth As Int = Floor((availableWidth - (";
_cardwidth = (int) (anywheresoftware.b4a.keywords.Common.Floor((_availablewidth-(5*_spacing))/(double)6));
RDebugUtils.currentLine=7798796;
 //BA.debugLineNum = 7798796;BA.debugLine="For i = 0 To 5";
{
final int step7 = 1;
final int limit7 = (int) (5);
_i = (int) (0) ;
for (;_i <= limit7 ;_i = _i + step7 ) {
RDebugUtils.currentLine=7798797;
 //BA.debugLineNum = 7798797;BA.debugLine="Dim pnlCard As Pane";
_pnlcard = new anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper();
RDebugUtils.currentLine=7798798;
 //BA.debugLineNum = 7798798;BA.debugLine="pnlCard.Initialize(\"\")";
_pnlcard.Initialize(ba,"");
RDebugUtils.currentLine=7798799;
 //BA.debugLineNum = 7798799;BA.debugLine="pnlCard.Style = \"-fx-background-color: rgba(40,";
_pnlcard.setStyle("-fx-background-color: rgba(40, 40, 60, 0.8); -fx-background-radius: 10px; -fx-border-color: rgba(0, 200, 255, 0.4); -fx-border-width: 1px; -fx-border-radius: 10px;");
RDebugUtils.currentLine=7798800;
 //BA.debugLineNum = 7798800;BA.debugLine="pnlPrayerCards.AddNode(pnlCard, i * (cardWidth";
_pnlprayercards.AddNode((javafx.scene.Node)(_pnlcard.getObject()),_i*(_cardwidth+_spacing),0,_cardwidth,70);
RDebugUtils.currentLine=7798803;
 //BA.debugLineNum = 7798803;BA.debugLine="Dim lblIcon As Label";
_lblicon = new anywheresoftware.b4j.objects.LabelWrapper();
RDebugUtils.currentLine=7798804;
 //BA.debugLineNum = 7798804;BA.debugLine="lblIcon.Initialize(\"\")";
_lblicon.Initialize(ba,"");
RDebugUtils.currentLine=7798805;
 //BA.debugLineNum = 7798805;BA.debugLine="lblIcon.Text = prayerIcons.Get(i)";
_lblicon.setText(BA.ObjectToString(_prayericons.Get(_i)));
RDebugUtils.currentLine=7798806;
 //BA.debugLineNum = 7798806;BA.debugLine="lblIcon.TextSize = 20";
_lblicon.setTextSize(20);
RDebugUtils.currentLine=7798807;
 //BA.debugLineNum = 7798807;BA.debugLine="lblIcon.Alignment = \"CENTER\"";
_lblicon.setAlignment("CENTER");
RDebugUtils.currentLine=7798808;
 //BA.debugLineNum = 7798808;BA.debugLine="pnlCard.AddNode(lblIcon, 5, 5, cardWidth - 10,";
_pnlcard.AddNode((javafx.scene.Node)(_lblicon.getObject()),5,5,_cardwidth-10,25);
RDebugUtils.currentLine=7798811;
 //BA.debugLineNum = 7798811;BA.debugLine="Dim lblName As Label";
_lblname = new anywheresoftware.b4j.objects.LabelWrapper();
RDebugUtils.currentLine=7798812;
 //BA.debugLineNum = 7798812;BA.debugLine="lblName.Initialize(\"\")";
_lblname.Initialize(ba,"");
RDebugUtils.currentLine=7798813;
 //BA.debugLineNum = 7798813;BA.debugLine="lblName.Text = GetTranslation(prayerNames.Get(i";
_lblname.setText(_gettranslation(BA.ObjectToString(_prayernames.Get(_i))));
RDebugUtils.currentLine=7798814;
 //BA.debugLineNum = 7798814;BA.debugLine="lblName.TextColor = fx.Colors.RGB(200, 200, 200";
_lblname.setTextColor((javafx.scene.paint.Paint)(_fx.Colors.RGB((int) (200),(int) (200),(int) (200))));
RDebugUtils.currentLine=7798815;
 //BA.debugLineNum = 7798815;BA.debugLine="lblName.TextSize = 10";
_lblname.setTextSize(10);
RDebugUtils.currentLine=7798816;
 //BA.debugLineNum = 7798816;BA.debugLine="lblName.Style = \"-fx-font-weight: normal;\"";
_lblname.setStyle("-fx-font-weight: normal;");
RDebugUtils.currentLine=7798817;
 //BA.debugLineNum = 7798817;BA.debugLine="lblName.Alignment = \"CENTER\"";
_lblname.setAlignment("CENTER");
RDebugUtils.currentLine=7798818;
 //BA.debugLineNum = 7798818;BA.debugLine="pnlCard.AddNode(lblName, 5, 30, cardWidth - 10,";
_pnlcard.AddNode((javafx.scene.Node)(_lblname.getObject()),5,30,_cardwidth-10,15);
RDebugUtils.currentLine=7798821;
 //BA.debugLineNum = 7798821;BA.debugLine="Dim lblTime As Label";
_lbltime = new anywheresoftware.b4j.objects.LabelWrapper();
RDebugUtils.currentLine=7798822;
 //BA.debugLineNum = 7798822;BA.debugLine="lblTime.Initialize(\"\")";
_lbltime.Initialize(ba,"");
RDebugUtils.currentLine=7798823;
 //BA.debugLineNum = 7798823;BA.debugLine="lblTime.Text = \"--:--\"";
_lbltime.setText("--:--");
RDebugUtils.currentLine=7798824;
 //BA.debugLineNum = 7798824;BA.debugLine="lblTime.TextColor = fx.Colors.RGB(150, 255, 150";
_lbltime.setTextColor((javafx.scene.paint.Paint)(_fx.Colors.RGB((int) (150),(int) (255),(int) (150))));
RDebugUtils.currentLine=7798825;
 //BA.debugLineNum = 7798825;BA.debugLine="lblTime.TextSize = 14";
_lbltime.setTextSize(14);
RDebugUtils.currentLine=7798826;
 //BA.debugLineNum = 7798826;BA.debugLine="lblTime.Style = \"-fx-font-weight: bold;\"";
_lbltime.setStyle("-fx-font-weight: bold;");
RDebugUtils.currentLine=7798827;
 //BA.debugLineNum = 7798827;BA.debugLine="lblTime.Alignment = \"CENTER\"";
_lbltime.setAlignment("CENTER");
RDebugUtils.currentLine=7798828;
 //BA.debugLineNum = 7798828;BA.debugLine="pnlCard.AddNode(lblTime, 5, 45, cardWidth - 10,";
_pnlcard.AddNode((javafx.scene.Node)(_lbltime.getObject()),5,45,_cardwidth-10,20);
RDebugUtils.currentLine=7798831;
 //BA.debugLineNum = 7798831;BA.debugLine="prayerLabels.Put(prayerNames.Get(i), lblTime)";
_prayerlabels.Put(_prayernames.Get(_i),(Object)(_lbltime.getObject()));
 }
};
RDebugUtils.currentLine=7798834;
 //BA.debugLineNum = 7798834;BA.debugLine="Log(\"Prayer cards rescaled for width: \" & availa";
anywheresoftware.b4a.keywords.Common.LogImpl("27798834","Prayer cards rescaled for width: "+BA.NumberToString(_availablewidth),0);
 } 
       catch (Exception e38) {
			ba.setLastException(e38);RDebugUtils.currentLine=7798836;
 //BA.debugLineNum = 7798836;BA.debugLine="Log(\"RecreateScaledPrayerCards error: \" & LastEx";
anywheresoftware.b4a.keywords.Common.LogImpl("27798836","RecreateScaledPrayerCards error: "+anywheresoftware.b4a.keywords.Common.LastException(ba).getMessage(),0);
 };
RDebugUtils.currentLine=7798838;
 //BA.debugLineNum = 7798838;BA.debugLine="End Sub";
return "";
}
public static double  _dacos(double _x) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "dacos", false))
	 {return ((Double) Debug.delegate(ba, "dacos", new Object[] {_x}));}
RDebugUtils.currentLine=6946816;
 //BA.debugLineNum = 6946816;BA.debugLine="Sub dacos(x As Double) As Double";
RDebugUtils.currentLine=6946817;
 //BA.debugLineNum = 6946817;BA.debugLine="Return ACos(x) * 180.0 / cPI";
if (true) return anywheresoftware.b4a.keywords.Common.ACos(_x)*180.0/(double)anywheresoftware.b4a.keywords.Common.cPI;
RDebugUtils.currentLine=6946818;
 //BA.debugLineNum = 6946818;BA.debugLine="End Sub";
return 0;
}
public static double  _dasin(double _x) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "dasin", false))
	 {return ((Double) Debug.delegate(ba, "dasin", new Object[] {_x}));}
RDebugUtils.currentLine=6881280;
 //BA.debugLineNum = 6881280;BA.debugLine="Sub dasin(x As Double) As Double";
RDebugUtils.currentLine=6881281;
 //BA.debugLineNum = 6881281;BA.debugLine="Return ASin(x) * 180.0 / cPI";
if (true) return anywheresoftware.b4a.keywords.Common.ASin(_x)*180.0/(double)anywheresoftware.b4a.keywords.Common.cPI;
RDebugUtils.currentLine=6881282;
 //BA.debugLineNum = 6881282;BA.debugLine="End Sub";
return 0;
}
public static double  _datan(double _x) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "datan", false))
	 {return ((Double) Debug.delegate(ba, "datan", new Object[] {_x}));}
RDebugUtils.currentLine=7012352;
 //BA.debugLineNum = 7012352;BA.debugLine="Sub datan(x As Double) As Double";
RDebugUtils.currentLine=7012353;
 //BA.debugLineNum = 7012353;BA.debugLine="Return ATan(x) * 180.0 / cPI";
if (true) return anywheresoftware.b4a.keywords.Common.ATan(_x)*180.0/(double)anywheresoftware.b4a.keywords.Common.cPI;
RDebugUtils.currentLine=7012354;
 //BA.debugLineNum = 7012354;BA.debugLine="End Sub";
return 0;
}
public static double  _datan2(double _y,double _x) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "datan2", false))
	 {return ((Double) Debug.delegate(ba, "datan2", new Object[] {_y,_x}));}
RDebugUtils.currentLine=7077888;
 //BA.debugLineNum = 7077888;BA.debugLine="Sub datan2(y As Double, x As Double) As Double";
RDebugUtils.currentLine=7077889;
 //BA.debugLineNum = 7077889;BA.debugLine="Return ATan2(y, x) * 180.0 / cPI";
if (true) return anywheresoftware.b4a.keywords.Common.ATan2(_y,_x)*180.0/(double)anywheresoftware.b4a.keywords.Common.cPI;
RDebugUtils.currentLine=7077890;
 //BA.debugLineNum = 7077890;BA.debugLine="End Sub";
return 0;
}
public static double  _dcos(double _d) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "dcos", false))
	 {return ((Double) Debug.delegate(ba, "dcos", new Object[] {_d}));}
RDebugUtils.currentLine=6750208;
 //BA.debugLineNum = 6750208;BA.debugLine="Sub dcos(d As Double) As Double";
RDebugUtils.currentLine=6750209;
 //BA.debugLineNum = 6750209;BA.debugLine="Return Cos(d * cPI / 180.0)";
if (true) return anywheresoftware.b4a.keywords.Common.Cos(_d*anywheresoftware.b4a.keywords.Common.cPI/(double)180.0);
RDebugUtils.currentLine=6750210;
 //BA.debugLineNum = 6750210;BA.debugLine="End Sub";
return 0;
}
public static double  _dsin(double _d) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "dsin", false))
	 {return ((Double) Debug.delegate(ba, "dsin", new Object[] {_d}));}
RDebugUtils.currentLine=6684672;
 //BA.debugLineNum = 6684672;BA.debugLine="Sub dsin(d As Double) As Double";
RDebugUtils.currentLine=6684673;
 //BA.debugLineNum = 6684673;BA.debugLine="Return Sin(d * cPI / 180.0)";
if (true) return anywheresoftware.b4a.keywords.Common.Sin(_d*anywheresoftware.b4a.keywords.Common.cPI/(double)180.0);
RDebugUtils.currentLine=6684674;
 //BA.debugLineNum = 6684674;BA.debugLine="End Sub";
return 0;
}
public static double  _dtan(double _d) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "dtan", false))
	 {return ((Double) Debug.delegate(ba, "dtan", new Object[] {_d}));}
RDebugUtils.currentLine=6815744;
 //BA.debugLineNum = 6815744;BA.debugLine="Sub dtan(d As Double) As Double";
RDebugUtils.currentLine=6815745;
 //BA.debugLineNum = 6815745;BA.debugLine="Return Tan(d * cPI / 180.0)";
if (true) return anywheresoftware.b4a.keywords.Common.Tan(_d*anywheresoftware.b4a.keywords.Common.cPI/(double)180.0);
RDebugUtils.currentLine=6815746;
 //BA.debugLineNum = 6815746;BA.debugLine="End Sub";
return 0;
}
public static Object[]  _getreligious_times(int _month,int _day,double _longitude1,double _latitude1,boolean _second_show,boolean _official_time) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "getreligious_times", false))
	 {return ((Object[]) Debug.delegate(ba, "getreligious_times", new Object[] {_month,_day,_longitude1,_latitude1,_second_show,_official_time}));}
int _currentyear = 0;
double _jd = 0;
double _timezone = 0;
double _fajrangle = 0;
double _ishaangle = 0;
int _asrjuristic = 0;
double _sundecl = 0;
double _eqt = 0;
double _dhuhr = 0;
String[] _times = null;
RDebugUtils.currentLine=1441792;
 //BA.debugLineNum = 1441792;BA.debugLine="Sub GetReligious_times(Month As Int, Day As Int, l";
RDebugUtils.currentLine=1441793;
 //BA.debugLineNum = 1441793;BA.debugLine="Try";
try {RDebugUtils.currentLine=1441794;
 //BA.debugLineNum = 1441794;BA.debugLine="Dim currentYear As Int = DateTime.GetYear(DateTi";
_currentyear = anywheresoftware.b4a.keywords.Common.DateTime.GetYear(anywheresoftware.b4a.keywords.Common.DateTime.getNow());
RDebugUtils.currentLine=1441795;
 //BA.debugLineNum = 1441795;BA.debugLine="Dim jd As Double = GetJulianDate(currentYear, Mo";
_jd = _getjuliandate(_currentyear,_month,_day);
RDebugUtils.currentLine=1441796;
 //BA.debugLineNum = 1441796;BA.debugLine="Dim timezone As Double = 1.0";
_timezone = 1.0;
RDebugUtils.currentLine=1441797;
 //BA.debugLineNum = 1441797;BA.debugLine="Dim fajrAngle As Double = 18.0";
_fajrangle = 18.0;
RDebugUtils.currentLine=1441798;
 //BA.debugLineNum = 1441798;BA.debugLine="Dim ishaAngle As Double = 17.0";
_ishaangle = 17.0;
RDebugUtils.currentLine=1441799;
 //BA.debugLineNum = 1441799;BA.debugLine="Dim asrJuristic As Int = 1";
_asrjuristic = (int) (1);
RDebugUtils.currentLine=1441801;
 //BA.debugLineNum = 1441801;BA.debugLine="Dim sunDecl As Double = GetSunDeclination(jd)";
_sundecl = _getsundeclination(_jd);
RDebugUtils.currentLine=1441802;
 //BA.debugLineNum = 1441802;BA.debugLine="Dim eqt As Double = GetEquationOfTime(jd)";
_eqt = _getequationoftime(_jd);
RDebugUtils.currentLine=1441803;
 //BA.debugLineNum = 1441803;BA.debugLine="Dim dhuhr As Double = 12.0 + timezone - longitud";
_dhuhr = 12.0+_timezone-_longitude1/(double)15.0-_eqt;
RDebugUtils.currentLine=1441805;
 //BA.debugLineNum = 1441805;BA.debugLine="Dim times(6) As String";
_times = new String[(int) (6)];
java.util.Arrays.fill(_times,"");
RDebugUtils.currentLine=1441806;
 //BA.debugLineNum = 1441806;BA.debugLine="times(0) = FormatTimeFromDecimal(GetTimeForAngle";
_times[(int) (0)] = _formattimefromdecimal(_gettimeforangle(_jd,_latitude1,_longitude1,_timezone,_fajrangle,anywheresoftware.b4a.keywords.Common.True),_second_show);
RDebugUtils.currentLine=1441807;
 //BA.debugLineNum = 1441807;BA.debugLine="times(1) = FormatTimeFromDecimal(GetTimeForAngle";
_times[(int) (1)] = _formattimefromdecimal(_gettimeforangle(_jd,_latitude1,_longitude1,_timezone,0.833,anywheresoftware.b4a.keywords.Common.True),_second_show);
RDebugUtils.currentLine=1441808;
 //BA.debugLineNum = 1441808;BA.debugLine="times(2) = FormatTimeFromDecimal(dhuhr, Second_S";
_times[(int) (2)] = _formattimefromdecimal(_dhuhr,_second_show);
RDebugUtils.currentLine=1441809;
 //BA.debugLineNum = 1441809;BA.debugLine="times(3) = FormatTimeFromDecimal(GetAsrTime(jd,";
_times[(int) (3)] = _formattimefromdecimal(_getasrtime(_jd,_latitude1,_longitude1,_timezone,_asrjuristic),_second_show);
RDebugUtils.currentLine=1441810;
 //BA.debugLineNum = 1441810;BA.debugLine="times(4) = FormatTimeFromDecimal(GetTimeForAngle";
_times[(int) (4)] = _formattimefromdecimal(_gettimeforangle(_jd,_latitude1,_longitude1,_timezone,0.833,anywheresoftware.b4a.keywords.Common.False),_second_show);
RDebugUtils.currentLine=1441811;
 //BA.debugLineNum = 1441811;BA.debugLine="times(5) = FormatTimeFromDecimal(GetTimeForAngle";
_times[(int) (5)] = _formattimefromdecimal(_gettimeforangle(_jd,_latitude1,_longitude1,_timezone,_ishaangle,anywheresoftware.b4a.keywords.Common.False),_second_show);
RDebugUtils.currentLine=1441813;
 //BA.debugLineNum = 1441813;BA.debugLine="Return times";
if (true) return (Object[])(_times);
 } 
       catch (Exception e20) {
			ba.setLastException(e20);RDebugUtils.currentLine=1441815;
 //BA.debugLineNum = 1441815;BA.debugLine="Log(\"GetReligious_times error: \" & LastException";
anywheresoftware.b4a.keywords.Common.LogImpl("21441815","GetReligious_times error: "+anywheresoftware.b4a.keywords.Common.LastException(ba).getMessage(),0);
RDebugUtils.currentLine=1441816;
 //BA.debugLineNum = 1441816;BA.debugLine="Return Null";
if (true) return (Object[])(anywheresoftware.b4a.keywords.Common.Null);
 };
RDebugUtils.currentLine=1441818;
 //BA.debugLineNum = 1441818;BA.debugLine="End Sub";
return null;
}
public static String  _getweatheremoji(int _code) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "getweatheremoji", false))
	 {return ((String) Debug.delegate(ba, "getweatheremoji", new Object[] {_code}));}
RDebugUtils.currentLine=393216;
 //BA.debugLineNum = 393216;BA.debugLine="Sub GetWeatherEmoji(code As Int) As String";
RDebugUtils.currentLine=393217;
 //BA.debugLineNum = 393217;BA.debugLine="If code = 0 Then Return \"☀️\"";
if (_code==0) { 
if (true) return "☀️";};
RDebugUtils.currentLine=393218;
 //BA.debugLineNum = 393218;BA.debugLine="If code <= 3 Then Return \"🌤️\"";
if (_code<=3) { 
if (true) return "🌤️";};
RDebugUtils.currentLine=393219;
 //BA.debugLineNum = 393219;BA.debugLine="If code <= 48 Then Return \"🌫️\"";
if (_code<=48) { 
if (true) return "🌫️";};
RDebugUtils.currentLine=393220;
 //BA.debugLineNum = 393220;BA.debugLine="If code <= 67 Then Return \"🌧️\"";
if (_code<=67) { 
if (true) return "🌧️";};
RDebugUtils.currentLine=393221;
 //BA.debugLineNum = 393221;BA.debugLine="If code <= 77 Then Return \"🌨️\"";
if (_code<=77) { 
if (true) return "🌨️";};
RDebugUtils.currentLine=393222;
 //BA.debugLineNum = 393222;BA.debugLine="If code <= 99 Then Return \"⛈️\"";
if (_code<=99) { 
if (true) return "⛈️";};
RDebugUtils.currentLine=393223;
 //BA.debugLineNum = 393223;BA.debugLine="Return \"🌤️\"";
if (true) return "🌤️";
RDebugUtils.currentLine=393224;
 //BA.debugLineNum = 393224;BA.debugLine="End Sub";
return "";
}
public static double  _fixangle(double _angle) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "fixangle", false))
	 {return ((Double) Debug.delegate(ba, "fixangle", new Object[] {_angle}));}
RDebugUtils.currentLine=6553600;
 //BA.debugLineNum = 6553600;BA.debugLine="Sub FixAngle(angle As Double) As Double";
RDebugUtils.currentLine=6553601;
 //BA.debugLineNum = 6553601;BA.debugLine="angle = angle - 360.0 * Floor(angle / 360.0)";
_angle = _angle-360.0*anywheresoftware.b4a.keywords.Common.Floor(_angle/(double)360.0);
RDebugUtils.currentLine=6553602;
 //BA.debugLineNum = 6553602;BA.debugLine="If angle < 0 Then angle = angle + 360.0";
if (_angle<0) { 
_angle = _angle+360.0;};
RDebugUtils.currentLine=6553603;
 //BA.debugLineNum = 6553603;BA.debugLine="Return angle";
if (true) return _angle;
RDebugUtils.currentLine=6553604;
 //BA.debugLineNum = 6553604;BA.debugLine="End Sub";
return 0;
}
public static double  _fixhour(double _hour) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "fixhour", false))
	 {return ((Double) Debug.delegate(ba, "fixhour", new Object[] {_hour}));}
RDebugUtils.currentLine=6619136;
 //BA.debugLineNum = 6619136;BA.debugLine="Sub FixHour(hour As Double) As Double";
RDebugUtils.currentLine=6619137;
 //BA.debugLineNum = 6619137;BA.debugLine="hour = hour - 24.0 * Floor(hour / 24.0)";
_hour = _hour-24.0*anywheresoftware.b4a.keywords.Common.Floor(_hour/(double)24.0);
RDebugUtils.currentLine=6619138;
 //BA.debugLineNum = 6619138;BA.debugLine="If hour < 0 Then hour = hour + 24.0";
if (_hour<0) { 
_hour = _hour+24.0;};
RDebugUtils.currentLine=6619139;
 //BA.debugLineNum = 6619139;BA.debugLine="Return hour";
if (true) return _hour;
RDebugUtils.currentLine=6619140;
 //BA.debugLineNum = 6619140;BA.debugLine="End Sub";
return 0;
}
public static double  _fmod(double _s1,double _s2) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "fmod", false))
	 {return ((Double) Debug.delegate(ba, "fmod", new Object[] {_s1,_s2}));}
RDebugUtils.currentLine=1507328;
 //BA.debugLineNum = 1507328;BA.debugLine="Private Sub fmod(s1 As Double, s2 As Double) As Do";
RDebugUtils.currentLine=1507329;
 //BA.debugLineNum = 1507329;BA.debugLine="Return s1 Mod s2";
if (true) return _s1%_s2;
RDebugUtils.currentLine=1507330;
 //BA.debugLineNum = 1507330;BA.debugLine="End Sub";
return 0;
}
public static String  _formattimefromdecimal(double _time,boolean _showseconds) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "formattimefromdecimal", false))
	 {return ((String) Debug.delegate(ba, "formattimefromdecimal", new Object[] {_time,_showseconds}));}
int _hours = 0;
double _minutes = 0;
int _mins = 0;
int _secs = 0;
String _h = "";
String _m = "";
String _s = "";
RDebugUtils.currentLine=6422528;
 //BA.debugLineNum = 6422528;BA.debugLine="Sub FormatTimeFromDecimal(time As Double, showSeco";
RDebugUtils.currentLine=6422529;
 //BA.debugLineNum = 6422529;BA.debugLine="time = FixHour(time + 0.5 / 60.0)";
_time = _fixhour(_time+0.5/(double)60.0);
RDebugUtils.currentLine=6422530;
 //BA.debugLineNum = 6422530;BA.debugLine="Dim hours As Int = Floor(time)";
_hours = (int) (anywheresoftware.b4a.keywords.Common.Floor(_time));
RDebugUtils.currentLine=6422531;
 //BA.debugLineNum = 6422531;BA.debugLine="Dim minutes As Double = (time - hours) * 60.0";
_minutes = (_time-_hours)*60.0;
RDebugUtils.currentLine=6422532;
 //BA.debugLineNum = 6422532;BA.debugLine="Dim mins As Int = Floor(minutes)";
_mins = (int) (anywheresoftware.b4a.keywords.Common.Floor(_minutes));
RDebugUtils.currentLine=6422533;
 //BA.debugLineNum = 6422533;BA.debugLine="Dim secs As Int = Floor((minutes - mins) * 60.0)";
_secs = (int) (anywheresoftware.b4a.keywords.Common.Floor((_minutes-_mins)*60.0));
RDebugUtils.currentLine=6422534;
 //BA.debugLineNum = 6422534;BA.debugLine="Dim h As String = NumberFormat(hours, 2, 0)";
_h = anywheresoftware.b4a.keywords.Common.NumberFormat(_hours,(int) (2),(int) (0));
RDebugUtils.currentLine=6422535;
 //BA.debugLineNum = 6422535;BA.debugLine="Dim m As String = NumberFormat(mins, 2, 0)";
_m = anywheresoftware.b4a.keywords.Common.NumberFormat(_mins,(int) (2),(int) (0));
RDebugUtils.currentLine=6422536;
 //BA.debugLineNum = 6422536;BA.debugLine="If showSeconds Then";
if (_showseconds) { 
RDebugUtils.currentLine=6422537;
 //BA.debugLineNum = 6422537;BA.debugLine="Dim s As String = NumberFormat(secs, 2, 0)";
_s = anywheresoftware.b4a.keywords.Common.NumberFormat(_secs,(int) (2),(int) (0));
RDebugUtils.currentLine=6422538;
 //BA.debugLineNum = 6422538;BA.debugLine="Return h & \":\" & m & \":\" & s";
if (true) return _h+":"+_m+":"+_s;
 }else {
RDebugUtils.currentLine=6422540;
 //BA.debugLineNum = 6422540;BA.debugLine="Return h & \":\" & m";
if (true) return _h+":"+_m;
 };
RDebugUtils.currentLine=6422542;
 //BA.debugLineNum = 6422542;BA.debugLine="End Sub";
return "";
}
public static Object  _getalerttype(String _alerttype) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "getalerttype", false))
	 {return ((Object) Debug.delegate(ba, "getalerttype", new Object[] {_alerttype}));}
RDebugUtils.currentLine=8388608;
 //BA.debugLineNum = 8388608;BA.debugLine="Sub GetAlertType(alertType As String) As Object";
RDebugUtils.currentLine=8388609;
 //BA.debugLineNum = 8388609;BA.debugLine="Dim jo As JavaObject";
_jo = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=8388610;
 //BA.debugLineNum = 8388610;BA.debugLine="jo.InitializeStatic(\"javafx.scene.control.Alert.A";
_jo.InitializeStatic("javafx.scene.control.Alert.AlertType");
RDebugUtils.currentLine=8388611;
 //BA.debugLineNum = 8388611;BA.debugLine="Return jo.GetField(alertType)";
if (true) return _jo.GetField(_alerttype);
RDebugUtils.currentLine=8388612;
 //BA.debugLineNum = 8388612;BA.debugLine="End Sub";
return null;
}
public static double  _getasrtime(double _jd,double _lat,double _lng,double _timezone,int _asrfactor) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "getasrtime", false))
	 {return ((Double) Debug.delegate(ba, "getasrtime", new Object[] {_jd,_lat,_lng,_timezone,_asrfactor}));}
double _decl = 0;
double _noon = 0;
double _tanalt = 0;
double _altitude = 0;
double _angle = 0;
double _cosh = 0;
double _hourangle = 0;
double _time = 0;
RDebugUtils.currentLine=6356992;
 //BA.debugLineNum = 6356992;BA.debugLine="Sub GetAsrTime(jd As Double, lat As Double, lng As";
RDebugUtils.currentLine=6356993;
 //BA.debugLineNum = 6356993;BA.debugLine="Dim decl As Double = GetSunDeclination(jd)";
_decl = _getsundeclination(_jd);
RDebugUtils.currentLine=6356994;
 //BA.debugLineNum = 6356994;BA.debugLine="Dim noon As Double = 12.0 + timezone - lng / 15.0";
_noon = 12.0+_timezone-_lng/(double)15.0-_getequationoftime(_jd);
RDebugUtils.currentLine=6356995;
 //BA.debugLineNum = 6356995;BA.debugLine="Dim tanAlt As Double = 1.0 / (asrFactor + dtan(Ab";
_tanalt = 1.0/(double)(_asrfactor+_dtan(anywheresoftware.b4a.keywords.Common.Abs(_lat-_decl)));
RDebugUtils.currentLine=6356996;
 //BA.debugLineNum = 6356996;BA.debugLine="Dim altitude As Double = datan(tanAlt)";
_altitude = _datan(_tanalt);
RDebugUtils.currentLine=6356997;
 //BA.debugLineNum = 6356997;BA.debugLine="Dim angle As Double = 90.0 - altitude";
_angle = 90.0-_altitude;
RDebugUtils.currentLine=6356998;
 //BA.debugLineNum = 6356998;BA.debugLine="Dim cosH As Double = (dcos(angle) - dsin(decl) *";
_cosh = (_dcos(_angle)-_dsin(_decl)*_dsin(_lat))/(double)(_dcos(_decl)*_dcos(_lat));
RDebugUtils.currentLine=6356999;
 //BA.debugLineNum = 6356999;BA.debugLine="If cosH > 1.0 Then cosH = 1.0";
if (_cosh>1.0) { 
_cosh = 1.0;};
RDebugUtils.currentLine=6357000;
 //BA.debugLineNum = 6357000;BA.debugLine="If cosH < -1.0 Then cosH = -1.0";
if (_cosh<-1.0) { 
_cosh = -1.0;};
RDebugUtils.currentLine=6357001;
 //BA.debugLineNum = 6357001;BA.debugLine="Dim hourAngle As Double = dacos(cosH) / 15.0";
_hourangle = _dacos(_cosh)/(double)15.0;
RDebugUtils.currentLine=6357002;
 //BA.debugLineNum = 6357002;BA.debugLine="Dim time As Double = noon + hourAngle";
_time = _noon+_hourangle;
RDebugUtils.currentLine=6357003;
 //BA.debugLineNum = 6357003;BA.debugLine="Return time";
if (true) return _time;
RDebugUtils.currentLine=6357004;
 //BA.debugLineNum = 6357004;BA.debugLine="End Sub";
return 0;
}
public static double  _getsundeclination(double _jd) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "getsundeclination", false))
	 {return ((Double) Debug.delegate(ba, "getsundeclination", new Object[] {_jd}));}
double _d = 0;
double _g = 0;
double _q = 0;
double _l = 0;
double _e = 0;
RDebugUtils.currentLine=5963776;
 //BA.debugLineNum = 5963776;BA.debugLine="Sub GetSunDeclination(jd As Double) As Double";
RDebugUtils.currentLine=5963777;
 //BA.debugLineNum = 5963777;BA.debugLine="Dim d As Double = jd - 2451545.0";
_d = _jd-2451545.0;
RDebugUtils.currentLine=5963778;
 //BA.debugLineNum = 5963778;BA.debugLine="Dim g As Double = FixAngle(357.529 + 0.98560028 *";
_g = _fixangle(357.529+0.98560028*_d);
RDebugUtils.currentLine=5963779;
 //BA.debugLineNum = 5963779;BA.debugLine="Dim q As Double = FixAngle(280.459 + 0.98564736 *";
_q = _fixangle(280.459+0.98564736*_d);
RDebugUtils.currentLine=5963780;
 //BA.debugLineNum = 5963780;BA.debugLine="Dim L As Double = FixAngle(q + 1.915 * dsin(g) +";
_l = _fixangle(_q+1.915*_dsin(_g)+0.020*_dsin(2*_g));
RDebugUtils.currentLine=5963781;
 //BA.debugLineNum = 5963781;BA.debugLine="Dim e As Double = 23.439 - 0.00000036 * d";
_e = 23.439-0.00000036*_d;
RDebugUtils.currentLine=5963782;
 //BA.debugLineNum = 5963782;BA.debugLine="Dim D As Double = dasin(dsin(e) * dsin(L))";
_d = _dasin(_dsin(_e)*_dsin(_l));
RDebugUtils.currentLine=5963783;
 //BA.debugLineNum = 5963783;BA.debugLine="Return D";
if (true) return _d;
RDebugUtils.currentLine=5963784;
 //BA.debugLineNum = 5963784;BA.debugLine="End Sub";
return 0;
}
public static double  _getequationoftime(double _jd) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "getequationoftime", false))
	 {return ((Double) Debug.delegate(ba, "getequationoftime", new Object[] {_jd}));}
double _d = 0;
double _g = 0;
double _q = 0;
double _l = 0;
double _e = 0;
double _ra = 0;
double _eqt = 0;
RDebugUtils.currentLine=5898240;
 //BA.debugLineNum = 5898240;BA.debugLine="Sub GetEquationOfTime(jd As Double) As Double";
RDebugUtils.currentLine=5898241;
 //BA.debugLineNum = 5898241;BA.debugLine="Dim d As Double = jd - 2451545.0";
_d = _jd-2451545.0;
RDebugUtils.currentLine=5898242;
 //BA.debugLineNum = 5898242;BA.debugLine="Dim g As Double = FixAngle(357.529 + 0.98560028 *";
_g = _fixangle(357.529+0.98560028*_d);
RDebugUtils.currentLine=5898243;
 //BA.debugLineNum = 5898243;BA.debugLine="Dim q As Double = FixAngle(280.459 + 0.98564736 *";
_q = _fixangle(280.459+0.98564736*_d);
RDebugUtils.currentLine=5898244;
 //BA.debugLineNum = 5898244;BA.debugLine="Dim L As Double = FixAngle(q + 1.915 * dsin(g) +";
_l = _fixangle(_q+1.915*_dsin(_g)+0.020*_dsin(2*_g));
RDebugUtils.currentLine=5898245;
 //BA.debugLineNum = 5898245;BA.debugLine="Dim e As Double = 23.439 - 0.00000036 * d";
_e = 23.439-0.00000036*_d;
RDebugUtils.currentLine=5898246;
 //BA.debugLineNum = 5898246;BA.debugLine="Dim RA As Double = datan2(dcos(e) * dsin(L), dcos";
_ra = _datan2(_dcos(_e)*_dsin(_l),_dcos(_l))/(double)15.0;
RDebugUtils.currentLine=5898247;
 //BA.debugLineNum = 5898247;BA.debugLine="RA = FixHour(RA)";
_ra = _fixhour(_ra);
RDebugUtils.currentLine=5898248;
 //BA.debugLineNum = 5898248;BA.debugLine="Dim EqT As Double = q / 15.0 - RA";
_eqt = _q/(double)15.0-_ra;
RDebugUtils.currentLine=5898249;
 //BA.debugLineNum = 5898249;BA.debugLine="Return FixHour(EqT)";
if (true) return _fixhour(_eqt);
RDebugUtils.currentLine=5898250;
 //BA.debugLineNum = 5898250;BA.debugLine="End Sub";
return 0;
}
public static double  _getjuliandate(int _year,int _month,int _day) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "getjuliandate", false))
	 {return ((Double) Debug.delegate(ba, "getjuliandate", new Object[] {_year,_month,_day}));}
int _a = 0;
int _b = 0;
double _jd = 0;
RDebugUtils.currentLine=5832704;
 //BA.debugLineNum = 5832704;BA.debugLine="Sub GetJulianDate(year As Int, month As Int, day A";
RDebugUtils.currentLine=5832705;
 //BA.debugLineNum = 5832705;BA.debugLine="If month <= 2 Then";
if (_month<=2) { 
RDebugUtils.currentLine=5832706;
 //BA.debugLineNum = 5832706;BA.debugLine="year = year - 1";
_year = (int) (_year-1);
RDebugUtils.currentLine=5832707;
 //BA.debugLineNum = 5832707;BA.debugLine="month = month + 12";
_month = (int) (_month+12);
 };
RDebugUtils.currentLine=5832709;
 //BA.debugLineNum = 5832709;BA.debugLine="Dim A As Int = Floor(year / 100.0)";
_a = (int) (anywheresoftware.b4a.keywords.Common.Floor(_year/(double)100.0));
RDebugUtils.currentLine=5832710;
 //BA.debugLineNum = 5832710;BA.debugLine="Dim B As Int = 2 - A + Floor(A / 4.0)";
_b = (int) (2-_a+anywheresoftware.b4a.keywords.Common.Floor(_a/(double)4.0));
RDebugUtils.currentLine=5832711;
 //BA.debugLineNum = 5832711;BA.debugLine="Dim JD As Double = Floor(365.25 * (year + 4716))";
_jd = anywheresoftware.b4a.keywords.Common.Floor(365.25*(_year+4716))+anywheresoftware.b4a.keywords.Common.Floor(30.6001*(_month+1))+_day+_b-1524.5;
RDebugUtils.currentLine=5832712;
 //BA.debugLineNum = 5832712;BA.debugLine="Return JD";
if (true) return _jd;
RDebugUtils.currentLine=5832713;
 //BA.debugLineNum = 5832713;BA.debugLine="End Sub";
return 0;
}
public static double  _gettimeforangle(double _jd,double _lat,double _lng,double _timezone,double _angle,boolean _isbefore) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "gettimeforangle", false))
	 {return ((Double) Debug.delegate(ba, "gettimeforangle", new Object[] {_jd,_lat,_lng,_timezone,_angle,_isbefore}));}
double _decl = 0;
double _noon = 0;
double _cosh = 0;
double _hourangle = 0;
double _time = 0;
RDebugUtils.currentLine=7143424;
 //BA.debugLineNum = 7143424;BA.debugLine="Sub GetTimeForAngle(jd As Double, lat As Double, l";
RDebugUtils.currentLine=7143425;
 //BA.debugLineNum = 7143425;BA.debugLine="Dim decl As Double = GetSunDeclination(jd)";
_decl = _getsundeclination(_jd);
RDebugUtils.currentLine=7143426;
 //BA.debugLineNum = 7143426;BA.debugLine="Dim noon As Double = 12.0 + timezone - lng / 15.0";
_noon = 12.0+_timezone-_lng/(double)15.0-_getequationoftime(_jd);
RDebugUtils.currentLine=7143427;
 //BA.debugLineNum = 7143427;BA.debugLine="Dim cosH As Double = (dcos(90.0 + angle) - dsin(d";
_cosh = (_dcos(90.0+_angle)-_dsin(_decl)*_dsin(_lat))/(double)(_dcos(_decl)*_dcos(_lat));
RDebugUtils.currentLine=7143428;
 //BA.debugLineNum = 7143428;BA.debugLine="If cosH > 1.0 Then cosH = 1.0";
if (_cosh>1.0) { 
_cosh = 1.0;};
RDebugUtils.currentLine=7143429;
 //BA.debugLineNum = 7143429;BA.debugLine="If cosH < -1.0 Then cosH = -1.0";
if (_cosh<-1.0) { 
_cosh = -1.0;};
RDebugUtils.currentLine=7143430;
 //BA.debugLineNum = 7143430;BA.debugLine="Dim hourAngle As Double = dacos(cosH) / 15.0";
_hourangle = _dacos(_cosh)/(double)15.0;
RDebugUtils.currentLine=7143431;
 //BA.debugLineNum = 7143431;BA.debugLine="Dim time As Double";
_time = 0;
RDebugUtils.currentLine=7143432;
 //BA.debugLineNum = 7143432;BA.debugLine="If isBefore Then";
if (_isbefore) { 
RDebugUtils.currentLine=7143433;
 //BA.debugLineNum = 7143433;BA.debugLine="time = noon - hourAngle";
_time = _noon-_hourangle;
 }else {
RDebugUtils.currentLine=7143435;
 //BA.debugLineNum = 7143435;BA.debugLine="time = noon + hourAngle";
_time = _noon+_hourangle;
 };
RDebugUtils.currentLine=7143437;
 //BA.debugLineNum = 7143437;BA.debugLine="Return time";
if (true) return _time;
RDebugUtils.currentLine=7143438;
 //BA.debugLineNum = 7143438;BA.debugLine="End Sub";
return 0;
}
public static String  _globals() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "globals", false))
	 {return ((String) Debug.delegate(ba, "globals", null));}
RDebugUtils.currentLine=65536;
 //BA.debugLineNum = 65536;BA.debugLine="Sub Globals";
RDebugUtils.currentLine=65537;
 //BA.debugLineNum = 65537;BA.debugLine="End Sub";
return "";
}
public static String  _mainform_close() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "mainform_close", false))
	 {return ((String) Debug.delegate(ba, "mainform_close", null));}
RDebugUtils.currentLine=1376256;
 //BA.debugLineNum = 1376256;BA.debugLine="Sub MainForm_Close";
RDebugUtils.currentLine=1376257;
 //BA.debugLineNum = 1376257;BA.debugLine="timUpdate.Enabled = False";
_timupdate.setEnabled(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=1376258;
 //BA.debugLineNum = 1376258;BA.debugLine="timImageChange.Enabled = False";
_timimagechange.setEnabled(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=1376259;
 //BA.debugLineNum = 1376259;BA.debugLine="If job <> Null Then job.Release";
if (_job!= null) { 
_job._release /*String*/ (null);};
RDebugUtils.currentLine=1376260;
 //BA.debugLineNum = 1376260;BA.debugLine="End Sub";
return "";
}
public static String  _mainform_keypressed(int _keycode,int _modifiers) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "mainform_keypressed", false))
	 {return ((String) Debug.delegate(ba, "mainform_keypressed", new Object[] {_keycode,_modifiers}));}
Object _isfull = null;
RDebugUtils.currentLine=1310720;
 //BA.debugLineNum = 1310720;BA.debugLine="Sub MainForm_KeyPressed (KeyCode As Int, Modifiers";
RDebugUtils.currentLine=1310721;
 //BA.debugLineNum = 1310721;BA.debugLine="If KeyCode = 27 Then";
if (_keycode==27) { 
RDebugUtils.currentLine=1310722;
 //BA.debugLineNum = 1310722;BA.debugLine="MainForm.Close";
_mainform.Close();
 }else 
{RDebugUtils.currentLine=1310723;
 //BA.debugLineNum = 1310723;BA.debugLine="Else If KeyCode = 122 Then";
if (_keycode==122) { 
RDebugUtils.currentLine=1310724;
 //BA.debugLineNum = 1310724;BA.debugLine="Dim isFull As Object = jStage.RunMethod(\"isFullS";
_isfull = _jstage.RunMethod("isFullScreen",(Object[])(anywheresoftware.b4a.keywords.Common.Null));
RDebugUtils.currentLine=1310725;
 //BA.debugLineNum = 1310725;BA.debugLine="jStage.RunMethod(\"setFullScreen\", Array(Not(isFu";
_jstage.RunMethod("setFullScreen",new Object[]{(Object)(anywheresoftware.b4a.keywords.Common.Not(BA.ObjectToBoolean(_isfull)))});
RDebugUtils.currentLine=1310726;
 //BA.debugLineNum = 1310726;BA.debugLine="CenterAllElements";
_centerallelements();
 }}
;
RDebugUtils.currentLine=1310728;
 //BA.debugLineNum = 1310728;BA.debugLine="End Sub";
return "";
}
public static String  _mainform_resize(double _width,double _height) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "mainform_resize", false))
	 {return ((String) Debug.delegate(ba, "mainform_resize", new Object[] {_width,_height}));}
RDebugUtils.currentLine=1245184;
 //BA.debugLineNum = 1245184;BA.debugLine="Sub MainForm_Resize (Width As Double, Height As Do";
RDebugUtils.currentLine=1245185;
 //BA.debugLineNum = 1245185;BA.debugLine="CenterAllElements";
_centerallelements();
RDebugUtils.currentLine=1245186;
 //BA.debugLineNum = 1245186;BA.debugLine="End Sub";
return "";
}
public static String  _savesettings() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "savesettings", false))
	 {return ((String) Debug.delegate(ba, "savesettings", null));}
anywheresoftware.b4a.objects.collections.List _settings = null;
RDebugUtils.currentLine=7995392;
 //BA.debugLineNum = 7995392;BA.debugLine="Sub SaveSettings";
RDebugUtils.currentLine=7995393;
 //BA.debugLineNum = 7995393;BA.debugLine="Try";
try {RDebugUtils.currentLine=7995394;
 //BA.debugLineNum = 7995394;BA.debugLine="Dim settings As List";
_settings = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=7995395;
 //BA.debugLineNum = 7995395;BA.debugLine="settings.Initialize";
_settings.Initialize();
RDebugUtils.currentLine=7995396;
 //BA.debugLineNum = 7995396;BA.debugLine="settings.Add(cityName)";
_settings.Add((Object)(_cityname));
RDebugUtils.currentLine=7995397;
 //BA.debugLineNum = 7995397;BA.debugLine="settings.Add(latitude)";
_settings.Add((Object)(_latitude));
RDebugUtils.currentLine=7995398;
 //BA.debugLineNum = 7995398;BA.debugLine="settings.Add(longitude)";
_settings.Add((Object)(_longitude));
RDebugUtils.currentLine=7995399;
 //BA.debugLineNum = 7995399;BA.debugLine="File.WriteList(File.DirApp, settingsFile, settin";
anywheresoftware.b4a.keywords.Common.File.WriteList(anywheresoftware.b4a.keywords.Common.File.getDirApp(),_settingsfile,_settings);
RDebugUtils.currentLine=7995400;
 //BA.debugLineNum = 7995400;BA.debugLine="Log(\"Settings saved: \" & cityName & \" (\" & latit";
anywheresoftware.b4a.keywords.Common.LogImpl("27995400","Settings saved: "+_cityname+" ("+BA.NumberToString(_latitude)+", "+BA.NumberToString(_longitude)+")",0);
 } 
       catch (Exception e10) {
			ba.setLastException(e10);RDebugUtils.currentLine=7995402;
 //BA.debugLineNum = 7995402;BA.debugLine="Log(\"SaveSettings error: \" & LastException.Messa";
anywheresoftware.b4a.keywords.Common.LogImpl("27995402","SaveSettings error: "+anywheresoftware.b4a.keywords.Common.LastException(ba).getMessage(),0);
 };
RDebugUtils.currentLine=7995404;
 //BA.debugLineNum = 7995404;BA.debugLine="End Sub";
return "";
}
public static String  _showcityselectiondialog(anywheresoftware.b4a.objects.collections.List _results) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "showcityselectiondialog", false))
	 {return ((String) Debug.delegate(ba, "showcityselectiondialog", new Object[] {_results}));}
anywheresoftware.b4a.objects.collections.List _choices = null;
int _i = 0;
anywheresoftware.b4a.objects.collections.Map _city = null;
String _name = "";
String _country = "";
String _admin1 = "";
String _displayname = "";
anywheresoftware.b4j.object.JavaObject _choicedialog = null;
anywheresoftware.b4j.object.JavaObject _result = null;
boolean _ispresent = false;
String _selected = "";
int _selectedindex = 0;
RDebugUtils.currentLine=8192000;
 //BA.debugLineNum = 8192000;BA.debugLine="Sub ShowCitySelectionDialog(results As List)";
RDebugUtils.currentLine=8192001;
 //BA.debugLineNum = 8192001;BA.debugLine="Try";
try {RDebugUtils.currentLine=8192003;
 //BA.debugLineNum = 8192003;BA.debugLine="Dim choices As List";
_choices = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=8192004;
 //BA.debugLineNum = 8192004;BA.debugLine="choices.Initialize";
_choices.Initialize();
RDebugUtils.currentLine=8192006;
 //BA.debugLineNum = 8192006;BA.debugLine="For i = 0 To Min(results.Size - 1, 9) ' Show max";
{
final int step4 = 1;
final int limit4 = (int) (anywheresoftware.b4a.keywords.Common.Min(_results.getSize()-1,9));
_i = (int) (0) ;
for (;_i <= limit4 ;_i = _i + step4 ) {
RDebugUtils.currentLine=8192007;
 //BA.debugLineNum = 8192007;BA.debugLine="Dim city As Map = results.Get(i)";
_city = new anywheresoftware.b4a.objects.collections.Map();
_city = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_results.Get(_i)));
RDebugUtils.currentLine=8192008;
 //BA.debugLineNum = 8192008;BA.debugLine="Dim name As String = city.Get(\"name\")";
_name = BA.ObjectToString(_city.Get((Object)("name")));
RDebugUtils.currentLine=8192009;
 //BA.debugLineNum = 8192009;BA.debugLine="Dim country As String = city.GetDefault(\"countr";
_country = BA.ObjectToString(_city.GetDefault((Object)("country"),(Object)("")));
RDebugUtils.currentLine=8192010;
 //BA.debugLineNum = 8192010;BA.debugLine="Dim admin1 As String = city.GetDefault(\"admin1\"";
_admin1 = BA.ObjectToString(_city.GetDefault((Object)("admin1"),(Object)("")));
RDebugUtils.currentLine=8192012;
 //BA.debugLineNum = 8192012;BA.debugLine="Dim displayName As String = name";
_displayname = _name;
RDebugUtils.currentLine=8192013;
 //BA.debugLineNum = 8192013;BA.debugLine="If admin1.Length > 0 Then displayName = display";
if (_admin1.length()>0) { 
_displayname = _displayname+", "+_admin1;};
RDebugUtils.currentLine=8192014;
 //BA.debugLineNum = 8192014;BA.debugLine="If country.Length > 0 Then displayName = displa";
if (_country.length()>0) { 
_displayname = _displayname+", "+_country;};
RDebugUtils.currentLine=8192016;
 //BA.debugLineNum = 8192016;BA.debugLine="choices.Add(displayName)";
_choices.Add((Object)(_displayname));
 }
};
RDebugUtils.currentLine=8192020;
 //BA.debugLineNum = 8192020;BA.debugLine="Dim choiceDialog As JavaObject";
_choicedialog = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=8192021;
 //BA.debugLineNum = 8192021;BA.debugLine="choiceDialog.InitializeNewInstance(\"javafx.scene";
_choicedialog.InitializeNewInstance("javafx.scene.control.ChoiceDialog",new Object[]{_choices.Get((int) (0)),(Object)(_choices.getObject())});
RDebugUtils.currentLine=8192022;
 //BA.debugLineNum = 8192022;BA.debugLine="choiceDialog.RunMethod(\"setTitle\", Array(\"Select";
_choicedialog.RunMethod("setTitle",new Object[]{(Object)("Select City")});
RDebugUtils.currentLine=8192023;
 //BA.debugLineNum = 8192023;BA.debugLine="choiceDialog.RunMethod(\"setHeaderText\", Array(\"M";
_choicedialog.RunMethod("setHeaderText",new Object[]{(Object)("Multiple cities found")});
RDebugUtils.currentLine=8192024;
 //BA.debugLineNum = 8192024;BA.debugLine="choiceDialog.RunMethod(\"setContentText\", Array(\"";
_choicedialog.RunMethod("setContentText",new Object[]{(Object)("Choose your city:")});
RDebugUtils.currentLine=8192026;
 //BA.debugLineNum = 8192026;BA.debugLine="Dim result As JavaObject = choiceDialog.RunMetho";
_result = new anywheresoftware.b4j.object.JavaObject();
_result = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_choicedialog.RunMethod("showAndWait",(Object[])(anywheresoftware.b4a.keywords.Common.Null))));
RDebugUtils.currentLine=8192027;
 //BA.debugLineNum = 8192027;BA.debugLine="Dim isPresent As Boolean = result.RunMethod(\"isP";
_ispresent = BA.ObjectToBoolean(_result.RunMethod("isPresent",(Object[])(anywheresoftware.b4a.keywords.Common.Null)));
RDebugUtils.currentLine=8192029;
 //BA.debugLineNum = 8192029;BA.debugLine="If isPresent Then";
if (_ispresent) { 
RDebugUtils.currentLine=8192030;
 //BA.debugLineNum = 8192030;BA.debugLine="Dim selected As String = result.RunMethod(\"get\"";
_selected = BA.ObjectToString(_result.RunMethod("get",(Object[])(anywheresoftware.b4a.keywords.Common.Null)));
RDebugUtils.currentLine=8192031;
 //BA.debugLineNum = 8192031;BA.debugLine="Dim selectedIndex As Int = choices.IndexOf(sele";
_selectedindex = _choices.IndexOf((Object)(_selected));
RDebugUtils.currentLine=8192032;
 //BA.debugLineNum = 8192032;BA.debugLine="If selectedIndex >= 0 Then";
if (_selectedindex>=0) { 
RDebugUtils.currentLine=8192033;
 //BA.debugLineNum = 8192033;BA.debugLine="SelectCity(results.Get(selectedIndex))";
_selectcity((anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_results.Get(_selectedindex))));
 };
 };
 } 
       catch (Exception e29) {
			ba.setLastException(e29);RDebugUtils.currentLine=8192037;
 //BA.debugLineNum = 8192037;BA.debugLine="Log(\"ShowCitySelectionDialog error: \" & LastExce";
anywheresoftware.b4a.keywords.Common.LogImpl("28192037","ShowCitySelectionDialog error: "+anywheresoftware.b4a.keywords.Common.LastException(ba).getMessage(),0);
 };
RDebugUtils.currentLine=8192039;
 //BA.debugLineNum = 8192039;BA.debugLine="End Sub";
return "";
}
public static String  _selectcity(anywheresoftware.b4a.objects.collections.Map _citydata) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "selectcity", false))
	 {return ((String) Debug.delegate(ba, "selectcity", new Object[] {_citydata}));}
String _name = "";
String _country = "";
String _admin1 = "";
RDebugUtils.currentLine=8257536;
 //BA.debugLineNum = 8257536;BA.debugLine="Sub SelectCity(cityData As Map)";
RDebugUtils.currentLine=8257537;
 //BA.debugLineNum = 8257537;BA.debugLine="Try";
try {RDebugUtils.currentLine=8257539;
 //BA.debugLineNum = 8257539;BA.debugLine="Dim name As String = cityData.Get(\"name\")";
_name = BA.ObjectToString(_citydata.Get((Object)("name")));
RDebugUtils.currentLine=8257540;
 //BA.debugLineNum = 8257540;BA.debugLine="Dim country As String = cityData.GetDefault(\"cou";
_country = BA.ObjectToString(_citydata.GetDefault((Object)("country"),(Object)("")));
RDebugUtils.currentLine=8257541;
 //BA.debugLineNum = 8257541;BA.debugLine="Dim admin1 As String = cityData.GetDefault(\"admi";
_admin1 = BA.ObjectToString(_citydata.GetDefault((Object)("admin1"),(Object)("")));
RDebugUtils.currentLine=8257543;
 //BA.debugLineNum = 8257543;BA.debugLine="latitude = cityData.Get(\"latitude\")";
_latitude = (double)(BA.ObjectToNumber(_citydata.Get((Object)("latitude"))));
RDebugUtils.currentLine=8257544;
 //BA.debugLineNum = 8257544;BA.debugLine="longitude = cityData.Get(\"longitude\")";
_longitude = (double)(BA.ObjectToNumber(_citydata.Get((Object)("longitude"))));
RDebugUtils.currentLine=8257547;
 //BA.debugLineNum = 8257547;BA.debugLine="cityName = name";
_cityname = _name;
RDebugUtils.currentLine=8257548;
 //BA.debugLineNum = 8257548;BA.debugLine="If admin1.Length > 0 Then cityName = cityName &";
if (_admin1.length()>0) { 
_cityname = _cityname+", "+_admin1;};
RDebugUtils.currentLine=8257549;
 //BA.debugLineNum = 8257549;BA.debugLine="If country.Length > 0 Then cityName = cityName &";
if (_country.length()>0) { 
_cityname = _cityname+", "+_country;};
RDebugUtils.currentLine=8257552;
 //BA.debugLineNum = 8257552;BA.debugLine="SaveSettings";
_savesettings();
RDebugUtils.currentLine=8257555;
 //BA.debugLineNum = 8257555;BA.debugLine="FetchWeather";
_fetchweather();
RDebugUtils.currentLine=8257556;
 //BA.debugLineNum = 8257556;BA.debugLine="FetchPrayerTimes";
_fetchprayertimes();
RDebugUtils.currentLine=8257558;
 //BA.debugLineNum = 8257558;BA.debugLine="Log(\"City changed to: \" & cityName & \" (lat: \" &";
anywheresoftware.b4a.keywords.Common.LogImpl("28257558","City changed to: "+_cityname+" (lat: "+BA.NumberToString(_latitude)+", lon: "+BA.NumberToString(_longitude)+")",0);
RDebugUtils.currentLine=8257561;
 //BA.debugLineNum = 8257561;BA.debugLine="ShowAlert(\"City Updated\", \"Location set to: \" &";
_showalert("City Updated","Location set to: "+_cityname);
 } 
       catch (Exception e16) {
			ba.setLastException(e16);RDebugUtils.currentLine=8257563;
 //BA.debugLineNum = 8257563;BA.debugLine="Log(\"SelectCity error: \" & LastException.Message";
anywheresoftware.b4a.keywords.Common.LogImpl("28257563","SelectCity error: "+anywheresoftware.b4a.keywords.Common.LastException(ba).getMessage(),0);
 };
RDebugUtils.currentLine=8257565;
 //BA.debugLineNum = 8257565;BA.debugLine="End Sub";
return "";
}
public static String  _showalert(String _title,String _message) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "showalert", false))
	 {return ((String) Debug.delegate(ba, "showalert", new Object[] {_title,_message}));}
anywheresoftware.b4j.object.JavaObject _alert = null;
RDebugUtils.currentLine=8323072;
 //BA.debugLineNum = 8323072;BA.debugLine="Sub ShowAlert(title As String, message As String)";
RDebugUtils.currentLine=8323073;
 //BA.debugLineNum = 8323073;BA.debugLine="Try";
try {RDebugUtils.currentLine=8323074;
 //BA.debugLineNum = 8323074;BA.debugLine="Dim alert As JavaObject";
_alert = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=8323075;
 //BA.debugLineNum = 8323075;BA.debugLine="alert.InitializeNewInstance(\"javafx.scene.contro";
_alert.InitializeNewInstance("javafx.scene.control.Alert",new Object[]{_getalerttype("INFORMATION")});
RDebugUtils.currentLine=8323076;
 //BA.debugLineNum = 8323076;BA.debugLine="alert.RunMethod(\"setTitle\", Array(title))";
_alert.RunMethod("setTitle",new Object[]{(Object)(_title)});
RDebugUtils.currentLine=8323077;
 //BA.debugLineNum = 8323077;BA.debugLine="alert.RunMethod(\"setHeaderText\", Array(Null))";
_alert.RunMethod("setHeaderText",new Object[]{anywheresoftware.b4a.keywords.Common.Null});
RDebugUtils.currentLine=8323078;
 //BA.debugLineNum = 8323078;BA.debugLine="alert.RunMethod(\"setContentText\", Array(message)";
_alert.RunMethod("setContentText",new Object[]{(Object)(_message)});
RDebugUtils.currentLine=8323079;
 //BA.debugLineNum = 8323079;BA.debugLine="alert.RunMethod(\"showAndWait\", Null)";
_alert.RunMethod("showAndWait",(Object[])(anywheresoftware.b4a.keywords.Common.Null));
 } 
       catch (Exception e9) {
			ba.setLastException(e9);RDebugUtils.currentLine=8323081;
 //BA.debugLineNum = 8323081;BA.debugLine="Log(\"ShowAlert error: \" & LastException.Message)";
anywheresoftware.b4a.keywords.Common.LogImpl("28323081","ShowAlert error: "+anywheresoftware.b4a.keywords.Common.LastException(ba).getMessage(),0);
 };
RDebugUtils.currentLine=8323083;
 //BA.debugLineNum = 8323083;BA.debugLine="End Sub";
return "";
}
public static String  _timimagechange_tick() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "timimagechange_tick", false))
	 {return ((String) Debug.delegate(ba, "timimagechange_tick", null));}
long _elapsed = 0L;
int _interval = 0;
RDebugUtils.currentLine=655360;
 //BA.debugLineNum = 655360;BA.debugLine="Sub timImageChange_Tick";
RDebugUtils.currentLine=655361;
 //BA.debugLineNum = 655361;BA.debugLine="Try";
try {RDebugUtils.currentLine=655362;
 //BA.debugLineNum = 655362;BA.debugLine="If currentImageInterval > 0 And showImage Then";
if (_currentimageinterval>0 && _showimage) { 
RDebugUtils.currentLine=655363;
 //BA.debugLineNum = 655363;BA.debugLine="Dim elapsed As Long = (DateTime.Now / 1000) - l";
_elapsed = (long) ((anywheresoftware.b4a.keywords.Common.DateTime.getNow()/(double)1000)-_lastimagechangetime);
RDebugUtils.currentLine=655364;
 //BA.debugLineNum = 655364;BA.debugLine="Dim interval As Int = imageIntervals.Get(curren";
_interval = (int)(BA.ObjectToNumber(_imageintervals.Get(_currentimageinterval)));
RDebugUtils.currentLine=655365;
 //BA.debugLineNum = 655365;BA.debugLine="If elapsed >= interval Then";
if (_elapsed>=_interval) { 
RDebugUtils.currentLine=655366;
 //BA.debugLineNum = 655366;BA.debugLine="LoadBackgroundImage";
_loadbackgroundimage();
RDebugUtils.currentLine=655367;
 //BA.debugLineNum = 655367;BA.debugLine="lastImageChangeTime = DateTime.Now / 1000";
_lastimagechangetime = (long) (anywheresoftware.b4a.keywords.Common.DateTime.getNow()/(double)1000);
 };
 };
 } 
       catch (Exception e11) {
			ba.setLastException(e11);RDebugUtils.currentLine=655371;
 //BA.debugLineNum = 655371;BA.debugLine="Log(\"Timer error: \" & LastException.Message)";
anywheresoftware.b4a.keywords.Common.LogImpl("2655371","Timer error: "+anywheresoftware.b4a.keywords.Common.LastException(ba).getMessage(),0);
 };
RDebugUtils.currentLine=655373;
 //BA.debugLineNum = 655373;BA.debugLine="End Sub";
return "";
}
public static String  _timupdate_tick() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "timupdate_tick", false))
	 {return ((String) Debug.delegate(ba, "timupdate_tick", null));}
RDebugUtils.currentLine=589824;
 //BA.debugLineNum = 589824;BA.debugLine="Sub timUpdate_Tick";
RDebugUtils.currentLine=589825;
 //BA.debugLineNum = 589825;BA.debugLine="UpdateClock";
_updateclock();
RDebugUtils.currentLine=589826;
 //BA.debugLineNum = 589826;BA.debugLine="End Sub";
return "";
}
}