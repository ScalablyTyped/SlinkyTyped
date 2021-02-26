package typingsSlinky.slackMock.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Web[T] extends StObject {
  
  def addResponse(opts: WebOptions[T]): Unit = js.native
  
  var calls: js.Array[WebCall[T]] = js.native
  
  def reset(): Unit = js.native
}
object Web {
  
  @scala.inline
  def apply[T](addResponse: WebOptions[T] => Unit, calls: js.Array[WebCall[T]], reset: () => Unit): Web[T] = {
    val __obj = js.Dynamic.literal(addResponse = js.Any.fromFunction1(addResponse), calls = calls.asInstanceOf[js.Any], reset = js.Any.fromFunction0(reset))
    __obj.asInstanceOf[Web[T]]
  }
  
  @scala.inline
  implicit class WebMutableBuilder[Self <: Web[_], T] (val x: Self with Web[T]) extends AnyVal {
    
    @scala.inline
    def setAddResponse(value: WebOptions[T] => Unit): Self = StObject.set(x, "addResponse", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCalls(value: js.Array[WebCall[T]]): Self = StObject.set(x, "calls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCallsVarargs(value: WebCall[T]*): Self = StObject.set(x, "calls", js.Array(value :_*))
    
    @scala.inline
    def setReset(value: () => Unit): Self = StObject.set(x, "reset", js.Any.fromFunction0(value))
  }
}
