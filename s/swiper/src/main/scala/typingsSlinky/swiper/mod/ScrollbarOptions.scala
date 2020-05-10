package typingsSlinky.swiper.mod

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.swiper.swiperStrings.auto
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScrollbarOptions extends js.Object {
  /**
    * 	Scrollbar draggable element CSS class
    *
    * @default 'swiper-scrollbar-drag'
    */
  var dragClass: js.UndefOr[String] = js.native
  /**
    * Size of scrollbar draggable element in px
    *
    * @default 'auto'
    */
  var dragSize: js.UndefOr[auto | Double] = js.native
  /**
    * Set to true to enable make scrollbar draggable that allows you to control slider position
    *
    * @default true
    */
  var draggable: js.UndefOr[Boolean] = js.native
  /**
    * String with CSS selector or HTML element of the container with scrollbar.
    */
  var el: SelectableElement = js.native
  /**
    * Hide scrollbar automatically after user interaction
    *
    * @default true
    */
  var hide: js.UndefOr[Boolean] = js.native
  /**
    * Scrollbar element additional CSS class when it is disabled
    *
    * @default 'swiper-scrollbar-lock'
    */
  var lockClass: js.UndefOr[String] = js.native
  /**
    * Set to true to snap slider position to slides when you release scrollbar
    *
    * @default false
    */
  var snapOnRelease: js.UndefOr[Boolean] = js.native
}

object ScrollbarOptions {
  @scala.inline
  def apply(el: SelectableElement): ScrollbarOptions = {
    val __obj = js.Dynamic.literal(el = el.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScrollbarOptions]
  }
  @scala.inline
  implicit class ScrollbarOptionsOps[Self <: ScrollbarOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withElHTMLElement(value: HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("el")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEl(value: SelectableElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("el")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDragClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDragClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragClass")(js.undefined)
        ret
    }
    @scala.inline
    def withDragSize(value: auto | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDragSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragSize")(js.undefined)
        ret
    }
    @scala.inline
    def withDraggable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("draggable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDraggable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("draggable")(js.undefined)
        ret
    }
    @scala.inline
    def withHide(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hide")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHide: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hide")(js.undefined)
        ret
    }
    @scala.inline
    def withLockClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lockClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLockClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lockClass")(js.undefined)
        ret
    }
    @scala.inline
    def withSnapOnRelease(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("snapOnRelease")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSnapOnRelease: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("snapOnRelease")(js.undefined)
        ret
    }
  }
  
}

