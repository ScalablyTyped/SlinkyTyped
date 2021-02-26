package typingsSlinky.vegaTypings.transformMod

import typingsSlinky.vegaTypings.signalMod.SignalRef
import typingsSlinky.vegaTypings.vegaTypingsStrings.flatten
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FlattenTransform extends _Transforms {
  
  var as: js.UndefOr[(js.Array[String | SignalRef]) | SignalRef] = js.native
  
  var fields: js.Array[FieldRef] | SignalRef = js.native
  
  var index: js.UndefOr[String | SignalRef] = js.native
  
  var `type`: flatten = js.native
}
object FlattenTransform {
  
  @scala.inline
  def apply(fields: js.Array[FieldRef] | SignalRef, `type`: flatten): FlattenTransform = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlattenTransform]
  }
  
  @scala.inline
  implicit class FlattenTransformMutableBuilder[Self <: FlattenTransform] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAs(value: (js.Array[String | SignalRef]) | SignalRef): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
    
    @scala.inline
    def setAsVarargs(value: (String | SignalRef)*): Self = StObject.set(x, "as", js.Array(value :_*))
    
    @scala.inline
    def setFields(value: js.Array[FieldRef] | SignalRef): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldsVarargs(value: FieldRef*): Self = StObject.set(x, "fields", js.Array(value :_*))
    
    @scala.inline
    def setIndex(value: String | SignalRef): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
    
    @scala.inline
    def setType(value: flatten): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
