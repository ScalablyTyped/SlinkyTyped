package typingsSlinky.shelljs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExecOutputReturnValue extends StObject {
  
  /** The process exit code. */
  var code: Double = js.native
  
  /** The process standard error output. */
  var stderr: String = js.native
  
  /** The process standard output. */
  var stdout: String = js.native
}
object ExecOutputReturnValue {
  
  @scala.inline
  def apply(code: Double, stderr: String, stdout: String): ExecOutputReturnValue = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], stderr = stderr.asInstanceOf[js.Any], stdout = stdout.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExecOutputReturnValue]
  }
  
  @scala.inline
  implicit class ExecOutputReturnValueMutableBuilder[Self <: ExecOutputReturnValue] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCode(value: Double): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStderr(value: String): Self = StObject.set(x, "stderr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStdout(value: String): Self = StObject.set(x, "stdout", value.asInstanceOf[js.Any])
  }
}
