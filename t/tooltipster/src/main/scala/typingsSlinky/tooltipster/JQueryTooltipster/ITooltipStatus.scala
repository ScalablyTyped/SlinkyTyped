package typingsSlinky.tooltipster.JQueryTooltipster

import typingsSlinky.tooltipster.tooltipsterStrings.appearing
import typingsSlinky.tooltipster.tooltipsterStrings.closed
import typingsSlinky.tooltipster.tooltipsterStrings.disappearing
import typingsSlinky.tooltipster.tooltipsterStrings.stable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ITooltipStatus extends js.Object {
  /** if the tooltip has been destroyed */
  var destroyed: Boolean = js.native
  /** if the tooltip is scheduled for destruction (which means that the tooltip is currently closing and may not be reopened) */
  var destroying: Boolean = js.native
  /** if the tooltip is enabled */
  var enabled: Boolean = js.native
  /** if the tooltip is open (either appearing, stable or disappearing) */
  var open: Boolean = js.native
  /** the state equals one of these four values: */
  var state: appearing | stable | disappearing | closed = js.native
}

object ITooltipStatus {
  @scala.inline
  def apply(
    destroyed: Boolean,
    destroying: Boolean,
    enabled: Boolean,
    open: Boolean,
    state: appearing | stable | disappearing | closed
  ): ITooltipStatus = {
    val __obj = js.Dynamic.literal(destroyed = destroyed.asInstanceOf[js.Any], destroying = destroying.asInstanceOf[js.Any], enabled = enabled.asInstanceOf[js.Any], open = open.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITooltipStatus]
  }
  @scala.inline
  implicit class ITooltipStatusOps[Self <: ITooltipStatus] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDestroyed(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destroyed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDestroying(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destroying")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOpen(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("open")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withState(value: appearing | stable | disappearing | closed): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

