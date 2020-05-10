package typingsSlinky.winrt.Windows.Security.Credentials.UI

import typingsSlinky.winrt.Windows.Storage.Streams.IBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICredentialPickerOptions extends js.Object {
  var alwaysDisplayDialog: Boolean = js.native
  var authenticationProtocol: AuthenticationProtocol = js.native
  var callerSavesCredential: Boolean = js.native
  var caption: String = js.native
  var credentialSaveOption: CredentialSaveOption = js.native
  var customAuthenticationProtocol: String = js.native
  var errorCode: Double = js.native
  var message: String = js.native
  var previousCredential: IBuffer = js.native
  var targetName: String = js.native
}

object ICredentialPickerOptions {
  @scala.inline
  def apply(
    alwaysDisplayDialog: Boolean,
    authenticationProtocol: AuthenticationProtocol,
    callerSavesCredential: Boolean,
    caption: String,
    credentialSaveOption: CredentialSaveOption,
    customAuthenticationProtocol: String,
    errorCode: Double,
    message: String,
    previousCredential: IBuffer,
    targetName: String
  ): ICredentialPickerOptions = {
    val __obj = js.Dynamic.literal(alwaysDisplayDialog = alwaysDisplayDialog.asInstanceOf[js.Any], authenticationProtocol = authenticationProtocol.asInstanceOf[js.Any], callerSavesCredential = callerSavesCredential.asInstanceOf[js.Any], caption = caption.asInstanceOf[js.Any], credentialSaveOption = credentialSaveOption.asInstanceOf[js.Any], customAuthenticationProtocol = customAuthenticationProtocol.asInstanceOf[js.Any], errorCode = errorCode.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], previousCredential = previousCredential.asInstanceOf[js.Any], targetName = targetName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICredentialPickerOptions]
  }
  @scala.inline
  implicit class ICredentialPickerOptionsOps[Self <: ICredentialPickerOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlwaysDisplayDialog(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alwaysDisplayDialog")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAuthenticationProtocol(value: AuthenticationProtocol): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authenticationProtocol")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCallerSavesCredential(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callerSavesCredential")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCaption(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("caption")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCredentialSaveOption(value: CredentialSaveOption): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("credentialSaveOption")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCustomAuthenticationProtocol(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customAuthenticationProtocol")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withErrorCode(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMessage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPreviousCredential(value: IBuffer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("previousCredential")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTargetName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetName")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

