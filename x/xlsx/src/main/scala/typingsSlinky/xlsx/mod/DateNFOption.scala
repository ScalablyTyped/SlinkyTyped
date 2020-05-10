package typingsSlinky.xlsx.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DateNFOption extends js.Object {
  /** Use specified date format */
  var dateNF: js.UndefOr[NumberFormat] = js.native
}

object DateNFOption {
  @scala.inline
  def apply(): DateNFOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DateNFOption]
  }
  @scala.inline
  implicit class DateNFOptionOps[Self <: DateNFOption] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDateNF(value: NumberFormat): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dateNF")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDateNF: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dateNF")(js.undefined)
        ret
    }
  }
  
}

