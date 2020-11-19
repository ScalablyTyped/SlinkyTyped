package typingsSlinky.validator

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("validator/lib/isHash", JSImport.Namespace)
@js.native
object isHashMod extends js.Object {
  
  /**
    * Check if the string is a hash of type algorithm.
    *
    * @param algorithm - HashAlgorithm
    */
  def default(str: String, algorithm: typingsSlinky.validator.mod.validator.HashAlgorithm): Boolean = js.native
  
  type HashAlgorithm = typingsSlinky.validator.mod.validator.HashAlgorithm
}
