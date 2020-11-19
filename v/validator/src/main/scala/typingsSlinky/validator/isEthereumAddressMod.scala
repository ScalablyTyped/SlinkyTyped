package typingsSlinky.validator

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("validator/lib/isEthereumAddress", JSImport.Namespace)
@js.native
object isEthereumAddressMod extends js.Object {
  
  /**
    * Check if the string is an [Ethereum](https://ethereum.org/) address using basic regex. Does not validate address checksums.
    */
  def default(str: String): Boolean = js.native
}
