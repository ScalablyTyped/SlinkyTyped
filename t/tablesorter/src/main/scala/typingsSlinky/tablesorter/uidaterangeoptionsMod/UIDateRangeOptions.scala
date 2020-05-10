package typingsSlinky.tablesorter.uidaterangeoptionsMod

import typingsSlinky.jqueryui.JQueryUI.DatepickerOptions
import typingsSlinky.tablesorter.dateOptionsMod.DateOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UIDateRangeOptions
  extends DatepickerOptions
     with DateOptions {
  /**
    * The default `from`-value.
    */
  var from: js.UndefOr[js.Date] = js.native
  /**
    * The label of the "from"-input.
    */
  var textFrom: js.UndefOr[String] = js.native
  /**
    * The label of the "to"-input.
    */
  var textTo: js.UndefOr[String] = js.native
  /**
    * The default `to`-value.
    */
  var to: js.UndefOr[js.Date] = js.native
}

object UIDateRangeOptions {
  @scala.inline
  def apply(): UIDateRangeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UIDateRangeOptions]
  }
  @scala.inline
  implicit class UIDateRangeOptionsOps[Self <: UIDateRangeOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFrom(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("from")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFrom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("from")(js.undefined)
        ret
    }
    @scala.inline
    def withTextFrom(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textFrom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTextFrom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textFrom")(js.undefined)
        ret
    }
    @scala.inline
    def withTextTo(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textTo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTextTo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textTo")(js.undefined)
        ret
    }
    @scala.inline
    def withTo(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("to")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("to")(js.undefined)
        ret
    }
  }
  
}

