package typingsSlinky.sharepoint.global.SP

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.DateTimeUtil")
@js.native
object DateTimeUtil extends js.Object {
  @js.native
  class SimpleDate protected ()
    extends typingsSlinky.sharepoint.SP.DateTimeUtil.SimpleDate {
    def this(year: Double, month: Double, day: Double, era: Double) = this()
  }
  
  /* static members */
  @js.native
  object SimpleDate extends js.Object {
    def dateEquals(
      date1: typingsSlinky.sharepoint.SP.DateTimeUtil.SimpleDate,
      date2: typingsSlinky.sharepoint.SP.DateTimeUtil.SimpleDate
    ): Boolean = js.native
    def dateGreater(
      date1: typingsSlinky.sharepoint.SP.DateTimeUtil.SimpleDate,
      date2: typingsSlinky.sharepoint.SP.DateTimeUtil.SimpleDate
    ): Boolean = js.native
    def dateGreaterEqual(
      date1: typingsSlinky.sharepoint.SP.DateTimeUtil.SimpleDate,
      date2: typingsSlinky.sharepoint.SP.DateTimeUtil.SimpleDate
    ): Boolean = js.native
    def dateLess(
      date1: typingsSlinky.sharepoint.SP.DateTimeUtil.SimpleDate,
      date2: typingsSlinky.sharepoint.SP.DateTimeUtil.SimpleDate
    ): Boolean = js.native
    def dateLessEqual(
      date1: typingsSlinky.sharepoint.SP.DateTimeUtil.SimpleDate,
      date2: typingsSlinky.sharepoint.SP.DateTimeUtil.SimpleDate
    ): Boolean = js.native
  }
  
}

