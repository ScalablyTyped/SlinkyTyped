package typingsSlinky.tablesorter.rangeOptionsMod

import typingsSlinky.tablesorter.intervalOptionsMod.IntervalOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RangeOptions extends IntervalOptions {
  /**
    * The text indicating the whole range.
    */
  var allText: js.UndefOr[String] = js.native
}

object RangeOptions {
  @scala.inline
  def apply(): RangeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RangeOptions]
  }
  @scala.inline
  implicit class RangeOptionsOps[Self <: RangeOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allText")(js.undefined)
        ret
    }
  }
  
}

