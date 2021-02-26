package typingsSlinky.vegaTypings.markMod

import typingsSlinky.vegaTypings.exprMod.ExprRef
import typingsSlinky.vegaTypings.signalMod.SignalRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.vegaTypings.anon.Order
  - typingsSlinky.vegaTypings.anon.FieldOrder
*/
trait Compare extends StObject
object Compare {
  
  @scala.inline
  def FieldOrder(field: js.Array[String | ExprRef | SignalRef]): typingsSlinky.vegaTypings.anon.FieldOrder = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.vegaTypings.anon.FieldOrder]
  }
  
  @scala.inline
  def Order(field: String | ExprRef | SignalRef): typingsSlinky.vegaTypings.anon.Order = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.vegaTypings.anon.Order]
  }
}
