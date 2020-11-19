package typingsSlinky.validator

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("validator/lib/isIP", JSImport.Namespace)
@js.native
object isIPMod extends js.Object {
  
  /**
    * Check if the string is an IP (version 4 or 6).
    *
    * @param [version] - IP Version
    */
  def default(str: String): Boolean = js.native
  def default(str: String, version: typingsSlinky.validator.mod.validator.IPVersion): Boolean = js.native
  
  type IPVersion = typingsSlinky.validator.mod.validator.IPVersion
}
