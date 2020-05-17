package typingsSlinky.winrtUwp.Windows.UI.Input.Spatial

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SpatialInteractionSourceState extends js.Object {
  var isPressed: js.Any = js.native
   /* unmapped type */ var properties: js.Any = js.native
   /* unmapped type */ var source: js.Any = js.native
   /* unmapped type */ var timestamp: js.Any = js.native
   /* unmapped type */ var tryGetPointerPose: js.Any = js.native
}

object SpatialInteractionSourceState {
  @scala.inline
  def apply(
    isPressed: js.Any,
    properties: js.Any,
    source: js.Any,
    timestamp: js.Any,
    tryGetPointerPose: js.Any
  ): SpatialInteractionSourceState = {
    val __obj = js.Dynamic.literal(isPressed = isPressed.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any], tryGetPointerPose = tryGetPointerPose.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpatialInteractionSourceState]
  }
  @scala.inline
  implicit class SpatialInteractionSourceStateOps[Self <: SpatialInteractionSourceState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIsPressed(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isPressed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProperties(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("properties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSource(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTimestamp(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timestamp")(value.asInstanceOf[js.Any])
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

