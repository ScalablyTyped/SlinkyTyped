package typingsSlinky.winrtUwp.Windows.UI.Input.Spatial

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SpatialRecognitionStartedEventArgs extends js.Object {
  var interactionSourceKind: js.Any = js.native
   /* unmapped type */ var isGesturePossible: js.Any = js.native
   /* unmapped type */ var tryGetPointerPose: js.Any = js.native
}

object SpatialRecognitionStartedEventArgs {
  @scala.inline
  def apply(interactionSourceKind: js.Any, isGesturePossible: js.Any, tryGetPointerPose: js.Any): SpatialRecognitionStartedEventArgs = {
    val __obj = js.Dynamic.literal(interactionSourceKind = interactionSourceKind.asInstanceOf[js.Any], isGesturePossible = isGesturePossible.asInstanceOf[js.Any], tryGetPointerPose = tryGetPointerPose.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpatialRecognitionStartedEventArgs]
  }
  @scala.inline
  implicit class SpatialRecognitionStartedEventArgsOps[Self <: SpatialRecognitionStartedEventArgs] (val x: Self) extends AnyVal {
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
    def withIsGesturePossible(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isGesturePossible")(value.asInstanceOf[js.Any])
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

