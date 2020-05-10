package typingsSlinky.winrt.Windows.Globalization

import typingsSlinky.winrt.Windows.Foundation.Collections.IIterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICalendarFactory extends js.Object {
  def createCalendar(languages: IIterable[String], calendar: String, clock: String): Calendar = js.native
  def createCalendarDefaultCalendarAndClock(languages: IIterable[String]): Calendar = js.native
}

object ICalendarFactory {
  @scala.inline
  def apply(
    createCalendar: (IIterable[String], String, String) => Calendar,
    createCalendarDefaultCalendarAndClock: IIterable[String] => Calendar
  ): ICalendarFactory = {
    val __obj = js.Dynamic.literal(createCalendar = js.Any.fromFunction3(createCalendar), createCalendarDefaultCalendarAndClock = js.Any.fromFunction1(createCalendarDefaultCalendarAndClock))
    __obj.asInstanceOf[ICalendarFactory]
  }
  @scala.inline
  implicit class ICalendarFactoryOps[Self <: ICalendarFactory] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreateCalendar(value: (IIterable[String], String, String) => Calendar): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createCalendar")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withCreateCalendarDefaultCalendarAndClock(value: IIterable[String] => Calendar): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createCalendarDefaultCalendarAndClock")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

