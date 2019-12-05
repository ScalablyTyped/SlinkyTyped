package typingsSlinky.validator

import typingsSlinky.validator.validatorNumbers.`3`
import typingsSlinky.validator.validatorNumbers.`4`
import typingsSlinky.validator.validatorNumbers.`5`
import typingsSlinky.validator.validatorStrings.all
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("validator/lib/isUUID", JSImport.Namespace)
@js.native
object libIsUUIDMod extends js.Object {
  /**
    * Check if the string is a UUID (version 3, 4 or 5).
    *
    * @param [version="all"] - UUID version
    */
  def default(str: String): Boolean = js.native
  @JSName("default")
  def default_3(str: String, version: `3`): Boolean = js.native
  @JSName("default")
  def default_3(str: String, version: typingsSlinky.validator.validatorStrings.`3`): Boolean = js.native
  @JSName("default")
  def default_4(str: String, version: `4`): Boolean = js.native
  @JSName("default")
  def default_4(str: String, version: typingsSlinky.validator.validatorStrings.`4`): Boolean = js.native
  @JSName("default")
  def default_5(str: String, version: `5`): Boolean = js.native
  @JSName("default")
  def default_5(str: String, version: typingsSlinky.validator.validatorStrings.`5`): Boolean = js.native
  @JSName("default")
  def default_all(str: String, version: all): Boolean = js.native
}

