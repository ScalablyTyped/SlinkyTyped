package typingsSlinky.steamClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EChatActionResult extends StObject
@JSImport("steam-client", "EChatActionResult")
@js.native
object EChatActionResult extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EChatActionResult with Double] = js.native
  
  @js.native
  sealed trait ChatDoesntExist extends EChatActionResult
  /* 8 */ val ChatDoesntExist: typingsSlinky.steamClient.mod.EChatActionResult.ChatDoesntExist with Double = js.native
  
  @js.native
  sealed trait ChatFull extends EChatActionResult
  /* 9 */ val ChatFull: typingsSlinky.steamClient.mod.EChatActionResult.ChatFull with Double = js.native
  
  @js.native
  sealed trait Error extends EChatActionResult
  /* 2 */ val Error: typingsSlinky.steamClient.mod.EChatActionResult.Error with Double = js.native
  
  @js.native
  sealed trait NotAllowedOnBannedUser extends EChatActionResult
  /* 5 */ val NotAllowedOnBannedUser: typingsSlinky.steamClient.mod.EChatActionResult.NotAllowedOnBannedUser with Double = js.native
  
  @js.native
  sealed trait NotAllowedOnChatOwner extends EChatActionResult
  /* 6 */ val NotAllowedOnChatOwner: typingsSlinky.steamClient.mod.EChatActionResult.NotAllowedOnChatOwner with Double = js.native
  
  @js.native
  sealed trait NotAllowedOnClanMember extends EChatActionResult
  /* 4 */ val NotAllowedOnClanMember: typingsSlinky.steamClient.mod.EChatActionResult.NotAllowedOnClanMember with Double = js.native
  
  @js.native
  sealed trait NotAllowedOnSelf extends EChatActionResult
  /* 7 */ val NotAllowedOnSelf: typingsSlinky.steamClient.mod.EChatActionResult.NotAllowedOnSelf with Double = js.native
  
  @js.native
  sealed trait NotPermitted extends EChatActionResult
  /* 3 */ val NotPermitted: typingsSlinky.steamClient.mod.EChatActionResult.NotPermitted with Double = js.native
  
  @js.native
  sealed trait Success extends EChatActionResult
  /* 1 */ val Success: typingsSlinky.steamClient.mod.EChatActionResult.Success with Double = js.native
  
  @js.native
  sealed trait VoiceSlotsFull extends EChatActionResult
  /* 10 */ val VoiceSlotsFull: typingsSlinky.steamClient.mod.EChatActionResult.VoiceSlotsFull with Double = js.native
}
