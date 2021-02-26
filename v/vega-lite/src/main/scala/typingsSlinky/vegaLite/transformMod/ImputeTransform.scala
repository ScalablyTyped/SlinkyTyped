package typingsSlinky.vegaLite.transformMod

import typingsSlinky.vegaLite.channeldefMod.FieldName
import typingsSlinky.vegaLite.srcImputeMod.ImputeParams
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ImputeTransform
  extends ImputeParams
     with Transform {
  
  /**
    * An optional array of fields by which to group the values.
    * Imputation will then be performed on a per-group basis.
    */
  var groupby: js.UndefOr[js.Array[FieldName]] = js.native
  
  /**
    * The data field for which the missing values should be imputed.
    */
  var impute: FieldName = js.native
  
  /**
    * A key field that uniquely identifies data objects within a group.
    * Missing key values (those occurring in the data but not in the current group) will be imputed.
    */
  var key: FieldName = js.native
}
object ImputeTransform {
  
  @scala.inline
  def apply(impute: FieldName, key: FieldName): ImputeTransform = {
    val __obj = js.Dynamic.literal(impute = impute.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImputeTransform]
  }
  
  @scala.inline
  implicit class ImputeTransformMutableBuilder[Self <: ImputeTransform] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGroupby(value: js.Array[FieldName]): Self = StObject.set(x, "groupby", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupbyUndefined: Self = StObject.set(x, "groupby", js.undefined)
    
    @scala.inline
    def setGroupbyVarargs(value: FieldName*): Self = StObject.set(x, "groupby", js.Array(value :_*))
    
    @scala.inline
    def setImpute(value: FieldName): Self = StObject.set(x, "impute", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKey(value: FieldName): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
  }
}
