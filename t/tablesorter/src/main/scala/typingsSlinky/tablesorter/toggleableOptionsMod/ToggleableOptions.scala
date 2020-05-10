package typingsSlinky.tablesorter.toggleableOptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ToggleableOptions extends js.Object {
  /**
    * A value indicating whether to add a box for enabling/disabling the control.
    */
  var addToggle: js.UndefOr[Boolean] = js.native
  /**
    * A value indicating whether the control is initially disabled.
    */
  var disabled: js.UndefOr[Boolean] = js.native
}

object ToggleableOptions {
  @scala.inline
  def apply(): ToggleableOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ToggleableOptions]
  }
  @scala.inline
  implicit class ToggleableOptionsOps[Self <: ToggleableOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddToggle(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addToggle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAddToggle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addToggle")(js.undefined)
        ret
    }
    @scala.inline
    def withDisabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabled")(js.undefined)
        ret
    }
  }
  
}

