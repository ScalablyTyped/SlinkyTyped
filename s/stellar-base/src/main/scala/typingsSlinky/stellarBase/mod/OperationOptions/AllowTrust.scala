package typingsSlinky.stellarBase.mod.OperationOptions

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AllowTrust extends BaseOptions {
  var assetCode: String = js.native
  var authorize: js.UndefOr[Boolean] = js.native
  var trustor: String = js.native
}

object AllowTrust {
  @scala.inline
  def apply(assetCode: String, trustor: String): AllowTrust = {
    val __obj = js.Dynamic.literal(assetCode = assetCode.asInstanceOf[js.Any], trustor = trustor.asInstanceOf[js.Any])
    __obj.asInstanceOf[AllowTrust]
  }
  @scala.inline
  implicit class AllowTrustOps[Self <: AllowTrust] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAssetCode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("assetCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTrustor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trustor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAuthorize(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authorize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAuthorize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authorize")(js.undefined)
        ret
    }
  }
  
}

