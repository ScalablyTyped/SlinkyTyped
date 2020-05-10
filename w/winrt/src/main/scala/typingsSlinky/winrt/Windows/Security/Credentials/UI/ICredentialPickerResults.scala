package typingsSlinky.winrt.Windows.Security.Credentials.UI

import typingsSlinky.winrt.Windows.Storage.Streams.IBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICredentialPickerResults extends js.Object {
  var credential: IBuffer = js.native
  var credentialDomainName: String = js.native
  var credentialPassword: String = js.native
  var credentialSaveOption: CredentialSaveOption = js.native
  var credentialSaved: Boolean = js.native
  var credentialUserName: String = js.native
  var errorCode: Double = js.native
}

object ICredentialPickerResults {
  @scala.inline
  def apply(
    credential: IBuffer,
    credentialDomainName: String,
    credentialPassword: String,
    credentialSaveOption: CredentialSaveOption,
    credentialSaved: Boolean,
    credentialUserName: String,
    errorCode: Double
  ): ICredentialPickerResults = {
    val __obj = js.Dynamic.literal(credential = credential.asInstanceOf[js.Any], credentialDomainName = credentialDomainName.asInstanceOf[js.Any], credentialPassword = credentialPassword.asInstanceOf[js.Any], credentialSaveOption = credentialSaveOption.asInstanceOf[js.Any], credentialSaved = credentialSaved.asInstanceOf[js.Any], credentialUserName = credentialUserName.asInstanceOf[js.Any], errorCode = errorCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICredentialPickerResults]
  }
  @scala.inline
  implicit class ICredentialPickerResultsOps[Self <: ICredentialPickerResults] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCredential(value: IBuffer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("credential")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCredentialDomainName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("credentialDomainName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCredentialPassword(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("credentialPassword")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCredentialSaveOption(value: CredentialSaveOption): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("credentialSaveOption")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCredentialSaved(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("credentialSaved")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCredentialUserName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("credentialUserName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withErrorCode(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorCode")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

