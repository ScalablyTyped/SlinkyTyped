package typingsSlinky.typescript.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TodoComment extends StObject {
  
  var descriptor: TodoCommentDescriptor = js.native
  
  var message: java.lang.String = js.native
  
  var position: Double = js.native
}
object TodoComment {
  
  @scala.inline
  def apply(descriptor: TodoCommentDescriptor, message: java.lang.String, position: Double): TodoComment = {
    val __obj = js.Dynamic.literal(descriptor = descriptor.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any])
    __obj.asInstanceOf[TodoComment]
  }
  
  @scala.inline
  implicit class TodoCommentMutableBuilder[Self <: TodoComment] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescriptor(value: TodoCommentDescriptor): Self = StObject.set(x, "descriptor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessage(value: java.lang.String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPosition(value: Double): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
  }
}
