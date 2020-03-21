package typingsSlinky.typescript

import typingsSlinky.typescript.mod.CompilerOptions
import typingsSlinky.typescript.mod.Diagnostic
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonErrors extends js.Object {
  var errors: js.Array[Diagnostic]
  var options: CompilerOptions
}

object AnonErrors {
  @scala.inline
  def apply(errors: js.Array[Diagnostic], options: CompilerOptions): AnonErrors = {
    val __obj = js.Dynamic.literal(errors = errors.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonErrors]
  }
}

