package typingsSlinky.tinySliderReact.mod

import typingsSlinky.tinySliderReact.tinySliderReactBooleans.`false`
import typingsSlinky.tinySliderReact.tinySliderReactStrings.page
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CommonOptions extends js.Object {
  /**
    * Allows using arrow keys to switch slides.
    * @defaultValue false
    */
  var arrowKeys: js.UndefOr[Boolean] = js.native
  /**
    * Height of slider container changes according to each slide"s height.
    * @defaultValue false
    */
  var autoHeight: js.UndefOr[Boolean] = js.native
  /**
    * Toggles the automatic change of slides
    * @defaultValue false
    */
  var autoplay: js.UndefOr[Boolean] = js.native
  /**
    * Stops sliding on mouseover.
    * @defaultValue false
    */
  var autoplayHoverPause: js.UndefOr[Boolean] = js.native
  /**
    * Pauses the sliding when the page is invisiable and resumes it when the page become visiable again
    * @defaultValue true
    */
  var autoplayResetOnVisibility: js.UndefOr[Boolean] = js.native
  /**
    * Text or markup in the autoplay start/stop button.
    * @defaultValue ["start", "stop"]
    */
  var autoplayText: js.UndefOr[js.Array[String]] = js.native
  /**
    * Time between 2 autoplay slides change (in "ms").
    * @defaultValue 5000
    */
  var autoplayTimeout: js.UndefOr[Double] = js.native
  /**
    * Controls the display and functionalities of controls components (prev/next buttons). If true, display the controls and add all functionalities.
    * @defaultValue true
    */
  var controls: js.UndefOr[Boolean] = js.native
  /**
    * Text or markup in the prev/next buttons
    * @defaultValue ["prev", "next"]
    */
  var controlsText: js.UndefOr[js.Array[String]] = js.native
  /**
    * Disable slider.
    * @defaultValue false
    */
  var disable: js.UndefOr[Boolean] = js.native
  /**
    * Space on the outside (in "px").
    * @defaultValue 0
    */
  var edgePadding: js.UndefOr[Double] = js.native
  /**
    * Controls width attribute of the slides.
    * @defaultValue false
    */
  var fixedWidth: js.UndefOr[Double | `false`] = js.native
  /**
    * Space between slides (in "px").
    * @defaultValue 0
    */
  var gutter: js.UndefOr[Double] = js.native
  /**
    * Number of slides being displayed in the viewport.
    * @defaultValue 1
    */
  var items: js.UndefOr[Double] = js.native
  /**
    * Changing slides by dragging them.
    * @defaultValue false
    */
  var mouseDrag: js.UndefOr[Boolean] = js.native
  /**
    * Controls the display and functionalities of nav components (dots). If true, display the nav and add all functionalities.
    * @defaultValue true
    */
  var nav: js.UndefOr[Boolean] = js.native
  /**
    * Number of slides going on one "click".
    * @defaultValue 1
    */
  var slideBy: js.UndefOr[Double | page] = js.native
  /**
    * Speed of the slide animation (in "ms").
    * @defaultValue 300
    */
  var speed: js.UndefOr[Double] = js.native
  /**
    * The initial index of the slider.
    * @defaultValue 0
    */
  var startIndex: js.UndefOr[Double] = js.native
  /**
    * Activates input detection for touch devices.
    * @defaultValue true
    */
  var touch: js.UndefOr[Boolean] = js.native
}

object CommonOptions {
  @scala.inline
  def apply(): CommonOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CommonOptions]
  }
  @scala.inline
  implicit class CommonOptionsOps[Self <: CommonOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArrowKeys(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arrowKeys")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArrowKeys: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arrowKeys")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoHeight(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoplay(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoplay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoplay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoplay")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoplayHoverPause(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoplayHoverPause")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoplayHoverPause: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoplayHoverPause")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoplayResetOnVisibility(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoplayResetOnVisibility")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoplayResetOnVisibility: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoplayResetOnVisibility")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoplayText(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoplayText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoplayText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoplayText")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoplayTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoplayTimeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoplayTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoplayTimeout")(js.undefined)
        ret
    }
    @scala.inline
    def withControls(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("controls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutControls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("controls")(js.undefined)
        ret
    }
    @scala.inline
    def withControlsText(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("controlsText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutControlsText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("controlsText")(js.undefined)
        ret
    }
    @scala.inline
    def withDisable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disable")(js.undefined)
        ret
    }
    @scala.inline
    def withEdgePadding(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("edgePadding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEdgePadding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("edgePadding")(js.undefined)
        ret
    }
    @scala.inline
    def withFixedWidth(value: Double | `false`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fixedWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFixedWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fixedWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withGutter(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gutter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGutter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gutter")(js.undefined)
        ret
    }
    @scala.inline
    def withItems(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("items")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItems: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("items")(js.undefined)
        ret
    }
    @scala.inline
    def withMouseDrag(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mouseDrag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMouseDrag: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mouseDrag")(js.undefined)
        ret
    }
    @scala.inline
    def withNav(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nav")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNav: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nav")(js.undefined)
        ret
    }
    @scala.inline
    def withSlideBy(value: Double | page): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slideBy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSlideBy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slideBy")(js.undefined)
        ret
    }
    @scala.inline
    def withSpeed(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("speed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpeed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("speed")(js.undefined)
        ret
    }
    @scala.inline
    def withStartIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startIndex")(js.undefined)
        ret
    }
    @scala.inline
    def withTouch(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("touch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTouch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("touch")(js.undefined)
        ret
    }
  }
  
}

