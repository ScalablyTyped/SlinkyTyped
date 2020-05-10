package typingsSlinky.xterm.mod

import org.scalajs.dom.raw.MouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ILinkMatcherOptions extends js.Object {
  /**
    * A callback that fires when the mouse leaves a link. Note that this can
    * happen even when tooltipCallback hasn't fired for the link yet.
    */
  var leaveCallback: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    * The index of the link from the regex.match(text) call. This defaults to 0
    * (for regular expressions without capture groups).
    */
  var matchIndex: js.UndefOr[Double] = js.native
  /**
    * The priority of the link matcher, this defines the order in which the
    * link matcher is evaluated relative to others, from highest to lowest. The
    * default value is 0.
    */
  var priority: js.UndefOr[Double] = js.native
  /**
    * A callback that fires when the mouse hovers over a link for a moment.
    */
  var tooltipCallback: js.UndefOr[
    js.Function3[
      /* event */ MouseEvent, 
      /* uri */ String, 
      /* location */ IViewportRange, 
      Boolean | Unit
    ]
  ] = js.native
  /**
    * A callback that validates whether to create an individual link, pass
    * whether the link is valid to the callback.
    */
  var validationCallback: js.UndefOr[
    js.Function2[/* uri */ String, /* callback */ js.Function1[/* isValid */ Boolean, Unit], Unit]
  ] = js.native
  /**
    * A callback that fires when the mousedown and click events occur that
    * determines whether a link will be activated upon click. This enables
    * only activating a link when a certain modifier is held down, if not the
    * mouse event will continue propagation (eg. double click to select word).
    */
  var willLinkActivate: js.UndefOr[js.Function2[/* event */ MouseEvent, /* uri */ String, Boolean]] = js.native
}

object ILinkMatcherOptions {
  @scala.inline
  def apply(): ILinkMatcherOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ILinkMatcherOptions]
  }
  @scala.inline
  implicit class ILinkMatcherOptionsOps[Self <: ILinkMatcherOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLeaveCallback(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leaveCallback")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutLeaveCallback: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leaveCallback")(js.undefined)
        ret
    }
    @scala.inline
    def withMatchIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("matchIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMatchIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("matchIndex")(js.undefined)
        ret
    }
    @scala.inline
    def withPriority(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("priority")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPriority: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("priority")(js.undefined)
        ret
    }
    @scala.inline
    def withTooltipCallback(value: (/* event */ MouseEvent, /* uri */ String, /* location */ IViewportRange) => Boolean | Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltipCallback")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutTooltipCallback: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltipCallback")(js.undefined)
        ret
    }
    @scala.inline
    def withValidationCallback(value: (/* uri */ String, /* callback */ js.Function1[/* isValid */ Boolean, Unit]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validationCallback")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutValidationCallback: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validationCallback")(js.undefined)
        ret
    }
    @scala.inline
    def withWillLinkActivate(value: (/* event */ MouseEvent, /* uri */ String) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("willLinkActivate")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutWillLinkActivate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("willLinkActivate")(js.undefined)
        ret
    }
  }
  
}

