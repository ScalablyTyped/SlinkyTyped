package typingsSlinky.steamDashClient.steamDashClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EChatAction extends js.Object

@JSImport("steam-client", "EChatAction")
@js.native
object EChatAction extends js.Object {
  @js.native
  sealed trait Ban extends EChatAction
  
  @js.native
  sealed trait CloseChat extends EChatAction
  
  @js.native
  sealed trait EndVoiceSpeak extends EChatAction
  
  @js.native
  sealed trait InviteChat extends EChatAction
  
  @js.native
  sealed trait Kick extends EChatAction
  
  @js.native
  sealed trait LockChat extends EChatAction
  
  @js.native
  sealed trait SetInvisibleToFriends extends EChatAction
  
  @js.native
  sealed trait SetJoinable extends EChatAction
  
  @js.native
  sealed trait SetModerated extends EChatAction
  
  @js.native
  sealed trait SetOwner extends EChatAction
  
  @js.native
  sealed trait SetUnjoinable extends EChatAction
  
  @js.native
  sealed trait SetUnmoderated extends EChatAction
  
  @js.native
  sealed trait SetVisibleToFriends extends EChatAction
  
  @js.native
  sealed trait StartVoiceSpeak extends EChatAction
  
  @js.native
  sealed trait UnBan extends EChatAction
  
  @js.native
  sealed trait UnlockChat extends EChatAction
  
  /* 3 */ val Ban: typingsSlinky.steamDashClient.steamDashClientMod.EChatAction.Ban with Double = js.native
  /* 9 */ val CloseChat: typingsSlinky.steamDashClient.steamDashClientMod.EChatAction.CloseChat with Double = js.native
  /* 6 */ val EndVoiceSpeak: typingsSlinky.steamDashClient.steamDashClientMod.EChatAction.EndVoiceSpeak with Double = js.native
  /* 1 */ val InviteChat: typingsSlinky.steamDashClient.steamDashClientMod.EChatAction.InviteChat with Double = js.native
  /* 2 */ val Kick: typingsSlinky.steamDashClient.steamDashClientMod.EChatAction.Kick with Double = js.native
  /* 7 */ val LockChat: typingsSlinky.steamDashClient.steamDashClientMod.EChatAction.LockChat with Double = js.native
  /* 13 */ val SetInvisibleToFriends: typingsSlinky.steamDashClient.steamDashClientMod.EChatAction.SetInvisibleToFriends with Double = js.native
  /* 10 */ val SetJoinable: typingsSlinky.steamDashClient.steamDashClientMod.EChatAction.SetJoinable with Double = js.native
  /* 15 */ val SetModerated: typingsSlinky.steamDashClient.steamDashClientMod.EChatAction.SetModerated with Double = js.native
  /* 12 */ val SetOwner: typingsSlinky.steamDashClient.steamDashClientMod.EChatAction.SetOwner with Double = js.native
  /* 11 */ val SetUnjoinable: typingsSlinky.steamDashClient.steamDashClientMod.EChatAction.SetUnjoinable with Double = js.native
  /* 16 */ val SetUnmoderated: typingsSlinky.steamDashClient.steamDashClientMod.EChatAction.SetUnmoderated with Double = js.native
  /* 14 */ val SetVisibleToFriends: typingsSlinky.steamDashClient.steamDashClientMod.EChatAction.SetVisibleToFriends with Double = js.native
  /* 5 */ val StartVoiceSpeak: typingsSlinky.steamDashClient.steamDashClientMod.EChatAction.StartVoiceSpeak with Double = js.native
  /* 4 */ val UnBan: typingsSlinky.steamDashClient.steamDashClientMod.EChatAction.UnBan with Double = js.native
  /* 8 */ val UnlockChat: typingsSlinky.steamDashClient.steamDashClientMod.EChatAction.UnlockChat with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EChatAction with Double] = js.native
}

