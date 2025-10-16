package b4j.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class asclock_subs_0 {


public static RemoteObject  _base_resize(RemoteObject __ref,RemoteObject _width,RemoteObject _height) throws Exception{
try {
		Debug.PushSubsStack("Base_Resize (asclock) ","asclock",3,__ref.getField(false, "ba"),__ref,115);
if (RapidSub.canDelegate("base_resize")) { return __ref.runUserSub(false, "asclock","base_resize", __ref, _width, _height);}
Debug.locals.put("Width", _width);
Debug.locals.put("Height", _height);
 BA.debugLineNum = 115;BA.debugLine="Private Sub Base_Resize (Width As Double, Height A";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 116;BA.debugLine="xpnl_Background.SetLayoutAnimated(0,0,0,Width,Hei";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_xpnl_background" /*RemoteObject*/ ).runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(_width),(Object)(_height));
 BA.debugLineNum = 117;BA.debugLine="cv_Clock.Resize(Width, Height)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_cv_clock" /*RemoteObject*/ ).runVoidMethod ("Resize",(Object)(_width),(Object)(_height));
 BA.debugLineNum = 118;BA.debugLine="CircleRect.Initialize(mCornerWidth/2,mCornerWidth";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_circlerect" /*RemoteObject*/ ).runVoidMethod ("Initialize",(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_mcornerwidth" /*RemoteObject*/ ),RemoteObject.createImmutable(2)}, "/",0, 0))),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_mcornerwidth" /*RemoteObject*/ ),RemoteObject.createImmutable(2)}, "/",0, 0))),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_width,__ref.getField(true,"_mcornerwidth" /*RemoteObject*/ ),RemoteObject.createImmutable(2)}, "-/",1, 0))),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_height,__ref.getField(true,"_mcornerwidth" /*RemoteObject*/ ),RemoteObject.createImmutable(2)}, "-/",1, 0))));
 BA.debugLineNum = 119;BA.debugLine="Draw";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.asclock.class, "_draw" /*RemoteObject*/ );
 BA.debugLineNum = 120;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 38;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 39;BA.debugLine="Private mEventName As String 'ignore";
asclock._meventname = RemoteObject.createImmutable("");__ref.setField("_meventname",asclock._meventname);
 //BA.debugLineNum = 40;BA.debugLine="Private mCallBack As Object 'ignore";
asclock._mcallback = RemoteObject.createNew ("Object");__ref.setField("_mcallback",asclock._mcallback);
 //BA.debugLineNum = 41;BA.debugLine="Public mBase As B4XView";
asclock._mbase = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_mbase",asclock._mbase);
 //BA.debugLineNum = 42;BA.debugLine="Private xui As XUI 'ignore";
asclock._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");__ref.setField("_xui",asclock._xui);
 //BA.debugLineNum = 43;BA.debugLine="Public Tag As Object";
asclock._tag = RemoteObject.createNew ("Object");__ref.setField("_tag",asclock._tag);
 //BA.debugLineNum = 45;BA.debugLine="Private xpnl_Background As B4XView";
asclock._xpnl_background = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_xpnl_background",asclock._xpnl_background);
 //BA.debugLineNum = 46;BA.debugLine="Private cv_Clock As B4XCanvas";
asclock._cv_clock = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XCanvas");__ref.setField("_cv_clock",asclock._cv_clock);
 //BA.debugLineNum = 48;BA.debugLine="Type ASClock_MiddleTextProperties(TextColor As In";
;
 //BA.debugLineNum = 49;BA.debugLine="Private m_MiddleTextProperties As ASClock_MiddleT";
asclock._m_middletextproperties = RemoteObject.createNew ("b4j.example.asclock._asclock_middletextproperties");__ref.setField("_m_middletextproperties",asclock._m_middletextproperties);
 //BA.debugLineNum = 51;BA.debugLine="Private mInnerColor As Int";
asclock._minnercolor = RemoteObject.createImmutable(0);__ref.setField("_minnercolor",asclock._minnercolor);
 //BA.debugLineNum = 52;BA.debugLine="Private mCornerColor As Int";
asclock._mcornercolor = RemoteObject.createImmutable(0);__ref.setField("_mcornercolor",asclock._mcornercolor);
 //BA.debugLineNum = 53;BA.debugLine="Private mCornerWidth As Float";
asclock._mcornerwidth = RemoteObject.createImmutable(0f);__ref.setField("_mcornerwidth",asclock._mcornerwidth);
 //BA.debugLineNum = 54;BA.debugLine="Private mShowDialText As Boolean";
asclock._mshowdialtext = RemoteObject.createImmutable(false);__ref.setField("_mshowdialtext",asclock._mshowdialtext);
 //BA.debugLineNum = 55;BA.debugLine="Private mShowHourMark As Boolean";
asclock._mshowhourmark = RemoteObject.createImmutable(false);__ref.setField("_mshowhourmark",asclock._mshowhourmark);
 //BA.debugLineNum = 56;BA.debugLine="Private mShowMinutesMark As Boolean";
asclock._mshowminutesmark = RemoteObject.createImmutable(false);__ref.setField("_mshowminutesmark",asclock._mshowminutesmark);
 //BA.debugLineNum = 58;BA.debugLine="Private mHoursHandColor As Int";
asclock._mhourshandcolor = RemoteObject.createImmutable(0);__ref.setField("_mhourshandcolor",asclock._mhourshandcolor);
 //BA.debugLineNum = 59;BA.debugLine="Private mMinutesHandColor As Int";
asclock._mminuteshandcolor = RemoteObject.createImmutable(0);__ref.setField("_mminuteshandcolor",asclock._mminuteshandcolor);
 //BA.debugLineNum = 60;BA.debugLine="Private mSecondsHandColor As Int";
asclock._msecondshandcolor = RemoteObject.createImmutable(0);__ref.setField("_msecondshandcolor",asclock._msecondshandcolor);
 //BA.debugLineNum = 61;BA.debugLine="Private mScaleColor As Int";
asclock._mscalecolor = RemoteObject.createImmutable(0);__ref.setField("_mscalecolor",asclock._mscalecolor);
 //BA.debugLineNum = 63;BA.debugLine="Private mShowHoursHand As Boolean";
asclock._mshowhourshand = RemoteObject.createImmutable(false);__ref.setField("_mshowhourshand",asclock._mshowhourshand);
 //BA.debugLineNum = 64;BA.debugLine="Private mShowMinutesHand As Boolean";
asclock._mshowminuteshand = RemoteObject.createImmutable(false);__ref.setField("_mshowminuteshand",asclock._mshowminuteshand);
 //BA.debugLineNum = 65;BA.debugLine="Private mShowSecondsHand As Boolean";
asclock._mshowsecondshand = RemoteObject.createImmutable(false);__ref.setField("_mshowsecondshand",asclock._mshowsecondshand);
 //BA.debugLineNum = 66;BA.debugLine="Private mSweepHands As Boolean";
asclock._msweephands = RemoteObject.createImmutable(false);__ref.setField("_msweephands",asclock._msweephands);
 //BA.debugLineNum = 67;BA.debugLine="Private mClockMode As String";
asclock._mclockmode = RemoteObject.createImmutable("");__ref.setField("_mclockmode",asclock._mclockmode);
 //BA.debugLineNum = 69;BA.debugLine="Private mMiddleText As String";
asclock._mmiddletext = RemoteObject.createImmutable("");__ref.setField("_mmiddletext",asclock._mmiddletext);
 //BA.debugLineNum = 70;BA.debugLine="Private mHour,mMin,mSec As Int";
asclock._mhour = RemoteObject.createImmutable(0);__ref.setField("_mhour",asclock._mhour);
asclock._mmin = RemoteObject.createImmutable(0);__ref.setField("_mmin",asclock._mmin);
asclock._msec = RemoteObject.createImmutable(0);__ref.setField("_msec",asclock._msec);
 //BA.debugLineNum = 72;BA.debugLine="Private CircleRect As B4XRect";
asclock._circlerect = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XCanvas.B4XRect");__ref.setField("_circlerect",asclock._circlerect);
 //BA.debugLineNum = 73;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _createasclock_middletextproperties(RemoteObject __ref,RemoteObject _textcolor,RemoteObject _xfont) throws Exception{
try {
		Debug.PushSubsStack("CreateASClock_MiddleTextProperties (asclock) ","asclock",3,__ref.getField(false, "ba"),__ref,361);
if (RapidSub.canDelegate("createasclock_middletextproperties")) { return __ref.runUserSub(false, "asclock","createasclock_middletextproperties", __ref, _textcolor, _xfont);}
RemoteObject _t1 = RemoteObject.declareNull("b4j.example.asclock._asclock_middletextproperties");
Debug.locals.put("TextColor", _textcolor);
Debug.locals.put("xFont", _xfont);
 BA.debugLineNum = 361;BA.debugLine="Public Sub CreateASClock_MiddleTextProperties (Tex";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 362;BA.debugLine="Dim t1 As ASClock_MiddleTextProperties";
Debug.JustUpdateDeviceLine();
_t1 = RemoteObject.createNew ("b4j.example.asclock._asclock_middletextproperties");Debug.locals.put("t1", _t1);
 BA.debugLineNum = 363;BA.debugLine="t1.Initialize";
Debug.JustUpdateDeviceLine();
_t1.runVoidMethod ("Initialize");
 BA.debugLineNum = 364;BA.debugLine="t1.TextColor = TextColor";
Debug.JustUpdateDeviceLine();
_t1.setField ("TextColor" /*RemoteObject*/ ,_textcolor);
 BA.debugLineNum = 365;BA.debugLine="t1.xFont = xFont";
Debug.JustUpdateDeviceLine();
_t1.setField ("xFont" /*RemoteObject*/ ,_xfont);
 BA.debugLineNum = 366;BA.debugLine="Return t1";
Debug.JustUpdateDeviceLine();
if (true) return _t1;
 BA.debugLineNum = 367;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _designercreateview(RemoteObject __ref,RemoteObject _base,RemoteObject _lbl,RemoteObject _props) throws Exception{
try {
		Debug.PushSubsStack("DesignerCreateView (asclock) ","asclock",3,__ref.getField(false, "ba"),__ref,81);
if (RapidSub.canDelegate("designercreateview")) { return __ref.runUserSub(false, "asclock","designercreateview", __ref, _base, _lbl, _props);}
Debug.locals.put("Base", _base);
Debug.locals.put("Lbl", _lbl);
Debug.locals.put("Props", _props);
 BA.debugLineNum = 81;BA.debugLine="Public Sub DesignerCreateView (Base As Object, Lbl";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 82;BA.debugLine="mBase = Base";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mbase" /*RemoteObject*/ ).setObject (_base);
 BA.debugLineNum = 83;BA.debugLine="Tag = mBase.Tag";
Debug.JustUpdateDeviceLine();
__ref.setField ("_tag" /*RemoteObject*/ ,__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(false,"getTag"));
 BA.debugLineNum = 84;BA.debugLine="mBase.Tag = Me";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(false,"setTag",__ref);
 BA.debugLineNum = 86;BA.debugLine="xpnl_Background = xui.CreatePanel(\"\")";
Debug.JustUpdateDeviceLine();
__ref.setField ("_xpnl_background" /*RemoteObject*/ ,__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreatePanel",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable(""))));
 BA.debugLineNum = 87;BA.debugLine="mBase.AddView(xpnl_Background,0,0,1dip,1dip)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mbase" /*RemoteObject*/ ).runVoidMethod ("AddView",(Object)((__ref.getField(false,"_xpnl_background" /*RemoteObject*/ ).getObject())),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, asclock.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 1))))),(Object)(BA.numberCast(double.class, asclock.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 1))))));
 BA.debugLineNum = 88;BA.debugLine="cv_Clock.Initialize(xpnl_Background)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_cv_clock" /*RemoteObject*/ ).runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_xpnl_background" /*RemoteObject*/ )));
 BA.debugLineNum = 90;BA.debugLine="mInnerColor = xui.PaintOrColorToColor(Props.Get(\"";
Debug.JustUpdateDeviceLine();
__ref.setField ("_minnercolor" /*RemoteObject*/ ,__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"PaintOrColorToColor",(Object)(_props.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("InnerColor")))))));
 BA.debugLineNum = 91;BA.debugLine="mCornerColor = xui.PaintOrColorToColor(Props.Get(";
Debug.JustUpdateDeviceLine();
__ref.setField ("_mcornercolor" /*RemoteObject*/ ,__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"PaintOrColorToColor",(Object)(_props.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("CornerColor")))))));
 BA.debugLineNum = 93;BA.debugLine="mHoursHandColor = xui.PaintOrColorToColor(Props.G";
Debug.JustUpdateDeviceLine();
__ref.setField ("_mhourshandcolor" /*RemoteObject*/ ,__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"PaintOrColorToColor",(Object)(_props.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("HoursHandColor")))))));
 BA.debugLineNum = 94;BA.debugLine="mMinutesHandColor = xui.PaintOrColorToColor(Props";
Debug.JustUpdateDeviceLine();
__ref.setField ("_mminuteshandcolor" /*RemoteObject*/ ,__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"PaintOrColorToColor",(Object)(_props.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("MinutesHandColor")))))));
 BA.debugLineNum = 95;BA.debugLine="mSecondsHandColor = xui.PaintOrColorToColor(Props";
Debug.JustUpdateDeviceLine();
__ref.setField ("_msecondshandcolor" /*RemoteObject*/ ,__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"PaintOrColorToColor",(Object)(_props.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("SecondsHandColor")))))));
 BA.debugLineNum = 96;BA.debugLine="mScaleColor = xui.PaintOrColorToColor(Props.GetDe";
Debug.JustUpdateDeviceLine();
__ref.setField ("_mscalecolor" /*RemoteObject*/ ,__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"PaintOrColorToColor",(Object)(_props.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("ScaleColor"))),(Object)((__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_White")))))));
 BA.debugLineNum = 98;BA.debugLine="mCornerWidth = DipToCurrent(Props.Get(\"CornerWidt";
Debug.JustUpdateDeviceLine();
__ref.setField ("_mcornerwidth" /*RemoteObject*/ ,BA.numberCast(float.class, asclock.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, _props.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("CornerWidth")))))))));
 BA.debugLineNum = 99;BA.debugLine="mShowDialText = Props.Get(\"ShowDialText\")";
Debug.JustUpdateDeviceLine();
__ref.setField ("_mshowdialtext" /*RemoteObject*/ ,BA.ObjectToBoolean(_props.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("ShowDialText"))))));
 BA.debugLineNum = 100;BA.debugLine="mShowHourMark = Props.Get(\"ShowHourMark\")";
Debug.JustUpdateDeviceLine();
__ref.setField ("_mshowhourmark" /*RemoteObject*/ ,BA.ObjectToBoolean(_props.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("ShowHourMark"))))));
 BA.debugLineNum = 101;BA.debugLine="mShowMinutesMark = Props.Get(\"ShowMinutesMark\")";
Debug.JustUpdateDeviceLine();
__ref.setField ("_mshowminutesmark" /*RemoteObject*/ ,BA.ObjectToBoolean(_props.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("ShowMinutesMark"))))));
 BA.debugLineNum = 102;BA.debugLine="mSweepHands = Props.GetDefault(\"SweepHands\",False";
Debug.JustUpdateDeviceLine();
__ref.setField ("_msweephands" /*RemoteObject*/ ,BA.ObjectToBoolean(_props.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("SweepHands"))),(Object)((asclock.__c.getField(true,"False"))))));
 BA.debugLineNum = 104;BA.debugLine="mShowHoursHand = Props.Get(\"ShowHoursHand\")";
Debug.JustUpdateDeviceLine();
__ref.setField ("_mshowhourshand" /*RemoteObject*/ ,BA.ObjectToBoolean(_props.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("ShowHoursHand"))))));
 BA.debugLineNum = 105;BA.debugLine="mShowMinutesHand = Props.Get(\"ShowMinutesHand\")";
Debug.JustUpdateDeviceLine();
__ref.setField ("_mshowminuteshand" /*RemoteObject*/ ,BA.ObjectToBoolean(_props.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("ShowMinutesHand"))))));
 BA.debugLineNum = 106;BA.debugLine="mShowSecondsHand = Props.Get(\"ShowSecondsHand\")";
Debug.JustUpdateDeviceLine();
__ref.setField ("_mshowsecondshand" /*RemoteObject*/ ,BA.ObjectToBoolean(_props.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("ShowSecondsHand"))))));
 BA.debugLineNum = 108;BA.debugLine="mClockMode = Props.GetDefault(\"ClockMode\",12)";
Debug.JustUpdateDeviceLine();
__ref.setField ("_mclockmode" /*RemoteObject*/ ,BA.ObjectToString(_props.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("ClockMode"))),(Object)(RemoteObject.createImmutable((12))))));
 BA.debugLineNum = 110;BA.debugLine="m_MiddleTextProperties = CreateASClock_MiddleText";
Debug.JustUpdateDeviceLine();
__ref.setField ("_m_middletextproperties" /*RemoteObject*/ ,__ref.runClassMethod (b4j.example.asclock.class, "_createasclock_middletextproperties" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_White")),(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreateDefaultFont",(Object)(BA.numberCast(float.class, 60))))));
 BA.debugLineNum = 112;BA.debugLine="Base_Resize(mBase.Width,mBase.Height)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.asclock.class, "_base_resize" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getWidth")),(Object)(__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getHeight")));
 BA.debugLineNum = 113;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _draw(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Draw (asclock) ","asclock",3,__ref.getField(false, "ba"),__ref,122);
if (RapidSub.canDelegate("draw")) { return __ref.runUserSub(false, "asclock","draw", __ref);}
RemoteObject _clock_radius = RemoteObject.createImmutable(0f);
RemoteObject _clockmode = RemoteObject.createImmutable(0);
RemoteObject _midnight = RemoteObject.createImmutable(0);
RemoteObject _counter = RemoteObject.createImmutable(0);
int _angle = 0;
RemoteObject _x = RemoteObject.createImmutable(0f);
RemoteObject _y = RemoteObject.createImmutable(0f);
RemoteObject _x2 = RemoteObject.createImmutable(0f);
RemoteObject _y2 = RemoteObject.createImmutable(0f);
RemoteObject _r = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XCanvas.B4XRect");
RemoteObject _baseline = RemoteObject.createImmutable(0);
 BA.debugLineNum = 122;BA.debugLine="Public Sub Draw";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 124;BA.debugLine="cv_Clock.ClearRect(cv_Clock.TargetRect)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_cv_clock" /*RemoteObject*/ ).runVoidMethod ("ClearRect",(Object)(__ref.getField(false,"_cv_clock" /*RemoteObject*/ ).runMethod(false,"getTargetRect")));
 BA.debugLineNum = 126;BA.debugLine="mBase.SetColorAndBorder(mInnerColor,mCornerWidth,";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mbase" /*RemoteObject*/ ).runVoidMethod ("SetColorAndBorder",(Object)(__ref.getField(true,"_minnercolor" /*RemoteObject*/ )),(Object)(BA.numberCast(double.class, __ref.getField(true,"_mcornerwidth" /*RemoteObject*/ ))),(Object)(__ref.getField(true,"_mcornercolor" /*RemoteObject*/ )),(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getHeight"),RemoteObject.createImmutable(2)}, "/",0, 0)));
 BA.debugLineNum = 128;BA.debugLine="Dim Clock_Radius As Float = CircleRect.Width / 2";
Debug.JustUpdateDeviceLine();
_clock_radius = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_circlerect" /*RemoteObject*/ ).runMethod(true,"getWidth"),RemoteObject.createImmutable(2),__ref.getField(true,"_mcornerwidth" /*RemoteObject*/ )}, "/-",1, 0));Debug.locals.put("Clock_Radius", _clock_radius);Debug.locals.put("Clock_Radius", _clock_radius);
 BA.debugLineNum = 130;BA.debugLine="Dim ClockMode As Int = IIf(mClockMode <> \"SleepDu";
Debug.JustUpdateDeviceLine();
_clockmode = BA.numberCast(int.class, ((RemoteObject.solveBoolean("!",__ref.getField(true,"_mclockmode" /*RemoteObject*/ ),BA.ObjectToString("SleepDuration"))) ? ((__ref.getField(true,"_mclockmode" /*RemoteObject*/ ))) : (RemoteObject.createImmutable((24)))));Debug.locals.put("ClockMode", _clockmode);Debug.locals.put("ClockMode", _clockmode);
 BA.debugLineNum = 133;BA.debugLine="Dim midnight = 270 As Int";
Debug.JustUpdateDeviceLine();
_midnight = BA.numberCast(int.class, 270);Debug.locals.put("midnight", _midnight);Debug.locals.put("midnight", _midnight);
 BA.debugLineNum = 134;BA.debugLine="Dim Counter As Int = -1";
Debug.JustUpdateDeviceLine();
_counter = BA.numberCast(int.class, -(double) (0 + 1));Debug.locals.put("Counter", _counter);Debug.locals.put("Counter", _counter);
 BA.debugLineNum = 135;BA.debugLine="For angle = midnight To (midnight + 360) Step (36";
Debug.JustUpdateDeviceLine();
{
final int step7 = (int) (0 + (RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(360),_clockmode}, "/",0, 0)).<Double>get().doubleValue());
final int limit7 = (RemoteObject.solve(new RemoteObject[] {_midnight,RemoteObject.createImmutable(360)}, "+",1, 1)).<Integer>get().intValue();
_angle = _midnight.<Integer>get().intValue() ;
for (;(step7 > 0 && _angle <= limit7) || (step7 < 0 && _angle >= limit7) ;_angle = ((int)(0 + _angle + step7))  ) {
Debug.locals.put("angle", _angle);
 BA.debugLineNum = 136;BA.debugLine="Counter = Counter +1";
Debug.JustUpdateDeviceLine();
_counter = RemoteObject.solve(new RemoteObject[] {_counter,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("Counter", _counter);
 BA.debugLineNum = 137;BA.debugLine="Dim x = (CosD(angle) * Clock_Radius * 0.95) + mB";
Debug.JustUpdateDeviceLine();
_x = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {asclock.__c.runMethod(true,"CosD",(Object)(BA.numberCast(double.class, _angle))),_clock_radius,RemoteObject.createImmutable(0.95)}, "**",0, 0)),__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getWidth"),RemoteObject.createImmutable(2)}, "+/",1, 0));Debug.locals.put("x", _x);Debug.locals.put("x", _x);
 BA.debugLineNum = 138;BA.debugLine="Dim y = (SinD(angle) * Clock_Radius * 0.95) + mB";
Debug.JustUpdateDeviceLine();
_y = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {asclock.__c.runMethod(true,"SinD",(Object)(BA.numberCast(double.class, _angle))),_clock_radius,RemoteObject.createImmutable(0.95)}, "**",0, 0)),__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getHeight"),RemoteObject.createImmutable(2)}, "+/",1, 0));Debug.locals.put("y", _y);Debug.locals.put("y", _y);
 BA.debugLineNum = 141;BA.debugLine="Dim x2 = (CosD(angle) * Clock_Radius * 1) + mBas";
Debug.JustUpdateDeviceLine();
_x2 = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {asclock.__c.runMethod(true,"CosD",(Object)(BA.numberCast(double.class, _angle))),_clock_radius,RemoteObject.createImmutable(1)}, "**",0, 0)),__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getWidth"),RemoteObject.createImmutable(2)}, "+/",1, 0));Debug.locals.put("x2", _x2);Debug.locals.put("x2", _x2);
 BA.debugLineNum = 142;BA.debugLine="Dim y2 = (SinD(angle) * Clock_Radius * 1) + mBas";
Debug.JustUpdateDeviceLine();
_y2 = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {asclock.__c.runMethod(true,"SinD",(Object)(BA.numberCast(double.class, _angle))),_clock_radius,RemoteObject.createImmutable(1)}, "**",0, 0)),__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getHeight"),RemoteObject.createImmutable(2)}, "+/",1, 0));Debug.locals.put("y2", _y2);Debug.locals.put("y2", _y2);
 BA.debugLineNum = 144;BA.debugLine="If mShowHourMark = True Then cv_Clock.DrawLine(x";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_mshowhourmark" /*RemoteObject*/ ),asclock.__c.getField(true,"True"))) { 
__ref.getField(false,"_cv_clock" /*RemoteObject*/ ).runVoidMethod ("DrawLine",(Object)(_x),(Object)(_y),(Object)(_x2),(Object)(_y2),(Object)(__ref.getField(true,"_mscalecolor" /*RemoteObject*/ )),(Object)(BA.numberCast(float.class, asclock.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 2))))));};
 BA.debugLineNum = 146;BA.debugLine="If mShowDialText = True Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_mshowdialtext" /*RemoteObject*/ ),asclock.__c.getField(true,"True"))) { 
 BA.debugLineNum = 148;BA.debugLine="If Counter < (ClockMode+1) And Counter <> 0 The";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("<",_counter,BA.numberCast(double.class, (RemoteObject.solve(new RemoteObject[] {_clockmode,RemoteObject.createImmutable(1)}, "+",1, 1)))) && RemoteObject.solveBoolean("!",_counter,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 149;BA.debugLine="x = (CosD(angle) * Clock_Radius * 0.85) + mBas";
Debug.JustUpdateDeviceLine();
_x = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {asclock.__c.runMethod(true,"CosD",(Object)(BA.numberCast(double.class, _angle))),_clock_radius,RemoteObject.createImmutable(0.85)}, "**",0, 0)),__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getWidth"),RemoteObject.createImmutable(2)}, "+/",1, 0));Debug.locals.put("x", _x);
 BA.debugLineNum = 150;BA.debugLine="y = (SinD(angle) * Clock_Radius * 0.85) + mBas";
Debug.JustUpdateDeviceLine();
_y = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {asclock.__c.runMethod(true,"SinD",(Object)(BA.numberCast(double.class, _angle))),_clock_radius,RemoteObject.createImmutable(0.85)}, "**",0, 0)),__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getHeight"),RemoteObject.createImmutable(2)}, "+/",1, 0));Debug.locals.put("y", _y);
 BA.debugLineNum = 152;BA.debugLine="y = y + (MeasureTextHeight(Counter,xui.CreateD";
Debug.JustUpdateDeviceLine();
_y = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_y,(RemoteObject.solve(new RemoteObject[] {__ref.runClassMethod (b4j.example.asclock.class, "_measuretextheight" /*RemoteObject*/ ,(Object)(BA.NumberToString(_counter)),(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreateDefaultBoldFont",(Object)(BA.numberCast(float.class, 12))))),RemoteObject.createImmutable(4)}, "/",0, 0))}, "+",1, 0));Debug.locals.put("y", _y);
 BA.debugLineNum = 154;BA.debugLine="If Counter = 24 And mClockMode = \"SleepDuratio";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_counter,BA.numberCast(double.class, 24)) && RemoteObject.solveBoolean("=",__ref.getField(true,"_mclockmode" /*RemoteObject*/ ),BA.ObjectToString("SleepDuration"))) { 
 BA.debugLineNum = 155;BA.debugLine="cv_Clock.DrawText(0,x,y,xui.CreateDefaultBol";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_cv_clock" /*RemoteObject*/ ).runVoidMethod ("DrawText",(Object)(BA.NumberToString(0)),(Object)(BA.numberCast(double.class, _x)),(Object)(BA.numberCast(double.class, _y)),(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreateDefaultBoldFont",(Object)(BA.numberCast(float.class, 12)))),(Object)(__ref.getField(true,"_mscalecolor" /*RemoteObject*/ )),(Object)(BA.getEnumFromString(BA.getDeviceClass("javafx.scene.text.TextAlignment"),RemoteObject.createImmutable("CENTER"))));
 }else 
{ BA.debugLineNum = 156;BA.debugLine="else if mClockMode = \"SleepDuration\" Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_mclockmode" /*RemoteObject*/ ),BA.ObjectToString("SleepDuration"))) { 
 BA.debugLineNum = 157;BA.debugLine="If Counter Mod 3 = 0 Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",RemoteObject.solve(new RemoteObject[] {_counter,RemoteObject.createImmutable(3)}, "%",0, 1),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 158;BA.debugLine="cv_Clock.DrawText(Counter,x,y,xui.CreateDefa";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_cv_clock" /*RemoteObject*/ ).runVoidMethod ("DrawText",(Object)(BA.NumberToString(_counter)),(Object)(BA.numberCast(double.class, _x)),(Object)(BA.numberCast(double.class, _y)),(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreateDefaultBoldFont",(Object)(BA.numberCast(float.class, 12)))),(Object)(__ref.getField(true,"_mscalecolor" /*RemoteObject*/ )),(Object)(BA.getEnumFromString(BA.getDeviceClass("javafx.scene.text.TextAlignment"),RemoteObject.createImmutable("CENTER"))));
 };
 }else {
 BA.debugLineNum = 161;BA.debugLine="cv_Clock.DrawText(Counter,x,y,xui.CreateDefau";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_cv_clock" /*RemoteObject*/ ).runVoidMethod ("DrawText",(Object)(BA.NumberToString(_counter)),(Object)(BA.numberCast(double.class, _x)),(Object)(BA.numberCast(double.class, _y)),(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreateDefaultBoldFont",(Object)(BA.numberCast(float.class, 12)))),(Object)(__ref.getField(true,"_mscalecolor" /*RemoteObject*/ )),(Object)(BA.getEnumFromString(BA.getDeviceClass("javafx.scene.text.TextAlignment"),RemoteObject.createImmutable("CENTER"))));
 }}
;
 };
 };
 }
}Debug.locals.put("angle", _angle);
;
 BA.debugLineNum = 169;BA.debugLine="If mShowMinutesMark = True Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_mshowminutesmark" /*RemoteObject*/ ),asclock.__c.getField(true,"True"))) { 
 BA.debugLineNum = 170;BA.debugLine="Dim midnight = 270 As Int";
Debug.JustUpdateDeviceLine();
_midnight = BA.numberCast(int.class, 270);Debug.locals.put("midnight", _midnight);Debug.locals.put("midnight", _midnight);
 BA.debugLineNum = 171;BA.debugLine="For angle = midnight To (midnight + 360) Step (3";
Debug.JustUpdateDeviceLine();
{
final int step33 = (int) (0 + (RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(360),BA.numberCast(double.class, ((RemoteObject.solveBoolean("=",_clockmode,BA.numberCast(double.class, 12))) ? (RemoteObject.createImmutable((60))) : (RemoteObject.createImmutable((120)))))}, "/",0, 0)).<Double>get().doubleValue());
final int limit33 = (RemoteObject.solve(new RemoteObject[] {_midnight,RemoteObject.createImmutable(360)}, "+",1, 1)).<Integer>get().intValue();
_angle = _midnight.<Integer>get().intValue() ;
for (;(step33 > 0 && _angle <= limit33) || (step33 < 0 && _angle >= limit33) ;_angle = ((int)(0 + _angle + step33))  ) {
Debug.locals.put("angle", _angle);
 BA.debugLineNum = 172;BA.debugLine="Dim x = (CosD(angle) * Clock_Radius * 0.98) + m";
Debug.JustUpdateDeviceLine();
_x = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {asclock.__c.runMethod(true,"CosD",(Object)(BA.numberCast(double.class, _angle))),_clock_radius,RemoteObject.createImmutable(0.98)}, "**",0, 0)),__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getWidth"),RemoteObject.createImmutable(2)}, "+/",1, 0));Debug.locals.put("x", _x);Debug.locals.put("x", _x);
 BA.debugLineNum = 173;BA.debugLine="Dim y = (SinD(angle) * Clock_Radius * 0.98) + m";
Debug.JustUpdateDeviceLine();
_y = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {asclock.__c.runMethod(true,"SinD",(Object)(BA.numberCast(double.class, _angle))),_clock_radius,RemoteObject.createImmutable(0.98)}, "**",0, 0)),__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getHeight"),RemoteObject.createImmutable(2)}, "+/",1, 0));Debug.locals.put("y", _y);Debug.locals.put("y", _y);
 BA.debugLineNum = 176;BA.debugLine="Dim x2 = (CosD(angle) * Clock_Radius * 1) + mBa";
Debug.JustUpdateDeviceLine();
_x2 = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {asclock.__c.runMethod(true,"CosD",(Object)(BA.numberCast(double.class, _angle))),_clock_radius,RemoteObject.createImmutable(1)}, "**",0, 0)),__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getWidth"),RemoteObject.createImmutable(2)}, "+/",1, 0));Debug.locals.put("x2", _x2);Debug.locals.put("x2", _x2);
 BA.debugLineNum = 177;BA.debugLine="Dim y2 = (SinD(angle) * Clock_Radius * 1) + mBa";
Debug.JustUpdateDeviceLine();
_y2 = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {asclock.__c.runMethod(true,"SinD",(Object)(BA.numberCast(double.class, _angle))),_clock_radius,RemoteObject.createImmutable(1)}, "**",0, 0)),__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getHeight"),RemoteObject.createImmutable(2)}, "+/",1, 0));Debug.locals.put("y2", _y2);Debug.locals.put("y2", _y2);
 BA.debugLineNum = 179;BA.debugLine="cv_Clock.DrawLine(x,y,x2,y2,mScaleColor,2dip)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_cv_clock" /*RemoteObject*/ ).runVoidMethod ("DrawLine",(Object)(_x),(Object)(_y),(Object)(_x2),(Object)(_y2),(Object)(__ref.getField(true,"_mscalecolor" /*RemoteObject*/ )),(Object)(BA.numberCast(float.class, asclock.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 2))))));
 }
}Debug.locals.put("angle", _angle);
;
 };
 BA.debugLineNum = 183;BA.debugLine="Dim r As B4XRect = cv_Clock.MeasureText(Counter,m";
Debug.JustUpdateDeviceLine();
_r = __ref.getField(false,"_cv_clock" /*RemoteObject*/ ).runMethod(false,"MeasureText",(Object)(BA.NumberToString(_counter)),(Object)(__ref.getField(false,"_m_middletextproperties" /*RemoteObject*/ ).getField(false,"xFont" /*RemoteObject*/ )));Debug.locals.put("r", _r);Debug.locals.put("r", _r);
 BA.debugLineNum = 184;BA.debugLine="Dim BaseLine As Int = mBase.Height/2 - r.Height /";
Debug.JustUpdateDeviceLine();
_baseline = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getHeight"),RemoteObject.createImmutable(2),_r.runMethod(true,"getHeight"),RemoteObject.createImmutable(2),_r.runMethod(true,"getTop")}, "/-/-",2, 0));Debug.locals.put("BaseLine", _baseline);Debug.locals.put("BaseLine", _baseline);
 BA.debugLineNum = 186;BA.debugLine="cv_Clock.DrawText(mMiddleText,mBase.Width/2 ,Base";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_cv_clock" /*RemoteObject*/ ).runVoidMethod ("DrawText",(Object)(__ref.getField(true,"_mmiddletext" /*RemoteObject*/ )),(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getWidth"),RemoteObject.createImmutable(2)}, "/",0, 0)),(Object)(BA.numberCast(double.class, _baseline)),(Object)(__ref.getField(false,"_m_middletextproperties" /*RemoteObject*/ ).getField(false,"xFont" /*RemoteObject*/ )),(Object)(__ref.getField(false,"_m_middletextproperties" /*RemoteObject*/ ).getField(true,"TextColor" /*RemoteObject*/ )),(Object)(BA.getEnumFromString(BA.getDeviceClass("javafx.scene.text.TextAlignment"),RemoteObject.createImmutable("CENTER"))));
 BA.debugLineNum = 188;BA.debugLine="DrawPointer";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.asclock.class, "_drawpointer" /*RemoteObject*/ );
 BA.debugLineNum = 190;BA.debugLine="cv_Clock.Invalidate";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_cv_clock" /*RemoteObject*/ ).runVoidMethod ("Invalidate");
 BA.debugLineNum = 192;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _drawpointer(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("DrawPointer (asclock) ","asclock",3,__ref.getField(false, "ba"),__ref,194);
if (RapidSub.canDelegate("drawpointer")) { return __ref.runUserSub(false, "asclock","drawpointer", __ref);}
RemoteObject _hour_x = RemoteObject.createImmutable(0f);
RemoteObject _hour_y = RemoteObject.createImmutable(0f);
RemoteObject _mins_x = RemoteObject.createImmutable(0f);
RemoteObject _mins_y = RemoteObject.createImmutable(0f);
RemoteObject _secs_x = RemoteObject.createImmutable(0f);
RemoteObject _secs_y = RemoteObject.createImmutable(0f);
RemoteObject _hour_angle = RemoteObject.createImmutable(0f);
RemoteObject _mins_angle = RemoteObject.createImmutable(0f);
RemoteObject _secs_angle = RemoteObject.createImmutable(0f);
RemoteObject _clock_radius = RemoteObject.createImmutable(0f);
RemoteObject _clockmode = RemoteObject.createImmutable(0);
RemoteObject _clock_x = RemoteObject.createImmutable(0f);
RemoteObject _clock_y = RemoteObject.createImmutable(0f);
 BA.debugLineNum = 194;BA.debugLine="Private Sub DrawPointer";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 197;BA.debugLine="If mShowHoursHand = False And mShowMinutesHand =";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_mshowhourshand" /*RemoteObject*/ ),asclock.__c.getField(true,"False")) && RemoteObject.solveBoolean("=",__ref.getField(true,"_mshowminuteshand" /*RemoteObject*/ ),asclock.__c.getField(true,"False")) && RemoteObject.solveBoolean("=",__ref.getField(true,"_mshowsecondshand" /*RemoteObject*/ ),asclock.__c.getField(true,"False"))) { 
if (true) return RemoteObject.createImmutable("");};
 BA.debugLineNum = 199;BA.debugLine="Dim Hour_X, Hour_Y, Mins_X, Mins_Y, Secs_X, Secs_";
Debug.JustUpdateDeviceLine();
_hour_x = RemoteObject.createImmutable(0f);Debug.locals.put("Hour_X", _hour_x);
_hour_y = RemoteObject.createImmutable(0f);Debug.locals.put("Hour_Y", _hour_y);
_mins_x = RemoteObject.createImmutable(0f);Debug.locals.put("Mins_X", _mins_x);
_mins_y = RemoteObject.createImmutable(0f);Debug.locals.put("Mins_Y", _mins_y);
_secs_x = RemoteObject.createImmutable(0f);Debug.locals.put("Secs_X", _secs_x);
_secs_y = RemoteObject.createImmutable(0f);Debug.locals.put("Secs_Y", _secs_y);
 BA.debugLineNum = 200;BA.debugLine="Dim Hour_Angle, Mins_Angle, Secs_Angle As Float";
Debug.JustUpdateDeviceLine();
_hour_angle = RemoteObject.createImmutable(0f);Debug.locals.put("Hour_Angle", _hour_angle);
_mins_angle = RemoteObject.createImmutable(0f);Debug.locals.put("Mins_Angle", _mins_angle);
_secs_angle = RemoteObject.createImmutable(0f);Debug.locals.put("Secs_Angle", _secs_angle);
 BA.debugLineNum = 201;BA.debugLine="Dim Clock_Radius As Float = CircleRect.Width / 2";
Debug.JustUpdateDeviceLine();
_clock_radius = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_circlerect" /*RemoteObject*/ ).runMethod(true,"getWidth"),RemoteObject.createImmutable(2),__ref.getField(true,"_mcornerwidth" /*RemoteObject*/ )}, "/-",1, 0));Debug.locals.put("Clock_Radius", _clock_radius);Debug.locals.put("Clock_Radius", _clock_radius);
 BA.debugLineNum = 206;BA.debugLine="Secs_Angle = 270 + (mSec * 360 / 60)";
Debug.JustUpdateDeviceLine();
_secs_angle = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(270),(RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_msec" /*RemoteObject*/ ),RemoteObject.createImmutable(360),RemoteObject.createImmutable(60)}, "*/",0, 0))}, "+",1, 0));Debug.locals.put("Secs_Angle", _secs_angle);
 BA.debugLineNum = 208;BA.debugLine="Dim ClockMode As Int = IIf(mClockMode <> \"SleepDu";
Debug.JustUpdateDeviceLine();
_clockmode = BA.numberCast(int.class, ((RemoteObject.solveBoolean("!",__ref.getField(true,"_mclockmode" /*RemoteObject*/ ),BA.ObjectToString("SleepDuration"))) ? ((__ref.getField(true,"_mclockmode" /*RemoteObject*/ ))) : (RemoteObject.createImmutable((12)))));Debug.locals.put("ClockMode", _clockmode);Debug.locals.put("ClockMode", _clockmode);
 BA.debugLineNum = 210;BA.debugLine="If mSweepHands = True Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_msweephands" /*RemoteObject*/ ),asclock.__c.getField(true,"True"))) { 
 BA.debugLineNum = 211;BA.debugLine="Mins_Angle = 270 + (mMin * 360 / IIf(ClockMode =";
Debug.JustUpdateDeviceLine();
_mins_angle = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(270),(RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_mmin" /*RemoteObject*/ ),RemoteObject.createImmutable(360),BA.numberCast(double.class, ((RemoteObject.solveBoolean("=",_clockmode,BA.numberCast(double.class, 12))) ? (RemoteObject.createImmutable((60))) : (RemoteObject.createImmutable((120)))))}, "*/",0, 0)),(RemoteObject.solve(new RemoteObject[] {_secs_angle,RemoteObject.createImmutable(270)}, "-",1, 0)),RemoteObject.createImmutable(60)}, "++/",2, 0));Debug.locals.put("Mins_Angle", _mins_angle);
 BA.debugLineNum = 212;BA.debugLine="Hour_Angle = 270 + (mHour * 360 / ClockMode) + (";
Debug.JustUpdateDeviceLine();
_hour_angle = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(270),(RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_mhour" /*RemoteObject*/ ),RemoteObject.createImmutable(360),_clockmode}, "*/",0, 0)),(RemoteObject.solve(new RemoteObject[] {_mins_angle,RemoteObject.createImmutable(270)}, "-",1, 0)),BA.numberCast(double.class, ((RemoteObject.solveBoolean("=",_clockmode,BA.numberCast(double.class, 12))) ? (RemoteObject.createImmutable((60))) : (RemoteObject.createImmutable((120)))))}, "++/",2, 0));Debug.locals.put("Hour_Angle", _hour_angle);
 }else {
 BA.debugLineNum = 214;BA.debugLine="Mins_Angle = 270 + (mMin * 360 / 60)";
Debug.JustUpdateDeviceLine();
_mins_angle = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(270),(RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_mmin" /*RemoteObject*/ ),RemoteObject.createImmutable(360),RemoteObject.createImmutable(60)}, "*/",0, 0))}, "+",1, 0));Debug.locals.put("Mins_Angle", _mins_angle);
 BA.debugLineNum = 215;BA.debugLine="Hour_Angle = 270 + (mHour * 360 / ClockMode)";
Debug.JustUpdateDeviceLine();
_hour_angle = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(270),(RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_mhour" /*RemoteObject*/ ),RemoteObject.createImmutable(360),_clockmode}, "*/",0, 0))}, "+",1, 0));Debug.locals.put("Hour_Angle", _hour_angle);
 };
 BA.debugLineNum = 218;BA.debugLine="Dim Clock_X As Float = mBase.Width/2";
Debug.JustUpdateDeviceLine();
_clock_x = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getWidth"),RemoteObject.createImmutable(2)}, "/",0, 0));Debug.locals.put("Clock_X", _clock_x);Debug.locals.put("Clock_X", _clock_x);
 BA.debugLineNum = 219;BA.debugLine="Dim Clock_Y As Float = mBase.Height/2";
Debug.JustUpdateDeviceLine();
_clock_y = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getHeight"),RemoteObject.createImmutable(2)}, "/",0, 0));Debug.locals.put("Clock_Y", _clock_y);Debug.locals.put("Clock_Y", _clock_y);
 BA.debugLineNum = 222;BA.debugLine="Hour_X = (CosD(Hour_Angle) * Clock_Radius * 0.65)";
Debug.JustUpdateDeviceLine();
_hour_x = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {asclock.__c.runMethod(true,"CosD",(Object)(BA.numberCast(double.class, _hour_angle))),_clock_radius,RemoteObject.createImmutable(0.65)}, "**",0, 0)),_clock_x}, "+",1, 0));Debug.locals.put("Hour_X", _hour_x);
 BA.debugLineNum = 223;BA.debugLine="Hour_Y = (SinD(Hour_Angle) * Clock_Radius * 0.65)";
Debug.JustUpdateDeviceLine();
_hour_y = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {asclock.__c.runMethod(true,"SinD",(Object)(BA.numberCast(double.class, _hour_angle))),_clock_radius,RemoteObject.createImmutable(0.65)}, "**",0, 0)),_clock_y}, "+",1, 0));Debug.locals.put("Hour_Y", _hour_y);
 BA.debugLineNum = 225;BA.debugLine="Mins_X = (CosD(Mins_Angle) * Clock_Radius * 0.80)";
Debug.JustUpdateDeviceLine();
_mins_x = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {asclock.__c.runMethod(true,"CosD",(Object)(BA.numberCast(double.class, _mins_angle))),_clock_radius,RemoteObject.createImmutable(0.80)}, "**",0, 0)),_clock_x}, "+",1, 0));Debug.locals.put("Mins_X", _mins_x);
 BA.debugLineNum = 226;BA.debugLine="Mins_Y = (SinD(Mins_Angle) * Clock_Radius * 0.80)";
Debug.JustUpdateDeviceLine();
_mins_y = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {asclock.__c.runMethod(true,"SinD",(Object)(BA.numberCast(double.class, _mins_angle))),_clock_radius,RemoteObject.createImmutable(0.80)}, "**",0, 0)),_clock_y}, "+",1, 0));Debug.locals.put("Mins_Y", _mins_y);
 BA.debugLineNum = 228;BA.debugLine="Secs_X = (CosD(Secs_Angle) * Clock_Radius * 0.80)";
Debug.JustUpdateDeviceLine();
_secs_x = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {asclock.__c.runMethod(true,"CosD",(Object)(BA.numberCast(double.class, _secs_angle))),_clock_radius,RemoteObject.createImmutable(0.80)}, "**",0, 0)),_clock_x}, "+",1, 0));Debug.locals.put("Secs_X", _secs_x);
 BA.debugLineNum = 229;BA.debugLine="Secs_Y = (SinD(Secs_Angle) * Clock_Radius * 0.80)";
Debug.JustUpdateDeviceLine();
_secs_y = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {asclock.__c.runMethod(true,"SinD",(Object)(BA.numberCast(double.class, _secs_angle))),_clock_radius,RemoteObject.createImmutable(0.80)}, "**",0, 0)),_clock_y}, "+",1, 0));Debug.locals.put("Secs_Y", _secs_y);
 BA.debugLineNum = 232;BA.debugLine="If mShowHoursHand = True Then cv_Clock.DrawLine(C";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_mshowhourshand" /*RemoteObject*/ ),asclock.__c.getField(true,"True"))) { 
__ref.getField(false,"_cv_clock" /*RemoteObject*/ ).runVoidMethod ("DrawLine",(Object)(_clock_x),(Object)(_clock_y),(Object)(_hour_x),(Object)(_hour_y),(Object)(__ref.getField(true,"_mhourshandcolor" /*RemoteObject*/ )),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_clock_radius,RemoteObject.createImmutable(0.03)}, "*",0, 0))));};
 BA.debugLineNum = 233;BA.debugLine="If mShowMinutesHand = True Then cv_Clock.DrawLine";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_mshowminuteshand" /*RemoteObject*/ ),asclock.__c.getField(true,"True"))) { 
__ref.getField(false,"_cv_clock" /*RemoteObject*/ ).runVoidMethod ("DrawLine",(Object)(_clock_x),(Object)(_clock_y),(Object)(_mins_x),(Object)(_mins_y),(Object)(__ref.getField(true,"_mminuteshandcolor" /*RemoteObject*/ )),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_clock_radius,RemoteObject.createImmutable(0.03)}, "*",0, 0))));};
 BA.debugLineNum = 234;BA.debugLine="If mShowSecondsHand = True Then cv_Clock.DrawLine";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_mshowsecondshand" /*RemoteObject*/ ),asclock.__c.getField(true,"True"))) { 
__ref.getField(false,"_cv_clock" /*RemoteObject*/ ).runVoidMethod ("DrawLine",(Object)(_clock_x),(Object)(_clock_y),(Object)(_secs_x),(Object)(_secs_y),(Object)(__ref.getField(true,"_msecondshandcolor" /*RemoteObject*/ )),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_clock_radius,RemoteObject.createImmutable(0.01)}, "*",0, 0))));};
 BA.debugLineNum = 236;BA.debugLine="cv_Clock.Invalidate";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_cv_clock" /*RemoteObject*/ ).runVoidMethod ("Invalidate");
 BA.debugLineNum = 238;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getcornercolor(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getCornerColor (asclock) ","asclock",3,__ref.getField(false, "ba"),__ref,289);
if (RapidSub.canDelegate("getcornercolor")) { return __ref.runUserSub(false, "asclock","getcornercolor", __ref);}
 BA.debugLineNum = 289;BA.debugLine="Public Sub getCornerColor As Int";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 290;BA.debugLine="Return mCornerColor";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(true,"_mcornercolor" /*RemoteObject*/ );
 BA.debugLineNum = 291;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getcornerwidth(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getCornerWidth (asclock) ","asclock",3,__ref.getField(false, "ba"),__ref,298);
if (RapidSub.canDelegate("getcornerwidth")) { return __ref.runUserSub(false, "asclock","getcornerwidth", __ref);}
 BA.debugLineNum = 298;BA.debugLine="Public Sub getCornerWidth As Float";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 299;BA.debugLine="Return mCornerWidth";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(true,"_mcornerwidth" /*RemoteObject*/ );
 BA.debugLineNum = 300;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(0f);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getinnercolor(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getInnerColor (asclock) ","asclock",3,__ref.getField(false, "ba"),__ref,280);
if (RapidSub.canDelegate("getinnercolor")) { return __ref.runUserSub(false, "asclock","getinnercolor", __ref);}
 BA.debugLineNum = 280;BA.debugLine="Public Sub getInnerColor As Int";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 281;BA.debugLine="Return mInnerColor";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(true,"_minnercolor" /*RemoteObject*/ );
 BA.debugLineNum = 282;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getmiddletext(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getMiddleText (asclock) ","asclock",3,__ref.getField(false, "ba"),__ref,271);
if (RapidSub.canDelegate("getmiddletext")) { return __ref.runUserSub(false, "asclock","getmiddletext", __ref);}
 BA.debugLineNum = 271;BA.debugLine="Public Sub getMiddleText As String";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 272;BA.debugLine="Return mMiddleText";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(true,"_mmiddletext" /*RemoteObject*/ );
 BA.debugLineNum = 273;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getmiddletextproperties(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getMiddleTextProperties (asclock) ","asclock",3,__ref.getField(false, "ba"),__ref,267);
if (RapidSub.canDelegate("getmiddletextproperties")) { return __ref.runUserSub(false, "asclock","getmiddletextproperties", __ref);}
 BA.debugLineNum = 267;BA.debugLine="Public Sub getMiddleTextProperties As ASClock_Midd";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 268;BA.debugLine="Return m_MiddleTextProperties";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(false,"_m_middletextproperties" /*RemoteObject*/ );
 BA.debugLineNum = 269;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getscalecolor(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getScaleColor (asclock) ","asclock",3,__ref.getField(false, "ba"),__ref,247);
if (RapidSub.canDelegate("getscalecolor")) { return __ref.runUserSub(false, "asclock","getscalecolor", __ref);}
 BA.debugLineNum = 247;BA.debugLine="Public Sub getScaleColor As Int";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 248;BA.debugLine="Return mScaleColor";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(true,"_mscalecolor" /*RemoteObject*/ );
 BA.debugLineNum = 249;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getshowdialtext(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getShowDialText (asclock) ","asclock",3,__ref.getField(false, "ba"),__ref,307);
if (RapidSub.canDelegate("getshowdialtext")) { return __ref.runUserSub(false, "asclock","getshowdialtext", __ref);}
 BA.debugLineNum = 307;BA.debugLine="Public Sub getShowDialText As Boolean";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 308;BA.debugLine="Return mShowDialText";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(true,"_mshowdialtext" /*RemoteObject*/ );
 BA.debugLineNum = 309;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getshowhourmark(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getShowHourMark (asclock) ","asclock",3,__ref.getField(false, "ba"),__ref,316);
if (RapidSub.canDelegate("getshowhourmark")) { return __ref.runUserSub(false, "asclock","getshowhourmark", __ref);}
 BA.debugLineNum = 316;BA.debugLine="Public Sub getShowHourMark As Boolean";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 317;BA.debugLine="Return mShowHourMark";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(true,"_mshowhourmark" /*RemoteObject*/ );
 BA.debugLineNum = 318;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getshowminutesmark(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getShowMinutesMark (asclock) ","asclock",3,__ref.getField(false, "ba"),__ref,325);
if (RapidSub.canDelegate("getshowminutesmark")) { return __ref.runUserSub(false, "asclock","getshowminutesmark", __ref);}
 BA.debugLineNum = 325;BA.debugLine="Public Sub getShowMinutesMark As Boolean";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 326;BA.debugLine="Return mShowMinutesMark";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(true,"_mshowminutesmark" /*RemoteObject*/ );
 BA.debugLineNum = 327;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getsweephands(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getSweepHands (asclock) ","asclock",3,__ref.getField(false, "ba"),__ref,251);
if (RapidSub.canDelegate("getsweephands")) { return __ref.runUserSub(false, "asclock","getsweephands", __ref);}
 BA.debugLineNum = 251;BA.debugLine="Public Sub getSweepHands As Boolean";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 252;BA.debugLine="Return mSweepHands";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(true,"_msweephands" /*RemoteObject*/ );
 BA.debugLineNum = 253;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba,RemoteObject _callback,RemoteObject _eventname) throws Exception{
try {
		Debug.PushSubsStack("Initialize (asclock) ","asclock",3,__ref.getField(false, "ba"),__ref,75);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "asclock","initialize", __ref, _ba, _callback, _eventname);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
Debug.locals.put("Callback", _callback);
Debug.locals.put("EventName", _eventname);
 BA.debugLineNum = 75;BA.debugLine="Public Sub Initialize (Callback As Object, EventNa";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 76;BA.debugLine="mEventName = EventName";
Debug.JustUpdateDeviceLine();
__ref.setField ("_meventname" /*RemoteObject*/ ,_eventname);
 BA.debugLineNum = 77;BA.debugLine="mCallBack = Callback";
Debug.JustUpdateDeviceLine();
__ref.setField ("_mcallback" /*RemoteObject*/ ,_callback);
 BA.debugLineNum = 78;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _measuretextheight(RemoteObject __ref,RemoteObject _text,RemoteObject _font1) throws Exception{
try {
		Debug.PushSubsStack("MeasureTextHeight (asclock) ","asclock",3,__ref.getField(false, "ba"),__ref,339);
if (RapidSub.canDelegate("measuretextheight")) { return __ref.runUserSub(false, "asclock","measuretextheight", __ref, _text, _font1);}
RemoteObject _jo = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
RemoteObject _bounds = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
Debug.locals.put("Text", _text);
Debug.locals.put("Font1", _font1);
 BA.debugLineNum = 339;BA.debugLine="Private Sub MeasureTextHeight(Text As String, Font";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 349;BA.debugLine="Dim jo As JavaObject";
Debug.JustUpdateDeviceLine();
_jo = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");Debug.locals.put("jo", _jo);
 BA.debugLineNum = 350;BA.debugLine="jo.InitializeNewInstance(\"javafx.scene.text.Text\"";
Debug.JustUpdateDeviceLine();
_jo.runVoidMethod ("InitializeNewInstance",(Object)(BA.ObjectToString("javafx.scene.text.Text")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_text)})));
 BA.debugLineNum = 351;BA.debugLine="jo.RunMethod(\"setFont\",Array(Font1.ToNativeFont))";
Debug.JustUpdateDeviceLine();
_jo.runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("setFont")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_font1.runMethod(false,"ToNativeFont").getObject())})));
 BA.debugLineNum = 352;BA.debugLine="jo.RunMethod(\"setLineSpacing\",Array(0.0))";
Debug.JustUpdateDeviceLine();
_jo.runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("setLineSpacing")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {RemoteObject.createImmutable((0.0))})));
 BA.debugLineNum = 353;BA.debugLine="jo.RunMethod(\"setWrappingWidth\",Array(0.0))";
Debug.JustUpdateDeviceLine();
_jo.runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("setWrappingWidth")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {RemoteObject.createImmutable((0.0))})));
 BA.debugLineNum = 354;BA.debugLine="Dim Bounds As JavaObject = jo.RunMethod(\"getLayou";
Debug.JustUpdateDeviceLine();
_bounds = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_bounds = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), _jo.runMethod(false,"RunMethod",(Object)(BA.ObjectToString("getLayoutBounds")),(Object)((asclock.__c.getField(false,"Null")))));Debug.locals.put("Bounds", _bounds);Debug.locals.put("Bounds", _bounds);
 BA.debugLineNum = 355;BA.debugLine="Return Bounds.RunMethod(\"getHeight\",Null)";
Debug.JustUpdateDeviceLine();
if (true) return BA.numberCast(int.class, _bounds.runMethod(false,"RunMethod",(Object)(BA.ObjectToString("getHeight")),(Object)((asclock.__c.getField(false,"Null")))));
 BA.debugLineNum = 357;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setcornercolor(RemoteObject __ref,RemoteObject _color) throws Exception{
try {
		Debug.PushSubsStack("setCornerColor (asclock) ","asclock",3,__ref.getField(false, "ba"),__ref,293);
if (RapidSub.canDelegate("setcornercolor")) { return __ref.runUserSub(false, "asclock","setcornercolor", __ref, _color);}
Debug.locals.put("Color", _color);
 BA.debugLineNum = 293;BA.debugLine="Public Sub setCornerColor(Color As Int)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 294;BA.debugLine="mCornerColor = Color";
Debug.JustUpdateDeviceLine();
__ref.setField ("_mcornercolor" /*RemoteObject*/ ,_color);
 BA.debugLineNum = 295;BA.debugLine="Draw";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.asclock.class, "_draw" /*RemoteObject*/ );
 BA.debugLineNum = 296;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setcornerwidth(RemoteObject __ref,RemoteObject _cornerwidth) throws Exception{
try {
		Debug.PushSubsStack("setCornerWidth (asclock) ","asclock",3,__ref.getField(false, "ba"),__ref,302);
if (RapidSub.canDelegate("setcornerwidth")) { return __ref.runUserSub(false, "asclock","setcornerwidth", __ref, _cornerwidth);}
Debug.locals.put("CornerWidth", _cornerwidth);
 BA.debugLineNum = 302;BA.debugLine="Public Sub setCornerWidth(CornerWidth As Float)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 303;BA.debugLine="mCornerWidth = CornerWidth";
Debug.JustUpdateDeviceLine();
__ref.setField ("_mcornerwidth" /*RemoteObject*/ ,_cornerwidth);
 BA.debugLineNum = 304;BA.debugLine="Draw";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.asclock.class, "_draw" /*RemoteObject*/ );
 BA.debugLineNum = 305;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setinnercolor(RemoteObject __ref,RemoteObject _color) throws Exception{
try {
		Debug.PushSubsStack("setInnerColor (asclock) ","asclock",3,__ref.getField(false, "ba"),__ref,284);
if (RapidSub.canDelegate("setinnercolor")) { return __ref.runUserSub(false, "asclock","setinnercolor", __ref, _color);}
Debug.locals.put("Color", _color);
 BA.debugLineNum = 284;BA.debugLine="Public Sub setInnerColor(Color As Int)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 285;BA.debugLine="mInnerColor = Color";
Debug.JustUpdateDeviceLine();
__ref.setField ("_minnercolor" /*RemoteObject*/ ,_color);
 BA.debugLineNum = 286;BA.debugLine="Draw";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.asclock.class, "_draw" /*RemoteObject*/ );
 BA.debugLineNum = 287;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setmiddletext(RemoteObject __ref,RemoteObject _text) throws Exception{
try {
		Debug.PushSubsStack("setMiddleText (asclock) ","asclock",3,__ref.getField(false, "ba"),__ref,275);
if (RapidSub.canDelegate("setmiddletext")) { return __ref.runUserSub(false, "asclock","setmiddletext", __ref, _text);}
Debug.locals.put("Text", _text);
 BA.debugLineNum = 275;BA.debugLine="Public Sub setMiddleText(Text As String)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 276;BA.debugLine="mMiddleText = Text";
Debug.JustUpdateDeviceLine();
__ref.setField ("_mmiddletext" /*RemoteObject*/ ,_text);
 BA.debugLineNum = 277;BA.debugLine="Draw";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.asclock.class, "_draw" /*RemoteObject*/ );
 BA.debugLineNum = 278;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setscalecolor(RemoteObject __ref,RemoteObject _color) throws Exception{
try {
		Debug.PushSubsStack("setScaleColor (asclock) ","asclock",3,__ref.getField(false, "ba"),__ref,242);
if (RapidSub.canDelegate("setscalecolor")) { return __ref.runUserSub(false, "asclock","setscalecolor", __ref, _color);}
Debug.locals.put("Color", _color);
 BA.debugLineNum = 242;BA.debugLine="Public Sub setScaleColor(Color As Int)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 243;BA.debugLine="mScaleColor = Color";
Debug.JustUpdateDeviceLine();
__ref.setField ("_mscalecolor" /*RemoteObject*/ ,_color);
 BA.debugLineNum = 244;BA.debugLine="Draw";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.asclock.class, "_draw" /*RemoteObject*/ );
 BA.debugLineNum = 245;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setshowdialtext(RemoteObject __ref,RemoteObject _show) throws Exception{
try {
		Debug.PushSubsStack("setShowDialText (asclock) ","asclock",3,__ref.getField(false, "ba"),__ref,311);
if (RapidSub.canDelegate("setshowdialtext")) { return __ref.runUserSub(false, "asclock","setshowdialtext", __ref, _show);}
Debug.locals.put("Show", _show);
 BA.debugLineNum = 311;BA.debugLine="Public Sub setShowDialText(Show As Boolean)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 312;BA.debugLine="mShowDialText = Show";
Debug.JustUpdateDeviceLine();
__ref.setField ("_mshowdialtext" /*RemoteObject*/ ,_show);
 BA.debugLineNum = 313;BA.debugLine="Draw";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.asclock.class, "_draw" /*RemoteObject*/ );
 BA.debugLineNum = 314;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setshowhourmark(RemoteObject __ref,RemoteObject _show) throws Exception{
try {
		Debug.PushSubsStack("setShowHourMark (asclock) ","asclock",3,__ref.getField(false, "ba"),__ref,320);
if (RapidSub.canDelegate("setshowhourmark")) { return __ref.runUserSub(false, "asclock","setshowhourmark", __ref, _show);}
Debug.locals.put("Show", _show);
 BA.debugLineNum = 320;BA.debugLine="Public Sub setShowHourMark(Show As Boolean)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 321;BA.debugLine="mShowHourMark = Show";
Debug.JustUpdateDeviceLine();
__ref.setField ("_mshowhourmark" /*RemoteObject*/ ,_show);
 BA.debugLineNum = 322;BA.debugLine="Draw";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.asclock.class, "_draw" /*RemoteObject*/ );
 BA.debugLineNum = 323;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setshowminutesmark(RemoteObject __ref,RemoteObject _show) throws Exception{
try {
		Debug.PushSubsStack("setShowMinutesMark (asclock) ","asclock",3,__ref.getField(false, "ba"),__ref,329);
if (RapidSub.canDelegate("setshowminutesmark")) { return __ref.runUserSub(false, "asclock","setshowminutesmark", __ref, _show);}
Debug.locals.put("Show", _show);
 BA.debugLineNum = 329;BA.debugLine="Public Sub setShowMinutesMark(Show As Boolean)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 330;BA.debugLine="mShowMinutesMark = Show";
Debug.JustUpdateDeviceLine();
__ref.setField ("_mshowminutesmark" /*RemoteObject*/ ,_show);
 BA.debugLineNum = 331;BA.debugLine="Draw";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.asclock.class, "_draw" /*RemoteObject*/ );
 BA.debugLineNum = 332;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setsweephands(RemoteObject __ref,RemoteObject _sweep) throws Exception{
try {
		Debug.PushSubsStack("setSweepHands (asclock) ","asclock",3,__ref.getField(false, "ba"),__ref,255);
if (RapidSub.canDelegate("setsweephands")) { return __ref.runUserSub(false, "asclock","setsweephands", __ref, _sweep);}
Debug.locals.put("Sweep", _sweep);
 BA.debugLineNum = 255;BA.debugLine="Public Sub setSweepHands(Sweep As Boolean)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 256;BA.debugLine="mSweepHands = Sweep";
Debug.JustUpdateDeviceLine();
__ref.setField ("_msweephands" /*RemoteObject*/ ,_sweep);
 BA.debugLineNum = 257;BA.debugLine="Draw";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.asclock.class, "_draw" /*RemoteObject*/ );
 BA.debugLineNum = 258;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _settime(RemoteObject __ref,RemoteObject _hour,RemoteObject _mins,RemoteObject _secs) throws Exception{
try {
		Debug.PushSubsStack("SetTime (asclock) ","asclock",3,__ref.getField(false, "ba"),__ref,260);
if (RapidSub.canDelegate("settime")) { return __ref.runUserSub(false, "asclock","settime", __ref, _hour, _mins, _secs);}
Debug.locals.put("Hour", _hour);
Debug.locals.put("Mins", _mins);
Debug.locals.put("Secs", _secs);
 BA.debugLineNum = 260;BA.debugLine="Public Sub SetTime(Hour As Int,Mins As Int,Secs As";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 261;BA.debugLine="mHour = Hour";
Debug.JustUpdateDeviceLine();
__ref.setField ("_mhour" /*RemoteObject*/ ,_hour);
 BA.debugLineNum = 262;BA.debugLine="mMin = Mins";
Debug.JustUpdateDeviceLine();
__ref.setField ("_mmin" /*RemoteObject*/ ,_mins);
 BA.debugLineNum = 263;BA.debugLine="mSec = Secs";
Debug.JustUpdateDeviceLine();
__ref.setField ("_msec" /*RemoteObject*/ ,_secs);
 BA.debugLineNum = 264;BA.debugLine="Draw";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.asclock.class, "_draw" /*RemoteObject*/ );
 BA.debugLineNum = 265;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}