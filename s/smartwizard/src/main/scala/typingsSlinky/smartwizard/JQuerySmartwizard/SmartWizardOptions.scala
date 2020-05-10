package typingsSlinky.smartwizard.JQuerySmartwizard

import typingsSlinky.jquery.JQueryAjaxSettings
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SmartWizardOptions extends js.Object {
  var ajaxSettings: js.UndefOr[JQueryAjaxSettings] = js.native
  var anchorSettings: js.UndefOr[AnchorSettings] = js.native
  var autoAdjustHeight: js.UndefOr[Boolean] = js.native
  var backButtonSupport: js.UndefOr[Boolean] = js.native
  var contentCache: js.UndefOr[Boolean] = js.native
  var contentURL: js.UndefOr[Null | String] = js.native
  var cycleSteps: js.UndefOr[Boolean] = js.native
  var disabledSteps: js.UndefOr[js.Array[Double]] = js.native
  var errorSteps: js.UndefOr[js.Array[Double]] = js.native
  var hiddenSteps: js.UndefOr[js.Array[Double]] = js.native
  var keyNavigation: js.UndefOr[Boolean] = js.native
  var lang: js.UndefOr[Lang] = js.native
  var selected: js.UndefOr[Double] = js.native
  var showStepURLhash: js.UndefOr[Boolean] = js.native
  var theme: js.UndefOr[String] = js.native
  var toolbarSettings: js.UndefOr[ToolbarSettings] = js.native
  var transitionEffect: js.UndefOr[TransitionEffect] = js.native
  var transitionSpeed: js.UndefOr[String | Double] = js.native
  var useURLhash: js.UndefOr[Boolean] = js.native
}

object SmartWizardOptions {
  @scala.inline
  def apply(): SmartWizardOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SmartWizardOptions]
  }
  @scala.inline
  implicit class SmartWizardOptionsOps[Self <: SmartWizardOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAjaxSettings(value: JQueryAjaxSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ajaxSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAjaxSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ajaxSettings")(js.undefined)
        ret
    }
    @scala.inline
    def withAnchorSettings(value: AnchorSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("anchorSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnchorSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("anchorSettings")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoAdjustHeight(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoAdjustHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoAdjustHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoAdjustHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withBackButtonSupport(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backButtonSupport")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBackButtonSupport: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backButtonSupport")(js.undefined)
        ret
    }
    @scala.inline
    def withContentCache(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentCache")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContentCache: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentCache")(js.undefined)
        ret
    }
    @scala.inline
    def withContentURL(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentURL")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContentURL: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentURL")(js.undefined)
        ret
    }
    @scala.inline
    def withContentURLNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentURL")(null)
        ret
    }
    @scala.inline
    def withCycleSteps(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cycleSteps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCycleSteps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cycleSteps")(js.undefined)
        ret
    }
    @scala.inline
    def withDisabledSteps(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabledSteps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisabledSteps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabledSteps")(js.undefined)
        ret
    }
    @scala.inline
    def withErrorSteps(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorSteps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutErrorSteps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorSteps")(js.undefined)
        ret
    }
    @scala.inline
    def withHiddenSteps(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hiddenSteps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHiddenSteps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hiddenSteps")(js.undefined)
        ret
    }
    @scala.inline
    def withKeyNavigation(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyNavigation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeyNavigation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyNavigation")(js.undefined)
        ret
    }
    @scala.inline
    def withLang(value: Lang): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lang")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLang: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lang")(js.undefined)
        ret
    }
    @scala.inline
    def withSelected(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selected")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelected: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selected")(js.undefined)
        ret
    }
    @scala.inline
    def withShowStepURLhash(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showStepURLhash")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowStepURLhash: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showStepURLhash")(js.undefined)
        ret
    }
    @scala.inline
    def withTheme(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("theme")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTheme: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("theme")(js.undefined)
        ret
    }
    @scala.inline
    def withToolbarSettings(value: ToolbarSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toolbarSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutToolbarSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toolbarSettings")(js.undefined)
        ret
    }
    @scala.inline
    def withTransitionEffect(value: TransitionEffect): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transitionEffect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransitionEffect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transitionEffect")(js.undefined)
        ret
    }
    @scala.inline
    def withTransitionSpeed(value: String | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transitionSpeed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransitionSpeed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transitionSpeed")(js.undefined)
        ret
    }
    @scala.inline
    def withUseURLhash(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useURLhash")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseURLhash: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useURLhash")(js.undefined)
        ret
    }
  }
  
}

