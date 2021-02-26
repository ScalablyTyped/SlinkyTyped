package typingsSlinky.steamClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EPublishedFileVisibility extends StObject
@JSImport("steam-client", "EPublishedFileVisibility")
@js.native
object EPublishedFileVisibility extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EPublishedFileVisibility with Double] = js.native
  
  @js.native
  sealed trait FriendsOnly extends EPublishedFileVisibility
  /* 1 */ val FriendsOnly: typingsSlinky.steamClient.mod.EPublishedFileVisibility.FriendsOnly with Double = js.native
  
  @js.native
  sealed trait Private extends EPublishedFileVisibility
  /* 2 */ val Private: typingsSlinky.steamClient.mod.EPublishedFileVisibility.Private with Double = js.native
  
  @js.native
  sealed trait Public extends EPublishedFileVisibility
  /* 0 */ val Public: typingsSlinky.steamClient.mod.EPublishedFileVisibility.Public with Double = js.native
}
