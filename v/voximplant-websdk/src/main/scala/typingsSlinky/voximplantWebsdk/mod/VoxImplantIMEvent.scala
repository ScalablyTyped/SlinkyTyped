package typingsSlinky.voximplantWebsdk.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
trait VoxImplantIMEvent extends StObject
object VoxImplantIMEvent {
  
  @scala.inline
  def ChatHistoryReceived(id: String, message_id: String, messages: js.Array[IMHistoryMessage]): typingsSlinky.voximplantWebsdk.mod.IMEventTypes.ChatHistoryReceived = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], message_id = message_id.asInstanceOf[js.Any], messages = messages.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.voximplantWebsdk.mod.IMEventTypes.ChatHistoryReceived]
  }
  
  @scala.inline
  def ChatRoomBanList(participants: js.Array[ChatRoomParticipant], room: String): typingsSlinky.voximplantWebsdk.mod.IMEventTypes.ChatRoomBanList = {
    val __obj = js.Dynamic.literal(participants = participants.asInstanceOf[js.Any], room = room.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.voximplantWebsdk.mod.IMEventTypes.ChatRoomBanList]
  }
  
  @scala.inline
  def ChatRoomCreated(room: String): typingsSlinky.voximplantWebsdk.mod.IMEventTypes.ChatRoomCreated = {
    val __obj = js.Dynamic.literal(room = room.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.voximplantWebsdk.mod.IMEventTypes.ChatRoomCreated]
  }
  
  @scala.inline
  def ChatRoomError(code: String, operation: String, room: String, text: String): typingsSlinky.voximplantWebsdk.mod.IMEventTypes.ChatRoomError = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], operation = operation.asInstanceOf[js.Any], room = room.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.voximplantWebsdk.mod.IMEventTypes.ChatRoomError]
  }
  
  @scala.inline
  def ChatRoomHistoryReceived(message_id: String, messages: js.Array[IMHistoryMessage], room: String): typingsSlinky.voximplantWebsdk.mod.IMEventTypes.ChatRoomHistoryReceived = {
    val __obj = js.Dynamic.literal(message_id = message_id.asInstanceOf[js.Any], messages = messages.asInstanceOf[js.Any], room = room.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.voximplantWebsdk.mod.IMEventTypes.ChatRoomHistoryReceived]
  }
  
  @scala.inline
  def ChatRoomInfo(
    features: Double,
    info: typingsSlinky.voximplantWebsdk.mod.IMEventTypes.ChatRoomInfo,
    room: String,
    room_name: String
  ): typingsSlinky.voximplantWebsdk.mod.IMEventTypes.ChatRoomInfo = {
    val __obj = js.Dynamic.literal(features = features.asInstanceOf[js.Any], info = info.asInstanceOf[js.Any], room = room.asInstanceOf[js.Any], room_name = room_name.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.voximplantWebsdk.mod.IMEventTypes.ChatRoomInfo]
  }
  
  @scala.inline
  def ChatRoomInvitation(body: String, from: String, password: String, reason: String, room: String): typingsSlinky.voximplantWebsdk.mod.IMEventTypes.ChatRoomInvitation = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], from = from.asInstanceOf[js.Any], password = password.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any], room = room.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.voximplantWebsdk.mod.IMEventTypes.ChatRoomInvitation]
  }
  
  @scala.inline
  def ChatRoomInviteDeclined(invitee: String, reason: String, room: String): typingsSlinky.voximplantWebsdk.mod.IMEventTypes.ChatRoomInviteDeclined = {
    val __obj = js.Dynamic.literal(invitee = invitee.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any], room = room.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.voximplantWebsdk.mod.IMEventTypes.ChatRoomInviteDeclined]
  }
  
  @scala.inline
  def ChatRoomMessageModified(
    content: String,
    from: String,
    message_id: String,
    private_message: String,
    resource: String,
    room: String,
    timestamp: String
  ): typingsSlinky.voximplantWebsdk.mod.IMEventTypes.ChatRoomMessageModified = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], from = from.asInstanceOf[js.Any], message_id = message_id.asInstanceOf[js.Any], private_message = private_message.asInstanceOf[js.Any], resource = resource.asInstanceOf[js.Any], room = room.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.voximplantWebsdk.mod.IMEventTypes.ChatRoomMessageModified]
  }
  
  @scala.inline
  def ChatRoomMessageNotModified(code: Double, message_id: String, private_message: String, room: String): typingsSlinky.voximplantWebsdk.mod.IMEventTypes.ChatRoomMessageNotModified = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], message_id = message_id.asInstanceOf[js.Any], private_message = private_message.asInstanceOf[js.Any], room = room.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.voximplantWebsdk.mod.IMEventTypes.ChatRoomMessageNotModified]
  }
  
  @scala.inline
  def ChatRoomMessageReceived(
    content: String,
    from: String,
    message_id: String,
    private_message: String,
    resource: String,
    room: String,
    timestamp: String
  ): typingsSlinky.voximplantWebsdk.mod.IMEventTypes.ChatRoomMessageReceived = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], from = from.asInstanceOf[js.Any], message_id = message_id.asInstanceOf[js.Any], private_message = private_message.asInstanceOf[js.Any], resource = resource.asInstanceOf[js.Any], room = room.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.voximplantWebsdk.mod.IMEventTypes.ChatRoomMessageReceived]
  }
  
  @scala.inline
  def ChatRoomMessageRemoved(
    from: String,
    message_id: String,
    private_message: String,
    resource: String,
    room: String,
    timestamp: String
  ): typingsSlinky.voximplantWebsdk.mod.IMEventTypes.ChatRoomMessageRemoved = {
    val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], message_id = message_id.asInstanceOf[js.Any], private_message = private_message.asInstanceOf[js.Any], resource = resource.asInstanceOf[js.Any], room = room.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.voximplantWebsdk.mod.IMEventTypes.ChatRoomMessageRemoved]
  }
  
  @scala.inline
  def ChatRoomNewParticipant(displayName: String, participant: String, room: String): typingsSlinky.voximplantWebsdk.mod.IMEventTypes.ChatRoomNewParticipant = {
    val __obj = js.Dynamic.literal(displayName = displayName.asInstanceOf[js.Any], participant = participant.asInstanceOf[js.Any], room = room.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.voximplantWebsdk.mod.IMEventTypes.ChatRoomNewParticipant]
  }
  
  @scala.inline
  def ChatRoomOperation(operation: ChatRoomOperationType, result: Boolean, room: String): typingsSlinky.voximplantWebsdk.mod.IMEventTypes.ChatRoomOperation = {
    val __obj = js.Dynamic.literal(operation = operation.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any], room = room.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.voximplantWebsdk.mod.IMEventTypes.ChatRoomOperation]
  }
  
  @scala.inline
  def ChatRoomParticipantExit(participant: String, room: String): typingsSlinky.voximplantWebsdk.mod.IMEventTypes.ChatRoomParticipantExit = {
    val __obj = js.Dynamic.literal(participant = participant.asInstanceOf[js.Any], room = room.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.voximplantWebsdk.mod.IMEventTypes.ChatRoomParticipantExit]
  }
  
  @scala.inline
  def ChatRoomParticipants(participants: js.Array[ChatRoomParticipant], room: String): typingsSlinky.voximplantWebsdk.mod.IMEventTypes.ChatRoomParticipants = {
    val __obj = js.Dynamic.literal(participants = participants.asInstanceOf[js.Any], room = room.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.voximplantWebsdk.mod.IMEventTypes.ChatRoomParticipants]
  }
  
  @scala.inline
  def ChatRoomPresenceUpdate(message: String, participant: ParticipantInfo, presence: UserStatuses, room: String): typingsSlinky.voximplantWebsdk.mod.IMEventTypes.ChatRoomPresenceUpdate = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], participant = participant.asInstanceOf[js.Any], presence = presence.asInstanceOf[js.Any], room = room.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.voximplantWebsdk.mod.IMEventTypes.ChatRoomPresenceUpdate]
  }
  
  @scala.inline
  def ChatRoomStateUpdate(from: String, resource: String, room: String, state: ChatStateType): typingsSlinky.voximplantWebsdk.mod.IMEventTypes.ChatRoomStateUpdate = {
    val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], resource = resource.asInstanceOf[js.Any], room = room.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.voximplantWebsdk.mod.IMEventTypes.ChatRoomStateUpdate]
  }
  
  @scala.inline
  def ChatRoomSubjectChange(id: String, resource: String, room: String, subject: String): typingsSlinky.voximplantWebsdk.mod.IMEventTypes.ChatRoomSubjectChange = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], resource = resource.asInstanceOf[js.Any], room = room.asInstanceOf[js.Any], subject = subject.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.voximplantWebsdk.mod.IMEventTypes.ChatRoomSubjectChange]
  }
  
  @scala.inline
  def ChatRoomsDataReceived(rooms: js.Array[ChatRoom]): typingsSlinky.voximplantWebsdk.mod.IMEventTypes.ChatRoomsDataReceived = {
    val __obj = js.Dynamic.literal(rooms = rooms.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.voximplantWebsdk.mod.IMEventTypes.ChatRoomsDataReceived]
  }
  
  @scala.inline
  def ChatStateUpdate(id: String, state: ChatStateType): typingsSlinky.voximplantWebsdk.mod.IMEventTypes.ChatStateUpdate = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.voximplantWebsdk.mod.IMEventTypes.ChatStateUpdate]
  }
  
  @scala.inline
  def MessageModified(content: String, id: String, message_id: String, to: String): typingsSlinky.voximplantWebsdk.mod.IMEventTypes.MessageModified = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], message_id = message_id.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.voximplantWebsdk.mod.IMEventTypes.MessageModified]
  }
  
  @scala.inline
  def MessageNotModified(code: Double, message_id: String, to: String): typingsSlinky.voximplantWebsdk.mod.IMEventTypes.MessageNotModified = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], message_id = message_id.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.voximplantWebsdk.mod.IMEventTypes.MessageNotModified]
  }
  
  @scala.inline
  def MessageReceived(content: String, id: String, message_id: String, to: String): typingsSlinky.voximplantWebsdk.mod.IMEventTypes.MessageReceived = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], message_id = message_id.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.voximplantWebsdk.mod.IMEventTypes.MessageReceived]
  }
  
  @scala.inline
  def MessageRemoved(id: String, message_id: String, to: String): typingsSlinky.voximplantWebsdk.mod.IMEventTypes.MessageRemoved = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], message_id = message_id.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.voximplantWebsdk.mod.IMEventTypes.MessageRemoved]
  }
  
  @scala.inline
  def MessageStatus(id: String, message_id: String, `type`: MessageEventType): typingsSlinky.voximplantWebsdk.mod.IMEventTypes.MessageStatus = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], message_id = message_id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.voximplantWebsdk.mod.IMEventTypes.MessageStatus]
  }
  
  @scala.inline
  def PresenceUpdate(id: String, message: String, presence: UserStatuses): typingsSlinky.voximplantWebsdk.mod.IMEventTypes.PresenceUpdate = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], presence = presence.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.voximplantWebsdk.mod.IMEventTypes.PresenceUpdate]
  }
  
  @scala.inline
  def RosterItemChange(displayName: String, groups: js.Array[String], id: String, `type`: RosterItemEvent): typingsSlinky.voximplantWebsdk.mod.IMEventTypes.RosterItemChange = {
    val __obj = js.Dynamic.literal(displayName = displayName.asInstanceOf[js.Any], groups = groups.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.voximplantWebsdk.mod.IMEventTypes.RosterItemChange]
  }
  
  @scala.inline
  def RosterPresenceUpdate(id: String, presence: UserStatuses): typingsSlinky.voximplantWebsdk.mod.IMEventTypes.RosterPresenceUpdate = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], presence = presence.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.voximplantWebsdk.mod.IMEventTypes.RosterPresenceUpdate]
  }
  
  @scala.inline
  def RosterReceived(id: String, roster: js.Array[RosterItem]): typingsSlinky.voximplantWebsdk.mod.IMEventTypes.RosterReceived = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], roster = roster.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.voximplantWebsdk.mod.IMEventTypes.RosterReceived]
  }
  
  @scala.inline
  def SubscriptionRequest(id: String, `type`: SubscriptionRequestType): typingsSlinky.voximplantWebsdk.mod.IMEventTypes.SubscriptionRequest = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.voximplantWebsdk.mod.IMEventTypes.SubscriptionRequest]
  }
  
  @scala.inline
  def SystemError(errorData: js.Object, errorType: IMErrorType): typingsSlinky.voximplantWebsdk.mod.IMEventTypes.SystemError = {
    val __obj = js.Dynamic.literal(errorData = errorData.asInstanceOf[js.Any], errorType = errorType.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.voximplantWebsdk.mod.IMEventTypes.SystemError]
  }
}
