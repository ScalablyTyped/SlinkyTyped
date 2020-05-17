package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Used to represent a set of time ranges, primarily for the purpose of tracking which portions of media have been buffered when loading it for use by the <audio> and <video> elements. */
@js.native
trait TimeRanges extends js.Object {
  val length: Double = js.native
  def end(index: Double): Double = js.native
  def start(index: Double): Double = js.native
}

object TimeRanges {
  @scala.inline
  def apply(end: Double => Double, length: Double, start: Double => Double): TimeRanges = {
    val __obj = js.Dynamic.literal(end = js.Any.fromFunction1(end), length = length.asInstanceOf[js.Any], start = js.Any.fromFunction1(start))
    __obj.asInstanceOf[TimeRanges]
  }
  @scala.inline
  implicit class TimeRangesOps[Self <: org.scalajs.dom.raw.TimeRanges] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEnd(value: Double => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("end")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withLength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("length")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStart(value: Double => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

