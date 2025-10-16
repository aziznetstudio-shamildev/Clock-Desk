package b4j.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class main_subs_0 {


public static RemoteObject  _appstart(RemoteObject _form1,RemoteObject _args) throws Exception{
try {
		Debug.PushSubsStack("AppStart (main) ","main",0,main.ba,main.mostCurrent,87);
if (RapidSub.canDelegate("appstart")) { return b4j.example.main.remoteMe.runUserSub(false, "main","appstart", _form1, _args);}
Debug.locals.put("Form1", _form1);
Debug.locals.put("Args", _args);
 BA.debugLineNum = 87;BA.debugLine="Sub AppStart (Form1 As Form, Args() As String)";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 88;BA.debugLine="Try";
Debug.ShouldStop(8388608);
try { BA.debugLineNum = 89;BA.debugLine="MainForm = Form1";
Debug.ShouldStop(16777216);
main._mainform = _form1;
 BA.debugLineNum = 91;BA.debugLine="colorSchemes.Initialize";
Debug.ShouldStop(67108864);
main._colorschemes.runVoidMethod ("Initialize");
 BA.debugLineNum = 92;BA.debugLine="weatherData.Initialize";
Debug.ShouldStop(134217728);
main._weatherdata.runVoidMethod ("Initialize");
 BA.debugLineNum = 93;BA.debugLine="translations.Initialize";
Debug.ShouldStop(268435456);
main._translations.runVoidMethod ("Initialize");
 BA.debugLineNum = 94;BA.debugLine="prayerLabels.Initialize";
Debug.ShouldStop(536870912);
main._prayerlabels.runVoidMethod ("Initialize");
 BA.debugLineNum = 95;BA.debugLine="SetupColorSchemes";
Debug.ShouldStop(1073741824);
_setupcolorschemes();
 BA.debugLineNum = 96;BA.debugLine="SetupTranslations";
Debug.ShouldStop(-2147483648);
_setuptranslations();
 BA.debugLineNum = 97;BA.debugLine="currentClockColor = xui.Color_RGB(0, 255, 255)";
Debug.ShouldStop(1);
main._currentclockcolor = main._xui.runMethod(true,"Color_RGB",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 255)),(Object)(BA.numberCast(int.class, 255)));
 BA.debugLineNum = 98;BA.debugLine="LoadSettings";
Debug.ShouldStop(2);
_loadsettings();
 BA.debugLineNum = 100;BA.debugLine="pnlBackground.Initialize(\"\")";
Debug.ShouldStop(8);
main._pnlbackground.runVoidMethod ("Initialize",main.ba,(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 101;BA.debugLine="pnlBackground.Style = \"-fx-background-color: #00";
Debug.ShouldStop(16);
main._pnlbackground.runMethod(true,"setStyle",BA.ObjectToString("-fx-background-color: #000000;"));
 BA.debugLineNum = 102;BA.debugLine="MainForm.RootPane.AddNode(pnlBackground, 0, 0, 1";
Debug.ShouldStop(32);
main._mainform.runMethod(false,"getRootPane").runVoidMethod ("AddNode",(Object)((main._pnlbackground.getObject())),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 1280)),(Object)(BA.numberCast(double.class, 800)));
 BA.debugLineNum = 105;BA.debugLine="imgView.Initialize(\"\")";
Debug.ShouldStop(256);
main._imgview.runVoidMethod ("Initialize",main.ba,(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 106;BA.debugLine="MainForm.RootPane.AddNode(imgView, 0, 0, 1280, 8";
Debug.ShouldStop(512);
main._mainform.runMethod(false,"getRootPane").runVoidMethod ("AddNode",(Object)((main._imgview.getObject())),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 1280)),(Object)(BA.numberCast(double.class, 800)));
 BA.debugLineNum = 109;BA.debugLine="pnlAnalogClock.Initialize(\"\")";
Debug.ShouldStop(4096);
main._pnlanalogclock.runVoidMethod ("Initialize",main.ba,(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 110;BA.debugLine="MainForm.RootPane.AddNode(pnlAnalogClock, 440, 2";
Debug.ShouldStop(8192);
main._mainform.runMethod(false,"getRootPane").runVoidMethod ("AddNode",(Object)((main._pnlanalogclock.getObject())),(Object)(BA.numberCast(double.class, 440)),(Object)(BA.numberCast(double.class, 200)),(Object)(BA.numberCast(double.class, 400)),(Object)(BA.numberCast(double.class, 400)));
 BA.debugLineNum = 111;BA.debugLine="cvsAnalogClock.Initialize(pnlAnalogClock)";
Debug.ShouldStop(16384);
main._cvsanalogclock.runVoidMethod ("Initialize",main.ba,RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), main._pnlanalogclock.getObject()));
 BA.debugLineNum = 112;BA.debugLine="pnlAnalogClock.Visible = False";
Debug.ShouldStop(32768);
main._pnlanalogclock.runMethod(true,"setVisible",main.__c.getField(true,"False"));
 BA.debugLineNum = 115;BA.debugLine="lblClock.Initialize(\"\")";
Debug.ShouldStop(262144);
main._lblclock.runVoidMethod ("Initialize",main.ba,(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 116;BA.debugLine="lblClock.Text = \"00:00:00\"";
Debug.ShouldStop(524288);
main._lblclock.runMethod(true,"setText",BA.ObjectToString("00:00:00"));
 BA.debugLineNum = 117;BA.debugLine="lblClock.TextColor = fx.Colors.RGB(0, 255, 255)";
Debug.ShouldStop(1048576);
main._lblclock.runMethod(false,"setTextColor",(main._fx.getField(false,"Colors").runMethod(false,"RGB",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 255)),(Object)(BA.numberCast(int.class, 255)))));
 BA.debugLineNum = 118;BA.debugLine="lblClock.TextSize = 96";
Debug.ShouldStop(2097152);
main._lblclock.runMethod(true,"setTextSize",BA.numberCast(double.class, 96));
 BA.debugLineNum = 119;BA.debugLine="lblClock.Style = \"-fx-font-weight: bold; -fx-eff";
Debug.ShouldStop(4194304);
main._lblclock.runMethod(true,"setStyle",BA.ObjectToString("-fx-font-weight: bold; -fx-effect: dropshadow(three-pass-box, black, 15, 0, 0, 0);"));
 BA.debugLineNum = 120;BA.debugLine="lblClock.Alignment = \"CENTER\"";
Debug.ShouldStop(8388608);
main._lblclock.runMethod(true,"setAlignment",BA.ObjectToString("CENTER"));
 BA.debugLineNum = 121;BA.debugLine="MainForm.RootPane.AddNode(lblClock, 0, 280, 1280";
Debug.ShouldStop(16777216);
main._mainform.runMethod(false,"getRootPane").runVoidMethod ("AddNode",(Object)((main._lblclock.getObject())),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 280)),(Object)(BA.numberCast(double.class, 1280)),(Object)(BA.numberCast(double.class, 120)));
 BA.debugLineNum = 125;BA.debugLine="pnlInfoOverlay.Initialize(\"\")";
Debug.ShouldStop(268435456);
main._pnlinfooverlay.runVoidMethod ("Initialize",main.ba,(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 126;BA.debugLine="pnlInfoOverlay.Style = \"-fx-background-color: rg";
Debug.ShouldStop(536870912);
main._pnlinfooverlay.runMethod(true,"setStyle",BA.ObjectToString("-fx-background-color: rgba(0, 0, 0, 0.75); -fx-background-radius: 20px; -fx-border-color: rgba(0, 200, 255, 0.5); -fx-border-width: 2px; -fx-border-radius: 20px; -fx-effect: dropshadow(three-pass-box, black, 20, 0, 0, 0);"));
 BA.debugLineNum = 127;BA.debugLine="MainForm.RootPane.AddNode(pnlInfoOverlay, 50, 48";
Debug.ShouldStop(1073741824);
main._mainform.runMethod(false,"getRootPane").runVoidMethod ("AddNode",(Object)((main._pnlinfooverlay.getObject())),(Object)(BA.numberCast(double.class, 50)),(Object)(BA.numberCast(double.class, 480)),(Object)(BA.numberCast(double.class, 1180)),(Object)(BA.numberCast(double.class, 280)));
 BA.debugLineNum = 130;BA.debugLine="lblDate.Initialize(\"\")";
Debug.ShouldStop(2);
main._lbldate.runVoidMethod ("Initialize",main.ba,(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 131;BA.debugLine="lblDate.Text = \"\"";
Debug.ShouldStop(4);
main._lbldate.runMethod(true,"setText",BA.ObjectToString(""));
 BA.debugLineNum = 132;BA.debugLine="lblDate.TextColor = fx.Colors.RGB(200, 200, 200)";
Debug.ShouldStop(8);
main._lbldate.runMethod(false,"setTextColor",(main._fx.getField(false,"Colors").runMethod(false,"RGB",(Object)(BA.numberCast(int.class, 200)),(Object)(BA.numberCast(int.class, 200)),(Object)(BA.numberCast(int.class, 200)))));
 BA.debugLineNum = 133;BA.debugLine="lblDate.TextSize = 20";
Debug.ShouldStop(16);
main._lbldate.runMethod(true,"setTextSize",BA.numberCast(double.class, 20));
 BA.debugLineNum = 134;BA.debugLine="lblDate.Style = \"-fx-font-weight: normal;\"";
Debug.ShouldStop(32);
main._lbldate.runMethod(true,"setStyle",BA.ObjectToString("-fx-font-weight: normal;"));
 BA.debugLineNum = 135;BA.debugLine="lblDate.Alignment = \"CENTER\"";
Debug.ShouldStop(64);
main._lbldate.runMethod(true,"setAlignment",BA.ObjectToString("CENTER"));
 BA.debugLineNum = 136;BA.debugLine="pnlInfoOverlay.AddNode(lblDate, 10, 10, 1160, 30";
Debug.ShouldStop(128);
main._pnlinfooverlay.runVoidMethod ("AddNode",(Object)((main._lbldate.getObject())),(Object)(BA.numberCast(double.class, 10)),(Object)(BA.numberCast(double.class, 10)),(Object)(BA.numberCast(double.class, 1160)),(Object)(BA.numberCast(double.class, 30)));
 BA.debugLineNum = 143;BA.debugLine="lblWeatherIcon.Initialize(\"\")";
Debug.ShouldStop(16384);
main._lblweathericon.runVoidMethod ("Initialize",main.ba,(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 144;BA.debugLine="lblWeatherIcon.Text = \"🌤️\"";
Debug.ShouldStop(32768);
main._lblweathericon.runMethod(true,"setText",BA.ObjectToString("🌤️"));
 BA.debugLineNum = 145;BA.debugLine="lblWeatherIcon.TextSize = 72";
Debug.ShouldStop(65536);
main._lblweathericon.runMethod(true,"setTextSize",BA.numberCast(double.class, 72));
 BA.debugLineNum = 146;BA.debugLine="lblWeatherIcon.Alignment = \"CENTER\"";
Debug.ShouldStop(131072);
main._lblweathericon.runMethod(true,"setAlignment",BA.ObjectToString("CENTER"));
 BA.debugLineNum = 147;BA.debugLine="pnlInfoOverlay.AddNode(lblWeatherIcon, 245, 50,";
Debug.ShouldStop(262144);
main._pnlinfooverlay.runVoidMethod ("AddNode",(Object)((main._lblweathericon.getObject())),(Object)(BA.numberCast(double.class, 245)),(Object)(BA.numberCast(double.class, 50)),(Object)(BA.numberCast(double.class, 120)),(Object)(BA.numberCast(double.class, 100)));
 BA.debugLineNum = 150;BA.debugLine="lblTemperature.Initialize(\"\")";
Debug.ShouldStop(2097152);
main._lbltemperature.runVoidMethod ("Initialize",main.ba,(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 151;BA.debugLine="lblTemperature.Text = \"--°\"";
Debug.ShouldStop(4194304);
main._lbltemperature.runMethod(true,"setText",BA.ObjectToString("--°"));
 BA.debugLineNum = 152;BA.debugLine="lblTemperature.TextColor = fx.Colors.RGB(255, 20";
Debug.ShouldStop(8388608);
main._lbltemperature.runMethod(false,"setTextColor",(main._fx.getField(false,"Colors").runMethod(false,"RGB",(Object)(BA.numberCast(int.class, 255)),(Object)(BA.numberCast(int.class, 200)),(Object)(BA.numberCast(int.class, 0)))));
 BA.debugLineNum = 153;BA.debugLine="lblTemperature.TextSize = 64";
Debug.ShouldStop(16777216);
main._lbltemperature.runMethod(true,"setTextSize",BA.numberCast(double.class, 64));
 BA.debugLineNum = 154;BA.debugLine="lblTemperature.Style = \"-fx-font-weight: bold;\"";
Debug.ShouldStop(33554432);
main._lbltemperature.runMethod(true,"setStyle",BA.ObjectToString("-fx-font-weight: bold;"));
 BA.debugLineNum = 155;BA.debugLine="lblTemperature.Alignment = \"CENTER\"";
Debug.ShouldStop(67108864);
main._lbltemperature.runMethod(true,"setAlignment",BA.ObjectToString("CENTER"));
 BA.debugLineNum = 156;BA.debugLine="pnlInfoOverlay.AddNode(lblTemperature, 365, 50,";
Debug.ShouldStop(134217728);
main._pnlinfooverlay.runVoidMethod ("AddNode",(Object)((main._lbltemperature.getObject())),(Object)(BA.numberCast(double.class, 365)),(Object)(BA.numberCast(double.class, 50)),(Object)(BA.numberCast(double.class, 150)),(Object)(BA.numberCast(double.class, 100)));
 BA.debugLineNum = 159;BA.debugLine="lblWeatherDetails.Initialize(\"\")";
Debug.ShouldStop(1073741824);
main._lblweatherdetails.runVoidMethod ("Initialize",main.ba,(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 160;BA.debugLine="lblWeatherDetails.Text = GetTranslation(\"loading";
Debug.ShouldStop(-2147483648);
main._lblweatherdetails.runMethod(true,"setText",_gettranslation(RemoteObject.createImmutable("loading_weather")));
 BA.debugLineNum = 161;BA.debugLine="lblWeatherDetails.TextColor = fx.Colors.RGB(180,";
Debug.ShouldStop(1);
main._lblweatherdetails.runMethod(false,"setTextColor",(main._fx.getField(false,"Colors").runMethod(false,"RGB",(Object)(BA.numberCast(int.class, 180)),(Object)(BA.numberCast(int.class, 180)),(Object)(BA.numberCast(int.class, 180)))));
 BA.debugLineNum = 162;BA.debugLine="lblWeatherDetails.TextSize = 16";
Debug.ShouldStop(2);
main._lblweatherdetails.runMethod(true,"setTextSize",BA.numberCast(double.class, 16));
 BA.debugLineNum = 163;BA.debugLine="lblWeatherDetails.Style = \"-fx-font-weight: norm";
Debug.ShouldStop(4);
main._lblweatherdetails.runMethod(true,"setStyle",BA.ObjectToString("-fx-font-weight: normal;"));
 BA.debugLineNum = 164;BA.debugLine="lblWeatherDetails.Alignment = \"CENTER_LEFT\"";
Debug.ShouldStop(8);
main._lblweatherdetails.runMethod(true,"setAlignment",BA.ObjectToString("CENTER_LEFT"));
 BA.debugLineNum = 165;BA.debugLine="pnlInfoOverlay.AddNode(lblWeatherDetails, 525, 6";
Debug.ShouldStop(16);
main._pnlinfooverlay.runVoidMethod ("AddNode",(Object)((main._lblweatherdetails.getObject())),(Object)(BA.numberCast(double.class, 525)),(Object)(BA.numberCast(double.class, 60)),(Object)(BA.numberCast(double.class, 400)),(Object)(BA.numberCast(double.class, 80)));
 BA.debugLineNum = 168;BA.debugLine="pnlPrayerCards.Initialize(\"\")";
Debug.ShouldStop(128);
main._pnlprayercards.runVoidMethod ("Initialize",main.ba,(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 169;BA.debugLine="pnlPrayerCards.Style = \"-fx-background-color: tr";
Debug.ShouldStop(256);
main._pnlprayercards.runMethod(true,"setStyle",BA.ObjectToString("-fx-background-color: transparent;"));
 BA.debugLineNum = 170;BA.debugLine="pnlInfoOverlay.AddNode(pnlPrayerCards, 30, 170,";
Debug.ShouldStop(512);
main._pnlinfooverlay.runVoidMethod ("AddNode",(Object)((main._pnlprayercards.getObject())),(Object)(BA.numberCast(double.class, 30)),(Object)(BA.numberCast(double.class, 170)),(Object)(BA.numberCast(double.class, 1120)),(Object)(BA.numberCast(double.class, 80)));
 BA.debugLineNum = 172;BA.debugLine="CreatePrayerTimeCards";
Debug.ShouldStop(2048);
_createprayertimecards();
 BA.debugLineNum = 175;BA.debugLine="btnSettings.Initialize(\"btnSettings\")";
Debug.ShouldStop(16384);
main._btnsettings.runVoidMethod ("Initialize",main.ba,(Object)(RemoteObject.createImmutable("btnSettings")));
 BA.debugLineNum = 176;BA.debugLine="btnSettings.Text = \"⚙️\"";
Debug.ShouldStop(32768);
main._btnsettings.runMethod(true,"setText",BA.ObjectToString("⚙️"));
 BA.debugLineNum = 177;BA.debugLine="btnSettings.Style = \"-fx-font-size: 28px; -fx-ba";
Debug.ShouldStop(65536);
main._btnsettings.runMethod(true,"setStyle",BA.ObjectToString("-fx-font-size: 28px; -fx-background-color: rgba(0,0,0,0.7); -fx-text-fill: cyan; -fx-background-radius: 25px;"));
 BA.debugLineNum = 178;BA.debugLine="MainForm.RootPane.AddNode(btnSettings, 1200, 20,";
Debug.ShouldStop(131072);
main._mainform.runMethod(false,"getRootPane").runVoidMethod ("AddNode",(Object)((main._btnsettings.getObject())),(Object)(BA.numberCast(double.class, 1200)),(Object)(BA.numberCast(double.class, 20)),(Object)(BA.numberCast(double.class, 60)),(Object)(BA.numberCast(double.class, 60)));
 BA.debugLineNum = 181;BA.debugLine="pnlSettings.Initialize(\"\")";
Debug.ShouldStop(1048576);
main._pnlsettings.runVoidMethod ("Initialize",main.ba,(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 182;BA.debugLine="pnlSettings.Style = \"-fx-background-color: rgba(";
Debug.ShouldStop(2097152);
main._pnlsettings.runMethod(true,"setStyle",BA.ObjectToString("-fx-background-color: rgba(0,0,0,0.9); -fx-border-color: cyan; -fx-border-width: 2px; -fx-border-radius: 10px;"));
 BA.debugLineNum = 183;BA.debugLine="MainForm.RootPane.AddNode(pnlSettings, 40, 20, 1";
Debug.ShouldStop(4194304);
main._mainform.runMethod(false,"getRootPane").runVoidMethod ("AddNode",(Object)((main._pnlsettings.getObject())),(Object)(BA.numberCast(double.class, 40)),(Object)(BA.numberCast(double.class, 20)),(Object)(BA.numberCast(double.class, 1200)),(Object)(BA.numberCast(double.class, 80)));
 BA.debugLineNum = 184;BA.debugLine="pnlSettings.Visible = False";
Debug.ShouldStop(8388608);
main._pnlsettings.runMethod(true,"setVisible",main.__c.getField(true,"False"));
 BA.debugLineNum = 187;BA.debugLine="btnClockMode.Initialize(\"btnClockMode\")";
Debug.ShouldStop(67108864);
main._btnclockmode.runVoidMethod ("Initialize",main.ba,(Object)(RemoteObject.createImmutable("btnClockMode")));
 BA.debugLineNum = 188;BA.debugLine="btnClockMode.Text = \"🔢 Digital\"";
Debug.ShouldStop(134217728);
main._btnclockmode.runMethod(true,"setText",BA.ObjectToString("🔢 Digital"));
 BA.debugLineNum = 189;BA.debugLine="btnClockMode.Style = \"-fx-font-size: 14px; -fx-b";
Debug.ShouldStop(268435456);
main._btnclockmode.runMethod(true,"setStyle",BA.ObjectToString("-fx-font-size: 14px; -fx-background-color: #333; -fx-text-fill: white; -fx-background-radius: 5px;"));
 BA.debugLineNum = 190;BA.debugLine="pnlSettings.AddNode(btnClockMode, 10, 20, 120, 4";
Debug.ShouldStop(536870912);
main._pnlsettings.runVoidMethod ("AddNode",(Object)((main._btnclockmode.getObject())),(Object)(BA.numberCast(double.class, 10)),(Object)(BA.numberCast(double.class, 20)),(Object)(BA.numberCast(double.class, 120)),(Object)(BA.numberCast(double.class, 40)));
 BA.debugLineNum = 192;BA.debugLine="btnTheme.Initialize(\"btnTheme\")";
Debug.ShouldStop(-2147483648);
main._btntheme.runVoidMethod ("Initialize",main.ba,(Object)(RemoteObject.createImmutable("btnTheme")));
 BA.debugLineNum = 193;BA.debugLine="btnTheme.Text = \"🎨 Cyan\"";
Debug.ShouldStop(1);
main._btntheme.runMethod(true,"setText",BA.ObjectToString("🎨 Cyan"));
 BA.debugLineNum = 194;BA.debugLine="btnTheme.Style = \"-fx-font-size: 14px; -fx-backg";
Debug.ShouldStop(2);
main._btntheme.runMethod(true,"setStyle",BA.ObjectToString("-fx-font-size: 14px; -fx-background-color: #333; -fx-text-fill: white; -fx-background-radius: 5px;"));
 BA.debugLineNum = 195;BA.debugLine="pnlSettings.AddNode(btnTheme, 140, 20, 120, 40)";
Debug.ShouldStop(4);
main._pnlsettings.runVoidMethod ("AddNode",(Object)((main._btntheme.getObject())),(Object)(BA.numberCast(double.class, 140)),(Object)(BA.numberCast(double.class, 20)),(Object)(BA.numberCast(double.class, 120)),(Object)(BA.numberCast(double.class, 40)));
 BA.debugLineNum = 197;BA.debugLine="btnImageTimer.Initialize(\"btnImageTimer\")";
Debug.ShouldStop(16);
main._btnimagetimer.runVoidMethod ("Initialize",main.ba,(Object)(RemoteObject.createImmutable("btnImageTimer")));
 BA.debugLineNum = 198;BA.debugLine="btnImageTimer.Text = \"⏱️ OFF\"";
Debug.ShouldStop(32);
main._btnimagetimer.runMethod(true,"setText",BA.ObjectToString("⏱️ OFF"));
 BA.debugLineNum = 199;BA.debugLine="btnImageTimer.Style = \"-fx-font-size: 14px; -fx-";
Debug.ShouldStop(64);
main._btnimagetimer.runMethod(true,"setStyle",BA.ObjectToString("-fx-font-size: 14px; -fx-background-color: #333; -fx-text-fill: white; -fx-background-radius: 5px;"));
 BA.debugLineNum = 200;BA.debugLine="pnlSettings.AddNode(btnImageTimer, 270, 20, 120,";
Debug.ShouldStop(128);
main._pnlsettings.runVoidMethod ("AddNode",(Object)((main._btnimagetimer.getObject())),(Object)(BA.numberCast(double.class, 270)),(Object)(BA.numberCast(double.class, 20)),(Object)(BA.numberCast(double.class, 120)),(Object)(BA.numberCast(double.class, 40)));
 BA.debugLineNum = 202;BA.debugLine="btnBackground.Initialize(\"btnBackground\")";
Debug.ShouldStop(512);
main._btnbackground.runVoidMethod ("Initialize",main.ba,(Object)(RemoteObject.createImmutable("btnBackground")));
 BA.debugLineNum = 203;BA.debugLine="btnBackground.Text = \"🖼️ Image ON\"";
Debug.ShouldStop(1024);
main._btnbackground.runMethod(true,"setText",BA.ObjectToString("🖼️ Image ON"));
 BA.debugLineNum = 204;BA.debugLine="btnBackground.Style = \"-fx-font-size: 14px; -fx-";
Debug.ShouldStop(2048);
main._btnbackground.runMethod(true,"setStyle",BA.ObjectToString("-fx-font-size: 14px; -fx-background-color: #333; -fx-text-fill: white; -fx-background-radius: 5px;"));
 BA.debugLineNum = 205;BA.debugLine="pnlSettings.AddNode(btnBackground, 400, 20, 140,";
Debug.ShouldStop(4096);
main._pnlsettings.runVoidMethod ("AddNode",(Object)((main._btnbackground.getObject())),(Object)(BA.numberCast(double.class, 400)),(Object)(BA.numberCast(double.class, 20)),(Object)(BA.numberCast(double.class, 140)),(Object)(BA.numberCast(double.class, 40)));
 BA.debugLineNum = 207;BA.debugLine="btnBgColor.Initialize(\"btnBgColor\")";
Debug.ShouldStop(16384);
main._btnbgcolor.runVoidMethod ("Initialize",main.ba,(Object)(RemoteObject.createImmutable("btnBgColor")));
 BA.debugLineNum = 208;BA.debugLine="btnBgColor.Text = \"🎨 BG Color\"";
Debug.ShouldStop(32768);
main._btnbgcolor.runMethod(true,"setText",BA.ObjectToString("🎨 BG Color"));
 BA.debugLineNum = 209;BA.debugLine="btnBgColor.Style = \"-fx-font-size: 14px; -fx-bac";
Debug.ShouldStop(65536);
main._btnbgcolor.runMethod(true,"setStyle",BA.ObjectToString("-fx-font-size: 14px; -fx-background-color: #333; -fx-text-fill: white; -fx-background-radius: 5px;"));
 BA.debugLineNum = 210;BA.debugLine="pnlSettings.AddNode(btnBgColor, 550, 20, 140, 40";
Debug.ShouldStop(131072);
main._pnlsettings.runVoidMethod ("AddNode",(Object)((main._btnbgcolor.getObject())),(Object)(BA.numberCast(double.class, 550)),(Object)(BA.numberCast(double.class, 20)),(Object)(BA.numberCast(double.class, 140)),(Object)(BA.numberCast(double.class, 40)));
 BA.debugLineNum = 211;BA.debugLine="btnBgColor.Enabled = False";
Debug.ShouldStop(262144);
main._btnbgcolor.runMethod(true,"setEnabled",main.__c.getField(true,"False"));
 BA.debugLineNum = 213;BA.debugLine="btnPrayerToggle.Initialize(\"btnPrayerToggle\")";
Debug.ShouldStop(1048576);
main._btnprayertoggle.runVoidMethod ("Initialize",main.ba,(Object)(RemoteObject.createImmutable("btnPrayerToggle")));
 BA.debugLineNum = 214;BA.debugLine="btnPrayerToggle.Text = \"🕌 Prayer ON\"";
Debug.ShouldStop(2097152);
main._btnprayertoggle.runMethod(true,"setText",BA.ObjectToString("🕌 Prayer ON"));
 BA.debugLineNum = 215;BA.debugLine="btnPrayerToggle.Style = \"-fx-font-size: 14px; -f";
Debug.ShouldStop(4194304);
main._btnprayertoggle.runMethod(true,"setStyle",BA.ObjectToString("-fx-font-size: 14px; -fx-background-color: #333; -fx-text-fill: white; -fx-background-radius: 5px;"));
 BA.debugLineNum = 216;BA.debugLine="pnlSettings.AddNode(btnPrayerToggle, 700, 20, 14";
Debug.ShouldStop(8388608);
main._pnlsettings.runVoidMethod ("AddNode",(Object)((main._btnprayertoggle.getObject())),(Object)(BA.numberCast(double.class, 700)),(Object)(BA.numberCast(double.class, 20)),(Object)(BA.numberCast(double.class, 140)),(Object)(BA.numberCast(double.class, 40)));
 BA.debugLineNum = 218;BA.debugLine="btnLanguage.Initialize(\"btnLanguage\")";
Debug.ShouldStop(33554432);
main._btnlanguage.runVoidMethod ("Initialize",main.ba,(Object)(RemoteObject.createImmutable("btnLanguage")));
 BA.debugLineNum = 219;BA.debugLine="btnLanguage.Text = \"🌐 EN\"";
Debug.ShouldStop(67108864);
main._btnlanguage.runMethod(true,"setText",BA.ObjectToString("🌐 EN"));
 BA.debugLineNum = 220;BA.debugLine="btnLanguage.Style = \"-fx-font-size: 14px; -fx-ba";
Debug.ShouldStop(134217728);
main._btnlanguage.runMethod(true,"setStyle",BA.ObjectToString("-fx-font-size: 14px; -fx-background-color: #333; -fx-text-fill: white; -fx-background-radius: 5px;"));
 BA.debugLineNum = 221;BA.debugLine="pnlSettings.AddNode(btnLanguage, 850, 20, 100, 4";
Debug.ShouldStop(268435456);
main._pnlsettings.runVoidMethod ("AddNode",(Object)((main._btnlanguage.getObject())),(Object)(BA.numberCast(double.class, 850)),(Object)(BA.numberCast(double.class, 20)),(Object)(BA.numberCast(double.class, 100)),(Object)(BA.numberCast(double.class, 40)));
 BA.debugLineNum = 223;BA.debugLine="btnInfoPanel.Initialize(\"btnInfoPanel\")";
Debug.ShouldStop(1073741824);
main._btninfopanel.runVoidMethod ("Initialize",main.ba,(Object)(RemoteObject.createImmutable("btnInfoPanel")));
 BA.debugLineNum = 224;BA.debugLine="btnInfoPanel.Text = \"📋 Info\"";
Debug.ShouldStop(-2147483648);
main._btninfopanel.runMethod(true,"setText",BA.ObjectToString("📋 Info"));
 BA.debugLineNum = 225;BA.debugLine="btnInfoPanel.Style = \"-fx-font-size: 14px; -fx-b";
Debug.ShouldStop(1);
main._btninfopanel.runMethod(true,"setStyle",BA.ObjectToString("-fx-font-size: 14px; -fx-background-color: #333; -fx-text-fill: white; -fx-background-radius: 5px;"));
 BA.debugLineNum = 226;BA.debugLine="pnlSettings.AddNode(btnInfoPanel, 960, 20, 100,";
Debug.ShouldStop(2);
main._pnlsettings.runVoidMethod ("AddNode",(Object)((main._btninfopanel.getObject())),(Object)(BA.numberCast(double.class, 960)),(Object)(BA.numberCast(double.class, 20)),(Object)(BA.numberCast(double.class, 100)),(Object)(BA.numberCast(double.class, 40)));
 BA.debugLineNum = 229;BA.debugLine="btnChangeCity.Initialize(\"btnChangeCity\")";
Debug.ShouldStop(16);
main._btnchangecity.runVoidMethod ("Initialize",main.ba,(Object)(RemoteObject.createImmutable("btnChangeCity")));
 BA.debugLineNum = 230;BA.debugLine="btnChangeCity.Text = \"🌍 City\"";
Debug.ShouldStop(32);
main._btnchangecity.runMethod(true,"setText",BA.ObjectToString("🌍 City"));
 BA.debugLineNum = 231;BA.debugLine="btnChangeCity.Style = \"-fx-font-size: 14px; -fx-";
Debug.ShouldStop(64);
main._btnchangecity.runMethod(true,"setStyle",BA.ObjectToString("-fx-font-size: 14px; -fx-background-color: #333; -fx-text-fill: white; -fx-background-radius: 5px;"));
 BA.debugLineNum = 232;BA.debugLine="pnlSettings.AddNode(btnChangeCity, 1070, 20, 100";
Debug.ShouldStop(128);
main._pnlsettings.runVoidMethod ("AddNode",(Object)((main._btnchangecity.getObject())),(Object)(BA.numberCast(double.class, 1070)),(Object)(BA.numberCast(double.class, 20)),(Object)(BA.numberCast(double.class, 100)),(Object)(BA.numberCast(double.class, 40)));
 BA.debugLineNum = 235;BA.debugLine="MainForm.SetFormStyle(\"UNDECORATED\")";
Debug.ShouldStop(1024);
main._mainform.runVoidMethod ("SetFormStyle",(Object)(RemoteObject.createImmutable("UNDECORATED")));
 BA.debugLineNum = 236;BA.debugLine="jo = MainForm";
Debug.ShouldStop(2048);
main._jo = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), main._mainform);
 BA.debugLineNum = 237;BA.debugLine="jStage = jo.GetFieldJO(\"stage\")";
Debug.ShouldStop(4096);
main._jstage = main._jo.runMethod(false,"GetFieldJO",(Object)(RemoteObject.createImmutable("stage")));
 BA.debugLineNum = 238;BA.debugLine="jStage.RunMethod(\"setFullScreen\", Array(True))";
Debug.ShouldStop(8192);
main._jstage.runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("setFullScreen")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(main.__c.getField(true,"True"))})));
 BA.debugLineNum = 239;BA.debugLine="jStage.RunMethod(\"setAlwaysOnTop\", Array(True))";
Debug.ShouldStop(16384);
main._jstage.runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("setAlwaysOnTop")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(main.__c.getField(true,"True"))})));
 BA.debugLineNum = 240;BA.debugLine="MainForm.Resizable = False";
Debug.ShouldStop(32768);
main._mainform.runMethod(true,"setResizable",main.__c.getField(true,"False"));
 BA.debugLineNum = 241;BA.debugLine="MainForm.Show";
Debug.ShouldStop(65536);
main._mainform.runVoidMethodAndSync ("Show");
 BA.debugLineNum = 244;BA.debugLine="CenterAllElements";
Debug.ShouldStop(524288);
_centerallelements();
 BA.debugLineNum = 247;BA.debugLine="LoadBackgroundImage";
Debug.ShouldStop(4194304);
_loadbackgroundimage();
 BA.debugLineNum = 248;BA.debugLine="lastImageChangeTime = DateTime.Now / 1000";
Debug.ShouldStop(8388608);
main._lastimagechangetime = BA.numberCast(long.class, RemoteObject.solve(new RemoteObject[] {main.__c.getField(false,"DateTime").runMethod(true,"getNow"),RemoteObject.createImmutable(1000)}, "/",0, 0));
 BA.debugLineNum = 250;BA.debugLine="timUpdate.Initialize(\"timUpdate\", 1000)";
Debug.ShouldStop(33554432);
main._timupdate.runVoidMethod ("Initialize",main.ba,(Object)(BA.ObjectToString("timUpdate")),(Object)(BA.numberCast(long.class, 1000)));
 BA.debugLineNum = 251;BA.debugLine="timUpdate.Enabled = True";
Debug.ShouldStop(67108864);
main._timupdate.runMethod(true,"setEnabled",main.__c.getField(true,"True"));
 BA.debugLineNum = 253;BA.debugLine="timImageChange.Initialize(\"timImageChange\", 1000";
Debug.ShouldStop(268435456);
main._timimagechange.runVoidMethod ("Initialize",main.ba,(Object)(BA.ObjectToString("timImageChange")),(Object)(BA.numberCast(long.class, 1000)));
 BA.debugLineNum = 254;BA.debugLine="timImageChange.Enabled = False";
Debug.ShouldStop(536870912);
main._timimagechange.runMethod(true,"setEnabled",main.__c.getField(true,"False"));
 BA.debugLineNum = 256;BA.debugLine="FetchWeather";
Debug.ShouldStop(-2147483648);
_fetchweather();
 BA.debugLineNum = 257;BA.debugLine="FetchPrayerTimes";
Debug.ShouldStop(1);
_fetchprayertimes();
 BA.debugLineNum = 258;BA.debugLine="UpdateClock";
Debug.ShouldStop(2);
_updateclock();
 BA.debugLineNum = 260;BA.debugLine="Log(\"Modern clock UI started with proper z-order";
Debug.ShouldStop(8);
main.__c.runVoidMethod ("LogImpl","2131245",RemoteObject.createImmutable("Modern clock UI started with proper z-ordering"),0);
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e124) {
			BA.rdebugUtils.runVoidMethod("setLastException",main.ba, e124.toString()); BA.debugLineNum = 262;BA.debugLine="Log(\"AppStart error: \" & LastException.Message)";
Debug.ShouldStop(32);
main.__c.runVoidMethod ("LogImpl","2131247",RemoteObject.concat(RemoteObject.createImmutable("AppStart error: "),main.__c.runMethod(false,"LastException",main.ba).runMethod(true,"getMessage")),0);
 };
 BA.debugLineNum = 264;BA.debugLine="End Sub";
Debug.ShouldStop(128);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btnbackground_click() throws Exception{
try {
		Debug.PushSubsStack("btnBackground_Click (main) ","main",0,main.ba,main.mostCurrent,1001);
if (RapidSub.canDelegate("btnbackground_click")) { return b4j.example.main.remoteMe.runUserSub(false, "main","btnbackground_click");}
 BA.debugLineNum = 1001;BA.debugLine="Sub btnBackground_Click";
Debug.ShouldStop(256);
 BA.debugLineNum = 1002;BA.debugLine="showImage = Not(showImage)";
Debug.ShouldStop(512);
main._showimage = main.__c.runMethod(true,"Not",(Object)(main._showimage));
 BA.debugLineNum = 1003;BA.debugLine="If showImage Then";
Debug.ShouldStop(1024);
if (main._showimage.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 1004;BA.debugLine="btnBackground.Text = \"🖼️ Image ON\"";
Debug.ShouldStop(2048);
main._btnbackground.runMethod(true,"setText",BA.ObjectToString("🖼️ Image ON"));
 BA.debugLineNum = 1005;BA.debugLine="btnBgColor.Enabled = False";
Debug.ShouldStop(4096);
main._btnbgcolor.runMethod(true,"setEnabled",main.__c.getField(true,"False"));
 BA.debugLineNum = 1006;BA.debugLine="LoadBackgroundImage";
Debug.ShouldStop(8192);
_loadbackgroundimage();
 BA.debugLineNum = 1007;BA.debugLine="lastImageChangeTime = DateTime.Now / 1000";
Debug.ShouldStop(16384);
main._lastimagechangetime = BA.numberCast(long.class, RemoteObject.solve(new RemoteObject[] {main.__c.getField(false,"DateTime").runMethod(true,"getNow"),RemoteObject.createImmutable(1000)}, "/",0, 0));
 }else {
 BA.debugLineNum = 1009;BA.debugLine="btnBackground.Text = \"🌈 Image OFF\"";
Debug.ShouldStop(65536);
main._btnbackground.runMethod(true,"setText",BA.ObjectToString("🌈 Image OFF"));
 BA.debugLineNum = 1010;BA.debugLine="btnBgColor.Enabled = True";
Debug.ShouldStop(131072);
main._btnbgcolor.runMethod(true,"setEnabled",main.__c.getField(true,"True"));
 BA.debugLineNum = 1011;BA.debugLine="imgView.SetImage(Null)";
Debug.ShouldStop(262144);
main._imgview.runVoidMethod ("SetImage",(Object)((main.__c.getField(false,"Null"))));
 BA.debugLineNum = 1012;BA.debugLine="timImageChange.Enabled = False";
Debug.ShouldStop(524288);
main._timimagechange.runMethod(true,"setEnabled",main.__c.getField(true,"False"));
 };
 BA.debugLineNum = 1014;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btnbgcolor_click() throws Exception{
try {
		Debug.PushSubsStack("btnBgColor_Click (main) ","main",0,main.ba,main.mostCurrent,1016);
if (RapidSub.canDelegate("btnbgcolor_click")) { return b4j.example.main.remoteMe.runUserSub(false, "main","btnbgcolor_click");}
RemoteObject _bgcolorhex = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _bgnames = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
 BA.debugLineNum = 1016;BA.debugLine="Sub btnBgColor_Click";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 1017;BA.debugLine="Try";
Debug.ShouldStop(16777216);
try { BA.debugLineNum = 1018;BA.debugLine="Dim bgColorHex As List = Array As String(\"#00000";
Debug.ShouldStop(33554432);
_bgcolorhex = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_bgcolorhex = main.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("String",new int[] {5},new Object[] {BA.ObjectToString("#000000"),BA.ObjectToString("#404040"),BA.ObjectToString("#00008B"),BA.ObjectToString("#006400"),RemoteObject.createImmutable("#8B0000")})));Debug.locals.put("bgColorHex", _bgcolorhex);Debug.locals.put("bgColorHex", _bgcolorhex);
 BA.debugLineNum = 1019;BA.debugLine="Dim bgNames As List = Array As String(\"Black\", \"";
Debug.ShouldStop(67108864);
_bgnames = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_bgnames = main.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("String",new int[] {5},new Object[] {BA.ObjectToString("Black"),BA.ObjectToString("Gray"),BA.ObjectToString("Blue"),BA.ObjectToString("Green"),RemoteObject.createImmutable("Red")})));Debug.locals.put("bgNames", _bgnames);Debug.locals.put("bgNames", _bgnames);
 BA.debugLineNum = 1020;BA.debugLine="currentBgIndex = (currentBgIndex + 1) Mod bgColo";
Debug.ShouldStop(134217728);
main._currentbgindex = RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {main._currentbgindex,RemoteObject.createImmutable(1)}, "+",1, 1)),_bgcolorhex.runMethod(true,"getSize")}, "%",0, 1);
 BA.debugLineNum = 1021;BA.debugLine="pnlBackground.Style = \"-fx-background-color: \" &";
Debug.ShouldStop(268435456);
main._pnlbackground.runMethod(true,"setStyle",RemoteObject.concat(RemoteObject.createImmutable("-fx-background-color: "),_bgcolorhex.runMethod(false,"Get",(Object)(main._currentbgindex)),RemoteObject.createImmutable(";")));
 BA.debugLineNum = 1022;BA.debugLine="Log(\"BG Color: \" & bgNames.Get(currentBgIndex))";
Debug.ShouldStop(536870912);
main.__c.runVoidMethod ("LogImpl","21048582",RemoteObject.concat(RemoteObject.createImmutable("BG Color: "),_bgnames.runMethod(false,"Get",(Object)(main._currentbgindex))),0);
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e8) {
			BA.rdebugUtils.runVoidMethod("setLastException",main.ba, e8.toString()); BA.debugLineNum = 1024;BA.debugLine="Log(\"BG error: \" & LastException.Message)";
Debug.ShouldStop(-2147483648);
main.__c.runVoidMethod ("LogImpl","21048584",RemoteObject.concat(RemoteObject.createImmutable("BG error: "),main.__c.runMethod(false,"LastException",main.ba).runMethod(true,"getMessage")),0);
 };
 BA.debugLineNum = 1026;BA.debugLine="End Sub";
Debug.ShouldStop(2);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btnchangecity_click() throws Exception{
try {
		Debug.PushSubsStack("btnChangeCity_Click (main) ","main",0,main.ba,main.mostCurrent,1271);
if (RapidSub.canDelegate("btnchangecity_click")) { return b4j.example.main.remoteMe.runUserSub(false, "main","btnchangecity_click");}
RemoteObject _inputdialog = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
RemoteObject _editor = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
RemoteObject _result = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
RemoteObject _ispresent = RemoteObject.createImmutable(false);
RemoteObject _searchquery = RemoteObject.createImmutable("");
 BA.debugLineNum = 1271;BA.debugLine="Sub btnChangeCity_Click";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 1272;BA.debugLine="Try";
Debug.ShouldStop(8388608);
try { BA.debugLineNum = 1274;BA.debugLine="Dim inputDialog As JavaObject";
Debug.ShouldStop(33554432);
_inputdialog = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");Debug.locals.put("inputDialog", _inputdialog);
 BA.debugLineNum = 1275;BA.debugLine="inputDialog.InitializeNewInstance(\"javafx.scene.";
Debug.ShouldStop(67108864);
_inputdialog.runVoidMethod ("InitializeNewInstance",(Object)(BA.ObjectToString("javafx.scene.control.TextInputDialog")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(RemoteObject.createImmutable(""))})));
 BA.debugLineNum = 1276;BA.debugLine="inputDialog.RunMethod(\"setTitle\", Array(\"Change";
Debug.ShouldStop(134217728);
_inputdialog.runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("setTitle")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(RemoteObject.createImmutable("Change City"))})));
 BA.debugLineNum = 1277;BA.debugLine="inputDialog.RunMethod(\"setHeaderText\", Array(\"Se";
Debug.ShouldStop(268435456);
_inputdialog.runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("setHeaderText")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(RemoteObject.createImmutable("Search for your city"))})));
 BA.debugLineNum = 1278;BA.debugLine="inputDialog.RunMethod(\"setContentText\", Array(\"E";
Debug.ShouldStop(536870912);
_inputdialog.runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("setContentText")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(RemoteObject.createImmutable("Enter city name:"))})));
 BA.debugLineNum = 1281;BA.debugLine="Dim editor As JavaObject = inputDialog.RunMethod";
Debug.ShouldStop(1);
_editor = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_editor = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), _inputdialog.runMethod(false,"RunMethod",(Object)(BA.ObjectToString("getEditor")),(Object)((main.__c.getField(false,"Null")))));Debug.locals.put("editor", _editor);Debug.locals.put("editor", _editor);
 BA.debugLineNum = 1282;BA.debugLine="editor.RunMethod(\"setText\", Array(cityName))";
Debug.ShouldStop(2);
_editor.runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("setText")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(main._cityname)})));
 BA.debugLineNum = 1284;BA.debugLine="Dim result As JavaObject = inputDialog.RunMethod";
Debug.ShouldStop(8);
_result = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_result = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), _inputdialog.runMethod(false,"RunMethod",(Object)(BA.ObjectToString("showAndWait")),(Object)((main.__c.getField(false,"Null")))));Debug.locals.put("result", _result);Debug.locals.put("result", _result);
 BA.debugLineNum = 1285;BA.debugLine="Dim isPresent As Boolean = result.RunMethod(\"isP";
Debug.ShouldStop(16);
_ispresent = BA.ObjectToBoolean(_result.runMethod(false,"RunMethod",(Object)(BA.ObjectToString("isPresent")),(Object)((main.__c.getField(false,"Null")))));Debug.locals.put("isPresent", _ispresent);Debug.locals.put("isPresent", _ispresent);
 BA.debugLineNum = 1287;BA.debugLine="If isPresent Then";
Debug.ShouldStop(64);
if (_ispresent.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 1288;BA.debugLine="Dim searchQuery As String = result.RunMethod(\"g";
Debug.ShouldStop(128);
_searchquery = BA.ObjectToString(_result.runMethod(false,"RunMethod",(Object)(BA.ObjectToString("get")),(Object)((main.__c.getField(false,"Null")))));Debug.locals.put("searchQuery", _searchquery);Debug.locals.put("searchQuery", _searchquery);
 BA.debugLineNum = 1289;BA.debugLine="If searchQuery.Trim.Length > 0 Then";
Debug.ShouldStop(256);
if (RemoteObject.solveBoolean(">",_searchquery.runMethod(true,"trim").runMethod(true,"length"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 1290;BA.debugLine="SearchCity(searchQuery.Trim)  ' Now no conflic";
Debug.ShouldStop(512);
_searchcity(_searchquery.runMethod(true,"trim"));
 };
 };
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e18) {
			BA.rdebugUtils.runVoidMethod("setLastException",main.ba, e18.toString()); BA.debugLineNum = 1294;BA.debugLine="Log(\"City dialog error: \" & LastException.Messag";
Debug.ShouldStop(8192);
main.__c.runVoidMethod ("LogImpl","28060951",RemoteObject.concat(RemoteObject.createImmutable("City dialog error: "),main.__c.runMethod(false,"LastException",main.ba).runMethod(true,"getMessage")),0);
 };
 BA.debugLineNum = 1296;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btnclockmode_click() throws Exception{
try {
		Debug.PushSubsStack("btnClockMode_Click (main) ","main",0,main.ba,main.mostCurrent,920);
if (RapidSub.canDelegate("btnclockmode_click")) { return b4j.example.main.remoteMe.runUserSub(false, "main","btnclockmode_click");}
RemoteObject _rect = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XCanvas.B4XRect");
 BA.debugLineNum = 920;BA.debugLine="Sub btnClockMode_Click";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 921;BA.debugLine="Try";
Debug.ShouldStop(16777216);
try { BA.debugLineNum = 922;BA.debugLine="isAnalogMode = Not(isAnalogMode)";
Debug.ShouldStop(33554432);
main._isanalogmode = main.__c.runMethod(true,"Not",(Object)(main._isanalogmode));
 BA.debugLineNum = 924;BA.debugLine="If isAnalogMode Then";
Debug.ShouldStop(134217728);
if (main._isanalogmode.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 925;BA.debugLine="btnClockMode.Text = \"🕐 Analog\"";
Debug.ShouldStop(268435456);
main._btnclockmode.runMethod(true,"setText",BA.ObjectToString("🕐 Analog"));
 BA.debugLineNum = 928;BA.debugLine="lblClock.Visible = False";
Debug.ShouldStop(-2147483648);
main._lblclock.runMethod(true,"setVisible",main.__c.getField(true,"False"));
 BA.debugLineNum = 929;BA.debugLine="lblClock.Text = \"\"";
Debug.ShouldStop(1);
main._lblclock.runMethod(true,"setText",BA.ObjectToString(""));
 BA.debugLineNum = 932;BA.debugLine="pnlAnalogClock.Visible = True";
Debug.ShouldStop(8);
main._pnlanalogclock.runMethod(true,"setVisible",main.__c.getField(true,"True"));
 BA.debugLineNum = 935;BA.debugLine="CenterAllElements";
Debug.ShouldStop(64);
_centerallelements();
 BA.debugLineNum = 938;BA.debugLine="DrawAnalogClock";
Debug.ShouldStop(512);
_drawanalogclock();
 }else {
 BA.debugLineNum = 941;BA.debugLine="btnClockMode.Text = \"🔢 Digital\"";
Debug.ShouldStop(4096);
main._btnclockmode.runMethod(true,"setText",BA.ObjectToString("🔢 Digital"));
 BA.debugLineNum = 944;BA.debugLine="Dim rect As B4XRect";
Debug.ShouldStop(32768);
_rect = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XCanvas.B4XRect");Debug.locals.put("rect", _rect);
 BA.debugLineNum = 945;BA.debugLine="rect.Initialize(0, 0, pnlAnalogClock.prefWidth,";
Debug.ShouldStop(65536);
_rect.runVoidMethod ("Initialize",(Object)(BA.numberCast(float.class, 0)),(Object)(BA.numberCast(float.class, 0)),(Object)(BA.numberCast(float.class, main._pnlanalogclock.runMethod(true,"getPrefWidth"))),(Object)(BA.numberCast(float.class, main._pnlanalogclock.runMethod(true,"getPrefHeight"))));
 BA.debugLineNum = 946;BA.debugLine="cvsAnalogClock.ClearRect(rect)";
Debug.ShouldStop(131072);
main._cvsanalogclock.runVoidMethod ("ClearRect",(Object)(_rect));
 BA.debugLineNum = 947;BA.debugLine="cvsAnalogClock.Invalidate";
Debug.ShouldStop(262144);
main._cvsanalogclock.runVoidMethod ("Invalidate");
 BA.debugLineNum = 948;BA.debugLine="pnlAnalogClock.Visible = False";
Debug.ShouldStop(524288);
main._pnlanalogclock.runMethod(true,"setVisible",main.__c.getField(true,"False"));
 BA.debugLineNum = 951;BA.debugLine="lblClock.Visible = True";
Debug.ShouldStop(4194304);
main._lblclock.runMethod(true,"setVisible",main.__c.getField(true,"True"));
 BA.debugLineNum = 954;BA.debugLine="CenterAllElements";
Debug.ShouldStop(33554432);
_centerallelements();
 BA.debugLineNum = 957;BA.debugLine="UpdateClock";
Debug.ShouldStop(268435456);
_updateclock();
 };
 BA.debugLineNum = 960;BA.debugLine="Log(\"Clock mode changed to: \" & IIf(isAnalogMode";
Debug.ShouldStop(-2147483648);
main.__c.runVoidMethod ("LogImpl","2786472",RemoteObject.concat(RemoteObject.createImmutable("Clock mode changed to: "),((main._isanalogmode.<Boolean>get().booleanValue()) ? (RemoteObject.createImmutable(("Analog"))) : ((RemoteObject.createImmutable("Digital"))))),0);
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e23) {
			BA.rdebugUtils.runVoidMethod("setLastException",main.ba, e23.toString()); BA.debugLineNum = 962;BA.debugLine="Log(\"Clock mode error: \" & LastException.Message";
Debug.ShouldStop(2);
main.__c.runVoidMethod ("LogImpl","2786474",RemoteObject.concat(RemoteObject.createImmutable("Clock mode error: "),main.__c.runMethod(false,"LastException",main.ba).runMethod(true,"getMessage")),0);
 };
 BA.debugLineNum = 964;BA.debugLine="End Sub";
Debug.ShouldStop(8);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btnimagetimer_click() throws Exception{
try {
		Debug.PushSubsStack("btnImageTimer_Click (main) ","main",0,main.ba,main.mostCurrent,990);
if (RapidSub.canDelegate("btnimagetimer_click")) { return b4j.example.main.remoteMe.runUserSub(false, "main","btnimagetimer_click");}
 BA.debugLineNum = 990;BA.debugLine="Sub btnImageTimer_Click";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 991;BA.debugLine="currentImageInterval = (currentImageInterval + 1)";
Debug.ShouldStop(1073741824);
main._currentimageinterval = RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {main._currentimageinterval,RemoteObject.createImmutable(1)}, "+",1, 1)),main._imageintervals.runMethod(true,"getSize")}, "%",0, 1);
 BA.debugLineNum = 992;BA.debugLine="btnImageTimer.Text = \"⏱️ \" & imageIntervalNames.G";
Debug.ShouldStop(-2147483648);
main._btnimagetimer.runMethod(true,"setText",RemoteObject.concat(RemoteObject.createImmutable("⏱️ "),main._imageintervalnames.runMethod(false,"Get",(Object)(main._currentimageinterval))));
 BA.debugLineNum = 993;BA.debugLine="If currentImageInterval = 0 Then";
Debug.ShouldStop(1);
if (RemoteObject.solveBoolean("=",main._currentimageinterval,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 994;BA.debugLine="timImageChange.Enabled = False";
Debug.ShouldStop(2);
main._timimagechange.runMethod(true,"setEnabled",main.__c.getField(true,"False"));
 }else {
 BA.debugLineNum = 996;BA.debugLine="timImageChange.Enabled = True";
Debug.ShouldStop(8);
main._timimagechange.runMethod(true,"setEnabled",main.__c.getField(true,"True"));
 BA.debugLineNum = 997;BA.debugLine="lastImageChangeTime = DateTime.Now / 1000";
Debug.ShouldStop(16);
main._lastimagechangetime = BA.numberCast(long.class, RemoteObject.solve(new RemoteObject[] {main.__c.getField(false,"DateTime").runMethod(true,"getNow"),RemoteObject.createImmutable(1000)}, "/",0, 0));
 };
 BA.debugLineNum = 999;BA.debugLine="End Sub";
Debug.ShouldStop(64);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btninfopanel_click() throws Exception{
try {
		Debug.PushSubsStack("btnInfoPanel_Click (main) ","main",0,main.ba,main.mostCurrent,1078);
if (RapidSub.canDelegate("btninfopanel_click")) { return b4j.example.main.remoteMe.runUserSub(false, "main","btninfopanel_click");}
 BA.debugLineNum = 1078;BA.debugLine="Sub btnInfoPanel_Click";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 1079;BA.debugLine="Try";
Debug.ShouldStop(4194304);
try { BA.debugLineNum = 1080;BA.debugLine="showInfoPanel = Not(showInfoPanel)";
Debug.ShouldStop(8388608);
main._showinfopanel = main.__c.runMethod(true,"Not",(Object)(main._showinfopanel));
 BA.debugLineNum = 1081;BA.debugLine="pnlInfoOverlay.Visible = showInfoPanel";
Debug.ShouldStop(16777216);
main._pnlinfooverlay.runMethod(true,"setVisible",main._showinfopanel);
 BA.debugLineNum = 1083;BA.debugLine="If showInfoPanel Then";
Debug.ShouldStop(67108864);
if (main._showinfopanel.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 1084;BA.debugLine="btnInfoPanel.Text = \"📋 Info\"";
Debug.ShouldStop(134217728);
main._btninfopanel.runMethod(true,"setText",BA.ObjectToString("📋 Info"));
 }else {
 BA.debugLineNum = 1086;BA.debugLine="btnInfoPanel.Text = \"📋 Show\"";
Debug.ShouldStop(536870912);
main._btninfopanel.runMethod(true,"setText",BA.ObjectToString("📋 Show"));
 };
 BA.debugLineNum = 1090;BA.debugLine="CenterAllElements";
Debug.ShouldStop(2);
_centerallelements();
 BA.debugLineNum = 1093;BA.debugLine="If isAnalogMode Then";
Debug.ShouldStop(16);
if (main._isanalogmode.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 1094;BA.debugLine="DrawAnalogClock";
Debug.ShouldStop(32);
_drawanalogclock();
 };
 BA.debugLineNum = 1097;BA.debugLine="Log(\"Info panel toggled: \" & showInfoPanel)";
Debug.ShouldStop(256);
main.__c.runVoidMethod ("LogImpl","27733267",RemoteObject.concat(RemoteObject.createImmutable("Info panel toggled: "),main._showinfopanel),0);
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e15) {
			BA.rdebugUtils.runVoidMethod("setLastException",main.ba, e15.toString()); BA.debugLineNum = 1099;BA.debugLine="Log(\"Info panel toggle error: \" & LastException.";
Debug.ShouldStop(1024);
main.__c.runVoidMethod ("LogImpl","27733269",RemoteObject.concat(RemoteObject.createImmutable("Info panel toggle error: "),main.__c.runMethod(false,"LastException",main.ba).runMethod(true,"getMessage")),0);
 };
 BA.debugLineNum = 1101;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btnlanguage_click() throws Exception{
try {
		Debug.PushSubsStack("btnLanguage_Click (main) ","main",0,main.ba,main.mostCurrent,1043);
if (RapidSub.canDelegate("btnlanguage_click")) { return b4j.example.main.remoteMe.runUserSub(false, "main","btnlanguage_click");}
RemoteObject _prayernames = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
int _i = 0;
RemoteObject _pnlcard = RemoteObject.declareNull("anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper");
RemoteObject _lblname = RemoteObject.declareNull("anywheresoftware.b4j.objects.LabelWrapper");
 BA.debugLineNum = 1043;BA.debugLine="Sub btnLanguage_Click";
Debug.ShouldStop(262144);
 BA.debugLineNum = 1044;BA.debugLine="Try";
Debug.ShouldStop(524288);
try { BA.debugLineNum = 1045;BA.debugLine="Select currentLanguage";
Debug.ShouldStop(1048576);
switch (BA.switchObjectToInt(main._currentlanguage,BA.ObjectToString("en"),BA.ObjectToString("fr"),BA.ObjectToString("ar"))) {
case 0: {
 BA.debugLineNum = 1047;BA.debugLine="currentLanguage = \"fr\"";
Debug.ShouldStop(4194304);
main._currentlanguage = BA.ObjectToString("fr");
 BA.debugLineNum = 1048;BA.debugLine="btnLanguage.Text = \"🌐 FR\"";
Debug.ShouldStop(8388608);
main._btnlanguage.runMethod(true,"setText",BA.ObjectToString("🌐 FR"));
 break; }
case 1: {
 BA.debugLineNum = 1050;BA.debugLine="currentLanguage = \"ar\"";
Debug.ShouldStop(33554432);
main._currentlanguage = BA.ObjectToString("ar");
 BA.debugLineNum = 1051;BA.debugLine="btnLanguage.Text = \"🌐 AR\"";
Debug.ShouldStop(67108864);
main._btnlanguage.runMethod(true,"setText",BA.ObjectToString("🌐 AR"));
 break; }
case 2: {
 BA.debugLineNum = 1053;BA.debugLine="currentLanguage = \"en\"";
Debug.ShouldStop(268435456);
main._currentlanguage = BA.ObjectToString("en");
 BA.debugLineNum = 1054;BA.debugLine="btnLanguage.Text = \"🌐 EN\"";
Debug.ShouldStop(536870912);
main._btnlanguage.runMethod(true,"setText",BA.ObjectToString("🌐 EN"));
 break; }
}
;
 BA.debugLineNum = 1057;BA.debugLine="FetchPrayerTimes";
Debug.ShouldStop(1);
_fetchprayertimes();
 BA.debugLineNum = 1058;BA.debugLine="UpdateClock";
Debug.ShouldStop(2);
_updateclock();
 BA.debugLineNum = 1061;BA.debugLine="Dim prayerNames As List = Array As String(\"fajr\"";
Debug.ShouldStop(16);
_prayernames = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_prayernames = main.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("String",new int[] {6},new Object[] {BA.ObjectToString("fajr"),BA.ObjectToString("sunrise"),BA.ObjectToString("dhuhr"),BA.ObjectToString("asr"),BA.ObjectToString("maghrib"),RemoteObject.createImmutable("isha")})));Debug.locals.put("prayerNames", _prayernames);Debug.locals.put("prayerNames", _prayernames);
 BA.debugLineNum = 1062;BA.debugLine="For i = 0 To 5";
Debug.ShouldStop(32);
{
final int step16 = 1;
final int limit16 = 5;
_i = 0 ;
for (;(step16 > 0 && _i <= limit16) || (step16 < 0 && _i >= limit16) ;_i = ((int)(0 + _i + step16))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 1063;BA.debugLine="If pnlPrayerCards.NumberOfNodes > 0 Then";
Debug.ShouldStop(64);
if (RemoteObject.solveBoolean(">",main._pnlprayercards.runMethod(true,"getNumberOfNodes"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 1064;BA.debugLine="Dim pnlCard As Pane = pnlPrayerCards.GetNode(i";
Debug.ShouldStop(128);
_pnlcard = RemoteObject.createNew ("anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper");
_pnlcard = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper"), main._pnlprayercards.runMethod(false,"GetNode",(Object)(BA.numberCast(int.class, _i))).getObject());Debug.locals.put("pnlCard", _pnlcard);Debug.locals.put("pnlCard", _pnlcard);
 BA.debugLineNum = 1065;BA.debugLine="If pnlCard.NumberOfNodes > 1 Then";
Debug.ShouldStop(256);
if (RemoteObject.solveBoolean(">",_pnlcard.runMethod(true,"getNumberOfNodes"),BA.numberCast(double.class, 1))) { 
 BA.debugLineNum = 1066;BA.debugLine="Dim lblName As Label = pnlCard.GetNode(1)";
Debug.ShouldStop(512);
_lblname = RemoteObject.createNew ("anywheresoftware.b4j.objects.LabelWrapper");
_lblname = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.LabelWrapper"), _pnlcard.runMethod(false,"GetNode",(Object)(BA.numberCast(int.class, 1))).getObject());Debug.locals.put("lblName", _lblname);Debug.locals.put("lblName", _lblname);
 BA.debugLineNum = 1067;BA.debugLine="lblName.Text = GetTranslation(prayerNames.Get";
Debug.ShouldStop(1024);
_lblname.runMethod(true,"setText",_gettranslation(BA.ObjectToString(_prayernames.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))))));
 };
 };
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 1072;BA.debugLine="Log(\"Language changed to: \" & currentLanguage)";
Debug.ShouldStop(32768);
main.__c.runVoidMethod ("LogImpl","25701661",RemoteObject.concat(RemoteObject.createImmutable("Language changed to: "),main._currentlanguage),0);
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e27) {
			BA.rdebugUtils.runVoidMethod("setLastException",main.ba, e27.toString()); BA.debugLineNum = 1074;BA.debugLine="Log(\"Language switch error: \" & LastException.Me";
Debug.ShouldStop(131072);
main.__c.runVoidMethod ("LogImpl","25701663",RemoteObject.concat(RemoteObject.createImmutable("Language switch error: "),main.__c.runMethod(false,"LastException",main.ba).runMethod(true,"getMessage")),0);
 };
 BA.debugLineNum = 1076;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btnprayertoggle_click() throws Exception{
try {
		Debug.PushSubsStack("btnPrayerToggle_Click (main) ","main",0,main.ba,main.mostCurrent,1028);
if (RapidSub.canDelegate("btnprayertoggle_click")) { return b4j.example.main.remoteMe.runUserSub(false, "main","btnprayertoggle_click");}
 BA.debugLineNum = 1028;BA.debugLine="Sub btnPrayerToggle_Click";
Debug.ShouldStop(8);
 BA.debugLineNum = 1029;BA.debugLine="Try";
Debug.ShouldStop(16);
try { BA.debugLineNum = 1030;BA.debugLine="showPrayerTimes = Not(showPrayerTimes)";
Debug.ShouldStop(32);
main._showprayertimes = main.__c.runMethod(true,"Not",(Object)(main._showprayertimes));
 BA.debugLineNum = 1031;BA.debugLine="pnlPrayerCards.Visible = showPrayerTimes";
Debug.ShouldStop(64);
main._pnlprayercards.runMethod(true,"setVisible",main._showprayertimes);
 BA.debugLineNum = 1032;BA.debugLine="If showPrayerTimes Then";
Debug.ShouldStop(128);
if (main._showprayertimes.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 1033;BA.debugLine="btnPrayerToggle.Text = \"🕌 Prayer ON\"";
Debug.ShouldStop(256);
main._btnprayertoggle.runMethod(true,"setText",BA.ObjectToString("🕌 Prayer ON"));
 }else {
 BA.debugLineNum = 1035;BA.debugLine="btnPrayerToggle.Text = \"🕌 Prayer OFF\"";
Debug.ShouldStop(1024);
main._btnprayertoggle.runMethod(true,"setText",BA.ObjectToString("🕌 Prayer OFF"));
 };
 BA.debugLineNum = 1037;BA.debugLine="Log(\"Prayer times visibility: \" & showPrayerTime";
Debug.ShouldStop(4096);
main.__c.runVoidMethod ("LogImpl","25636105",RemoteObject.concat(RemoteObject.createImmutable("Prayer times visibility: "),main._showprayertimes),0);
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e11) {
			BA.rdebugUtils.runVoidMethod("setLastException",main.ba, e11.toString()); BA.debugLineNum = 1039;BA.debugLine="Log(\"Prayer toggle error: \" & LastException.Mess";
Debug.ShouldStop(16384);
main.__c.runVoidMethod ("LogImpl","25636107",RemoteObject.concat(RemoteObject.createImmutable("Prayer toggle error: "),main.__c.runMethod(false,"LastException",main.ba).runMethod(true,"getMessage")),0);
 };
 BA.debugLineNum = 1041;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btnsettings_click() throws Exception{
try {
		Debug.PushSubsStack("btnSettings_Click (main) ","main",0,main.ba,main.mostCurrent,915);
if (RapidSub.canDelegate("btnsettings_click")) { return b4j.example.main.remoteMe.runUserSub(false, "main","btnsettings_click");}
 BA.debugLineNum = 915;BA.debugLine="Sub btnSettings_Click";
Debug.ShouldStop(262144);
 BA.debugLineNum = 916;BA.debugLine="settingsVisible = Not(settingsVisible)";
Debug.ShouldStop(524288);
main._settingsvisible = main.__c.runMethod(true,"Not",(Object)(main._settingsvisible));
 BA.debugLineNum = 917;BA.debugLine="pnlSettings.Visible = settingsVisible";
Debug.ShouldStop(1048576);
main._pnlsettings.runMethod(true,"setVisible",main._settingsvisible);
 BA.debugLineNum = 918;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btntheme_click() throws Exception{
try {
		Debug.PushSubsStack("btnTheme_Click (main) ","main",0,main.ba,main.mostCurrent,970);
if (RapidSub.canDelegate("btntheme_click")) { return b4j.example.main.remoteMe.runUserSub(false, "main","btntheme_click");}
RemoteObject _scheme = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _themename = RemoteObject.createImmutable("");
RemoteObject _themepaint = RemoteObject.declareNull("Object");
RemoteObject _themeint = RemoteObject.createImmutable(0);
RemoteObject _r = RemoteObject.createImmutable(0);
RemoteObject _g = RemoteObject.createImmutable(0);
RemoteObject _b = RemoteObject.createImmutable(0);
 BA.debugLineNum = 970;BA.debugLine="Sub btnTheme_Click";
Debug.ShouldStop(512);
 BA.debugLineNum = 971;BA.debugLine="currentThemeIndex = (currentThemeIndex + 1) Mod c";
Debug.ShouldStop(1024);
main._currentthemeindex = RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {main._currentthemeindex,RemoteObject.createImmutable(1)}, "+",1, 1)),main._colorschemes.runMethod(true,"getSize")}, "%",0, 1);
 BA.debugLineNum = 972;BA.debugLine="Dim scheme As Map = colorSchemes.Get(currentTheme";
Debug.ShouldStop(2048);
_scheme = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_scheme = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), main._colorschemes.runMethod(false,"Get",(Object)(main._currentthemeindex)));Debug.locals.put("scheme", _scheme);Debug.locals.put("scheme", _scheme);
 BA.debugLineNum = 973;BA.debugLine="Dim themeName As String = scheme.Get(\"name\")";
Debug.ShouldStop(4096);
_themename = BA.ObjectToString(_scheme.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("name")))));Debug.locals.put("themeName", _themename);Debug.locals.put("themeName", _themename);
 BA.debugLineNum = 974;BA.debugLine="Dim themePaint As Object = scheme.Get(\"paint\")";
Debug.ShouldStop(8192);
_themepaint = _scheme.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("paint"))));Debug.locals.put("themePaint", _themepaint);Debug.locals.put("themePaint", _themepaint);
 BA.debugLineNum = 975;BA.debugLine="Dim themeInt As Int = scheme.Get(\"int\")";
Debug.ShouldStop(16384);
_themeint = BA.numberCast(int.class, _scheme.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("int")))));Debug.locals.put("themeInt", _themeint);Debug.locals.put("themeInt", _themeint);
 BA.debugLineNum = 977;BA.debugLine="If themeName = \"Random\" Then";
Debug.ShouldStop(65536);
if (RemoteObject.solveBoolean("=",_themename,BA.ObjectToString("Random"))) { 
 BA.debugLineNum = 978;BA.debugLine="Dim r As Int = Rnd(0, 256)";
Debug.ShouldStop(131072);
_r = main.__c.runMethod(true,"Rnd",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 256)));Debug.locals.put("r", _r);Debug.locals.put("r", _r);
 BA.debugLineNum = 979;BA.debugLine="Dim g As Int = Rnd(0, 256)";
Debug.ShouldStop(262144);
_g = main.__c.runMethod(true,"Rnd",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 256)));Debug.locals.put("g", _g);Debug.locals.put("g", _g);
 BA.debugLineNum = 980;BA.debugLine="Dim b As Int = Rnd(0, 256)";
Debug.ShouldStop(524288);
_b = main.__c.runMethod(true,"Rnd",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 256)));Debug.locals.put("b", _b);Debug.locals.put("b", _b);
 BA.debugLineNum = 981;BA.debugLine="themePaint = fx.Colors.RGB(r, g, b)";
Debug.ShouldStop(1048576);
_themepaint = (main._fx.getField(false,"Colors").runMethod(false,"RGB",(Object)(_r),(Object)(_g),(Object)(_b)));Debug.locals.put("themePaint", _themepaint);
 BA.debugLineNum = 982;BA.debugLine="themeInt = xui.Color_RGB(r, g, b)";
Debug.ShouldStop(2097152);
_themeint = main._xui.runMethod(true,"Color_RGB",(Object)(_r),(Object)(_g),(Object)(_b));Debug.locals.put("themeInt", _themeint);
 };
 BA.debugLineNum = 985;BA.debugLine="lblClock.TextColor = themePaint";
Debug.ShouldStop(16777216);
main._lblclock.runMethod(false,"setTextColor",(_themepaint));
 BA.debugLineNum = 986;BA.debugLine="currentClockColor = themeInt";
Debug.ShouldStop(33554432);
main._currentclockcolor = _themeint;
 BA.debugLineNum = 987;BA.debugLine="btnTheme.Text = \"🎨 \" & themeName";
Debug.ShouldStop(67108864);
main._btntheme.runMethod(true,"setText",RemoteObject.concat(RemoteObject.createImmutable("🎨 "),_themename));
 BA.debugLineNum = 988;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _centerallelements() throws Exception{
try {
		Debug.PushSubsStack("CenterAllElements (main) ","main",0,main.ba,main.mostCurrent,268);
if (RapidSub.canDelegate("centerallelements")) { return b4j.example.main.remoteMe.runUserSub(false, "main","centerallelements");}
RemoteObject _w = RemoteObject.createImmutable(0);
RemoteObject _h = RemoteObject.createImmutable(0);
RemoteObject _clockwidth = RemoteObject.createImmutable(0);
RemoteObject _clockheight = RemoteObject.createImmutable(0);
RemoteObject _analogsize = RemoteObject.createImmutable(0);
RemoteObject _overlaywidth = RemoteObject.createImmutable(0);
RemoteObject _overlayheight = RemoteObject.createImmutable(0);
RemoteObject _weathertotalwidth = RemoteObject.createImmutable(0);
RemoteObject _weatherstartx = RemoteObject.createImmutable(0);
RemoteObject _prayertotalwidth = RemoteObject.createImmutable(0);
RemoteObject _prayercardswidth = RemoteObject.createImmutable(0);
RemoteObject _settingswidth = RemoteObject.createImmutable(0);
 BA.debugLineNum = 268;BA.debugLine="Sub CenterAllElements";
Debug.ShouldStop(2048);
 BA.debugLineNum = 269;BA.debugLine="Try";
Debug.ShouldStop(4096);
try { BA.debugLineNum = 270;BA.debugLine="Dim w As Double = MainForm.Width";
Debug.ShouldStop(8192);
_w = main._mainform.runMethod(true,"getWidth");Debug.locals.put("w", _w);Debug.locals.put("w", _w);
 BA.debugLineNum = 271;BA.debugLine="Dim h As Double = MainForm.Height";
Debug.ShouldStop(16384);
_h = main._mainform.runMethod(true,"getHeight");Debug.locals.put("h", _h);Debug.locals.put("h", _h);
 BA.debugLineNum = 273;BA.debugLine="Log(\"Screen resolution: \" & w & \"x\" & h)";
Debug.ShouldStop(65536);
main.__c.runVoidMethod ("LogImpl","2196613",RemoteObject.concat(RemoteObject.createImmutable("Screen resolution: "),_w,RemoteObject.createImmutable("x"),_h),0);
 BA.debugLineNum = 276;BA.debugLine="ClearAllClocks";
Debug.ShouldStop(524288);
_clearallclocks();
 BA.debugLineNum = 279;BA.debugLine="pnlBackground.prefWidth = w";
Debug.ShouldStop(4194304);
main._pnlbackground.runMethod(true,"setPrefWidth",_w);
 BA.debugLineNum = 280;BA.debugLine="pnlBackground.prefHeight = h";
Debug.ShouldStop(8388608);
main._pnlbackground.runMethod(true,"setPrefHeight",_h);
 BA.debugLineNum = 281;BA.debugLine="pnlBackground.Left = 0";
Debug.ShouldStop(16777216);
main._pnlbackground.runMethod(true,"setLeft",BA.numberCast(double.class, 0));
 BA.debugLineNum = 282;BA.debugLine="pnlBackground.Top = 0";
Debug.ShouldStop(33554432);
main._pnlbackground.runMethod(true,"setTop",BA.numberCast(double.class, 0));
 BA.debugLineNum = 284;BA.debugLine="If imgView <> Null Then";
Debug.ShouldStop(134217728);
if (RemoteObject.solveBoolean("N",main._imgview)) { 
 BA.debugLineNum = 285;BA.debugLine="imgView.prefWidth = w";
Debug.ShouldStop(268435456);
main._imgview.runMethod(true,"setPrefWidth",_w);
 BA.debugLineNum = 286;BA.debugLine="imgView.prefHeight = h";
Debug.ShouldStop(536870912);
main._imgview.runMethod(true,"setPrefHeight",_h);
 BA.debugLineNum = 287;BA.debugLine="imgView.Left = 0";
Debug.ShouldStop(1073741824);
main._imgview.runMethod(true,"setLeft",BA.numberCast(double.class, 0));
 BA.debugLineNum = 288;BA.debugLine="imgView.Top = 0";
Debug.ShouldStop(-2147483648);
main._imgview.runMethod(true,"setTop",BA.numberCast(double.class, 0));
 };
 BA.debugLineNum = 292;BA.debugLine="Dim clockWidth As Double = w * 0.8";
Debug.ShouldStop(8);
_clockwidth = RemoteObject.solve(new RemoteObject[] {_w,RemoteObject.createImmutable(0.8)}, "*",0, 0);Debug.locals.put("clockWidth", _clockwidth);Debug.locals.put("clockWidth", _clockwidth);
 BA.debugLineNum = 293;BA.debugLine="If clockWidth > 1000 Then clockWidth = 1000";
Debug.ShouldStop(16);
if (RemoteObject.solveBoolean(">",_clockwidth,BA.numberCast(double.class, 1000))) { 
_clockwidth = BA.numberCast(double.class, 1000);Debug.locals.put("clockWidth", _clockwidth);};
 BA.debugLineNum = 294;BA.debugLine="Dim clockHeight As Double = 120";
Debug.ShouldStop(32);
_clockheight = BA.numberCast(double.class, 120);Debug.locals.put("clockHeight", _clockheight);Debug.locals.put("clockHeight", _clockheight);
 BA.debugLineNum = 297;BA.debugLine="If Not(showInfoPanel) Then";
Debug.ShouldStop(256);
if (main.__c.runMethod(true,"Not",(Object)(main._showinfopanel)).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 298;BA.debugLine="lblClock.TextSize = 128 ' Larger font";
Debug.ShouldStop(512);
main._lblclock.runMethod(true,"setTextSize",BA.numberCast(double.class, 128));
 BA.debugLineNum = 299;BA.debugLine="clockHeight = 150";
Debug.ShouldStop(1024);
_clockheight = BA.numberCast(double.class, 150);Debug.locals.put("clockHeight", _clockheight);
 BA.debugLineNum = 300;BA.debugLine="lblClock.Left = (w - clockWidth) / 2";
Debug.ShouldStop(2048);
main._lblclock.runMethod(true,"setLeft",RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {_w,_clockwidth}, "-",1, 0)),RemoteObject.createImmutable(2)}, "/",0, 0));
 BA.debugLineNum = 301;BA.debugLine="lblClock.Top = (h - clockHeight) / 2 ' Perfect";
Debug.ShouldStop(4096);
main._lblclock.runMethod(true,"setTop",RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {_h,_clockheight}, "-",1, 0)),RemoteObject.createImmutable(2)}, "/",0, 0));
 }else {
 BA.debugLineNum = 303;BA.debugLine="lblClock.TextSize = 96 ' Normal font";
Debug.ShouldStop(16384);
main._lblclock.runMethod(true,"setTextSize",BA.numberCast(double.class, 96));
 BA.debugLineNum = 304;BA.debugLine="clockHeight = 120";
Debug.ShouldStop(32768);
_clockheight = BA.numberCast(double.class, 120);Debug.locals.put("clockHeight", _clockheight);
 BA.debugLineNum = 305;BA.debugLine="lblClock.Left = (w - clockWidth) / 2";
Debug.ShouldStop(65536);
main._lblclock.runMethod(true,"setLeft",RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {_w,_clockwidth}, "-",1, 0)),RemoteObject.createImmutable(2)}, "/",0, 0));
 BA.debugLineNum = 306;BA.debugLine="lblClock.Top = (h * 0.25) ' 25% from top";
Debug.ShouldStop(131072);
main._lblclock.runMethod(true,"setTop",(RemoteObject.solve(new RemoteObject[] {_h,RemoteObject.createImmutable(0.25)}, "*",0, 0)));
 };
 BA.debugLineNum = 309;BA.debugLine="lblClock.prefWidth = clockWidth";
Debug.ShouldStop(1048576);
main._lblclock.runMethod(true,"setPrefWidth",_clockwidth);
 BA.debugLineNum = 310;BA.debugLine="lblClock.prefHeight = clockHeight";
Debug.ShouldStop(2097152);
main._lblclock.runMethod(true,"setPrefHeight",_clockheight);
 BA.debugLineNum = 313;BA.debugLine="Dim analogSize As Double";
Debug.ShouldStop(16777216);
_analogsize = RemoteObject.createImmutable(0);Debug.locals.put("analogSize", _analogsize);
 BA.debugLineNum = 316;BA.debugLine="If Not(showInfoPanel) Then";
Debug.ShouldStop(134217728);
if (main.__c.runMethod(true,"Not",(Object)(main._showinfopanel)).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 317;BA.debugLine="analogSize = Min(w, h) * 0.5 ' 50% of screen (L";
Debug.ShouldStop(268435456);
_analogsize = RemoteObject.solve(new RemoteObject[] {main.__c.runMethod(true,"Min",(Object)(_w),(Object)(_h)),RemoteObject.createImmutable(0.5)}, "*",0, 0);Debug.locals.put("analogSize", _analogsize);
 BA.debugLineNum = 318;BA.debugLine="If analogSize > 700 Then analogSize = 700 ' Max";
Debug.ShouldStop(536870912);
if (RemoteObject.solveBoolean(">",_analogsize,BA.numberCast(double.class, 700))) { 
_analogsize = BA.numberCast(double.class, 700);Debug.locals.put("analogSize", _analogsize);};
 BA.debugLineNum = 319;BA.debugLine="If analogSize < 400 Then analogSize = 400 ' Min";
Debug.ShouldStop(1073741824);
if (RemoteObject.solveBoolean("<",_analogsize,BA.numberCast(double.class, 400))) { 
_analogsize = BA.numberCast(double.class, 400);Debug.locals.put("analogSize", _analogsize);};
 BA.debugLineNum = 321;BA.debugLine="pnlAnalogClock.Left = (w - analogSize) / 2";
Debug.ShouldStop(1);
main._pnlanalogclock.runMethod(true,"setLeft",RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {_w,_analogsize}, "-",1, 0)),RemoteObject.createImmutable(2)}, "/",0, 0));
 BA.debugLineNum = 322;BA.debugLine="pnlAnalogClock.Top = (h - analogSize) / 2 ' Per";
Debug.ShouldStop(2);
main._pnlanalogclock.runMethod(true,"setTop",RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {_h,_analogsize}, "-",1, 0)),RemoteObject.createImmutable(2)}, "/",0, 0));
 }else {
 BA.debugLineNum = 324;BA.debugLine="analogSize = Min(w, h) * 0.25 ' 25% of screen (";
Debug.ShouldStop(8);
_analogsize = RemoteObject.solve(new RemoteObject[] {main.__c.runMethod(true,"Min",(Object)(_w),(Object)(_h)),RemoteObject.createImmutable(0.25)}, "*",0, 0);Debug.locals.put("analogSize", _analogsize);
 BA.debugLineNum = 325;BA.debugLine="If analogSize < 250 Then analogSize = 250 ' Min";
Debug.ShouldStop(16);
if (RemoteObject.solveBoolean("<",_analogsize,BA.numberCast(double.class, 250))) { 
_analogsize = BA.numberCast(double.class, 250);Debug.locals.put("analogSize", _analogsize);};
 BA.debugLineNum = 326;BA.debugLine="If analogSize > 450 Then analogSize = 450 ' Max";
Debug.ShouldStop(32);
if (RemoteObject.solveBoolean(">",_analogsize,BA.numberCast(double.class, 450))) { 
_analogsize = BA.numberCast(double.class, 450);Debug.locals.put("analogSize", _analogsize);};
 BA.debugLineNum = 328;BA.debugLine="pnlAnalogClock.Left = (w - analogSize) / 2";
Debug.ShouldStop(128);
main._pnlanalogclock.runMethod(true,"setLeft",RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {_w,_analogsize}, "-",1, 0)),RemoteObject.createImmutable(2)}, "/",0, 0));
 BA.debugLineNum = 329;BA.debugLine="pnlAnalogClock.Top = (h * 0.15) ' 15% from top";
Debug.ShouldStop(256);
main._pnlanalogclock.runMethod(true,"setTop",(RemoteObject.solve(new RemoteObject[] {_h,RemoteObject.createImmutable(0.15)}, "*",0, 0)));
 };
 BA.debugLineNum = 332;BA.debugLine="pnlAnalogClock.prefWidth = analogSize";
Debug.ShouldStop(2048);
main._pnlanalogclock.runMethod(true,"setPrefWidth",_analogsize);
 BA.debugLineNum = 333;BA.debugLine="pnlAnalogClock.prefHeight = analogSize";
Debug.ShouldStop(4096);
main._pnlanalogclock.runMethod(true,"setPrefHeight",_analogsize);
 BA.debugLineNum = 336;BA.debugLine="Try";
Debug.ShouldStop(32768);
try { BA.debugLineNum = 337;BA.debugLine="cvsAnalogClock.Release";
Debug.ShouldStop(65536);
main._cvsanalogclock.runVoidMethod ("Release");
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e51) {
			BA.rdebugUtils.runVoidMethod("setLastException",main.ba, e51.toString()); };
 BA.debugLineNum = 341;BA.debugLine="cvsAnalogClock.Initialize(pnlAnalogClock)";
Debug.ShouldStop(1048576);
main._cvsanalogclock.runVoidMethod ("Initialize",main.ba,RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), main._pnlanalogclock.getObject()));
 BA.debugLineNum = 344;BA.debugLine="If showInfoPanel Then";
Debug.ShouldStop(8388608);
if (main._showinfopanel.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 345;BA.debugLine="Dim overlayWidth As Double = Min(1180, w - 100)";
Debug.ShouldStop(16777216);
_overlaywidth = main.__c.runMethod(true,"Min",(Object)(BA.numberCast(double.class, 1180)),(Object)(RemoteObject.solve(new RemoteObject[] {_w,RemoteObject.createImmutable(100)}, "-",1, 0)));Debug.locals.put("overlayWidth", _overlaywidth);Debug.locals.put("overlayWidth", _overlaywidth);
 BA.debugLineNum = 346;BA.debugLine="Dim overlayHeight As Double = 280";
Debug.ShouldStop(33554432);
_overlayheight = BA.numberCast(double.class, 280);Debug.locals.put("overlayHeight", _overlayheight);Debug.locals.put("overlayHeight", _overlayheight);
 BA.debugLineNum = 348;BA.debugLine="pnlInfoOverlay.prefWidth = overlayWidth";
Debug.ShouldStop(134217728);
main._pnlinfooverlay.runMethod(true,"setPrefWidth",_overlaywidth);
 BA.debugLineNum = 349;BA.debugLine="pnlInfoOverlay.prefHeight = overlayHeight";
Debug.ShouldStop(268435456);
main._pnlinfooverlay.runMethod(true,"setPrefHeight",_overlayheight);
 BA.debugLineNum = 350;BA.debugLine="pnlInfoOverlay.Left = (w - overlayWidth) / 2";
Debug.ShouldStop(536870912);
main._pnlinfooverlay.runMethod(true,"setLeft",RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {_w,_overlaywidth}, "-",1, 0)),RemoteObject.createImmutable(2)}, "/",0, 0));
 BA.debugLineNum = 351;BA.debugLine="pnlInfoOverlay.Top = (h * 0.6)";
Debug.ShouldStop(1073741824);
main._pnlinfooverlay.runMethod(true,"setTop",(RemoteObject.solve(new RemoteObject[] {_h,RemoteObject.createImmutable(0.6)}, "*",0, 0)));
 BA.debugLineNum = 354;BA.debugLine="If pnlInfoOverlay.Top + overlayHeight > h - 20";
Debug.ShouldStop(2);
if (RemoteObject.solveBoolean(">",RemoteObject.solve(new RemoteObject[] {main._pnlinfooverlay.runMethod(true,"getTop"),_overlayheight}, "+",1, 0),RemoteObject.solve(new RemoteObject[] {_h,RemoteObject.createImmutable(20)}, "-",1, 0))) { 
 BA.debugLineNum = 355;BA.debugLine="pnlInfoOverlay.Top = h - overlayHeight - 20";
Debug.ShouldStop(4);
main._pnlinfooverlay.runMethod(true,"setTop",RemoteObject.solve(new RemoteObject[] {_h,_overlayheight,RemoteObject.createImmutable(20)}, "--",2, 0));
 };
 BA.debugLineNum = 359;BA.debugLine="Dim weatherTotalWidth As Double = 670";
Debug.ShouldStop(64);
_weathertotalwidth = BA.numberCast(double.class, 670);Debug.locals.put("weatherTotalWidth", _weathertotalwidth);Debug.locals.put("weatherTotalWidth", _weathertotalwidth);
 BA.debugLineNum = 360;BA.debugLine="Dim weatherStartX As Double = (overlayWidth - w";
Debug.ShouldStop(128);
_weatherstartx = RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {_overlaywidth,_weathertotalwidth}, "-",1, 0)),RemoteObject.createImmutable(2)}, "/",0, 0);Debug.locals.put("weatherStartX", _weatherstartx);Debug.locals.put("weatherStartX", _weatherstartx);
 BA.debugLineNum = 362;BA.debugLine="lblWeatherIcon.Left = weatherStartX";
Debug.ShouldStop(512);
main._lblweathericon.runMethod(true,"setLeft",_weatherstartx);
 BA.debugLineNum = 363;BA.debugLine="lblTemperature.Left = weatherStartX + 120";
Debug.ShouldStop(1024);
main._lbltemperature.runMethod(true,"setLeft",RemoteObject.solve(new RemoteObject[] {_weatherstartx,RemoteObject.createImmutable(120)}, "+",1, 0));
 BA.debugLineNum = 364;BA.debugLine="lblWeatherDetails.Left = weatherStartX + 270";
Debug.ShouldStop(2048);
main._lblweatherdetails.runMethod(true,"setLeft",RemoteObject.solve(new RemoteObject[] {_weatherstartx,RemoteObject.createImmutable(270)}, "+",1, 0));
 BA.debugLineNum = 367;BA.debugLine="Dim prayerTotalWidth As Double = 1095";
Debug.ShouldStop(16384);
_prayertotalwidth = BA.numberCast(double.class, 1095);Debug.locals.put("prayerTotalWidth", _prayertotalwidth);Debug.locals.put("prayerTotalWidth", _prayertotalwidth);
 BA.debugLineNum = 368;BA.debugLine="Dim prayerCardsWidth As Double = Min(prayerTota";
Debug.ShouldStop(32768);
_prayercardswidth = main.__c.runMethod(true,"Min",(Object)(_prayertotalwidth),(Object)(RemoteObject.solve(new RemoteObject[] {_overlaywidth,RemoteObject.createImmutable(60)}, "-",1, 0)));Debug.locals.put("prayerCardsWidth", _prayercardswidth);Debug.locals.put("prayerCardsWidth", _prayercardswidth);
 BA.debugLineNum = 370;BA.debugLine="pnlPrayerCards.prefWidth = prayerCardsWidth";
Debug.ShouldStop(131072);
main._pnlprayercards.runMethod(true,"setPrefWidth",_prayercardswidth);
 BA.debugLineNum = 371;BA.debugLine="pnlPrayerCards.Left = (overlayWidth - prayerCar";
Debug.ShouldStop(262144);
main._pnlprayercards.runMethod(true,"setLeft",RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {_overlaywidth,_prayercardswidth}, "-",1, 0)),RemoteObject.createImmutable(2)}, "/",0, 0));
 BA.debugLineNum = 374;BA.debugLine="If prayerCardsWidth < 1095 Then";
Debug.ShouldStop(2097152);
if (RemoteObject.solveBoolean("<",_prayercardswidth,BA.numberCast(double.class, 1095))) { 
 BA.debugLineNum = 375;BA.debugLine="RecreateScaledPrayerCards(prayerCardsWidth)";
Debug.ShouldStop(4194304);
_recreatescaledprayercards(_prayercardswidth);
 };
 };
 BA.debugLineNum = 380;BA.debugLine="btnSettings.Left = w - 80";
Debug.ShouldStop(134217728);
main._btnsettings.runMethod(true,"setLeft",RemoteObject.solve(new RemoteObject[] {_w,RemoteObject.createImmutable(80)}, "-",1, 0));
 BA.debugLineNum = 381;BA.debugLine="btnSettings.Top = 20";
Debug.ShouldStop(268435456);
main._btnsettings.runMethod(true,"setTop",BA.numberCast(double.class, 20));
 BA.debugLineNum = 384;BA.debugLine="Dim settingsWidth As Double = Min(1200, w - 130)";
Debug.ShouldStop(-2147483648);
_settingswidth = main.__c.runMethod(true,"Min",(Object)(BA.numberCast(double.class, 1200)),(Object)(RemoteObject.solve(new RemoteObject[] {_w,RemoteObject.createImmutable(130)}, "-",1, 0)));Debug.locals.put("settingsWidth", _settingswidth);Debug.locals.put("settingsWidth", _settingswidth);
 BA.debugLineNum = 385;BA.debugLine="pnlSettings.prefWidth = settingsWidth";
Debug.ShouldStop(1);
main._pnlsettings.runMethod(true,"setPrefWidth",_settingswidth);
 BA.debugLineNum = 386;BA.debugLine="pnlSettings.Left = (w - settingsWidth) / 2";
Debug.ShouldStop(2);
main._pnlsettings.runMethod(true,"setLeft",RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {_w,_settingswidth}, "-",1, 0)),RemoteObject.createImmutable(2)}, "/",0, 0));
 BA.debugLineNum = 390;BA.debugLine="Log(\"Centered - InfoPanel: \" & showInfoPanel & \"";
Debug.ShouldStop(32);
main.__c.runVoidMethod ("LogImpl","2196730",RemoteObject.concat(RemoteObject.createImmutable("Centered - InfoPanel: "),main._showinfopanel,RemoteObject.createImmutable(", Analog size: "),_analogsize,RemoteObject.createImmutable("px")),0);
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e83) {
			BA.rdebugUtils.runVoidMethod("setLastException",main.ba, e83.toString()); BA.debugLineNum = 392;BA.debugLine="Log(\"CenterAllElements error: \" & LastException.";
Debug.ShouldStop(128);
main.__c.runVoidMethod ("LogImpl","2196732",RemoteObject.concat(RemoteObject.createImmutable("CenterAllElements error: "),main.__c.runMethod(false,"LastException",main.ba).runMethod(true,"getMessage")),0);
 };
 BA.debugLineNum = 394;BA.debugLine="End Sub";
Debug.ShouldStop(512);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _clearallclocks() throws Exception{
try {
		Debug.PushSubsStack("ClearAllClocks (main) ","main",0,main.ba,main.mostCurrent,1104);
if (RapidSub.canDelegate("clearallclocks")) { return b4j.example.main.remoteMe.runUserSub(false, "main","clearallclocks");}
RemoteObject _rect = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XCanvas.B4XRect");
 BA.debugLineNum = 1104;BA.debugLine="Sub ClearAllClocks";
Debug.ShouldStop(32768);
 BA.debugLineNum = 1105;BA.debugLine="Try";
Debug.ShouldStop(65536);
try { BA.debugLineNum = 1107;BA.debugLine="lblClock.Text = \"\"";
Debug.ShouldStop(262144);
main._lblclock.runMethod(true,"setText",BA.ObjectToString(""));
 BA.debugLineNum = 1110;BA.debugLine="Try";
Debug.ShouldStop(2097152);
try { BA.debugLineNum = 1111;BA.debugLine="Dim rect As B4XRect";
Debug.ShouldStop(4194304);
_rect = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XCanvas.B4XRect");Debug.locals.put("rect", _rect);
 BA.debugLineNum = 1112;BA.debugLine="rect.Initialize(0, 0, pnlAnalogClock.prefWidth,";
Debug.ShouldStop(8388608);
_rect.runVoidMethod ("Initialize",(Object)(BA.numberCast(float.class, 0)),(Object)(BA.numberCast(float.class, 0)),(Object)(BA.numberCast(float.class, main._pnlanalogclock.runMethod(true,"getPrefWidth"))),(Object)(BA.numberCast(float.class, main._pnlanalogclock.runMethod(true,"getPrefHeight"))));
 BA.debugLineNum = 1113;BA.debugLine="cvsAnalogClock.ClearRect(rect)";
Debug.ShouldStop(16777216);
main._cvsanalogclock.runVoidMethod ("ClearRect",(Object)(_rect));
 BA.debugLineNum = 1114;BA.debugLine="cvsAnalogClock.Invalidate";
Debug.ShouldStop(33554432);
main._cvsanalogclock.runVoidMethod ("Invalidate");
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e9) {
			BA.rdebugUtils.runVoidMethod("setLastException",main.ba, e9.toString()); };
 BA.debugLineNum = 1119;BA.debugLine="Log(\"All clocks cleared\")";
Debug.ShouldStop(1073741824);
main.__c.runVoidMethod ("LogImpl","27864335",RemoteObject.createImmutable("All clocks cleared"),0);
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e12) {
			BA.rdebugUtils.runVoidMethod("setLastException",main.ba, e12.toString()); BA.debugLineNum = 1121;BA.debugLine="Log(\"ClearAllClocks error: \" & LastException.Mes";
Debug.ShouldStop(1);
main.__c.runVoidMethod ("LogImpl","27864337",RemoteObject.concat(RemoteObject.createImmutable("ClearAllClocks error: "),main.__c.runMethod(false,"LastException",main.ba).runMethod(true,"getMessage")),0);
 };
 BA.debugLineNum = 1123;BA.debugLine="End Sub";
Debug.ShouldStop(4);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createprayertimecards() throws Exception{
try {
		Debug.PushSubsStack("CreatePrayerTimeCards (main) ","main",0,main.ba,main.mostCurrent,401);
if (RapidSub.canDelegate("createprayertimecards")) { return b4j.example.main.remoteMe.runUserSub(false, "main","createprayertimecards");}
RemoteObject _prayernames = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _prayericons = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _cardwidth = RemoteObject.createImmutable(0);
RemoteObject _spacing = RemoteObject.createImmutable(0);
int _i = 0;
RemoteObject _pnlcard = RemoteObject.declareNull("anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper");
RemoteObject _lblicon = RemoteObject.declareNull("anywheresoftware.b4j.objects.LabelWrapper");
RemoteObject _lblname = RemoteObject.declareNull("anywheresoftware.b4j.objects.LabelWrapper");
RemoteObject _lbltime = RemoteObject.declareNull("anywheresoftware.b4j.objects.LabelWrapper");
 BA.debugLineNum = 401;BA.debugLine="Sub CreatePrayerTimeCards";
Debug.ShouldStop(65536);
 BA.debugLineNum = 402;BA.debugLine="Try";
Debug.ShouldStop(131072);
try { BA.debugLineNum = 403;BA.debugLine="Dim prayerNames As List = Array As String(\"fajr\"";
Debug.ShouldStop(262144);
_prayernames = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_prayernames = main.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("String",new int[] {6},new Object[] {BA.ObjectToString("fajr"),BA.ObjectToString("sunrise"),BA.ObjectToString("dhuhr"),BA.ObjectToString("asr"),BA.ObjectToString("maghrib"),RemoteObject.createImmutable("isha")})));Debug.locals.put("prayerNames", _prayernames);Debug.locals.put("prayerNames", _prayernames);
 BA.debugLineNum = 404;BA.debugLine="Dim prayerIcons As List = Array As String(\"🌅\",";
Debug.ShouldStop(524288);
_prayericons = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_prayericons = main.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("String",new int[] {6},new Object[] {BA.ObjectToString("🌅"),BA.ObjectToString("☀️"),BA.ObjectToString("🌞"),BA.ObjectToString("🌤️"),BA.ObjectToString("🌆"),RemoteObject.createImmutable("🌙")})));Debug.locals.put("prayerIcons", _prayericons);Debug.locals.put("prayerIcons", _prayericons);
 BA.debugLineNum = 405;BA.debugLine="Dim cardWidth As Int = 170";
Debug.ShouldStop(1048576);
_cardwidth = BA.numberCast(int.class, 170);Debug.locals.put("cardWidth", _cardwidth);Debug.locals.put("cardWidth", _cardwidth);
 BA.debugLineNum = 406;BA.debugLine="Dim spacing As Int = 15";
Debug.ShouldStop(2097152);
_spacing = BA.numberCast(int.class, 15);Debug.locals.put("spacing", _spacing);Debug.locals.put("spacing", _spacing);
 BA.debugLineNum = 408;BA.debugLine="For i = 0 To 5";
Debug.ShouldStop(8388608);
{
final int step6 = 1;
final int limit6 = 5;
_i = 0 ;
for (;(step6 > 0 && _i <= limit6) || (step6 < 0 && _i >= limit6) ;_i = ((int)(0 + _i + step6))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 409;BA.debugLine="Dim pnlCard As Pane";
Debug.ShouldStop(16777216);
_pnlcard = RemoteObject.createNew ("anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper");Debug.locals.put("pnlCard", _pnlcard);
 BA.debugLineNum = 410;BA.debugLine="pnlCard.Initialize(\"\")";
Debug.ShouldStop(33554432);
_pnlcard.runVoidMethod ("Initialize",main.ba,(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 411;BA.debugLine="pnlCard.Style = \"-fx-background-color: rgba(40,";
Debug.ShouldStop(67108864);
_pnlcard.runMethod(true,"setStyle",BA.ObjectToString("-fx-background-color: rgba(40, 40, 60, 0.8); -fx-background-radius: 10px; -fx-border-color: rgba(0, 200, 255, 0.4); -fx-border-width: 1px; -fx-border-radius: 10px;"));
 BA.debugLineNum = 412;BA.debugLine="pnlPrayerCards.AddNode(pnlCard, i * (cardWidth";
Debug.ShouldStop(134217728);
main._pnlprayercards.runVoidMethod ("AddNode",(Object)((_pnlcard.getObject())),(Object)(BA.numberCast(double.class, RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(_i),(RemoteObject.solve(new RemoteObject[] {_cardwidth,_spacing}, "+",1, 1))}, "*",0, 1))),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, _cardwidth)),(Object)(BA.numberCast(double.class, 70)));
 BA.debugLineNum = 415;BA.debugLine="Dim lblIcon As Label";
Debug.ShouldStop(1073741824);
_lblicon = RemoteObject.createNew ("anywheresoftware.b4j.objects.LabelWrapper");Debug.locals.put("lblIcon", _lblicon);
 BA.debugLineNum = 416;BA.debugLine="lblIcon.Initialize(\"\")";
Debug.ShouldStop(-2147483648);
_lblicon.runVoidMethod ("Initialize",main.ba,(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 417;BA.debugLine="lblIcon.Text = prayerIcons.Get(i)";
Debug.ShouldStop(1);
_lblicon.runMethod(true,"setText",BA.ObjectToString(_prayericons.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i)))));
 BA.debugLineNum = 418;BA.debugLine="lblIcon.TextSize = 24";
Debug.ShouldStop(2);
_lblicon.runMethod(true,"setTextSize",BA.numberCast(double.class, 24));
 BA.debugLineNum = 419;BA.debugLine="lblIcon.Alignment = \"CENTER\"";
Debug.ShouldStop(4);
_lblicon.runMethod(true,"setAlignment",BA.ObjectToString("CENTER"));
 BA.debugLineNum = 420;BA.debugLine="pnlCard.AddNode(lblIcon, 5, 5, 40, 30)";
Debug.ShouldStop(8);
_pnlcard.runVoidMethod ("AddNode",(Object)((_lblicon.getObject())),(Object)(BA.numberCast(double.class, 5)),(Object)(BA.numberCast(double.class, 5)),(Object)(BA.numberCast(double.class, 40)),(Object)(BA.numberCast(double.class, 30)));
 BA.debugLineNum = 423;BA.debugLine="Dim lblName As Label";
Debug.ShouldStop(64);
_lblname = RemoteObject.createNew ("anywheresoftware.b4j.objects.LabelWrapper");Debug.locals.put("lblName", _lblname);
 BA.debugLineNum = 424;BA.debugLine="lblName.Initialize(\"\")";
Debug.ShouldStop(128);
_lblname.runVoidMethod ("Initialize",main.ba,(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 425;BA.debugLine="lblName.Text = GetTranslation(prayerNames.Get(i";
Debug.ShouldStop(256);
_lblname.runMethod(true,"setText",_gettranslation(BA.ObjectToString(_prayernames.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))))));
 BA.debugLineNum = 426;BA.debugLine="lblName.TextColor = fx.Colors.RGB(200, 200, 200";
Debug.ShouldStop(512);
_lblname.runMethod(false,"setTextColor",(main._fx.getField(false,"Colors").runMethod(false,"RGB",(Object)(BA.numberCast(int.class, 200)),(Object)(BA.numberCast(int.class, 200)),(Object)(BA.numberCast(int.class, 200)))));
 BA.debugLineNum = 427;BA.debugLine="lblName.TextSize = 12";
Debug.ShouldStop(1024);
_lblname.runMethod(true,"setTextSize",BA.numberCast(double.class, 12));
 BA.debugLineNum = 428;BA.debugLine="lblName.Style = \"-fx-font-weight: normal;\"";
Debug.ShouldStop(2048);
_lblname.runMethod(true,"setStyle",BA.ObjectToString("-fx-font-weight: normal;"));
 BA.debugLineNum = 429;BA.debugLine="lblName.Alignment = \"CENTER_LEFT\"";
Debug.ShouldStop(4096);
_lblname.runMethod(true,"setAlignment",BA.ObjectToString("CENTER_LEFT"));
 BA.debugLineNum = 430;BA.debugLine="pnlCard.AddNode(lblName, 50, 5, 110, 25)";
Debug.ShouldStop(8192);
_pnlcard.runVoidMethod ("AddNode",(Object)((_lblname.getObject())),(Object)(BA.numberCast(double.class, 50)),(Object)(BA.numberCast(double.class, 5)),(Object)(BA.numberCast(double.class, 110)),(Object)(BA.numberCast(double.class, 25)));
 BA.debugLineNum = 433;BA.debugLine="Dim lblTime As Label";
Debug.ShouldStop(65536);
_lbltime = RemoteObject.createNew ("anywheresoftware.b4j.objects.LabelWrapper");Debug.locals.put("lblTime", _lbltime);
 BA.debugLineNum = 434;BA.debugLine="lblTime.Initialize(\"\")";
Debug.ShouldStop(131072);
_lbltime.runVoidMethod ("Initialize",main.ba,(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 435;BA.debugLine="lblTime.Text = \"--:--\"";
Debug.ShouldStop(262144);
_lbltime.runMethod(true,"setText",BA.ObjectToString("--:--"));
 BA.debugLineNum = 436;BA.debugLine="lblTime.TextColor = fx.Colors.RGB(150, 255, 150";
Debug.ShouldStop(524288);
_lbltime.runMethod(false,"setTextColor",(main._fx.getField(false,"Colors").runMethod(false,"RGB",(Object)(BA.numberCast(int.class, 150)),(Object)(BA.numberCast(int.class, 255)),(Object)(BA.numberCast(int.class, 150)))));
 BA.debugLineNum = 437;BA.debugLine="lblTime.TextSize = 18";
Debug.ShouldStop(1048576);
_lbltime.runMethod(true,"setTextSize",BA.numberCast(double.class, 18));
 BA.debugLineNum = 438;BA.debugLine="lblTime.Style = \"-fx-font-weight: bold;\"";
Debug.ShouldStop(2097152);
_lbltime.runMethod(true,"setStyle",BA.ObjectToString("-fx-font-weight: bold;"));
 BA.debugLineNum = 439;BA.debugLine="lblTime.Alignment = \"CENTER\"";
Debug.ShouldStop(4194304);
_lbltime.runMethod(true,"setAlignment",BA.ObjectToString("CENTER"));
 BA.debugLineNum = 440;BA.debugLine="pnlCard.AddNode(lblTime, 5, 40, 160, 25)";
Debug.ShouldStop(8388608);
_pnlcard.runVoidMethod ("AddNode",(Object)((_lbltime.getObject())),(Object)(BA.numberCast(double.class, 5)),(Object)(BA.numberCast(double.class, 40)),(Object)(BA.numberCast(double.class, 160)),(Object)(BA.numberCast(double.class, 25)));
 BA.debugLineNum = 443;BA.debugLine="prayerLabels.Put(prayerNames.Get(i), lblTime)";
Debug.ShouldStop(67108864);
main._prayerlabels.runVoidMethod ("Put",(Object)(_prayernames.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i)))),(Object)((_lbltime.getObject())));
 }
}Debug.locals.put("i", _i);
;
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e36) {
			BA.rdebugUtils.runVoidMethod("setLastException",main.ba, e36.toString()); BA.debugLineNum = 446;BA.debugLine="Log(\"CreatePrayerTimeCards error: \" & LastExcept";
Debug.ShouldStop(536870912);
main.__c.runVoidMethod ("LogImpl","27667757",RemoteObject.concat(RemoteObject.createImmutable("CreatePrayerTimeCards error: "),main.__c.runMethod(false,"LastException",main.ba).runMethod(true,"getMessage")),0);
 };
 BA.debugLineNum = 448;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _dacos(RemoteObject _x) throws Exception{
try {
		Debug.PushSubsStack("dacos (main) ","main",0,main.ba,main.mostCurrent,1212);
if (RapidSub.canDelegate("dacos")) { return b4j.example.main.remoteMe.runUserSub(false, "main","dacos", _x);}
Debug.locals.put("x", _x);
 BA.debugLineNum = 1212;BA.debugLine="Sub dacos(x As Double) As Double";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 1213;BA.debugLine="Return ACos(x) * 180.0 / cPI";
Debug.ShouldStop(268435456);
if (true) return RemoteObject.solve(new RemoteObject[] {main.__c.runMethod(true,"ACos",(Object)(_x)),RemoteObject.createImmutable(180.0),main.__c.getField(true,"cPI")}, "*/",0, 0);
 BA.debugLineNum = 1214;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _dasin(RemoteObject _x) throws Exception{
try {
		Debug.PushSubsStack("dasin (main) ","main",0,main.ba,main.mostCurrent,1208);
if (RapidSub.canDelegate("dasin")) { return b4j.example.main.remoteMe.runUserSub(false, "main","dasin", _x);}
Debug.locals.put("x", _x);
 BA.debugLineNum = 1208;BA.debugLine="Sub dasin(x As Double) As Double";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 1209;BA.debugLine="Return ASin(x) * 180.0 / cPI";
Debug.ShouldStop(16777216);
if (true) return RemoteObject.solve(new RemoteObject[] {main.__c.runMethod(true,"ASin",(Object)(_x)),RemoteObject.createImmutable(180.0),main.__c.getField(true,"cPI")}, "*/",0, 0);
 BA.debugLineNum = 1210;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _datan(RemoteObject _x) throws Exception{
try {
		Debug.PushSubsStack("datan (main) ","main",0,main.ba,main.mostCurrent,737);
if (RapidSub.canDelegate("datan")) { return b4j.example.main.remoteMe.runUserSub(false, "main","datan", _x);}
Debug.locals.put("x", _x);
 BA.debugLineNum = 737;BA.debugLine="Sub datan(x As Double) As Double";
Debug.ShouldStop(1);
 BA.debugLineNum = 738;BA.debugLine="Return ATan(x) * 180.0 / cPI";
Debug.ShouldStop(2);
if (true) return RemoteObject.solve(new RemoteObject[] {main.__c.runMethod(true,"ATan",(Object)(_x)),RemoteObject.createImmutable(180.0),main.__c.getField(true,"cPI")}, "*/",0, 0);
 BA.debugLineNum = 739;BA.debugLine="End Sub";
Debug.ShouldStop(4);
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _datan2(RemoteObject _y,RemoteObject _x) throws Exception{
try {
		Debug.PushSubsStack("datan2 (main) ","main",0,main.ba,main.mostCurrent,1216);
if (RapidSub.canDelegate("datan2")) { return b4j.example.main.remoteMe.runUserSub(false, "main","datan2", _y, _x);}
Debug.locals.put("y", _y);
Debug.locals.put("x", _x);
 BA.debugLineNum = 1216;BA.debugLine="Sub datan2(y As Double, x As Double) As Double";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 1217;BA.debugLine="Return ATan2(y, x) * 180.0 / cPI";
Debug.ShouldStop(1);
if (true) return RemoteObject.solve(new RemoteObject[] {main.__c.runMethod(true,"ATan2",(Object)(_y),(Object)(_x)),RemoteObject.createImmutable(180.0),main.__c.getField(true,"cPI")}, "*/",0, 0);
 BA.debugLineNum = 1218;BA.debugLine="End Sub";
Debug.ShouldStop(2);
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _dcos(RemoteObject _d) throws Exception{
try {
		Debug.PushSubsStack("dcos (main) ","main",0,main.ba,main.mostCurrent,1200);
if (RapidSub.canDelegate("dcos")) { return b4j.example.main.remoteMe.runUserSub(false, "main","dcos", _d);}
Debug.locals.put("d", _d);
 BA.debugLineNum = 1200;BA.debugLine="Sub dcos(d As Double) As Double";
Debug.ShouldStop(32768);
 BA.debugLineNum = 1201;BA.debugLine="Return Cos(d * cPI / 180.0)";
Debug.ShouldStop(65536);
if (true) return main.__c.runMethod(true,"Cos",(Object)(RemoteObject.solve(new RemoteObject[] {_d,main.__c.getField(true,"cPI"),RemoteObject.createImmutable(180.0)}, "*/",0, 0)));
 BA.debugLineNum = 1202;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _drawanalogclock() throws Exception{
try {
		Debug.PushSubsStack("DrawAnalogClock (main) ","main",0,main.ba,main.mostCurrent,835);
if (RapidSub.canDelegate("drawanalogclock")) { return b4j.example.main.remoteMe.runUserSub(false, "main","drawanalogclock");}
RemoteObject _now = RemoteObject.createImmutable(0L);
RemoteObject _hour = RemoteObject.createImmutable(0);
RemoteObject _minute = RemoteObject.createImmutable(0);
RemoteObject _second = RemoteObject.createImmutable(0);
RemoteObject _size = RemoteObject.createImmutable(0);
RemoteObject _center = RemoteObject.createImmutable(0);
RemoteObject _radius = RemoteObject.createImmutable(0);
RemoteObject _rect = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XCanvas.B4XRect");
RemoteObject _textfont = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont");
int _i = 0;
RemoteObject _angle = RemoteObject.createImmutable(0);
RemoteObject _x = RemoteObject.createImmutable(0);
RemoteObject _y = RemoteObject.createImmutable(0);
RemoteObject _hourangle = RemoteObject.createImmutable(0);
RemoteObject _minuteangle = RemoteObject.createImmutable(0);
RemoteObject _secondangle = RemoteObject.createImmutable(0);
RemoteObject _hourx = RemoteObject.createImmutable(0);
RemoteObject _houry = RemoteObject.createImmutable(0);
RemoteObject _minutex = RemoteObject.createImmutable(0);
RemoteObject _minutey = RemoteObject.createImmutable(0);
RemoteObject _secondx = RemoteObject.createImmutable(0);
RemoteObject _secondy = RemoteObject.createImmutable(0);
 BA.debugLineNum = 835;BA.debugLine="Sub DrawAnalogClock";
Debug.ShouldStop(4);
 BA.debugLineNum = 836;BA.debugLine="Try";
Debug.ShouldStop(8);
try { BA.debugLineNum = 837;BA.debugLine="Dim now As Long = DateTime.Now";
Debug.ShouldStop(16);
_now = main.__c.getField(false,"DateTime").runMethod(true,"getNow");Debug.locals.put("now", _now);Debug.locals.put("now", _now);
 BA.debugLineNum = 838;BA.debugLine="Dim hour As Int = DateTime.GetHour(now)";
Debug.ShouldStop(32);
_hour = main.__c.getField(false,"DateTime").runMethod(true,"GetHour",(Object)(_now));Debug.locals.put("hour", _hour);Debug.locals.put("hour", _hour);
 BA.debugLineNum = 839;BA.debugLine="Dim minute As Int = DateTime.GetMinute(now)";
Debug.ShouldStop(64);
_minute = main.__c.getField(false,"DateTime").runMethod(true,"GetMinute",(Object)(_now));Debug.locals.put("minute", _minute);Debug.locals.put("minute", _minute);
 BA.debugLineNum = 840;BA.debugLine="Dim second As Int = DateTime.GetSecond(now)";
Debug.ShouldStop(128);
_second = main.__c.getField(false,"DateTime").runMethod(true,"GetSecond",(Object)(_now));Debug.locals.put("second", _second);Debug.locals.put("second", _second);
 BA.debugLineNum = 843;BA.debugLine="Dim size As Double = pnlAnalogClock.prefWidth";
Debug.ShouldStop(1024);
_size = main._pnlanalogclock.runMethod(true,"getPrefWidth");Debug.locals.put("size", _size);Debug.locals.put("size", _size);
 BA.debugLineNum = 844;BA.debugLine="Dim center As Double = size / 2";
Debug.ShouldStop(2048);
_center = RemoteObject.solve(new RemoteObject[] {_size,RemoteObject.createImmutable(2)}, "/",0, 0);Debug.locals.put("center", _center);Debug.locals.put("center", _center);
 BA.debugLineNum = 845;BA.debugLine="Dim radius As Double = center - 10";
Debug.ShouldStop(4096);
_radius = RemoteObject.solve(new RemoteObject[] {_center,RemoteObject.createImmutable(10)}, "-",1, 0);Debug.locals.put("radius", _radius);Debug.locals.put("radius", _radius);
 BA.debugLineNum = 848;BA.debugLine="Dim rect As B4XRect";
Debug.ShouldStop(32768);
_rect = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XCanvas.B4XRect");Debug.locals.put("rect", _rect);
 BA.debugLineNum = 849;BA.debugLine="rect.Initialize(0, 0, size, size)";
Debug.ShouldStop(65536);
_rect.runVoidMethod ("Initialize",(Object)(BA.numberCast(float.class, 0)),(Object)(BA.numberCast(float.class, 0)),(Object)(BA.numberCast(float.class, _size)),(Object)(BA.numberCast(float.class, _size)));
 BA.debugLineNum = 850;BA.debugLine="cvsAnalogClock.ClearRect(rect)";
Debug.ShouldStop(131072);
main._cvsanalogclock.runVoidMethod ("ClearRect",(Object)(_rect));
 BA.debugLineNum = 853;BA.debugLine="cvsAnalogClock.DrawCircle(center, center, radius";
Debug.ShouldStop(1048576);
main._cvsanalogclock.runVoidMethod ("DrawCircle",(Object)(BA.numberCast(float.class, _center)),(Object)(BA.numberCast(float.class, _center)),(Object)(BA.numberCast(float.class, _radius)),(Object)(main._xui.runMethod(true,"Color_ARGB",(Object)(BA.numberCast(int.class, 180)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)))),(Object)(main.__c.getField(true,"True")),(Object)(BA.numberCast(float.class, 0)));
 BA.debugLineNum = 854;BA.debugLine="cvsAnalogClock.DrawCircle(center, center, radius";
Debug.ShouldStop(2097152);
main._cvsanalogclock.runVoidMethod ("DrawCircle",(Object)(BA.numberCast(float.class, _center)),(Object)(BA.numberCast(float.class, _center)),(Object)(BA.numberCast(float.class, _radius)),(Object)(main._currentclockcolor),(Object)(main.__c.getField(true,"False")),(Object)(BA.numberCast(float.class, 3)));
 BA.debugLineNum = 857;BA.debugLine="Dim textFont As B4XFont = xui.CreateDefaultFont(";
Debug.ShouldStop(16777216);
_textfont = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont");
_textfont = main._xui.runMethod(false,"CreateDefaultFont",(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_size,RemoteObject.createImmutable(0.045)}, "*",0, 0))));Debug.locals.put("textFont", _textfont);Debug.locals.put("textFont", _textfont);
 BA.debugLineNum = 858;BA.debugLine="For i = 1 To 12";
Debug.ShouldStop(33554432);
{
final int step15 = 1;
final int limit15 = 12;
_i = 1 ;
for (;(step15 > 0 && _i <= limit15) || (step15 < 0 && _i >= limit15) ;_i = ((int)(0 + _i + step15))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 859;BA.debugLine="Dim angle As Double = cPI / 6 * (i - 3)";
Debug.ShouldStop(67108864);
_angle = RemoteObject.solve(new RemoteObject[] {main.__c.getField(true,"cPI"),RemoteObject.createImmutable(6),(RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(_i),RemoteObject.createImmutable(3)}, "-",1, 1))}, "/*",0, 0);Debug.locals.put("angle", _angle);Debug.locals.put("angle", _angle);
 BA.debugLineNum = 860;BA.debugLine="Dim x As Double = center + Cos(angle) * (radius";
Debug.ShouldStop(134217728);
_x = RemoteObject.solve(new RemoteObject[] {_center,main.__c.runMethod(true,"Cos",(Object)(_angle)),(RemoteObject.solve(new RemoteObject[] {_radius,RemoteObject.createImmutable(0.75)}, "*",0, 0))}, "+*",1, 0);Debug.locals.put("x", _x);Debug.locals.put("x", _x);
 BA.debugLineNum = 861;BA.debugLine="Dim y As Double = center + Sin(angle) * (radius";
Debug.ShouldStop(268435456);
_y = RemoteObject.solve(new RemoteObject[] {_center,main.__c.runMethod(true,"Sin",(Object)(_angle)),(RemoteObject.solve(new RemoteObject[] {_radius,RemoteObject.createImmutable(0.75)}, "*",0, 0))}, "+*",1, 0);Debug.locals.put("y", _y);Debug.locals.put("y", _y);
 BA.debugLineNum = 862;BA.debugLine="cvsAnalogClock.DrawText(i, x, y, textFont, curr";
Debug.ShouldStop(536870912);
main._cvsanalogclock.runVoidMethod ("DrawText",(Object)(BA.NumberToString(_i)),(Object)(_x),(Object)(_y),(Object)(_textfont),(Object)(main._currentclockcolor),(Object)(BA.getEnumFromString(BA.getDeviceClass("javafx.scene.text.TextAlignment"),RemoteObject.createImmutable("CENTER"))));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 866;BA.debugLine="cvsAnalogClock.DrawCircle(center, center, size *";
Debug.ShouldStop(2);
main._cvsanalogclock.runVoidMethod ("DrawCircle",(Object)(BA.numberCast(float.class, _center)),(Object)(BA.numberCast(float.class, _center)),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_size,RemoteObject.createImmutable(0.02)}, "*",0, 0))),(Object)(main._currentclockcolor),(Object)(main.__c.getField(true,"True")),(Object)(BA.numberCast(float.class, 0)));
 BA.debugLineNum = 869;BA.debugLine="hour = hour Mod 12";
Debug.ShouldStop(16);
_hour = RemoteObject.solve(new RemoteObject[] {_hour,RemoteObject.createImmutable(12)}, "%",0, 1);Debug.locals.put("hour", _hour);
 BA.debugLineNum = 870;BA.debugLine="Dim hourAngle As Double = (cPI / 6) * hour + (cP";
Debug.ShouldStop(32);
_hourangle = RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {main.__c.getField(true,"cPI"),RemoteObject.createImmutable(6)}, "/",0, 0)),_hour,(RemoteObject.solve(new RemoteObject[] {main.__c.getField(true,"cPI"),RemoteObject.createImmutable(360)}, "/",0, 0)),_minute,main.__c.getField(true,"cPI"),RemoteObject.createImmutable(2)}, "*+*-/",2, 0);Debug.locals.put("hourAngle", _hourangle);Debug.locals.put("hourAngle", _hourangle);
 BA.debugLineNum = 871;BA.debugLine="Dim minuteAngle As Double = (cPI / 30) * minute";
Debug.ShouldStop(64);
_minuteangle = RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {main.__c.getField(true,"cPI"),RemoteObject.createImmutable(30)}, "/",0, 0)),_minute,(RemoteObject.solve(new RemoteObject[] {main.__c.getField(true,"cPI"),RemoteObject.createImmutable(1800)}, "/",0, 0)),_second,main.__c.getField(true,"cPI"),RemoteObject.createImmutable(2)}, "*+*-/",2, 0);Debug.locals.put("minuteAngle", _minuteangle);Debug.locals.put("minuteAngle", _minuteangle);
 BA.debugLineNum = 872;BA.debugLine="Dim secondAngle As Double = (cPI / 30) * second";
Debug.ShouldStop(128);
_secondangle = RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {main.__c.getField(true,"cPI"),RemoteObject.createImmutable(30)}, "/",0, 0)),_second,main.__c.getField(true,"cPI"),RemoteObject.createImmutable(2)}, "*-/",1, 0);Debug.locals.put("secondAngle", _secondangle);Debug.locals.put("secondAngle", _secondangle);
 BA.debugLineNum = 875;BA.debugLine="Dim hourX As Double = center + Cos(hourAngle) *";
Debug.ShouldStop(1024);
_hourx = RemoteObject.solve(new RemoteObject[] {_center,main.__c.runMethod(true,"Cos",(Object)(_hourangle)),(RemoteObject.solve(new RemoteObject[] {_radius,RemoteObject.createImmutable(0.4)}, "*",0, 0))}, "+*",1, 0);Debug.locals.put("hourX", _hourx);Debug.locals.put("hourX", _hourx);
 BA.debugLineNum = 876;BA.debugLine="Dim hourY As Double = center + Sin(hourAngle) *";
Debug.ShouldStop(2048);
_houry = RemoteObject.solve(new RemoteObject[] {_center,main.__c.runMethod(true,"Sin",(Object)(_hourangle)),(RemoteObject.solve(new RemoteObject[] {_radius,RemoteObject.createImmutable(0.4)}, "*",0, 0))}, "+*",1, 0);Debug.locals.put("hourY", _houry);Debug.locals.put("hourY", _houry);
 BA.debugLineNum = 877;BA.debugLine="cvsAnalogClock.DrawLine(center, center, hourX, h";
Debug.ShouldStop(4096);
main._cvsanalogclock.runVoidMethod ("DrawLine",(Object)(BA.numberCast(float.class, _center)),(Object)(BA.numberCast(float.class, _center)),(Object)(BA.numberCast(float.class, _hourx)),(Object)(BA.numberCast(float.class, _houry)),(Object)(main._currentclockcolor),(Object)(BA.numberCast(float.class, main.__c.runMethod(true,"Max",(Object)(BA.numberCast(double.class, 2)),(Object)(RemoteObject.solve(new RemoteObject[] {_size,RemoteObject.createImmutable(0.015)}, "*",0, 0))))));
 BA.debugLineNum = 879;BA.debugLine="Dim minuteX As Double = center + Cos(minuteAngle";
Debug.ShouldStop(16384);
_minutex = RemoteObject.solve(new RemoteObject[] {_center,main.__c.runMethod(true,"Cos",(Object)(_minuteangle)),(RemoteObject.solve(new RemoteObject[] {_radius,RemoteObject.createImmutable(0.65)}, "*",0, 0))}, "+*",1, 0);Debug.locals.put("minuteX", _minutex);Debug.locals.put("minuteX", _minutex);
 BA.debugLineNum = 880;BA.debugLine="Dim minuteY As Double = center + Sin(minuteAngle";
Debug.ShouldStop(32768);
_minutey = RemoteObject.solve(new RemoteObject[] {_center,main.__c.runMethod(true,"Sin",(Object)(_minuteangle)),(RemoteObject.solve(new RemoteObject[] {_radius,RemoteObject.createImmutable(0.65)}, "*",0, 0))}, "+*",1, 0);Debug.locals.put("minuteY", _minutey);Debug.locals.put("minuteY", _minutey);
 BA.debugLineNum = 881;BA.debugLine="cvsAnalogClock.DrawLine(center, center, minuteX,";
Debug.ShouldStop(65536);
main._cvsanalogclock.runVoidMethod ("DrawLine",(Object)(BA.numberCast(float.class, _center)),(Object)(BA.numberCast(float.class, _center)),(Object)(BA.numberCast(float.class, _minutex)),(Object)(BA.numberCast(float.class, _minutey)),(Object)(main._currentclockcolor),(Object)(BA.numberCast(float.class, main.__c.runMethod(true,"Max",(Object)(BA.numberCast(double.class, 2)),(Object)(RemoteObject.solve(new RemoteObject[] {_size,RemoteObject.createImmutable(0.01)}, "*",0, 0))))));
 BA.debugLineNum = 883;BA.debugLine="Dim secondX As Double = center + Cos(secondAngle";
Debug.ShouldStop(262144);
_secondx = RemoteObject.solve(new RemoteObject[] {_center,main.__c.runMethod(true,"Cos",(Object)(_secondangle)),(RemoteObject.solve(new RemoteObject[] {_radius,RemoteObject.createImmutable(0.75)}, "*",0, 0))}, "+*",1, 0);Debug.locals.put("secondX", _secondx);Debug.locals.put("secondX", _secondx);
 BA.debugLineNum = 884;BA.debugLine="Dim secondY As Double = center + Sin(secondAngle";
Debug.ShouldStop(524288);
_secondy = RemoteObject.solve(new RemoteObject[] {_center,main.__c.runMethod(true,"Sin",(Object)(_secondangle)),(RemoteObject.solve(new RemoteObject[] {_radius,RemoteObject.createImmutable(0.75)}, "*",0, 0))}, "+*",1, 0);Debug.locals.put("secondY", _secondy);Debug.locals.put("secondY", _secondy);
 BA.debugLineNum = 885;BA.debugLine="cvsAnalogClock.DrawLine(center, center, secondX,";
Debug.ShouldStop(1048576);
main._cvsanalogclock.runVoidMethod ("DrawLine",(Object)(BA.numberCast(float.class, _center)),(Object)(BA.numberCast(float.class, _center)),(Object)(BA.numberCast(float.class, _secondx)),(Object)(BA.numberCast(float.class, _secondy)),(Object)(main._xui.runMethod(true,"Color_RGB",(Object)(BA.numberCast(int.class, 255)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)))),(Object)(BA.numberCast(float.class, main.__c.runMethod(true,"Max",(Object)(BA.numberCast(double.class, 1)),(Object)(RemoteObject.solve(new RemoteObject[] {_size,RemoteObject.createImmutable(0.005)}, "*",0, 0))))));
 BA.debugLineNum = 888;BA.debugLine="cvsAnalogClock.Invalidate";
Debug.ShouldStop(8388608);
main._cvsanalogclock.runVoidMethod ("Invalidate");
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e37) {
			BA.rdebugUtils.runVoidMethod("setLastException",main.ba, e37.toString()); BA.debugLineNum = 890;BA.debugLine="Log(\"Analog draw error: \" & LastException.Messag";
Debug.ShouldStop(33554432);
main.__c.runVoidMethod ("LogImpl","2524343",RemoteObject.concat(RemoteObject.createImmutable("Analog draw error: "),main.__c.runMethod(false,"LastException",main.ba).runMethod(true,"getMessage")),0);
 };
 BA.debugLineNum = 892;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _dsin(RemoteObject _d) throws Exception{
try {
		Debug.PushSubsStack("dsin (main) ","main",0,main.ba,main.mostCurrent,1196);
if (RapidSub.canDelegate("dsin")) { return b4j.example.main.remoteMe.runUserSub(false, "main","dsin", _d);}
Debug.locals.put("d", _d);
 BA.debugLineNum = 1196;BA.debugLine="Sub dsin(d As Double) As Double";
Debug.ShouldStop(2048);
 BA.debugLineNum = 1197;BA.debugLine="Return Sin(d * cPI / 180.0)";
Debug.ShouldStop(4096);
if (true) return main.__c.runMethod(true,"Sin",(Object)(RemoteObject.solve(new RemoteObject[] {_d,main.__c.getField(true,"cPI"),RemoteObject.createImmutable(180.0)}, "*/",0, 0)));
 BA.debugLineNum = 1198;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _dtan(RemoteObject _d) throws Exception{
try {
		Debug.PushSubsStack("dtan (main) ","main",0,main.ba,main.mostCurrent,1204);
if (RapidSub.canDelegate("dtan")) { return b4j.example.main.remoteMe.runUserSub(false, "main","dtan", _d);}
Debug.locals.put("d", _d);
 BA.debugLineNum = 1204;BA.debugLine="Sub dtan(d As Double) As Double";
Debug.ShouldStop(524288);
 BA.debugLineNum = 1205;BA.debugLine="Return Tan(d * cPI / 180.0)";
Debug.ShouldStop(1048576);
if (true) return main.__c.runMethod(true,"Tan",(Object)(RemoteObject.solve(new RemoteObject[] {_d,main.__c.getField(true,"cPI"),RemoteObject.createImmutable(180.0)}, "*/",0, 0)));
 BA.debugLineNum = 1206;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _fetchprayertimes() throws Exception{
try {
		Debug.PushSubsStack("FetchPrayerTimes (main) ","main",0,main.ba,main.mostCurrent,618);
if (RapidSub.canDelegate("fetchprayertimes")) { return b4j.example.main.remoteMe.runUserSub(false, "main","fetchprayertimes");}
RemoteObject _now = RemoteObject.createImmutable(0L);
RemoteObject _currentmonth = RemoteObject.createImmutable(0);
RemoteObject _currentday = RemoteObject.createImmutable(0);
RemoteObject _prayertimes = null;
RemoteObject _prayernames = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
int _i = 0;
RemoteObject _lbltime = RemoteObject.declareNull("anywheresoftware.b4j.objects.LabelWrapper");
 BA.debugLineNum = 618;BA.debugLine="Sub FetchPrayerTimes";
Debug.ShouldStop(512);
 BA.debugLineNum = 619;BA.debugLine="Try";
Debug.ShouldStop(1024);
try { BA.debugLineNum = 620;BA.debugLine="Dim now As Long = DateTime.Now";
Debug.ShouldStop(2048);
_now = main.__c.getField(false,"DateTime").runMethod(true,"getNow");Debug.locals.put("now", _now);Debug.locals.put("now", _now);
 BA.debugLineNum = 621;BA.debugLine="Dim currentMonth As Int = DateTime.GetMonth(now)";
Debug.ShouldStop(4096);
_currentmonth = main.__c.getField(false,"DateTime").runMethod(true,"GetMonth",(Object)(_now));Debug.locals.put("currentMonth", _currentmonth);Debug.locals.put("currentMonth", _currentmonth);
 BA.debugLineNum = 622;BA.debugLine="Dim currentDay As Int = DateTime.GetDayOfMonth(n";
Debug.ShouldStop(8192);
_currentday = main.__c.getField(false,"DateTime").runMethod(true,"GetDayOfMonth",(Object)(_now));Debug.locals.put("currentDay", _currentday);Debug.locals.put("currentDay", _currentday);
 BA.debugLineNum = 624;BA.debugLine="Dim prayerTimes() As Object = GetReligious_times";
Debug.ShouldStop(32768);
_prayertimes = _getreligious_times(_currentmonth,_currentday,main._longitude,main._latitude,main.__c.getField(true,"False"),main.__c.getField(true,"False"));Debug.locals.put("prayerTimes", _prayertimes);Debug.locals.put("prayerTimes", _prayertimes);
 BA.debugLineNum = 626;BA.debugLine="If prayerTimes = Null Then";
Debug.ShouldStop(131072);
if (RemoteObject.solveBoolean("n",_prayertimes)) { 
 BA.debugLineNum = 627;BA.debugLine="Log(\"Prayer times calculation failed\")";
Debug.ShouldStop(262144);
main.__c.runVoidMethod ("LogImpl","2262153",RemoteObject.createImmutable("Prayer times calculation failed"),0);
 BA.debugLineNum = 628;BA.debugLine="Return";
Debug.ShouldStop(524288);
Debug.CheckDeviceExceptions();if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 632;BA.debugLine="Dim prayerNames As List = Array As String(\"fajr\"";
Debug.ShouldStop(8388608);
_prayernames = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_prayernames = main.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("String",new int[] {6},new Object[] {BA.ObjectToString("fajr"),BA.ObjectToString("sunrise"),BA.ObjectToString("dhuhr"),BA.ObjectToString("asr"),BA.ObjectToString("maghrib"),RemoteObject.createImmutable("isha")})));Debug.locals.put("prayerNames", _prayernames);Debug.locals.put("prayerNames", _prayernames);
 BA.debugLineNum = 634;BA.debugLine="For i = 0 To 5";
Debug.ShouldStop(33554432);
{
final int step11 = 1;
final int limit11 = 5;
_i = 0 ;
for (;(step11 > 0 && _i <= limit11) || (step11 < 0 && _i >= limit11) ;_i = ((int)(0 + _i + step11))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 635;BA.debugLine="Dim lblTime As Label = prayerLabels.Get(prayerN";
Debug.ShouldStop(67108864);
_lbltime = RemoteObject.createNew ("anywheresoftware.b4j.objects.LabelWrapper");
_lbltime = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.LabelWrapper"), main._prayerlabels.runMethod(false,"Get",(Object)(_prayernames.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))))));Debug.locals.put("lblTime", _lbltime);Debug.locals.put("lblTime", _lbltime);
 BA.debugLineNum = 636;BA.debugLine="lblTime.Text = prayerTimes(i)";
Debug.ShouldStop(134217728);
_lbltime.runMethod(true,"setText",BA.ObjectToString(_prayertimes.getArrayElement(false,BA.numberCast(int.class, _i))));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 639;BA.debugLine="Log(\"Prayer times updated successfully\")";
Debug.ShouldStop(1073741824);
main.__c.runVoidMethod ("LogImpl","2262165",RemoteObject.createImmutable("Prayer times updated successfully"),0);
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e17) {
			BA.rdebugUtils.runVoidMethod("setLastException",main.ba, e17.toString()); BA.debugLineNum = 641;BA.debugLine="Log(\"Prayer times error: \" & LastException.Messa";
Debug.ShouldStop(1);
main.__c.runVoidMethod ("LogImpl","2262167",RemoteObject.concat(RemoteObject.createImmutable("Prayer times error: "),main.__c.runMethod(false,"LastException",main.ba).runMethod(true,"getMessage")),0);
 };
 BA.debugLineNum = 643;BA.debugLine="End Sub";
Debug.ShouldStop(4);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _fetchweather() throws Exception{
try {
		Debug.PushSubsStack("FetchWeather (main) ","main",0,main.ba,main.mostCurrent,1151);
if (RapidSub.canDelegate("fetchweather")) { b4j.example.main.remoteMe.runUserSub(false, "main","fetchweather"); return;}
ResumableSub_FetchWeather rsub = new ResumableSub_FetchWeather(null);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_FetchWeather extends BA.ResumableSub {
public ResumableSub_FetchWeather(b4j.example.main parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
b4j.example.main parent;
RemoteObject _url = RemoteObject.createImmutable("");
RemoteObject _j = RemoteObject.declareNull("b4j.example.httpjob");
RemoteObject _jp = RemoteObject.declareNull("anywheresoftware.b4j.objects.collections.JSONParser");
RemoteObject _data = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _current = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _wcode = RemoteObject.createImmutable(0);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("FetchWeather (main) ","main",0,main.ba,main.mostCurrent,1151);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
try {

        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 BA.debugLineNum = 1152;BA.debugLine="Try";
Debug.ShouldStop(-2147483648);
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
 BA.debugLineNum = 1153;BA.debugLine="Dim url As String = \"https://api.open-meteo.com/";
Debug.ShouldStop(1);
_url = RemoteObject.concat(RemoteObject.createImmutable("https://api.open-meteo.com/v1/forecast?latitude="),parent._latitude,RemoteObject.createImmutable("&longitude="),parent._longitude,RemoteObject.createImmutable("&current=temperature_2m,relative_humidity_2m,wind_speed_10m,weather_code&timezone=auto"));Debug.locals.put("url", _url);Debug.locals.put("url", _url);
 BA.debugLineNum = 1154;BA.debugLine="job.Initialize(\"weather\", Me)";
Debug.ShouldStop(2);
parent._job.runClassMethod (b4j.example.httpjob.class, "_initialize" /*RemoteObject*/ ,main.ba,(Object)(BA.ObjectToString("weather")),(Object)(main.getObject()));
 BA.debugLineNum = 1155;BA.debugLine="job.Download(url)";
Debug.ShouldStop(4);
parent._job.runClassMethod (b4j.example.httpjob.class, "_download" /*RemoteObject*/ ,(Object)(_url));
 BA.debugLineNum = 1156;BA.debugLine="Wait For (job) JobDone(j As HttpJob)";
Debug.ShouldStop(8);
parent.__c.runVoidMethod ("WaitFor","jobdone", main.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "main", "fetchweather"), (parent._job));
this.state = 17;
return;
case 17:
//C
this.state = 4;
_j = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(0));Debug.locals.put("j", _j);
;
 BA.debugLineNum = 1157;BA.debugLine="If j.Success Then";
Debug.ShouldStop(16);
if (true) break;

case 4:
//if
this.state = 7;
if (_j.getField(true,"_success" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
 BA.debugLineNum = 1158;BA.debugLine="Dim jp As JSONParser";
Debug.ShouldStop(32);
_jp = RemoteObject.createNew ("anywheresoftware.b4j.objects.collections.JSONParser");Debug.locals.put("jp", _jp);
 BA.debugLineNum = 1159;BA.debugLine="jp.Initialize(j.GetString)";
Debug.ShouldStop(64);
_jp.runVoidMethod ("Initialize",(Object)(_j.runClassMethod (b4j.example.httpjob.class, "_getstring" /*RemoteObject*/ )));
 BA.debugLineNum = 1160;BA.debugLine="Dim data As Map = jp.NextObject";
Debug.ShouldStop(128);
_data = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_data = _jp.runMethod(false,"NextObject");Debug.locals.put("data", _data);Debug.locals.put("data", _data);
 BA.debugLineNum = 1161;BA.debugLine="Dim current As Map = data.Get(\"current\")";
Debug.ShouldStop(256);
_current = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_current = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _data.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("current")))));Debug.locals.put("current", _current);Debug.locals.put("current", _current);
 BA.debugLineNum = 1162;BA.debugLine="weatherData.Put(\"temperature\", NumberFormat2(cu";
Debug.ShouldStop(512);
parent._weatherdata.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("temperature"))),(Object)((parent.__c.runMethod(true,"NumberFormat2",(Object)(BA.numberCast(double.class, _current.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("temperature_2m")))))),(Object)(BA.numberCast(int.class, 1)),(Object)(BA.numberCast(int.class, 1)),(Object)(BA.numberCast(int.class, 1)),(Object)(parent.__c.getField(true,"False"))))));
 BA.debugLineNum = 1163;BA.debugLine="weatherData.Put(\"humidity\", current.Get(\"relati";
Debug.ShouldStop(1024);
parent._weatherdata.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("humidity"))),(Object)(_current.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("relative_humidity_2m"))))));
 BA.debugLineNum = 1164;BA.debugLine="weatherData.Put(\"wind_speed\", NumberFormat2(cur";
Debug.ShouldStop(2048);
parent._weatherdata.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("wind_speed"))),(Object)((parent.__c.runMethod(true,"NumberFormat2",(Object)(BA.numberCast(double.class, _current.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("wind_speed_10m")))))),(Object)(BA.numberCast(int.class, 1)),(Object)(BA.numberCast(int.class, 1)),(Object)(BA.numberCast(int.class, 1)),(Object)(parent.__c.getField(true,"False"))))));
 BA.debugLineNum = 1165;BA.debugLine="Dim wCode As Int = current.Get(\"weather_code\")";
Debug.ShouldStop(4096);
_wcode = BA.numberCast(int.class, _current.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("weather_code")))));Debug.locals.put("wCode", _wcode);Debug.locals.put("wCode", _wcode);
 BA.debugLineNum = 1166;BA.debugLine="weatherEmoji = GetWeatherEmoji(wCode)";
Debug.ShouldStop(8192);
parent._weatheremoji = _getweatheremoji(_wcode);
 BA.debugLineNum = 1167;BA.debugLine="Log(\"Weather updated: \" & weatherEmoji)";
Debug.ShouldStop(16384);
parent.__c.runVoidMethod ("LogImpl","21179664",RemoteObject.concat(RemoteObject.createImmutable("Weather updated: "),parent._weatheremoji),0);
 if (true) break;

case 7:
//C
this.state = 16;
;
 BA.debugLineNum = 1169;BA.debugLine="job.Release";
Debug.ShouldStop(65536);
parent._job.runClassMethod (b4j.example.httpjob.class, "_release" /*RemoteObject*/ );
 Debug.CheckDeviceExceptions();
if (true) break;

case 9:
//C
this.state = 10;
this.catchState = 0;
 BA.debugLineNum = 1171;BA.debugLine="Log(\"Weather error: \" & LastException.Message)";
Debug.ShouldStop(262144);
parent.__c.runVoidMethod ("LogImpl","21179668",RemoteObject.concat(RemoteObject.createImmutable("Weather error: "),parent.__c.runMethod(false,"LastException",main.ba).runMethod(true,"getMessage")),0);
 BA.debugLineNum = 1172;BA.debugLine="If job <> Null Then job.Release";
Debug.ShouldStop(524288);
if (true) break;

case 10:
//if
this.state = 15;
if (RemoteObject.solveBoolean("N",parent._job)) { 
this.state = 12;
;}if (true) break;

case 12:
//C
this.state = 15;
parent._job.runClassMethod (b4j.example.httpjob.class, "_release" /*RemoteObject*/ );
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
 BA.debugLineNum = 1174;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
if (true) break;
}} 
       catch (Exception e0) {
			
if (catchState == 0)
    throw e0;
else {
    state = catchState;
BA.rdebugUtils.runVoidMethod("setLastException",main.ba, e0.toString());}
            }
        }
    }
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}
public static void  _jobdone(RemoteObject _j) throws Exception{
}
public static RemoteObject  _fixangle(RemoteObject _angle) throws Exception{
try {
		Debug.PushSubsStack("FixAngle (main) ","main",0,main.ba,main.mostCurrent,1220);
if (RapidSub.canDelegate("fixangle")) { return b4j.example.main.remoteMe.runUserSub(false, "main","fixangle", _angle);}
Debug.locals.put("angle", _angle);
 BA.debugLineNum = 1220;BA.debugLine="Sub FixAngle(angle As Double) As Double";
Debug.ShouldStop(8);
 BA.debugLineNum = 1221;BA.debugLine="angle = angle - 360.0 * Floor(angle / 360.0)";
Debug.ShouldStop(16);
_angle = RemoteObject.solve(new RemoteObject[] {_angle,RemoteObject.createImmutable(360.0),main.__c.runMethod(true,"Floor",(Object)(RemoteObject.solve(new RemoteObject[] {_angle,RemoteObject.createImmutable(360.0)}, "/",0, 0)))}, "-*",1, 0);Debug.locals.put("angle", _angle);
 BA.debugLineNum = 1222;BA.debugLine="If angle < 0 Then angle = angle + 360.0";
Debug.ShouldStop(32);
if (RemoteObject.solveBoolean("<",_angle,BA.numberCast(double.class, 0))) { 
_angle = RemoteObject.solve(new RemoteObject[] {_angle,RemoteObject.createImmutable(360.0)}, "+",1, 0);Debug.locals.put("angle", _angle);};
 BA.debugLineNum = 1223;BA.debugLine="Return angle";
Debug.ShouldStop(64);
if (true) return _angle;
 BA.debugLineNum = 1224;BA.debugLine="End Sub";
Debug.ShouldStop(128);
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _fixhour(RemoteObject _hour) throws Exception{
try {
		Debug.PushSubsStack("FixHour (main) ","main",0,main.ba,main.mostCurrent,1226);
if (RapidSub.canDelegate("fixhour")) { return b4j.example.main.remoteMe.runUserSub(false, "main","fixhour", _hour);}
Debug.locals.put("hour", _hour);
 BA.debugLineNum = 1226;BA.debugLine="Sub FixHour(hour As Double) As Double";
Debug.ShouldStop(512);
 BA.debugLineNum = 1227;BA.debugLine="hour = hour - 24.0 * Floor(hour / 24.0)";
Debug.ShouldStop(1024);
_hour = RemoteObject.solve(new RemoteObject[] {_hour,RemoteObject.createImmutable(24.0),main.__c.runMethod(true,"Floor",(Object)(RemoteObject.solve(new RemoteObject[] {_hour,RemoteObject.createImmutable(24.0)}, "/",0, 0)))}, "-*",1, 0);Debug.locals.put("hour", _hour);
 BA.debugLineNum = 1228;BA.debugLine="If hour < 0 Then hour = hour + 24.0";
Debug.ShouldStop(2048);
if (RemoteObject.solveBoolean("<",_hour,BA.numberCast(double.class, 0))) { 
_hour = RemoteObject.solve(new RemoteObject[] {_hour,RemoteObject.createImmutable(24.0)}, "+",1, 0);Debug.locals.put("hour", _hour);};
 BA.debugLineNum = 1229;BA.debugLine="Return hour";
Debug.ShouldStop(4096);
if (true) return _hour;
 BA.debugLineNum = 1230;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _fmod(RemoteObject _s1,RemoteObject _s2) throws Exception{
try {
		Debug.PushSubsStack("fmod (main) ","main",0,main.ba,main.mostCurrent,757);
if (RapidSub.canDelegate("fmod")) { return b4j.example.main.remoteMe.runUserSub(false, "main","fmod", _s1, _s2);}
Debug.locals.put("s1", _s1);
Debug.locals.put("s2", _s2);
 BA.debugLineNum = 757;BA.debugLine="Private Sub fmod(s1 As Double, s2 As Double) As Do";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 758;BA.debugLine="Return s1 Mod s2";
Debug.ShouldStop(2097152);
if (true) return RemoteObject.solve(new RemoteObject[] {_s1,_s2}, "%",0, 0);
 BA.debugLineNum = 759;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _formattimefromdecimal(RemoteObject _time,RemoteObject _showseconds) throws Exception{
try {
		Debug.PushSubsStack("FormatTimeFromDecimal (main) ","main",0,main.ba,main.mostCurrent,741);
if (RapidSub.canDelegate("formattimefromdecimal")) { return b4j.example.main.remoteMe.runUserSub(false, "main","formattimefromdecimal", _time, _showseconds);}
RemoteObject _hours = RemoteObject.createImmutable(0);
RemoteObject _minutes = RemoteObject.createImmutable(0);
RemoteObject _mins = RemoteObject.createImmutable(0);
RemoteObject _secs = RemoteObject.createImmutable(0);
RemoteObject _h = RemoteObject.createImmutable("");
RemoteObject _m = RemoteObject.createImmutable("");
RemoteObject _s = RemoteObject.createImmutable("");
Debug.locals.put("time", _time);
Debug.locals.put("showSeconds", _showseconds);
 BA.debugLineNum = 741;BA.debugLine="Sub FormatTimeFromDecimal(time As Double, showSeco";
Debug.ShouldStop(16);
 BA.debugLineNum = 742;BA.debugLine="time = FixHour(time + 0.5 / 60.0)";
Debug.ShouldStop(32);
_time = _fixhour(RemoteObject.solve(new RemoteObject[] {_time,RemoteObject.createImmutable(0.5),RemoteObject.createImmutable(60.0)}, "+/",1, 0));Debug.locals.put("time", _time);
 BA.debugLineNum = 743;BA.debugLine="Dim hours As Int = Floor(time)";
Debug.ShouldStop(64);
_hours = BA.numberCast(int.class, main.__c.runMethod(true,"Floor",(Object)(_time)));Debug.locals.put("hours", _hours);Debug.locals.put("hours", _hours);
 BA.debugLineNum = 744;BA.debugLine="Dim minutes As Double = (time - hours) * 60.0";
Debug.ShouldStop(128);
_minutes = RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {_time,_hours}, "-",1, 0)),RemoteObject.createImmutable(60.0)}, "*",0, 0);Debug.locals.put("minutes", _minutes);Debug.locals.put("minutes", _minutes);
 BA.debugLineNum = 745;BA.debugLine="Dim mins As Int = Floor(minutes)";
Debug.ShouldStop(256);
_mins = BA.numberCast(int.class, main.__c.runMethod(true,"Floor",(Object)(_minutes)));Debug.locals.put("mins", _mins);Debug.locals.put("mins", _mins);
 BA.debugLineNum = 746;BA.debugLine="Dim secs As Int = Floor((minutes - mins) * 60.0)";
Debug.ShouldStop(512);
_secs = BA.numberCast(int.class, main.__c.runMethod(true,"Floor",(Object)(RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {_minutes,_mins}, "-",1, 0)),RemoteObject.createImmutable(60.0)}, "*",0, 0))));Debug.locals.put("secs", _secs);Debug.locals.put("secs", _secs);
 BA.debugLineNum = 747;BA.debugLine="Dim h As String = NumberFormat(hours, 2, 0)";
Debug.ShouldStop(1024);
_h = main.__c.runMethod(true,"NumberFormat",(Object)(BA.numberCast(double.class, _hours)),(Object)(BA.numberCast(int.class, 2)),(Object)(BA.numberCast(int.class, 0)));Debug.locals.put("h", _h);Debug.locals.put("h", _h);
 BA.debugLineNum = 748;BA.debugLine="Dim m As String = NumberFormat(mins, 2, 0)";
Debug.ShouldStop(2048);
_m = main.__c.runMethod(true,"NumberFormat",(Object)(BA.numberCast(double.class, _mins)),(Object)(BA.numberCast(int.class, 2)),(Object)(BA.numberCast(int.class, 0)));Debug.locals.put("m", _m);Debug.locals.put("m", _m);
 BA.debugLineNum = 749;BA.debugLine="If showSeconds Then";
Debug.ShouldStop(4096);
if (_showseconds.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 750;BA.debugLine="Dim s As String = NumberFormat(secs, 2, 0)";
Debug.ShouldStop(8192);
_s = main.__c.runMethod(true,"NumberFormat",(Object)(BA.numberCast(double.class, _secs)),(Object)(BA.numberCast(int.class, 2)),(Object)(BA.numberCast(int.class, 0)));Debug.locals.put("s", _s);Debug.locals.put("s", _s);
 BA.debugLineNum = 751;BA.debugLine="Return h & \":\" & m & \":\" & s";
Debug.ShouldStop(16384);
if (true) return RemoteObject.concat(_h,RemoteObject.createImmutable(":"),_m,RemoteObject.createImmutable(":"),_s);
 }else {
 BA.debugLineNum = 753;BA.debugLine="Return h & \":\" & m";
Debug.ShouldStop(65536);
if (true) return RemoteObject.concat(_h,RemoteObject.createImmutable(":"),_m);
 };
 BA.debugLineNum = 755;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getalerttype(RemoteObject _alerttype) throws Exception{
try {
		Debug.PushSubsStack("GetAlertType (main) ","main",0,main.ba,main.mostCurrent,1429);
if (RapidSub.canDelegate("getalerttype")) { return b4j.example.main.remoteMe.runUserSub(false, "main","getalerttype", _alerttype);}
Debug.locals.put("alertType", _alerttype);
 BA.debugLineNum = 1429;BA.debugLine="Sub GetAlertType(alertType As String) As Object";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 1430;BA.debugLine="Dim jo As JavaObject";
Debug.ShouldStop(2097152);
main._jo = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
 BA.debugLineNum = 1431;BA.debugLine="jo.InitializeStatic(\"javafx.scene.control.Alert.A";
Debug.ShouldStop(4194304);
main._jo.runVoidMethod ("InitializeStatic",(Object)(RemoteObject.createImmutable("javafx.scene.control.Alert.AlertType")));
 BA.debugLineNum = 1432;BA.debugLine="Return jo.GetField(alertType)";
Debug.ShouldStop(8388608);
if (true) return main._jo.runMethod(false,"GetField",(Object)(_alerttype));
 BA.debugLineNum = 1433;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getasrtime(RemoteObject _jd,RemoteObject _lat,RemoteObject _lng,RemoteObject _timezone,RemoteObject _asrfactor) throws Exception{
try {
		Debug.PushSubsStack("GetAsrTime (main) ","main",0,main.ba,main.mostCurrent,723);
if (RapidSub.canDelegate("getasrtime")) { return b4j.example.main.remoteMe.runUserSub(false, "main","getasrtime", _jd, _lat, _lng, _timezone, _asrfactor);}
RemoteObject _decl = RemoteObject.createImmutable(0);
RemoteObject _noon = RemoteObject.createImmutable(0);
RemoteObject _tanalt = RemoteObject.createImmutable(0);
RemoteObject _altitude = RemoteObject.createImmutable(0);
RemoteObject _angle = RemoteObject.createImmutable(0);
RemoteObject _cosh = RemoteObject.createImmutable(0);
RemoteObject _hourangle = RemoteObject.createImmutable(0);
RemoteObject _time = RemoteObject.createImmutable(0);
Debug.locals.put("jd", _jd);
Debug.locals.put("lat", _lat);
Debug.locals.put("lng", _lng);
Debug.locals.put("timezone", _timezone);
Debug.locals.put("asrFactor", _asrfactor);
 BA.debugLineNum = 723;BA.debugLine="Sub GetAsrTime(jd As Double, lat As Double, lng As";
Debug.ShouldStop(262144);
 BA.debugLineNum = 724;BA.debugLine="Dim decl As Double = GetSunDeclination(jd)";
Debug.ShouldStop(524288);
_decl = _getsundeclination(_jd);Debug.locals.put("decl", _decl);Debug.locals.put("decl", _decl);
 BA.debugLineNum = 725;BA.debugLine="Dim noon As Double = 12.0 + timezone - lng / 15.0";
Debug.ShouldStop(1048576);
_noon = RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(12.0),_timezone,_lng,RemoteObject.createImmutable(15.0),_getequationoftime(_jd)}, "+-/-",3, 0);Debug.locals.put("noon", _noon);Debug.locals.put("noon", _noon);
 BA.debugLineNum = 726;BA.debugLine="Dim tanAlt As Double = 1.0 / (asrFactor + dtan(Ab";
Debug.ShouldStop(2097152);
_tanalt = RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(1.0),(RemoteObject.solve(new RemoteObject[] {_asrfactor,_dtan(main.__c.runMethod(true,"Abs",(Object)(RemoteObject.solve(new RemoteObject[] {_lat,_decl}, "-",1, 0))))}, "+",1, 0))}, "/",0, 0);Debug.locals.put("tanAlt", _tanalt);Debug.locals.put("tanAlt", _tanalt);
 BA.debugLineNum = 727;BA.debugLine="Dim altitude As Double = datan(tanAlt)";
Debug.ShouldStop(4194304);
_altitude = _datan(_tanalt);Debug.locals.put("altitude", _altitude);Debug.locals.put("altitude", _altitude);
 BA.debugLineNum = 728;BA.debugLine="Dim angle As Double = 90.0 - altitude";
Debug.ShouldStop(8388608);
_angle = RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(90.0),_altitude}, "-",1, 0);Debug.locals.put("angle", _angle);Debug.locals.put("angle", _angle);
 BA.debugLineNum = 729;BA.debugLine="Dim cosH As Double = (dcos(angle) - dsin(decl) *";
Debug.ShouldStop(16777216);
_cosh = RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {_dcos(_angle),_dsin(_decl),_dsin(_lat)}, "-*",1, 0)),(RemoteObject.solve(new RemoteObject[] {_dcos(_decl),_dcos(_lat)}, "*",0, 0))}, "/",0, 0);Debug.locals.put("cosH", _cosh);Debug.locals.put("cosH", _cosh);
 BA.debugLineNum = 730;BA.debugLine="If cosH > 1.0 Then cosH = 1.0";
Debug.ShouldStop(33554432);
if (RemoteObject.solveBoolean(">",_cosh,BA.numberCast(double.class, 1.0))) { 
_cosh = BA.numberCast(double.class, 1.0);Debug.locals.put("cosH", _cosh);};
 BA.debugLineNum = 731;BA.debugLine="If cosH < -1.0 Then cosH = -1.0";
Debug.ShouldStop(67108864);
if (RemoteObject.solveBoolean("<",_cosh,BA.numberCast(double.class, -1.0))) { 
_cosh = BA.numberCast(double.class, -1.0);Debug.locals.put("cosH", _cosh);};
 BA.debugLineNum = 732;BA.debugLine="Dim hourAngle As Double = dacos(cosH) / 15.0";
Debug.ShouldStop(134217728);
_hourangle = RemoteObject.solve(new RemoteObject[] {_dacos(_cosh),RemoteObject.createImmutable(15.0)}, "/",0, 0);Debug.locals.put("hourAngle", _hourangle);Debug.locals.put("hourAngle", _hourangle);
 BA.debugLineNum = 733;BA.debugLine="Dim time As Double = noon + hourAngle";
Debug.ShouldStop(268435456);
_time = RemoteObject.solve(new RemoteObject[] {_noon,_hourangle}, "+",1, 0);Debug.locals.put("time", _time);Debug.locals.put("time", _time);
 BA.debugLineNum = 734;BA.debugLine="Return time";
Debug.ShouldStop(536870912);
if (true) return _time;
 BA.debugLineNum = 735;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getequationoftime(RemoteObject _jd) throws Exception{
try {
		Debug.PushSubsStack("GetEquationOfTime (main) ","main",0,main.ba,main.mostCurrent,685);
if (RapidSub.canDelegate("getequationoftime")) { return b4j.example.main.remoteMe.runUserSub(false, "main","getequationoftime", _jd);}
RemoteObject _d = RemoteObject.createImmutable(0);
RemoteObject _g = RemoteObject.createImmutable(0);
RemoteObject _q = RemoteObject.createImmutable(0);
RemoteObject _l = RemoteObject.createImmutable(0);
RemoteObject _e = RemoteObject.createImmutable(0);
RemoteObject _ra = RemoteObject.createImmutable(0);
RemoteObject _eqt = RemoteObject.createImmutable(0);
Debug.locals.put("jd", _jd);
 BA.debugLineNum = 685;BA.debugLine="Sub GetEquationOfTime(jd As Double) As Double";
Debug.ShouldStop(4096);
 BA.debugLineNum = 686;BA.debugLine="Dim d As Double = jd - 2451545.0";
Debug.ShouldStop(8192);
_d = RemoteObject.solve(new RemoteObject[] {_jd,RemoteObject.createImmutable(2451545.0)}, "-",1, 0);Debug.locals.put("d", _d);Debug.locals.put("d", _d);
 BA.debugLineNum = 687;BA.debugLine="Dim g As Double = FixAngle(357.529 + 0.98560028 *";
Debug.ShouldStop(16384);
_g = _fixangle(RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(357.529),RemoteObject.createImmutable(0.98560028),_d}, "+*",1, 0));Debug.locals.put("g", _g);Debug.locals.put("g", _g);
 BA.debugLineNum = 688;BA.debugLine="Dim q As Double = FixAngle(280.459 + 0.98564736 *";
Debug.ShouldStop(32768);
_q = _fixangle(RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(280.459),RemoteObject.createImmutable(0.98564736),_d}, "+*",1, 0));Debug.locals.put("q", _q);Debug.locals.put("q", _q);
 BA.debugLineNum = 689;BA.debugLine="Dim L As Double = FixAngle(q + 1.915 * dsin(g) +";
Debug.ShouldStop(65536);
_l = _fixangle(RemoteObject.solve(new RemoteObject[] {_q,RemoteObject.createImmutable(1.915),_dsin(_g),RemoteObject.createImmutable(0.020),_dsin(RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(2),_g}, "*",0, 0))}, "+*+*",2, 0));Debug.locals.put("L", _l);Debug.locals.put("L", _l);
 BA.debugLineNum = 690;BA.debugLine="Dim e As Double = 23.439 - 0.00000036 * d";
Debug.ShouldStop(131072);
_e = RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(23.439),RemoteObject.createImmutable(0.00000036),_d}, "-*",1, 0);Debug.locals.put("e", _e);Debug.locals.put("e", _e);
 BA.debugLineNum = 691;BA.debugLine="Dim RA As Double = datan2(dcos(e) * dsin(L), dcos";
Debug.ShouldStop(262144);
_ra = RemoteObject.solve(new RemoteObject[] {_datan2(RemoteObject.solve(new RemoteObject[] {_dcos(_e),_dsin(_l)}, "*",0, 0),_dcos(_l)),RemoteObject.createImmutable(15.0)}, "/",0, 0);Debug.locals.put("RA", _ra);Debug.locals.put("RA", _ra);
 BA.debugLineNum = 692;BA.debugLine="RA = FixHour(RA)";
Debug.ShouldStop(524288);
_ra = _fixhour(_ra);Debug.locals.put("RA", _ra);
 BA.debugLineNum = 693;BA.debugLine="Dim EqT As Double = q / 15.0 - RA";
Debug.ShouldStop(1048576);
_eqt = RemoteObject.solve(new RemoteObject[] {_q,RemoteObject.createImmutable(15.0),_ra}, "/-",1, 0);Debug.locals.put("EqT", _eqt);Debug.locals.put("EqT", _eqt);
 BA.debugLineNum = 694;BA.debugLine="Return FixHour(EqT)";
Debug.ShouldStop(2097152);
if (true) return _fixhour(_eqt);
 BA.debugLineNum = 695;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getjuliandate(RemoteObject _year,RemoteObject _month,RemoteObject _day) throws Exception{
try {
		Debug.PushSubsStack("GetJulianDate (main) ","main",0,main.ba,main.mostCurrent,674);
if (RapidSub.canDelegate("getjuliandate")) { return b4j.example.main.remoteMe.runUserSub(false, "main","getjuliandate", _year, _month, _day);}
RemoteObject _a = RemoteObject.createImmutable(0);
RemoteObject _b = RemoteObject.createImmutable(0);
RemoteObject _jd = RemoteObject.createImmutable(0);
Debug.locals.put("year", _year);
Debug.locals.put("month", _month);
Debug.locals.put("day", _day);
 BA.debugLineNum = 674;BA.debugLine="Sub GetJulianDate(year As Int, month As Int, day A";
Debug.ShouldStop(2);
 BA.debugLineNum = 675;BA.debugLine="If month <= 2 Then";
Debug.ShouldStop(4);
if (RemoteObject.solveBoolean("k",_month,BA.numberCast(double.class, 2))) { 
 BA.debugLineNum = 676;BA.debugLine="year = year - 1";
Debug.ShouldStop(8);
_year = RemoteObject.solve(new RemoteObject[] {_year,RemoteObject.createImmutable(1)}, "-",1, 1);Debug.locals.put("year", _year);
 BA.debugLineNum = 677;BA.debugLine="month = month + 12";
Debug.ShouldStop(16);
_month = RemoteObject.solve(new RemoteObject[] {_month,RemoteObject.createImmutable(12)}, "+",1, 1);Debug.locals.put("month", _month);
 };
 BA.debugLineNum = 679;BA.debugLine="Dim A As Int = Floor(year / 100.0)";
Debug.ShouldStop(64);
_a = BA.numberCast(int.class, main.__c.runMethod(true,"Floor",(Object)(RemoteObject.solve(new RemoteObject[] {_year,RemoteObject.createImmutable(100.0)}, "/",0, 0))));Debug.locals.put("A", _a);Debug.locals.put("A", _a);
 BA.debugLineNum = 680;BA.debugLine="Dim B As Int = 2 - A + Floor(A / 4.0)";
Debug.ShouldStop(128);
_b = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(2),_a,main.__c.runMethod(true,"Floor",(Object)(RemoteObject.solve(new RemoteObject[] {_a,RemoteObject.createImmutable(4.0)}, "/",0, 0)))}, "-+",2, 0));Debug.locals.put("B", _b);Debug.locals.put("B", _b);
 BA.debugLineNum = 681;BA.debugLine="Dim JD As Double = Floor(365.25 * (year + 4716))";
Debug.ShouldStop(256);
_jd = RemoteObject.solve(new RemoteObject[] {main.__c.runMethod(true,"Floor",(Object)(RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(365.25),(RemoteObject.solve(new RemoteObject[] {_year,RemoteObject.createImmutable(4716)}, "+",1, 1))}, "*",0, 0))),main.__c.runMethod(true,"Floor",(Object)(RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(30.6001),(RemoteObject.solve(new RemoteObject[] {_month,RemoteObject.createImmutable(1)}, "+",1, 1))}, "*",0, 0))),_day,_b,RemoteObject.createImmutable(1524.5)}, "+++-",4, 0);Debug.locals.put("JD", _jd);Debug.locals.put("JD", _jd);
 BA.debugLineNum = 682;BA.debugLine="Return JD";
Debug.ShouldStop(512);
if (true) return _jd;
 BA.debugLineNum = 683;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getreligious_times(RemoteObject _month,RemoteObject _day,RemoteObject _longitude1,RemoteObject _latitude1,RemoteObject _second_show,RemoteObject _official_time) throws Exception{
try {
		Debug.PushSubsStack("GetReligious_times (main) ","main",0,main.ba,main.mostCurrent,646);
if (RapidSub.canDelegate("getreligious_times")) { return b4j.example.main.remoteMe.runUserSub(false, "main","getreligious_times", _month, _day, _longitude1, _latitude1, _second_show, _official_time);}
RemoteObject _currentyear = RemoteObject.createImmutable(0);
RemoteObject _jd = RemoteObject.createImmutable(0);
RemoteObject _timezone = RemoteObject.createImmutable(0);
RemoteObject _fajrangle = RemoteObject.createImmutable(0);
RemoteObject _ishaangle = RemoteObject.createImmutable(0);
RemoteObject _asrjuristic = RemoteObject.createImmutable(0);
RemoteObject _sundecl = RemoteObject.createImmutable(0);
RemoteObject _eqt = RemoteObject.createImmutable(0);
RemoteObject _dhuhr = RemoteObject.createImmutable(0);
RemoteObject _times = null;
Debug.locals.put("Month", _month);
Debug.locals.put("Day", _day);
Debug.locals.put("longitude1", _longitude1);
Debug.locals.put("latitude1", _latitude1);
Debug.locals.put("Second_Show", _second_show);
Debug.locals.put("Official_time", _official_time);
 BA.debugLineNum = 646;BA.debugLine="Sub GetReligious_times(Month As Int, Day As Int, l";
Debug.ShouldStop(32);
 BA.debugLineNum = 647;BA.debugLine="Try";
Debug.ShouldStop(64);
try { BA.debugLineNum = 648;BA.debugLine="Dim currentYear As Int = DateTime.GetYear(DateTi";
Debug.ShouldStop(128);
_currentyear = main.__c.getField(false,"DateTime").runMethod(true,"GetYear",(Object)(main.__c.getField(false,"DateTime").runMethod(true,"getNow")));Debug.locals.put("currentYear", _currentyear);Debug.locals.put("currentYear", _currentyear);
 BA.debugLineNum = 649;BA.debugLine="Dim jd As Double = GetJulianDate(currentYear, Mo";
Debug.ShouldStop(256);
_jd = _getjuliandate(_currentyear,_month,_day);Debug.locals.put("jd", _jd);Debug.locals.put("jd", _jd);
 BA.debugLineNum = 650;BA.debugLine="Dim timezone As Double = 1.0";
Debug.ShouldStop(512);
_timezone = BA.numberCast(double.class, 1.0);Debug.locals.put("timezone", _timezone);Debug.locals.put("timezone", _timezone);
 BA.debugLineNum = 651;BA.debugLine="Dim fajrAngle As Double = 18.0";
Debug.ShouldStop(1024);
_fajrangle = BA.numberCast(double.class, 18.0);Debug.locals.put("fajrAngle", _fajrangle);Debug.locals.put("fajrAngle", _fajrangle);
 BA.debugLineNum = 652;BA.debugLine="Dim ishaAngle As Double = 17.0";
Debug.ShouldStop(2048);
_ishaangle = BA.numberCast(double.class, 17.0);Debug.locals.put("ishaAngle", _ishaangle);Debug.locals.put("ishaAngle", _ishaangle);
 BA.debugLineNum = 653;BA.debugLine="Dim asrJuristic As Int = 1";
Debug.ShouldStop(4096);
_asrjuristic = BA.numberCast(int.class, 1);Debug.locals.put("asrJuristic", _asrjuristic);Debug.locals.put("asrJuristic", _asrjuristic);
 BA.debugLineNum = 655;BA.debugLine="Dim sunDecl As Double = GetSunDeclination(jd)";
Debug.ShouldStop(16384);
_sundecl = _getsundeclination(_jd);Debug.locals.put("sunDecl", _sundecl);Debug.locals.put("sunDecl", _sundecl);
 BA.debugLineNum = 656;BA.debugLine="Dim eqt As Double = GetEquationOfTime(jd)";
Debug.ShouldStop(32768);
_eqt = _getequationoftime(_jd);Debug.locals.put("eqt", _eqt);Debug.locals.put("eqt", _eqt);
 BA.debugLineNum = 657;BA.debugLine="Dim dhuhr As Double = 12.0 + timezone - longitud";
Debug.ShouldStop(65536);
_dhuhr = RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(12.0),_timezone,_longitude1,RemoteObject.createImmutable(15.0),_eqt}, "+-/-",3, 0);Debug.locals.put("dhuhr", _dhuhr);Debug.locals.put("dhuhr", _dhuhr);
 BA.debugLineNum = 659;BA.debugLine="Dim times(6) As String";
Debug.ShouldStop(262144);
_times = RemoteObject.createNewArray ("String", new int[] {6}, new Object[]{});Debug.locals.put("times", _times);
 BA.debugLineNum = 660;BA.debugLine="times(0) = FormatTimeFromDecimal(GetTimeForAngle";
Debug.ShouldStop(524288);
_times.setArrayElement (_formattimefromdecimal(_gettimeforangle(_jd,_latitude1,_longitude1,_timezone,_fajrangle,main.__c.getField(true,"True")),_second_show),BA.numberCast(int.class, 0));
 BA.debugLineNum = 661;BA.debugLine="times(1) = FormatTimeFromDecimal(GetTimeForAngle";
Debug.ShouldStop(1048576);
_times.setArrayElement (_formattimefromdecimal(_gettimeforangle(_jd,_latitude1,_longitude1,_timezone,BA.numberCast(double.class, 0.833),main.__c.getField(true,"True")),_second_show),BA.numberCast(int.class, 1));
 BA.debugLineNum = 662;BA.debugLine="times(2) = FormatTimeFromDecimal(dhuhr, Second_S";
Debug.ShouldStop(2097152);
_times.setArrayElement (_formattimefromdecimal(_dhuhr,_second_show),BA.numberCast(int.class, 2));
 BA.debugLineNum = 663;BA.debugLine="times(3) = FormatTimeFromDecimal(GetAsrTime(jd,";
Debug.ShouldStop(4194304);
_times.setArrayElement (_formattimefromdecimal(_getasrtime(_jd,_latitude1,_longitude1,_timezone,_asrjuristic),_second_show),BA.numberCast(int.class, 3));
 BA.debugLineNum = 664;BA.debugLine="times(4) = FormatTimeFromDecimal(GetTimeForAngle";
Debug.ShouldStop(8388608);
_times.setArrayElement (_formattimefromdecimal(_gettimeforangle(_jd,_latitude1,_longitude1,_timezone,BA.numberCast(double.class, 0.833),main.__c.getField(true,"False")),_second_show),BA.numberCast(int.class, 4));
 BA.debugLineNum = 665;BA.debugLine="times(5) = FormatTimeFromDecimal(GetTimeForAngle";
Debug.ShouldStop(16777216);
_times.setArrayElement (_formattimefromdecimal(_gettimeforangle(_jd,_latitude1,_longitude1,_timezone,_ishaangle,main.__c.getField(true,"False")),_second_show),BA.numberCast(int.class, 5));
 BA.debugLineNum = 667;BA.debugLine="Return times";
Debug.ShouldStop(67108864);
Debug.CheckDeviceExceptions();if (true) return (_times);
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e20) {
			BA.rdebugUtils.runVoidMethod("setLastException",main.ba, e20.toString()); BA.debugLineNum = 669;BA.debugLine="Log(\"GetReligious_times error: \" & LastException";
Debug.ShouldStop(268435456);
main.__c.runVoidMethod ("LogImpl","21441815",RemoteObject.concat(RemoteObject.createImmutable("GetReligious_times error: "),main.__c.runMethod(false,"LastException",main.ba).runMethod(true,"getMessage")),0);
 BA.debugLineNum = 670;BA.debugLine="Return Null";
Debug.ShouldStop(536870912);
if (true) return (main.__c.getField(false,"Null"));
 };
 BA.debugLineNum = 672;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getsundeclination(RemoteObject _jd) throws Exception{
try {
		Debug.PushSubsStack("GetSunDeclination (main) ","main",0,main.ba,main.mostCurrent,697);
if (RapidSub.canDelegate("getsundeclination")) { return b4j.example.main.remoteMe.runUserSub(false, "main","getsundeclination", _jd);}
RemoteObject _d = RemoteObject.createImmutable(0);
RemoteObject _g = RemoteObject.createImmutable(0);
RemoteObject _q = RemoteObject.createImmutable(0);
RemoteObject _l = RemoteObject.createImmutable(0);
RemoteObject _e = RemoteObject.createImmutable(0);
Debug.locals.put("jd", _jd);
 BA.debugLineNum = 697;BA.debugLine="Sub GetSunDeclination(jd As Double) As Double";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 698;BA.debugLine="Dim d As Double = jd - 2451545.0";
Debug.ShouldStop(33554432);
_d = RemoteObject.solve(new RemoteObject[] {_jd,RemoteObject.createImmutable(2451545.0)}, "-",1, 0);Debug.locals.put("D", _d);Debug.locals.put("D", _d);
 BA.debugLineNum = 699;BA.debugLine="Dim g As Double = FixAngle(357.529 + 0.98560028 *";
Debug.ShouldStop(67108864);
_g = _fixangle(RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(357.529),RemoteObject.createImmutable(0.98560028),_d}, "+*",1, 0));Debug.locals.put("g", _g);Debug.locals.put("g", _g);
 BA.debugLineNum = 700;BA.debugLine="Dim q As Double = FixAngle(280.459 + 0.98564736 *";
Debug.ShouldStop(134217728);
_q = _fixangle(RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(280.459),RemoteObject.createImmutable(0.98564736),_d}, "+*",1, 0));Debug.locals.put("q", _q);Debug.locals.put("q", _q);
 BA.debugLineNum = 701;BA.debugLine="Dim L As Double = FixAngle(q + 1.915 * dsin(g) +";
Debug.ShouldStop(268435456);
_l = _fixangle(RemoteObject.solve(new RemoteObject[] {_q,RemoteObject.createImmutable(1.915),_dsin(_g),RemoteObject.createImmutable(0.020),_dsin(RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(2),_g}, "*",0, 0))}, "+*+*",2, 0));Debug.locals.put("L", _l);Debug.locals.put("L", _l);
 BA.debugLineNum = 702;BA.debugLine="Dim e As Double = 23.439 - 0.00000036 * d";
Debug.ShouldStop(536870912);
_e = RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(23.439),RemoteObject.createImmutable(0.00000036),_d}, "-*",1, 0);Debug.locals.put("e", _e);Debug.locals.put("e", _e);
 BA.debugLineNum = 703;BA.debugLine="Dim D As Double = dasin(dsin(e) * dsin(L))";
Debug.ShouldStop(1073741824);
_d = _dasin(RemoteObject.solve(new RemoteObject[] {_dsin(_e),_dsin(_l)}, "*",0, 0));Debug.locals.put("D", _d);Debug.locals.put("D", _d);
 BA.debugLineNum = 704;BA.debugLine="Return D";
Debug.ShouldStop(-2147483648);
if (true) return _d;
 BA.debugLineNum = 705;BA.debugLine="End Sub";
Debug.ShouldStop(1);
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _gettimeforangle(RemoteObject _jd,RemoteObject _lat,RemoteObject _lng,RemoteObject _timezone,RemoteObject _angle,RemoteObject _isbefore) throws Exception{
try {
		Debug.PushSubsStack("GetTimeForAngle (main) ","main",0,main.ba,main.mostCurrent,707);
if (RapidSub.canDelegate("gettimeforangle")) { return b4j.example.main.remoteMe.runUserSub(false, "main","gettimeforangle", _jd, _lat, _lng, _timezone, _angle, _isbefore);}
RemoteObject _decl = RemoteObject.createImmutable(0);
RemoteObject _noon = RemoteObject.createImmutable(0);
RemoteObject _cosh = RemoteObject.createImmutable(0);
RemoteObject _hourangle = RemoteObject.createImmutable(0);
RemoteObject _time = RemoteObject.createImmutable(0);
Debug.locals.put("jd", _jd);
Debug.locals.put("lat", _lat);
Debug.locals.put("lng", _lng);
Debug.locals.put("timezone", _timezone);
Debug.locals.put("angle", _angle);
Debug.locals.put("isBefore", _isbefore);
 BA.debugLineNum = 707;BA.debugLine="Sub GetTimeForAngle(jd As Double, lat As Double, l";
Debug.ShouldStop(4);
 BA.debugLineNum = 708;BA.debugLine="Dim decl As Double = GetSunDeclination(jd)";
Debug.ShouldStop(8);
_decl = _getsundeclination(_jd);Debug.locals.put("decl", _decl);Debug.locals.put("decl", _decl);
 BA.debugLineNum = 709;BA.debugLine="Dim noon As Double = 12.0 + timezone - lng / 15.0";
Debug.ShouldStop(16);
_noon = RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(12.0),_timezone,_lng,RemoteObject.createImmutable(15.0),_getequationoftime(_jd)}, "+-/-",3, 0);Debug.locals.put("noon", _noon);Debug.locals.put("noon", _noon);
 BA.debugLineNum = 710;BA.debugLine="Dim cosH As Double = (dcos(90.0 + angle) - dsin(d";
Debug.ShouldStop(32);
_cosh = RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {_dcos(RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(90.0),_angle}, "+",1, 0)),_dsin(_decl),_dsin(_lat)}, "-*",1, 0)),(RemoteObject.solve(new RemoteObject[] {_dcos(_decl),_dcos(_lat)}, "*",0, 0))}, "/",0, 0);Debug.locals.put("cosH", _cosh);Debug.locals.put("cosH", _cosh);
 BA.debugLineNum = 711;BA.debugLine="If cosH > 1.0 Then cosH = 1.0";
Debug.ShouldStop(64);
if (RemoteObject.solveBoolean(">",_cosh,BA.numberCast(double.class, 1.0))) { 
_cosh = BA.numberCast(double.class, 1.0);Debug.locals.put("cosH", _cosh);};
 BA.debugLineNum = 712;BA.debugLine="If cosH < -1.0 Then cosH = -1.0";
Debug.ShouldStop(128);
if (RemoteObject.solveBoolean("<",_cosh,BA.numberCast(double.class, -1.0))) { 
_cosh = BA.numberCast(double.class, -1.0);Debug.locals.put("cosH", _cosh);};
 BA.debugLineNum = 713;BA.debugLine="Dim hourAngle As Double = dacos(cosH) / 15.0";
Debug.ShouldStop(256);
_hourangle = RemoteObject.solve(new RemoteObject[] {_dacos(_cosh),RemoteObject.createImmutable(15.0)}, "/",0, 0);Debug.locals.put("hourAngle", _hourangle);Debug.locals.put("hourAngle", _hourangle);
 BA.debugLineNum = 714;BA.debugLine="Dim time As Double";
Debug.ShouldStop(512);
_time = RemoteObject.createImmutable(0);Debug.locals.put("time", _time);
 BA.debugLineNum = 715;BA.debugLine="If isBefore Then";
Debug.ShouldStop(1024);
if (_isbefore.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 716;BA.debugLine="time = noon - hourAngle";
Debug.ShouldStop(2048);
_time = RemoteObject.solve(new RemoteObject[] {_noon,_hourangle}, "-",1, 0);Debug.locals.put("time", _time);
 }else {
 BA.debugLineNum = 718;BA.debugLine="time = noon + hourAngle";
Debug.ShouldStop(8192);
_time = RemoteObject.solve(new RemoteObject[] {_noon,_hourangle}, "+",1, 0);Debug.locals.put("time", _time);
 };
 BA.debugLineNum = 720;BA.debugLine="Return time";
Debug.ShouldStop(32768);
if (true) return _time;
 BA.debugLineNum = 721;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _gettranslation(RemoteObject _key) throws Exception{
try {
		Debug.PushSubsStack("GetTranslation (main) ","main",0,main.ba,main.mostCurrent,609);
if (RapidSub.canDelegate("gettranslation")) { return b4j.example.main.remoteMe.runUserSub(false, "main","gettranslation", _key);}
RemoteObject _langmap = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
Debug.locals.put("key", _key);
 BA.debugLineNum = 609;BA.debugLine="Sub GetTranslation(key As String) As String";
Debug.ShouldStop(1);
 BA.debugLineNum = 610;BA.debugLine="Try";
Debug.ShouldStop(2);
try { BA.debugLineNum = 611;BA.debugLine="Dim langMap As Map = translations.Get(currentLan";
Debug.ShouldStop(4);
_langmap = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_langmap = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), main._translations.runMethod(false,"Get",(Object)((main._currentlanguage))));Debug.locals.put("langMap", _langmap);Debug.locals.put("langMap", _langmap);
 BA.debugLineNum = 612;BA.debugLine="Return langMap.GetDefault(key, key)";
Debug.ShouldStop(8);
Debug.CheckDeviceExceptions();if (true) return BA.ObjectToString(_langmap.runMethod(false,"GetDefault",(Object)((_key)),(Object)((_key))));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e5) {
			BA.rdebugUtils.runVoidMethod("setLastException",main.ba, e5.toString()); BA.debugLineNum = 614;BA.debugLine="Return key";
Debug.ShouldStop(32);
if (true) return _key;
 };
 BA.debugLineNum = 616;BA.debugLine="End Sub";
Debug.ShouldStop(128);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getweatheremoji(RemoteObject _code) throws Exception{
try {
		Debug.PushSubsStack("GetWeatherEmoji (main) ","main",0,main.ba,main.mostCurrent,774);
if (RapidSub.canDelegate("getweatheremoji")) { return b4j.example.main.remoteMe.runUserSub(false, "main","getweatheremoji", _code);}
Debug.locals.put("code", _code);
 BA.debugLineNum = 774;BA.debugLine="Sub GetWeatherEmoji(code As Int) As String";
Debug.ShouldStop(32);
 BA.debugLineNum = 775;BA.debugLine="If code = 0 Then Return \"☀️\"";
Debug.ShouldStop(64);
if (RemoteObject.solveBoolean("=",_code,BA.numberCast(double.class, 0))) { 
if (true) return BA.ObjectToString("☀️");};
 BA.debugLineNum = 776;BA.debugLine="If code <= 3 Then Return \"🌤️\"";
Debug.ShouldStop(128);
if (RemoteObject.solveBoolean("k",_code,BA.numberCast(double.class, 3))) { 
if (true) return BA.ObjectToString("🌤️");};
 BA.debugLineNum = 777;BA.debugLine="If code <= 48 Then Return \"🌫️\"";
Debug.ShouldStop(256);
if (RemoteObject.solveBoolean("k",_code,BA.numberCast(double.class, 48))) { 
if (true) return BA.ObjectToString("🌫️");};
 BA.debugLineNum = 778;BA.debugLine="If code <= 67 Then Return \"🌧️\"";
Debug.ShouldStop(512);
if (RemoteObject.solveBoolean("k",_code,BA.numberCast(double.class, 67))) { 
if (true) return BA.ObjectToString("🌧️");};
 BA.debugLineNum = 779;BA.debugLine="If code <= 77 Then Return \"🌨️\"";
Debug.ShouldStop(1024);
if (RemoteObject.solveBoolean("k",_code,BA.numberCast(double.class, 77))) { 
if (true) return BA.ObjectToString("🌨️");};
 BA.debugLineNum = 780;BA.debugLine="If code <= 99 Then Return \"⛈️\"";
Debug.ShouldStop(2048);
if (RemoteObject.solveBoolean("k",_code,BA.numberCast(double.class, 99))) { 
if (true) return BA.ObjectToString("⛈️");};
 BA.debugLineNum = 781;BA.debugLine="Return \"🌤️\"";
Debug.ShouldStop(4096);
if (true) return BA.ObjectToString("🌤️");
 BA.debugLineNum = 782;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _globals() throws Exception{
try {
		Debug.PushSubsStack("Globals (main) ","main",0,main.ba,main.mostCurrent,84);
if (RapidSub.canDelegate("globals")) { return b4j.example.main.remoteMe.runUserSub(false, "main","globals");}
 BA.debugLineNum = 84;BA.debugLine="Sub Globals";
Debug.ShouldStop(524288);
 BA.debugLineNum = 85;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _loadbackgroundimage() throws Exception{
try {
		Debug.PushSubsStack("LoadBackgroundImage (main) ","main",0,main.ba,main.mostCurrent,1126);
if (RapidSub.canDelegate("loadbackgroundimage")) { b4j.example.main.remoteMe.runUserSub(false, "main","loadbackgroundimage"); return;}
ResumableSub_LoadBackgroundImage rsub = new ResumableSub_LoadBackgroundImage(null);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_LoadBackgroundImage extends BA.ResumableSub {
public ResumableSub_LoadBackgroundImage(b4j.example.main parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
b4j.example.main parent;
RemoteObject _url = RemoteObject.createImmutable("");
RemoteObject _j = RemoteObject.declareNull("b4j.example.httpjob");
RemoteObject _tempfile = RemoteObject.createImmutable("");
RemoteObject _out = RemoteObject.declareNull("anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper");
RemoteObject _bmp = RemoteObject.declareNull("anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("LoadBackgroundImage (main) ","main",0,main.ba,main.mostCurrent,1126);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
try {

        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 BA.debugLineNum = 1127;BA.debugLine="Try";
Debug.ShouldStop(64);
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
 BA.debugLineNum = 1128;BA.debugLine="If Not(showImage) Then Return";
Debug.ShouldStop(128);
if (true) break;

case 4:
//if
this.state = 9;
if (parent.__c.runMethod(true,"Not",(Object)(parent._showimage)).<Boolean>get().booleanValue()) { 
this.state = 6;
;}if (true) break;

case 6:
//C
this.state = 9;
Debug.CheckDeviceExceptions();if (true) return ;
if (true) break;

case 9:
//C
this.state = 10;
;
 BA.debugLineNum = 1129;BA.debugLine="Dim url As String = \"https://picsum.photos/1280/";
Debug.ShouldStop(256);
_url = RemoteObject.concat(RemoteObject.createImmutable("https://picsum.photos/1280/800?random="),parent.__c.runMethod(true,"Rnd",(Object)(BA.numberCast(int.class, 1)),(Object)(BA.numberCast(int.class, 10000))));Debug.locals.put("url", _url);Debug.locals.put("url", _url);
 BA.debugLineNum = 1130;BA.debugLine="job.Initialize(\"bg\", Me)";
Debug.ShouldStop(512);
parent._job.runClassMethod (b4j.example.httpjob.class, "_initialize" /*RemoteObject*/ ,main.ba,(Object)(BA.ObjectToString("bg")),(Object)(main.getObject()));
 BA.debugLineNum = 1131;BA.debugLine="job.Download(url)";
Debug.ShouldStop(1024);
parent._job.runClassMethod (b4j.example.httpjob.class, "_download" /*RemoteObject*/ ,(Object)(_url));
 BA.debugLineNum = 1132;BA.debugLine="Wait For (job) JobDone(j As HttpJob)";
Debug.ShouldStop(2048);
parent.__c.runVoidMethod ("WaitFor","jobdone", main.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "main", "loadbackgroundimage"), (parent._job));
this.state = 23;
return;
case 23:
//C
this.state = 10;
_j = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(0));Debug.locals.put("j", _j);
;
 BA.debugLineNum = 1133;BA.debugLine="If j.Success Then";
Debug.ShouldStop(4096);
if (true) break;

case 10:
//if
this.state = 13;
if (_j.getField(true,"_success" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
this.state = 12;
}if (true) break;

case 12:
//C
this.state = 13;
 BA.debugLineNum = 1134;BA.debugLine="Dim tempFile As String = \"temp_bg.jpg\"";
Debug.ShouldStop(8192);
_tempfile = BA.ObjectToString("temp_bg.jpg");Debug.locals.put("tempFile", _tempfile);Debug.locals.put("tempFile", _tempfile);
 BA.debugLineNum = 1135;BA.debugLine="Dim out As OutputStream = File.OpenOutput(File.";
Debug.ShouldStop(16384);
_out = RemoteObject.createNew ("anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper");
_out = parent.__c.getField(false,"File").runMethod(false,"OpenOutput",(Object)(parent.__c.getField(false,"File").runMethod(true,"getDirTemp")),(Object)(_tempfile),(Object)(parent.__c.getField(true,"False")));Debug.locals.put("out", _out);Debug.locals.put("out", _out);
 BA.debugLineNum = 1136;BA.debugLine="File.Copy2(j.GetInputStream, out)";
Debug.ShouldStop(32768);
parent.__c.getField(false,"File").runVoidMethod ("Copy2",(Object)((_j.runClassMethod (b4j.example.httpjob.class, "_getinputstream" /*RemoteObject*/ ).getObject())),(Object)((_out.getObject())));
 BA.debugLineNum = 1137;BA.debugLine="out.Close";
Debug.ShouldStop(65536);
_out.runVoidMethod ("Close");
 BA.debugLineNum = 1138;BA.debugLine="Dim bmp As Image = fx.LoadImage(File.DirTemp, t";
Debug.ShouldStop(131072);
_bmp = RemoteObject.createNew ("anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper");
_bmp = parent._fx.runMethod(false,"LoadImage",(Object)(parent.__c.getField(false,"File").runMethod(true,"getDirTemp")),(Object)(_tempfile));Debug.locals.put("bmp", _bmp);Debug.locals.put("bmp", _bmp);
 BA.debugLineNum = 1139;BA.debugLine="imgView.SetImage(bmp)";
Debug.ShouldStop(262144);
parent._imgview.runVoidMethod ("SetImage",(Object)((_bmp.getObject())));
 BA.debugLineNum = 1140;BA.debugLine="imgView.prefWidth = MainForm.Width";
Debug.ShouldStop(524288);
parent._imgview.runMethod(true,"setPrefWidth",parent._mainform.runMethod(true,"getWidth"));
 BA.debugLineNum = 1141;BA.debugLine="imgView.prefHeight = MainForm.Height";
Debug.ShouldStop(1048576);
parent._imgview.runMethod(true,"setPrefHeight",parent._mainform.runMethod(true,"getHeight"));
 BA.debugLineNum = 1142;BA.debugLine="File.Delete(File.DirTemp, tempFile)";
Debug.ShouldStop(2097152);
parent.__c.getField(false,"File").runVoidMethod ("Delete",(Object)(parent.__c.getField(false,"File").runMethod(true,"getDirTemp")),(Object)(_tempfile));
 if (true) break;

case 13:
//C
this.state = 22;
;
 BA.debugLineNum = 1144;BA.debugLine="job.Release";
Debug.ShouldStop(8388608);
parent._job.runClassMethod (b4j.example.httpjob.class, "_release" /*RemoteObject*/ );
 Debug.CheckDeviceExceptions();
if (true) break;

case 15:
//C
this.state = 16;
this.catchState = 0;
 BA.debugLineNum = 1146;BA.debugLine="Log(\"Image error: \" & LastException.Message)";
Debug.ShouldStop(33554432);
parent.__c.runVoidMethod ("LogImpl","21114132",RemoteObject.concat(RemoteObject.createImmutable("Image error: "),parent.__c.runMethod(false,"LastException",main.ba).runMethod(true,"getMessage")),0);
 BA.debugLineNum = 1147;BA.debugLine="If job <> Null Then job.Release";
Debug.ShouldStop(67108864);
if (true) break;

case 16:
//if
this.state = 21;
if (RemoteObject.solveBoolean("N",parent._job)) { 
this.state = 18;
;}if (true) break;

case 18:
//C
this.state = 21;
parent._job.runClassMethod (b4j.example.httpjob.class, "_release" /*RemoteObject*/ );
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
 BA.debugLineNum = 1149;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
if (true) break;
}} 
       catch (Exception e0) {
			
if (catchState == 0)
    throw e0;
else {
    state = catchState;
BA.rdebugUtils.runVoidMethod("setLastException",main.ba, e0.toString());}
            }
        }
    }
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}
public static RemoteObject  _loadsettings() throws Exception{
try {
		Debug.PushSubsStack("LoadSettings (main) ","main",0,main.ba,main.mostCurrent,1234);
if (RapidSub.canDelegate("loadsettings")) { return b4j.example.main.remoteMe.runUserSub(false, "main","loadsettings");}
RemoteObject _settings = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
 BA.debugLineNum = 1234;BA.debugLine="Sub LoadSettings";
Debug.ShouldStop(131072);
 BA.debugLineNum = 1235;BA.debugLine="Try";
Debug.ShouldStop(262144);
try { BA.debugLineNum = 1236;BA.debugLine="If File.Exists(File.DirApp, settingsFile) Then";
Debug.ShouldStop(524288);
if (main.__c.getField(false,"File").runMethod(true,"Exists",(Object)(main.__c.getField(false,"File").runMethod(true,"getDirApp")),(Object)(main._settingsfile)).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 1237;BA.debugLine="Dim settings As List = File.ReadList(File.DirAp";
Debug.ShouldStop(1048576);
_settings = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_settings = main.__c.getField(false,"File").runMethod(false,"ReadList",(Object)(main.__c.getField(false,"File").runMethod(true,"getDirApp")),(Object)(main._settingsfile));Debug.locals.put("settings", _settings);Debug.locals.put("settings", _settings);
 BA.debugLineNum = 1238;BA.debugLine="If settings.Size >= 3 Then";
Debug.ShouldStop(2097152);
if (RemoteObject.solveBoolean("g",_settings.runMethod(true,"getSize"),BA.numberCast(double.class, 3))) { 
 BA.debugLineNum = 1239;BA.debugLine="cityName = settings.Get(0)";
Debug.ShouldStop(4194304);
main._cityname = BA.ObjectToString(_settings.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 0))));
 BA.debugLineNum = 1240;BA.debugLine="latitude = settings.Get(1)";
Debug.ShouldStop(8388608);
main._latitude = BA.numberCast(double.class, _settings.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 1))));
 BA.debugLineNum = 1241;BA.debugLine="longitude = settings.Get(2)";
Debug.ShouldStop(16777216);
main._longitude = BA.numberCast(double.class, _settings.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 2))));
 BA.debugLineNum = 1242;BA.debugLine="Log(\"Settings loaded: \" & cityName & \" (\" & la";
Debug.ShouldStop(33554432);
main.__c.runVoidMethod ("LogImpl","27929864",RemoteObject.concat(RemoteObject.createImmutable("Settings loaded: "),main._cityname,RemoteObject.createImmutable(" ("),main._latitude,RemoteObject.createImmutable(", "),main._longitude,RemoteObject.createImmutable(")")),0);
 }else {
 BA.debugLineNum = 1244;BA.debugLine="Log(\"Invalid settings file, using defaults\")";
Debug.ShouldStop(134217728);
main.__c.runVoidMethod ("LogImpl","27929866",RemoteObject.createImmutable("Invalid settings file, using defaults"),0);
 };
 }else {
 BA.debugLineNum = 1247;BA.debugLine="Log(\"No settings file found, using default loca";
Debug.ShouldStop(1073741824);
main.__c.runVoidMethod ("LogImpl","27929869",RemoteObject.concat(RemoteObject.createImmutable("No settings file found, using default location: "),main._cityname),0);
 };
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e16) {
			BA.rdebugUtils.runVoidMethod("setLastException",main.ba, e16.toString()); BA.debugLineNum = 1250;BA.debugLine="Log(\"LoadSettings error: \" & LastException.Messa";
Debug.ShouldStop(2);
main.__c.runVoidMethod ("LogImpl","27929872",RemoteObject.concat(RemoteObject.createImmutable("LoadSettings error: "),main.__c.runMethod(false,"LastException",main.ba).runMethod(true,"getMessage")),0);
 };
 BA.debugLineNum = 1253;BA.debugLine="End Sub";
Debug.ShouldStop(16);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _mainform_close() throws Exception{
try {
		Debug.PushSubsStack("MainForm_Close (main) ","main",0,main.ba,main.mostCurrent,1190);
if (RapidSub.canDelegate("mainform_close")) { return b4j.example.main.remoteMe.runUserSub(false, "main","mainform_close");}
 BA.debugLineNum = 1190;BA.debugLine="Sub MainForm_Close";
Debug.ShouldStop(32);
 BA.debugLineNum = 1191;BA.debugLine="timUpdate.Enabled = False";
Debug.ShouldStop(64);
main._timupdate.runMethod(true,"setEnabled",main.__c.getField(true,"False"));
 BA.debugLineNum = 1192;BA.debugLine="timImageChange.Enabled = False";
Debug.ShouldStop(128);
main._timimagechange.runMethod(true,"setEnabled",main.__c.getField(true,"False"));
 BA.debugLineNum = 1193;BA.debugLine="If job <> Null Then job.Release";
Debug.ShouldStop(256);
if (RemoteObject.solveBoolean("N",main._job)) { 
main._job.runClassMethod (b4j.example.httpjob.class, "_release" /*RemoteObject*/ );};
 BA.debugLineNum = 1194;BA.debugLine="End Sub";
Debug.ShouldStop(512);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _mainform_keypressed(RemoteObject _keycode,RemoteObject _modifiers) throws Exception{
try {
		Debug.PushSubsStack("MainForm_KeyPressed (main) ","main",0,main.ba,main.mostCurrent,1180);
if (RapidSub.canDelegate("mainform_keypressed")) { return b4j.example.main.remoteMe.runUserSub(false, "main","mainform_keypressed", _keycode, _modifiers);}
RemoteObject _isfull = RemoteObject.declareNull("Object");
Debug.locals.put("KeyCode", _keycode);
Debug.locals.put("Modifiers", _modifiers);
 BA.debugLineNum = 1180;BA.debugLine="Sub MainForm_KeyPressed (KeyCode As Int, Modifiers";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 1181;BA.debugLine="If KeyCode = 27 Then";
Debug.ShouldStop(268435456);
if (RemoteObject.solveBoolean("=",_keycode,BA.numberCast(double.class, 27))) { 
 BA.debugLineNum = 1182;BA.debugLine="MainForm.Close";
Debug.ShouldStop(536870912);
main._mainform.runVoidMethod ("Close");
 }else 
{ BA.debugLineNum = 1183;BA.debugLine="Else If KeyCode = 122 Then";
Debug.ShouldStop(1073741824);
if (RemoteObject.solveBoolean("=",_keycode,BA.numberCast(double.class, 122))) { 
 BA.debugLineNum = 1184;BA.debugLine="Dim isFull As Object = jStage.RunMethod(\"isFullS";
Debug.ShouldStop(-2147483648);
_isfull = main._jstage.runMethod(false,"RunMethod",(Object)(BA.ObjectToString("isFullScreen")),(Object)((main.__c.getField(false,"Null"))));Debug.locals.put("isFull", _isfull);Debug.locals.put("isFull", _isfull);
 BA.debugLineNum = 1185;BA.debugLine="jStage.RunMethod(\"setFullScreen\", Array(Not(isFu";
Debug.ShouldStop(1);
main._jstage.runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("setFullScreen")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(main.__c.runMethod(true,"Not",(Object)(BA.ObjectToBoolean(_isfull))))})));
 BA.debugLineNum = 1186;BA.debugLine="CenterAllElements";
Debug.ShouldStop(2);
_centerallelements();
 }}
;
 BA.debugLineNum = 1188;BA.debugLine="End Sub";
Debug.ShouldStop(8);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _mainform_resize(RemoteObject _width,RemoteObject _height) throws Exception{
try {
		Debug.PushSubsStack("MainForm_Resize (main) ","main",0,main.ba,main.mostCurrent,1176);
if (RapidSub.canDelegate("mainform_resize")) { return b4j.example.main.remoteMe.runUserSub(false, "main","mainform_resize", _width, _height);}
Debug.locals.put("Width", _width);
Debug.locals.put("Height", _height);
 BA.debugLineNum = 1176;BA.debugLine="Sub MainForm_Resize (Width As Double, Height As Do";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 1177;BA.debugLine="CenterAllElements";
Debug.ShouldStop(16777216);
_centerallelements();
 BA.debugLineNum = 1178;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}

private static boolean processGlobalsRun;
public static void initializeProcessGlobals() {
    
    if (main.processGlobalsRun == false) {
	    main.processGlobalsRun = true;
		try {
		        main_subs_0._process_globals();
httputils2service_subs_0._process_globals();
main.myClass = BA.getDeviceClass ("b4j.example.main");
httputils2service.myClass = BA.getDeviceClass ("b4j.example.httputils2service");
httpjob.myClass = BA.getDeviceClass ("b4j.example.httpjob");
asclock.myClass = BA.getDeviceClass ("b4j.example.asclock");
		
        } catch (Exception e) {
			throw new RuntimeException(e);
		}
    }
}public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 6;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 7;BA.debugLine="Private fx As JFX";
main._fx = RemoteObject.createNew ("anywheresoftware.b4j.objects.JFX");
 //BA.debugLineNum = 8;BA.debugLine="Private xui As XUI";
main._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");
 //BA.debugLineNum = 9;BA.debugLine="Private MainForm As Form";
main._mainform = RemoteObject.createNew ("anywheresoftware.b4j.objects.Form");
 //BA.debugLineNum = 10;BA.debugLine="Private pnlBackground As Pane";
main._pnlbackground = RemoteObject.createNew ("anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper");
 //BA.debugLineNum = 11;BA.debugLine="Private lblClock As Label";
main._lblclock = RemoteObject.createNew ("anywheresoftware.b4j.objects.LabelWrapper");
 //BA.debugLineNum = 12;BA.debugLine="Private lblDate As Label";
main._lbldate = RemoteObject.createNew ("anywheresoftware.b4j.objects.LabelWrapper");
 //BA.debugLineNum = 13;BA.debugLine="Private lblWeather As Label";
main._lblweather = RemoteObject.createNew ("anywheresoftware.b4j.objects.LabelWrapper");
 //BA.debugLineNum = 14;BA.debugLine="Private lblTemperature As Label";
main._lbltemperature = RemoteObject.createNew ("anywheresoftware.b4j.objects.LabelWrapper");
 //BA.debugLineNum = 15;BA.debugLine="Private lblWeatherIcon As Label";
main._lblweathericon = RemoteObject.createNew ("anywheresoftware.b4j.objects.LabelWrapper");
 //BA.debugLineNum = 16;BA.debugLine="Private lblWeatherDetails As Label";
main._lblweatherdetails = RemoteObject.createNew ("anywheresoftware.b4j.objects.LabelWrapper");
 //BA.debugLineNum = 18;BA.debugLine="Private pnlAnalogClock As Pane";
main._pnlanalogclock = RemoteObject.createNew ("anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper");
 //BA.debugLineNum = 19;BA.debugLine="Private cvsAnalogClock As B4XCanvas";
main._cvsanalogclock = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XCanvas");
 //BA.debugLineNum = 20;BA.debugLine="Private isAnalogMode As Boolean = False";
main._isanalogmode = main.__c.getField(true,"False");
 //BA.debugLineNum = 23;BA.debugLine="Private pnlInfoOverlay As Pane";
main._pnlinfooverlay = RemoteObject.createNew ("anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper");
 //BA.debugLineNum = 24;BA.debugLine="Private showInfoPanel As Boolean = True";
main._showinfopanel = main.__c.getField(true,"True");
 //BA.debugLineNum = 26;BA.debugLine="Private timUpdate As Timer";
main._timupdate = RemoteObject.createNew ("anywheresoftware.b4a.objects.Timer");
 //BA.debugLineNum = 27;BA.debugLine="Private timImageChange As Timer";
main._timimagechange = RemoteObject.createNew ("anywheresoftware.b4a.objects.Timer");
 //BA.debugLineNum = 29;BA.debugLine="Private jo As JavaObject";
main._jo = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
 //BA.debugLineNum = 30;BA.debugLine="Private jStage As JavaObject";
main._jstage = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
 //BA.debugLineNum = 32;BA.debugLine="Private job As HttpJob";
main._job = RemoteObject.createNew ("b4j.example.httpjob");
 //BA.debugLineNum = 33;BA.debugLine="Private imgView As ImageView";
main._imgview = RemoteObject.createNew ("anywheresoftware.b4j.objects.ImageViewWrapper");
 //BA.debugLineNum = 34;BA.debugLine="Private showImage As Boolean = True";
main._showimage = main.__c.getField(true,"True");
 //BA.debugLineNum = 35;BA.debugLine="Private currentImageInterval As Int = 0";
main._currentimageinterval = BA.numberCast(int.class, 0);
 //BA.debugLineNum = 36;BA.debugLine="Private imageIntervals As List = Array As Int(0,";
main._imageintervals = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
main._imageintervals = main.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("int",new int[] {8},new Object[] {BA.numberCast(int.class, 0),BA.numberCast(int.class, 5),BA.numberCast(int.class, 10),BA.numberCast(int.class, 30),BA.numberCast(int.class, 60),BA.numberCast(int.class, 300),BA.numberCast(int.class, 900),BA.numberCast(int.class, 3600)})));
 //BA.debugLineNum = 37;BA.debugLine="Private imageIntervalNames As List = Array As Str";
main._imageintervalnames = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
main._imageintervalnames = main.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("String",new int[] {8},new Object[] {BA.ObjectToString("OFF"),BA.ObjectToString("5s"),BA.ObjectToString("10s"),BA.ObjectToString("30s"),BA.ObjectToString("1m"),BA.ObjectToString("5m"),BA.ObjectToString("15m"),RemoteObject.createImmutable("1h")})));
 //BA.debugLineNum = 38;BA.debugLine="Private lastImageChangeTime As Long = 0";
main._lastimagechangetime = BA.numberCast(long.class, 0);
 //BA.debugLineNum = 40;BA.debugLine="Private pnlSettings As Pane";
main._pnlsettings = RemoteObject.createNew ("anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper");
 //BA.debugLineNum = 41;BA.debugLine="Private btnSettings As Button";
main._btnsettings = RemoteObject.createNew ("anywheresoftware.b4j.objects.ButtonWrapper");
 //BA.debugLineNum = 42;BA.debugLine="Private btnTheme As Button";
main._btntheme = RemoteObject.createNew ("anywheresoftware.b4j.objects.ButtonWrapper");
 //BA.debugLineNum = 43;BA.debugLine="Private btnImageTimer As Button";
main._btnimagetimer = RemoteObject.createNew ("anywheresoftware.b4j.objects.ButtonWrapper");
 //BA.debugLineNum = 44;BA.debugLine="Private btnBackground As Button";
main._btnbackground = RemoteObject.createNew ("anywheresoftware.b4j.objects.ButtonWrapper");
 //BA.debugLineNum = 45;BA.debugLine="Private btnBgColor As Button";
main._btnbgcolor = RemoteObject.createNew ("anywheresoftware.b4j.objects.ButtonWrapper");
 //BA.debugLineNum = 46;BA.debugLine="Private btnClockMode As Button";
main._btnclockmode = RemoteObject.createNew ("anywheresoftware.b4j.objects.ButtonWrapper");
 //BA.debugLineNum = 47;BA.debugLine="Private btnPrayerToggle As Button";
main._btnprayertoggle = RemoteObject.createNew ("anywheresoftware.b4j.objects.ButtonWrapper");
 //BA.debugLineNum = 48;BA.debugLine="Private btnLanguage As Button";
main._btnlanguage = RemoteObject.createNew ("anywheresoftware.b4j.objects.ButtonWrapper");
 //BA.debugLineNum = 49;BA.debugLine="Private btnInfoPanel As Button";
main._btninfopanel = RemoteObject.createNew ("anywheresoftware.b4j.objects.ButtonWrapper");
 //BA.debugLineNum = 50;BA.debugLine="Private settingsVisible As Boolean = False";
main._settingsvisible = main.__c.getField(true,"False");
 //BA.debugLineNum = 52;BA.debugLine="Private colorSchemes As List";
main._colorschemes = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
 //BA.debugLineNum = 53;BA.debugLine="Private currentThemeIndex As Int = 0";
main._currentthemeindex = BA.numberCast(int.class, 0);
 //BA.debugLineNum = 54;BA.debugLine="Private currentBgIndex As Int = 0";
main._currentbgindex = BA.numberCast(int.class, 0);
 //BA.debugLineNum = 55;BA.debugLine="Private currentClockColor As Int";
main._currentclockcolor = RemoteObject.createImmutable(0);
 //BA.debugLineNum = 57;BA.debugLine="Private weatherData As Map";
main._weatherdata = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
 //BA.debugLineNum = 58;BA.debugLine="Private latitude As Double = 34.8333";
main._latitude = BA.numberCast(double.class, 34.8333);
 //BA.debugLineNum = 59;BA.debugLine="Private longitude As Double = 0.1500";
main._longitude = BA.numberCast(double.class, 0.1500);
 //BA.debugLineNum = 60;BA.debugLine="Private cityName As String = \"Saïda, Algeria\"";
main._cityname = BA.ObjectToString("Saïda, Algeria");
 //BA.debugLineNum = 61;BA.debugLine="Private weatherEmoji As String = \"🌤️\"";
main._weatheremoji = BA.ObjectToString("🌤️");
 //BA.debugLineNum = 63;BA.debugLine="Private showPrayerTimes As Boolean = True";
main._showprayertimes = main.__c.getField(true,"True");
 //BA.debugLineNum = 64;BA.debugLine="Private lblPrayerTimes As Label";
main._lblprayertimes = RemoteObject.createNew ("anywheresoftware.b4j.objects.LabelWrapper");
 //BA.debugLineNum = 66;BA.debugLine="Private pnlPrayerCards As Pane";
main._pnlprayercards = RemoteObject.createNew ("anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper");
 //BA.debugLineNum = 67;BA.debugLine="Private prayerLabels As Map";
main._prayerlabels = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
 //BA.debugLineNum = 69;BA.debugLine="Private currentLanguage As String = \"en\"";
main._currentlanguage = BA.ObjectToString("en");
 //BA.debugLineNum = 70;BA.debugLine="Private translations As Map";
main._translations = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
 //BA.debugLineNum = 72;BA.debugLine="Private weatherData As Map";
main._weatherdata = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
 //BA.debugLineNum = 73;BA.debugLine="Private latitude As Double = 34.8333";
main._latitude = BA.numberCast(double.class, 34.8333);
 //BA.debugLineNum = 74;BA.debugLine="Private longitude As Double = 0.1500";
main._longitude = BA.numberCast(double.class, 0.1500);
 //BA.debugLineNum = 75;BA.debugLine="Private cityName As String = \"Saïda, Algeria\"";
main._cityname = BA.ObjectToString("Saïda, Algeria");
 //BA.debugLineNum = 76;BA.debugLine="Private weatherEmoji As String = \"🌤️\"";
main._weatheremoji = BA.ObjectToString("🌤️");
 //BA.debugLineNum = 78;BA.debugLine="Private settingsFile As String = \"clock_settings.";
main._settingsfile = BA.ObjectToString("clock_settings.txt");
 //BA.debugLineNum = 80;BA.debugLine="Private btnChangeCity As Button";
main._btnchangecity = RemoteObject.createNew ("anywheresoftware.b4j.objects.ButtonWrapper");
 //BA.debugLineNum = 81;BA.debugLine="Private citySearchDialog As JavaObject";
main._citysearchdialog = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
 //BA.debugLineNum = 82;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _recreatescaledprayercards(RemoteObject _availablewidth) throws Exception{
try {
		Debug.PushSubsStack("RecreateScaledPrayerCards (main) ","main",0,main.ba,main.mostCurrent,451);
if (RapidSub.canDelegate("recreatescaledprayercards")) { return b4j.example.main.remoteMe.runUserSub(false, "main","recreatescaledprayercards", _availablewidth);}
RemoteObject _prayernames = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _prayericons = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _spacing = RemoteObject.createImmutable(0);
RemoteObject _cardwidth = RemoteObject.createImmutable(0);
int _i = 0;
RemoteObject _pnlcard = RemoteObject.declareNull("anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper");
RemoteObject _lblicon = RemoteObject.declareNull("anywheresoftware.b4j.objects.LabelWrapper");
RemoteObject _lblname = RemoteObject.declareNull("anywheresoftware.b4j.objects.LabelWrapper");
RemoteObject _lbltime = RemoteObject.declareNull("anywheresoftware.b4j.objects.LabelWrapper");
Debug.locals.put("availableWidth", _availablewidth);
 BA.debugLineNum = 451;BA.debugLine="Sub RecreateScaledPrayerCards(availableWidth As Do";
Debug.ShouldStop(4);
 BA.debugLineNum = 452;BA.debugLine="Try";
Debug.ShouldStop(8);
try { BA.debugLineNum = 454;BA.debugLine="pnlPrayerCards.RemoveAllNodes";
Debug.ShouldStop(32);
main._pnlprayercards.runVoidMethod ("RemoveAllNodes");
 BA.debugLineNum = 456;BA.debugLine="Dim prayerNames As List = Array As String(\"fajr\"";
Debug.ShouldStop(128);
_prayernames = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_prayernames = main.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("String",new int[] {6},new Object[] {BA.ObjectToString("fajr"),BA.ObjectToString("sunrise"),BA.ObjectToString("dhuhr"),BA.ObjectToString("asr"),BA.ObjectToString("maghrib"),RemoteObject.createImmutable("isha")})));Debug.locals.put("prayerNames", _prayernames);Debug.locals.put("prayerNames", _prayernames);
 BA.debugLineNum = 457;BA.debugLine="Dim prayerIcons As List = Array As String(\"🌅\",";
Debug.ShouldStop(256);
_prayericons = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_prayericons = main.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("String",new int[] {6},new Object[] {BA.ObjectToString("🌅"),BA.ObjectToString("☀️"),BA.ObjectToString("🌞"),BA.ObjectToString("🌤️"),BA.ObjectToString("🌆"),RemoteObject.createImmutable("🌙")})));Debug.locals.put("prayerIcons", _prayericons);Debug.locals.put("prayerIcons", _prayericons);
 BA.debugLineNum = 460;BA.debugLine="Dim spacing As Int = 10";
Debug.ShouldStop(2048);
_spacing = BA.numberCast(int.class, 10);Debug.locals.put("spacing", _spacing);Debug.locals.put("spacing", _spacing);
 BA.debugLineNum = 461;BA.debugLine="Dim cardWidth As Int = Floor((availableWidth - (";
Debug.ShouldStop(4096);
_cardwidth = BA.numberCast(int.class, main.__c.runMethod(true,"Floor",(Object)(RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {_availablewidth,(RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(5),_spacing}, "*",0, 1))}, "-",1, 0)),RemoteObject.createImmutable(6)}, "/",0, 0))));Debug.locals.put("cardWidth", _cardwidth);Debug.locals.put("cardWidth", _cardwidth);
 BA.debugLineNum = 463;BA.debugLine="For i = 0 To 5";
Debug.ShouldStop(16384);
{
final int step7 = 1;
final int limit7 = 5;
_i = 0 ;
for (;(step7 > 0 && _i <= limit7) || (step7 < 0 && _i >= limit7) ;_i = ((int)(0 + _i + step7))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 464;BA.debugLine="Dim pnlCard As Pane";
Debug.ShouldStop(32768);
_pnlcard = RemoteObject.createNew ("anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper");Debug.locals.put("pnlCard", _pnlcard);
 BA.debugLineNum = 465;BA.debugLine="pnlCard.Initialize(\"\")";
Debug.ShouldStop(65536);
_pnlcard.runVoidMethod ("Initialize",main.ba,(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 466;BA.debugLine="pnlCard.Style = \"-fx-background-color: rgba(40,";
Debug.ShouldStop(131072);
_pnlcard.runMethod(true,"setStyle",BA.ObjectToString("-fx-background-color: rgba(40, 40, 60, 0.8); -fx-background-radius: 10px; -fx-border-color: rgba(0, 200, 255, 0.4); -fx-border-width: 1px; -fx-border-radius: 10px;"));
 BA.debugLineNum = 467;BA.debugLine="pnlPrayerCards.AddNode(pnlCard, i * (cardWidth";
Debug.ShouldStop(262144);
main._pnlprayercards.runVoidMethod ("AddNode",(Object)((_pnlcard.getObject())),(Object)(BA.numberCast(double.class, RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(_i),(RemoteObject.solve(new RemoteObject[] {_cardwidth,_spacing}, "+",1, 1))}, "*",0, 1))),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, _cardwidth)),(Object)(BA.numberCast(double.class, 70)));
 BA.debugLineNum = 470;BA.debugLine="Dim lblIcon As Label";
Debug.ShouldStop(2097152);
_lblicon = RemoteObject.createNew ("anywheresoftware.b4j.objects.LabelWrapper");Debug.locals.put("lblIcon", _lblicon);
 BA.debugLineNum = 471;BA.debugLine="lblIcon.Initialize(\"\")";
Debug.ShouldStop(4194304);
_lblicon.runVoidMethod ("Initialize",main.ba,(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 472;BA.debugLine="lblIcon.Text = prayerIcons.Get(i)";
Debug.ShouldStop(8388608);
_lblicon.runMethod(true,"setText",BA.ObjectToString(_prayericons.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i)))));
 BA.debugLineNum = 473;BA.debugLine="lblIcon.TextSize = 20";
Debug.ShouldStop(16777216);
_lblicon.runMethod(true,"setTextSize",BA.numberCast(double.class, 20));
 BA.debugLineNum = 474;BA.debugLine="lblIcon.Alignment = \"CENTER\"";
Debug.ShouldStop(33554432);
_lblicon.runMethod(true,"setAlignment",BA.ObjectToString("CENTER"));
 BA.debugLineNum = 475;BA.debugLine="pnlCard.AddNode(lblIcon, 5, 5, cardWidth - 10,";
Debug.ShouldStop(67108864);
_pnlcard.runVoidMethod ("AddNode",(Object)((_lblicon.getObject())),(Object)(BA.numberCast(double.class, 5)),(Object)(BA.numberCast(double.class, 5)),(Object)(BA.numberCast(double.class, RemoteObject.solve(new RemoteObject[] {_cardwidth,RemoteObject.createImmutable(10)}, "-",1, 1))),(Object)(BA.numberCast(double.class, 25)));
 BA.debugLineNum = 478;BA.debugLine="Dim lblName As Label";
Debug.ShouldStop(536870912);
_lblname = RemoteObject.createNew ("anywheresoftware.b4j.objects.LabelWrapper");Debug.locals.put("lblName", _lblname);
 BA.debugLineNum = 479;BA.debugLine="lblName.Initialize(\"\")";
Debug.ShouldStop(1073741824);
_lblname.runVoidMethod ("Initialize",main.ba,(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 480;BA.debugLine="lblName.Text = GetTranslation(prayerNames.Get(i";
Debug.ShouldStop(-2147483648);
_lblname.runMethod(true,"setText",_gettranslation(BA.ObjectToString(_prayernames.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))))));
 BA.debugLineNum = 481;BA.debugLine="lblName.TextColor = fx.Colors.RGB(200, 200, 200";
Debug.ShouldStop(1);
_lblname.runMethod(false,"setTextColor",(main._fx.getField(false,"Colors").runMethod(false,"RGB",(Object)(BA.numberCast(int.class, 200)),(Object)(BA.numberCast(int.class, 200)),(Object)(BA.numberCast(int.class, 200)))));
 BA.debugLineNum = 482;BA.debugLine="lblName.TextSize = 10";
Debug.ShouldStop(2);
_lblname.runMethod(true,"setTextSize",BA.numberCast(double.class, 10));
 BA.debugLineNum = 483;BA.debugLine="lblName.Style = \"-fx-font-weight: normal;\"";
Debug.ShouldStop(4);
_lblname.runMethod(true,"setStyle",BA.ObjectToString("-fx-font-weight: normal;"));
 BA.debugLineNum = 484;BA.debugLine="lblName.Alignment = \"CENTER\"";
Debug.ShouldStop(8);
_lblname.runMethod(true,"setAlignment",BA.ObjectToString("CENTER"));
 BA.debugLineNum = 485;BA.debugLine="pnlCard.AddNode(lblName, 5, 30, cardWidth - 10,";
Debug.ShouldStop(16);
_pnlcard.runVoidMethod ("AddNode",(Object)((_lblname.getObject())),(Object)(BA.numberCast(double.class, 5)),(Object)(BA.numberCast(double.class, 30)),(Object)(BA.numberCast(double.class, RemoteObject.solve(new RemoteObject[] {_cardwidth,RemoteObject.createImmutable(10)}, "-",1, 1))),(Object)(BA.numberCast(double.class, 15)));
 BA.debugLineNum = 488;BA.debugLine="Dim lblTime As Label";
Debug.ShouldStop(128);
_lbltime = RemoteObject.createNew ("anywheresoftware.b4j.objects.LabelWrapper");Debug.locals.put("lblTime", _lbltime);
 BA.debugLineNum = 489;BA.debugLine="lblTime.Initialize(\"\")";
Debug.ShouldStop(256);
_lbltime.runVoidMethod ("Initialize",main.ba,(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 490;BA.debugLine="lblTime.Text = \"--:--\"";
Debug.ShouldStop(512);
_lbltime.runMethod(true,"setText",BA.ObjectToString("--:--"));
 BA.debugLineNum = 491;BA.debugLine="lblTime.TextColor = fx.Colors.RGB(150, 255, 150";
Debug.ShouldStop(1024);
_lbltime.runMethod(false,"setTextColor",(main._fx.getField(false,"Colors").runMethod(false,"RGB",(Object)(BA.numberCast(int.class, 150)),(Object)(BA.numberCast(int.class, 255)),(Object)(BA.numberCast(int.class, 150)))));
 BA.debugLineNum = 492;BA.debugLine="lblTime.TextSize = 14";
Debug.ShouldStop(2048);
_lbltime.runMethod(true,"setTextSize",BA.numberCast(double.class, 14));
 BA.debugLineNum = 493;BA.debugLine="lblTime.Style = \"-fx-font-weight: bold;\"";
Debug.ShouldStop(4096);
_lbltime.runMethod(true,"setStyle",BA.ObjectToString("-fx-font-weight: bold;"));
 BA.debugLineNum = 494;BA.debugLine="lblTime.Alignment = \"CENTER\"";
Debug.ShouldStop(8192);
_lbltime.runMethod(true,"setAlignment",BA.ObjectToString("CENTER"));
 BA.debugLineNum = 495;BA.debugLine="pnlCard.AddNode(lblTime, 5, 45, cardWidth - 10,";
Debug.ShouldStop(16384);
_pnlcard.runVoidMethod ("AddNode",(Object)((_lbltime.getObject())),(Object)(BA.numberCast(double.class, 5)),(Object)(BA.numberCast(double.class, 45)),(Object)(BA.numberCast(double.class, RemoteObject.solve(new RemoteObject[] {_cardwidth,RemoteObject.createImmutable(10)}, "-",1, 1))),(Object)(BA.numberCast(double.class, 20)));
 BA.debugLineNum = 498;BA.debugLine="prayerLabels.Put(prayerNames.Get(i), lblTime)";
Debug.ShouldStop(131072);
main._prayerlabels.runVoidMethod ("Put",(Object)(_prayernames.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i)))),(Object)((_lbltime.getObject())));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 501;BA.debugLine="Log(\"Prayer cards rescaled for width: \" & availa";
Debug.ShouldStop(1048576);
main.__c.runVoidMethod ("LogImpl","27798834",RemoteObject.concat(RemoteObject.createImmutable("Prayer cards rescaled for width: "),_availablewidth),0);
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e38) {
			BA.rdebugUtils.runVoidMethod("setLastException",main.ba, e38.toString()); BA.debugLineNum = 503;BA.debugLine="Log(\"RecreateScaledPrayerCards error: \" & LastEx";
Debug.ShouldStop(4194304);
main.__c.runVoidMethod ("LogImpl","27798836",RemoteObject.concat(RemoteObject.createImmutable("RecreateScaledPrayerCards error: "),main.__c.runMethod(false,"LastException",main.ba).runMethod(true,"getMessage")),0);
 };
 BA.debugLineNum = 505;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _savesettings() throws Exception{
try {
		Debug.PushSubsStack("SaveSettings (main) ","main",0,main.ba,main.mostCurrent,1255);
if (RapidSub.canDelegate("savesettings")) { return b4j.example.main.remoteMe.runUserSub(false, "main","savesettings");}
RemoteObject _settings = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
 BA.debugLineNum = 1255;BA.debugLine="Sub SaveSettings";
Debug.ShouldStop(64);
 BA.debugLineNum = 1256;BA.debugLine="Try";
Debug.ShouldStop(128);
try { BA.debugLineNum = 1257;BA.debugLine="Dim settings As List";
Debug.ShouldStop(256);
_settings = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("settings", _settings);
 BA.debugLineNum = 1258;BA.debugLine="settings.Initialize";
Debug.ShouldStop(512);
_settings.runVoidMethod ("Initialize");
 BA.debugLineNum = 1259;BA.debugLine="settings.Add(cityName)";
Debug.ShouldStop(1024);
_settings.runVoidMethod ("Add",(Object)((main._cityname)));
 BA.debugLineNum = 1260;BA.debugLine="settings.Add(latitude)";
Debug.ShouldStop(2048);
_settings.runVoidMethod ("Add",(Object)((main._latitude)));
 BA.debugLineNum = 1261;BA.debugLine="settings.Add(longitude)";
Debug.ShouldStop(4096);
_settings.runVoidMethod ("Add",(Object)((main._longitude)));
 BA.debugLineNum = 1262;BA.debugLine="File.WriteList(File.DirApp, settingsFile, settin";
Debug.ShouldStop(8192);
main.__c.getField(false,"File").runVoidMethod ("WriteList",(Object)(main.__c.getField(false,"File").runMethod(true,"getDirApp")),(Object)(main._settingsfile),(Object)(_settings));
 BA.debugLineNum = 1263;BA.debugLine="Log(\"Settings saved: \" & cityName & \" (\" & latit";
Debug.ShouldStop(16384);
main.__c.runVoidMethod ("LogImpl","27995400",RemoteObject.concat(RemoteObject.createImmutable("Settings saved: "),main._cityname,RemoteObject.createImmutable(" ("),main._latitude,RemoteObject.createImmutable(", "),main._longitude,RemoteObject.createImmutable(")")),0);
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e10) {
			BA.rdebugUtils.runVoidMethod("setLastException",main.ba, e10.toString()); BA.debugLineNum = 1265;BA.debugLine="Log(\"SaveSettings error: \" & LastException.Messa";
Debug.ShouldStop(65536);
main.__c.runVoidMethod ("LogImpl","27995402",RemoteObject.concat(RemoteObject.createImmutable("SaveSettings error: "),main.__c.runMethod(false,"LastException",main.ba).runMethod(true,"getMessage")),0);
 };
 BA.debugLineNum = 1267;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _searchcity(RemoteObject _cityquery) throws Exception{
try {
		Debug.PushSubsStack("SearchCity (main) ","main",0,main.ba,main.mostCurrent,1299);
if (RapidSub.canDelegate("searchcity")) { b4j.example.main.remoteMe.runUserSub(false, "main","searchcity", _cityquery); return;}
ResumableSub_SearchCity rsub = new ResumableSub_SearchCity(null,_cityquery);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_SearchCity extends BA.ResumableSub {
public ResumableSub_SearchCity(b4j.example.main parent,RemoteObject _cityquery) {
this.parent = parent;
this._cityquery = _cityquery;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
b4j.example.main parent;
RemoteObject _cityquery;
RemoteObject _url = RemoteObject.createImmutable("");
RemoteObject _j = RemoteObject.declareNull("b4j.example.httpjob");
RemoteObject _jp = RemoteObject.declareNull("anywheresoftware.b4j.objects.collections.JSONParser");
RemoteObject _response = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _results = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("SearchCity (main) ","main",0,main.ba,main.mostCurrent,1299);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
try {

        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("cityQuery", _cityquery);
 BA.debugLineNum = 1300;BA.debugLine="Try";
Debug.ShouldStop(524288);
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
 BA.debugLineNum = 1301;BA.debugLine="Log(\"Searching for city: \" & cityQuery)";
Debug.ShouldStop(1048576);
parent.__c.runVoidMethod ("LogImpl","28126466",RemoteObject.concat(RemoteObject.createImmutable("Searching for city: "),_cityquery),0);
 BA.debugLineNum = 1304;BA.debugLine="Dim url As String = \"https://geocoding-api.open-";
Debug.ShouldStop(8388608);
_url = RemoteObject.concat(RemoteObject.createImmutable("https://geocoding-api.open-meteo.com/v1/search?name="),_cityquery.runMethod(true,"replace",(Object)(BA.ObjectToString(" ")),(Object)(RemoteObject.createImmutable("%20"))),RemoteObject.createImmutable("&count=10&language=en&format=json"));Debug.locals.put("url", _url);Debug.locals.put("url", _url);
 BA.debugLineNum = 1307;BA.debugLine="job.Initialize(\"geocode\", Me)";
Debug.ShouldStop(67108864);
parent._job.runClassMethod (b4j.example.httpjob.class, "_initialize" /*RemoteObject*/ ,main.ba,(Object)(BA.ObjectToString("geocode")),(Object)(main.getObject()));
 BA.debugLineNum = 1308;BA.debugLine="job.Download(url)";
Debug.ShouldStop(134217728);
parent._job.runClassMethod (b4j.example.httpjob.class, "_download" /*RemoteObject*/ ,(Object)(_url));
 BA.debugLineNum = 1309;BA.debugLine="Wait For (job) JobDone(j As HttpJob)";
Debug.ShouldStop(268435456);
parent.__c.runVoidMethod ("WaitFor","jobdone", main.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "main", "searchcity"), (parent._job));
this.state = 37;
return;
case 37:
//C
this.state = 4;
_j = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(0));Debug.locals.put("j", _j);
;
 BA.debugLineNum = 1311;BA.debugLine="If j.Success Then";
Debug.ShouldStop(1073741824);
if (true) break;

case 4:
//if
this.state = 27;
if (_j.getField(true,"_success" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
this.state = 6;
}else {
this.state = 26;
}if (true) break;

case 6:
//C
this.state = 7;
 BA.debugLineNum = 1312;BA.debugLine="Dim jp As JSONParser";
Debug.ShouldStop(-2147483648);
_jp = RemoteObject.createNew ("anywheresoftware.b4j.objects.collections.JSONParser");Debug.locals.put("jp", _jp);
 BA.debugLineNum = 1313;BA.debugLine="jp.Initialize(j.GetString)";
Debug.ShouldStop(1);
_jp.runVoidMethod ("Initialize",(Object)(_j.runClassMethod (b4j.example.httpjob.class, "_getstring" /*RemoteObject*/ )));
 BA.debugLineNum = 1314;BA.debugLine="Dim response As Map = jp.NextObject";
Debug.ShouldStop(2);
_response = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_response = _jp.runMethod(false,"NextObject");Debug.locals.put("response", _response);Debug.locals.put("response", _response);
 BA.debugLineNum = 1316;BA.debugLine="If response.ContainsKey(\"results\") Then";
Debug.ShouldStop(8);
if (true) break;

case 7:
//if
this.state = 24;
if (_response.runMethod(true,"ContainsKey",(Object)((RemoteObject.createImmutable("results")))).<Boolean>get().booleanValue()) { 
this.state = 9;
}else {
this.state = 23;
}if (true) break;

case 9:
//C
this.state = 10;
 BA.debugLineNum = 1317;BA.debugLine="Dim results As List = response.Get(\"results\")";
Debug.ShouldStop(16);
_results = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_results = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _response.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("results")))));Debug.locals.put("results", _results);Debug.locals.put("results", _results);
 BA.debugLineNum = 1319;BA.debugLine="If results.Size > 0 Then";
Debug.ShouldStop(64);
if (true) break;

case 10:
//if
this.state = 21;
if (RemoteObject.solveBoolean(">",_results.runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
this.state = 12;
}else {
this.state = 20;
}if (true) break;

case 12:
//C
this.state = 13;
 BA.debugLineNum = 1321;BA.debugLine="If results.Size > 1 Then";
Debug.ShouldStop(256);
if (true) break;

case 13:
//if
this.state = 18;
if (RemoteObject.solveBoolean(">",_results.runMethod(true,"getSize"),BA.numberCast(double.class, 1))) { 
this.state = 15;
}else {
this.state = 17;
}if (true) break;

case 15:
//C
this.state = 18;
 BA.debugLineNum = 1322;BA.debugLine="ShowCitySelectionDialog(results)";
Debug.ShouldStop(512);
_showcityselectiondialog(_results);
 if (true) break;

case 17:
//C
this.state = 18;
 BA.debugLineNum = 1325;BA.debugLine="SelectCity(results.Get(0))";
Debug.ShouldStop(4096);
_selectcity(RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _results.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 0)))));
 if (true) break;

case 18:
//C
this.state = 21;
;
 if (true) break;

case 20:
//C
this.state = 21;
 BA.debugLineNum = 1328;BA.debugLine="ShowAlert(\"City Not Found\", \"No results found";
Debug.ShouldStop(32768);
_showalert(BA.ObjectToString("City Not Found"),RemoteObject.concat(RemoteObject.createImmutable("No results found for: "),_cityquery));
 if (true) break;

case 21:
//C
this.state = 24;
;
 if (true) break;

case 23:
//C
this.state = 24;
 BA.debugLineNum = 1331;BA.debugLine="ShowAlert(\"Search Error\", \"No results found. P";
Debug.ShouldStop(262144);
_showalert(BA.ObjectToString("Search Error"),RemoteObject.createImmutable("No results found. Please try a different city name."));
 if (true) break;

case 24:
//C
this.state = 27;
;
 if (true) break;

case 26:
//C
this.state = 27;
 BA.debugLineNum = 1334;BA.debugLine="ShowAlert(\"Network Error\", \"Failed to search fo";
Debug.ShouldStop(2097152);
_showalert(BA.ObjectToString("Network Error"),RemoteObject.createImmutable("Failed to search for city. Please check your internet connection."));
 if (true) break;

case 27:
//C
this.state = 36;
;
 BA.debugLineNum = 1337;BA.debugLine="job.Release";
Debug.ShouldStop(16777216);
parent._job.runClassMethod (b4j.example.httpjob.class, "_release" /*RemoteObject*/ );
 Debug.CheckDeviceExceptions();
if (true) break;

case 29:
//C
this.state = 30;
this.catchState = 0;
 BA.debugLineNum = 1339;BA.debugLine="Log(\"SearchCity error: \" & LastException.Message";
Debug.ShouldStop(67108864);
parent.__c.runVoidMethod ("LogImpl","28126504",RemoteObject.concat(RemoteObject.createImmutable("SearchCity error: "),parent.__c.runMethod(false,"LastException",main.ba).runMethod(true,"getMessage")),0);
 BA.debugLineNum = 1340;BA.debugLine="If job <> Null Then job.Release";
Debug.ShouldStop(134217728);
if (true) break;

case 30:
//if
this.state = 35;
if (RemoteObject.solveBoolean("N",parent._job)) { 
this.state = 32;
;}if (true) break;

case 32:
//C
this.state = 35;
parent._job.runClassMethod (b4j.example.httpjob.class, "_release" /*RemoteObject*/ );
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
 BA.debugLineNum = 1342;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
if (true) break;
}} 
       catch (Exception e0) {
			
if (catchState == 0)
    throw e0;
else {
    state = catchState;
BA.rdebugUtils.runVoidMethod("setLastException",main.ba, e0.toString());}
            }
        }
    }
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}
public static RemoteObject  _selectcity(RemoteObject _citydata) throws Exception{
try {
		Debug.PushSubsStack("SelectCity (main) ","main",0,main.ba,main.mostCurrent,1385);
if (RapidSub.canDelegate("selectcity")) { return b4j.example.main.remoteMe.runUserSub(false, "main","selectcity", _citydata);}
RemoteObject _name = RemoteObject.createImmutable("");
RemoteObject _country = RemoteObject.createImmutable("");
RemoteObject _admin1 = RemoteObject.createImmutable("");
Debug.locals.put("cityData", _citydata);
 BA.debugLineNum = 1385;BA.debugLine="Sub SelectCity(cityData As Map)";
Debug.ShouldStop(256);
 BA.debugLineNum = 1386;BA.debugLine="Try";
Debug.ShouldStop(512);
try { BA.debugLineNum = 1388;BA.debugLine="Dim name As String = cityData.Get(\"name\")";
Debug.ShouldStop(2048);
_name = BA.ObjectToString(_citydata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("name")))));Debug.locals.put("name", _name);Debug.locals.put("name", _name);
 BA.debugLineNum = 1389;BA.debugLine="Dim country As String = cityData.GetDefault(\"cou";
Debug.ShouldStop(4096);
_country = BA.ObjectToString(_citydata.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("country"))),(Object)((RemoteObject.createImmutable("")))));Debug.locals.put("country", _country);Debug.locals.put("country", _country);
 BA.debugLineNum = 1390;BA.debugLine="Dim admin1 As String = cityData.GetDefault(\"admi";
Debug.ShouldStop(8192);
_admin1 = BA.ObjectToString(_citydata.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("admin1"))),(Object)((RemoteObject.createImmutable("")))));Debug.locals.put("admin1", _admin1);Debug.locals.put("admin1", _admin1);
 BA.debugLineNum = 1392;BA.debugLine="latitude = cityData.Get(\"latitude\")";
Debug.ShouldStop(32768);
main._latitude = BA.numberCast(double.class, _citydata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("latitude")))));
 BA.debugLineNum = 1393;BA.debugLine="longitude = cityData.Get(\"longitude\")";
Debug.ShouldStop(65536);
main._longitude = BA.numberCast(double.class, _citydata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("longitude")))));
 BA.debugLineNum = 1396;BA.debugLine="cityName = name";
Debug.ShouldStop(524288);
main._cityname = _name;
 BA.debugLineNum = 1397;BA.debugLine="If admin1.Length > 0 Then cityName = cityName &";
Debug.ShouldStop(1048576);
if (RemoteObject.solveBoolean(">",_admin1.runMethod(true,"length"),BA.numberCast(double.class, 0))) { 
main._cityname = RemoteObject.concat(main._cityname,RemoteObject.createImmutable(", "),_admin1);};
 BA.debugLineNum = 1398;BA.debugLine="If country.Length > 0 Then cityName = cityName &";
Debug.ShouldStop(2097152);
if (RemoteObject.solveBoolean(">",_country.runMethod(true,"length"),BA.numberCast(double.class, 0))) { 
main._cityname = RemoteObject.concat(main._cityname,RemoteObject.createImmutable(", "),_country);};
 BA.debugLineNum = 1401;BA.debugLine="SaveSettings";
Debug.ShouldStop(16777216);
_savesettings();
 BA.debugLineNum = 1404;BA.debugLine="FetchWeather";
Debug.ShouldStop(134217728);
_fetchweather();
 BA.debugLineNum = 1405;BA.debugLine="FetchPrayerTimes";
Debug.ShouldStop(268435456);
_fetchprayertimes();
 BA.debugLineNum = 1407;BA.debugLine="Log(\"City changed to: \" & cityName & \" (lat: \" &";
Debug.ShouldStop(1073741824);
main.__c.runVoidMethod ("LogImpl","28257558",RemoteObject.concat(RemoteObject.createImmutable("City changed to: "),main._cityname,RemoteObject.createImmutable(" (lat: "),main._latitude,RemoteObject.createImmutable(", lon: "),main._longitude,RemoteObject.createImmutable(")")),0);
 BA.debugLineNum = 1410;BA.debugLine="ShowAlert(\"City Updated\", \"Location set to: \" &";
Debug.ShouldStop(2);
_showalert(BA.ObjectToString("City Updated"),RemoteObject.concat(RemoteObject.createImmutable("Location set to: "),main._cityname));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e16) {
			BA.rdebugUtils.runVoidMethod("setLastException",main.ba, e16.toString()); BA.debugLineNum = 1412;BA.debugLine="Log(\"SelectCity error: \" & LastException.Message";
Debug.ShouldStop(8);
main.__c.runVoidMethod ("LogImpl","28257563",RemoteObject.concat(RemoteObject.createImmutable("SelectCity error: "),main.__c.runMethod(false,"LastException",main.ba).runMethod(true,"getMessage")),0);
 };
 BA.debugLineNum = 1414;BA.debugLine="End Sub";
Debug.ShouldStop(32);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setupcolorschemes() throws Exception{
try {
		Debug.PushSubsStack("SetupColorSchemes (main) ","main",0,main.ba,main.mostCurrent,761);
if (RapidSub.canDelegate("setupcolorschemes")) { return b4j.example.main.remoteMe.runUserSub(false, "main","setupcolorschemes");}
 BA.debugLineNum = 761;BA.debugLine="Sub SetupColorSchemes";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 762;BA.debugLine="colorSchemes.Add(CreateMap(\"name\": \"Cyan\", \"paint";
Debug.ShouldStop(33554432);
main._colorschemes.runVoidMethod ("Add",(Object)((main.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("name")),RemoteObject.createImmutable(("Cyan")),RemoteObject.createImmutable(("paint")),(main._fx.getField(false,"Colors").runMethod(false,"RGB",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 255)),(Object)(BA.numberCast(int.class, 255)))),RemoteObject.createImmutable(("int")),(main._xui.runMethod(true,"Color_RGB",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 255)),(Object)(BA.numberCast(int.class, 255))))})).getObject())));
 BA.debugLineNum = 763;BA.debugLine="colorSchemes.Add(CreateMap(\"name\": \"White\", \"pain";
Debug.ShouldStop(67108864);
main._colorschemes.runVoidMethod ("Add",(Object)((main.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("name")),RemoteObject.createImmutable(("White")),RemoteObject.createImmutable(("paint")),(main._fx.getField(false,"Colors").runMethod(false,"RGB",(Object)(BA.numberCast(int.class, 255)),(Object)(BA.numberCast(int.class, 255)),(Object)(BA.numberCast(int.class, 255)))),RemoteObject.createImmutable(("int")),(main._xui.runMethod(true,"Color_RGB",(Object)(BA.numberCast(int.class, 255)),(Object)(BA.numberCast(int.class, 255)),(Object)(BA.numberCast(int.class, 255))))})).getObject())));
 BA.debugLineNum = 764;BA.debugLine="colorSchemes.Add(CreateMap(\"name\": \"Yellow\", \"pai";
Debug.ShouldStop(134217728);
main._colorschemes.runVoidMethod ("Add",(Object)((main.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("name")),RemoteObject.createImmutable(("Yellow")),RemoteObject.createImmutable(("paint")),(main._fx.getField(false,"Colors").runMethod(false,"RGB",(Object)(BA.numberCast(int.class, 255)),(Object)(BA.numberCast(int.class, 255)),(Object)(BA.numberCast(int.class, 0)))),RemoteObject.createImmutable(("int")),(main._xui.runMethod(true,"Color_RGB",(Object)(BA.numberCast(int.class, 255)),(Object)(BA.numberCast(int.class, 255)),(Object)(BA.numberCast(int.class, 0))))})).getObject())));
 BA.debugLineNum = 765;BA.debugLine="colorSchemes.Add(CreateMap(\"name\": \"Orange\", \"pai";
Debug.ShouldStop(268435456);
main._colorschemes.runVoidMethod ("Add",(Object)((main.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("name")),RemoteObject.createImmutable(("Orange")),RemoteObject.createImmutable(("paint")),(main._fx.getField(false,"Colors").runMethod(false,"RGB",(Object)(BA.numberCast(int.class, 255)),(Object)(BA.numberCast(int.class, 165)),(Object)(BA.numberCast(int.class, 0)))),RemoteObject.createImmutable(("int")),(main._xui.runMethod(true,"Color_RGB",(Object)(BA.numberCast(int.class, 255)),(Object)(BA.numberCast(int.class, 165)),(Object)(BA.numberCast(int.class, 0))))})).getObject())));
 BA.debugLineNum = 766;BA.debugLine="colorSchemes.Add(CreateMap(\"name\": \"Magenta\", \"pa";
Debug.ShouldStop(536870912);
main._colorschemes.runVoidMethod ("Add",(Object)((main.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("name")),RemoteObject.createImmutable(("Magenta")),RemoteObject.createImmutable(("paint")),(main._fx.getField(false,"Colors").runMethod(false,"RGB",(Object)(BA.numberCast(int.class, 255)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 255)))),RemoteObject.createImmutable(("int")),(main._xui.runMethod(true,"Color_RGB",(Object)(BA.numberCast(int.class, 255)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 255))))})).getObject())));
 BA.debugLineNum = 767;BA.debugLine="colorSchemes.Add(CreateMap(\"name\": \"Lime\", \"paint";
Debug.ShouldStop(1073741824);
main._colorschemes.runVoidMethod ("Add",(Object)((main.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("name")),RemoteObject.createImmutable(("Lime")),RemoteObject.createImmutable(("paint")),(main._fx.getField(false,"Colors").runMethod(false,"RGB",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 255)),(Object)(BA.numberCast(int.class, 0)))),RemoteObject.createImmutable(("int")),(main._xui.runMethod(true,"Color_RGB",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 255)),(Object)(BA.numberCast(int.class, 0))))})).getObject())));
 BA.debugLineNum = 768;BA.debugLine="colorSchemes.Add(CreateMap(\"name\": \"Pink\", \"paint";
Debug.ShouldStop(-2147483648);
main._colorschemes.runVoidMethod ("Add",(Object)((main.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("name")),RemoteObject.createImmutable(("Pink")),RemoteObject.createImmutable(("paint")),(main._fx.getField(false,"Colors").runMethod(false,"RGB",(Object)(BA.numberCast(int.class, 255)),(Object)(BA.numberCast(int.class, 192)),(Object)(BA.numberCast(int.class, 203)))),RemoteObject.createImmutable(("int")),(main._xui.runMethod(true,"Color_RGB",(Object)(BA.numberCast(int.class, 255)),(Object)(BA.numberCast(int.class, 192)),(Object)(BA.numberCast(int.class, 203))))})).getObject())));
 BA.debugLineNum = 769;BA.debugLine="colorSchemes.Add(CreateMap(\"name\": \"Red\", \"paint\"";
Debug.ShouldStop(1);
main._colorschemes.runVoidMethod ("Add",(Object)((main.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("name")),RemoteObject.createImmutable(("Red")),RemoteObject.createImmutable(("paint")),(main._fx.getField(false,"Colors").runMethod(false,"RGB",(Object)(BA.numberCast(int.class, 255)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)))),RemoteObject.createImmutable(("int")),(main._xui.runMethod(true,"Color_RGB",(Object)(BA.numberCast(int.class, 255)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0))))})).getObject())));
 BA.debugLineNum = 770;BA.debugLine="colorSchemes.Add(CreateMap(\"name\": \"Green\", \"pain";
Debug.ShouldStop(2);
main._colorschemes.runVoidMethod ("Add",(Object)((main.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("name")),RemoteObject.createImmutable(("Green")),RemoteObject.createImmutable(("paint")),(main._fx.getField(false,"Colors").runMethod(false,"RGB",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 128)),(Object)(BA.numberCast(int.class, 0)))),RemoteObject.createImmutable(("int")),(main._xui.runMethod(true,"Color_RGB",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 128)),(Object)(BA.numberCast(int.class, 0))))})).getObject())));
 BA.debugLineNum = 771;BA.debugLine="colorSchemes.Add(CreateMap(\"name\": \"Random\", \"pai";
Debug.ShouldStop(4);
main._colorschemes.runVoidMethod ("Add",(Object)((main.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("name")),RemoteObject.createImmutable(("Random")),RemoteObject.createImmutable(("paint")),main.__c.getField(false,"Null"),RemoteObject.createImmutable(("int")),RemoteObject.createImmutable((0))})).getObject())));
 BA.debugLineNum = 772;BA.debugLine="End Sub";
Debug.ShouldStop(8);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setuptranslations() throws Exception{
try {
		Debug.PushSubsStack("SetupTranslations (main) ","main",0,main.ba,main.mostCurrent,507);
if (RapidSub.canDelegate("setuptranslations")) { return b4j.example.main.remoteMe.runUserSub(false, "main","setuptranslations");}
RemoteObject _enmap = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _frmap = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _armap = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
 BA.debugLineNum = 507;BA.debugLine="Sub SetupTranslations";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 508;BA.debugLine="Try";
Debug.ShouldStop(134217728);
try { BA.debugLineNum = 510;BA.debugLine="Dim enMap As Map";
Debug.ShouldStop(536870912);
_enmap = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("enMap", _enmap);
 BA.debugLineNum = 511;BA.debugLine="enMap.Initialize";
Debug.ShouldStop(1073741824);
_enmap.runVoidMethod ("Initialize");
 BA.debugLineNum = 512;BA.debugLine="enMap.Put(\"loading_weather\", \"Loading weather...";
Debug.ShouldStop(-2147483648);
_enmap.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("loading_weather"))),(Object)((RemoteObject.createImmutable("Loading weather..."))));
 BA.debugLineNum = 513;BA.debugLine="enMap.Put(\"loading_prayer\", \"Loading prayer time";
Debug.ShouldStop(1);
_enmap.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("loading_prayer"))),(Object)((RemoteObject.createImmutable("Loading prayer times..."))));
 BA.debugLineNum = 514;BA.debugLine="enMap.Put(\"sunday\", \"Sunday\")";
Debug.ShouldStop(2);
_enmap.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("sunday"))),(Object)((RemoteObject.createImmutable("Sunday"))));
 BA.debugLineNum = 515;BA.debugLine="enMap.Put(\"monday\", \"Monday\")";
Debug.ShouldStop(4);
_enmap.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("monday"))),(Object)((RemoteObject.createImmutable("Monday"))));
 BA.debugLineNum = 516;BA.debugLine="enMap.Put(\"tuesday\", \"Tuesday\")";
Debug.ShouldStop(8);
_enmap.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("tuesday"))),(Object)((RemoteObject.createImmutable("Tuesday"))));
 BA.debugLineNum = 517;BA.debugLine="enMap.Put(\"wednesday\", \"Wednesday\")";
Debug.ShouldStop(16);
_enmap.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("wednesday"))),(Object)((RemoteObject.createImmutable("Wednesday"))));
 BA.debugLineNum = 518;BA.debugLine="enMap.Put(\"thursday\", \"Thursday\")";
Debug.ShouldStop(32);
_enmap.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("thursday"))),(Object)((RemoteObject.createImmutable("Thursday"))));
 BA.debugLineNum = 519;BA.debugLine="enMap.Put(\"friday\", \"Friday\")";
Debug.ShouldStop(64);
_enmap.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("friday"))),(Object)((RemoteObject.createImmutable("Friday"))));
 BA.debugLineNum = 520;BA.debugLine="enMap.Put(\"saturday\", \"Saturday\")";
Debug.ShouldStop(128);
_enmap.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("saturday"))),(Object)((RemoteObject.createImmutable("Saturday"))));
 BA.debugLineNum = 521;BA.debugLine="enMap.Put(\"january\", \"January\")";
Debug.ShouldStop(256);
_enmap.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("january"))),(Object)((RemoteObject.createImmutable("January"))));
 BA.debugLineNum = 522;BA.debugLine="enMap.Put(\"february\", \"February\")";
Debug.ShouldStop(512);
_enmap.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("february"))),(Object)((RemoteObject.createImmutable("February"))));
 BA.debugLineNum = 523;BA.debugLine="enMap.Put(\"march\", \"March\")";
Debug.ShouldStop(1024);
_enmap.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("march"))),(Object)((RemoteObject.createImmutable("March"))));
 BA.debugLineNum = 524;BA.debugLine="enMap.Put(\"april\", \"April\")";
Debug.ShouldStop(2048);
_enmap.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("april"))),(Object)((RemoteObject.createImmutable("April"))));
 BA.debugLineNum = 525;BA.debugLine="enMap.Put(\"may\", \"May\")";
Debug.ShouldStop(4096);
_enmap.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("may"))),(Object)((RemoteObject.createImmutable("May"))));
 BA.debugLineNum = 526;BA.debugLine="enMap.Put(\"june\", \"June\")";
Debug.ShouldStop(8192);
_enmap.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("june"))),(Object)((RemoteObject.createImmutable("June"))));
 BA.debugLineNum = 527;BA.debugLine="enMap.Put(\"july\", \"July\")";
Debug.ShouldStop(16384);
_enmap.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("july"))),(Object)((RemoteObject.createImmutable("July"))));
 BA.debugLineNum = 528;BA.debugLine="enMap.Put(\"august\", \"August\")";
Debug.ShouldStop(32768);
_enmap.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("august"))),(Object)((RemoteObject.createImmutable("August"))));
 BA.debugLineNum = 529;BA.debugLine="enMap.Put(\"september\", \"September\")";
Debug.ShouldStop(65536);
_enmap.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("september"))),(Object)((RemoteObject.createImmutable("September"))));
 BA.debugLineNum = 530;BA.debugLine="enMap.Put(\"october\", \"October\")";
Debug.ShouldStop(131072);
_enmap.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("october"))),(Object)((RemoteObject.createImmutable("October"))));
 BA.debugLineNum = 531;BA.debugLine="enMap.Put(\"november\", \"November\")";
Debug.ShouldStop(262144);
_enmap.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("november"))),(Object)((RemoteObject.createImmutable("November"))));
 BA.debugLineNum = 532;BA.debugLine="enMap.Put(\"december\", \"December\")";
Debug.ShouldStop(524288);
_enmap.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("december"))),(Object)((RemoteObject.createImmutable("December"))));
 BA.debugLineNum = 533;BA.debugLine="enMap.Put(\"fajr\", \"Fajr\")";
Debug.ShouldStop(1048576);
_enmap.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("fajr"))),(Object)((RemoteObject.createImmutable("Fajr"))));
 BA.debugLineNum = 534;BA.debugLine="enMap.Put(\"sunrise\", \"Sunrise\")";
Debug.ShouldStop(2097152);
_enmap.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("sunrise"))),(Object)((RemoteObject.createImmutable("Sunrise"))));
 BA.debugLineNum = 535;BA.debugLine="enMap.Put(\"dhuhr\", \"Dhuhr\")";
Debug.ShouldStop(4194304);
_enmap.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("dhuhr"))),(Object)((RemoteObject.createImmutable("Dhuhr"))));
 BA.debugLineNum = 536;BA.debugLine="enMap.Put(\"asr\", \"Asr\")";
Debug.ShouldStop(8388608);
_enmap.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("asr"))),(Object)((RemoteObject.createImmutable("Asr"))));
 BA.debugLineNum = 537;BA.debugLine="enMap.Put(\"maghrib\", \"Maghrib\")";
Debug.ShouldStop(16777216);
_enmap.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("maghrib"))),(Object)((RemoteObject.createImmutable("Maghrib"))));
 BA.debugLineNum = 538;BA.debugLine="enMap.Put(\"isha\", \"Isha\")";
Debug.ShouldStop(33554432);
_enmap.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("isha"))),(Object)((RemoteObject.createImmutable("Isha"))));
 BA.debugLineNum = 539;BA.debugLine="translations.Put(\"en\", enMap)";
Debug.ShouldStop(67108864);
main._translations.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("en"))),(Object)((_enmap.getObject())));
 BA.debugLineNum = 542;BA.debugLine="Dim frMap As Map";
Debug.ShouldStop(536870912);
_frmap = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("frMap", _frmap);
 BA.debugLineNum = 543;BA.debugLine="frMap.Initialize";
Debug.ShouldStop(1073741824);
_frmap.runVoidMethod ("Initialize");
 BA.debugLineNum = 544;BA.debugLine="frMap.Put(\"loading_weather\", \"Chargement météo..";
Debug.ShouldStop(-2147483648);
_frmap.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("loading_weather"))),(Object)((RemoteObject.createImmutable("Chargement météo..."))));
 BA.debugLineNum = 545;BA.debugLine="frMap.Put(\"loading_prayer\", \"Chargement horaires";
Debug.ShouldStop(1);
_frmap.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("loading_prayer"))),(Object)((RemoteObject.createImmutable("Chargement horaires..."))));
 BA.debugLineNum = 546;BA.debugLine="frMap.Put(\"sunday\", \"Dimanche\")";
Debug.ShouldStop(2);
_frmap.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("sunday"))),(Object)((RemoteObject.createImmutable("Dimanche"))));
 BA.debugLineNum = 547;BA.debugLine="frMap.Put(\"monday\", \"Lundi\")";
Debug.ShouldStop(4);
_frmap.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("monday"))),(Object)((RemoteObject.createImmutable("Lundi"))));
 BA.debugLineNum = 548;BA.debugLine="frMap.Put(\"tuesday\", \"Mardi\")";
Debug.ShouldStop(8);
_frmap.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("tuesday"))),(Object)((RemoteObject.createImmutable("Mardi"))));
 BA.debugLineNum = 549;BA.debugLine="frMap.Put(\"wednesday\", \"Mercredi\")";
Debug.ShouldStop(16);
_frmap.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("wednesday"))),(Object)((RemoteObject.createImmutable("Mercredi"))));
 BA.debugLineNum = 550;BA.debugLine="frMap.Put(\"thursday\", \"Jeudi\")";
Debug.ShouldStop(32);
_frmap.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("thursday"))),(Object)((RemoteObject.createImmutable("Jeudi"))));
 BA.debugLineNum = 551;BA.debugLine="frMap.Put(\"friday\", \"Vendredi\")";
Debug.ShouldStop(64);
_frmap.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("friday"))),(Object)((RemoteObject.createImmutable("Vendredi"))));
 BA.debugLineNum = 552;BA.debugLine="frMap.Put(\"saturday\", \"Samedi\")";
Debug.ShouldStop(128);
_frmap.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("saturday"))),(Object)((RemoteObject.createImmutable("Samedi"))));
 BA.debugLineNum = 553;BA.debugLine="frMap.Put(\"january\", \"Janvier\")";
Debug.ShouldStop(256);
_frmap.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("january"))),(Object)((RemoteObject.createImmutable("Janvier"))));
 BA.debugLineNum = 554;BA.debugLine="frMap.Put(\"february\", \"Février\")";
Debug.ShouldStop(512);
_frmap.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("february"))),(Object)((RemoteObject.createImmutable("Février"))));
 BA.debugLineNum = 555;BA.debugLine="frMap.Put(\"march\", \"Mars\")";
Debug.ShouldStop(1024);
_frmap.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("march"))),(Object)((RemoteObject.createImmutable("Mars"))));
 BA.debugLineNum = 556;BA.debugLine="frMap.Put(\"april\", \"Avril\")";
Debug.ShouldStop(2048);
_frmap.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("april"))),(Object)((RemoteObject.createImmutable("Avril"))));
 BA.debugLineNum = 557;BA.debugLine="frMap.Put(\"may\", \"Mai\")";
Debug.ShouldStop(4096);
_frmap.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("may"))),(Object)((RemoteObject.createImmutable("Mai"))));
 BA.debugLineNum = 558;BA.debugLine="frMap.Put(\"june\", \"Juin\")";
Debug.ShouldStop(8192);
_frmap.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("june"))),(Object)((RemoteObject.createImmutable("Juin"))));
 BA.debugLineNum = 559;BA.debugLine="frMap.Put(\"july\", \"Juillet\")";
Debug.ShouldStop(16384);
_frmap.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("july"))),(Object)((RemoteObject.createImmutable("Juillet"))));
 BA.debugLineNum = 560;BA.debugLine="frMap.Put(\"august\", \"Août\")";
Debug.ShouldStop(32768);
_frmap.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("august"))),(Object)((RemoteObject.createImmutable("Août"))));
 BA.debugLineNum = 561;BA.debugLine="frMap.Put(\"september\", \"Septembre\")";
Debug.ShouldStop(65536);
_frmap.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("september"))),(Object)((RemoteObject.createImmutable("Septembre"))));
 BA.debugLineNum = 562;BA.debugLine="frMap.Put(\"october\", \"Octobre\")";
Debug.ShouldStop(131072);
_frmap.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("october"))),(Object)((RemoteObject.createImmutable("Octobre"))));
 BA.debugLineNum = 563;BA.debugLine="frMap.Put(\"november\", \"Novembre\")";
Debug.ShouldStop(262144);
_frmap.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("november"))),(Object)((RemoteObject.createImmutable("Novembre"))));
 BA.debugLineNum = 564;BA.debugLine="frMap.Put(\"december\", \"Décembre\")";
Debug.ShouldStop(524288);
_frmap.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("december"))),(Object)((RemoteObject.createImmutable("Décembre"))));
 BA.debugLineNum = 565;BA.debugLine="frMap.Put(\"fajr\", \"Fajr\")";
Debug.ShouldStop(1048576);
_frmap.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("fajr"))),(Object)((RemoteObject.createImmutable("Fajr"))));
 BA.debugLineNum = 566;BA.debugLine="frMap.Put(\"sunrise\", \"Lever\")";
Debug.ShouldStop(2097152);
_frmap.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("sunrise"))),(Object)((RemoteObject.createImmutable("Lever"))));
 BA.debugLineNum = 567;BA.debugLine="frMap.Put(\"dhuhr\", \"Dhuhr\")";
Debug.ShouldStop(4194304);
_frmap.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("dhuhr"))),(Object)((RemoteObject.createImmutable("Dhuhr"))));
 BA.debugLineNum = 568;BA.debugLine="frMap.Put(\"asr\", \"Asr\")";
Debug.ShouldStop(8388608);
_frmap.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("asr"))),(Object)((RemoteObject.createImmutable("Asr"))));
 BA.debugLineNum = 569;BA.debugLine="frMap.Put(\"maghrib\", \"Maghrib\")";
Debug.ShouldStop(16777216);
_frmap.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("maghrib"))),(Object)((RemoteObject.createImmutable("Maghrib"))));
 BA.debugLineNum = 570;BA.debugLine="frMap.Put(\"isha\", \"Isha\")";
Debug.ShouldStop(33554432);
_frmap.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("isha"))),(Object)((RemoteObject.createImmutable("Isha"))));
 BA.debugLineNum = 571;BA.debugLine="translations.Put(\"fr\", frMap)";
Debug.ShouldStop(67108864);
main._translations.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("fr"))),(Object)((_frmap.getObject())));
 BA.debugLineNum = 574;BA.debugLine="Dim arMap As Map";
Debug.ShouldStop(536870912);
_armap = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("arMap", _armap);
 BA.debugLineNum = 575;BA.debugLine="arMap.Initialize";
Debug.ShouldStop(1073741824);
_armap.runVoidMethod ("Initialize");
 BA.debugLineNum = 576;BA.debugLine="arMap.Put(\"loading_weather\", \"تحميل الطقس...\")";
Debug.ShouldStop(-2147483648);
_armap.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("loading_weather"))),(Object)((RemoteObject.createImmutable("تحميل الطقس..."))));
 BA.debugLineNum = 577;BA.debugLine="arMap.Put(\"loading_prayer\", \"تحميل الصلاة...\")";
Debug.ShouldStop(1);
_armap.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("loading_prayer"))),(Object)((RemoteObject.createImmutable("تحميل الصلاة..."))));
 BA.debugLineNum = 578;BA.debugLine="arMap.Put(\"sunday\", \"الأحد\")";
Debug.ShouldStop(2);
_armap.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("sunday"))),(Object)((RemoteObject.createImmutable("الأحد"))));
 BA.debugLineNum = 579;BA.debugLine="arMap.Put(\"monday\", \"الاثنين\")";
Debug.ShouldStop(4);
_armap.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("monday"))),(Object)((RemoteObject.createImmutable("الاثنين"))));
 BA.debugLineNum = 580;BA.debugLine="arMap.Put(\"tuesday\", \"الثلاثاء\")";
Debug.ShouldStop(8);
_armap.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("tuesday"))),(Object)((RemoteObject.createImmutable("الثلاثاء"))));
 BA.debugLineNum = 581;BA.debugLine="arMap.Put(\"wednesday\", \"الأربعاء\")";
Debug.ShouldStop(16);
_armap.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("wednesday"))),(Object)((RemoteObject.createImmutable("الأربعاء"))));
 BA.debugLineNum = 582;BA.debugLine="arMap.Put(\"thursday\", \"الخميس\")";
Debug.ShouldStop(32);
_armap.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("thursday"))),(Object)((RemoteObject.createImmutable("الخميس"))));
 BA.debugLineNum = 583;BA.debugLine="arMap.Put(\"friday\", \"الجمعة\")";
Debug.ShouldStop(64);
_armap.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("friday"))),(Object)((RemoteObject.createImmutable("الجمعة"))));
 BA.debugLineNum = 584;BA.debugLine="arMap.Put(\"saturday\", \"السبت\")";
Debug.ShouldStop(128);
_armap.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("saturday"))),(Object)((RemoteObject.createImmutable("السبت"))));
 BA.debugLineNum = 585;BA.debugLine="arMap.Put(\"january\", \"يناير\")";
Debug.ShouldStop(256);
_armap.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("january"))),(Object)((RemoteObject.createImmutable("يناير"))));
 BA.debugLineNum = 586;BA.debugLine="arMap.Put(\"february\", \"فبراير\")";
Debug.ShouldStop(512);
_armap.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("february"))),(Object)((RemoteObject.createImmutable("فبراير"))));
 BA.debugLineNum = 587;BA.debugLine="arMap.Put(\"march\", \"مارس\")";
Debug.ShouldStop(1024);
_armap.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("march"))),(Object)((RemoteObject.createImmutable("مارس"))));
 BA.debugLineNum = 588;BA.debugLine="arMap.Put(\"april\", \"أبريل\")";
Debug.ShouldStop(2048);
_armap.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("april"))),(Object)((RemoteObject.createImmutable("أبريل"))));
 BA.debugLineNum = 589;BA.debugLine="arMap.Put(\"may\", \"مايو\")";
Debug.ShouldStop(4096);
_armap.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("may"))),(Object)((RemoteObject.createImmutable("مايو"))));
 BA.debugLineNum = 590;BA.debugLine="arMap.Put(\"june\", \"يونيو\")";
Debug.ShouldStop(8192);
_armap.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("june"))),(Object)((RemoteObject.createImmutable("يونيو"))));
 BA.debugLineNum = 591;BA.debugLine="arMap.Put(\"july\", \"يوليو\")";
Debug.ShouldStop(16384);
_armap.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("july"))),(Object)((RemoteObject.createImmutable("يوليو"))));
 BA.debugLineNum = 592;BA.debugLine="arMap.Put(\"august\", \"أغسطس\")";
Debug.ShouldStop(32768);
_armap.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("august"))),(Object)((RemoteObject.createImmutable("أغسطس"))));
 BA.debugLineNum = 593;BA.debugLine="arMap.Put(\"september\", \"سبتمبر\")";
Debug.ShouldStop(65536);
_armap.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("september"))),(Object)((RemoteObject.createImmutable("سبتمبر"))));
 BA.debugLineNum = 594;BA.debugLine="arMap.Put(\"october\", \"أكتوبر\")";
Debug.ShouldStop(131072);
_armap.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("october"))),(Object)((RemoteObject.createImmutable("أكتوبر"))));
 BA.debugLineNum = 595;BA.debugLine="arMap.Put(\"november\", \"نوفمبر\")";
Debug.ShouldStop(262144);
_armap.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("november"))),(Object)((RemoteObject.createImmutable("نوفمبر"))));
 BA.debugLineNum = 596;BA.debugLine="arMap.Put(\"december\", \"ديسمبر\")";
Debug.ShouldStop(524288);
_armap.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("december"))),(Object)((RemoteObject.createImmutable("ديسمبر"))));
 BA.debugLineNum = 597;BA.debugLine="arMap.Put(\"fajr\", \"الفجر\")";
Debug.ShouldStop(1048576);
_armap.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("fajr"))),(Object)((RemoteObject.createImmutable("الفجر"))));
 BA.debugLineNum = 598;BA.debugLine="arMap.Put(\"sunrise\", \"الشروق\")";
Debug.ShouldStop(2097152);
_armap.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("sunrise"))),(Object)((RemoteObject.createImmutable("الشروق"))));
 BA.debugLineNum = 599;BA.debugLine="arMap.Put(\"dhuhr\", \"الظهر\")";
Debug.ShouldStop(4194304);
_armap.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("dhuhr"))),(Object)((RemoteObject.createImmutable("الظهر"))));
 BA.debugLineNum = 600;BA.debugLine="arMap.Put(\"asr\", \"العصر\")";
Debug.ShouldStop(8388608);
_armap.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("asr"))),(Object)((RemoteObject.createImmutable("العصر"))));
 BA.debugLineNum = 601;BA.debugLine="arMap.Put(\"maghrib\", \"المغرب\")";
Debug.ShouldStop(16777216);
_armap.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("maghrib"))),(Object)((RemoteObject.createImmutable("المغرب"))));
 BA.debugLineNum = 602;BA.debugLine="arMap.Put(\"isha\", \"العشاء\")";
Debug.ShouldStop(33554432);
_armap.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("isha"))),(Object)((RemoteObject.createImmutable("العشاء"))));
 BA.debugLineNum = 603;BA.debugLine="translations.Put(\"ar\", arMap)";
Debug.ShouldStop(67108864);
main._translations.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ar"))),(Object)((_armap.getObject())));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e93) {
			BA.rdebugUtils.runVoidMethod("setLastException",main.ba, e93.toString()); BA.debugLineNum = 605;BA.debugLine="Log(\"Translation setup error: \" & LastException.";
Debug.ShouldStop(268435456);
main.__c.runVoidMethod ("LogImpl","25505122",RemoteObject.concat(RemoteObject.createImmutable("Translation setup error: "),main.__c.runMethod(false,"LastException",main.ba).runMethod(true,"getMessage")),0);
 };
 BA.debugLineNum = 607;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _showalert(RemoteObject _title,RemoteObject _message) throws Exception{
try {
		Debug.PushSubsStack("ShowAlert (main) ","main",0,main.ba,main.mostCurrent,1416);
if (RapidSub.canDelegate("showalert")) { return b4j.example.main.remoteMe.runUserSub(false, "main","showalert", _title, _message);}
RemoteObject _alert = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
Debug.locals.put("title", _title);
Debug.locals.put("message", _message);
 BA.debugLineNum = 1416;BA.debugLine="Sub ShowAlert(title As String, message As String)";
Debug.ShouldStop(128);
 BA.debugLineNum = 1417;BA.debugLine="Try";
Debug.ShouldStop(256);
try { BA.debugLineNum = 1418;BA.debugLine="Dim alert As JavaObject";
Debug.ShouldStop(512);
_alert = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");Debug.locals.put("alert", _alert);
 BA.debugLineNum = 1419;BA.debugLine="alert.InitializeNewInstance(\"javafx.scene.contro";
Debug.ShouldStop(1024);
_alert.runVoidMethod ("InitializeNewInstance",(Object)(BA.ObjectToString("javafx.scene.control.Alert")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {_getalerttype(RemoteObject.createImmutable("INFORMATION"))})));
 BA.debugLineNum = 1420;BA.debugLine="alert.RunMethod(\"setTitle\", Array(title))";
Debug.ShouldStop(2048);
_alert.runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("setTitle")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_title)})));
 BA.debugLineNum = 1421;BA.debugLine="alert.RunMethod(\"setHeaderText\", Array(Null))";
Debug.ShouldStop(4096);
_alert.runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("setHeaderText")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {main.__c.getField(false,"Null")})));
 BA.debugLineNum = 1422;BA.debugLine="alert.RunMethod(\"setContentText\", Array(message)";
Debug.ShouldStop(8192);
_alert.runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("setContentText")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_message)})));
 BA.debugLineNum = 1423;BA.debugLine="alert.RunMethod(\"showAndWait\", Null)";
Debug.ShouldStop(16384);
_alert.runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("showAndWait")),(Object)((main.__c.getField(false,"Null"))));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e9) {
			BA.rdebugUtils.runVoidMethod("setLastException",main.ba, e9.toString()); BA.debugLineNum = 1425;BA.debugLine="Log(\"ShowAlert error: \" & LastException.Message)";
Debug.ShouldStop(65536);
main.__c.runVoidMethod ("LogImpl","28323081",RemoteObject.concat(RemoteObject.createImmutable("ShowAlert error: "),main.__c.runMethod(false,"LastException",main.ba).runMethod(true,"getMessage")),0);
 };
 BA.debugLineNum = 1427;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _showcityselectiondialog(RemoteObject _results) throws Exception{
try {
		Debug.PushSubsStack("ShowCitySelectionDialog (main) ","main",0,main.ba,main.mostCurrent,1344);
if (RapidSub.canDelegate("showcityselectiondialog")) { return b4j.example.main.remoteMe.runUserSub(false, "main","showcityselectiondialog", _results);}
RemoteObject _choices = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
int _i = 0;
RemoteObject _city = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _name = RemoteObject.createImmutable("");
RemoteObject _country = RemoteObject.createImmutable("");
RemoteObject _admin1 = RemoteObject.createImmutable("");
RemoteObject _displayname = RemoteObject.createImmutable("");
RemoteObject _choicedialog = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
RemoteObject _result = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
RemoteObject _ispresent = RemoteObject.createImmutable(false);
RemoteObject _selected = RemoteObject.createImmutable("");
RemoteObject _selectedindex = RemoteObject.createImmutable(0);
Debug.locals.put("results", _results);
 BA.debugLineNum = 1344;BA.debugLine="Sub ShowCitySelectionDialog(results As List)";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 1345;BA.debugLine="Try";
Debug.ShouldStop(1);
try { BA.debugLineNum = 1347;BA.debugLine="Dim choices As List";
Debug.ShouldStop(4);
_choices = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("choices", _choices);
 BA.debugLineNum = 1348;BA.debugLine="choices.Initialize";
Debug.ShouldStop(8);
_choices.runVoidMethod ("Initialize");
 BA.debugLineNum = 1350;BA.debugLine="For i = 0 To Min(results.Size - 1, 9) ' Show max";
Debug.ShouldStop(32);
{
final int step4 = 1;
final int limit4 = (int) (0 + main.__c.runMethod(true,"Min",(Object)(BA.numberCast(double.class, RemoteObject.solve(new RemoteObject[] {_results.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1))),(Object)(BA.numberCast(double.class, 9))).<Double>get().doubleValue());
_i = 0 ;
for (;(step4 > 0 && _i <= limit4) || (step4 < 0 && _i >= limit4) ;_i = ((int)(0 + _i + step4))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 1351;BA.debugLine="Dim city As Map = results.Get(i)";
Debug.ShouldStop(64);
_city = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_city = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _results.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));Debug.locals.put("city", _city);Debug.locals.put("city", _city);
 BA.debugLineNum = 1352;BA.debugLine="Dim name As String = city.Get(\"name\")";
Debug.ShouldStop(128);
_name = BA.ObjectToString(_city.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("name")))));Debug.locals.put("name", _name);Debug.locals.put("name", _name);
 BA.debugLineNum = 1353;BA.debugLine="Dim country As String = city.GetDefault(\"countr";
Debug.ShouldStop(256);
_country = BA.ObjectToString(_city.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("country"))),(Object)((RemoteObject.createImmutable("")))));Debug.locals.put("country", _country);Debug.locals.put("country", _country);
 BA.debugLineNum = 1354;BA.debugLine="Dim admin1 As String = city.GetDefault(\"admin1\"";
Debug.ShouldStop(512);
_admin1 = BA.ObjectToString(_city.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("admin1"))),(Object)((RemoteObject.createImmutable("")))));Debug.locals.put("admin1", _admin1);Debug.locals.put("admin1", _admin1);
 BA.debugLineNum = 1356;BA.debugLine="Dim displayName As String = name";
Debug.ShouldStop(2048);
_displayname = _name;Debug.locals.put("displayName", _displayname);Debug.locals.put("displayName", _displayname);
 BA.debugLineNum = 1357;BA.debugLine="If admin1.Length > 0 Then displayName = display";
Debug.ShouldStop(4096);
if (RemoteObject.solveBoolean(">",_admin1.runMethod(true,"length"),BA.numberCast(double.class, 0))) { 
_displayname = RemoteObject.concat(_displayname,RemoteObject.createImmutable(", "),_admin1);Debug.locals.put("displayName", _displayname);};
 BA.debugLineNum = 1358;BA.debugLine="If country.Length > 0 Then displayName = displa";
Debug.ShouldStop(8192);
if (RemoteObject.solveBoolean(">",_country.runMethod(true,"length"),BA.numberCast(double.class, 0))) { 
_displayname = RemoteObject.concat(_displayname,RemoteObject.createImmutable(", "),_country);Debug.locals.put("displayName", _displayname);};
 BA.debugLineNum = 1360;BA.debugLine="choices.Add(displayName)";
Debug.ShouldStop(32768);
_choices.runVoidMethod ("Add",(Object)((_displayname)));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 1364;BA.debugLine="Dim choiceDialog As JavaObject";
Debug.ShouldStop(524288);
_choicedialog = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");Debug.locals.put("choiceDialog", _choicedialog);
 BA.debugLineNum = 1365;BA.debugLine="choiceDialog.InitializeNewInstance(\"javafx.scene";
Debug.ShouldStop(1048576);
_choicedialog.runVoidMethod ("InitializeNewInstance",(Object)(BA.ObjectToString("javafx.scene.control.ChoiceDialog")),(Object)(RemoteObject.createNewArray("Object",new int[] {2},new Object[] {_choices.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 0))),(_choices.getObject())})));
 BA.debugLineNum = 1366;BA.debugLine="choiceDialog.RunMethod(\"setTitle\", Array(\"Select";
Debug.ShouldStop(2097152);
_choicedialog.runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("setTitle")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(RemoteObject.createImmutable("Select City"))})));
 BA.debugLineNum = 1367;BA.debugLine="choiceDialog.RunMethod(\"setHeaderText\", Array(\"M";
Debug.ShouldStop(4194304);
_choicedialog.runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("setHeaderText")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(RemoteObject.createImmutable("Multiple cities found"))})));
 BA.debugLineNum = 1368;BA.debugLine="choiceDialog.RunMethod(\"setContentText\", Array(\"";
Debug.ShouldStop(8388608);
_choicedialog.runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("setContentText")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(RemoteObject.createImmutable("Choose your city:"))})));
 BA.debugLineNum = 1370;BA.debugLine="Dim result As JavaObject = choiceDialog.RunMetho";
Debug.ShouldStop(33554432);
_result = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_result = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), _choicedialog.runMethod(false,"RunMethod",(Object)(BA.ObjectToString("showAndWait")),(Object)((main.__c.getField(false,"Null")))));Debug.locals.put("result", _result);Debug.locals.put("result", _result);
 BA.debugLineNum = 1371;BA.debugLine="Dim isPresent As Boolean = result.RunMethod(\"isP";
Debug.ShouldStop(67108864);
_ispresent = BA.ObjectToBoolean(_result.runMethod(false,"RunMethod",(Object)(BA.ObjectToString("isPresent")),(Object)((main.__c.getField(false,"Null")))));Debug.locals.put("isPresent", _ispresent);Debug.locals.put("isPresent", _ispresent);
 BA.debugLineNum = 1373;BA.debugLine="If isPresent Then";
Debug.ShouldStop(268435456);
if (_ispresent.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 1374;BA.debugLine="Dim selected As String = result.RunMethod(\"get\"";
Debug.ShouldStop(536870912);
_selected = BA.ObjectToString(_result.runMethod(false,"RunMethod",(Object)(BA.ObjectToString("get")),(Object)((main.__c.getField(false,"Null")))));Debug.locals.put("selected", _selected);Debug.locals.put("selected", _selected);
 BA.debugLineNum = 1375;BA.debugLine="Dim selectedIndex As Int = choices.IndexOf(sele";
Debug.ShouldStop(1073741824);
_selectedindex = _choices.runMethod(true,"IndexOf",(Object)((_selected)));Debug.locals.put("selectedIndex", _selectedindex);Debug.locals.put("selectedIndex", _selectedindex);
 BA.debugLineNum = 1376;BA.debugLine="If selectedIndex >= 0 Then";
Debug.ShouldStop(-2147483648);
if (RemoteObject.solveBoolean("g",_selectedindex,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 1377;BA.debugLine="SelectCity(results.Get(selectedIndex))";
Debug.ShouldStop(1);
_selectcity(RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _results.runMethod(false,"Get",(Object)(_selectedindex))));
 };
 };
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e29) {
			BA.rdebugUtils.runVoidMethod("setLastException",main.ba, e29.toString()); BA.debugLineNum = 1381;BA.debugLine="Log(\"ShowCitySelectionDialog error: \" & LastExce";
Debug.ShouldStop(16);
main.__c.runVoidMethod ("LogImpl","28192037",RemoteObject.concat(RemoteObject.createImmutable("ShowCitySelectionDialog error: "),main.__c.runMethod(false,"LastException",main.ba).runMethod(true,"getMessage")),0);
 };
 BA.debugLineNum = 1383;BA.debugLine="End Sub";
Debug.ShouldStop(64);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _timimagechange_tick() throws Exception{
try {
		Debug.PushSubsStack("timImageChange_Tick (main) ","main",0,main.ba,main.mostCurrent,900);
if (RapidSub.canDelegate("timimagechange_tick")) { return b4j.example.main.remoteMe.runUserSub(false, "main","timimagechange_tick");}
RemoteObject _elapsed = RemoteObject.createImmutable(0L);
RemoteObject _interval = RemoteObject.createImmutable(0);
 BA.debugLineNum = 900;BA.debugLine="Sub timImageChange_Tick";
Debug.ShouldStop(8);
 BA.debugLineNum = 901;BA.debugLine="Try";
Debug.ShouldStop(16);
try { BA.debugLineNum = 902;BA.debugLine="If currentImageInterval > 0 And showImage Then";
Debug.ShouldStop(32);
if (RemoteObject.solveBoolean(">",main._currentimageinterval,BA.numberCast(double.class, 0)) && RemoteObject.solveBoolean(".",main._showimage)) { 
 BA.debugLineNum = 903;BA.debugLine="Dim elapsed As Long = (DateTime.Now / 1000) - l";
Debug.ShouldStop(64);
_elapsed = BA.numberCast(long.class, RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {main.__c.getField(false,"DateTime").runMethod(true,"getNow"),RemoteObject.createImmutable(1000)}, "/",0, 0)),main._lastimagechangetime}, "-",1, 0));Debug.locals.put("elapsed", _elapsed);Debug.locals.put("elapsed", _elapsed);
 BA.debugLineNum = 904;BA.debugLine="Dim interval As Int = imageIntervals.Get(curren";
Debug.ShouldStop(128);
_interval = BA.numberCast(int.class, main._imageintervals.runMethod(false,"Get",(Object)(main._currentimageinterval)));Debug.locals.put("interval", _interval);Debug.locals.put("interval", _interval);
 BA.debugLineNum = 905;BA.debugLine="If elapsed >= interval Then";
Debug.ShouldStop(256);
if (RemoteObject.solveBoolean("g",_elapsed,BA.numberCast(long.class, _interval))) { 
 BA.debugLineNum = 906;BA.debugLine="LoadBackgroundImage";
Debug.ShouldStop(512);
_loadbackgroundimage();
 BA.debugLineNum = 907;BA.debugLine="lastImageChangeTime = DateTime.Now / 1000";
Debug.ShouldStop(1024);
main._lastimagechangetime = BA.numberCast(long.class, RemoteObject.solve(new RemoteObject[] {main.__c.getField(false,"DateTime").runMethod(true,"getNow"),RemoteObject.createImmutable(1000)}, "/",0, 0));
 };
 };
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e11) {
			BA.rdebugUtils.runVoidMethod("setLastException",main.ba, e11.toString()); BA.debugLineNum = 911;BA.debugLine="Log(\"Timer error: \" & LastException.Message)";
Debug.ShouldStop(16384);
main.__c.runVoidMethod ("LogImpl","2655371",RemoteObject.concat(RemoteObject.createImmutable("Timer error: "),main.__c.runMethod(false,"LastException",main.ba).runMethod(true,"getMessage")),0);
 };
 BA.debugLineNum = 913;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _timupdate_tick() throws Exception{
try {
		Debug.PushSubsStack("timUpdate_Tick (main) ","main",0,main.ba,main.mostCurrent,896);
if (RapidSub.canDelegate("timupdate_tick")) { return b4j.example.main.remoteMe.runUserSub(false, "main","timupdate_tick");}
 BA.debugLineNum = 896;BA.debugLine="Sub timUpdate_Tick";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 897;BA.debugLine="UpdateClock";
Debug.ShouldStop(1);
_updateclock();
 BA.debugLineNum = 898;BA.debugLine="End Sub";
Debug.ShouldStop(2);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _updateclock() throws Exception{
try {
		Debug.PushSubsStack("UpdateClock (main) ","main",0,main.ba,main.mostCurrent,784);
if (RapidSub.canDelegate("updateclock")) { return b4j.example.main.remoteMe.runUserSub(false, "main","updateclock");}
RemoteObject _now = RemoteObject.createImmutable(0L);
RemoteObject _timestr = RemoteObject.createImmutable("");
RemoteObject _hour = RemoteObject.createImmutable(0);
RemoteObject _minute = RemoteObject.createImmutable(0);
RemoteObject _daynames = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _monthnames = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _dayofweek = RemoteObject.createImmutable(0);
RemoteObject _dayofmonth = RemoteObject.createImmutable(0);
RemoteObject _month = RemoteObject.createImmutable(0);
RemoteObject _year = RemoteObject.createImmutable(0);
RemoteObject _datestr = RemoteObject.createImmutable("");
RemoteObject _temp = RemoteObject.createImmutable("");
RemoteObject _hum = RemoteObject.createImmutable("");
RemoteObject _wind = RemoteObject.createImmutable("");
 BA.debugLineNum = 784;BA.debugLine="Sub UpdateClock";
Debug.ShouldStop(32768);
 BA.debugLineNum = 785;BA.debugLine="Try";
Debug.ShouldStop(65536);
try { BA.debugLineNum = 786;BA.debugLine="Dim now As Long = DateTime.Now";
Debug.ShouldStop(131072);
_now = main.__c.getField(false,"DateTime").runMethod(true,"getNow");Debug.locals.put("now", _now);Debug.locals.put("now", _now);
 BA.debugLineNum = 787;BA.debugLine="Dim timeStr As String = DateTime.Time(now)";
Debug.ShouldStop(262144);
_timestr = main.__c.getField(false,"DateTime").runMethod(true,"Time",(Object)(_now));Debug.locals.put("timeStr", _timestr);Debug.locals.put("timeStr", _timestr);
 BA.debugLineNum = 788;BA.debugLine="Dim hour As Int = DateTime.GetHour(now)";
Debug.ShouldStop(524288);
_hour = main.__c.getField(false,"DateTime").runMethod(true,"GetHour",(Object)(_now));Debug.locals.put("hour", _hour);Debug.locals.put("hour", _hour);
 BA.debugLineNum = 789;BA.debugLine="Dim minute As Int = DateTime.GetMinute(now)";
Debug.ShouldStop(1048576);
_minute = main.__c.getField(false,"DateTime").runMethod(true,"GetMinute",(Object)(_now));Debug.locals.put("minute", _minute);Debug.locals.put("minute", _minute);
 BA.debugLineNum = 791;BA.debugLine="If hour = 0 And minute = 0 Then";
Debug.ShouldStop(4194304);
if (RemoteObject.solveBoolean("=",_hour,BA.numberCast(double.class, 0)) && RemoteObject.solveBoolean("=",_minute,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 792;BA.debugLine="FetchPrayerTimes";
Debug.ShouldStop(8388608);
_fetchprayertimes();
 };
 BA.debugLineNum = 795;BA.debugLine="Dim dayNames As List = Array As String(\"sunday\",";
Debug.ShouldStop(67108864);
_daynames = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_daynames = main.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("String",new int[] {7},new Object[] {BA.ObjectToString("sunday"),BA.ObjectToString("monday"),BA.ObjectToString("tuesday"),BA.ObjectToString("wednesday"),BA.ObjectToString("thursday"),BA.ObjectToString("friday"),RemoteObject.createImmutable("saturday")})));Debug.locals.put("dayNames", _daynames);Debug.locals.put("dayNames", _daynames);
 BA.debugLineNum = 796;BA.debugLine="Dim monthNames As List = Array As String(\"januar";
Debug.ShouldStop(134217728);
_monthnames = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_monthnames = main.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("String",new int[] {12},new Object[] {BA.ObjectToString("january"),BA.ObjectToString("february"),BA.ObjectToString("march"),BA.ObjectToString("april"),BA.ObjectToString("may"),BA.ObjectToString("june"),BA.ObjectToString("july"),BA.ObjectToString("august"),BA.ObjectToString("september"),BA.ObjectToString("october"),BA.ObjectToString("november"),RemoteObject.createImmutable("december")})));Debug.locals.put("monthNames", _monthnames);Debug.locals.put("monthNames", _monthnames);
 BA.debugLineNum = 798;BA.debugLine="Dim dayOfWeek As Int = DateTime.GetDayOfWeek(now";
Debug.ShouldStop(536870912);
_dayofweek = main.__c.getField(false,"DateTime").runMethod(true,"GetDayOfWeek",(Object)(_now));Debug.locals.put("dayOfWeek", _dayofweek);Debug.locals.put("dayOfWeek", _dayofweek);
 BA.debugLineNum = 799;BA.debugLine="Dim dayOfMonth As Int = DateTime.GetDayOfMonth(n";
Debug.ShouldStop(1073741824);
_dayofmonth = main.__c.getField(false,"DateTime").runMethod(true,"GetDayOfMonth",(Object)(_now));Debug.locals.put("dayOfMonth", _dayofmonth);Debug.locals.put("dayOfMonth", _dayofmonth);
 BA.debugLineNum = 800;BA.debugLine="Dim month As Int = DateTime.GetMonth(now)";
Debug.ShouldStop(-2147483648);
_month = main.__c.getField(false,"DateTime").runMethod(true,"GetMonth",(Object)(_now));Debug.locals.put("month", _month);Debug.locals.put("month", _month);
 BA.debugLineNum = 801;BA.debugLine="Dim year As Int = DateTime.GetYear(now)";
Debug.ShouldStop(1);
_year = main.__c.getField(false,"DateTime").runMethod(true,"GetYear",(Object)(_now));Debug.locals.put("year", _year);Debug.locals.put("year", _year);
 BA.debugLineNum = 803;BA.debugLine="Dim dateStr As String";
Debug.ShouldStop(4);
_datestr = RemoteObject.createImmutable("");Debug.locals.put("dateStr", _datestr);
 BA.debugLineNum = 804;BA.debugLine="If currentLanguage = \"ar\" Then";
Debug.ShouldStop(8);
if (RemoteObject.solveBoolean("=",main._currentlanguage,BA.ObjectToString("ar"))) { 
 BA.debugLineNum = 805;BA.debugLine="dateStr = GetTranslation(dayNames.Get(dayOfWeek";
Debug.ShouldStop(16);
_datestr = RemoteObject.concat(_gettranslation(BA.ObjectToString(_daynames.runMethod(false,"Get",(Object)(_dayofweek)))),RemoteObject.createImmutable("، "),_dayofmonth,RemoteObject.createImmutable(" "),_gettranslation(BA.ObjectToString(_monthnames.runMethod(false,"Get",(Object)(RemoteObject.solve(new RemoteObject[] {_month,RemoteObject.createImmutable(1)}, "-",1, 1))))),RemoteObject.createImmutable(" "),_year);Debug.locals.put("dateStr", _datestr);
 BA.debugLineNum = 806;BA.debugLine="lblDate.Style = \"-fx-font-weight: normal; -fx-n";
Debug.ShouldStop(32);
main._lbldate.runMethod(true,"setStyle",BA.ObjectToString("-fx-font-weight: normal; -fx-node-orientation: right-to-left;"));
 }else {
 BA.debugLineNum = 808;BA.debugLine="dateStr = GetTranslation(dayNames.Get(dayOfWeek";
Debug.ShouldStop(128);
_datestr = RemoteObject.concat(_gettranslation(BA.ObjectToString(_daynames.runMethod(false,"Get",(Object)(_dayofweek)))),RemoteObject.createImmutable(", "),_gettranslation(BA.ObjectToString(_monthnames.runMethod(false,"Get",(Object)(RemoteObject.solve(new RemoteObject[] {_month,RemoteObject.createImmutable(1)}, "-",1, 1))))),RemoteObject.createImmutable(" "),_dayofmonth,RemoteObject.createImmutable(", "),_year);Debug.locals.put("dateStr", _datestr);
 BA.debugLineNum = 809;BA.debugLine="lblDate.Style = \"-fx-font-weight: normal; -fx-n";
Debug.ShouldStop(256);
main._lbldate.runMethod(true,"setStyle",BA.ObjectToString("-fx-font-weight: normal; -fx-node-orientation: left-to-right;"));
 };
 BA.debugLineNum = 812;BA.debugLine="If isAnalogMode Then";
Debug.ShouldStop(2048);
if (main._isanalogmode.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 813;BA.debugLine="DrawAnalogClock";
Debug.ShouldStop(4096);
_drawanalogclock();
 }else {
 BA.debugLineNum = 815;BA.debugLine="lblClock.Text = timeStr";
Debug.ShouldStop(16384);
main._lblclock.runMethod(true,"setText",_timestr);
 };
 BA.debugLineNum = 818;BA.debugLine="lblDate.Text = dateStr";
Debug.ShouldStop(131072);
main._lbldate.runMethod(true,"setText",_datestr);
 BA.debugLineNum = 821;BA.debugLine="If weatherData.Size > 0 Then";
Debug.ShouldStop(1048576);
if (RemoteObject.solveBoolean(">",main._weatherdata.runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 822;BA.debugLine="Dim temp As String = weatherData.GetDefault(\"te";
Debug.ShouldStop(2097152);
_temp = BA.ObjectToString(main._weatherdata.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("temperature"))),(Object)((RemoteObject.createImmutable("N/A")))));Debug.locals.put("temp", _temp);Debug.locals.put("temp", _temp);
 BA.debugLineNum = 823;BA.debugLine="Dim hum As String = weatherData.GetDefault(\"hum";
Debug.ShouldStop(4194304);
_hum = BA.ObjectToString(main._weatherdata.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("humidity"))),(Object)((RemoteObject.createImmutable("N/A")))));Debug.locals.put("hum", _hum);Debug.locals.put("hum", _hum);
 BA.debugLineNum = 824;BA.debugLine="Dim wind As String = weatherData.GetDefault(\"wi";
Debug.ShouldStop(8388608);
_wind = BA.ObjectToString(main._weatherdata.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("wind_speed"))),(Object)((RemoteObject.createImmutable("N/A")))));Debug.locals.put("wind", _wind);Debug.locals.put("wind", _wind);
 BA.debugLineNum = 826;BA.debugLine="lblTemperature.Text = temp & \"°C\"";
Debug.ShouldStop(33554432);
main._lbltemperature.runMethod(true,"setText",RemoteObject.concat(_temp,RemoteObject.createImmutable("°C")));
 BA.debugLineNum = 827;BA.debugLine="lblWeatherIcon.Text = weatherEmoji";
Debug.ShouldStop(67108864);
main._lblweathericon.runMethod(true,"setText",main._weatheremoji);
 BA.debugLineNum = 828;BA.debugLine="lblWeatherDetails.Text = cityName & CRLF & \"💧";
Debug.ShouldStop(134217728);
main._lblweatherdetails.runMethod(true,"setText",RemoteObject.concat(main._cityname,main.__c.getField(true,"CRLF"),RemoteObject.createImmutable("💧 Humidity: "),_hum,RemoteObject.createImmutable("%"),main.__c.getField(true,"CRLF"),RemoteObject.createImmutable("💨 Wind: "),_wind,RemoteObject.createImmutable(" km/h")));
 };
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e38) {
			BA.rdebugUtils.runVoidMethod("setLastException",main.ba, e38.toString()); BA.debugLineNum = 831;BA.debugLine="Log(\"Clock error: \" & LastException.Message)";
Debug.ShouldStop(1073741824);
main.__c.runVoidMethod ("LogImpl","2458799",RemoteObject.concat(RemoteObject.createImmutable("Clock error: "),main.__c.runMethod(false,"LastException",main.ba).runMethod(true,"getMessage")),0);
 };
 BA.debugLineNum = 833;BA.debugLine="End Sub";
Debug.ShouldStop(1);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}