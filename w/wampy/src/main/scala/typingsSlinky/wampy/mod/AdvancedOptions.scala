package typingsSlinky.wampy.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AdvancedOptions extends js.Object {
  var disclose_me: js.UndefOr[Boolean] = js.native
  var eligible: js.UndefOr[Double | js.Array[Double]] = js.native
  var exclude: js.UndefOr[Double | js.Array[Double]] = js.native
  var exclude_me: js.UndefOr[Boolean] = js.native
}

object AdvancedOptions {
  @scala.inline
  def apply(): AdvancedOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AdvancedOptions]
  }
  @scala.inline
  implicit class AdvancedOptionsOps[Self <: AdvancedOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDisclose_me(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disclose_me")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisclose_me: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disclose_me")(js.undefined)
        ret
    }
    @scala.inline
    def withEligible(value: Double | js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eligible")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEligible: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eligible")(js.undefined)
        ret
    }
    @scala.inline
    def withExclude(value: Double | js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exclude")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExclude: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exclude")(js.undefined)
        ret
    }
    @scala.inline
    def withExclude_me(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exclude_me")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExclude_me: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exclude_me")(js.undefined)
        ret
    }
  }
  
}

