package typingsSlinky.splunkBunyanLogger

import typingsSlinky.bunyan.mod.Stream
import typingsSlinky.node.NodeJS.WritableStream
import typingsSlinky.splunkLogging.mod.Config
import typingsSlinky.splunkLogging.mod.EventFormatter
import typingsSlinky.splunkLogging.mod.Logger
import typingsSlinky.splunkLogging.mod.SendContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("splunk-bunyan-logger", "createStream")
  @js.native
  def createStream(config: Config): SplunkBunyanStream = js.native
  
  @js.native
  trait SplunkBunyanStream extends Stream {
    
    def flush(): Unit = js.native
    def flush(callback: js.Function3[/* error */ js.Error, /* req */ js.Any, /* res */ js.Any, Unit]): Unit = js.native
    
    def on(event: String, callback: js.Function2[/* err */ js.Error, /* context */ SendContext, Unit]): Unit = js.native
    
    def setEventFormatter(eventFormatter: EventFormatter): Unit = js.native
    
    @JSName("stream")
    var stream_SplunkBunyanStream: SplunkStream = js.native
  }
  
  @js.native
  trait SplunkStream extends WritableStream {
    
    var logger: Logger = js.native
  }
}
