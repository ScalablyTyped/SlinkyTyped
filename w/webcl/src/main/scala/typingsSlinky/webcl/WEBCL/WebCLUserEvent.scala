package typingsSlinky.webcl.WEBCL

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// 3.10.1
@js.native
trait WebCLUserEvent extends WebCLEvent {
  
  def setStatus(executionStatus: CommandExecutionStatus): Unit = js.native
}
object WebCLUserEvent {
  
  @scala.inline
  def apply(
    getInfo: EventInfo => js.Any,
    getProfilingInfo: ProfilingInfo => Double,
    release: () => Unit,
    setCallback: (CommandExecutionStatus, WebCLCallback) => Unit,
    setStatus: CommandExecutionStatus => Unit
  ): WebCLUserEvent = {
    val __obj = js.Dynamic.literal(getInfo = js.Any.fromFunction1(getInfo), getProfilingInfo = js.Any.fromFunction1(getProfilingInfo), release = js.Any.fromFunction0(release), setCallback = js.Any.fromFunction2(setCallback), setStatus = js.Any.fromFunction1(setStatus))
    __obj.asInstanceOf[WebCLUserEvent]
  }
  
  @scala.inline
  implicit class WebCLUserEventMutableBuilder[Self <: WebCLUserEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSetStatus(value: CommandExecutionStatus => Unit): Self = StObject.set(x, "setStatus", js.Any.fromFunction1(value))
  }
}
