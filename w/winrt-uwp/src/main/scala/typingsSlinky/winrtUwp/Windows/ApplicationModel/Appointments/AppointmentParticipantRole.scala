package typingsSlinky.winrtUwp.Windows.ApplicationModel.Appointments

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait AppointmentParticipantRole extends StObject
/** Specifies the role of an item concerning an appointment invitation. */
@JSGlobal("Windows.ApplicationModel.Appointments.AppointmentParticipantRole")
@js.native
object AppointmentParticipantRole extends StObject {
  
  /** The participant's attendance at the appointment is optional. */
  @js.native
  sealed trait optionalAttendee extends AppointmentParticipantRole
  
  /** The participant's attendance at the appointment is required. */
  @js.native
  sealed trait requiredAttendee extends AppointmentParticipantRole
  
  /** The item is a resource that is needed at the appointment. */
  @js.native
  sealed trait resource extends AppointmentParticipantRole
}
