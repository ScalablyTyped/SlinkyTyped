package typingsSlinky.validator.isIPMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("validator/lib/isIP", JSImport.Default)
@js.native
object default extends js.Object {
  /**
    * Check if the string is an IP (version 4 or 6).
    *
    * @param [version] - IP Version
    */
  def apply(str: String): Boolean = js.native
  def apply(str: String, version: typingsSlinky.validator.mod.validator.IPVersion): Boolean = js.native
}

