package typingsSlinky.sweetalert.optionsMod

import typingsSlinky.sweetalert.optionsButtonsMod.ButtonList
import typingsSlinky.sweetalert.optionsContentMod.ContentOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SwalOptions extends js.Object {
  var buttons: ButtonList | (js.Array[String | Boolean]) = js.native
  var className: String = js.native
  var closeOnClickOutside: Boolean = js.native
  var closeOnEsc: Boolean = js.native
  var content: ContentOptions = js.native
  var dangerMode: Boolean = js.native
  var icon: String = js.native
  var text: String = js.native
  var timer: Double = js.native
  var title: String = js.native
}

object SwalOptions {
  @scala.inline
  def apply(
    buttons: ButtonList | (js.Array[String | Boolean]),
    className: String,
    closeOnClickOutside: Boolean,
    closeOnEsc: Boolean,
    content: ContentOptions,
    dangerMode: Boolean,
    icon: String,
    text: String,
    timer: Double,
    title: String
  ): SwalOptions = {
    val __obj = js.Dynamic.literal(buttons = buttons.asInstanceOf[js.Any], className = className.asInstanceOf[js.Any], closeOnClickOutside = closeOnClickOutside.asInstanceOf[js.Any], closeOnEsc = closeOnEsc.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], dangerMode = dangerMode.asInstanceOf[js.Any], icon = icon.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], timer = timer.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[SwalOptions]
  }
  @scala.inline
  implicit class SwalOptionsOps[Self <: SwalOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withButtons(value: ButtonList | (js.Array[String | Boolean])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttons")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCloseOnClickOutside(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closeOnClickOutside")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCloseOnEsc(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closeOnEsc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContent(value: ContentOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("content")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDangerMode(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dangerMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIcon(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTimer(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

