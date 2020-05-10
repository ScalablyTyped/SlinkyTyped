package typingsSlinky.stellarBase.mod.Operation

import typingsSlinky.stellarBase.mod.OperationType.AllowTrust
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AllowTrust_ extends BaseOperation[AllowTrust] {
  var assetCode: String = js.native
  var authorize: js.UndefOr[Boolean] = js.native
  var trustor: String = js.native
}

object AllowTrust_ {
  @scala.inline
  def apply(assetCode: String, trustor: String, `type`: AllowTrust): AllowTrust_ = {
    val __obj = js.Dynamic.literal(assetCode = assetCode.asInstanceOf[js.Any], trustor = trustor.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AllowTrust_]
  }
  @scala.inline
  implicit class AllowTrust_Ops[Self <: AllowTrust_] (val x: Self) extends AnyVal {
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

