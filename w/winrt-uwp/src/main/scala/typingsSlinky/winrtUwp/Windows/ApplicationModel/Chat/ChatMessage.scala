package typingsSlinky.winrtUwp.Windows.ApplicationModel.Chat

import typingsSlinky.winrtUwp.Windows.Foundation.Collections.IMapView
import typingsSlinky.winrtUwp.Windows.Foundation.Collections.IVector
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a chat message. */
@js.native
trait ChatMessage extends js.Object {
  /** Gets a list of chat message attachments. */
  var attachments: IVector[ChatMessageAttachment] = js.native
  /** Gets or sets the body of the chat message. */
  var body: String = js.native
  /** Gets or sets the estimated size of a file to be sent or received. */
  var estimatedDownloadSize: Double = js.native
  /** Gets the identifier or address of the sender of the message. */
  var from: String = js.native
  /** Gets the identifier of the message. */
  var id: String = js.native
  /** Gets or sets a Boolean value indicating if the message is an auto-reply. */
  var isAutoReply: Boolean = js.native
  /** Gets a Boolean value indicating if forwarding is disabled. */
  var isForwardingDisabled: Boolean = js.native
  /** Gets Boolean a value indicating if the message is incoming or outgoing. */
  var isIncoming: Boolean = js.native
  /** Gets a Boolean value indicating if the message has been read. */
  var isRead: Boolean = js.native
  /** Gets or sets a Boolean value indicating if the message was received during user specified quiet hours. */
  var isReceivedDuringQuietHours: Boolean = js.native
  /** Gets a Boolean value indicating if reply is disabled on the ChatMessage . */
  var isReplyDisabled: Boolean = js.native
  /** Gets or sets a Boolean value indicating if the message has been seen. */
  var isSeen: Boolean = js.native
  /** Gets a Boolean value indicating if the message is stored on a SIM card. */
  var isSimMessage: Boolean = js.native
  /** Gets the local timestamp of the message. */
  var localTimestamp: js.Date = js.native
  /** Gets or sets the type of the ChatMessage . */
  var messageKind: ChatMessageKind = js.native
  /** Gets or sets a value indicating the type of message operator, such as SMS, MMS, or RCS. */
  var messageOperatorKind: ChatMessageOperatorKind = js.native
  /** Gets the network timestamp of the message. */
  var networkTimestamp: js.Date = js.native
  /** Gets the list of send statuses for the message. */
  var recipientSendStatuses: IMapView[String, ChatMessageStatus] = js.native
  /** Gets the list of recipients of the message. */
  var recipients: IVector[String] = js.native
  /** Gets the delivery info for each of the recipients of the ChatMessage . */
  var recipientsDeliveryInfos: IVector[ChatRecipientDeliveryInfo] = js.native
  /** Gets or sets the remote ID for the ChatMessage . */
  var remoteId: String = js.native
  /** Gets or sets a Boolean value indicating if notification of receiving the ChatMessage should be suppressed. */
  var shouldSuppressNotification: Boolean = js.native
  /** Gets the status of the message. Typical states include draft, sent, received, deleted, etc. */
  var status: ChatMessageStatus = js.native
  /** Gets the subject of the message. */
  var subject: String = js.native
  /** Gets or sets the conversation threading info for the ChatMessage . */
  var threadingInfo: ChatConversationThreadingInfo = js.native
  /** Gets the transport friendly name of the message. */
  var transportFriendlyName: String = js.native
  /** Gets or sets the transport ID of the message. */
  var transportId: String = js.native
}

object ChatMessage {
  @scala.inline
  def apply(
    attachments: IVector[ChatMessageAttachment],
    body: String,
    estimatedDownloadSize: Double,
    from: String,
    id: String,
    isAutoReply: Boolean,
    isForwardingDisabled: Boolean,
    isIncoming: Boolean,
    isRead: Boolean,
    isReceivedDuringQuietHours: Boolean,
    isReplyDisabled: Boolean,
    isSeen: Boolean,
    isSimMessage: Boolean,
    localTimestamp: js.Date,
    messageKind: ChatMessageKind,
    messageOperatorKind: ChatMessageOperatorKind,
    networkTimestamp: js.Date,
    recipientSendStatuses: IMapView[String, ChatMessageStatus],
    recipients: IVector[String],
    recipientsDeliveryInfos: IVector[ChatRecipientDeliveryInfo],
    remoteId: String,
    shouldSuppressNotification: Boolean,
    status: ChatMessageStatus,
    subject: String,
    threadingInfo: ChatConversationThreadingInfo,
    transportFriendlyName: String,
    transportId: String
  ): ChatMessage = {
    val __obj = js.Dynamic.literal(attachments = attachments.asInstanceOf[js.Any], body = body.asInstanceOf[js.Any], estimatedDownloadSize = estimatedDownloadSize.asInstanceOf[js.Any], from = from.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], isAutoReply = isAutoReply.asInstanceOf[js.Any], isForwardingDisabled = isForwardingDisabled.asInstanceOf[js.Any], isIncoming = isIncoming.asInstanceOf[js.Any], isRead = isRead.asInstanceOf[js.Any], isReceivedDuringQuietHours = isReceivedDuringQuietHours.asInstanceOf[js.Any], isReplyDisabled = isReplyDisabled.asInstanceOf[js.Any], isSeen = isSeen.asInstanceOf[js.Any], isSimMessage = isSimMessage.asInstanceOf[js.Any], localTimestamp = localTimestamp.asInstanceOf[js.Any], messageKind = messageKind.asInstanceOf[js.Any], messageOperatorKind = messageOperatorKind.asInstanceOf[js.Any], networkTimestamp = networkTimestamp.asInstanceOf[js.Any], recipientSendStatuses = recipientSendStatuses.asInstanceOf[js.Any], recipients = recipients.asInstanceOf[js.Any], recipientsDeliveryInfos = recipientsDeliveryInfos.asInstanceOf[js.Any], remoteId = remoteId.asInstanceOf[js.Any], shouldSuppressNotification = shouldSuppressNotification.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], subject = subject.asInstanceOf[js.Any], threadingInfo = threadingInfo.asInstanceOf[js.Any], transportFriendlyName = transportFriendlyName.asInstanceOf[js.Any], transportId = transportId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChatMessage]
  }
  @scala.inline
  implicit class ChatMessageOps[Self <: ChatMessage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAttachments(value: IVector[ChatMessageAttachment]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attachments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBody(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("body")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEstimatedDownloadSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("estimatedDownloadSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFrom(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("from")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsAutoReply(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isAutoReply")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsForwardingDisabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isForwardingDisabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsIncoming(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isIncoming")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsRead(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isRead")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsReceivedDuringQuietHours(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isReceivedDuringQuietHours")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsReplyDisabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isReplyDisabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsSeen(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isSeen")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsSimMessage(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isSimMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLocalTimestamp(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("localTimestamp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMessageKind(value: ChatMessageKind): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("messageKind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMessageOperatorKind(value: ChatMessageOperatorKind): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("messageOperatorKind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNetworkTimestamp(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("networkTimestamp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRecipientSendStatuses(value: IMapView[String, ChatMessageStatus]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recipientSendStatuses")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRecipients(value: IVector[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recipients")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRecipientsDeliveryInfos(value: IVector[ChatRecipientDeliveryInfo]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recipientsDeliveryInfos")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRemoteId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remoteId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShouldSuppressNotification(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shouldSuppressNotification")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatus(value: ChatMessageStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSubject(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subject")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withThreadingInfo(value: ChatConversationThreadingInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("threadingInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTransportFriendlyName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transportFriendlyName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTransportId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transportId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

