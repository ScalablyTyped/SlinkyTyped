package typingsSlinky.vsoNodeApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAcquisition extends js.Object {
  var acquisition: Double = js.native
  var install: Double = js.native
  var other: Double = js.native
  var review: Double = js.native
  var sales: Double = js.native
  var uninstall: Double = js.native
}

object AnonAcquisition {
  @scala.inline
  def apply(
    acquisition: Double,
    install: Double,
    other: Double,
    review: Double,
    sales: Double,
    uninstall: Double
  ): AnonAcquisition = {
    val __obj = js.Dynamic.literal(acquisition = acquisition.asInstanceOf[js.Any], install = install.asInstanceOf[js.Any], other = other.asInstanceOf[js.Any], review = review.asInstanceOf[js.Any], sales = sales.asInstanceOf[js.Any], uninstall = uninstall.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAcquisition]
  }
  @scala.inline
  implicit class AnonAcquisitionOps[Self <: AnonAcquisition] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAcquisition(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("acquisition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInstall(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("install")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOther(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("other")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReview(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("review")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSales(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sales")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUninstall(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uninstall")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

