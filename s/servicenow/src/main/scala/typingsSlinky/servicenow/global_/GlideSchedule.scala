package typingsSlinky.servicenow.global_

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("GlideSchedule")
@js.native
class GlideSchedule ()
  extends typingsSlinky.servicenow.GlideSchedule {
  def this(sysId: String, timeZone: String) = this()
  /* CompleteClass */
  override def add(startDate: typingsSlinky.servicenow.GlideDateTime, offset: typingsSlinky.servicenow.GlideDuration): typingsSlinky.servicenow.GlideDateTime = js.native
  /* CompleteClass */
  override def duration(startDate: typingsSlinky.servicenow.GlideDateTime, endDate: typingsSlinky.servicenow.GlideDateTime): typingsSlinky.servicenow.GlideDuration = js.native
  /* CompleteClass */
  override def getName(): String = js.native
  /* CompleteClass */
  override def isInSchedule(time: typingsSlinky.servicenow.GlideDateTime): String = js.native
  /* CompleteClass */
  override def isValid(): Boolean = js.native
  /* CompleteClass */
  override def load(sysId: String, timeZone: String, excludeSpanId: String): Unit = js.native
  /* CompleteClass */
  override def setTimeZone(tz: String): Unit = js.native
  /* CompleteClass */
  override def whenNext(time: typingsSlinky.servicenow.GlideDateTime, timeZone: String): Double = js.native
}

