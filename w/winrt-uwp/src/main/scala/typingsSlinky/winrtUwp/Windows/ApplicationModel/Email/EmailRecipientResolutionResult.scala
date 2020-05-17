package typingsSlinky.winrtUwp.Windows.ApplicationModel.Email

import typingsSlinky.winrtUwp.Windows.Foundation.Collections.IVectorView
import typingsSlinky.winrtUwp.Windows.Security.Cryptography.Certificates.Certificate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the result of an attempt to resolve an email recipient. */
@js.native
trait EmailRecipientResolutionResult extends js.Object {
  /** Gets the public key for an email recipient. */
  var publicKeys: IVectorView[Certificate] = js.native
  /** Gets the state of an attempt to resolve an email recipient. */
  var status: EmailRecipientResolutionStatus = js.native
}

object EmailRecipientResolutionResult {
  @scala.inline
  def apply(publicKeys: IVectorView[Certificate], status: EmailRecipientResolutionStatus): EmailRecipientResolutionResult = {
    val __obj = js.Dynamic.literal(publicKeys = publicKeys.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[EmailRecipientResolutionResult]
  }
  @scala.inline
  implicit class EmailRecipientResolutionResultOps[Self <: EmailRecipientResolutionResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPublicKeys(value: IVectorView[Certificate]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("publicKeys")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatus(value: EmailRecipientResolutionStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

