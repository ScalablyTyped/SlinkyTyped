package typingsSlinky.sharepoint.SP.JsGrid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SelectionTypeFlags extends js.Object
@JSGlobal("SP.JsGrid.SelectionTypeFlags")
@js.native
object SelectionTypeFlags extends js.Object {
  
  @js.native
  sealed trait MultipleCellRanges extends SelectionTypeFlags
  
  @js.native
  sealed trait MultipleColRanges extends SelectionTypeFlags
  
  @js.native
  sealed trait MultipleRowRanges extends SelectionTypeFlags
}
