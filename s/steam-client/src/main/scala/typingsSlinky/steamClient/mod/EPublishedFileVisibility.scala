package typingsSlinky.steamClient.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EPublishedFileVisibility extends js.Object
@JSImport("steam-client", "EPublishedFileVisibility")
@js.native
object EPublishedFileVisibility extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EPublishedFileVisibility with Double] = js.native
  
  @js.native
  sealed trait FriendsOnly extends EPublishedFileVisibility
  /* 1 */ @js.native
  object FriendsOnly extends TopLevel[FriendsOnly with Double]
  
  @js.native
  sealed trait Private extends EPublishedFileVisibility
  /* 2 */ @js.native
  object Private extends TopLevel[Private with Double]
  
  @js.native
  sealed trait Public extends EPublishedFileVisibility
  /* 0 */ @js.native
  object Public extends TopLevel[Public with Double]
}
