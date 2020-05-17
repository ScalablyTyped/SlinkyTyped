package typingsSlinky.serverless.validateMod

import typingsSlinky.serverless.anon.MethodString
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("serverless/plugins/aws/package/compile/events/apiGateway/lib/validate", "getHttpMethod")
@js.native
object getHttpMethod extends js.Object {
  def apply(http: MethodString, functionName: String): HttpMethod = js.native
}

