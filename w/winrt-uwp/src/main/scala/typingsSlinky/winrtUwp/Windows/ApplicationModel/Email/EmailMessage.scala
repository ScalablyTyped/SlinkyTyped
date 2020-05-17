package typingsSlinky.winrtUwp.Windows.ApplicationModel.Email

import typingsSlinky.winrtUwp.Windows.Foundation.Collections.IVector
import typingsSlinky.winrtUwp.Windows.Storage.Streams.IRandomAccessStreamReference
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents an email message. */
@js.native
trait EmailMessage extends js.Object {
  /** Gets or sets a Boolean value indicating whether images may be embedded in the html encoded email message. */
  var allowInternetImages: Boolean = js.native
  /** Gets the attachments of the email message. */
  var attachments: IVector[EmailAttachment] = js.native
  /** Gets the recipients BCC'd to the email message. */
  var bcc: IVector[EmailRecipient] = js.native
  /** Gets or sets the body of the email message. */
  var body: String = js.native
  /** Gets the recipients CC'd to the email message. */
  var cc: IVector[EmailRecipient] = js.native
  /** Gets the current change number which is incremented for each change made to an email message. */
  var changeNumber: Double = js.native
  /** Gets the identifier for a conversation. */
  var conversationId: String = js.native
  /** Gets or sets the download status of an email message. */
  var downloadState: EmailMessageDownloadState = js.native
  /** Gets or sets the estimated size, in bytes, of an email message download. */
  var estimatedDownloadSizeInBytes: Double = js.native
  /** Represents the flag status of an email message. */
  var flagState: EmailFlagState = js.native
  /** Gets the identifier of a folder in the inbox. */
  var folderId: String = js.native
  /** Gets a Boolean value indicating whether this email message contains partial bodies. */
  var hasPartialBodies: Boolean = js.native
  /** Gets the identifier of an email message. */
  var id: String = js.native
  /** Gets the importance of an email message. */
  var importance: EmailImportance = js.native
  /** Gets the identifier for the email message to which this message is a response. */
  var inResponseToMessageId: String = js.native
  /** Gets or sets the Information Rights Management (IRM) information for this email message. */
  var irmInfo: EmailIrmInfo = js.native
  /** Gets a Boolean value indicating whether this message is a draft. */
  var isDraftMessage: Boolean = js.native
  /** Gets a Boolean value indicating whether the email message has been read. */
  var isRead: Boolean = js.native
  /** Gets a Boolean value indicating whether the email message has been seen. */
  var isSeen: Boolean = js.native
  /** Gets a Boolean value indicating whether the email message is a temporary server search message. */
  var isServerSearchMessage: Boolean = js.native
  /** Gets a Boolean value indicating whether the response email message is allowed to attempt a smart send, only sending that portion of the email message that has changed. */
  var isSmartSendable: Boolean = js.native
  /** Gets the last kind of response sent in reference to this email message. */
  var lastResponseKind: EmailMessageResponseKind = js.native
  /** Gets the identifier of the mailbox. */
  var mailboxId: String = js.native
  /** Gets the information associated with this meeting. */
  var meetingInfo: EmailMeetingInfo = js.native
  /** Gets or sets a string that indicates the class of the message. */
  var messageClass: String = js.native
  /** Gets the subject line of an email message stripped of additional prefixes such as fwd: and re: */
  var normalizedSubject: String = js.native
  /** Gets or sets the integer that identifies the original flavor of the character set used so that when the email message is condensed from wide character format (16-bit) to ASCII or other 8-bit encoding, in cases of later encoding questions, this integer can be used to recreate the original character set. */
  var originalCodePage: Double = js.native
  /** Gets or sets the short preview string that represents the longer email message in the list view of emails. */
  var preview: String = js.native
  /** Gets or sets the identifier that can be used by a service provider to access the email message on the client machine. */
  var remoteId: String = js.native
  /** Gets or sets the mailbox from which the email message was sent. */
  var sender: EmailRecipient = js.native
  /** Gets or sets the time an email was sent. */
  var sentTime: js.Date = js.native
  /** Gets or sets the S/MIME data associated with an email message. For more information, see the Certificate class. */
  var smimeData: IRandomAccessStreamReference = js.native
  /** Gets or sets the type of S/MIME encryption/signature for the email message. */
  var smimeKind: EmailMessageSmimeKind = js.native
  /** Gets or sets the subject of the email message. */
  var subject: String = js.native
  /** Gets the direct recipients of the email message. */
  var to: IVector[EmailRecipient] = js.native
  /**
    * Gets the requested email stream such as plain text or HTML.
    * @param type The kind of message body; plain text or HTML.
    * @return The selected body stream.
    */
  def getBodyStream(`type`: EmailMessageBodyKind): IRandomAccessStreamReference = js.native
  /**
    * Sets the value of the specified body stream in an email message.
    * @param type Indicates which body stream, plain text or HTML.
    * @param stream The message for the specified body stream.
    */
  def setBodyStream(`type`: EmailMessageBodyKind, stream: IRandomAccessStreamReference): Unit = js.native
}

object EmailMessage {
  @scala.inline
  def apply(
    allowInternetImages: Boolean,
    attachments: IVector[EmailAttachment],
    bcc: IVector[EmailRecipient],
    body: String,
    cc: IVector[EmailRecipient],
    changeNumber: Double,
    conversationId: String,
    downloadState: EmailMessageDownloadState,
    estimatedDownloadSizeInBytes: Double,
    flagState: EmailFlagState,
    folderId: String,
    getBodyStream: EmailMessageBodyKind => IRandomAccessStreamReference,
    hasPartialBodies: Boolean,
    id: String,
    importance: EmailImportance,
    inResponseToMessageId: String,
    irmInfo: EmailIrmInfo,
    isDraftMessage: Boolean,
    isRead: Boolean,
    isSeen: Boolean,
    isServerSearchMessage: Boolean,
    isSmartSendable: Boolean,
    lastResponseKind: EmailMessageResponseKind,
    mailboxId: String,
    meetingInfo: EmailMeetingInfo,
    messageClass: String,
    normalizedSubject: String,
    originalCodePage: Double,
    preview: String,
    remoteId: String,
    sender: EmailRecipient,
    sentTime: js.Date,
    setBodyStream: (EmailMessageBodyKind, IRandomAccessStreamReference) => Unit,
    smimeData: IRandomAccessStreamReference,
    smimeKind: EmailMessageSmimeKind,
    subject: String,
    to: IVector[EmailRecipient]
  ): EmailMessage = {
    val __obj = js.Dynamic.literal(allowInternetImages = allowInternetImages.asInstanceOf[js.Any], attachments = attachments.asInstanceOf[js.Any], bcc = bcc.asInstanceOf[js.Any], body = body.asInstanceOf[js.Any], cc = cc.asInstanceOf[js.Any], changeNumber = changeNumber.asInstanceOf[js.Any], conversationId = conversationId.asInstanceOf[js.Any], downloadState = downloadState.asInstanceOf[js.Any], estimatedDownloadSizeInBytes = estimatedDownloadSizeInBytes.asInstanceOf[js.Any], flagState = flagState.asInstanceOf[js.Any], folderId = folderId.asInstanceOf[js.Any], getBodyStream = js.Any.fromFunction1(getBodyStream), hasPartialBodies = hasPartialBodies.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], importance = importance.asInstanceOf[js.Any], inResponseToMessageId = inResponseToMessageId.asInstanceOf[js.Any], irmInfo = irmInfo.asInstanceOf[js.Any], isDraftMessage = isDraftMessage.asInstanceOf[js.Any], isRead = isRead.asInstanceOf[js.Any], isSeen = isSeen.asInstanceOf[js.Any], isServerSearchMessage = isServerSearchMessage.asInstanceOf[js.Any], isSmartSendable = isSmartSendable.asInstanceOf[js.Any], lastResponseKind = lastResponseKind.asInstanceOf[js.Any], mailboxId = mailboxId.asInstanceOf[js.Any], meetingInfo = meetingInfo.asInstanceOf[js.Any], messageClass = messageClass.asInstanceOf[js.Any], normalizedSubject = normalizedSubject.asInstanceOf[js.Any], originalCodePage = originalCodePage.asInstanceOf[js.Any], preview = preview.asInstanceOf[js.Any], remoteId = remoteId.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any], sentTime = sentTime.asInstanceOf[js.Any], setBodyStream = js.Any.fromFunction2(setBodyStream), smimeData = smimeData.asInstanceOf[js.Any], smimeKind = smimeKind.asInstanceOf[js.Any], subject = subject.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
    __obj.asInstanceOf[EmailMessage]
  }
  @scala.inline
  implicit class EmailMessageOps[Self <: EmailMessage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowInternetImages(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowInternetImages")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAttachments(value: IVector[EmailAttachment]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attachments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBcc(value: IVector[EmailRecipient]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bcc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBody(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("body")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCc(value: IVector[EmailRecipient]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChangeNumber(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("changeNumber")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConversationId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("conversationId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDownloadState(value: EmailMessageDownloadState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("downloadState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEstimatedDownloadSizeInBytes(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("estimatedDownloadSizeInBytes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFlagState(value: EmailFlagState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flagState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFolderId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("folderId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetBodyStream(value: EmailMessageBodyKind => IRandomAccessStreamReference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getBodyStream")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withHasPartialBodies(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasPartialBodies")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withImportance(value: EmailImportance): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("importance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInResponseToMessageId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inResponseToMessageId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIrmInfo(value: EmailIrmInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("irmInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsDraftMessage(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isDraftMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsRead(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isRead")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsSeen(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isSeen")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsServerSearchMessage(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isServerSearchMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsSmartSendable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isSmartSendable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLastResponseKind(value: EmailMessageResponseKind): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastResponseKind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMailboxId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mailboxId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMeetingInfo(value: EmailMeetingInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("meetingInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMessageClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("messageClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNormalizedSubject(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("normalizedSubject")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOriginalCodePage(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("originalCodePage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPreview(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preview")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRemoteId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remoteId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSender(value: EmailRecipient): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sender")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSentTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sentTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSetBodyStream(value: (EmailMessageBodyKind, IRandomAccessStreamReference) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setBodyStream")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withSmimeData(value: IRandomAccessStreamReference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("smimeData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSmimeKind(value: EmailMessageSmimeKind): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("smimeKind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSubject(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subject")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTo(value: IVector[EmailRecipient]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("to")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

