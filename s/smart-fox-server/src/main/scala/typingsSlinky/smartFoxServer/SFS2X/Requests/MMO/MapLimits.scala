package typingsSlinky.smartFoxServer.SFS2X.Requests.MMO

import typingsSlinky.smartFoxServer.SFS2X.Entities.Data.Vec3D
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MapLimits extends js.Object {
  /** @type {Entities.Data.Vec3D} Returns the higher coordinates limit of the virtual environment along the X,Y,Z axes. */
  var higherLimit: Vec3D = js.native
  /** @type {Entities.Data.Vec3D} Returns the lower coordinates limit of the virtual environment along the X,Y,Z axes. */
  var lowerLimit: Vec3D = js.native
}

object MapLimits {
  @scala.inline
  def apply(higherLimit: Vec3D, lowerLimit: Vec3D): MapLimits = {
    val __obj = js.Dynamic.literal(higherLimit = higherLimit.asInstanceOf[js.Any], lowerLimit = lowerLimit.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapLimits]
  }
  @scala.inline
  implicit class MapLimitsOps[Self <: MapLimits] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHigherLimit(value: Vec3D): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("higherLimit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLowerLimit(value: Vec3D): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lowerLimit")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

