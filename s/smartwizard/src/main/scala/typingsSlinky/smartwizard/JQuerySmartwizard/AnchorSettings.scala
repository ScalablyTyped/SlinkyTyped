package typingsSlinky.smartwizard.JQuerySmartwizard

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnchorSettings extends js.Object {
  var anchorClickable: js.UndefOr[Boolean] = js.native
  var enableAllAnchors: js.UndefOr[Boolean] = js.native
  var enableAnchorOnDoneStep: js.UndefOr[Boolean] = js.native
  var markAllPreviousStepsAsDone: js.UndefOr[Boolean] = js.native
  var markDoneStep: js.UndefOr[Boolean] = js.native
  var removeDoneStepOnNavigateBack: js.UndefOr[Boolean] = js.native
}

object AnchorSettings {
  @scala.inline
  def apply(): AnchorSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnchorSettings]
  }
  @scala.inline
  implicit class AnchorSettingsOps[Self <: AnchorSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnchorClickable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("anchorClickable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnchorClickable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("anchorClickable")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableAllAnchors(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableAllAnchors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableAllAnchors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableAllAnchors")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableAnchorOnDoneStep(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableAnchorOnDoneStep")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableAnchorOnDoneStep: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableAnchorOnDoneStep")(js.undefined)
        ret
    }
    @scala.inline
    def withMarkAllPreviousStepsAsDone(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("markAllPreviousStepsAsDone")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMarkAllPreviousStepsAsDone: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("markAllPreviousStepsAsDone")(js.undefined)
        ret
    }
    @scala.inline
    def withMarkDoneStep(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("markDoneStep")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMarkDoneStep: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("markDoneStep")(js.undefined)
        ret
    }
    @scala.inline
    def withRemoveDoneStepOnNavigateBack(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeDoneStepOnNavigateBack")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRemoveDoneStepOnNavigateBack: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeDoneStepOnNavigateBack")(js.undefined)
        ret
    }
  }
  
}

