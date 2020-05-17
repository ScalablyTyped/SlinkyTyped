package typingsSlinky.winrtUwp.Windows.ApplicationModel.Email

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the capabilities associated with an email mailbox. */
@js.native
trait EmailMailboxCapabilities extends js.Object {
  /** Gets a Boolean value indicating if folders can be created in the mailbox. */
  var canCreateFolder: Boolean = js.native
  /** Gets a Boolean value indicating if folders can be deleted from the mailbox. */
  var canDeleteFolder: Boolean = js.native
  /** Gets a Boolean value indicating if folders in the mailbox can be emptied. */
  var canEmptyFolder: Boolean = js.native
  var canForwardMeetings: js.Any = js.native
   /* unmapped type */ var canGetAndSetExternalAutoReplies: js.Any = js.native
   /* unmapped type */ var canGetAndSetInternalAutoReplies: js.Any = js.native
   /* unmapped type */ /** Gets a Boolean value indicating if folders in the mailbox can be moved. */
  var canMoveFolder: Boolean = js.native
  var canProposeNewTimeForMeetings: js.Any = js.native
   /* unmapped type */ /** Gets a Boolean value that indicates whether the email mailbox is capable of resolving recipients. */
  var canResolveRecipients: Boolean = js.native
  var canServerSearchFolders: js.Any = js.native
   /* unmapped type */ var canServerSearchMailbox: js.Any = js.native
   /* unmapped type */ var canSmartSend: js.Any = js.native
   /* unmapped type */ var canUpdateMeetingResponses: js.Any = js.native
   /* unmapped type */ /** Gets a Boolean value that indicates whether the email mailbox is capable of validating certificates. */
  var canValidateCertificates: Boolean = js.native
}

object EmailMailboxCapabilities {
  @scala.inline
  def apply(
    canCreateFolder: Boolean,
    canDeleteFolder: Boolean,
    canEmptyFolder: Boolean,
    canForwardMeetings: js.Any,
    canGetAndSetExternalAutoReplies: js.Any,
    canGetAndSetInternalAutoReplies: js.Any,
    canMoveFolder: Boolean,
    canProposeNewTimeForMeetings: js.Any,
    canResolveRecipients: Boolean,
    canServerSearchFolders: js.Any,
    canServerSearchMailbox: js.Any,
    canSmartSend: js.Any,
    canUpdateMeetingResponses: js.Any,
    canValidateCertificates: Boolean
  ): EmailMailboxCapabilities = {
    val __obj = js.Dynamic.literal(canCreateFolder = canCreateFolder.asInstanceOf[js.Any], canDeleteFolder = canDeleteFolder.asInstanceOf[js.Any], canEmptyFolder = canEmptyFolder.asInstanceOf[js.Any], canForwardMeetings = canForwardMeetings.asInstanceOf[js.Any], canGetAndSetExternalAutoReplies = canGetAndSetExternalAutoReplies.asInstanceOf[js.Any], canGetAndSetInternalAutoReplies = canGetAndSetInternalAutoReplies.asInstanceOf[js.Any], canMoveFolder = canMoveFolder.asInstanceOf[js.Any], canProposeNewTimeForMeetings = canProposeNewTimeForMeetings.asInstanceOf[js.Any], canResolveRecipients = canResolveRecipients.asInstanceOf[js.Any], canServerSearchFolders = canServerSearchFolders.asInstanceOf[js.Any], canServerSearchMailbox = canServerSearchMailbox.asInstanceOf[js.Any], canSmartSend = canSmartSend.asInstanceOf[js.Any], canUpdateMeetingResponses = canUpdateMeetingResponses.asInstanceOf[js.Any], canValidateCertificates = canValidateCertificates.asInstanceOf[js.Any])
    __obj.asInstanceOf[EmailMailboxCapabilities]
  }
  @scala.inline
  implicit class EmailMailboxCapabilitiesOps[Self <: EmailMailboxCapabilities] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCanCreateFolder(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canCreateFolder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCanDeleteFolder(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canDeleteFolder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCanEmptyFolder(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canEmptyFolder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCanForwardMeetings(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canForwardMeetings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCanGetAndSetExternalAutoReplies(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canGetAndSetExternalAutoReplies")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCanGetAndSetInternalAutoReplies(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canGetAndSetInternalAutoReplies")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCanMoveFolder(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canMoveFolder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCanProposeNewTimeForMeetings(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canProposeNewTimeForMeetings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCanResolveRecipients(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canResolveRecipients")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCanServerSearchFolders(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canServerSearchFolders")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCanServerSearchMailbox(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canServerSearchMailbox")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCanSmartSend(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canSmartSend")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCanUpdateMeetingResponses(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canUpdateMeetingResponses")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCanValidateCertificates(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canValidateCertificates")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

