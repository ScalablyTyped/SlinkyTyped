package typingsSlinky.tsCustomError.mod

import typingsSlinky.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ts-custom-error", "CustomError")
@js.native
class CustomError () extends Error {
  def this(message: String) = this()
}

