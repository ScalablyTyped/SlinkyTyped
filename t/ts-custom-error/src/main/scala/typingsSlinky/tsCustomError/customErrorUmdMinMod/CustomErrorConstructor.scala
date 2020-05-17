package typingsSlinky.tsCustomError.customErrorUmdMinMod

import typingsSlinky.std.ErrorConstructor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CustomErrorConstructor[Properties /* <: CustomErrorProperties */]
  extends ErrorConstructor
     with GenericErrorConstructor {
  def apply(args: js.Any*): js.Error with Properties = js.native
}

