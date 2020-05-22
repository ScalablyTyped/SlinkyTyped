package typingsSlinky.winrtUwp.global.Windows.Security.Cryptography.Core

import typingsSlinky.winrtUwp.Windows.Storage.Streams.IBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a key derivation algorithm provider. */
@JSGlobal("Windows.Security.Cryptography.Core.KeyDerivationAlgorithmProvider")
@js.native
abstract class KeyDerivationAlgorithmProvider ()
  extends typingsSlinky.winrtUwp.Windows.Security.Cryptography.Core.KeyDerivationAlgorithmProvider {
  /** Gets the name of the open key derivation function (KDF) algorithm. */
  /* CompleteClass */
  override var algorithmName: String = js.native
  /**
    * Creates a KDF key.
    * @param keyMaterial Data used to create the key.
    * @return Represents the KDF key.
    */
  /* CompleteClass */
  override def createKey(keyMaterial: IBuffer): typingsSlinky.winrtUwp.Windows.Security.Cryptography.Core.CryptographicKey = js.native
}

/* static members */
@JSGlobal("Windows.Security.Cryptography.Core.KeyDerivationAlgorithmProvider")
@js.native
object KeyDerivationAlgorithmProvider extends js.Object {
  /**
    * Creates an instance of the KeyDerivationAlgorithmProvider class and opens the specified algorithm for use.
    * @param algorithm Represents a KDF algorithm provider.
    * @return The algorithm provider.
    */
  def openAlgorithm(algorithm: String): typingsSlinky.winrtUwp.Windows.Security.Cryptography.Core.KeyDerivationAlgorithmProvider = js.native
}

