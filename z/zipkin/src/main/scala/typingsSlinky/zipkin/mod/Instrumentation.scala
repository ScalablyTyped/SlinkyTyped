package typingsSlinky.zipkin.mod

import typingsSlinky.zipkin.anon.RemoteServiceName
import typingsSlinky.zipkin.anon.ServerTags
import typingsSlinky.zipkin.mod.option.IOption
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("zipkin", "Instrumentation")
@js.native
object Instrumentation extends js.Object {
  
  @js.native
  class HttpClient protected () extends js.Object {
    def this(args: RemoteServiceName) = this()
    
    def recordError(traceId: TraceId, error: js.Error): Unit = js.native
    
    def recordRequest[T](request: T, url: String, method: String): T = js.native
    
    def recordResponse(traceId: TraceId, statusCode: String): Unit = js.native
  }
  
  @js.native
  class HttpServer protected () extends js.Object {
    def this(args: ServerTags) = this()
    
    def recordRequest(method: String, requestUrl: String, readHeader: js.Function1[/* header */ String, IOption[_]]): TraceId = js.native
    
    def recordResponse(traceId: TraceId, statusCode: String): Unit = js.native
    def recordResponse(traceId: TraceId, statusCode: String, error: js.Error): Unit = js.native
  }
}
