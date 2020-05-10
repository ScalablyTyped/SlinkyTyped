package typingsSlinky.swiper.mod

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.swiper.swiperStrings.bullets
import typingsSlinky.swiper.swiperStrings.custom
import typingsSlinky.swiper.swiperStrings.fraction
import typingsSlinky.swiper.swiperStrings.progressbar
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PaginationOptions extends js.Object {
  /**
    * CSS class name of currently active pagination bullet
    */
  var bulletActiveClass: js.UndefOr[String] = js.native
  /**
    * CSS class name of single pagination bullet
    */
  var bulletClass: js.UndefOr[String] = js.native
  /**
    * Defines which HTML tag will be use to represent single pagination bullet. Only for bullets pagination type.
    */
  var bulletElement: js.UndefOr[String] = js.native
  /**
    * If true then clicking on pagination button will cause transition to appropriate slide. Only for bullets pagination type
    */
  var clickable: js.UndefOr[Boolean] = js.native
  /**
    * CSS class name set to pagination when it is clickable
    */
  var clickableClass: js.UndefOr[String] = js.native
  /**
    * CSS class name of the element with currently active index in "fraction" pagination
    */
  var currentClass: js.UndefOr[String] = js.native
  /**
    * Good to enable if you use bullets pagination with a lot of slides. So it will keep only few bullets visible at the same time.
    */
  var dynamicBullets: js.UndefOr[Boolean] = js.native
  /**
    * The number of main bullets visible when dynamicBullets enabled.
    */
  var dynamicMainBullets: js.UndefOr[Double] = js.native
  /**
    * String with CSS selector or HTML element of the container with pagination
    */
  var el: SelectableElement = js.native
  /**
    * format fraction pagination current number. Function receives current number,
    * and you need to return formatted value
    */
  var formatFractionCurrent: js.UndefOr[js.Function1[/* number */ Double, Double]] = js.native
  /**
    * format fraction pagination total number. Function receives total number, and you
    * need to return formatted value
    */
  var formatFractionTotal: js.UndefOr[js.Function1[/* number */ Double, Double]] = js.native
  /**
    * CSS class name of pagination when it becomes inactive
    */
  var hiddenClass: js.UndefOr[String] = js.native
  /**
    * Toggle (hide/true) pagination container visibility after click on Slider's container
    */
  var hideOnClick: js.UndefOr[Boolean] = js.native
  /**
    * The beginning of the modifier CSS class name that will be added to pagination depending on parameters
    */
  var modifierClass: js.UndefOr[String] = js.native
  /**
    * CSS class name of pagination progressbar fill element
    */
  var progressbarFillClass: js.UndefOr[String] = js.native
  /**
    * Makes pagination progressbar opposite to Swiper's `direction` parameter, means vertical progressbar for horizontal swiper
    * direction and horizontal progressbar for vertical swiper direction
    */
  var progressbarOpposite: js.UndefOr[Boolean] = js.native
  /**
    * This parameter allows totally customize pagination bullets, you need to pass here a function that accepts index number of
    * pagination bullet and required element class name (className). Only for bullets pagination type
    */
  var renderBullet: js.UndefOr[js.Function2[/* index */ Double, /* className */ String, Unit]] = js.native
  /**
    * This parameter is required for custom pagination type where you have to specify
    * how it should be rendered.
    *
    * @example
    * var swiper = new Swiper('.swiper-container', {
    *   //...
    *   renderCustom: function (swiper, current, total) {
    *     return current + ' of ' + total;
    *   }
    * });
    */
  var renderCustom: js.UndefOr[
    js.Function3[/* swiper */ Swiper, /* current */ Double, /* total */ Double, Unit]
  ] = js.native
  /**
    * This parameter allows to customize "fraction" pagination html. Only for fraction pagination type
    */
  var renderFraction: js.UndefOr[js.Function2[/* currentClass */ String, /* totalClass */ String, Unit]] = js.native
  /**
    * This parameter allows to customize "progress" pagination. Only for progress pagination type
    */
  var renderProgressbar: js.UndefOr[js.Function1[/* progressbarFillClass */ String, Unit]] = js.native
  /**
    * CSS class name of the element with total number of "snaps" in "fraction" pagination
    */
  var totalClass: js.UndefOr[String] = js.native
  /**
    * String with type of pagination. Can be "bullets", "fraction", "progressbar" or "custom"
    */
  var `type`: js.UndefOr[bullets | fraction | progressbar | custom] = js.native
}

object PaginationOptions {
  @scala.inline
  def apply(el: SelectableElement): PaginationOptions = {
    val __obj = js.Dynamic.literal(el = el.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaginationOptions]
  }
  @scala.inline
  implicit class PaginationOptionsOps[Self <: PaginationOptions] (val x: Self) extends AnyVal {
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
    def withBulletActiveClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bulletActiveClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBulletActiveClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bulletActiveClass")(js.undefined)
        ret
    }
    @scala.inline
    def withBulletClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bulletClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBulletClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bulletClass")(js.undefined)
        ret
    }
    @scala.inline
    def withBulletElement(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bulletElement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBulletElement: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bulletElement")(js.undefined)
        ret
    }
    @scala.inline
    def withClickable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clickable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClickable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clickable")(js.undefined)
        ret
    }
    @scala.inline
    def withClickableClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clickableClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClickableClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clickableClass")(js.undefined)
        ret
    }
    @scala.inline
    def withCurrentClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCurrentClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentClass")(js.undefined)
        ret
    }
    @scala.inline
    def withDynamicBullets(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dynamicBullets")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDynamicBullets: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dynamicBullets")(js.undefined)
        ret
    }
    @scala.inline
    def withDynamicMainBullets(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dynamicMainBullets")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDynamicMainBullets: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dynamicMainBullets")(js.undefined)
        ret
    }
    @scala.inline
    def withFormatFractionCurrent(value: /* number */ Double => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formatFractionCurrent")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutFormatFractionCurrent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formatFractionCurrent")(js.undefined)
        ret
    }
    @scala.inline
    def withFormatFractionTotal(value: /* number */ Double => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formatFractionTotal")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutFormatFractionTotal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formatFractionTotal")(js.undefined)
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
    def withModifierClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modifierClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutModifierClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modifierClass")(js.undefined)
        ret
    }
    @scala.inline
    def withProgressbarFillClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("progressbarFillClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProgressbarFillClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("progressbarFillClass")(js.undefined)
        ret
    }
    @scala.inline
    def withProgressbarOpposite(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("progressbarOpposite")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProgressbarOpposite: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("progressbarOpposite")(js.undefined)
        ret
    }
    @scala.inline
    def withRenderBullet(value: (/* index */ Double, /* className */ String) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderBullet")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutRenderBullet: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderBullet")(js.undefined)
        ret
    }
    @scala.inline
    def withRenderCustom(value: (/* swiper */ Swiper, /* current */ Double, /* total */ Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderCustom")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutRenderCustom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderCustom")(js.undefined)
        ret
    }
    @scala.inline
    def withRenderFraction(value: (/* currentClass */ String, /* totalClass */ String) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderFraction")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutRenderFraction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderFraction")(js.undefined)
        ret
    }
    @scala.inline
    def withRenderProgressbar(value: /* progressbarFillClass */ String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderProgressbar")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutRenderProgressbar: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderProgressbar")(js.undefined)
        ret
    }
    @scala.inline
    def withTotalClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTotalClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalClass")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: bullets | fraction | progressbar | custom): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
  }
  
}

