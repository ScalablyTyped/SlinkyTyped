package typingsSlinky.tablesorter.delayableOptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DelayableOptions extends js.Object {
  /**
    * A value indicating whether the value of the filter should be set delayed.
    */
  var delayed: js.UndefOr[Boolean] = js.native
}

object DelayableOptions {
  @scala.inline
  def apply(): DelayableOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DelayableOptions]
  }
  @scala.inline
  implicit class DelayableOptionsOps[Self <: DelayableOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDelayed(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delayed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDelayed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delayed")(js.undefined)
        ret
    }
  }
  
}

