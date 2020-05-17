package typingsSlinky.winrtUwp.Windows.Security.Credentials.UI

import typingsSlinky.winrtUwp.Windows.Storage.Streams.IBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Controls the appearance and behavior of a credential prompt. */
@js.native
trait CredentialPickerOptions extends js.Object {
  /** Gets or sets the option of whether the dialog box is displayed. */
  var alwaysDisplayDialog: Boolean = js.native
  /** Gets or sets the authentication protocol. */
  var authenticationProtocol: AuthenticationProtocol = js.native
  /** Gets or sets whether the caller wants to save the credentials. */
  var callerSavesCredential: Boolean = js.native
  /** Gets or sets the caption text that is displayed to the user. */
  var caption: String = js.native
  /** Gets or sets the option on saving credentials. */
  var credentialSaveOption: CredentialSaveOption = js.native
  /** Gets or sets whether the authentication protocol is custom rather than a standard authentication protocol. */
  var customAuthenticationProtocol: String = js.native
  /** Gets or sets the error code. */
  var errorCode: Double = js.native
  /** Gets or sets the body of text that displays to the user. */
  var message: String = js.native
  /** Gets or sets whether to fill dialog box fields with previous credentials. */
  var previousCredential: IBuffer = js.native
  /** Gets or sets the name of the target computer. */
  var targetName: String = js.native
}

object CredentialPickerOptions {
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
  ): CredentialPickerOptions = {
    val __obj = js.Dynamic.literal(alwaysDisplayDialog = alwaysDisplayDialog.asInstanceOf[js.Any], authenticationProtocol = authenticationProtocol.asInstanceOf[js.Any], callerSavesCredential = callerSavesCredential.asInstanceOf[js.Any], caption = caption.asInstanceOf[js.Any], credentialSaveOption = credentialSaveOption.asInstanceOf[js.Any], customAuthenticationProtocol = customAuthenticationProtocol.asInstanceOf[js.Any], errorCode = errorCode.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], previousCredential = previousCredential.asInstanceOf[js.Any], targetName = targetName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CredentialPickerOptions]
  }
  @scala.inline
  implicit class CredentialPickerOptionsOps[Self <: CredentialPickerOptions] (val x: Self) extends AnyVal {
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

