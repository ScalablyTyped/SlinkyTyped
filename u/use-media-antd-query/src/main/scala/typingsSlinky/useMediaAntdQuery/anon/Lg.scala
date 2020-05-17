package typingsSlinky.useMediaAntdQuery.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Lg extends js.Object {
  var lg: MaxWidth = js.native
  var md: MaxWidth = js.native
  var sm: MaxWidth = js.native
  var xl: MaxWidth = js.native
  var xs: MatchMedia = js.native
  var xxl: MinWidth = js.native
}

object Lg {
  @scala.inline
  def apply(lg: MaxWidth, md: MaxWidth, sm: MaxWidth, xl: MaxWidth, xs: MatchMedia, xxl: MinWidth): Lg = {
    val __obj = js.Dynamic.literal(lg = lg.asInstanceOf[js.Any], md = md.asInstanceOf[js.Any], sm = sm.asInstanceOf[js.Any], xl = xl.asInstanceOf[js.Any], xs = xs.asInstanceOf[js.Any], xxl = xxl.asInstanceOf[js.Any])
    __obj.asInstanceOf[Lg]
  }
  @scala.inline
  implicit class LgOps[Self <: Lg] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLg(value: MaxWidth): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lg")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMd(value: MaxWidth): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("md")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSm(value: MaxWidth): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sm")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withXl(value: MaxWidth): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withXs(value: MatchMedia): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withXxl(value: MinWidth): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xxl")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

