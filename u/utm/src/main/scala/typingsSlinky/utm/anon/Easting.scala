package typingsSlinky.utm.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Easting extends js.Object {
  var easting: Double = js.native
  var northing: Double = js.native
  var zoneLetter: String = js.native
  var zoneNum: Double = js.native
}

object Easting {
  @scala.inline
  def apply(easting: Double, northing: Double, zoneLetter: String, zoneNum: Double): Easting = {
    val __obj = js.Dynamic.literal(easting = easting.asInstanceOf[js.Any], northing = northing.asInstanceOf[js.Any], zoneLetter = zoneLetter.asInstanceOf[js.Any], zoneNum = zoneNum.asInstanceOf[js.Any])
    __obj.asInstanceOf[Easting]
  }
  @scala.inline
  implicit class EastingOps[Self <: Easting] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEasting(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("easting")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNorthing(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("northing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withZoneLetter(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoneLetter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withZoneNum(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoneNum")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

