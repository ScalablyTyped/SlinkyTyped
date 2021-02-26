package typingsSlinky.sharepoint.SP.JsGrid

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ClickContext extends StObject
@JSGlobal("SP.JsGrid.ClickContext")
@js.native
object ClickContext extends StObject {
  
  @js.native
  sealed trait Cell extends ClickContext
  
  @js.native
  sealed trait ColumnHeader extends ClickContext
  
  @js.native
  sealed trait Gantt extends ClickContext
  
  @js.native
  sealed trait Other extends ClickContext
  
  @js.native
  sealed trait RowHeader extends ClickContext
  
  @js.native
  sealed trait SelectAllSquare extends ClickContext
}
