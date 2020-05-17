package typingsSlinky.winrtUwp.Windows.UI.Input

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides access to the visual feedback settings for pointer input. */
@js.native
trait PointerVisualizationSettings extends js.Object {
  /** Gets or sets a value that indicates whether visual feedback is enabled for pen/stylus input when the barrel button is pressed. */
  var isBarrelButtonFeedbackEnabled: Boolean = js.native
  /** Gets or sets a value that indicates whether visual feedback is enabled when a pointer contact is detected. */
  var isContactFeedbackEnabled: Boolean = js.native
}

object PointerVisualizationSettings {
  @scala.inline
  def apply(isBarrelButtonFeedbackEnabled: Boolean, isContactFeedbackEnabled: Boolean): PointerVisualizationSettings = {
    val __obj = js.Dynamic.literal(isBarrelButtonFeedbackEnabled = isBarrelButtonFeedbackEnabled.asInstanceOf[js.Any], isContactFeedbackEnabled = isContactFeedbackEnabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[PointerVisualizationSettings]
  }
  @scala.inline
  implicit class PointerVisualizationSettingsOps[Self <: PointerVisualizationSettings] (val x: Self) extends AnyVal {
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

