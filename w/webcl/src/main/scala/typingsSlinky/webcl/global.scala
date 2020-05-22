package typingsSlinky.webcl

import org.scalablytyped.runtime.Instantiable0
import typingsSlinky.webcl.WEBCL.CommandExecutionStatus
import typingsSlinky.webcl.WEBCL.EventInfo
import typingsSlinky.webcl.WEBCL.ProfilingInfo
import typingsSlinky.webcl.WEBCL.WebCLCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobalScope
@js.native
object global extends js.Object {
  @js.native
  class WebCLEvent ()
    extends typingsSlinky.webcl.WEBCL.WebCLEvent {
    /* CompleteClass */
    override def getInfo(name: EventInfo): js.Any = js.native
    /* CompleteClass */
    override def getProfilingInfo(name: ProfilingInfo): Double = js.native
    /* CompleteClass */
    override def release(): Unit = js.native
    /* CompleteClass */
    override def setCallback(commandExecCallbackType: CommandExecutionStatus, notify: WebCLCallback): Unit = js.native
  }
  
  @js.native
  object WebCLEvent
    extends Instantiable0[typingsSlinky.webcl.WEBCL.WebCLEvent]
  
}

