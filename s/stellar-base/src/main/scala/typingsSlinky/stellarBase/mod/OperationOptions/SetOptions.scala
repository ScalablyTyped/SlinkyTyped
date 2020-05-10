package typingsSlinky.stellarBase.mod.OperationOptions

import typingsSlinky.stellarBase.mod.AuthFlag
import typingsSlinky.stellarBase.mod.SignerOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SetOptions[T /* <: SignerOptions */] extends BaseOptions {
  var clearFlags: js.UndefOr[AuthFlag] = js.native
  var highThreshold: js.UndefOr[Double | String] = js.native
  var homeDomain: js.UndefOr[String] = js.native
  var inflationDest: js.UndefOr[String] = js.native
  var lowThreshold: js.UndefOr[Double | String] = js.native
  var masterWeight: js.UndefOr[Double | String] = js.native
  var medThreshold: js.UndefOr[Double | String] = js.native
  var setFlags: js.UndefOr[AuthFlag] = js.native
  var signer: js.UndefOr[T] = js.native
}

object SetOptions {
  @scala.inline
  def apply[T](): SetOptions[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SetOptions[T]]
  }
  @scala.inline
  implicit class SetOptionsOps[Self[t] <: SetOptions[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
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
    def withHighThreshold(value: Double | String): Self[T] = {
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
    def withLowThreshold(value: Double | String): Self[T] = {
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
    def withMasterWeight(value: Double | String): Self[T] = {
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
    def withMedThreshold(value: Double | String): Self[T] = {
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
    @scala.inline
    def withSigner(value: T): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSigner: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signer")(js.undefined)
        ret
    }
  }
  
}

