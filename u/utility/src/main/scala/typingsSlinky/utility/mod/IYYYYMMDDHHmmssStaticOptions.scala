package typingsSlinky.utility.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * ----------------0_0-----------------
  * @description Defines For Date
  * @see https://github.com/node-modules/utility#date-utils
  * ---------------0^0------------------
  */
@js.native
trait IYYYYMMDDHHmmssStaticOptions extends js.Object {
  var dateSep: js.UndefOr[String] = js.native
  var timeSep: js.UndefOr[String] = js.native
}

object IYYYYMMDDHHmmssStaticOptions {
  @scala.inline
  def apply(): IYYYYMMDDHHmmssStaticOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IYYYYMMDDHHmmssStaticOptions]
  }
  @scala.inline
  implicit class IYYYYMMDDHHmmssStaticOptionsOps[Self <: IYYYYMMDDHHmmssStaticOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDateSep(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dateSep")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDateSep: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dateSep")(js.undefined)
        ret
    }
    @scala.inline
    def withTimeSep(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeSep")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeSep: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeSep")(js.undefined)
        ret
    }
  }
  
}

