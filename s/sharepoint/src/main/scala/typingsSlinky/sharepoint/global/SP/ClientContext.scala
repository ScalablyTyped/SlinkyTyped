package typingsSlinky.sharepoint.global.SP

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.ClientContext")
@js.native
class ClientContext ()
  extends typingsSlinky.sharepoint.SP.ClientContext {
  def this(serverRelativeUrlOrFullUrl: String) = this()
}

/* static members */
@JSGlobal("SP.ClientContext")
@js.native
object ClientContext extends js.Object {
  def get_current(): typingsSlinky.sharepoint.SP.ClientContext = js.native
}

