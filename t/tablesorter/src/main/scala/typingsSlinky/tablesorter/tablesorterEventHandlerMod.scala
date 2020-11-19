package typingsSlinky.tablesorter

import typingsSlinky.jquery.JQuery.TriggeredEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("tablesorter/System/TablesorterEventHandler", JSImport.Namespace)
@js.native
object tablesorterEventHandlerMod extends js.Object {
  
  type TablesorterEventHandler[TElement] = js.Function2[
    /* eventArgs */ TriggeredEvent[TElement, Null, TElement, TElement], 
    /* table */ TElement, 
    Unit
  ]
}
