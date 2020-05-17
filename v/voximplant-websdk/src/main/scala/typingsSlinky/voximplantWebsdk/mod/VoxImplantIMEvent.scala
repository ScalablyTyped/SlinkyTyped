package typingsSlinky.voximplantWebsdk.mod

import typingsSlinky.voximplantWebsdk.mod.IMEventTypes.ChatHistoryReceived
import typingsSlinky.voximplantWebsdk.mod.IMEventTypes.ChatRoomBanList
import typingsSlinky.voximplantWebsdk.mod.IMEventTypes.ChatRoomCreated
import typingsSlinky.voximplantWebsdk.mod.IMEventTypes.ChatRoomError
import typingsSlinky.voximplantWebsdk.mod.IMEventTypes.ChatRoomHistoryReceived
import typingsSlinky.voximplantWebsdk.mod.IMEventTypes.ChatRoomInvitation
import typingsSlinky.voximplantWebsdk.mod.IMEventTypes.ChatRoomInviteDeclined
import typingsSlinky.voximplantWebsdk.mod.IMEventTypes.ChatRoomMessageModified
import typingsSlinky.voximplantWebsdk.mod.IMEventTypes.ChatRoomMessageNotModified
import typingsSlinky.voximplantWebsdk.mod.IMEventTypes.ChatRoomMessageReceived
import typingsSlinky.voximplantWebsdk.mod.IMEventTypes.ChatRoomMessageRemoved
import typingsSlinky.voximplantWebsdk.mod.IMEventTypes.ChatRoomNewParticipant
import typingsSlinky.voximplantWebsdk.mod.IMEventTypes.ChatRoomOperation
import typingsSlinky.voximplantWebsdk.mod.IMEventTypes.ChatRoomParticipantExit
import typingsSlinky.voximplantWebsdk.mod.IMEventTypes.ChatRoomParticipants
import typingsSlinky.voximplantWebsdk.mod.IMEventTypes.ChatRoomPresenceUpdate
import typingsSlinky.voximplantWebsdk.mod.IMEventTypes.ChatRoomStateUpdate
import typingsSlinky.voximplantWebsdk.mod.IMEventTypes.ChatRoomSubjectChange
import typingsSlinky.voximplantWebsdk.mod.IMEventTypes.ChatRoomsDataReceived
import typingsSlinky.voximplantWebsdk.mod.IMEventTypes.ChatStateUpdate
import typingsSlinky.voximplantWebsdk.mod.IMEventTypes.MessageModified
import typingsSlinky.voximplantWebsdk.mod.IMEventTypes.MessageNotModified
import typingsSlinky.voximplantWebsdk.mod.IMEventTypes.MessageReceived
import typingsSlinky.voximplantWebsdk.mod.IMEventTypes.MessageRemoved
import typingsSlinky.voximplantWebsdk.mod.IMEventTypes.MessageStatus
import typingsSlinky.voximplantWebsdk.mod.IMEventTypes.PresenceUpdate
import typingsSlinky.voximplantWebsdk.mod.IMEventTypes.RosterItemChange
import typingsSlinky.voximplantWebsdk.mod.IMEventTypes.RosterPresenceUpdate
import typingsSlinky.voximplantWebsdk.mod.IMEventTypes.RosterReceived
import typingsSlinky.voximplantWebsdk.mod.IMEventTypes.SubscriptionRequest
import typingsSlinky.voximplantWebsdk.mod.IMEventTypes.SystemError
import typingsSlinky.voximplantWebsdk.mod.IMEventTypes.UCConnected
import typingsSlinky.voximplantWebsdk.mod.IMEventTypes.UCDisconnected
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.voximplantWebsdk.mod.IMEventTypes.ChatHistoryReceived
  - typingsSlinky.voximplantWebsdk.mod.IMEventTypes.ChatRoomBanList
  - typingsSlinky.voximplantWebsdk.mod.IMEventTypes.ChatRoomCreated
  - typingsSlinky.voximplantWebsdk.mod.IMEventTypes.ChatRoomError
  - typingsSlinky.voximplantWebsdk.mod.IMEventTypes.ChatRoomHistoryReceived
  - typingsSlinky.voximplantWebsdk.mod.IMEventTypes.ChatRoomInfo
  - typingsSlinky.voximplantWebsdk.mod.IMEventTypes.ChatRoomInvitation
  - typingsSlinky.voximplantWebsdk.mod.IMEventTypes.ChatRoomInviteDeclined
  - typingsSlinky.voximplantWebsdk.mod.IMEventTypes.ChatRoomMessageModified
  - typingsSlinky.voximplantWebsdk.mod.IMEventTypes.ChatRoomMessageNotModified
  - typingsSlinky.voximplantWebsdk.mod.IMEventTypes.ChatRoomMessageReceived
  - typingsSlinky.voximplantWebsdk.mod.IMEventTypes.ChatRoomMessageRemoved
  - typingsSlinky.voximplantWebsdk.mod.IMEventTypes.ChatRoomNewParticipant
  - typingsSlinky.voximplantWebsdk.mod.IMEventTypes.ChatRoomOperation
  - typingsSlinky.voximplantWebsdk.mod.IMEventTypes.ChatRoomParticipantExit
  - typingsSlinky.voximplantWebsdk.mod.IMEventTypes.ChatRoomParticipants
  - typingsSlinky.voximplantWebsdk.mod.IMEventTypes.ChatRoomPresenceUpdate
  - typingsSlinky.voximplantWebsdk.mod.IMEventTypes.ChatRoomStateUpdate
  - typingsSlinky.voximplantWebsdk.mod.IMEventTypes.ChatRoomSubjectChange
  - typingsSlinky.voximplantWebsdk.mod.IMEventTypes.ChatRoomsDataReceived
  - typingsSlinky.voximplantWebsdk.mod.IMEventTypes.ChatStateUpdate
  - typingsSlinky.voximplantWebsdk.mod.IMEventTypes.MessageModified
  - typingsSlinky.voximplantWebsdk.mod.IMEventTypes.MessageNotModified
  - typingsSlinky.voximplantWebsdk.mod.IMEventTypes.MessageReceived
  - typingsSlinky.voximplantWebsdk.mod.IMEventTypes.MessageRemoved
  - typingsSlinky.voximplantWebsdk.mod.IMEventTypes.MessageStatus
  - typingsSlinky.voximplantWebsdk.mod.IMEventTypes.PresenceUpdate
  - typingsSlinky.voximplantWebsdk.mod.IMEventTypes.RosterItemChange
  - typingsSlinky.voximplantWebsdk.mod.IMEventTypes.RosterPresenceUpdate
  - typingsSlinky.voximplantWebsdk.mod.IMEventTypes.RosterReceived
  - typingsSlinky.voximplantWebsdk.mod.IMEventTypes.SubscriptionRequest
  - typingsSlinky.voximplantWebsdk.mod.IMEventTypes.SystemError
  - typingsSlinky.voximplantWebsdk.mod.IMEventTypes.UCConnected
  - typingsSlinky.voximplantWebsdk.mod.IMEventTypes.UCDisconnected
*/
trait VoxImplantIMEvent extends js.Object

object VoxImplantIMEvent {
  @scala.inline
  implicit def apply(value: ChatHistoryReceived): VoxImplantIMEvent = value.asInstanceOf[VoxImplantIMEvent]
  @scala.inline
  implicit def apply(value: ChatRoomBanList): VoxImplantIMEvent = value.asInstanceOf[VoxImplantIMEvent]
  @scala.inline
  implicit def apply(value: ChatRoomCreated): VoxImplantIMEvent = value.asInstanceOf[VoxImplantIMEvent]
  @scala.inline
  implicit def apply(value: ChatRoomError): VoxImplantIMEvent = value.asInstanceOf[VoxImplantIMEvent]
  @scala.inline
  implicit def apply(value: ChatRoomHistoryReceived): VoxImplantIMEvent = value.asInstanceOf[VoxImplantIMEvent]
  @scala.inline
  implicit def apply(value: typingsSlinky.voximplantWebsdk.mod.IMEventTypes.ChatRoomInfo): VoxImplantIMEvent = value.asInstanceOf[VoxImplantIMEvent]
  @scala.inline
  implicit def apply(value: ChatRoomInvitation): VoxImplantIMEvent = value.asInstanceOf[VoxImplantIMEvent]
  @scala.inline
  implicit def apply(value: ChatRoomInviteDeclined): VoxImplantIMEvent = value.asInstanceOf[VoxImplantIMEvent]
  @scala.inline
  implicit def apply(value: ChatRoomMessageModified): VoxImplantIMEvent = value.asInstanceOf[VoxImplantIMEvent]
  @scala.inline
  implicit def apply(value: ChatRoomMessageNotModified): VoxImplantIMEvent = value.asInstanceOf[VoxImplantIMEvent]
  @scala.inline
  implicit def apply(value: ChatRoomMessageReceived): VoxImplantIMEvent = value.asInstanceOf[VoxImplantIMEvent]
  @scala.inline
  implicit def apply(value: ChatRoomMessageRemoved): VoxImplantIMEvent = value.asInstanceOf[VoxImplantIMEvent]
  @scala.inline
  implicit def apply(value: ChatRoomNewParticipant): VoxImplantIMEvent = value.asInstanceOf[VoxImplantIMEvent]
  @scala.inline
  implicit def apply(value: ChatRoomOperation): VoxImplantIMEvent = value.asInstanceOf[VoxImplantIMEvent]
  @scala.inline
  implicit def apply(value: ChatRoomParticipantExit): VoxImplantIMEvent = value.asInstanceOf[VoxImplantIMEvent]
  @scala.inline
  implicit def apply(value: ChatRoomParticipants): VoxImplantIMEvent = value.asInstanceOf[VoxImplantIMEvent]
  @scala.inline
  implicit def apply(value: ChatRoomPresenceUpdate): VoxImplantIMEvent = value.asInstanceOf[VoxImplantIMEvent]
  @scala.inline
  implicit def apply(value: ChatRoomStateUpdate): VoxImplantIMEvent = value.asInstanceOf[VoxImplantIMEvent]
  @scala.inline
  implicit def apply(value: ChatRoomSubjectChange): VoxImplantIMEvent = value.asInstanceOf[VoxImplantIMEvent]
  @scala.inline
  implicit def apply(value: ChatRoomsDataReceived): VoxImplantIMEvent = value.asInstanceOf[VoxImplantIMEvent]
  @scala.inline
  implicit def apply(value: ChatStateUpdate): VoxImplantIMEvent = value.asInstanceOf[VoxImplantIMEvent]
  @scala.inline
  implicit def apply(value: MessageModified): VoxImplantIMEvent = value.asInstanceOf[VoxImplantIMEvent]
  @scala.inline
  implicit def apply(value: MessageNotModified): VoxImplantIMEvent = value.asInstanceOf[VoxImplantIMEvent]
  @scala.inline
  implicit def apply(value: MessageReceived): VoxImplantIMEvent = value.asInstanceOf[VoxImplantIMEvent]
  @scala.inline
  implicit def apply(value: MessageRemoved): VoxImplantIMEvent = value.asInstanceOf[VoxImplantIMEvent]
  @scala.inline
  implicit def apply(value: MessageStatus): VoxImplantIMEvent = value.asInstanceOf[VoxImplantIMEvent]
  @scala.inline
  implicit def apply(value: PresenceUpdate): VoxImplantIMEvent = value.asInstanceOf[VoxImplantIMEvent]
  @scala.inline
  implicit def apply(value: RosterItemChange): VoxImplantIMEvent = value.asInstanceOf[VoxImplantIMEvent]
  @scala.inline
  implicit def apply(value: RosterPresenceUpdate): VoxImplantIMEvent = value.asInstanceOf[VoxImplantIMEvent]
  @scala.inline
  implicit def apply(value: RosterReceived): VoxImplantIMEvent = value.asInstanceOf[VoxImplantIMEvent]
  @scala.inline
  implicit def apply(value: SubscriptionRequest): VoxImplantIMEvent = value.asInstanceOf[VoxImplantIMEvent]
  @scala.inline
  implicit def apply(value: SystemError): VoxImplantIMEvent = value.asInstanceOf[VoxImplantIMEvent]
  @scala.inline
  implicit def apply(value: UCConnected): VoxImplantIMEvent = value.asInstanceOf[VoxImplantIMEvent]
  @scala.inline
  implicit def apply(value: UCDisconnected): VoxImplantIMEvent = value.asInstanceOf[VoxImplantIMEvent]
}

