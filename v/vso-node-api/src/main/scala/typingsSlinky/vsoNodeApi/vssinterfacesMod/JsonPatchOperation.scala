package typingsSlinky.vsoNodeApi.vssinterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JsonPatchOperation extends StObject {
  
  /**
    * The path to copy from for the Move/Copy operation.
    */
  var from: String = js.native
  
  /**
    * The patch operation
    */
  var op: Operation = js.native
  
  /**
    * The path for the operation
    */
  var path: String = js.native
  
  /**
    * The value for the operation. This is either a primitive or a JToken.
    */
  var value: js.Any = js.native
}
object JsonPatchOperation {
  
  @scala.inline
  def apply(from: String, op: Operation, path: String, value: js.Any): JsonPatchOperation = {
    val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], op = op.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[JsonPatchOperation]
  }
  
  @scala.inline
  implicit class JsonPatchOperationMutableBuilder[Self <: JsonPatchOperation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFrom(value: String): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOp(value: Operation): Self = StObject.set(x, "op", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
