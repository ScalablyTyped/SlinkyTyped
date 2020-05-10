package typingsSlinky.useMediaAntdQuery

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonLg extends js.Object {
  var lg: AnonMaxWidth = js.native
  var md: AnonMaxWidth = js.native
  var sm: AnonMaxWidth = js.native
  var xl: AnonMaxWidth = js.native
  var xs: AnonMatchMedia = js.native
  var xxl: AnonMinWidth = js.native
}

object AnonLg {
  @scala.inline
  def apply(
    lg: AnonMaxWidth,
    md: AnonMaxWidth,
    sm: AnonMaxWidth,
    xl: AnonMaxWidth,
    xs: AnonMatchMedia,
    xxl: AnonMinWidth
  ): AnonLg = {
    val __obj = js.Dynamic.literal(lg = lg.asInstanceOf[js.Any], md = md.asInstanceOf[js.Any], sm = sm.asInstanceOf[js.Any], xl = xl.asInstanceOf[js.Any], xs = xs.asInstanceOf[js.Any], xxl = xxl.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonLg]
  }
  @scala.inline
  implicit class AnonLgOps[Self <: AnonLg] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLg(value: AnonMaxWidth): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lg")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMd(value: AnonMaxWidth): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("md")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSm(value: AnonMaxWidth): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sm")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withXl(value: AnonMaxWidth): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withXs(value: AnonMatchMedia): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withXxl(value: AnonMinWidth): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xxl")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

