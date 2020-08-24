package typingsSlinky.suncalc.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetTimesResult extends js.Object {
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
  implicit class GetTimesResultOps[Self <: GetTimesResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDawn(value: js.Date): Self = this.set("dawn", value.asInstanceOf[js.Any])
    @scala.inline
    def setDusk(value: js.Date): Self = this.set("dusk", value.asInstanceOf[js.Any])
    @scala.inline
    def setGoldenHour(value: js.Date): Self = this.set("goldenHour", value.asInstanceOf[js.Any])
    @scala.inline
    def setGoldenHourEnd(value: js.Date): Self = this.set("goldenHourEnd", value.asInstanceOf[js.Any])
    @scala.inline
    def setNadir(value: js.Date): Self = this.set("nadir", value.asInstanceOf[js.Any])
    @scala.inline
    def setNauticalDawn(value: js.Date): Self = this.set("nauticalDawn", value.asInstanceOf[js.Any])
    @scala.inline
    def setNauticalDusk(value: js.Date): Self = this.set("nauticalDusk", value.asInstanceOf[js.Any])
    @scala.inline
    def setNight(value: js.Date): Self = this.set("night", value.asInstanceOf[js.Any])
    @scala.inline
    def setNightEnd(value: js.Date): Self = this.set("nightEnd", value.asInstanceOf[js.Any])
    @scala.inline
    def setSolarNoon(value: js.Date): Self = this.set("solarNoon", value.asInstanceOf[js.Any])
    @scala.inline
    def setSunrise(value: js.Date): Self = this.set("sunrise", value.asInstanceOf[js.Any])
    @scala.inline
    def setSunriseEnd(value: js.Date): Self = this.set("sunriseEnd", value.asInstanceOf[js.Any])
    @scala.inline
    def setSunset(value: js.Date): Self = this.set("sunset", value.asInstanceOf[js.Any])
    @scala.inline
    def setSunsetStart(value: js.Date): Self = this.set("sunsetStart", value.asInstanceOf[js.Any])
  }
  
}

