package typingsSlinky.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Acquisition extends js.Object {
  var acquisition: scala.Double = js.native
  var install: scala.Double = js.native
  var other: scala.Double = js.native
  var review: scala.Double = js.native
  var sales: scala.Double = js.native
  var uninstall: scala.Double = js.native
}

object Acquisition {
  @scala.inline
  def apply(
    acquisition: scala.Double,
    install: scala.Double,
    other: scala.Double,
    review: scala.Double,
    sales: scala.Double,
    uninstall: scala.Double
  ): Acquisition = {
    val __obj = js.Dynamic.literal(acquisition = acquisition.asInstanceOf[js.Any], install = install.asInstanceOf[js.Any], other = other.asInstanceOf[js.Any], review = review.asInstanceOf[js.Any], sales = sales.asInstanceOf[js.Any], uninstall = uninstall.asInstanceOf[js.Any])
    __obj.asInstanceOf[Acquisition]
  }
  @scala.inline
  implicit class AcquisitionOps[Self <: Acquisition] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAcquisition(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("acquisition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInstall(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("install")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOther(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("other")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReview(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("review")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSales(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sales")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUninstall(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uninstall")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

