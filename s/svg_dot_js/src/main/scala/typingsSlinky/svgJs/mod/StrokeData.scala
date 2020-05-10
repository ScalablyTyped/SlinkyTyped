package typingsSlinky.svgJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// sugar.js
@js.native
trait StrokeData extends js.Object {
  var color: js.UndefOr[String] = js.native
  var dasharray: js.UndefOr[String] = js.native
  var dashoffset: js.UndefOr[Double] = js.native
  var linecap: js.UndefOr[String] = js.native
  var linejoin: js.UndefOr[String] = js.native
  var miterlimit: js.UndefOr[Double] = js.native
  var opacity: js.UndefOr[Double] = js.native
  var width: js.UndefOr[Double] = js.native
}

object StrokeData {
  @scala.inline
  def apply(): StrokeData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StrokeData]
  }
  @scala.inline
  implicit class StrokeDataOps[Self <: StrokeData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(js.undefined)
        ret
    }
    @scala.inline
    def withDasharray(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dasharray")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDasharray: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dasharray")(js.undefined)
        ret
    }
    @scala.inline
    def withDashoffset(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dashoffset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDashoffset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dashoffset")(js.undefined)
        ret
    }
    @scala.inline
    def withLinecap(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linecap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLinecap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linecap")(js.undefined)
        ret
    }
    @scala.inline
    def withLinejoin(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linejoin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLinejoin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linejoin")(js.undefined)
        ret
    }
    @scala.inline
    def withMiterlimit(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("miterlimit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMiterlimit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("miterlimit")(js.undefined)
        ret
    }
    @scala.inline
    def withOpacity(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("opacity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOpacity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("opacity")(js.undefined)
        ret
    }
    @scala.inline
    def withWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(js.undefined)
        ret
    }
  }
  
}

