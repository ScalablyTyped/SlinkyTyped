package typingsSlinky.winrtUwp.global.Windows.Security.Cryptography.Core

import typingsSlinky.winrtUwp.Windows.Storage.Streams.IBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a message authentication code (MAC). A MAC uses symmetric key cryptography to prevent message tampering. For more information, see MACs, hashes, and signatures. */
@JSGlobal("Windows.Security.Cryptography.Core.MacAlgorithmProvider")
@js.native
abstract class MacAlgorithmProvider ()
  extends typingsSlinky.winrtUwp.Windows.Security.Cryptography.Core.MacAlgorithmProvider {
  /** Gets the name of the open MAC algorithm. */
  /* CompleteClass */
  override var algorithmName: String = js.native
  /** Gets the length, in bytes, of the message authentication code. */
  /* CompleteClass */
  override var macLength: Double = js.native
  /**
    * Creates a CryptographicHash object that supports incremental hash operations.
    * @param keyMaterial Random data used to help generate the hash. You can call the GenerateRandom method to create the random data.
    * @return A CryptographicHash object that supports incremental hash operations.
    */
  /* CompleteClass */
  override def createHash(keyMaterial: IBuffer): typingsSlinky.winrtUwp.Windows.Security.Cryptography.Core.CryptographicHash = js.native
  /**
    * Creates a symmetric key that can be used to create the MAC value.
    * @param keyMaterial Random data used to help generate the key. You can call the GenerateRandom method to create the random data.
    * @return Symmetric key.
    */
  /* CompleteClass */
  override def createKey(keyMaterial: IBuffer): typingsSlinky.winrtUwp.Windows.Security.Cryptography.Core.CryptographicKey = js.native
}

/* static members */
@JSGlobal("Windows.Security.Cryptography.Core.MacAlgorithmProvider")
@js.native
object MacAlgorithmProvider extends js.Object {
  /**
    * Creates a MacAlgorithmProvider object and opens the specified algorithm for use.
    * @param algorithm Algorithm name.
    * @return Represents a provider that implements MAC algorithms.
    */
  def openAlgorithm(algorithm: String): typingsSlinky.winrtUwp.Windows.Security.Cryptography.Core.MacAlgorithmProvider = js.native
}

