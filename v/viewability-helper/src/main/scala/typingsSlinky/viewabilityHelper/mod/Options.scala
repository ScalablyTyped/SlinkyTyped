package typingsSlinky.viewabilityHelper.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  var callbackParams: js.UndefOr[js.Array[_]] = js.native
  var intersectionPercentage: js.UndefOr[Double] = js.native
  var rootMargin: js.UndefOr[String] = js.native
  var scrollDimmer: js.UndefOr[Double] = js.native
  var threshold: js.UndefOr[js.Array[Double]] = js.native
  var unobserve: js.UndefOr[Boolean] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCallbackParams(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callbackParams")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCallbackParams: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callbackParams")(js.undefined)
        ret
    }
    @scala.inline
    def withIntersectionPercentage(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("intersectionPercentage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIntersectionPercentage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("intersectionPercentage")(js.undefined)
        ret
    }
    @scala.inline
    def withRootMargin(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rootMargin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRootMargin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rootMargin")(js.undefined)
        ret
    }
    @scala.inline
    def withScrollDimmer(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollDimmer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScrollDimmer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollDimmer")(js.undefined)
        ret
    }
    @scala.inline
    def withThreshold(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("threshold")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThreshold: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("threshold")(js.undefined)
        ret
    }
    @scala.inline
    def withUnobserve(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unobserve")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnobserve: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unobserve")(js.undefined)
        ret
    }
  }
  
}

