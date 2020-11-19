package typingsSlinky.validator

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("validator/lib/isUUID", JSImport.Namespace)
@js.native
object isUUIDMod extends js.Object {
  
  /**
    * Check if the string is a UUID (version 3, 4 or 5).
    *
    * @param [version="all"] - UUID version
    */
  def default(str: String): Boolean = js.native
  def default(str: String, version: typingsSlinky.validator.mod.validator.UUIDVersion): Boolean = js.native
  
  type UUIDVersion = typingsSlinky.validator.mod.validator.UUIDVersion
}
