package typingsSlinky.suncalc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("suncalc", "addTime")
  @js.native
  def addTime(angleInDegrees: Double, morningName: String, eveningName: String): Unit = js.native
  
  @JSImport("suncalc", "getMoonIllumination")
  @js.native
  def getMoonIllumination(timeAndDate: js.Date): GetMoonIlluminationResult = js.native
  
  @JSImport("suncalc", "getMoonPosition")
  @js.native
  def getMoonPosition(timeAndDate: js.Date, latitude: Double, longitude: Double): GetMoonPositionResult = js.native
  
  @JSImport("suncalc", "getMoonTimes")
  @js.native
  def getMoonTimes(date: js.Date, latitude: Double, longitude: Double): GetMoonTimes_ = js.native
  @JSImport("suncalc", "getMoonTimes")
  @js.native
  def getMoonTimes(date: js.Date, latitude: Double, longitude: Double, inUTC: Boolean): GetMoonTimes_ = js.native
  
  @JSImport("suncalc", "getPosition")
  @js.native
  def getPosition(timeAndDate: js.Date, latitude: Double, longitude: Double): GetSunPositionResult = js.native
  
  @JSImport("suncalc", "getTimes")
  @js.native
  def getTimes(date: js.Date, latitude: Double, longitude: Double): GetTimesResult = js.native
  
  @js.native
  trait GetMoonIlluminationResult extends StObject {
    
    var angle: Double = js.native
    
    var fraction: Double = js.native
    
    var phase: Double = js.native
  }
  object GetMoonIlluminationResult {
    
    @scala.inline
    def apply(angle: Double, fraction: Double, phase: Double): GetMoonIlluminationResult = {
      val __obj = js.Dynamic.literal(angle = angle.asInstanceOf[js.Any], fraction = fraction.asInstanceOf[js.Any], phase = phase.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetMoonIlluminationResult]
    }
    
    @scala.inline
    implicit class GetMoonIlluminationResultMutableBuilder[Self <: GetMoonIlluminationResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAngle(value: Double): Self = StObject.set(x, "angle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFraction(value: Double): Self = StObject.set(x, "fraction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPhase(value: Double): Self = StObject.set(x, "phase", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait GetMoonPositionResult extends StObject {
    
    var altitude: Double = js.native
    
    var azimuth: Double = js.native
    
    var distance: Double = js.native
    
    var parallacticAngle: Double = js.native
  }
  object GetMoonPositionResult {
    
    @scala.inline
    def apply(altitude: Double, azimuth: Double, distance: Double, parallacticAngle: Double): GetMoonPositionResult = {
      val __obj = js.Dynamic.literal(altitude = altitude.asInstanceOf[js.Any], azimuth = azimuth.asInstanceOf[js.Any], distance = distance.asInstanceOf[js.Any], parallacticAngle = parallacticAngle.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetMoonPositionResult]
    }
    
    @scala.inline
    implicit class GetMoonPositionResultMutableBuilder[Self <: GetMoonPositionResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAltitude(value: Double): Self = StObject.set(x, "altitude", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAzimuth(value: Double): Self = StObject.set(x, "azimuth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDistance(value: Double): Self = StObject.set(x, "distance", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParallacticAngle(value: Double): Self = StObject.set(x, "parallacticAngle", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait GetMoonTimes_ extends StObject {
    
    var alwaysDown: Boolean = js.native
    
    var alwaysUp: Boolean = js.native
    
    var rise: js.Date = js.native
    
    var set: js.Date = js.native
  }
  object GetMoonTimes_ {
    
    @scala.inline
    def apply(alwaysDown: Boolean, alwaysUp: Boolean, rise: js.Date, set: js.Date): GetMoonTimes_ = {
      val __obj = js.Dynamic.literal(alwaysDown = alwaysDown.asInstanceOf[js.Any], alwaysUp = alwaysUp.asInstanceOf[js.Any], rise = rise.asInstanceOf[js.Any], set = set.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetMoonTimes_]
    }
    
    @scala.inline
    implicit class GetMoonTimes_MutableBuilder[Self <: GetMoonTimes_] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlwaysDown(value: Boolean): Self = StObject.set(x, "alwaysDown", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlwaysUp(value: Boolean): Self = StObject.set(x, "alwaysUp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRise(value: js.Date): Self = StObject.set(x, "rise", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSet(value: js.Date): Self = StObject.set(x, "set", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait GetSunPositionResult extends StObject {
    
    var altitude: Double = js.native
    
    var azimuth: Double = js.native
  }
  object GetSunPositionResult {
    
    @scala.inline
    def apply(altitude: Double, azimuth: Double): GetSunPositionResult = {
      val __obj = js.Dynamic.literal(altitude = altitude.asInstanceOf[js.Any], azimuth = azimuth.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetSunPositionResult]
    }
    
    @scala.inline
    implicit class GetSunPositionResultMutableBuilder[Self <: GetSunPositionResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAltitude(value: Double): Self = StObject.set(x, "altitude", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAzimuth(value: Double): Self = StObject.set(x, "azimuth", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait GetTimesResult extends StObject {
    
    var dawn: js.Date = js.native
    
    var dusk: js.Date = js.native
    
    var goldenHour: js.Date = js.native
    
    var goldenHourEnd: js.Date = js.native
    
    var nadir: js.Date = js.native
    
    var nauticalDawn: js.Date = js.native
    
    var nauticalDusk: js.Date = js.native
    
    var night: js.Date = js.native
    
    var nightEnd: js.Date = js.native
    
    var solarNoon: js.Date = js.native
    
    var sunrise: js.Date = js.native
    
    var sunriseEnd: js.Date = js.native
    
    var sunset: js.Date = js.native
    
    var sunsetStart: js.Date = js.native
  }
  object GetTimesResult {
    
    @scala.inline
    def apply(
      dawn: js.Date,
      dusk: js.Date,
      goldenHour: js.Date,
      goldenHourEnd: js.Date,
      nadir: js.Date,
      nauticalDawn: js.Date,
      nauticalDusk: js.Date,
      night: js.Date,
      nightEnd: js.Date,
      solarNoon: js.Date,
      sunrise: js.Date,
      sunriseEnd: js.Date,
      sunset: js.Date,
      sunsetStart: js.Date
    ): GetTimesResult = {
      val __obj = js.Dynamic.literal(dawn = dawn.asInstanceOf[js.Any], dusk = dusk.asInstanceOf[js.Any], goldenHour = goldenHour.asInstanceOf[js.Any], goldenHourEnd = goldenHourEnd.asInstanceOf[js.Any], nadir = nadir.asInstanceOf[js.Any], nauticalDawn = nauticalDawn.asInstanceOf[js.Any], nauticalDusk = nauticalDusk.asInstanceOf[js.Any], night = night.asInstanceOf[js.Any], nightEnd = nightEnd.asInstanceOf[js.Any], solarNoon = solarNoon.asInstanceOf[js.Any], sunrise = sunrise.asInstanceOf[js.Any], sunriseEnd = sunriseEnd.asInstanceOf[js.Any], sunset = sunset.asInstanceOf[js.Any], sunsetStart = sunsetStart.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetTimesResult]
    }
    
    @scala.inline
    implicit class GetTimesResultMutableBuilder[Self <: GetTimesResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDawn(value: js.Date): Self = StObject.set(x, "dawn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDusk(value: js.Date): Self = StObject.set(x, "dusk", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGoldenHour(value: js.Date): Self = StObject.set(x, "goldenHour", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGoldenHourEnd(value: js.Date): Self = StObject.set(x, "goldenHourEnd", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNadir(value: js.Date): Self = StObject.set(x, "nadir", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNauticalDawn(value: js.Date): Self = StObject.set(x, "nauticalDawn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNauticalDusk(value: js.Date): Self = StObject.set(x, "nauticalDusk", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNight(value: js.Date): Self = StObject.set(x, "night", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNightEnd(value: js.Date): Self = StObject.set(x, "nightEnd", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSolarNoon(value: js.Date): Self = StObject.set(x, "solarNoon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSunrise(value: js.Date): Self = StObject.set(x, "sunrise", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSunriseEnd(value: js.Date): Self = StObject.set(x, "sunriseEnd", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSunset(value: js.Date): Self = StObject.set(x, "sunset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSunsetStart(value: js.Date): Self = StObject.set(x, "sunsetStart", value.asInstanceOf[js.Any])
    }
  }
}
