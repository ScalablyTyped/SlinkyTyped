package typingsSlinky.vegaTypings.scaleMod

import typingsSlinky.vegaTypings.vegaTypingsStrings.count
import typingsSlinky.vegaTypings.vegaTypingsStrings.max
import typingsSlinky.vegaTypings.vegaTypingsStrings.min
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait _UnionSortField extends StObject
object _UnionSortField {
  
  @scala.inline
  def FieldOp(field: ScaleField, op: count | min | max): typingsSlinky.vegaTypings.anon.FieldOp = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any], op = op.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.vegaTypings.anon.FieldOp]
  }
  
  @scala.inline
  def OpOrder(op: count): typingsSlinky.vegaTypings.anon.OpOrder = {
    val __obj = js.Dynamic.literal(op = op.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.vegaTypings.anon.OpOrder]
  }
}
