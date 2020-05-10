package typingsSlinky.winrt.Windows.UI.Input

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPointerVisualizationSettings extends js.Object {
  var isBarrelButtonFeedbackEnabled: Boolean = js.native
  var isContactFeedbackEnabled: Boolean = js.native
}

object IPointerVisualizationSettings {
  @scala.inline
  def apply(isBarrelButtonFeedbackEnabled: Boolean, isContactFeedbackEnabled: Boolean): IPointerVisualizationSettings = {
    val __obj = js.Dynamic.literal(isBarrelButtonFeedbackEnabled = isBarrelButtonFeedbackEnabled.asInstanceOf[js.Any], isContactFeedbackEnabled = isContactFeedbackEnabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPointerVisualizationSettings]
  }
  @scala.inline
  implicit class IPointerVisualizationSettingsOps[Self <: IPointerVisualizationSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIsBarrelButtonFeedbackEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isBarrelButtonFeedbackEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsContactFeedbackEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isContactFeedbackEnabled")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

