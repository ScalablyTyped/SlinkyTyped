package typingsSlinky.uinput.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateID extends js.Object {
  var absflat: js.UndefOr[js.Array[Double]] = js.native
  var absfuzz: js.UndefOr[js.Array[Double]] = js.native
  var absmax: js.UndefOr[js.Array[Double]] = js.native
  var absmin: js.UndefOr[js.Array[Double]] = js.native
  var bustype: Double = js.native
  var ff_effects_max: js.UndefOr[Double] = js.native
  var product: Double = js.native
  var vendor: Double = js.native
  var version: Double = js.native
}

object CreateID {
  @scala.inline
  def apply(bustype: Double, product: Double, vendor: Double, version: Double): CreateID = {
    val __obj = js.Dynamic.literal(bustype = bustype.asInstanceOf[js.Any], product = product.asInstanceOf[js.Any], vendor = vendor.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateID]
  }
  @scala.inline
  implicit class CreateIDOps[Self <: CreateID] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBustype(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bustype")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProduct(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("product")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVendor(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vendor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVersion(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAbsflat(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("absflat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAbsflat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("absflat")(js.undefined)
        ret
    }
    @scala.inline
    def withAbsfuzz(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("absfuzz")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAbsfuzz: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("absfuzz")(js.undefined)
        ret
    }
    @scala.inline
    def withAbsmax(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("absmax")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAbsmax: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("absmax")(js.undefined)
        ret
    }
    @scala.inline
    def withAbsmin(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("absmin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAbsmin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("absmin")(js.undefined)
        ret
    }
    @scala.inline
    def withFf_effects_max(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ff_effects_max")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFf_effects_max: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ff_effects_max")(js.undefined)
        ret
    }
  }
  
}

