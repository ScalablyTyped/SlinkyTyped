package typingsSlinky.slonik.mod

import typingsSlinky.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("slonik", "IntegrityConstraintViolationError")
@js.native
class IntegrityConstraintViolationError protected () extends Error {
  def this(error: js.Error, constraint: String) = this()
  
  var constraint: String = js.native
  
  var originalError: js.Error = js.native
}
