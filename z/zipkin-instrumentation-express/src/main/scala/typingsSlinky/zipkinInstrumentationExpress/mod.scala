package typingsSlinky.zipkinInstrumentationExpress

import typingsSlinky.express.mod.Handler
import typingsSlinky.zipkinInstrumentationExpress.anon.Port
import typingsSlinky.zipkinInstrumentationExpress.anon.RemoteServiceName
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("zipkin-instrumentation-express", "expressMiddleware")
  @js.native
  def expressMiddleware(options: Port): Handler = js.native
  
  @JSImport("zipkin-instrumentation-express", "wrapExpressHttpProxy")
  @js.native
  def wrapExpressHttpProxy(
    proxy: js.Function2[/* host */ String, /* options */ js.UndefOr[js.Any], Handler],
    options: RemoteServiceName
  ): js.Function2[/* host */ String, /* options */ js.UndefOr[js.Any], Handler] = js.native
}
