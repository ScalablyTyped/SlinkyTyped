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
    def withDawn(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dawn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDusk(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dusk")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGoldenHour(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("goldenHour")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGoldenHourEnd(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("goldenHourEnd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNadir(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nadir")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNauticalDawn(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nauticalDawn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNauticalDusk(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nauticalDusk")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNight(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("night")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNightEnd(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nightEnd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSolarNoon(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("solarNoon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSunrise(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sunrise")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSunriseEnd(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sunriseEnd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSunset(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sunset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSunsetStart(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sunsetStart")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

