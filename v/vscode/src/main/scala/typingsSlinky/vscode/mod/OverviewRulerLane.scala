package typingsSlinky.vscode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait OverviewRulerLane extends StObject
@JSImport("vscode", "OverviewRulerLane")
@js.native
object OverviewRulerLane extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[OverviewRulerLane with Double] = js.native
  
  @js.native
  sealed trait Center extends OverviewRulerLane
  /* 2 */ val Center: typingsSlinky.vscode.mod.OverviewRulerLane.Center with Double = js.native
  
  @js.native
  sealed trait Full extends OverviewRulerLane
  /* 7 */ val Full: typingsSlinky.vscode.mod.OverviewRulerLane.Full with Double = js.native
  
  @js.native
  sealed trait Left extends OverviewRulerLane
  /* 1 */ val Left: typingsSlinky.vscode.mod.OverviewRulerLane.Left with Double = js.native
  
  @js.native
  sealed trait Right extends OverviewRulerLane
  /* 4 */ val Right: typingsSlinky.vscode.mod.OverviewRulerLane.Right with Double = js.native
}
