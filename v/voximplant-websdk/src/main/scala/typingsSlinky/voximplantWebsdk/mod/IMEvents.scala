package typingsSlinky.voximplantWebsdk.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait IMEvents extends StObject
/**
  *    VoxImplant.Client Instant Messaging and Presence events
  */
@JSImport("voximplant-websdk", "IMEvents")
@js.native
object IMEvents extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[IMEvents with Double] = js.native
  
  @js.native
  sealed trait ChatHistoryReceived extends IMEvents
  /* 0 */ val ChatHistoryReceived: typingsSlinky.voximplantWebsdk.mod.IMEvents.ChatHistoryReceived with Double = js.native
  
  @js.native
  sealed trait ChatRoomBanList extends IMEvents
  /* 1 */ val ChatRoomBanList: typingsSlinky.voximplantWebsdk.mod.IMEvents.ChatRoomBanList with Double = js.native
  
  @js.native
  sealed trait ChatRoomCreated extends IMEvents
  /* 2 */ val ChatRoomCreated: typingsSlinky.voximplantWebsdk.mod.IMEvents.ChatRoomCreated with Double = js.native
  
  @js.native
  sealed trait ChatRoomError extends IMEvents
  /* 3 */ val ChatRoomError: typingsSlinky.voximplantWebsdk.mod.IMEvents.ChatRoomError with Double = js.native
  
  @js.native
  sealed trait ChatRoomHistoryReceived extends IMEvents
  /* 4 */ val ChatRoomHistoryReceived: typingsSlinky.voximplantWebsdk.mod.IMEvents.ChatRoomHistoryReceived with Double = js.native
  
  @js.native
  sealed trait ChatRoomInfo extends IMEvents
  /* 5 */ val ChatRoomInfo: typingsSlinky.voximplantWebsdk.mod.IMEvents.ChatRoomInfo with Double = js.native
  
  @js.native
  sealed trait ChatRoomInvitation extends IMEvents
  /* 6 */ val ChatRoomInvitation: typingsSlinky.voximplantWebsdk.mod.IMEvents.ChatRoomInvitation with Double = js.native
  
  @js.native
  sealed trait ChatRoomInviteDeclined extends IMEvents
  /* 7 */ val ChatRoomInviteDeclined: typingsSlinky.voximplantWebsdk.mod.IMEvents.ChatRoomInviteDeclined with Double = js.native
  
  @js.native
  sealed trait ChatRoomMessageModified extends IMEvents
  /* 8 */ val ChatRoomMessageModified: typingsSlinky.voximplantWebsdk.mod.IMEvents.ChatRoomMessageModified with Double = js.native
  
  @js.native
  sealed trait ChatRoomMessageNotModified extends IMEvents
  /* 9 */ val ChatRoomMessageNotModified: typingsSlinky.voximplantWebsdk.mod.IMEvents.ChatRoomMessageNotModified with Double = js.native
  
  @js.native
  sealed trait ChatRoomMessageReceived extends IMEvents
  /* 10 */ val ChatRoomMessageReceived: typingsSlinky.voximplantWebsdk.mod.IMEvents.ChatRoomMessageReceived with Double = js.native
  
  @js.native
  sealed trait ChatRoomMessageRemoved extends IMEvents
  /* 11 */ val ChatRoomMessageRemoved: typingsSlinky.voximplantWebsdk.mod.IMEvents.ChatRoomMessageRemoved with Double = js.native
  
  @js.native
  sealed trait ChatRoomNewParticipant extends IMEvents
  /* 12 */ val ChatRoomNewParticipant: typingsSlinky.voximplantWebsdk.mod.IMEvents.ChatRoomNewParticipant with Double = js.native
  
  @js.native
  sealed trait ChatRoomOperation extends IMEvents
  /* 13 */ val ChatRoomOperation: typingsSlinky.voximplantWebsdk.mod.IMEvents.ChatRoomOperation with Double = js.native
  
  @js.native
  sealed trait ChatRoomParticipantExit extends IMEvents
  /* 14 */ val ChatRoomParticipantExit: typingsSlinky.voximplantWebsdk.mod.IMEvents.ChatRoomParticipantExit with Double = js.native
  
  @js.native
  sealed trait ChatRoomParticipants extends IMEvents
  /* 15 */ val ChatRoomParticipants: typingsSlinky.voximplantWebsdk.mod.IMEvents.ChatRoomParticipants with Double = js.native
  
  @js.native
  sealed trait ChatRoomPresenceUpdate extends IMEvents
  /* 16 */ val ChatRoomPresenceUpdate: typingsSlinky.voximplantWebsdk.mod.IMEvents.ChatRoomPresenceUpdate with Double = js.native
  
  @js.native
  sealed trait ChatRoomStateUpdate extends IMEvents
  /* 17 */ val ChatRoomStateUpdate: typingsSlinky.voximplantWebsdk.mod.IMEvents.ChatRoomStateUpdate with Double = js.native
  
  @js.native
  sealed trait ChatRoomSubjectChange extends IMEvents
  /* 18 */ val ChatRoomSubjectChange: typingsSlinky.voximplantWebsdk.mod.IMEvents.ChatRoomSubjectChange with Double = js.native
  
  @js.native
  sealed trait ChatRoomsDataReceived extends IMEvents
  /* 19 */ val ChatRoomsDataReceived: typingsSlinky.voximplantWebsdk.mod.IMEvents.ChatRoomsDataReceived with Double = js.native
  
  @js.native
  sealed trait ChatStateUpdate extends IMEvents
  /* 20 */ val ChatStateUpdate: typingsSlinky.voximplantWebsdk.mod.IMEvents.ChatStateUpdate with Double = js.native
  
  @js.native
  sealed trait MessageModified extends IMEvents
  /* 21 */ val MessageModified: typingsSlinky.voximplantWebsdk.mod.IMEvents.MessageModified with Double = js.native
  
  @js.native
  sealed trait MessageNotModified extends IMEvents
  /* 22 */ val MessageNotModified: typingsSlinky.voximplantWebsdk.mod.IMEvents.MessageNotModified with Double = js.native
  
  @js.native
  sealed trait MessageReceived extends IMEvents
  /* 23 */ val MessageReceived: typingsSlinky.voximplantWebsdk.mod.IMEvents.MessageReceived with Double = js.native
  
  @js.native
  sealed trait MessageRemoved extends IMEvents
  /* 24 */ val MessageRemoved: typingsSlinky.voximplantWebsdk.mod.IMEvents.MessageRemoved with Double = js.native
  
  @js.native
  sealed trait MessageStatus extends IMEvents
  /* 25 */ val MessageStatus: typingsSlinky.voximplantWebsdk.mod.IMEvents.MessageStatus with Double = js.native
  
  @js.native
  sealed trait PresenceUpdate extends IMEvents
  /* 26 */ val PresenceUpdate: typingsSlinky.voximplantWebsdk.mod.IMEvents.PresenceUpdate with Double = js.native
  
  @js.native
  sealed trait RosterItemChange extends IMEvents
  /* 27 */ val RosterItemChange: typingsSlinky.voximplantWebsdk.mod.IMEvents.RosterItemChange with Double = js.native
  
  @js.native
  sealed trait RosterPresenceUpdate extends IMEvents
  /* 28 */ val RosterPresenceUpdate: typingsSlinky.voximplantWebsdk.mod.IMEvents.RosterPresenceUpdate with Double = js.native
  
  @js.native
  sealed trait RosterReceived extends IMEvents
  /* 29 */ val RosterReceived: typingsSlinky.voximplantWebsdk.mod.IMEvents.RosterReceived with Double = js.native
  
  @js.native
  sealed trait SubscriptionRequest extends IMEvents
  /* 30 */ val SubscriptionRequest: typingsSlinky.voximplantWebsdk.mod.IMEvents.SubscriptionRequest with Double = js.native
  
  @js.native
  sealed trait SystemError extends IMEvents
  /* 31 */ val SystemError: typingsSlinky.voximplantWebsdk.mod.IMEvents.SystemError with Double = js.native
  
  @js.native
  sealed trait UCConnected extends IMEvents
  /* 32 */ val UCConnected: typingsSlinky.voximplantWebsdk.mod.IMEvents.UCConnected with Double = js.native
  
  @js.native
  sealed trait UCDisconnected extends IMEvents
  /* 33 */ val UCDisconnected: typingsSlinky.voximplantWebsdk.mod.IMEvents.UCDisconnected with Double = js.native
}
