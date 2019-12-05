package typingsSlinky.steamDashClient.steamDashClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EWorkshopFileAction extends js.Object

@JSImport("steam-client", "EWorkshopFileAction")
@js.native
object EWorkshopFileAction extends js.Object {
  @js.native
  sealed trait Completed extends EWorkshopFileAction
  
  @js.native
  sealed trait Played extends EWorkshopFileAction
  
  /* 1 */ val Completed: typingsSlinky.steamDashClient.steamDashClientMod.EWorkshopFileAction.Completed with Double = js.native
  /* 0 */ val Played: typingsSlinky.steamDashClient.steamDashClientMod.EWorkshopFileAction.Played with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EWorkshopFileAction with Double] = js.native
}

