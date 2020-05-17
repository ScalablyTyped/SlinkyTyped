package typingsSlinky.winrtUwp.Windows.UI.Input

import typingsSlinky.winrtUwp.Windows.Devices.Input.PointerDeviceType
import typingsSlinky.winrtUwp.Windows.Foundation.Point
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains event data for the ManipulationCompleted event. */
@js.native
trait ManipulationCompletedEventArgs extends js.Object {
  /** Gets values that indicate the accumulated transformation deltas (translation, rotation, scale) of a completed manipulation (from the start of the manipulation to the end of inertia). */
  var cumulative: ManipulationDelta = js.native
  /** Gets the device type of the input source. */
  var pointerDeviceType: PointerDeviceType = js.native
  /** Gets the location of the pointer associated with the manipulation for the last manipulation event. */
  var position: Point = js.native
  /** Gets values that indicate the velocities of the transformation deltas (translation, rotation, scale) for a manipulation at the ManipulationCompleted event. */
  var velocities: ManipulationVelocities = js.native
}

object ManipulationCompletedEventArgs {
  @scala.inline
  def apply(
    cumulative: ManipulationDelta,
    pointerDeviceType: PointerDeviceType,
    position: Point,
    velocities: ManipulationVelocities
  ): ManipulationCompletedEventArgs = {
    val __obj = js.Dynamic.literal(cumulative = cumulative.asInstanceOf[js.Any], pointerDeviceType = pointerDeviceType.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], velocities = velocities.asInstanceOf[js.Any])
    __obj.asInstanceOf[ManipulationCompletedEventArgs]
  }
  @scala.inline
  implicit class ManipulationCompletedEventArgsOps[Self <: ManipulationCompletedEventArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCumulative(value: ManipulationDelta): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cumulative")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPointerDeviceType(value: PointerDeviceType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pointerDeviceType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPosition(value: Point): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVelocities(value: ManipulationVelocities): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("velocities")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

