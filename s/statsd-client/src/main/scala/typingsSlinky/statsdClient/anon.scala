package typingsSlinky.statsdClient

import typingsSlinky.express.mod.RequestHandler
import typingsSlinky.expressServeStaticCore.mod.ParamsDictionary
import typingsSlinky.expressServeStaticCore.mod.Query
import typingsSlinky.statsdClient.mod.ExpressMiddlewareOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait GetExpressMiddleware extends StObject {
    
    def getExpressMiddleware(): RequestHandler[ParamsDictionary, _, _, Query] = js.native
    def getExpressMiddleware(prefix: js.UndefOr[scala.Nothing], options: ExpressMiddlewareOptions): RequestHandler[ParamsDictionary, _, _, Query] = js.native
    def getExpressMiddleware(prefix: String): RequestHandler[ParamsDictionary, _, _, Query] = js.native
    def getExpressMiddleware(prefix: String, options: ExpressMiddlewareOptions): RequestHandler[ParamsDictionary, _, _, Query] = js.native
  }
}
