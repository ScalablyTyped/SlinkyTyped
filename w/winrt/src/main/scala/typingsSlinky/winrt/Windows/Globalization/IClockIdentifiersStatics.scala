package typingsSlinky.winrt.Windows.Globalization

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IClockIdentifiersStatics extends js.Object {
  var twelveHour: String = js.native
  var twentyFourHour: String = js.native
}

object IClockIdentifiersStatics {
  @scala.inline
  def apply(twelveHour: String, twentyFourHour: String): IClockIdentifiersStatics = {
    val __obj = js.Dynamic.literal(twelveHour = twelveHour.asInstanceOf[js.Any], twentyFourHour = twentyFourHour.asInstanceOf[js.Any])
    __obj.asInstanceOf[IClockIdentifiersStatics]
  }
  @scala.inline
  implicit class IClockIdentifiersStaticsOps[Self <: IClockIdentifiersStatics] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTwelveHour(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("twelveHour")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTwentyFourHour(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("twentyFourHour")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

