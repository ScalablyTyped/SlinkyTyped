package typingsSlinky.winrtUwp.global.Windows.Security.Cryptography.Core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a provider of asymmetric (public) key algorithms. For more information, see Cryptographic keys. */
@JSGlobal("Windows.Security.Cryptography.Core.AsymmetricKeyAlgorithmProvider")
@js.native
abstract class AsymmetricKeyAlgorithmProvider ()
  extends typingsSlinky.winrtUwp.Windows.Security.Cryptography.Core.AsymmetricKeyAlgorithmProvider
/* static members */
@JSGlobal("Windows.Security.Cryptography.Core.AsymmetricKeyAlgorithmProvider")
@js.native
object AsymmetricKeyAlgorithmProvider extends js.Object {
  
  /**
    * Creates an instance of the AsymmetricKeyAlgorithmProvider class and opens the specified algorithm for use.
    * @param algorithm Algorithm name.
    * @return Represents a public key algorithm provider.
    */
  def openAlgorithm(algorithm: String): typingsSlinky.winrtUwp.Windows.Security.Cryptography.Core.AsymmetricKeyAlgorithmProvider = js.native
}
