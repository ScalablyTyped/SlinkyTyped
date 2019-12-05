package typingsSlinky.web3DashCoreDashHelpers.web3DashCoreDashHelpersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("web3-core-helpers", "errors")
@js.native
class errors () extends js.Object

/* static members */
@JSImport("web3-core-helpers", "errors")
@js.native
object errors extends js.Object {
  def ConnectionTimeout(ms: String): js.Error = js.native
  def ErrorResponse(result: js.Error): js.Error = js.native
  def InvalidConnection(host: String): js.Error = js.native
  def InvalidNumberOfParams(got: Double, expected: Double, method: String): js.Error = js.native
  def InvalidProvider(): js.Error = js.native
  def InvalidResponse(result: js.Error): js.Error = js.native
}

