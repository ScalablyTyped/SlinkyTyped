package typingsSlinky.winrtUwp.Windows.ApplicationModel.Email

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents email information rights management (IRM) info. */
@js.native
trait EmailIrmInfo extends js.Object {
  /** Gets or sets a Boolean value that indicates if an email message is allowed to be edited. */
  var canEdit: Boolean = js.native
  /** Gets or sets a Boolean value that indicates if the user can copy the contents of an email message to the clipboard. */
  var canExtractData: Boolean = js.native
  /** Gets or sets a Boolean value that indicates if the email message is allowed to be forwarded. */
  var canForward: Boolean = js.native
  /** Gets or sets a Boolean value that indicates if the user is allowed to change any of the email recipients when responding. */
  var canModifyRecipientsOnResponse: Boolean = js.native
  /** Gets or sets a Boolean value that indicates if the user is allowed to print the contents of the email message or any attachments. */
  var canPrintData: Boolean = js.native
  /** Gets or sets a Boolean value that indicates if the recipient is allowed to remove information rights management (IRM) when responding. */
  var canRemoveIrmOnResponse: Boolean = js.native
  /** Gets or sets a Boolean value that indicates if the recipient is allowed to reply to the email message. */
  var canReply: Boolean = js.native
  /** Gets or sets a Boolean value that indicates if the recipient is allowed to reply all to the email message. */
  var canReplyAll: Boolean = js.native
  /** Gets or sets the expiration date for the information rights management (IRM) permissions. */
  var expirationDate: js.Date = js.native
  /** Gets or sets a Boolean value that indicates if the sender is the information rights management (IRM) originator. */
  var isIrmOriginator: Boolean = js.native
  /** Gets or sets a Boolean value that indicates if programmatic access to the message is allowed. */
  var isProgramaticAccessAllowed: Boolean = js.native
  /** Gets or sets the EmailIrmTemplate used to create the information rights management (IRM) info. */
  var template: EmailIrmTemplate = js.native
}

object EmailIrmInfo {
  @scala.inline
  def apply(
    canEdit: Boolean,
    canExtractData: Boolean,
    canForward: Boolean,
    canModifyRecipientsOnResponse: Boolean,
    canPrintData: Boolean,
    canRemoveIrmOnResponse: Boolean,
    canReply: Boolean,
    canReplyAll: Boolean,
    expirationDate: js.Date,
    isIrmOriginator: Boolean,
    isProgramaticAccessAllowed: Boolean,
    template: EmailIrmTemplate
  ): EmailIrmInfo = {
    val __obj = js.Dynamic.literal(canEdit = canEdit.asInstanceOf[js.Any], canExtractData = canExtractData.asInstanceOf[js.Any], canForward = canForward.asInstanceOf[js.Any], canModifyRecipientsOnResponse = canModifyRecipientsOnResponse.asInstanceOf[js.Any], canPrintData = canPrintData.asInstanceOf[js.Any], canRemoveIrmOnResponse = canRemoveIrmOnResponse.asInstanceOf[js.Any], canReply = canReply.asInstanceOf[js.Any], canReplyAll = canReplyAll.asInstanceOf[js.Any], expirationDate = expirationDate.asInstanceOf[js.Any], isIrmOriginator = isIrmOriginator.asInstanceOf[js.Any], isProgramaticAccessAllowed = isProgramaticAccessAllowed.asInstanceOf[js.Any], template = template.asInstanceOf[js.Any])
    __obj.asInstanceOf[EmailIrmInfo]
  }
  @scala.inline
  implicit class EmailIrmInfoOps[Self <: EmailIrmInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCanEdit(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canEdit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCanExtractData(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canExtractData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCanForward(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canForward")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCanModifyRecipientsOnResponse(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canModifyRecipientsOnResponse")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCanPrintData(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canPrintData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCanRemoveIrmOnResponse(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canRemoveIrmOnResponse")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCanReply(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canReply")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCanReplyAll(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canReplyAll")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExpirationDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expirationDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsIrmOriginator(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isIrmOriginator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsProgramaticAccessAllowed(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isProgramaticAccessAllowed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTemplate(value: EmailIrmTemplate): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("template")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

