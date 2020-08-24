package typingsSlinky.slonik.mod

import typingsSlinky.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("slonik", "QueryCancelledError")
@js.native
class QueryCancelledError protected () extends Error {
  def this(error: js.Error) = this()
  var originalError: js.Error = js.native
}

