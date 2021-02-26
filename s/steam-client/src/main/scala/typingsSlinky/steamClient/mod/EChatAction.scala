package typingsSlinky.steamClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EChatAction extends StObject
@JSImport("steam-client", "EChatAction")
@js.native
object EChatAction extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EChatAction with Double] = js.native
  
  @js.native
  sealed trait Ban extends EChatAction
  /* 3 */ val Ban: typingsSlinky.steamClient.mod.EChatAction.Ban with Double = js.native
  
  @js.native
  sealed trait CloseChat extends EChatAction
  /* 9 */ val CloseChat: typingsSlinky.steamClient.mod.EChatAction.CloseChat with Double = js.native
  
  @js.native
  sealed trait EndVoiceSpeak extends EChatAction
  /* 6 */ val EndVoiceSpeak: typingsSlinky.steamClient.mod.EChatAction.EndVoiceSpeak with Double = js.native
  
  @js.native
  sealed trait InviteChat extends EChatAction
  /* 1 */ val InviteChat: typingsSlinky.steamClient.mod.EChatAction.InviteChat with Double = js.native
  
  @js.native
  sealed trait Kick extends EChatAction
  /* 2 */ val Kick: typingsSlinky.steamClient.mod.EChatAction.Kick with Double = js.native
  
  @js.native
  sealed trait LockChat extends EChatAction
  /* 7 */ val LockChat: typingsSlinky.steamClient.mod.EChatAction.LockChat with Double = js.native
  
  @js.native
  sealed trait SetInvisibleToFriends extends EChatAction
  /* 13 */ val SetInvisibleToFriends: typingsSlinky.steamClient.mod.EChatAction.SetInvisibleToFriends with Double = js.native
  
  @js.native
  sealed trait SetJoinable extends EChatAction
  /* 10 */ val SetJoinable: typingsSlinky.steamClient.mod.EChatAction.SetJoinable with Double = js.native
  
  @js.native
  sealed trait SetModerated extends EChatAction
  /* 15 */ val SetModerated: typingsSlinky.steamClient.mod.EChatAction.SetModerated with Double = js.native
  
  @js.native
  sealed trait SetOwner extends EChatAction
  /* 12 */ val SetOwner: typingsSlinky.steamClient.mod.EChatAction.SetOwner with Double = js.native
  
  @js.native
  sealed trait SetUnjoinable extends EChatAction
  /* 11 */ val SetUnjoinable: typingsSlinky.steamClient.mod.EChatAction.SetUnjoinable with Double = js.native
  
  @js.native
  sealed trait SetUnmoderated extends EChatAction
  /* 16 */ val SetUnmoderated: typingsSlinky.steamClient.mod.EChatAction.SetUnmoderated with Double = js.native
  
  @js.native
  sealed trait SetVisibleToFriends extends EChatAction
  /* 14 */ val SetVisibleToFriends: typingsSlinky.steamClient.mod.EChatAction.SetVisibleToFriends with Double = js.native
  
  @js.native
  sealed trait StartVoiceSpeak extends EChatAction
  /* 5 */ val StartVoiceSpeak: typingsSlinky.steamClient.mod.EChatAction.StartVoiceSpeak with Double = js.native
  
  @js.native
  sealed trait UnBan extends EChatAction
  /* 4 */ val UnBan: typingsSlinky.steamClient.mod.EChatAction.UnBan with Double = js.native
  
  @js.native
  sealed trait UnlockChat extends EChatAction
  /* 8 */ val UnlockChat: typingsSlinky.steamClient.mod.EChatAction.UnlockChat with Double = js.native
}
