package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FocusNavigationOrigin extends js.Object {
  var originHeight: js.UndefOr[Double] = js.native
  var originLeft: js.UndefOr[Double] = js.native
  var originTop: js.UndefOr[Double] = js.native
  var originWidth: js.UndefOr[Double] = js.native
}

object FocusNavigationOrigin {
  @scala.inline
  def apply(): FocusNavigationOrigin = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FocusNavigationOrigin]
  }
  @scala.inline
  implicit class FocusNavigationOriginOps[Self <: FocusNavigationOrigin] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOriginHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("originHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOriginHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("originHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withOriginLeft(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("originLeft")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOriginLeft: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("originLeft")(js.undefined)
        ret
    }
    @scala.inline
    def withOriginTop(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("originTop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOriginTop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("originTop")(js.undefined)
        ret
    }
    @scala.inline
    def withOriginWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("originWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOriginWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("originWidth")(js.undefined)
        ret
    }
  }
  
}

