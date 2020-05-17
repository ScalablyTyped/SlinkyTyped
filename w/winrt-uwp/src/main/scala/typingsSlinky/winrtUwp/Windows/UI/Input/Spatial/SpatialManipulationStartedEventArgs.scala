package typingsSlinky.winrtUwp.Windows.UI.Input.Spatial

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SpatialManipulationStartedEventArgs extends js.Object {
  var interactionSourceKind: js.Any = js.native
   /* unmapped type */ var tryGetPointerPose: js.Any = js.native
}

object SpatialManipulationStartedEventArgs {
  @scala.inline
  def apply(interactionSourceKind: js.Any, tryGetPointerPose: js.Any): SpatialManipulationStartedEventArgs = {
    val __obj = js.Dynamic.literal(interactionSourceKind = interactionSourceKind.asInstanceOf[js.Any], tryGetPointerPose = tryGetPointerPose.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpatialManipulationStartedEventArgs]
  }
  @scala.inline
  implicit class SpatialManipulationStartedEventArgsOps[Self <: SpatialManipulationStartedEventArgs] (val x: Self) extends AnyVal {
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
    def withTryGetPointerPose(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tryGetPointerPose")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

