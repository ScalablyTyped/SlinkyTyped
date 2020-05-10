package typingsSlinky.timezonecomplete.parseMod

import typingsSlinky.timezonecomplete.basicsMod.TimeStruct
import typingsSlinky.timezonecomplete.timezoneMod.TimeZone
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AwareTimeStruct extends js.Object {
  /**
    * The time struct
    */
  var time: TimeStruct = js.native
  /**
    * The time zone (can be undefined)
    */
  var zone: js.UndefOr[TimeZone] = js.native
}

object AwareTimeStruct {
  @scala.inline
  def apply(time: TimeStruct): AwareTimeStruct = {
    val __obj = js.Dynamic.literal(time = time.asInstanceOf[js.Any])
    __obj.asInstanceOf[AwareTimeStruct]
  }
  @scala.inline
  implicit class AwareTimeStructOps[Self <: AwareTimeStruct] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTime(value: TimeStruct): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("time")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withZone(value: TimeZone): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zone")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZone: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zone")(js.undefined)
        ret
    }
  }
  
}

