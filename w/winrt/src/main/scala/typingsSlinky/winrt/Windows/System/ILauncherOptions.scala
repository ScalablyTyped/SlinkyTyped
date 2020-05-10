package typingsSlinky.winrt.Windows.System

import typingsSlinky.winrt.Windows.Foundation.Uri
import typingsSlinky.winrt.Windows.UI.ViewManagement.ViewSizePreference
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ILauncherOptions extends js.Object {
  var contentType: String = js.native
  var desiredRemainingView: ViewSizePreference = js.native
  var displayApplicationPicker: Boolean = js.native
  var fallbackUri: Uri = js.native
  var preferredApplicationDisplayName: String = js.native
  var preferredApplicationPackageFamilyName: String = js.native
  var treatAsUntrusted: Boolean = js.native
  var uI: LauncherUIOptions = js.native
}

object ILauncherOptions {
  @scala.inline
  def apply(
    contentType: String,
    desiredRemainingView: ViewSizePreference,
    displayApplicationPicker: Boolean,
    fallbackUri: Uri,
    preferredApplicationDisplayName: String,
    preferredApplicationPackageFamilyName: String,
    treatAsUntrusted: Boolean,
    uI: LauncherUIOptions
  ): ILauncherOptions = {
    val __obj = js.Dynamic.literal(contentType = contentType.asInstanceOf[js.Any], desiredRemainingView = desiredRemainingView.asInstanceOf[js.Any], displayApplicationPicker = displayApplicationPicker.asInstanceOf[js.Any], fallbackUri = fallbackUri.asInstanceOf[js.Any], preferredApplicationDisplayName = preferredApplicationDisplayName.asInstanceOf[js.Any], preferredApplicationPackageFamilyName = preferredApplicationPackageFamilyName.asInstanceOf[js.Any], treatAsUntrusted = treatAsUntrusted.asInstanceOf[js.Any], uI = uI.asInstanceOf[js.Any])
    __obj.asInstanceOf[ILauncherOptions]
  }
  @scala.inline
  implicit class ILauncherOptionsOps[Self <: ILauncherOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContentType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDesiredRemainingView(value: ViewSizePreference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("desiredRemainingView")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDisplayApplicationPicker(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayApplicationPicker")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFallbackUri(value: Uri): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fallbackUri")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPreferredApplicationDisplayName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preferredApplicationDisplayName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPreferredApplicationPackageFamilyName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preferredApplicationPackageFamilyName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTreatAsUntrusted(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("treatAsUntrusted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUI(value: LauncherUIOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uI")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

