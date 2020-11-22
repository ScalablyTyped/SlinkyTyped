package typingsSlinky.slonik.mod

import typingsSlinky.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("slonik", "StatementCancelledError")
@js.native
class StatementCancelledError protected () extends Error {
  def this(error: js.Error) = this()
  
  var originalError: js.Error = js.native
}
