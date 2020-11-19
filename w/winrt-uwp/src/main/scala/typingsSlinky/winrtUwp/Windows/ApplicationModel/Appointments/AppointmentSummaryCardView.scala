package typingsSlinky.winrtUwp.Windows.ApplicationModel.Appointments

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait AppointmentSummaryCardView extends js.Object
/** Specifies how the summary card for an appointment is displayed. */
@JSGlobal("Windows.ApplicationModel.Appointments.AppointmentSummaryCardView")
@js.native
object AppointmentSummaryCardView extends js.Object {
  
  /** The appointment summary card is displayed by the app that owns the appointment calendar. */
  @js.native
  sealed trait app extends AppointmentSummaryCardView
  
  /** The appointment summary card is displayed by the system. */
  @js.native
  sealed trait system extends AppointmentSummaryCardView
}
