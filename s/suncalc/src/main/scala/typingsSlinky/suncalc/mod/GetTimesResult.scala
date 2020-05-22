package typingsSlinky.suncalc.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetTimesResult extends js.Object {
  var dawn: js.Date
  var dusk: js.Date
  var goldenHour: js.Date
  var goldenHourEnd: js.Date
  var nadir: js.Date
  var nauticalDawn: js.Date
  var nauticalDusk: js.Date
  var night: js.Date
  var nightEnd: js.Date
  var solarNoon: js.Date
  var sunrise: js.Date
  var sunriseEnd: js.Date
  var sunset: js.Date
  var sunsetStart: js.Date
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
}

