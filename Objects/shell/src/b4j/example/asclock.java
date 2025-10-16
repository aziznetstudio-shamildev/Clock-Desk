
package b4j.example;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class asclock {
    public static RemoteObject myClass;
	public asclock() {
	}
    public static PCBA staticBA = new PCBA(null, asclock.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _meventname = RemoteObject.createImmutable("");
public static RemoteObject _mcallback = RemoteObject.declareNull("Object");
public static RemoteObject _mbase = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _xui = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");
public static RemoteObject _tag = RemoteObject.declareNull("Object");
public static RemoteObject _xpnl_background = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _cv_clock = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XCanvas");
public static RemoteObject _m_middletextproperties = RemoteObject.declareNull("b4j.example.asclock._asclock_middletextproperties");
public static RemoteObject _minnercolor = RemoteObject.createImmutable(0);
public static RemoteObject _mcornercolor = RemoteObject.createImmutable(0);
public static RemoteObject _mcornerwidth = RemoteObject.createImmutable(0f);
public static RemoteObject _mshowdialtext = RemoteObject.createImmutable(false);
public static RemoteObject _mshowhourmark = RemoteObject.createImmutable(false);
public static RemoteObject _mshowminutesmark = RemoteObject.createImmutable(false);
public static RemoteObject _mhourshandcolor = RemoteObject.createImmutable(0);
public static RemoteObject _mminuteshandcolor = RemoteObject.createImmutable(0);
public static RemoteObject _msecondshandcolor = RemoteObject.createImmutable(0);
public static RemoteObject _mscalecolor = RemoteObject.createImmutable(0);
public static RemoteObject _mshowhourshand = RemoteObject.createImmutable(false);
public static RemoteObject _mshowminuteshand = RemoteObject.createImmutable(false);
public static RemoteObject _mshowsecondshand = RemoteObject.createImmutable(false);
public static RemoteObject _msweephands = RemoteObject.createImmutable(false);
public static RemoteObject _mclockmode = RemoteObject.createImmutable("");
public static RemoteObject _mmiddletext = RemoteObject.createImmutable("");
public static RemoteObject _mhour = RemoteObject.createImmutable(0);
public static RemoteObject _mmin = RemoteObject.createImmutable(0);
public static RemoteObject _msec = RemoteObject.createImmutable(0);
public static RemoteObject _circlerect = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XCanvas.B4XRect");
public static b4j.example.main _main = null;
public static b4j.example.httputils2service _httputils2service = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"CircleRect",_ref.getField(false, "_circlerect"),"cv_Clock",_ref.getField(false, "_cv_clock"),"m_MiddleTextProperties",_ref.getField(false, "_m_middletextproperties"),"mBase",_ref.getField(false, "_mbase"),"mCallBack",_ref.getField(false, "_mcallback"),"mClockMode",_ref.getField(false, "_mclockmode"),"mCornerColor",_ref.getField(false, "_mcornercolor"),"mCornerWidth",_ref.getField(false, "_mcornerwidth"),"mEventName",_ref.getField(false, "_meventname"),"mHour",_ref.getField(false, "_mhour"),"mHoursHandColor",_ref.getField(false, "_mhourshandcolor"),"mInnerColor",_ref.getField(false, "_minnercolor"),"mMiddleText",_ref.getField(false, "_mmiddletext"),"mMin",_ref.getField(false, "_mmin"),"mMinutesHandColor",_ref.getField(false, "_mminuteshandcolor"),"mScaleColor",_ref.getField(false, "_mscalecolor"),"mSec",_ref.getField(false, "_msec"),"mSecondsHandColor",_ref.getField(false, "_msecondshandcolor"),"mShowDialText",_ref.getField(false, "_mshowdialtext"),"mShowHourMark",_ref.getField(false, "_mshowhourmark"),"mShowHoursHand",_ref.getField(false, "_mshowhourshand"),"mShowMinutesHand",_ref.getField(false, "_mshowminuteshand"),"mShowMinutesMark",_ref.getField(false, "_mshowminutesmark"),"mShowSecondsHand",_ref.getField(false, "_mshowsecondshand"),"mSweepHands",_ref.getField(false, "_msweephands"),"Tag",_ref.getField(false, "_tag"),"xpnl_Background",_ref.getField(false, "_xpnl_background"),"xui",_ref.getField(false, "_xui")};
}
}