package typingsSlinky.slonik.mod

import typingsSlinky.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("slonik", "BackendTerminatedError")
@js.native
class BackendTerminatedError protected () extends Error {
  def this(error: js.Error) = this()
  
  var originalError: js.Error = js.native
}
