package typingsSlinky.titanium

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Simple object holding floor of the building on which the user is located.
  */
@js.native
trait LocationCoordinatesFloor extends js.Object {
  /**
  	 * The logical floor of the building.
  	 */
  var level: js.UndefOr[Double] = js.native
}

object LocationCoordinatesFloor {
  @scala.inline
  def apply(): LocationCoordinatesFloor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LocationCoordinatesFloor]
  }
  @scala.inline
  implicit class LocationCoordinatesFloorOps[Self <: LocationCoordinatesFloor] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLevel(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("level")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLevel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("level")(js.undefined)
        ret
    }
  }
  
}

