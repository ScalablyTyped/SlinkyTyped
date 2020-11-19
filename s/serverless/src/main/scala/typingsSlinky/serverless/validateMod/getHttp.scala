package typingsSlinky.serverless.validateMod

import typingsSlinky.serverless.anon.Http
import typingsSlinky.serverless.anon.Method
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("serverless/plugins/aws/package/compile/events/apiGateway/lib/validate", "getHttp")
@js.native
object getHttp extends js.Object {
  
  def apply[T /* <: js.Object */](event: Http[T], functionName: String): Method | T = js.native
}
