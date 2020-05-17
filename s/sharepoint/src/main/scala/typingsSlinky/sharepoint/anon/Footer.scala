package typingsSlinky.sharepoint.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Footer extends js.Object {
  var Footer: Double = js.native
  var Loading: Double = js.native
  var Option: Double = js.native
  var Separator: Double = js.native
}

object Footer {
  @scala.inline
  def apply(Footer: Double, Loading: Double, Option: Double, Separator: Double): Footer = {
    val __obj = js.Dynamic.literal(Footer = Footer.asInstanceOf[js.Any], Loading = Loading.asInstanceOf[js.Any], Option = Option.asInstanceOf[js.Any], Separator = Separator.asInstanceOf[js.Any])
    __obj.asInstanceOf[Footer]
  }
  @scala.inline
  implicit class FooterOps[Self <: Footer] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFooter(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Footer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLoading(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Loading")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOption(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Option")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSeparator(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Separator")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

