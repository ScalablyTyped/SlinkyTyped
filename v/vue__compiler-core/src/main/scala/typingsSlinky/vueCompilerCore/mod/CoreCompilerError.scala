package typingsSlinky.vueCompilerCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CoreCompilerError extends CompilerError {
  
  @JSName("code")
  var code_CoreCompilerError: ErrorCodes = js.native
}
object CoreCompilerError {
  
  @scala.inline
  def apply(code: ErrorCodes, message: String, name: String): CoreCompilerError = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CoreCompilerError]
  }
  
  @scala.inline
  implicit class CoreCompilerErrorMutableBuilder[Self <: CoreCompilerError] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCode(value: ErrorCodes): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
  }
}
