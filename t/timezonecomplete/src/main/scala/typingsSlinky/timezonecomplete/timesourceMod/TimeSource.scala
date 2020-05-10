package typingsSlinky.timezonecomplete.timesourceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TimeSource extends js.Object {
  /**
    * Return the current date+time as a javascript Date object
    * @throws nothing
    */
  def now(): js.Date = js.native
}

object TimeSource {
  @scala.inline
  def apply(now: () => js.Date): TimeSource = {
    val __obj = js.Dynamic.literal(now = js.Any.fromFunction0(now))
    __obj.asInstanceOf[TimeSource]
  }
  @scala.inline
  implicit class TimeSourceOps[Self <: TimeSource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNow(value: () => js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("now")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

