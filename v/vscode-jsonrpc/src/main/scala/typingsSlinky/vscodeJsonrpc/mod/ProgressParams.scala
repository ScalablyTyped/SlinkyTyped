package typingsSlinky.vscodeJsonrpc.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProgressParams[T] extends StObject {
  
  /**
    * The progress token provided by the client or server.
    */
  var token: ProgressToken = js.native
  
  /**
    * The progress data.
    */
  var value: T = js.native
}
object ProgressParams {
  
  @scala.inline
  def apply[T](token: ProgressToken, value: T): ProgressParams[T] = {
    val __obj = js.Dynamic.literal(token = token.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProgressParams[T]]
  }
  
  @scala.inline
  implicit class ProgressParamsMutableBuilder[Self <: ProgressParams[_], T] (val x: Self with ProgressParams[T]) extends AnyVal {
    
    @scala.inline
    def setToken(value: ProgressToken): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: T): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
