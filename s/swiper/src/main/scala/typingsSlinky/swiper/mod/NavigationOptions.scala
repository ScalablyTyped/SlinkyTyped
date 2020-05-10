package typingsSlinky.swiper.mod

import org.scalajs.dom.raw.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NavigationOptions extends js.Object {
  /**
    * CSS class name added to navigation button when it becomes disabled
    *
    * @default 'swiper-button-disabled'
    */
  var disabledClass: js.UndefOr[String] = js.native
  /**
    * CSS class name added to navigation button when it becomes hidden
    *
    * @default 'swiper-button-hidden'
    */
  var hiddenClass: js.UndefOr[String] = js.native
  /**
    * buttons visibility after click on Slider's container
    *
    * @default false Toggle navigation
    */
  var hideOnClick: js.UndefOr[Boolean] = js.native
  /**
    * String with CSS selector or HTML element of the element that will work
    * like "next" button after click on it
    *
    * @default null
    */
  var nextEl: js.UndefOr[SelectableElement] = js.native
  /**
    * String with CSS selector or HTML element of the element that will work
    * like "prev" button after click on it
    *
    * @default null
    */
  var prevEl: js.UndefOr[SelectableElement] = js.native
}

object NavigationOptions {
  @scala.inline
  def apply(): NavigationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NavigationOptions]
  }
  @scala.inline
  implicit class NavigationOptionsOps[Self <: NavigationOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDisabledClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabledClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisabledClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabledClass")(js.undefined)
        ret
    }
    @scala.inline
    def withHiddenClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hiddenClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHiddenClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hiddenClass")(js.undefined)
        ret
    }
    @scala.inline
    def withHideOnClick(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideOnClick")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHideOnClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideOnClick")(js.undefined)
        ret
    }
    @scala.inline
    def withNextElHTMLElement(value: HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextEl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNextEl(value: SelectableElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextEl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextEl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextEl")(js.undefined)
        ret
    }
    @scala.inline
    def withPrevElHTMLElement(value: HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prevEl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrevEl(value: SelectableElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prevEl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrevEl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prevEl")(js.undefined)
        ret
    }
  }
  
}

