package typingsSlinky.steamClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EUCMFilePrivacyState extends StObject
@JSImport("steam-client", "EUCMFilePrivacyState")
@js.native
object EUCMFilePrivacyState extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EUCMFilePrivacyState with Double] = js.native
  
  @js.native
  sealed trait All extends EUCMFilePrivacyState
  /* 8 | 4 | 2 */ val All: typingsSlinky.steamClient.mod.EUCMFilePrivacyState.All with Double = js.native
  
  @js.native
  sealed trait FriendsOnly extends EUCMFilePrivacyState
  /* 4 */ val FriendsOnly: typingsSlinky.steamClient.mod.EUCMFilePrivacyState.FriendsOnly with Double = js.native
  
  @js.native
  sealed trait Invalid extends EUCMFilePrivacyState
  /* -1 */ val Invalid: typingsSlinky.steamClient.mod.EUCMFilePrivacyState.Invalid with Double = js.native
  
  @js.native
  sealed trait Private extends EUCMFilePrivacyState
  /* 2 */ val Private: typingsSlinky.steamClient.mod.EUCMFilePrivacyState.Private with Double = js.native
  
  @js.native
  sealed trait Public extends EUCMFilePrivacyState
  /* 8 */ val Public: typingsSlinky.steamClient.mod.EUCMFilePrivacyState.Public with Double = js.native
}
