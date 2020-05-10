package typingsSlinky.stellarBase.mod.Operation

import typingsSlinky.stellarBase.mod.AuthFlag
import typingsSlinky.stellarBase.mod.OperationType.SetOptions
import typingsSlinky.stellarBase.mod.Signer.Ed25519PublicKey
import typingsSlinky.stellarBase.mod.Signer.PreAuthTx
import typingsSlinky.stellarBase.mod.Signer.Sha256Hash
import typingsSlinky.stellarBase.mod.SignerOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SetOptions_[T /* <: SignerOptions */] extends BaseOperation[SetOptions] {
  var clearFlags: js.UndefOr[AuthFlag] = js.native
  var highThreshold: js.UndefOr[Double] = js.native
  var homeDomain: js.UndefOr[String] = js.native
  var inflationDest: js.UndefOr[String] = js.native
  var lowThreshold: js.UndefOr[Double] = js.native
  var masterWeight: js.UndefOr[Double] = js.native
  var medThreshold: js.UndefOr[Double] = js.native
  var setFlags: js.UndefOr[AuthFlag] = js.native
  var signer: PreAuthTx | Sha256Hash | Ed25519PublicKey = js.native
}

object SetOptions_ {
  @scala.inline
  def apply[T](signer: PreAuthTx | Sha256Hash | Ed25519PublicKey, `type`: SetOptions): SetOptions_[T] = {
    val __obj = js.Dynamic.literal(signer = signer.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetOptions_[T]]
  }
  @scala.inline
  implicit class SetOptions_Ops[Self[t] <: SetOptions_[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withSigner(value: PreAuthTx | Sha256Hash | Ed25519PublicKey): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClearFlags(value: AuthFlag): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clearFlags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClearFlags: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clearFlags")(js.undefined)
        ret
    }
    @scala.inline
    def withHighThreshold(value: Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highThreshold")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHighThreshold: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highThreshold")(js.undefined)
        ret
    }
    @scala.inline
    def withHomeDomain(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("homeDomain")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHomeDomain: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("homeDomain")(js.undefined)
        ret
    }
    @scala.inline
    def withInflationDest(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inflationDest")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInflationDest: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inflationDest")(js.undefined)
        ret
    }
    @scala.inline
    def withLowThreshold(value: Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lowThreshold")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLowThreshold: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lowThreshold")(js.undefined)
        ret
    }
    @scala.inline
    def withMasterWeight(value: Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("masterWeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMasterWeight: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("masterWeight")(js.undefined)
        ret
    }
    @scala.inline
    def withMedThreshold(value: Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("medThreshold")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMedThreshold: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("medThreshold")(js.undefined)
        ret
    }
    @scala.inline
    def withSetFlags(value: AuthFlag): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setFlags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSetFlags: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setFlags")(js.undefined)
        ret
    }
  }
  
}

