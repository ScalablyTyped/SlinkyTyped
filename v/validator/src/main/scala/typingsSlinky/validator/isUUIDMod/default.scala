package typingsSlinky.validator.isUUIDMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("validator/lib/isUUID", JSImport.Default)
@js.native
object default extends js.Object {
  /**
    * Check if the string is a UUID (version 3, 4 or 5).
    *
    * @param [version="all"] - UUID version
    */
  def apply(str: String): Boolean = js.native
  def apply(str: String, version: typingsSlinky.validator.mod.validator.UUIDVersion): Boolean = js.native
}

