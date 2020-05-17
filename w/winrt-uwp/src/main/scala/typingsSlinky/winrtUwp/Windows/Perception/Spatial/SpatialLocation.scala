package typingsSlinky.winrtUwp.Windows.Perception.Spatial

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SpatialLocation extends js.Object {
  var absoluteAngularAcceleration: js.Any = js.native
   /* unmapped type */ var absoluteAngularVelocity: js.Any = js.native
   /* unmapped type */ var absoluteLinearAcceleration: js.Any = js.native
   /* unmapped type */ var absoluteLinearVelocity: js.Any = js.native
   /* unmapped type */ var orientation: js.Any = js.native
   /* unmapped type */ var position: js.Any = js.native
}

object SpatialLocation {
  @scala.inline
  def apply(
    absoluteAngularAcceleration: js.Any,
    absoluteAngularVelocity: js.Any,
    absoluteLinearAcceleration: js.Any,
    absoluteLinearVelocity: js.Any,
    orientation: js.Any,
    position: js.Any
  ): SpatialLocation = {
    val __obj = js.Dynamic.literal(absoluteAngularAcceleration = absoluteAngularAcceleration.asInstanceOf[js.Any], absoluteAngularVelocity = absoluteAngularVelocity.asInstanceOf[js.Any], absoluteLinearAcceleration = absoluteLinearAcceleration.asInstanceOf[js.Any], absoluteLinearVelocity = absoluteLinearVelocity.asInstanceOf[js.Any], orientation = orientation.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpatialLocation]
  }
  @scala.inline
  implicit class SpatialLocationOps[Self <: SpatialLocation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAbsoluteAngularAcceleration(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("absoluteAngularAcceleration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAbsoluteAngularVelocity(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("absoluteAngularVelocity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAbsoluteLinearAcceleration(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("absoluteLinearAcceleration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAbsoluteLinearVelocity(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("absoluteLinearVelocity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOrientation(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orientation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPosition(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

