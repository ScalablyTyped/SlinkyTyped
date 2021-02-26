package typingsSlinky.zipkinTransportHttp

import typingsSlinky.zipkin.mod.Logger
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("zipkin-transport-http", "HttpLogger")
  @js.native
  class HttpLogger protected () extends Logger {
    /**
      * @constructor
      * @param {Object} options
      * @param {string} options.endpoint HTTP endpoint which spans will be sent
      * @param {number} options.httpInterval How often to sync spans.
      * @param {JsonEncoder} options.jsonEncoder JSON encoder to use when sending spans.
      * @param {number} options.timeout Timeout for HTTP Post when sending spans.
      * @param {number} options.maxPayloadSize Max payload size for zipkin span.
      * @param {Object<string, string>} options.headers Any additional HTTP headers to be sent with span.
      * @param {Agent|Function} options.agent HTTP(S) agent to use for any networking related options.
      * @param {ErrorLogger} options.log Internal error logger used within the transport.
      */
    def this(options: typingsSlinky.zipkinTransportHttp.anon.Agent) = this()
  }
  
  type Agent = typingsSlinky.node.httpMod.Agent | typingsSlinky.node.httpsMod.Agent
  
  @js.native
  trait ErrorLogger extends StObject {
    
    def error(args: js.Any*): Unit = js.native
  }
  object ErrorLogger {
    
    @scala.inline
    def apply(error: /* repeated */ js.Any => Unit): ErrorLogger = {
      val __obj = js.Dynamic.literal(error = js.Any.fromFunction1(error))
      __obj.asInstanceOf[ErrorLogger]
    }
    
    @scala.inline
    implicit class ErrorLoggerMutableBuilder[Self <: ErrorLogger] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setError(value: /* repeated */ js.Any => Unit): Self = StObject.set(x, "error", js.Any.fromFunction1(value))
    }
  }
}
