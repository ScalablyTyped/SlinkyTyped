package typingsSlinky.winrtUwp.Windows.Security.Cryptography.Core

import typingsSlinky.winrtUwp.Windows.Storage.Streams.IBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a message authentication code (MAC). A MAC uses symmetric key cryptography to prevent message tampering. For more information, see MACs, hashes, and signatures. */
@js.native
trait MacAlgorithmProvider extends js.Object {
  /** Gets the name of the open MAC algorithm. */
  var algorithmName: String = js.native
  /** Gets the length, in bytes, of the message authentication code. */
  var macLength: Double = js.native
  /**
    * Creates a CryptographicHash object that supports incremental hash operations.
    * @param keyMaterial Random data used to help generate the hash. You can call the GenerateRandom method to create the random data.
    * @return A CryptographicHash object that supports incremental hash operations.
    */
  def createHash(keyMaterial: IBuffer): CryptographicHash = js.native
  /**
    * Creates a symmetric key that can be used to create the MAC value.
    * @param keyMaterial Random data used to help generate the key. You can call the GenerateRandom method to create the random data.
    * @return Symmetric key.
    */
  def createKey(keyMaterial: IBuffer): CryptographicKey = js.native
}

object MacAlgorithmProvider {
  @scala.inline
  def apply(
    algorithmName: String,
    createHash: IBuffer => CryptographicHash,
    createKey: IBuffer => CryptographicKey,
    macLength: Double
  ): MacAlgorithmProvider = {
    val __obj = js.Dynamic.literal(algorithmName = algorithmName.asInstanceOf[js.Any], createHash = js.Any.fromFunction1(createHash), createKey = js.Any.fromFunction1(createKey), macLength = macLength.asInstanceOf[js.Any])
    __obj.asInstanceOf[MacAlgorithmProvider]
  }
  @scala.inline
  implicit class MacAlgorithmProviderOps[Self <: MacAlgorithmProvider] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlgorithmName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("algorithmName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreateHash(value: IBuffer => CryptographicHash): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createHash")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withCreateKey(value: IBuffer => CryptographicKey): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createKey")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withMacLength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("macLength")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

