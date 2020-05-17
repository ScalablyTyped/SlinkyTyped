package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Encapsulates a single performance metric that is part of the performance timeline. A performance entry can be directly created by making a performance mark or measure (for example by calling the mark() method) at an explicit point in an application. Performance entries are also created in indirect ways such as loading a resource (such as an image). */
@js.native
trait PerformanceEntry extends js.Object {
  val duration: Double = js.native
  val entryType: java.lang.String = js.native
  val name: java.lang.String = js.native
  val startTime: Double = js.native
  def toJSON(): js.Any = js.native
}

object PerformanceEntry {
  @scala.inline
  def apply(
    duration: Double,
    entryType: java.lang.String,
    name: java.lang.String,
    startTime: Double,
    toJSON: () => js.Any
  ): PerformanceEntry = {
    val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any], entryType = entryType.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], startTime = startTime.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON))
    __obj.asInstanceOf[PerformanceEntry]
  }
  @scala.inline
  implicit class PerformanceEntryOps[Self <: org.scalajs.dom.raw.PerformanceEntry] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDuration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("duration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEntryType(value: java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entryType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStartTime(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withToJSON(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toJSON")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

