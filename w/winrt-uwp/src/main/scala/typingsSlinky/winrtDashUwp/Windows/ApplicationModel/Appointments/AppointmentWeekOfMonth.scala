package typingsSlinky.winrtDashUwp.Windows.ApplicationModel.Appointments

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait AppointmentWeekOfMonth extends js.Object

/** Specifies the week of the month for which the appointment occurs. */
@JSGlobal("Windows.ApplicationModel.Appointments.AppointmentWeekOfMonth")
@js.native
object AppointmentWeekOfMonth extends js.Object {
  /** The appointment occurs on the first week of the month. */
  @js.native
  sealed trait first extends AppointmentWeekOfMonth
  
  /** The appointment occurs on the fourth week of the month. */
  @js.native
  sealed trait fourth extends AppointmentWeekOfMonth
  
  /** The appointment occurs on the last week of the month. */
  @js.native
  sealed trait last extends AppointmentWeekOfMonth
  
  /** The appointment occurs on the second week of the month. */
  @js.native
  sealed trait second extends AppointmentWeekOfMonth
  
  /** The appointment occurs on the third week of the month. */
  @js.native
  sealed trait third extends AppointmentWeekOfMonth
  
  /* 0 */ val first: typingsSlinky.winrtDashUwp.Windows.ApplicationModel.Appointments.AppointmentWeekOfMonth.first with Double = js.native
  /* 3 */ val fourth: typingsSlinky.winrtDashUwp.Windows.ApplicationModel.Appointments.AppointmentWeekOfMonth.fourth with Double = js.native
  /* 4 */ val last: typingsSlinky.winrtDashUwp.Windows.ApplicationModel.Appointments.AppointmentWeekOfMonth.last with Double = js.native
  /* 1 */ val second: typingsSlinky.winrtDashUwp.Windows.ApplicationModel.Appointments.AppointmentWeekOfMonth.second with Double = js.native
  /* 2 */ val third: typingsSlinky.winrtDashUwp.Windows.ApplicationModel.Appointments.AppointmentWeekOfMonth.third with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[AppointmentWeekOfMonth with Double] = js.native
}

