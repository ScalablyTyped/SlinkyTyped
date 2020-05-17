package typingsSlinky.winrtUwp.Windows.Security.Cryptography.Core

import typingsSlinky.winrtUwp.Windows.Storage.Streams.IBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents parameters used when deriving a key. */
@js.native
trait KeyDerivationParameters extends js.Object {
  /** Gets or sets the Capi1KdfTargetAlgorithm . */
  var capi1KdfTargetAlgorithm: Capi1KdfTargetAlgorithm = js.native
  /** Retrieves the number of iterations used to derive the key. For more information, see BuildForPbkdf2 . */
  var iterationCount: Double = js.native
  /** Gets or sets the parameters used by the key derivation algorithm. */
  var kdfGenericBinary: IBuffer = js.native
}

object KeyDerivationParameters {
  @scala.inline
  def apply(
    capi1KdfTargetAlgorithm: Capi1KdfTargetAlgorithm,
    iterationCount: Double,
    kdfGenericBinary: IBuffer
  ): KeyDerivationParameters = {
    val __obj = js.Dynamic.literal(capi1KdfTargetAlgorithm = capi1KdfTargetAlgorithm.asInstanceOf[js.Any], iterationCount = iterationCount.asInstanceOf[js.Any], kdfGenericBinary = kdfGenericBinary.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeyDerivationParameters]
  }
  @scala.inline
  implicit class KeyDerivationParametersOps[Self <: KeyDerivationParameters] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCapi1KdfTargetAlgorithm(value: Capi1KdfTargetAlgorithm): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("capi1KdfTargetAlgorithm")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIterationCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iterationCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKdfGenericBinary(value: IBuffer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kdfGenericBinary")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

