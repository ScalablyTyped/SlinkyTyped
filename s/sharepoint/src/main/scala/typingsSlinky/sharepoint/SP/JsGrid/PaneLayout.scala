package typingsSlinky.sharepoint.SP.JsGrid

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait PaneLayout extends StObject
@JSGlobal("SP.JsGrid.PaneLayout")
@js.native
object PaneLayout extends StObject {
  
  // 0,
  @js.native
  sealed trait GridAndGantt extends PaneLayout
  
  // 1,
  @js.native
  sealed trait GridAndPivotedGrid extends PaneLayout
  
  @js.native
  sealed trait GridOnly extends PaneLayout
}
