package typingsSlinky.webappsecCredentialManagement

import org.scalajs.dom.experimental.Request
import org.scalajs.dom.experimental.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GlobalFetch extends js.Object {
  def fetch(url: String): js.Promise[Response] = js.native
  def fetch(url: String, init: CMRequestInit): js.Promise[Response] = js.native
  // variant for navigator.credentials monkey patching
  def fetch(url: Request): js.Promise[Response] = js.native
  def fetch(url: Request, init: CMRequestInit): js.Promise[Response] = js.native
}

