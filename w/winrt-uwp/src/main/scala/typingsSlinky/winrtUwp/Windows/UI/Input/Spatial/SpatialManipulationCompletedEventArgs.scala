package typingsSlinky.winrtUwp.Windows.UI.Input.Spatial

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SpatialManipulationCompletedEventArgs extends js.Object {
  var interactionSourceKind: js.Any = js.native
   /* unmapped type */ var tryGetCumulativeDelta: js.Any = js.native
}

object SpatialManipulationCompletedEventArgs {
  @scala.inline
  def apply(interactionSourceKind: js.Any, tryGetCumulativeDelta: js.Any): SpatialManipulationCompletedEventArgs = {
    val __obj = js.Dynamic.literal(interactionSourceKind = interactionSourceKind.asInstanceOf[js.Any], tryGetCumulativeDelta = tryGetCumulativeDelta.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpatialManipulationCompletedEventArgs]
  }
  @scala.inline
  implicit class SpatialManipulationCompletedEventArgsOps[Self <: SpatialManipulationCompletedEventArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInteractionSourceKind(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interactionSourceKind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTryGetCumulativeDelta(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tryGetCumulativeDelta")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

