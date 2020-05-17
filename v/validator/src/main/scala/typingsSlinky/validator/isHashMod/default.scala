package typingsSlinky.validator.isHashMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("validator/lib/isHash", JSImport.Default)
@js.native
object default extends js.Object {
  /**
    * Check if the string is a hash of type algorithm.
    *
    * @param algorithm - HashAlgorithm
    */
  def apply(str: String, algorithm: typingsSlinky.validator.mod.validator.HashAlgorithm): Boolean = js.native
}

