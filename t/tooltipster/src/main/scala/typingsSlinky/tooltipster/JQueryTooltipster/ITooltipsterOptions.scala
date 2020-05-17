package typingsSlinky.tooltipster.JQueryTooltipster

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.tooltipster.JQuery
import typingsSlinky.tooltipster.anon.Click
import typingsSlinky.tooltipster.anon.Mouseenter
import typingsSlinky.tooltipster.tooltipsterStrings.current
import typingsSlinky.tooltipster.tooltipsterStrings.fade
import typingsSlinky.tooltipster.tooltipsterStrings.fall
import typingsSlinky.tooltipster.tooltipsterStrings.grow
import typingsSlinky.tooltipster.tooltipsterStrings.none
import typingsSlinky.tooltipster.tooltipsterStrings.previous
import typingsSlinky.tooltipster.tooltipsterStrings.rotate
import typingsSlinky.tooltipster.tooltipsterStrings.scale
import typingsSlinky.tooltipster.tooltipsterStrings.slide
import typingsSlinky.tooltipster.tooltipsterStrings.swing
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ITooltipsterOptions
  extends /**
		 * Several plugins may have methods of the same name. To resolve the conflict, use the instance object of the 
		 * tooltip and specify the full name of the desired plugin in your calls.
		 */
/* pluginName */ StringDictionary[js.Any] {
  /**
  		 * The minimum version of Internet Explorer to run on. 
  		 * @default 6
  		 */
  var IEmin: js.UndefOr[Double] = js.native
  /**
  		 * Determines how the tooltip will animate in and out. In addition to the built-in transitions, 
  		 * you may also create custom transitions in your CSS files. In IE9 and lower, all animations 
  		 * default to a JavaScript generated, fade animation. 
  		 * @default 'fade'
  		 */
  var animation: js.UndefOr[fade | grow | swing | slide | fall] = js.native
  /**
  		 * Sets the duration of the animation, in milliseconds. If you wish to provide different durations 
  		 * for the opening and closing animations, provide an array of two different values. 
  		 * @default 350
  		 */
  var animationDuration: js.UndefOr[Double | js.Array[Double]] = js.native
  /**
  		 * Add a "speech bubble" arrow to the tooltip. 
  		 * @default true
  		 */
  var arrow: js.UndefOr[Boolean] = js.native
  /**
  		 * If set, this will override the content of the tooltip. If you provide something else than a string 
  		 * or jQuery-wrapped HTML element, you will need to use the 'functionFormat' option to format your 
  		 * content for display. 
  		 * @default null
  		 */
  var content: js.UndefOr[String | JQuery | js.Any] = js.native
  /**
  		 * If the content of the tooltip is provided as a string, it is displayed as plain text by default. 
  		 * If this content should actually be interpreted as HTML, set this option to true. 
  		 * @default false
  		 */
  var contentAsHTML: js.UndefOr[Boolean] = js.native
  /**
  		 * If you provide a jQuery object to the 'content' option, this sets if it is a clone of this object 
  		 * that should actually be used. 
  		 * @default false
  		 */
  var contentCloning: js.UndefOr[Boolean] = js.native
  /**
  		 * Tooltipster logs hints and notices into the console when you're doing something you ideally shouldn't 
  		 * be doing. Set to false to disable logging. 
  		 * @default true
  		 */
  var debug: js.UndefOr[Boolean] = js.native
  /**
  		 * Upon mouse interaction, this is the delay before the tooltip starts its opening and closing animations 
  		 * when the 'hover' trigger is used (*). If you wish to specify different delays for opening and closing, 
  		 * you may provide an array of two different values. 
  		 * @default 300
  		 */
  var delay: js.UndefOr[Double | js.Array[Double]] = js.native
  /**
  		 * Upon touch interaction, this is the delay before the tooltip starts its opening and closing animations 
  		 * when the 'hover' trigger is used (*). If you wish to specify different delays for opening and closing, 
  		 * you may provide an array of two different values. 
  		 * @default [300, 500]
  		 */
  var delayTouch: js.UndefOr[Double | js.Array[Double]] = js.native
  /**
  		 * The distance between the origin and the tooltip, in pixels. The value may be an integer or an array of 
  		 * integers (in the usual CSS syntax) if you wish to specify a different distance for each side. 
  		 * @default 6
  		 */
  var distance: js.UndefOr[Double | js.Array[Double]] = js.native
  /**
  		 * A custom function to be fired once the tooltip has been closed and removed from the DOM. 
  		 * @default null
  		 */
  var functionAfter: js.UndefOr[TooltipsterStandardCallbackFunction] = js.native
  /**
  		 * A custom function to be fired before the tooltip is opened. This function may prevent the opening if it 
  		 * returns false. 
  		 * @default null
  		 */
  var functionBefore: js.UndefOr[TooltipsterStandardCallbackFunction] = js.native
  /**
  		 * A custom function that does not modify the content but that can format it for display. It gets the two 
  		 * first usual arguments and also the content as third argument. It must return the value that will be 
  		 * displayed in the tooltip, either a string or a jQuery-wrapped HTML element (see the formatting section). 
  		 * @default null
  		 */
  var functionFormat: js.UndefOr[
    js.Function3[
      /* instance */ ITooltipsterInstance, 
      /* helper */ ITooltipsterHelper, 
      /* content */ js.Any, 
      String | JQuery
    ]
  ] = js.native
  /**
  		 * A custom function to be fired only once at instantiation. 
  		 * @default null
  		 */
  var functionInit: js.UndefOr[TooltipsterStandardCallbackFunction] = js.native
  /**
  		 * A custom function fired when the tooltip is repositioned. It gives you the ability to slightly or 
  		 * completely modify the position that Tooltipster is about to give to the tooltip. It gets the proposed 
  		 * set of placement values as third argument. The function must return the set of placement values, which 
  		 * you may have edited (see the positioning section). 
  		 * @default null
  		 */
  var functionPosition: js.UndefOr[
    js.Function3[
      /* instance */ ITooltipsterInstance, 
      /* helper */ ITooltipsterHelper, 
      /* position */ ITooltipPosition, 
      ITooltipPosition
    ]
  ] = js.native
  /**
  		 * A custom function to be fired when the tooltip and its contents have been added to the DOM. 
  		 * @default null
  		 */
  var functionReady: js.UndefOr[TooltipsterStandardCallbackFunction] = js.native
  /**
  		 * Give users the possibility to interact with the content of the tooltip. If you want them to be able to 
  		 * make clicks, fill forms or do other interactions inside the tooltip, you have to set this option to 
  		 * true. When the 'hover' close trigger is used, the user has to move the cursor to the tooltip before it 
  		 * starts closing (this lapse of time has its duration set by the 'delay' option). 
  		 * @default false
  		 */
  var interactive: js.UndefOr[Boolean] = js.native
  /**
  		 * Set a maximum width for the tooltip. 
  		 * @default null (no max width)
  		 */
  var maxWidth: js.UndefOr[Double] = js.native
  /**
  		 * Corresponds to the minimum distance to enforce between the center of the arrow and the edges of the 
  		 * tooltip. Mainly used to create an arrow bigger than those of the default themes. 
  		 * @default 16
  		 */
  var minIntersection: js.UndefOr[Double] = js.native
  /**
  		 * Set a minimum width for the tooltip. 
  		 * @default 0 (auto width)
  		 */
  var minWidth: js.UndefOr[Double] = js.native
  /**
  		 * Allows you to put several tooltips on a single element (see the multiple section). 
  		 * @default false
  		 */
  var multiple: js.UndefOr[Boolean] = js.native
  /**
  		 * The names of plugins to be used by Tooltipster. 
  		 * @default ['sideTip']
  		 */
  var plugins: js.UndefOr[js.Array[String]] = js.native
  /**
  		 * Repositions the tooltip if it goes out of the viewport when the user scrolls the page, in order to 
  		 * keep it visible as long as possible. 
  		 * @default false
  		 */
  var repositionOnScroll: js.UndefOr[Boolean] = js.native
  /**
  		 * Specifies if a TITLE attribute should be restored on the HTML element after a call to the 'destroy' 
  		 * method. This attribute may be omitted, or be restored with the value that existed before Tooltipster 
  		 * was initialized, or be restored with the stringified value of the current content. Note: in case of 
  		 * multiple tooltips on a single element, only the last destroyed tooltip may trigger a restoration. 
  		 * 
  		 * @default 'none'
  		 */
  var restoration: js.UndefOr[none | previous | current] = js.native
  /**
  		 * Sets if the tooltip should self-destruct after a few seconds when its origin is removed from the DOM. 
  		 * This prevents memory leaks. 
  		 * @default true
  		 */
  var selfDestruction: js.UndefOr[Boolean] = js.native
  /**
  		 * Sets the side of the tooltip. The value may one of the following: 'top', 'bottom', 'left', 'right'. 
  		 * It may also be an array containing one or more of these values. When using an array, the order of 
  		 * values is taken into account as order of fallbacks and the absence of a side disables it (see the 
  		 * sides section). Default: ['top', 'bottom', 'right', 'left']
  		 */
  var side: js.UndefOr[TooltipPositioningSide | js.Array[TooltipPositioningSide]] = js.native
  /**
  		 * Set a theme that will override the default tooltip appearance. You may provide an array of strings 
  		 * to apply several themes at once (see the themes section). 
  		 * @default: []
  		 */
  var theme: js.UndefOr[String | js.Array[String]] = js.native
  /**
  		 * How long (in ms) the tooltip should live before closing. 
  		 * @default 0 (disabled)
  		 */
  var timer: js.UndefOr[Double] = js.native
  var trackOrigin: js.UndefOr[Boolean] = js.native
  var trackTooltip: js.UndefOr[Boolean] = js.native
  /**
  		 * Sets how often the tracker should run (see trackOrigin and trackTooltip), in milliseconds. The tracker 
  		 * runs even if trackOrigin and trackTooltip are false to check if the origin has not been removed while 
  		 * the tooltip was open, so you shouldn't set too high or too low values unless you need to. 
  		 * @default 500
  		 */
  var trackerInterval: js.UndefOr[Double] = js.native
  /**
  		 * Set how tooltips should be activated and closed.
  		 * Possible values: hover, click or custom.
  		 */
  var trigger: js.UndefOr[String] = js.native
  /**
  		 * When 'trigger' is set to 'custom', all built-in close triggers are disabled by default. This option 
  		 * allows you to reactivate the triggers of your choice to create a customized behavior. Only applies 
  		 * if 'trigger' is set to 'custom'. See http://iamceege.github.io/tooltipster/#triggers.
  		 */
  var triggerClose: js.UndefOr[Click] = js.native
  /**
  		 * When 'trigger' is set to 'custom', all built-in open triggers are disabled by default. This option 
  		 * allows you to reactivate the triggers of your choice to create a customized behavior. Only applies 
  		 * if 'trigger' is set to 'custom'. See http://iamceege.github.io/tooltipster/#triggers.
  		 */
  var triggerOpen: js.UndefOr[Mouseenter] = js.native
  /**
  		 * Plays a subtle animation when the content of the tooltip is updated (if the tooltip is open). You 
  		 * may create custom animations in your CSS files. Set to null to disable the animation. 
  		 * @default 'rotate'
  		 */
  var updateAnimation: js.UndefOr[fade | rotate | scale | Null] = js.native
  /**
  		 * Tries to place the tooltip in such a way that it will be entirely visible on screen when it's opened.
  		 * If the tooltip is to be opened while its origin is off screen (using a method call), you may want to 
  		 * set this option to false. 
  		 * @default true
  		 */
  var viewportAware: js.UndefOr[Boolean] = js.native
  /**
  		 * Set the z-index of the tooltip. 
  		 * @default 9999999
  		 */
  var zIndex: js.UndefOr[Double] = js.native
}

object ITooltipsterOptions {
  @scala.inline
  def apply(): ITooltipsterOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ITooltipsterOptions]
  }
  @scala.inline
  implicit class ITooltipsterOptionsOps[Self <: ITooltipsterOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIEmin(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IEmin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIEmin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IEmin")(js.undefined)
        ret
    }
    @scala.inline
    def withAnimation(value: fade | grow | swing | slide | fall): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnimation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animation")(js.undefined)
        ret
    }
    @scala.inline
    def withAnimationDuration(value: Double | js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animationDuration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnimationDuration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animationDuration")(js.undefined)
        ret
    }
    @scala.inline
    def withArrow(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arrow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArrow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arrow")(js.undefined)
        ret
    }
    @scala.inline
    def withContent(value: String | JQuery | js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("content")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("content")(js.undefined)
        ret
    }
    @scala.inline
    def withContentAsHTML(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentAsHTML")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContentAsHTML: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentAsHTML")(js.undefined)
        ret
    }
    @scala.inline
    def withContentCloning(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentCloning")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContentCloning: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentCloning")(js.undefined)
        ret
    }
    @scala.inline
    def withDebug(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debug")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDebug: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debug")(js.undefined)
        ret
    }
    @scala.inline
    def withDelay(value: Double | js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDelay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delay")(js.undefined)
        ret
    }
    @scala.inline
    def withDelayTouch(value: Double | js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delayTouch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDelayTouch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delayTouch")(js.undefined)
        ret
    }
    @scala.inline
    def withDistance(value: Double | js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("distance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDistance: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("distance")(js.undefined)
        ret
    }
    @scala.inline
    def withFunctionAfter(value: (/* instance */ ITooltipsterInstance, /* helper */ ITooltipsterHelper) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("functionAfter")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutFunctionAfter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("functionAfter")(js.undefined)
        ret
    }
    @scala.inline
    def withFunctionBefore(value: (/* instance */ ITooltipsterInstance, /* helper */ ITooltipsterHelper) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("functionBefore")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutFunctionBefore: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("functionBefore")(js.undefined)
        ret
    }
    @scala.inline
    def withFunctionFormat(
      value: (/* instance */ ITooltipsterInstance, /* helper */ ITooltipsterHelper, /* content */ js.Any) => String | JQuery
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("functionFormat")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutFunctionFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("functionFormat")(js.undefined)
        ret
    }
    @scala.inline
    def withFunctionInit(value: (/* instance */ ITooltipsterInstance, /* helper */ ITooltipsterHelper) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("functionInit")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutFunctionInit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("functionInit")(js.undefined)
        ret
    }
    @scala.inline
    def withFunctionPosition(
      value: (/* instance */ ITooltipsterInstance, /* helper */ ITooltipsterHelper, /* position */ ITooltipPosition) => ITooltipPosition
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("functionPosition")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutFunctionPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("functionPosition")(js.undefined)
        ret
    }
    @scala.inline
    def withFunctionReady(value: (/* instance */ ITooltipsterInstance, /* helper */ ITooltipsterHelper) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("functionReady")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutFunctionReady: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("functionReady")(js.undefined)
        ret
    }
    @scala.inline
    def withInteractive(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interactive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInteractive: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interactive")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withMinIntersection(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minIntersection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinIntersection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minIntersection")(js.undefined)
        ret
    }
    @scala.inline
    def withMinWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withMultiple(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multiple")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMultiple: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multiple")(js.undefined)
        ret
    }
    @scala.inline
    def withPlugins(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plugins")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlugins: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plugins")(js.undefined)
        ret
    }
    @scala.inline
    def withRepositionOnScroll(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("repositionOnScroll")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRepositionOnScroll: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("repositionOnScroll")(js.undefined)
        ret
    }
    @scala.inline
    def withRestoration(value: none | previous | current): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("restoration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRestoration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("restoration")(js.undefined)
        ret
    }
    @scala.inline
    def withSelfDestruction(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selfDestruction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelfDestruction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selfDestruction")(js.undefined)
        ret
    }
    @scala.inline
    def withSide(value: TooltipPositioningSide | js.Array[TooltipPositioningSide]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("side")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSide: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("side")(js.undefined)
        ret
    }
    @scala.inline
    def withTheme(value: String | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("theme")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTheme: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("theme")(js.undefined)
        ret
    }
    @scala.inline
    def withTimer(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timer")(js.undefined)
        ret
    }
    @scala.inline
    def withTrackOrigin(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trackOrigin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrackOrigin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trackOrigin")(js.undefined)
        ret
    }
    @scala.inline
    def withTrackTooltip(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trackTooltip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrackTooltip: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trackTooltip")(js.undefined)
        ret
    }
    @scala.inline
    def withTrackerInterval(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trackerInterval")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrackerInterval: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trackerInterval")(js.undefined)
        ret
    }
    @scala.inline
    def withTrigger(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trigger")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrigger: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trigger")(js.undefined)
        ret
    }
    @scala.inline
    def withTriggerClose(value: Click): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("triggerClose")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTriggerClose: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("triggerClose")(js.undefined)
        ret
    }
    @scala.inline
    def withTriggerOpen(value: Mouseenter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("triggerOpen")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTriggerOpen: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("triggerOpen")(js.undefined)
        ret
    }
    @scala.inline
    def withUpdateAnimation(value: fade | rotate | scale): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateAnimation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpdateAnimation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateAnimation")(js.undefined)
        ret
    }
    @scala.inline
    def withUpdateAnimationNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateAnimation")(null)
        ret
    }
    @scala.inline
    def withViewportAware(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewportAware")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutViewportAware: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewportAware")(js.undefined)
        ret
    }
    @scala.inline
    def withZIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zIndex")(js.undefined)
        ret
    }
  }
  
}

