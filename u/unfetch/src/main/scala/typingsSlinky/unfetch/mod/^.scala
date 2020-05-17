package typingsSlinky.unfetch.mod

import org.scalajs.dom.experimental.RequestInit
import org.scalajs.dom.experimental.Response
import typingsSlinky.std.RequestInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("unfetch", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(input: RequestInfo): js.Promise[Response] = js.native
  def apply(input: RequestInfo, init: RequestInit): js.Promise[Response] = js.native
}

