package typingsSlinky.zipkinInstrumentationExpress

import typingsSlinky.express.mod.Handler
import typingsSlinky.zipkinInstrumentationExpress.anon.Port
import typingsSlinky.zipkinInstrumentationExpress.anon.RemoteServiceName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("zipkin-instrumentation-express", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def expressMiddleware(options: Port): Handler = js.native
  
  def wrapExpressHttpProxy(
    proxy: js.Function2[/* host */ String, /* options */ js.UndefOr[js.Any], Handler],
    options: RemoteServiceName
  ): js.Function2[/* host */ String, /* options */ js.UndefOr[js.Any], Handler] = js.native
}
