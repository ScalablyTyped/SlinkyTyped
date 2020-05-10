package typingsSlinky.winrtUwp.Windows.UI.Input

import typingsSlinky.winrtUwp.Windows.Foundation.Point
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains the velocities of the accumulated transformations for the current interaction. */
@js.native
trait ManipulationVelocities extends js.Object {
  /** The rotational velocity in degrees per millisecond. */
  var angular: Double = js.native
  /** The expansion, or scaling, velocity in DIPs per millisecond. */
  var expansion: Double = js.native
  /** The straight line velocity in DIPs per millisecond. */
  var linear: Point = js.native
}

object ManipulationVelocities {
  @scala.inline
  def apply(angular: Double, expansion: Double, linear: Point): ManipulationVelocities = {
    val __obj = js.Dynamic.literal(angular = angular.asInstanceOf[js.Any], expansion = expansion.asInstanceOf[js.Any], linear = linear.asInstanceOf[js.Any])
    __obj.asInstanceOf[ManipulationVelocities]
  }
  @scala.inline
  implicit class ManipulationVelocitiesOps[Self <: ManipulationVelocities] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAngular(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("angular")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExpansion(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expansion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLinear(value: Point): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linear")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

