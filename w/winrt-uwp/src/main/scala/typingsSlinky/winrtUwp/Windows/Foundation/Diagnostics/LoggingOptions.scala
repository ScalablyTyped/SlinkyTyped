package typingsSlinky.winrtUwp.Windows.Foundation.Diagnostics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents advanced event settings. */
@js.native
trait LoggingOptions extends js.Object {
  /** Gets or sets the unique identifier associated with an activity. */
  var activityId: String = js.native
  /** Gets or sets the keyword value that represents the different categories that an event belongs to. */
  var keywords: Double = js.native
  /** Gets or sets the operation code value for an event. */
  var opcode: LoggingOpcode = js.native
  /** Gets or sets a value that uniquely identifies the parent activity to which this activity is related. */
  var relatedActivityId: String = js.native
  /** Gets or sets the user-defined metadata value attached to an event. */
  var tags: Double = js.native
  /** Gets or sets the user-defined value that identifies a larger unit of work within an application or component. */
  var task: Double = js.native
}

object LoggingOptions {
  @scala.inline
  def apply(
    activityId: String,
    keywords: Double,
    opcode: LoggingOpcode,
    relatedActivityId: String,
    tags: Double,
    task: Double
  ): LoggingOptions = {
    val __obj = js.Dynamic.literal(activityId = activityId.asInstanceOf[js.Any], keywords = keywords.asInstanceOf[js.Any], opcode = opcode.asInstanceOf[js.Any], relatedActivityId = relatedActivityId.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any], task = task.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoggingOptions]
  }
  @scala.inline
  implicit class LoggingOptionsOps[Self <: LoggingOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActivityId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activityId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKeywords(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keywords")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOpcode(value: LoggingOpcode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("opcode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRelatedActivityId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("relatedActivityId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTags(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTask(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("task")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

