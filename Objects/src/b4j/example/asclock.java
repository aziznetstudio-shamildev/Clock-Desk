package b4j.example;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class asclock extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.example", "b4j.example.asclock", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.asclock.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 
    public void  innerInitializeHelper(anywheresoftware.b4a.BA _ba) throws Exception{
        innerInitialize(_ba);
    }
    public Object callSub(String sub, Object sender, Object[] args) throws Exception {
        return BA.SubDelegator.SubNotFound;
    }
public static class _asclock_middletextproperties{
public boolean IsInitialized;
public int TextColor;
public anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont xFont;
public void Initialize() {
IsInitialized = true;
TextColor = 0;
xFont = new anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont();
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public anywheresoftware.b4a.keywords.Common __c = null;
public String _meventname = "";
public Object _mcallback = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _mbase = null;
public anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
public Object _tag = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _xpnl_background = null;
public anywheresoftware.b4a.objects.B4XCanvas _cv_clock = null;
public b4j.example.asclock._asclock_middletextproperties _m_middletextproperties = null;
public int _minnercolor = 0;
public int _mcornercolor = 0;
public float _mcornerwidth = 0f;
public boolean _mshowdialtext = false;
public boolean _mshowhourmark = false;
public boolean _mshowminutesmark = false;
public int _mhourshandcolor = 0;
public int _mminuteshandcolor = 0;
public int _msecondshandcolor = 0;
public int _mscalecolor = 0;
public boolean _mshowhourshand = false;
public boolean _mshowminuteshand = false;
public boolean _mshowsecondshand = false;
public boolean _msweephands = false;
public String _mclockmode = "";
public String _mmiddletext = "";
public int _mhour = 0;
public int _mmin = 0;
public int _msec = 0;
public anywheresoftware.b4a.objects.B4XCanvas.B4XRect _circlerect = null;
public b4j.example.main _main = null;
public b4j.example.httputils2service _httputils2service = null;
public String  _base_resize(b4j.example.asclock __ref,double _width,double _height) throws Exception{
__ref = this;
RDebugUtils.currentModule="asclock";
if (Debug.shouldDelegate(ba, "base_resize", true))
	 {return ((String) Debug.delegate(ba, "base_resize", new Object[] {_width,_height}));}
RDebugUtils.currentLine=3866624;
 //BA.debugLineNum = 3866624;BA.debugLine="Private Sub Base_Resize (Width As Double, Height A";
RDebugUtils.currentLine=3866625;
 //BA.debugLineNum = 3866625;BA.debugLine="xpnl_Background.SetLayoutAnimated(0,0,0,Width,Hei";
__ref._xpnl_background /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),0,0,_width,_height);
RDebugUtils.currentLine=3866626;
 //BA.debugLineNum = 3866626;BA.debugLine="cv_Clock.Resize(Width, Height)";
__ref._cv_clock /*anywheresoftware.b4a.objects.B4XCanvas*/ .Resize(_width,_height);
RDebugUtils.currentLine=3866627;
 //BA.debugLineNum = 3866627;BA.debugLine="CircleRect.Initialize(mCornerWidth/2,mCornerWidth";
__ref._circlerect /*anywheresoftware.b4a.objects.B4XCanvas.B4XRect*/ .Initialize((float) (__ref._mcornerwidth /*float*/ /(double)2),(float) (__ref._mcornerwidth /*float*/ /(double)2),(float) (_width-__ref._mcornerwidth /*float*/ /(double)2),(float) (_height-__ref._mcornerwidth /*float*/ /(double)2));
RDebugUtils.currentLine=3866628;
 //BA.debugLineNum = 3866628;BA.debugLine="Draw";
__ref._draw /*String*/ (null);
RDebugUtils.currentLine=3866629;
 //BA.debugLineNum = 3866629;BA.debugLine="End Sub";
return "";
}
public String  _draw(b4j.example.asclock __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="asclock";
if (Debug.shouldDelegate(ba, "draw", true))
	 {return ((String) Debug.delegate(ba, "draw", null));}
float _clock_radius = 0f;
int _clockmode = 0;
int _midnight = 0;
int _counter = 0;
int _angle = 0;
float _x = 0f;
float _y = 0f;
float _x2 = 0f;
float _y2 = 0f;
anywheresoftware.b4a.objects.B4XCanvas.B4XRect _r = null;
int _baseline = 0;
RDebugUtils.currentLine=3932160;
 //BA.debugLineNum = 3932160;BA.debugLine="Public Sub Draw";
RDebugUtils.currentLine=3932162;
 //BA.debugLineNum = 3932162;BA.debugLine="cv_Clock.ClearRect(cv_Clock.TargetRect)";
__ref._cv_clock /*anywheresoftware.b4a.objects.B4XCanvas*/ .ClearRect(__ref._cv_clock /*anywheresoftware.b4a.objects.B4XCanvas*/ .getTargetRect());
RDebugUtils.currentLine=3932164;
 //BA.debugLineNum = 3932164;BA.debugLine="mBase.SetColorAndBorder(mInnerColor,mCornerWidth,";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetColorAndBorder(__ref._minnercolor /*int*/ ,__ref._mcornerwidth /*float*/ ,__ref._mcornercolor /*int*/ ,__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()/(double)2);
RDebugUtils.currentLine=3932166;
 //BA.debugLineNum = 3932166;BA.debugLine="Dim Clock_Radius As Float = CircleRect.Width / 2";
_clock_radius = (float) (__ref._circlerect /*anywheresoftware.b4a.objects.B4XCanvas.B4XRect*/ .getWidth()/(double)2-__ref._mcornerwidth /*float*/ );
RDebugUtils.currentLine=3932168;
 //BA.debugLineNum = 3932168;BA.debugLine="Dim ClockMode As Int = IIf(mClockMode <> \"SleepDu";
_clockmode = (int)(BA.ObjectToNumber((((__ref._mclockmode /*String*/ ).equals("SleepDuration") == false) ? ((Object)(__ref._mclockmode /*String*/ )) : ((Object)(24)))));
RDebugUtils.currentLine=3932171;
 //BA.debugLineNum = 3932171;BA.debugLine="Dim midnight = 270 As Int";
_midnight = (int) (270);
RDebugUtils.currentLine=3932172;
 //BA.debugLineNum = 3932172;BA.debugLine="Dim Counter As Int = -1";
_counter = (int) (-1);
RDebugUtils.currentLine=3932173;
 //BA.debugLineNum = 3932173;BA.debugLine="For angle = midnight To (midnight + 360) Step (36";
{
final int step7 = (int) ((360/(double)_clockmode));
final int limit7 = (int) ((_midnight+360));
_angle = _midnight ;
for (;(step7 > 0 && _angle <= limit7) || (step7 < 0 && _angle >= limit7) ;_angle = ((int)(0 + _angle + step7))  ) {
RDebugUtils.currentLine=3932174;
 //BA.debugLineNum = 3932174;BA.debugLine="Counter = Counter +1";
_counter = (int) (_counter+1);
RDebugUtils.currentLine=3932175;
 //BA.debugLineNum = 3932175;BA.debugLine="Dim x = (CosD(angle) * Clock_Radius * 0.95) + mB";
_x = (float) ((__c.CosD(_angle)*_clock_radius*0.95)+__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()/(double)2);
RDebugUtils.currentLine=3932176;
 //BA.debugLineNum = 3932176;BA.debugLine="Dim y = (SinD(angle) * Clock_Radius * 0.95) + mB";
_y = (float) ((__c.SinD(_angle)*_clock_radius*0.95)+__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()/(double)2);
RDebugUtils.currentLine=3932179;
 //BA.debugLineNum = 3932179;BA.debugLine="Dim x2 = (CosD(angle) * Clock_Radius * 1) + mBas";
_x2 = (float) ((__c.CosD(_angle)*_clock_radius*1)+__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()/(double)2);
RDebugUtils.currentLine=3932180;
 //BA.debugLineNum = 3932180;BA.debugLine="Dim y2 = (SinD(angle) * Clock_Radius * 1) + mBas";
_y2 = (float) ((__c.SinD(_angle)*_clock_radius*1)+__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()/(double)2);
RDebugUtils.currentLine=3932182;
 //BA.debugLineNum = 3932182;BA.debugLine="If mShowHourMark = True Then cv_Clock.DrawLine(x";
if (__ref._mshowhourmark /*boolean*/ ==__c.True) { 
__ref._cv_clock /*anywheresoftware.b4a.objects.B4XCanvas*/ .DrawLine(_x,_y,_x2,_y2,__ref._mscalecolor /*int*/ ,(float) (__c.DipToCurrent((int) (2))));};
RDebugUtils.currentLine=3932184;
 //BA.debugLineNum = 3932184;BA.debugLine="If mShowDialText = True Then";
if (__ref._mshowdialtext /*boolean*/ ==__c.True) { 
RDebugUtils.currentLine=3932186;
 //BA.debugLineNum = 3932186;BA.debugLine="If Counter < (ClockMode+1) And Counter <> 0 The";
if (_counter<(_clockmode+1) && _counter!=0) { 
RDebugUtils.currentLine=3932187;
 //BA.debugLineNum = 3932187;BA.debugLine="x = (CosD(angle) * Clock_Radius * 0.85) + mBas";
_x = (float) ((__c.CosD(_angle)*_clock_radius*0.85)+__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()/(double)2);
RDebugUtils.currentLine=3932188;
 //BA.debugLineNum = 3932188;BA.debugLine="y = (SinD(angle) * Clock_Radius * 0.85) + mBas";
_y = (float) ((__c.SinD(_angle)*_clock_radius*0.85)+__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()/(double)2);
RDebugUtils.currentLine=3932190;
 //BA.debugLineNum = 3932190;BA.debugLine="y = y + (MeasureTextHeight(Counter,xui.CreateD";
_y = (float) (_y+(__ref._measuretextheight /*int*/ (null,BA.NumberToString(_counter),__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreateDefaultBoldFont((float) (12)))/(double)4));
RDebugUtils.currentLine=3932192;
 //BA.debugLineNum = 3932192;BA.debugLine="If Counter = 24 And mClockMode = \"SleepDuratio";
if (_counter==24 && (__ref._mclockmode /*String*/ ).equals("SleepDuration")) { 
RDebugUtils.currentLine=3932193;
 //BA.debugLineNum = 3932193;BA.debugLine="cv_Clock.DrawText(0,x,y,xui.CreateDefaultBol";
__ref._cv_clock /*anywheresoftware.b4a.objects.B4XCanvas*/ .DrawText(BA.NumberToString(0),_x,_y,__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreateDefaultBoldFont((float) (12)),__ref._mscalecolor /*int*/ ,BA.getEnumFromString(javafx.scene.text.TextAlignment.class,"CENTER"));
 }else 
{RDebugUtils.currentLine=3932194;
 //BA.debugLineNum = 3932194;BA.debugLine="else if mClockMode = \"SleepDuration\" Then";
if ((__ref._mclockmode /*String*/ ).equals("SleepDuration")) { 
RDebugUtils.currentLine=3932195;
 //BA.debugLineNum = 3932195;BA.debugLine="If Counter Mod 3 = 0 Then";
if (_counter%3==0) { 
RDebugUtils.currentLine=3932196;
 //BA.debugLineNum = 3932196;BA.debugLine="cv_Clock.DrawText(Counter,x,y,xui.CreateDefa";
__ref._cv_clock /*anywheresoftware.b4a.objects.B4XCanvas*/ .DrawText(BA.NumberToString(_counter),_x,_y,__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreateDefaultBoldFont((float) (12)),__ref._mscalecolor /*int*/ ,BA.getEnumFromString(javafx.scene.text.TextAlignment.class,"CENTER"));
 };
 }else {
RDebugUtils.currentLine=3932199;
 //BA.debugLineNum = 3932199;BA.debugLine="cv_Clock.DrawText(Counter,x,y,xui.CreateDefau";
__ref._cv_clock /*anywheresoftware.b4a.objects.B4XCanvas*/ .DrawText(BA.NumberToString(_counter),_x,_y,__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreateDefaultBoldFont((float) (12)),__ref._mscalecolor /*int*/ ,BA.getEnumFromString(javafx.scene.text.TextAlignment.class,"CENTER"));
 }}
;
 };
 };
 }
};
RDebugUtils.currentLine=3932207;
 //BA.debugLineNum = 3932207;BA.debugLine="If mShowMinutesMark = True Then";
if (__ref._mshowminutesmark /*boolean*/ ==__c.True) { 
RDebugUtils.currentLine=3932208;
 //BA.debugLineNum = 3932208;BA.debugLine="Dim midnight = 270 As Int";
_midnight = (int) (270);
RDebugUtils.currentLine=3932209;
 //BA.debugLineNum = 3932209;BA.debugLine="For angle = midnight To (midnight + 360) Step (3";
{
final int step33 = (int) ((360/(double)(double)(BA.ObjectToNumber(((_clockmode==12) ? ((Object)(60)) : ((Object)(120)))))));
final int limit33 = (int) ((_midnight+360));
_angle = _midnight ;
for (;(step33 > 0 && _angle <= limit33) || (step33 < 0 && _angle >= limit33) ;_angle = ((int)(0 + _angle + step33))  ) {
RDebugUtils.currentLine=3932210;
 //BA.debugLineNum = 3932210;BA.debugLine="Dim x = (CosD(angle) * Clock_Radius * 0.98) + m";
_x = (float) ((__c.CosD(_angle)*_clock_radius*0.98)+__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()/(double)2);
RDebugUtils.currentLine=3932211;
 //BA.debugLineNum = 3932211;BA.debugLine="Dim y = (SinD(angle) * Clock_Radius * 0.98) + m";
_y = (float) ((__c.SinD(_angle)*_clock_radius*0.98)+__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()/(double)2);
RDebugUtils.currentLine=3932214;
 //BA.debugLineNum = 3932214;BA.debugLine="Dim x2 = (CosD(angle) * Clock_Radius * 1) + mBa";
_x2 = (float) ((__c.CosD(_angle)*_clock_radius*1)+__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()/(double)2);
RDebugUtils.currentLine=3932215;
 //BA.debugLineNum = 3932215;BA.debugLine="Dim y2 = (SinD(angle) * Clock_Radius * 1) + mBa";
_y2 = (float) ((__c.SinD(_angle)*_clock_radius*1)+__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()/(double)2);
RDebugUtils.currentLine=3932217;
 //BA.debugLineNum = 3932217;BA.debugLine="cv_Clock.DrawLine(x,y,x2,y2,mScaleColor,2dip)";
__ref._cv_clock /*anywheresoftware.b4a.objects.B4XCanvas*/ .DrawLine(_x,_y,_x2,_y2,__ref._mscalecolor /*int*/ ,(float) (__c.DipToCurrent((int) (2))));
 }
};
 };
RDebugUtils.currentLine=3932221;
 //BA.debugLineNum = 3932221;BA.debugLine="Dim r As B4XRect = cv_Clock.MeasureText(Counter,m";
_r = __ref._cv_clock /*anywheresoftware.b4a.objects.B4XCanvas*/ .MeasureText(BA.NumberToString(_counter),__ref._m_middletextproperties /*b4j.example.asclock._asclock_middletextproperties*/ .xFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ );
RDebugUtils.currentLine=3932222;
 //BA.debugLineNum = 3932222;BA.debugLine="Dim BaseLine As Int = mBase.Height/2 - r.Height /";
_baseline = (int) (__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()/(double)2-_r.getHeight()/(double)2-_r.getTop());
RDebugUtils.currentLine=3932224;
 //BA.debugLineNum = 3932224;BA.debugLine="cv_Clock.DrawText(mMiddleText,mBase.Width/2 ,Base";
__ref._cv_clock /*anywheresoftware.b4a.objects.B4XCanvas*/ .DrawText(__ref._mmiddletext /*String*/ ,__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()/(double)2,_baseline,__ref._m_middletextproperties /*b4j.example.asclock._asclock_middletextproperties*/ .xFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ ,__ref._m_middletextproperties /*b4j.example.asclock._asclock_middletextproperties*/ .TextColor /*int*/ ,BA.getEnumFromString(javafx.scene.text.TextAlignment.class,"CENTER"));
RDebugUtils.currentLine=3932226;
 //BA.debugLineNum = 3932226;BA.debugLine="DrawPointer";
__ref._drawpointer /*String*/ (null);
RDebugUtils.currentLine=3932228;
 //BA.debugLineNum = 3932228;BA.debugLine="cv_Clock.Invalidate";
__ref._cv_clock /*anywheresoftware.b4a.objects.B4XCanvas*/ .Invalidate();
RDebugUtils.currentLine=3932230;
 //BA.debugLineNum = 3932230;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4j.example.asclock __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="asclock";
RDebugUtils.currentLine=3670016;
 //BA.debugLineNum = 3670016;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=3670017;
 //BA.debugLineNum = 3670017;BA.debugLine="Private mEventName As String 'ignore";
_meventname = "";
RDebugUtils.currentLine=3670018;
 //BA.debugLineNum = 3670018;BA.debugLine="Private mCallBack As Object 'ignore";
_mcallback = new Object();
RDebugUtils.currentLine=3670019;
 //BA.debugLineNum = 3670019;BA.debugLine="Public mBase As B4XView";
_mbase = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=3670020;
 //BA.debugLineNum = 3670020;BA.debugLine="Private xui As XUI 'ignore";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=3670021;
 //BA.debugLineNum = 3670021;BA.debugLine="Public Tag As Object";
_tag = new Object();
RDebugUtils.currentLine=3670023;
 //BA.debugLineNum = 3670023;BA.debugLine="Private xpnl_Background As B4XView";
_xpnl_background = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=3670024;
 //BA.debugLineNum = 3670024;BA.debugLine="Private cv_Clock As B4XCanvas";
_cv_clock = new anywheresoftware.b4a.objects.B4XCanvas();
RDebugUtils.currentLine=3670026;
 //BA.debugLineNum = 3670026;BA.debugLine="Type ASClock_MiddleTextProperties(TextColor As In";
;
RDebugUtils.currentLine=3670027;
 //BA.debugLineNum = 3670027;BA.debugLine="Private m_MiddleTextProperties As ASClock_MiddleT";
_m_middletextproperties = new b4j.example.asclock._asclock_middletextproperties();
RDebugUtils.currentLine=3670029;
 //BA.debugLineNum = 3670029;BA.debugLine="Private mInnerColor As Int";
_minnercolor = 0;
RDebugUtils.currentLine=3670030;
 //BA.debugLineNum = 3670030;BA.debugLine="Private mCornerColor As Int";
_mcornercolor = 0;
RDebugUtils.currentLine=3670031;
 //BA.debugLineNum = 3670031;BA.debugLine="Private mCornerWidth As Float";
_mcornerwidth = 0f;
RDebugUtils.currentLine=3670032;
 //BA.debugLineNum = 3670032;BA.debugLine="Private mShowDialText As Boolean";
_mshowdialtext = false;
RDebugUtils.currentLine=3670033;
 //BA.debugLineNum = 3670033;BA.debugLine="Private mShowHourMark As Boolean";
_mshowhourmark = false;
RDebugUtils.currentLine=3670034;
 //BA.debugLineNum = 3670034;BA.debugLine="Private mShowMinutesMark As Boolean";
_mshowminutesmark = false;
RDebugUtils.currentLine=3670036;
 //BA.debugLineNum = 3670036;BA.debugLine="Private mHoursHandColor As Int";
_mhourshandcolor = 0;
RDebugUtils.currentLine=3670037;
 //BA.debugLineNum = 3670037;BA.debugLine="Private mMinutesHandColor As Int";
_mminuteshandcolor = 0;
RDebugUtils.currentLine=3670038;
 //BA.debugLineNum = 3670038;BA.debugLine="Private mSecondsHandColor As Int";
_msecondshandcolor = 0;
RDebugUtils.currentLine=3670039;
 //BA.debugLineNum = 3670039;BA.debugLine="Private mScaleColor As Int";
_mscalecolor = 0;
RDebugUtils.currentLine=3670041;
 //BA.debugLineNum = 3670041;BA.debugLine="Private mShowHoursHand As Boolean";
_mshowhourshand = false;
RDebugUtils.currentLine=3670042;
 //BA.debugLineNum = 3670042;BA.debugLine="Private mShowMinutesHand As Boolean";
_mshowminuteshand = false;
RDebugUtils.currentLine=3670043;
 //BA.debugLineNum = 3670043;BA.debugLine="Private mShowSecondsHand As Boolean";
_mshowsecondshand = false;
RDebugUtils.currentLine=3670044;
 //BA.debugLineNum = 3670044;BA.debugLine="Private mSweepHands As Boolean";
_msweephands = false;
RDebugUtils.currentLine=3670045;
 //BA.debugLineNum = 3670045;BA.debugLine="Private mClockMode As String";
_mclockmode = "";
RDebugUtils.currentLine=3670047;
 //BA.debugLineNum = 3670047;BA.debugLine="Private mMiddleText As String";
_mmiddletext = "";
RDebugUtils.currentLine=3670048;
 //BA.debugLineNum = 3670048;BA.debugLine="Private mHour,mMin,mSec As Int";
_mhour = 0;
_mmin = 0;
_msec = 0;
RDebugUtils.currentLine=3670050;
 //BA.debugLineNum = 3670050;BA.debugLine="Private CircleRect As B4XRect";
_circlerect = new anywheresoftware.b4a.objects.B4XCanvas.B4XRect();
RDebugUtils.currentLine=3670051;
 //BA.debugLineNum = 3670051;BA.debugLine="End Sub";
return "";
}
public b4j.example.asclock._asclock_middletextproperties  _createasclock_middletextproperties(b4j.example.asclock __ref,int _textcolor,anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont _xfont) throws Exception{
__ref = this;
RDebugUtils.currentModule="asclock";
if (Debug.shouldDelegate(ba, "createasclock_middletextproperties", true))
	 {return ((b4j.example.asclock._asclock_middletextproperties) Debug.delegate(ba, "createasclock_middletextproperties", new Object[] {_textcolor,_xfont}));}
b4j.example.asclock._asclock_middletextproperties _t1 = null;
RDebugUtils.currentLine=5439488;
 //BA.debugLineNum = 5439488;BA.debugLine="Public Sub CreateASClock_MiddleTextProperties (Tex";
RDebugUtils.currentLine=5439489;
 //BA.debugLineNum = 5439489;BA.debugLine="Dim t1 As ASClock_MiddleTextProperties";
_t1 = new b4j.example.asclock._asclock_middletextproperties();
RDebugUtils.currentLine=5439490;
 //BA.debugLineNum = 5439490;BA.debugLine="t1.Initialize";
_t1.Initialize();
RDebugUtils.currentLine=5439491;
 //BA.debugLineNum = 5439491;BA.debugLine="t1.TextColor = TextColor";
_t1.TextColor /*int*/  = _textcolor;
RDebugUtils.currentLine=5439492;
 //BA.debugLineNum = 5439492;BA.debugLine="t1.xFont = xFont";
_t1.xFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/  = _xfont;
RDebugUtils.currentLine=5439493;
 //BA.debugLineNum = 5439493;BA.debugLine="Return t1";
if (true) return _t1;
RDebugUtils.currentLine=5439494;
 //BA.debugLineNum = 5439494;BA.debugLine="End Sub";
return null;
}
public String  _designercreateview(b4j.example.asclock __ref,Object _base,anywheresoftware.b4j.objects.LabelWrapper _lbl,anywheresoftware.b4a.objects.collections.Map _props) throws Exception{
__ref = this;
RDebugUtils.currentModule="asclock";
if (Debug.shouldDelegate(ba, "designercreateview", true))
	 {return ((String) Debug.delegate(ba, "designercreateview", new Object[] {_base,_lbl,_props}));}
RDebugUtils.currentLine=3801088;
 //BA.debugLineNum = 3801088;BA.debugLine="Public Sub DesignerCreateView (Base As Object, Lbl";
RDebugUtils.currentLine=3801089;
 //BA.debugLineNum = 3801089;BA.debugLine="mBase = Base";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_base));
RDebugUtils.currentLine=3801090;
 //BA.debugLineNum = 3801090;BA.debugLine="Tag = mBase.Tag";
__ref._tag /*Object*/  = __ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getTag();
RDebugUtils.currentLine=3801091;
 //BA.debugLineNum = 3801091;BA.debugLine="mBase.Tag = Me";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setTag(this);
RDebugUtils.currentLine=3801093;
 //BA.debugLineNum = 3801093;BA.debugLine="xpnl_Background = xui.CreatePanel(\"\")";
__ref._xpnl_background /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"");
RDebugUtils.currentLine=3801094;
 //BA.debugLineNum = 3801094;BA.debugLine="mBase.AddView(xpnl_Background,0,0,1dip,1dip)";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((javafx.scene.Node)(__ref._xpnl_background /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),0,0,__c.DipToCurrent((int) (1)),__c.DipToCurrent((int) (1)));
RDebugUtils.currentLine=3801095;
 //BA.debugLineNum = 3801095;BA.debugLine="cv_Clock.Initialize(xpnl_Background)";
__ref._cv_clock /*anywheresoftware.b4a.objects.B4XCanvas*/ .Initialize(ba,__ref._xpnl_background /*anywheresoftware.b4a.objects.B4XViewWrapper*/ );
RDebugUtils.currentLine=3801097;
 //BA.debugLineNum = 3801097;BA.debugLine="mInnerColor = xui.PaintOrColorToColor(Props.Get(\"";
__ref._minnercolor /*int*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .PaintOrColorToColor(_props.Get((Object)("InnerColor")));
RDebugUtils.currentLine=3801098;
 //BA.debugLineNum = 3801098;BA.debugLine="mCornerColor = xui.PaintOrColorToColor(Props.Get(";
__ref._mcornercolor /*int*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .PaintOrColorToColor(_props.Get((Object)("CornerColor")));
RDebugUtils.currentLine=3801100;
 //BA.debugLineNum = 3801100;BA.debugLine="mHoursHandColor = xui.PaintOrColorToColor(Props.G";
__ref._mhourshandcolor /*int*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .PaintOrColorToColor(_props.Get((Object)("HoursHandColor")));
RDebugUtils.currentLine=3801101;
 //BA.debugLineNum = 3801101;BA.debugLine="mMinutesHandColor = xui.PaintOrColorToColor(Props";
__ref._mminuteshandcolor /*int*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .PaintOrColorToColor(_props.Get((Object)("MinutesHandColor")));
RDebugUtils.currentLine=3801102;
 //BA.debugLineNum = 3801102;BA.debugLine="mSecondsHandColor = xui.PaintOrColorToColor(Props";
__ref._msecondshandcolor /*int*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .PaintOrColorToColor(_props.Get((Object)("SecondsHandColor")));
RDebugUtils.currentLine=3801103;
 //BA.debugLineNum = 3801103;BA.debugLine="mScaleColor = xui.PaintOrColorToColor(Props.GetDe";
__ref._mscalecolor /*int*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .PaintOrColorToColor(_props.GetDefault((Object)("ScaleColor"),(Object)(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_White)));
RDebugUtils.currentLine=3801105;
 //BA.debugLineNum = 3801105;BA.debugLine="mCornerWidth = DipToCurrent(Props.Get(\"CornerWidt";
__ref._mcornerwidth /*float*/  = (float) (__c.DipToCurrent((int)(BA.ObjectToNumber(_props.Get((Object)("CornerWidth"))))));
RDebugUtils.currentLine=3801106;
 //BA.debugLineNum = 3801106;BA.debugLine="mShowDialText = Props.Get(\"ShowDialText\")";
__ref._mshowdialtext /*boolean*/  = BA.ObjectToBoolean(_props.Get((Object)("ShowDialText")));
RDebugUtils.currentLine=3801107;
 //BA.debugLineNum = 3801107;BA.debugLine="mShowHourMark = Props.Get(\"ShowHourMark\")";
__ref._mshowhourmark /*boolean*/  = BA.ObjectToBoolean(_props.Get((Object)("ShowHourMark")));
RDebugUtils.currentLine=3801108;
 //BA.debugLineNum = 3801108;BA.debugLine="mShowMinutesMark = Props.Get(\"ShowMinutesMark\")";
__ref._mshowminutesmark /*boolean*/  = BA.ObjectToBoolean(_props.Get((Object)("ShowMinutesMark")));
RDebugUtils.currentLine=3801109;
 //BA.debugLineNum = 3801109;BA.debugLine="mSweepHands = Props.GetDefault(\"SweepHands\",False";
__ref._msweephands /*boolean*/  = BA.ObjectToBoolean(_props.GetDefault((Object)("SweepHands"),(Object)(__c.False)));
RDebugUtils.currentLine=3801111;
 //BA.debugLineNum = 3801111;BA.debugLine="mShowHoursHand = Props.Get(\"ShowHoursHand\")";
__ref._mshowhourshand /*boolean*/  = BA.ObjectToBoolean(_props.Get((Object)("ShowHoursHand")));
RDebugUtils.currentLine=3801112;
 //BA.debugLineNum = 3801112;BA.debugLine="mShowMinutesHand = Props.Get(\"ShowMinutesHand\")";
__ref._mshowminuteshand /*boolean*/  = BA.ObjectToBoolean(_props.Get((Object)("ShowMinutesHand")));
RDebugUtils.currentLine=3801113;
 //BA.debugLineNum = 3801113;BA.debugLine="mShowSecondsHand = Props.Get(\"ShowSecondsHand\")";
__ref._mshowsecondshand /*boolean*/  = BA.ObjectToBoolean(_props.Get((Object)("ShowSecondsHand")));
RDebugUtils.currentLine=3801115;
 //BA.debugLineNum = 3801115;BA.debugLine="mClockMode = Props.GetDefault(\"ClockMode\",12)";
__ref._mclockmode /*String*/  = BA.ObjectToString(_props.GetDefault((Object)("ClockMode"),(Object)(12)));
RDebugUtils.currentLine=3801117;
 //BA.debugLineNum = 3801117;BA.debugLine="m_MiddleTextProperties = CreateASClock_MiddleText";
__ref._m_middletextproperties /*b4j.example.asclock._asclock_middletextproperties*/  = __ref._createasclock_middletextproperties /*b4j.example.asclock._asclock_middletextproperties*/ (null,__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_White,__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreateDefaultFont((float) (60)));
RDebugUtils.currentLine=3801119;
 //BA.debugLineNum = 3801119;BA.debugLine="Base_Resize(mBase.Width,mBase.Height)";
__ref._base_resize /*String*/ (null,__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
RDebugUtils.currentLine=3801120;
 //BA.debugLineNum = 3801120;BA.debugLine="End Sub";
return "";
}
public int  _measuretextheight(b4j.example.asclock __ref,String _text,anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont _font1) throws Exception{
__ref = this;
RDebugUtils.currentModule="asclock";
if (Debug.shouldDelegate(ba, "measuretextheight", true))
	 {return ((Integer) Debug.delegate(ba, "measuretextheight", new Object[] {_text,_font1}));}
anywheresoftware.b4j.object.JavaObject _jo = null;
anywheresoftware.b4j.object.JavaObject _bounds = null;
RDebugUtils.currentLine=5373952;
 //BA.debugLineNum = 5373952;BA.debugLine="Private Sub MeasureTextHeight(Text As String, Font";
RDebugUtils.currentLine=5373962;
 //BA.debugLineNum = 5373962;BA.debugLine="Dim jo As JavaObject";
_jo = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=5373963;
 //BA.debugLineNum = 5373963;BA.debugLine="jo.InitializeNewInstance(\"javafx.scene.text.Text\"";
_jo.InitializeNewInstance("javafx.scene.text.Text",new Object[]{(Object)(_text)});
RDebugUtils.currentLine=5373964;
 //BA.debugLineNum = 5373964;BA.debugLine="jo.RunMethod(\"setFont\",Array(Font1.ToNativeFont))";
_jo.RunMethod("setFont",new Object[]{(Object)(_font1.ToNativeFont().getObject())});
RDebugUtils.currentLine=5373965;
 //BA.debugLineNum = 5373965;BA.debugLine="jo.RunMethod(\"setLineSpacing\",Array(0.0))";
_jo.RunMethod("setLineSpacing",new Object[]{(Object)(0.0)});
RDebugUtils.currentLine=5373966;
 //BA.debugLineNum = 5373966;BA.debugLine="jo.RunMethod(\"setWrappingWidth\",Array(0.0))";
_jo.RunMethod("setWrappingWidth",new Object[]{(Object)(0.0)});
RDebugUtils.currentLine=5373967;
 //BA.debugLineNum = 5373967;BA.debugLine="Dim Bounds As JavaObject = jo.RunMethod(\"getLayou";
_bounds = new anywheresoftware.b4j.object.JavaObject();
_bounds = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_jo.RunMethod("getLayoutBounds",(Object[])(__c.Null))));
RDebugUtils.currentLine=5373968;
 //BA.debugLineNum = 5373968;BA.debugLine="Return Bounds.RunMethod(\"getHeight\",Null)";
if (true) return (int)(BA.ObjectToNumber(_bounds.RunMethod("getHeight",(Object[])(__c.Null))));
RDebugUtils.currentLine=5373970;
 //BA.debugLineNum = 5373970;BA.debugLine="End Sub";
return 0;
}
public String  _drawpointer(b4j.example.asclock __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="asclock";
if (Debug.shouldDelegate(ba, "drawpointer", true))
	 {return ((String) Debug.delegate(ba, "drawpointer", null));}
float _hour_x = 0f;
float _hour_y = 0f;
float _mins_x = 0f;
float _mins_y = 0f;
float _secs_x = 0f;
float _secs_y = 0f;
float _hour_angle = 0f;
float _mins_angle = 0f;
float _secs_angle = 0f;
float _clock_radius = 0f;
int _clockmode = 0;
float _clock_x = 0f;
float _clock_y = 0f;
RDebugUtils.currentLine=3997696;
 //BA.debugLineNum = 3997696;BA.debugLine="Private Sub DrawPointer";
RDebugUtils.currentLine=3997699;
 //BA.debugLineNum = 3997699;BA.debugLine="If mShowHoursHand = False And mShowMinutesHand =";
if (__ref._mshowhourshand /*boolean*/ ==__c.False && __ref._mshowminuteshand /*boolean*/ ==__c.False && __ref._mshowsecondshand /*boolean*/ ==__c.False) { 
if (true) return "";};
RDebugUtils.currentLine=3997701;
 //BA.debugLineNum = 3997701;BA.debugLine="Dim Hour_X, Hour_Y, Mins_X, Mins_Y, Secs_X, Secs_";
_hour_x = 0f;
_hour_y = 0f;
_mins_x = 0f;
_mins_y = 0f;
_secs_x = 0f;
_secs_y = 0f;
RDebugUtils.currentLine=3997702;
 //BA.debugLineNum = 3997702;BA.debugLine="Dim Hour_Angle, Mins_Angle, Secs_Angle As Float";
_hour_angle = 0f;
_mins_angle = 0f;
_secs_angle = 0f;
RDebugUtils.currentLine=3997703;
 //BA.debugLineNum = 3997703;BA.debugLine="Dim Clock_Radius As Float = CircleRect.Width / 2";
_clock_radius = (float) (__ref._circlerect /*anywheresoftware.b4a.objects.B4XCanvas.B4XRect*/ .getWidth()/(double)2-__ref._mcornerwidth /*float*/ );
RDebugUtils.currentLine=3997708;
 //BA.debugLineNum = 3997708;BA.debugLine="Secs_Angle = 270 + (mSec * 360 / 60)";
_secs_angle = (float) (270+(__ref._msec /*int*/ *360/(double)60));
RDebugUtils.currentLine=3997710;
 //BA.debugLineNum = 3997710;BA.debugLine="Dim ClockMode As Int = IIf(mClockMode <> \"SleepDu";
_clockmode = (int)(BA.ObjectToNumber((((__ref._mclockmode /*String*/ ).equals("SleepDuration") == false) ? ((Object)(__ref._mclockmode /*String*/ )) : ((Object)(12)))));
RDebugUtils.currentLine=3997712;
 //BA.debugLineNum = 3997712;BA.debugLine="If mSweepHands = True Then";
if (__ref._msweephands /*boolean*/ ==__c.True) { 
RDebugUtils.currentLine=3997713;
 //BA.debugLineNum = 3997713;BA.debugLine="Mins_Angle = 270 + (mMin * 360 / IIf(ClockMode =";
_mins_angle = (float) (270+(__ref._mmin /*int*/ *360/(double)(double)(BA.ObjectToNumber(((_clockmode==12) ? ((Object)(60)) : ((Object)(120))))))+(_secs_angle-270)/(double)60);
RDebugUtils.currentLine=3997714;
 //BA.debugLineNum = 3997714;BA.debugLine="Hour_Angle = 270 + (mHour * 360 / ClockMode) + (";
_hour_angle = (float) (270+(__ref._mhour /*int*/ *360/(double)_clockmode)+(_mins_angle-270)/(double)(double)(BA.ObjectToNumber(((_clockmode==12) ? ((Object)(60)) : ((Object)(120))))));
 }else {
RDebugUtils.currentLine=3997716;
 //BA.debugLineNum = 3997716;BA.debugLine="Mins_Angle = 270 + (mMin * 360 / 60)";
_mins_angle = (float) (270+(__ref._mmin /*int*/ *360/(double)60));
RDebugUtils.currentLine=3997717;
 //BA.debugLineNum = 3997717;BA.debugLine="Hour_Angle = 270 + (mHour * 360 / ClockMode)";
_hour_angle = (float) (270+(__ref._mhour /*int*/ *360/(double)_clockmode));
 };
RDebugUtils.currentLine=3997720;
 //BA.debugLineNum = 3997720;BA.debugLine="Dim Clock_X As Float = mBase.Width/2";
_clock_x = (float) (__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()/(double)2);
RDebugUtils.currentLine=3997721;
 //BA.debugLineNum = 3997721;BA.debugLine="Dim Clock_Y As Float = mBase.Height/2";
_clock_y = (float) (__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()/(double)2);
RDebugUtils.currentLine=3997724;
 //BA.debugLineNum = 3997724;BA.debugLine="Hour_X = (CosD(Hour_Angle) * Clock_Radius * 0.65)";
_hour_x = (float) ((__c.CosD(_hour_angle)*_clock_radius*0.65)+_clock_x);
RDebugUtils.currentLine=3997725;
 //BA.debugLineNum = 3997725;BA.debugLine="Hour_Y = (SinD(Hour_Angle) * Clock_Radius * 0.65)";
_hour_y = (float) ((__c.SinD(_hour_angle)*_clock_radius*0.65)+_clock_y);
RDebugUtils.currentLine=3997727;
 //BA.debugLineNum = 3997727;BA.debugLine="Mins_X = (CosD(Mins_Angle) * Clock_Radius * 0.80)";
_mins_x = (float) ((__c.CosD(_mins_angle)*_clock_radius*0.80)+_clock_x);
RDebugUtils.currentLine=3997728;
 //BA.debugLineNum = 3997728;BA.debugLine="Mins_Y = (SinD(Mins_Angle) * Clock_Radius * 0.80)";
_mins_y = (float) ((__c.SinD(_mins_angle)*_clock_radius*0.80)+_clock_y);
RDebugUtils.currentLine=3997730;
 //BA.debugLineNum = 3997730;BA.debugLine="Secs_X = (CosD(Secs_Angle) * Clock_Radius * 0.80)";
_secs_x = (float) ((__c.CosD(_secs_angle)*_clock_radius*0.80)+_clock_x);
RDebugUtils.currentLine=3997731;
 //BA.debugLineNum = 3997731;BA.debugLine="Secs_Y = (SinD(Secs_Angle) * Clock_Radius * 0.80)";
_secs_y = (float) ((__c.SinD(_secs_angle)*_clock_radius*0.80)+_clock_y);
RDebugUtils.currentLine=3997734;
 //BA.debugLineNum = 3997734;BA.debugLine="If mShowHoursHand = True Then cv_Clock.DrawLine(C";
if (__ref._mshowhourshand /*boolean*/ ==__c.True) { 
__ref._cv_clock /*anywheresoftware.b4a.objects.B4XCanvas*/ .DrawLine(_clock_x,_clock_y,_hour_x,_hour_y,__ref._mhourshandcolor /*int*/ ,(float) (_clock_radius*0.03));};
RDebugUtils.currentLine=3997735;
 //BA.debugLineNum = 3997735;BA.debugLine="If mShowMinutesHand = True Then cv_Clock.DrawLine";
if (__ref._mshowminuteshand /*boolean*/ ==__c.True) { 
__ref._cv_clock /*anywheresoftware.b4a.objects.B4XCanvas*/ .DrawLine(_clock_x,_clock_y,_mins_x,_mins_y,__ref._mminuteshandcolor /*int*/ ,(float) (_clock_radius*0.03));};
RDebugUtils.currentLine=3997736;
 //BA.debugLineNum = 3997736;BA.debugLine="If mShowSecondsHand = True Then cv_Clock.DrawLine";
if (__ref._mshowsecondshand /*boolean*/ ==__c.True) { 
__ref._cv_clock /*anywheresoftware.b4a.objects.B4XCanvas*/ .DrawLine(_clock_x,_clock_y,_secs_x,_secs_y,__ref._msecondshandcolor /*int*/ ,(float) (_clock_radius*0.01));};
RDebugUtils.currentLine=3997738;
 //BA.debugLineNum = 3997738;BA.debugLine="cv_Clock.Invalidate";
__ref._cv_clock /*anywheresoftware.b4a.objects.B4XCanvas*/ .Invalidate();
RDebugUtils.currentLine=3997740;
 //BA.debugLineNum = 3997740;BA.debugLine="End Sub";
return "";
}
public int  _getcornercolor(b4j.example.asclock __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="asclock";
if (Debug.shouldDelegate(ba, "getcornercolor", true))
	 {return ((Integer) Debug.delegate(ba, "getcornercolor", null));}
RDebugUtils.currentLine=4718592;
 //BA.debugLineNum = 4718592;BA.debugLine="Public Sub getCornerColor As Int";
RDebugUtils.currentLine=4718593;
 //BA.debugLineNum = 4718593;BA.debugLine="Return mCornerColor";
if (true) return __ref._mcornercolor /*int*/ ;
RDebugUtils.currentLine=4718594;
 //BA.debugLineNum = 4718594;BA.debugLine="End Sub";
return 0;
}
public float  _getcornerwidth(b4j.example.asclock __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="asclock";
if (Debug.shouldDelegate(ba, "getcornerwidth", true))
	 {return ((Float) Debug.delegate(ba, "getcornerwidth", null));}
RDebugUtils.currentLine=4849664;
 //BA.debugLineNum = 4849664;BA.debugLine="Public Sub getCornerWidth As Float";
RDebugUtils.currentLine=4849665;
 //BA.debugLineNum = 4849665;BA.debugLine="Return mCornerWidth";
if (true) return __ref._mcornerwidth /*float*/ ;
RDebugUtils.currentLine=4849666;
 //BA.debugLineNum = 4849666;BA.debugLine="End Sub";
return 0f;
}
public int  _getinnercolor(b4j.example.asclock __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="asclock";
if (Debug.shouldDelegate(ba, "getinnercolor", true))
	 {return ((Integer) Debug.delegate(ba, "getinnercolor", null));}
RDebugUtils.currentLine=4587520;
 //BA.debugLineNum = 4587520;BA.debugLine="Public Sub getInnerColor As Int";
RDebugUtils.currentLine=4587521;
 //BA.debugLineNum = 4587521;BA.debugLine="Return mInnerColor";
if (true) return __ref._minnercolor /*int*/ ;
RDebugUtils.currentLine=4587522;
 //BA.debugLineNum = 4587522;BA.debugLine="End Sub";
return 0;
}
public String  _getmiddletext(b4j.example.asclock __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="asclock";
if (Debug.shouldDelegate(ba, "getmiddletext", true))
	 {return ((String) Debug.delegate(ba, "getmiddletext", null));}
RDebugUtils.currentLine=4456448;
 //BA.debugLineNum = 4456448;BA.debugLine="Public Sub getMiddleText As String";
RDebugUtils.currentLine=4456449;
 //BA.debugLineNum = 4456449;BA.debugLine="Return mMiddleText";
if (true) return __ref._mmiddletext /*String*/ ;
RDebugUtils.currentLine=4456450;
 //BA.debugLineNum = 4456450;BA.debugLine="End Sub";
return "";
}
public b4j.example.asclock._asclock_middletextproperties  _getmiddletextproperties(b4j.example.asclock __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="asclock";
if (Debug.shouldDelegate(ba, "getmiddletextproperties", true))
	 {return ((b4j.example.asclock._asclock_middletextproperties) Debug.delegate(ba, "getmiddletextproperties", null));}
RDebugUtils.currentLine=4390912;
 //BA.debugLineNum = 4390912;BA.debugLine="Public Sub getMiddleTextProperties As ASClock_Midd";
RDebugUtils.currentLine=4390913;
 //BA.debugLineNum = 4390913;BA.debugLine="Return m_MiddleTextProperties";
if (true) return __ref._m_middletextproperties /*b4j.example.asclock._asclock_middletextproperties*/ ;
RDebugUtils.currentLine=4390914;
 //BA.debugLineNum = 4390914;BA.debugLine="End Sub";
return null;
}
public int  _getscalecolor(b4j.example.asclock __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="asclock";
if (Debug.shouldDelegate(ba, "getscalecolor", true))
	 {return ((Integer) Debug.delegate(ba, "getscalecolor", null));}
RDebugUtils.currentLine=4128768;
 //BA.debugLineNum = 4128768;BA.debugLine="Public Sub getScaleColor As Int";
RDebugUtils.currentLine=4128769;
 //BA.debugLineNum = 4128769;BA.debugLine="Return mScaleColor";
if (true) return __ref._mscalecolor /*int*/ ;
RDebugUtils.currentLine=4128770;
 //BA.debugLineNum = 4128770;BA.debugLine="End Sub";
return 0;
}
public boolean  _getshowdialtext(b4j.example.asclock __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="asclock";
if (Debug.shouldDelegate(ba, "getshowdialtext", true))
	 {return ((Boolean) Debug.delegate(ba, "getshowdialtext", null));}
RDebugUtils.currentLine=4980736;
 //BA.debugLineNum = 4980736;BA.debugLine="Public Sub getShowDialText As Boolean";
RDebugUtils.currentLine=4980737;
 //BA.debugLineNum = 4980737;BA.debugLine="Return mShowDialText";
if (true) return __ref._mshowdialtext /*boolean*/ ;
RDebugUtils.currentLine=4980738;
 //BA.debugLineNum = 4980738;BA.debugLine="End Sub";
return false;
}
public boolean  _getshowhourmark(b4j.example.asclock __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="asclock";
if (Debug.shouldDelegate(ba, "getshowhourmark", true))
	 {return ((Boolean) Debug.delegate(ba, "getshowhourmark", null));}
RDebugUtils.currentLine=5111808;
 //BA.debugLineNum = 5111808;BA.debugLine="Public Sub getShowHourMark As Boolean";
RDebugUtils.currentLine=5111809;
 //BA.debugLineNum = 5111809;BA.debugLine="Return mShowHourMark";
if (true) return __ref._mshowhourmark /*boolean*/ ;
RDebugUtils.currentLine=5111810;
 //BA.debugLineNum = 5111810;BA.debugLine="End Sub";
return false;
}
public boolean  _getshowminutesmark(b4j.example.asclock __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="asclock";
if (Debug.shouldDelegate(ba, "getshowminutesmark", true))
	 {return ((Boolean) Debug.delegate(ba, "getshowminutesmark", null));}
RDebugUtils.currentLine=5242880;
 //BA.debugLineNum = 5242880;BA.debugLine="Public Sub getShowMinutesMark As Boolean";
RDebugUtils.currentLine=5242881;
 //BA.debugLineNum = 5242881;BA.debugLine="Return mShowMinutesMark";
if (true) return __ref._mshowminutesmark /*boolean*/ ;
RDebugUtils.currentLine=5242882;
 //BA.debugLineNum = 5242882;BA.debugLine="End Sub";
return false;
}
public boolean  _getsweephands(b4j.example.asclock __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="asclock";
if (Debug.shouldDelegate(ba, "getsweephands", true))
	 {return ((Boolean) Debug.delegate(ba, "getsweephands", null));}
RDebugUtils.currentLine=4194304;
 //BA.debugLineNum = 4194304;BA.debugLine="Public Sub getSweepHands As Boolean";
RDebugUtils.currentLine=4194305;
 //BA.debugLineNum = 4194305;BA.debugLine="Return mSweepHands";
if (true) return __ref._msweephands /*boolean*/ ;
RDebugUtils.currentLine=4194306;
 //BA.debugLineNum = 4194306;BA.debugLine="End Sub";
return false;
}
public String  _initialize(b4j.example.asclock __ref,anywheresoftware.b4a.BA _ba,Object _callback,String _eventname) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="asclock";
if (Debug.shouldDelegate(ba, "initialize", true))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_callback,_eventname}));}
RDebugUtils.currentLine=3735552;
 //BA.debugLineNum = 3735552;BA.debugLine="Public Sub Initialize (Callback As Object, EventNa";
RDebugUtils.currentLine=3735553;
 //BA.debugLineNum = 3735553;BA.debugLine="mEventName = EventName";
__ref._meventname /*String*/  = _eventname;
RDebugUtils.currentLine=3735554;
 //BA.debugLineNum = 3735554;BA.debugLine="mCallBack = Callback";
__ref._mcallback /*Object*/  = _callback;
RDebugUtils.currentLine=3735555;
 //BA.debugLineNum = 3735555;BA.debugLine="End Sub";
return "";
}
public String  _setcornercolor(b4j.example.asclock __ref,int _color) throws Exception{
__ref = this;
RDebugUtils.currentModule="asclock";
if (Debug.shouldDelegate(ba, "setcornercolor", true))
	 {return ((String) Debug.delegate(ba, "setcornercolor", new Object[] {_color}));}
RDebugUtils.currentLine=4784128;
 //BA.debugLineNum = 4784128;BA.debugLine="Public Sub setCornerColor(Color As Int)";
RDebugUtils.currentLine=4784129;
 //BA.debugLineNum = 4784129;BA.debugLine="mCornerColor = Color";
__ref._mcornercolor /*int*/  = _color;
RDebugUtils.currentLine=4784130;
 //BA.debugLineNum = 4784130;BA.debugLine="Draw";
__ref._draw /*String*/ (null);
RDebugUtils.currentLine=4784131;
 //BA.debugLineNum = 4784131;BA.debugLine="End Sub";
return "";
}
public String  _setcornerwidth(b4j.example.asclock __ref,float _cornerwidth) throws Exception{
__ref = this;
RDebugUtils.currentModule="asclock";
if (Debug.shouldDelegate(ba, "setcornerwidth", true))
	 {return ((String) Debug.delegate(ba, "setcornerwidth", new Object[] {_cornerwidth}));}
RDebugUtils.currentLine=4915200;
 //BA.debugLineNum = 4915200;BA.debugLine="Public Sub setCornerWidth(CornerWidth As Float)";
RDebugUtils.currentLine=4915201;
 //BA.debugLineNum = 4915201;BA.debugLine="mCornerWidth = CornerWidth";
__ref._mcornerwidth /*float*/  = _cornerwidth;
RDebugUtils.currentLine=4915202;
 //BA.debugLineNum = 4915202;BA.debugLine="Draw";
__ref._draw /*String*/ (null);
RDebugUtils.currentLine=4915203;
 //BA.debugLineNum = 4915203;BA.debugLine="End Sub";
return "";
}
public String  _setinnercolor(b4j.example.asclock __ref,int _color) throws Exception{
__ref = this;
RDebugUtils.currentModule="asclock";
if (Debug.shouldDelegate(ba, "setinnercolor", true))
	 {return ((String) Debug.delegate(ba, "setinnercolor", new Object[] {_color}));}
RDebugUtils.currentLine=4653056;
 //BA.debugLineNum = 4653056;BA.debugLine="Public Sub setInnerColor(Color As Int)";
RDebugUtils.currentLine=4653057;
 //BA.debugLineNum = 4653057;BA.debugLine="mInnerColor = Color";
__ref._minnercolor /*int*/  = _color;
RDebugUtils.currentLine=4653058;
 //BA.debugLineNum = 4653058;BA.debugLine="Draw";
__ref._draw /*String*/ (null);
RDebugUtils.currentLine=4653059;
 //BA.debugLineNum = 4653059;BA.debugLine="End Sub";
return "";
}
public String  _setmiddletext(b4j.example.asclock __ref,String _text) throws Exception{
__ref = this;
RDebugUtils.currentModule="asclock";
if (Debug.shouldDelegate(ba, "setmiddletext", true))
	 {return ((String) Debug.delegate(ba, "setmiddletext", new Object[] {_text}));}
RDebugUtils.currentLine=4521984;
 //BA.debugLineNum = 4521984;BA.debugLine="Public Sub setMiddleText(Text As String)";
RDebugUtils.currentLine=4521985;
 //BA.debugLineNum = 4521985;BA.debugLine="mMiddleText = Text";
__ref._mmiddletext /*String*/  = _text;
RDebugUtils.currentLine=4521986;
 //BA.debugLineNum = 4521986;BA.debugLine="Draw";
__ref._draw /*String*/ (null);
RDebugUtils.currentLine=4521987;
 //BA.debugLineNum = 4521987;BA.debugLine="End Sub";
return "";
}
public String  _setscalecolor(b4j.example.asclock __ref,int _color) throws Exception{
__ref = this;
RDebugUtils.currentModule="asclock";
if (Debug.shouldDelegate(ba, "setscalecolor", true))
	 {return ((String) Debug.delegate(ba, "setscalecolor", new Object[] {_color}));}
RDebugUtils.currentLine=4063232;
 //BA.debugLineNum = 4063232;BA.debugLine="Public Sub setScaleColor(Color As Int)";
RDebugUtils.currentLine=4063233;
 //BA.debugLineNum = 4063233;BA.debugLine="mScaleColor = Color";
__ref._mscalecolor /*int*/  = _color;
RDebugUtils.currentLine=4063234;
 //BA.debugLineNum = 4063234;BA.debugLine="Draw";
__ref._draw /*String*/ (null);
RDebugUtils.currentLine=4063235;
 //BA.debugLineNum = 4063235;BA.debugLine="End Sub";
return "";
}
public String  _setshowdialtext(b4j.example.asclock __ref,boolean _show) throws Exception{
__ref = this;
RDebugUtils.currentModule="asclock";
if (Debug.shouldDelegate(ba, "setshowdialtext", true))
	 {return ((String) Debug.delegate(ba, "setshowdialtext", new Object[] {_show}));}
RDebugUtils.currentLine=5046272;
 //BA.debugLineNum = 5046272;BA.debugLine="Public Sub setShowDialText(Show As Boolean)";
RDebugUtils.currentLine=5046273;
 //BA.debugLineNum = 5046273;BA.debugLine="mShowDialText = Show";
__ref._mshowdialtext /*boolean*/  = _show;
RDebugUtils.currentLine=5046274;
 //BA.debugLineNum = 5046274;BA.debugLine="Draw";
__ref._draw /*String*/ (null);
RDebugUtils.currentLine=5046275;
 //BA.debugLineNum = 5046275;BA.debugLine="End Sub";
return "";
}
public String  _setshowhourmark(b4j.example.asclock __ref,boolean _show) throws Exception{
__ref = this;
RDebugUtils.currentModule="asclock";
if (Debug.shouldDelegate(ba, "setshowhourmark", true))
	 {return ((String) Debug.delegate(ba, "setshowhourmark", new Object[] {_show}));}
RDebugUtils.currentLine=5177344;
 //BA.debugLineNum = 5177344;BA.debugLine="Public Sub setShowHourMark(Show As Boolean)";
RDebugUtils.currentLine=5177345;
 //BA.debugLineNum = 5177345;BA.debugLine="mShowHourMark = Show";
__ref._mshowhourmark /*boolean*/  = _show;
RDebugUtils.currentLine=5177346;
 //BA.debugLineNum = 5177346;BA.debugLine="Draw";
__ref._draw /*String*/ (null);
RDebugUtils.currentLine=5177347;
 //BA.debugLineNum = 5177347;BA.debugLine="End Sub";
return "";
}
public String  _setshowminutesmark(b4j.example.asclock __ref,boolean _show) throws Exception{
__ref = this;
RDebugUtils.currentModule="asclock";
if (Debug.shouldDelegate(ba, "setshowminutesmark", true))
	 {return ((String) Debug.delegate(ba, "setshowminutesmark", new Object[] {_show}));}
RDebugUtils.currentLine=5308416;
 //BA.debugLineNum = 5308416;BA.debugLine="Public Sub setShowMinutesMark(Show As Boolean)";
RDebugUtils.currentLine=5308417;
 //BA.debugLineNum = 5308417;BA.debugLine="mShowMinutesMark = Show";
__ref._mshowminutesmark /*boolean*/  = _show;
RDebugUtils.currentLine=5308418;
 //BA.debugLineNum = 5308418;BA.debugLine="Draw";
__ref._draw /*String*/ (null);
RDebugUtils.currentLine=5308419;
 //BA.debugLineNum = 5308419;BA.debugLine="End Sub";
return "";
}
public String  _setsweephands(b4j.example.asclock __ref,boolean _sweep) throws Exception{
__ref = this;
RDebugUtils.currentModule="asclock";
if (Debug.shouldDelegate(ba, "setsweephands", true))
	 {return ((String) Debug.delegate(ba, "setsweephands", new Object[] {_sweep}));}
RDebugUtils.currentLine=4259840;
 //BA.debugLineNum = 4259840;BA.debugLine="Public Sub setSweepHands(Sweep As Boolean)";
RDebugUtils.currentLine=4259841;
 //BA.debugLineNum = 4259841;BA.debugLine="mSweepHands = Sweep";
__ref._msweephands /*boolean*/  = _sweep;
RDebugUtils.currentLine=4259842;
 //BA.debugLineNum = 4259842;BA.debugLine="Draw";
__ref._draw /*String*/ (null);
RDebugUtils.currentLine=4259843;
 //BA.debugLineNum = 4259843;BA.debugLine="End Sub";
return "";
}
public String  _settime(b4j.example.asclock __ref,int _hour,int _mins,int _secs) throws Exception{
__ref = this;
RDebugUtils.currentModule="asclock";
if (Debug.shouldDelegate(ba, "settime", true))
	 {return ((String) Debug.delegate(ba, "settime", new Object[] {_hour,_mins,_secs}));}
RDebugUtils.currentLine=4325376;
 //BA.debugLineNum = 4325376;BA.debugLine="Public Sub SetTime(Hour As Int,Mins As Int,Secs As";
RDebugUtils.currentLine=4325377;
 //BA.debugLineNum = 4325377;BA.debugLine="mHour = Hour";
__ref._mhour /*int*/  = _hour;
RDebugUtils.currentLine=4325378;
 //BA.debugLineNum = 4325378;BA.debugLine="mMin = Mins";
__ref._mmin /*int*/  = _mins;
RDebugUtils.currentLine=4325379;
 //BA.debugLineNum = 4325379;BA.debugLine="mSec = Secs";
__ref._msec /*int*/  = _secs;
RDebugUtils.currentLine=4325380;
 //BA.debugLineNum = 4325380;BA.debugLine="Draw";
__ref._draw /*String*/ (null);
RDebugUtils.currentLine=4325381;
 //BA.debugLineNum = 4325381;BA.debugLine="End Sub";
return "";
}
}