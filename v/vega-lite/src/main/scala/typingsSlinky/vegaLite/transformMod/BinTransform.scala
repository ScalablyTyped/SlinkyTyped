package typingsSlinky.vegaLite.transformMod

import typingsSlinky.vegaLite.binMod.BinParams
import typingsSlinky.vegaLite.channeldefMod.FieldName
import typingsSlinky.vegaLite.vegaLiteBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BinTransform extends Transform {
  
  /**
    * The output fields at which to write the start and end bin values.
    * This can be either a string or an array of strings with two elements denoting the name for the fields for bin start and bin end respectively.
    * If a single string (e.g., `"val"`) is provided, the end field will be `"val_end"`.
    */
  var as: FieldName | js.Array[FieldName] = js.native
  
  /**
    * An object indicating bin properties, or simply `true` for using default bin parameters.
    */
  var bin: `true` | BinParams = js.native
  
  /**
    * The data field to bin.
    */
  var field: FieldName = js.native
}
object BinTransform {
  
  @scala.inline
  def apply(as: FieldName | js.Array[FieldName], bin: `true` | BinParams, field: FieldName): BinTransform = {
    val __obj = js.Dynamic.literal(as = as.asInstanceOf[js.Any], bin = bin.asInstanceOf[js.Any], field = field.asInstanceOf[js.Any])
    __obj.asInstanceOf[BinTransform]
  }
  
  @scala.inline
  implicit class BinTransformMutableBuilder[Self <: BinTransform] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAs(value: FieldName | js.Array[FieldName]): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAsVarargs(value: FieldName*): Self = StObject.set(x, "as", js.Array(value :_*))
    
    @scala.inline
    def setBin(value: `true` | BinParams): Self = StObject.set(x, "bin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setField(value: FieldName): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
  }
}
