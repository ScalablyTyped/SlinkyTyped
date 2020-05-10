package typingsSlinky.tryghostContentApi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Facebook extends js.Object {
  var og_description: js.UndefOr[Nullable[String]] = js.native
  var og_image: js.UndefOr[Nullable[String]] = js.native
  var og_title: js.UndefOr[Nullable[String]] = js.native
}

object Facebook {
  @scala.inline
  def apply(): Facebook = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Facebook]
  }
  @scala.inline
  implicit class FacebookOps[Self <: Facebook] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOg_description(value: Nullable[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("og_description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOg_description: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("og_description")(js.undefined)
        ret
    }
    @scala.inline
    def withOg_descriptionNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("og_description")(null)
        ret
    }
    @scala.inline
    def withOg_image(value: Nullable[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("og_image")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOg_image: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("og_image")(js.undefined)
        ret
    }
    @scala.inline
    def withOg_imageNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("og_image")(null)
        ret
    }
    @scala.inline
    def withOg_title(value: Nullable[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("og_title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOg_title: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("og_title")(js.undefined)
        ret
    }
    @scala.inline
    def withOg_titleNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("og_title")(null)
        ret
    }
  }
  
}

