package typingsSlinky.tablesorter.comparableOptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ComparableOptions extends js.Object {
  /**
    * The compare-operators supported by the control.
    */
  var compare: js.UndefOr[String | js.Array[String]] = js.native
}

object ComparableOptions {
  @scala.inline
  def apply(): ComparableOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ComparableOptions]
  }
  @scala.inline
  implicit class ComparableOptionsOps[Self <: ComparableOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCompare(value: String | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compare")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCompare: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compare")(js.undefined)
        ret
    }
  }
  
}

