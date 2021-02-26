package typingsSlinky.vegaTypings.transformMod

import typingsSlinky.vegaTypings.vegaTypingsStrings.stratify
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StratifyTransform extends _Transforms {
  
  var key: FieldRef = js.native
  
  var parentKey: FieldRef = js.native
  
  var `type`: stratify = js.native
}
object StratifyTransform {
  
  @scala.inline
  def apply(key: FieldRef, parentKey: FieldRef, `type`: stratify): StratifyTransform = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], parentKey = parentKey.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[StratifyTransform]
  }
  
  @scala.inline
  implicit class StratifyTransformMutableBuilder[Self <: StratifyTransform] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKey(value: FieldRef): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentKey(value: FieldRef): Self = StObject.set(x, "parentKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: stratify): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
