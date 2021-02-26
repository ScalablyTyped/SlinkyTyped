package typingsSlinky.steamClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EWorkshopFileAction extends StObject
@JSImport("steam-client", "EWorkshopFileAction")
@js.native
object EWorkshopFileAction extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EWorkshopFileAction with Double] = js.native
  
  @js.native
  sealed trait Completed extends EWorkshopFileAction
  /* 1 */ val Completed: typingsSlinky.steamClient.mod.EWorkshopFileAction.Completed with Double = js.native
  
  @js.native
  sealed trait Played extends EWorkshopFileAction
  /* 0 */ val Played: typingsSlinky.steamClient.mod.EWorkshopFileAction.Played with Double = js.native
}
