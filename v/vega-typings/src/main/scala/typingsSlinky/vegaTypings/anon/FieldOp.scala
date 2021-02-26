package typingsSlinky.vegaTypings.anon

import typingsSlinky.vegaTypings.scaleMod.ScaleField
import typingsSlinky.vegaTypings.scaleMod.SortOrder
import typingsSlinky.vegaTypings.scaleMod._UnionSortField
import typingsSlinky.vegaTypings.vegaTypingsStrings.count
import typingsSlinky.vegaTypings.vegaTypingsStrings.max
import typingsSlinky.vegaTypings.vegaTypingsStrings.min
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FieldOp extends _UnionSortField {
  
  var field: ScaleField = js.native
  
  var op: count | min | max = js.native
  
  var order: js.UndefOr[SortOrder] = js.native
}
object FieldOp {
  
  @scala.inline
  def apply(field: ScaleField, op: count | min | max): FieldOp = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any], op = op.asInstanceOf[js.Any])
    __obj.asInstanceOf[FieldOp]
  }
  
  @scala.inline
  implicit class FieldOpMutableBuilder[Self <: FieldOp] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setField(value: ScaleField): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOp(value: count | min | max): Self = StObject.set(x, "op", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrder(value: SortOrder): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrderUndefined: Self = StObject.set(x, "order", js.undefined)
  }
}
