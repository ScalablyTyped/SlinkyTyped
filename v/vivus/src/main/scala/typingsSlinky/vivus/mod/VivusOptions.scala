package typingsSlinky.vivus.mod

import typingsSlinky.vivus.vivusStrings.`scenario-sync`
import typingsSlinky.vivus.vivusStrings.autostart
import typingsSlinky.vivus.vivusStrings.delayed
import typingsSlinky.vivus.vivusStrings.inViewport
import typingsSlinky.vivus.vivusStrings.manual
import typingsSlinky.vivus.vivusStrings.oneByOne
import typingsSlinky.vivus.vivusStrings.scenario
import typingsSlinky.vivus.vivusStrings.script
import typingsSlinky.vivus.vivusStrings.sync
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VivusOptions extends js.Object {
  /**
    * Timing animation function for the complete SVG.
    * It must accept a `number` as a parameter (between 0 to 1), and return a `number` (also between 0 and 1) as a result.
    *
    * See the [timing function documentation](https://github.com/maxwellito/vivus#timing-function).
    */
  var animTimingFunction: js.UndefOr[TimingFunction] = js.native
  /**
    * Whitespace extra margin between dashes.
    * Increase it in case of glitches at the initial state of the animation.
    *
    * (default: `2`)
    */
  var dashGap: js.UndefOr[Double] = js.native
  /**
    * 	Time between the drawing of first and last path, in frames (only for `delayed` animations).
    */
  var delay: js.UndefOr[Double] = js.native
  /**
    * Animation duration, in frames.
    * (default: `200`)
    */
  var duration: js.UndefOr[Double] = js.native
  /**
    * Link to the SVG to animate.
    * If set, Vivus will create an object tag and append it to the DOM element given to the constructor.
    * Be careful, use the `onReady` callback before playing with the Vivus instance.
    */
  var file: js.UndefOr[String] = js.native
  /**
    * Force the browser to re-render all updated path items.
    * By default, the value is `true` on IE only.
    *
    * See [the troubleshooting documentation for more details](https://github.com/maxwellito/vivus#troubleshoot).
    */
  var forceRender: js.UndefOr[Boolean] = js.native
  /**
    * Function called when the instance is ready to play.
    */
  var onReady: js.UndefOr[js.Function1[/* vivusInstance */ Vivus, Unit]] = js.native
  /**
    * Timing animation function for each path element of the SVG.
    * It must accept a `number` as a parameter (between 0 to 1), and return a `number` (also between 0 and 1) as a result.
    *
    * See the [timing function documentation](https://github.com/maxwellito/vivus#timing-function).
    */
  var pathTimingFunction: js.UndefOr[TimingFunction] = js.native
  /**
    * Reverse the order of execution.
    * The default behaviour is to render from the first 'path' in the SVG to the last one.
    * This option allow you to reverse the order.
    *
    * (default: `false`)
    */
  var reverseStack: js.UndefOr[Boolean] = js.native
  /**
    * Removes all extra styling on the SVG, and leaves it as original.
    */
  var selfDestroy: js.UndefOr[Boolean] = js.native
  /**
    * Automatically starts the animation.
    * Can be `'inViewport'`, `'manual'`, or `'autostart'`
    * (default: `'inViewport'`)
    */
  var start: js.UndefOr[inViewport | manual | autostart] = js.native
  /**
    * Determines if the item must be drawn asynchronously or not.
    * Can be `'delayed'`, `'sync'`, `'oneByOne'`, `'script'`, `'scenario'`, or `'scenario-sync'`.
    * (default: `'delayed'`)
    */
  var `type`: js.UndefOr[delayed | sync | oneByOne | script | scenario | `scenario-sync`] = js.native
}

object VivusOptions {
  @scala.inline
  def apply(): VivusOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VivusOptions]
  }
  @scala.inline
  implicit class VivusOptionsOps[Self <: VivusOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnimTimingFunction(value: /* input */ Double => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animTimingFunction")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutAnimTimingFunction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animTimingFunction")(js.undefined)
        ret
    }
    @scala.inline
    def withDashGap(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dashGap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDashGap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dashGap")(js.undefined)
        ret
    }
    @scala.inline
    def withDelay(value: Double): Self = {
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
    def withDuration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("duration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDuration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("duration")(js.undefined)
        ret
    }
    @scala.inline
    def withFile(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("file")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFile: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("file")(js.undefined)
        ret
    }
    @scala.inline
    def withForceRender(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forceRender")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutForceRender: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forceRender")(js.undefined)
        ret
    }
    @scala.inline
    def withOnReady(value: /* vivusInstance */ Vivus => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onReady")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnReady: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onReady")(js.undefined)
        ret
    }
    @scala.inline
    def withPathTimingFunction(value: /* input */ Double => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pathTimingFunction")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutPathTimingFunction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pathTimingFunction")(js.undefined)
        ret
    }
    @scala.inline
    def withReverseStack(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reverseStack")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReverseStack: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reverseStack")(js.undefined)
        ret
    }
    @scala.inline
    def withSelfDestroy(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selfDestroy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelfDestroy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selfDestroy")(js.undefined)
        ret
    }
    @scala.inline
    def withStart(value: inViewport | manual | autostart): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: delayed | sync | oneByOne | script | scenario | `scenario-sync`): Self = {
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

