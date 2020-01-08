package typingsSlinky.splunkDashBunyanDashLogger

import typingsSlinky.bunyan.bunyanMod.Stream
import typingsSlinky.node.NodeJS.WritableStream
import typingsSlinky.splunkDashLogging.splunkDashLoggingMod.Config
import typingsSlinky.splunkDashLogging.splunkDashLoggingMod.EventFormatter
import typingsSlinky.splunkDashLogging.splunkDashLoggingMod.Logger
import typingsSlinky.splunkDashLogging.splunkDashLoggingMod.SendContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("splunk-bunyan-logger", JSImport.Namespace)
@js.native
object splunkDashBunyanDashLoggerMod extends js.Object {
  @js.native
  trait SplunkBunyanStream extends Stream {
    @JSName("stream")
    var stream_SplunkBunyanStream: SplunkStream = js.native
    def flush(): Unit = js.native
    def flush(callback: js.Function3[/* error */ js.Error, /* req */ js.Any, /* res */ js.Any, Unit]): Unit = js.native
    def on(event: String, callback: js.Function2[/* err */ js.Error, /* context */ SendContext, Unit]): Unit = js.native
    def setEventFormatter(eventFormatter: EventFormatter): Unit = js.native
  }
  
  @js.native
  trait SplunkStream extends WritableStream {
    var logger: Logger = js.native
  }
  
  def createStream(config: Config): SplunkBunyanStream = js.native
}

