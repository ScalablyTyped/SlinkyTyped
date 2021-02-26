package typingsSlinky.vsoNodeApi.anon

import typingsSlinky.vsoNodeApi.workItemTrackingInterfacesMod.WorkItemTypeColorAndIcon
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Value extends StObject {
  
  var key: String = js.native
  
  var value: js.Array[WorkItemTypeColorAndIcon] = js.native
}
object Value {
  
  @scala.inline
  def apply(key: String, value: js.Array[WorkItemTypeColorAndIcon]): Value = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Value]
  }
  
  @scala.inline
  implicit class ValueMutableBuilder[Self <: Value] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: js.Array[WorkItemTypeColorAndIcon]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueVarargs(value: WorkItemTypeColorAndIcon*): Self = StObject.set(x, "value", js.Array(value :_*))
  }
}
