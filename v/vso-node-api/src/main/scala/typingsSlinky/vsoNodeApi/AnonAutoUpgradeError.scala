package typingsSlinky.vsoNodeApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAutoUpgradeError extends js.Object {
  var autoUpgradeError: Double = js.native
  var builtIn: Double = js.native
  var disabled: Double = js.native
  var error: Double = js.native
  var multiVersion: Double = js.native
  var needsReauthorization: Double = js.native
  var none: Double = js.native
  var trusted: Double = js.native
  var unInstalled: Double = js.native
  var versionCheckError: Double = js.native
  var warning: Double = js.native
}

object AnonAutoUpgradeError {
  @scala.inline
  def apply(
    autoUpgradeError: Double,
    builtIn: Double,
    disabled: Double,
    error: Double,
    multiVersion: Double,
    needsReauthorization: Double,
    none: Double,
    trusted: Double,
    unInstalled: Double,
    versionCheckError: Double,
    warning: Double
  ): AnonAutoUpgradeError = {
    val __obj = js.Dynamic.literal(autoUpgradeError = autoUpgradeError.asInstanceOf[js.Any], builtIn = builtIn.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], multiVersion = multiVersion.asInstanceOf[js.Any], needsReauthorization = needsReauthorization.asInstanceOf[js.Any], none = none.asInstanceOf[js.Any], trusted = trusted.asInstanceOf[js.Any], unInstalled = unInstalled.asInstanceOf[js.Any], versionCheckError = versionCheckError.asInstanceOf[js.Any], warning = warning.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAutoUpgradeError]
  }
  @scala.inline
  implicit class AnonAutoUpgradeErrorOps[Self <: AnonAutoUpgradeError] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutoUpgradeError(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoUpgradeError")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBuiltIn(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("builtIn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDisabled(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withError(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMultiVersion(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multiVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNeedsReauthorization(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("needsReauthorization")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNone(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("none")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTrusted(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trusted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUnInstalled(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unInstalled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVersionCheckError(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("versionCheckError")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWarning(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("warning")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

