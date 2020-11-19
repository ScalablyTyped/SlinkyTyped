package typingsSlinky.swaggerizeExpress.mod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.express.mod.RequestHandler
import typingsSlinky.expressServeStaticCore.mod.ParamsDictionary
import typingsSlinky.expressServeStaticCore.mod.Query
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RouteSegment
  extends /* urlSegment */ StringDictionary[
      RouteSegment | (RequestHandler[ParamsDictionary, _, _, Query]) | (js.Array[RequestHandler[ParamsDictionary, _, _, Query]])
    ]
object RouteSegment {
  
  @scala.inline
  def apply(): RouteSegment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RouteSegment]
  }
}
