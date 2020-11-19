package typingsSlinky.swaggerTools.mod

import typingsSlinky.node.httpMod.IncomingMessage
import typingsSlinky.swaggerTools.anon.ApiPath
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Swagger20Request[P /* <: SwaggerRequestParameters */] extends IncomingMessage {
  
  var swagger: ApiPath[P] = js.native
}
