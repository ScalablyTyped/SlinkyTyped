package typingsSlinky.tinySliderReact.mod

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.tinySliderReact.tinySliderReactBooleans.`false`
import typingsSlinky.tinySliderReact.tinySliderReactStrings.backward
import typingsSlinky.tinySliderReact.tinySliderReactStrings.carousel
import typingsSlinky.tinySliderReact.tinySliderReactStrings.forward
import typingsSlinky.tinySliderReact.tinySliderReactStrings.gallery
import typingsSlinky.tinySliderReact.tinySliderReactStrings.horizontal
import typingsSlinky.tinySliderReact.tinySliderReactStrings.inner
import typingsSlinky.tinySliderReact.tinySliderReactStrings.outer
import typingsSlinky.tinySliderReact.tinySliderReactStrings.vertical
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TinySliderSettings extends CommonOptions {
  /**
    * Time between each gallery animation (in "ms").
    * @defaultValue false
    */
  var animateDelay: js.UndefOr[Double | `false`] = js.native
  /**
    * Name of intro animation class.
    * @defaultValue "tns-fadeIn"
    */
  var animateIn: js.UndefOr[String] = js.native
  /**
    * Name of default animation class.
    * @defaultValue "tns-normal"
    */
  var animateNormal: js.UndefOr[String] = js.native
  /**
    * Name of outro animation class.
    * @defaultValue "tns-fadeOut"
    */
  var animateOut: js.UndefOr[String] = js.native
  /**
    * The customized autoplay start/stop button or selector.
    * @defaultValue false
    */
  var autoplayButton: js.UndefOr[HTMLElement | String | `false`] = js.native
  /**
    * Output autoplayButton markup when autoplay is true but a customized autoplayButton is not provided.
    * @defaultValue true
    */
  var autoplayButtonOutput: js.UndefOr[Boolean] = js.native
  /**
    * Direction of slide movement (ascending/descending the slide index).
    * @defaultValue "forward"
    */
  var autoplayDirection: js.UndefOr[forward | backward] = js.native
  /**
    * The axis of the slider.
    * @defaultValue "horizontal"
    */
  var axis: js.UndefOr[horizontal | vertical] = js.native
  /**
    * The container element/selector around the prev/next buttons.
    * controlsContainer must have at least 2 child elements.
    * @defaultValue false
    */
  var controlsContainer: js.UndefOr[HTMLElement | String | `false`] = js.native
  /**
    * Indicate whether the slider will be frozen (controls, nav, autoplay and other functions will stop work) when all slides can be displayed in one page.
    * @defaultValue true
    */
  var freezable: js.UndefOr[Boolean] = js.native
  /**
    * Enables lazyloading images that are currently not viewed, thus saving bandwidth
    * @defaultValue false
    */
  var lazyload: js.UndefOr[Boolean] = js.native
  /**
    * Moves throughout all the slides seamlessly.
    * @defaultValue true
    */
  var loop: js.UndefOr[Boolean] = js.native
  /**
    * Controls animation behaviour.
    * With carousel everything slides to the side, while gallery uses fade animations and changes all slides at once.
    * @defaultValue "carousel"
    */
  var mode: js.UndefOr[carousel | gallery] = js.native
  /**
    * Indecate if the dots are thurbnails. If true, they will always be visible even when more than 1 slides displayed in the viewport.
    * @defaultValue false
    */
  var navAsThumbnails: js.UndefOr[Boolean] = js.native
  /**
    * The container element/selector around the dots.
    * navContainer must have at least same number of children as the slides.
    * @defaultValue false
    */
  var navContainer: js.UndefOr[HTMLElement | String | `false`] = js.native
  /**
    * Difine the relationship between nested sliders.
    * Make sure you run the inner slider first, otherwise the height of the inner slider container will be wrong.
    * @defaultValue false
    */
  var nested: js.UndefOr[inner | outer | `false`] = js.native
  /**
    * Callback to be run on initialization.
    * @defaultValue false
    */
  var onInit: js.UndefOr[js.Function0[Unit | `false`]] = js.native
  /**
    * Breakpoint: Integer.
    * Defines options for different viewport widths
    * @defaultValue false
    */
  var responsive: js.UndefOr[ResponsiveOptions | `false`] = js.native
  /**
    * Moves to the opposite edge when reaching the first or last slide.
    * @defaultValue false
    */
  var rewind: js.UndefOr[Boolean] = js.native
  /**
    * Swipe or drag will not be triggered if the angle is not inside the range when set.
    * @defaultValue 15
    */
  var swipeAngle: js.UndefOr[Double | Boolean] = js.native
}

object TinySliderSettings {
  @scala.inline
  def apply(): TinySliderSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TinySliderSettings]
  }
  @scala.inline
  implicit class TinySliderSettingsOps[Self <: TinySliderSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnimateDelay(value: Double | `false`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animateDelay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnimateDelay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animateDelay")(js.undefined)
        ret
    }
    @scala.inline
    def withAnimateIn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animateIn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnimateIn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animateIn")(js.undefined)
        ret
    }
    @scala.inline
    def withAnimateNormal(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animateNormal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnimateNormal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animateNormal")(js.undefined)
        ret
    }
    @scala.inline
    def withAnimateOut(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animateOut")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnimateOut: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animateOut")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoplayButtonHTMLElement(value: HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoplayButton")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAutoplayButton(value: HTMLElement | String | `false`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoplayButton")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoplayButton: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoplayButton")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoplayButtonOutput(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoplayButtonOutput")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoplayButtonOutput: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoplayButtonOutput")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoplayDirection(value: forward | backward): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoplayDirection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoplayDirection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoplayDirection")(js.undefined)
        ret
    }
    @scala.inline
    def withAxis(value: horizontal | vertical): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("axis")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAxis: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("axis")(js.undefined)
        ret
    }
    @scala.inline
    def withControlsContainerHTMLElement(value: HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("controlsContainer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withControlsContainer(value: HTMLElement | String | `false`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("controlsContainer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutControlsContainer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("controlsContainer")(js.undefined)
        ret
    }
    @scala.inline
    def withFreezable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("freezable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFreezable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("freezable")(js.undefined)
        ret
    }
    @scala.inline
    def withLazyload(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lazyload")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLazyload: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lazyload")(js.undefined)
        ret
    }
    @scala.inline
    def withLoop(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLoop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loop")(js.undefined)
        ret
    }
    @scala.inline
    def withMode(value: carousel | gallery): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mode")(js.undefined)
        ret
    }
    @scala.inline
    def withNavAsThumbnails(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("navAsThumbnails")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNavAsThumbnails: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("navAsThumbnails")(js.undefined)
        ret
    }
    @scala.inline
    def withNavContainerHTMLElement(value: HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("navContainer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNavContainer(value: HTMLElement | String | `false`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("navContainer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNavContainer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("navContainer")(js.undefined)
        ret
    }
    @scala.inline
    def withNested(value: inner | outer | `false`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nested")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNested: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nested")(js.undefined)
        ret
    }
    @scala.inline
    def withOnInit(value: () => Unit | `false`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onInit")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnInit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onInit")(js.undefined)
        ret
    }
    @scala.inline
    def withResponsive(value: ResponsiveOptions | `false`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responsive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResponsive: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responsive")(js.undefined)
        ret
    }
    @scala.inline
    def withRewind(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rewind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRewind: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rewind")(js.undefined)
        ret
    }
    @scala.inline
    def withSwipeAngle(value: Double | Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("swipeAngle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSwipeAngle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("swipeAngle")(js.undefined)
        ret
    }
  }
  
}

