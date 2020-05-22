package typingsSlinky.urqlCore.anon

import org.scalajs.dom.experimental.RequestInit
import typingsSlinky.std.RequestInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FnCall extends js.Object {
  def apply(input: RequestInfo): js.Promise[org.scalajs.dom.experimental.Response] = js.native
  def apply(input: RequestInfo, init: RequestInit): js.Promise[org.scalajs.dom.experimental.Response] = js.native
}

