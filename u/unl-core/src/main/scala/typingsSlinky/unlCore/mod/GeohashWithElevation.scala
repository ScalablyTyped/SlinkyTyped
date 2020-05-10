package typingsSlinky.unlCore.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GeohashWithElevation extends js.Object {
  var elevation: Double = js.native
  var elevationType: ElevationType = js.native
  var geohash: String = js.native
}

object GeohashWithElevation {
  @scala.inline
  def apply(elevation: Double, elevationType: ElevationType, geohash: String): GeohashWithElevation = {
    val __obj = js.Dynamic.literal(elevation = elevation.asInstanceOf[js.Any], elevationType = elevationType.asInstanceOf[js.Any], geohash = geohash.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeohashWithElevation]
  }
  @scala.inline
  implicit class GeohashWithElevationOps[Self <: GeohashWithElevation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withElevation(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("elevation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withElevationType(value: ElevationType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("elevationType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGeohash(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("geohash")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

