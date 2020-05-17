package typingsSlinky.winrtUwp.Windows.Security.Cryptography.Core

import typingsSlinky.winrtUwp.Windows.Storage.Streams.IBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a key derivation algorithm provider. */
@js.native
trait KeyDerivationAlgorithmProvider extends js.Object {
  /** Gets the name of the open key derivation function (KDF) algorithm. */
  var algorithmName: String = js.native
  /**
    * Creates a KDF key.
    * @param keyMaterial Data used to create the key.
    * @return Represents the KDF key.
    */
  def createKey(keyMaterial: IBuffer): CryptographicKey = js.native
}

object KeyDerivationAlgorithmProvider {
  @scala.inline
  def apply(algorithmName: String, createKey: IBuffer => CryptographicKey): KeyDerivationAlgorithmProvider = {
    val __obj = js.Dynamic.literal(algorithmName = algorithmName.asInstanceOf[js.Any], createKey = js.Any.fromFunction1(createKey))
    __obj.asInstanceOf[KeyDerivationAlgorithmProvider]
  }
  @scala.inline
  implicit class KeyDerivationAlgorithmProviderOps[Self <: KeyDerivationAlgorithmProvider] (val x: Self) extends AnyVal {
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
    def withCreateKey(value: IBuffer => CryptographicKey): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createKey")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

