package typingsSlinky.winrtUwp.Windows.Security.Cryptography.Core

import typingsSlinky.winrtUwp.Windows.Storage.Streams.IBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a cryptographic hash provider. For more information about hashes, see MACs, hashes, and signatures. */
@js.native
trait HashAlgorithmProvider extends js.Object {
  /** Gets the name of the open hash algorithm. */
  var algorithmName: String = js.native
  /** Gets the length, in bytes, of the hash. */
  var hashLength: Double = js.native
  /**
    * Creates a reusable CryptographicHash object.
    * @return Reusable hash object.
    */
  def createHash(): CryptographicHash = js.native
  /**
    * Hashes binary data.
    * @param data Data to be hashed.
    * @return Hashed data.
    */
  def hashData(data: IBuffer): IBuffer = js.native
}

object HashAlgorithmProvider {
  @scala.inline
  def apply(
    algorithmName: String,
    createHash: () => CryptographicHash,
    hashData: IBuffer => IBuffer,
    hashLength: Double
  ): HashAlgorithmProvider = {
    val __obj = js.Dynamic.literal(algorithmName = algorithmName.asInstanceOf[js.Any], createHash = js.Any.fromFunction0(createHash), hashData = js.Any.fromFunction1(hashData), hashLength = hashLength.asInstanceOf[js.Any])
    __obj.asInstanceOf[HashAlgorithmProvider]
  }
  @scala.inline
  implicit class HashAlgorithmProviderOps[Self <: HashAlgorithmProvider] (val x: Self) extends AnyVal {
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
    def withCreateHash(value: () => CryptographicHash): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createHash")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withHashData(value: IBuffer => IBuffer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hashData")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withHashLength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hashLength")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

