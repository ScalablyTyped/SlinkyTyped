package typingsSlinky.snykDepGraph

import typingsSlinky.snykDepGraph.customErrorMod.CustomError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@snyk/dep-graph/dist/core/errors/validation-error", JSImport.Namespace)
@js.native
object validationErrorMod extends js.Object {
  @js.native
  class ValidationError protected () extends CustomError {
    def this(message: String) = this()
  }
  
}

