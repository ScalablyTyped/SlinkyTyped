package typingsSlinky.summernote.mod._Global_.Summernote

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PopoverOptions extends js.Object {
  var air: js.UndefOr[popoverAirDef] = js.native
  var image: js.UndefOr[popoverImageDef] = js.native
  var link: js.UndefOr[popoverLinkDef] = js.native
}

object PopoverOptions {
  @scala.inline
  def apply(): PopoverOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PopoverOptions]
  }
  @scala.inline
  implicit class PopoverOptionsOps[Self <: PopoverOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAir(value: popoverAirDef): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("air")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAir: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("air")(js.undefined)
        ret
    }
    @scala.inline
    def withImage(value: popoverImageDef): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("image")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("image")(js.undefined)
        ret
    }
    @scala.inline
    def withLink(value: popoverLinkDef): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("link")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLink: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("link")(js.undefined)
        ret
    }
  }
  
}

