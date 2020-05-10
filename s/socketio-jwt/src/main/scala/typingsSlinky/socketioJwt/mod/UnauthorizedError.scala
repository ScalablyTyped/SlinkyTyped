package typingsSlinky.socketioJwt.mod

import typingsSlinky.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("socketio-jwt", "UnauthorizedError")
@js.native
class UnauthorizedError protected () extends Error {
  def this(code: String, error: js.Error) = this()
  var data: JwtData = js.native
  var inner: js.Error = js.native
}

