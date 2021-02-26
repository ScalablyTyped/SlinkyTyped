package typingsSlinky.winrtUwp.Windows.ApplicationModel.Email

import typingsSlinky.winrtUwp.Windows.ApplicationModel.Appointments.AppointmentRecurrence
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents the information associated with a meeting. */
@js.native
trait EmailMeetingInfo extends StObject {
  
  /** Gets or sets a Boolean value indicating whether the proposal of a new time is allowed. */
  var allowNewTimeProposal: Boolean = js.native
  
  /** Gets or sets the start time for a meeting. */
  var appointmentOriginalStartTime: js.Date = js.native
  
  /** Gets or sets the server identifier for the appointment associated with an email message. */
  var appointmentRoamingId: String = js.native
  
  /** Gets or sets the duration of the meeting. */
  var duration: Double = js.native
  
  /** Gets or sets a Boolean value indicating whether the meeting is an all day event. */
  var isAllDay: Boolean = js.native
  
  /** Gets a Boolean value indicating if the meeting is reported as out of date by the server. */
  var isReportedOutOfDateByServer: Boolean = js.native
  
  /** Gets or sets a Boolean value indicating whether a response to the meeting request is required. */
  var isResponseRequested: Boolean = js.native
  
  /** Gets or sets the meeting location. */
  var location: String = js.native
  
  /** Gets or sets the proposed duration for the proposed meeting change. */
  var proposedDuration: Double = js.native
  
  /** Gets or sets the proposed start time for the proposed meeting change. */
  var proposedStartTime: js.Date = js.native
  
  /** Gets or sets the recurrence parameters. */
  var recurrence: AppointmentRecurrence = js.native
  
  /** Gets or sets the first instance of the recurrence pattern. */
  var recurrenceStartTime: js.Date = js.native
  
  /** Gets or sets the change number on the server that identifies the meeting email change number. */
  var remoteChangeNumber: Double = js.native
  
  /** Gets or sets the start time for the meeting. */
  var startTime: js.Date = js.native
}
object EmailMeetingInfo {
  
  @scala.inline
  def apply(
    allowNewTimeProposal: Boolean,
    appointmentOriginalStartTime: js.Date,
    appointmentRoamingId: String,
    duration: Double,
    isAllDay: Boolean,
    isReportedOutOfDateByServer: Boolean,
    isResponseRequested: Boolean,
    location: String,
    proposedDuration: Double,
    proposedStartTime: js.Date,
    recurrence: AppointmentRecurrence,
    recurrenceStartTime: js.Date,
    remoteChangeNumber: Double,
    startTime: js.Date
  ): EmailMeetingInfo = {
    val __obj = js.Dynamic.literal(allowNewTimeProposal = allowNewTimeProposal.asInstanceOf[js.Any], appointmentOriginalStartTime = appointmentOriginalStartTime.asInstanceOf[js.Any], appointmentRoamingId = appointmentRoamingId.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], isAllDay = isAllDay.asInstanceOf[js.Any], isReportedOutOfDateByServer = isReportedOutOfDateByServer.asInstanceOf[js.Any], isResponseRequested = isResponseRequested.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], proposedDuration = proposedDuration.asInstanceOf[js.Any], proposedStartTime = proposedStartTime.asInstanceOf[js.Any], recurrence = recurrence.asInstanceOf[js.Any], recurrenceStartTime = recurrenceStartTime.asInstanceOf[js.Any], remoteChangeNumber = remoteChangeNumber.asInstanceOf[js.Any], startTime = startTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[EmailMeetingInfo]
  }
  
  @scala.inline
  implicit class EmailMeetingInfoMutableBuilder[Self <: EmailMeetingInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllowNewTimeProposal(value: Boolean): Self = StObject.set(x, "allowNewTimeProposal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppointmentOriginalStartTime(value: js.Date): Self = StObject.set(x, "appointmentOriginalStartTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppointmentRoamingId(value: String): Self = StObject.set(x, "appointmentRoamingId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsAllDay(value: Boolean): Self = StObject.set(x, "isAllDay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsReportedOutOfDateByServer(value: Boolean): Self = StObject.set(x, "isReportedOutOfDateByServer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsResponseRequested(value: Boolean): Self = StObject.set(x, "isResponseRequested", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocation(value: String): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProposedDuration(value: Double): Self = StObject.set(x, "proposedDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProposedStartTime(value: js.Date): Self = StObject.set(x, "proposedStartTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecurrence(value: AppointmentRecurrence): Self = StObject.set(x, "recurrence", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecurrenceStartTime(value: js.Date): Self = StObject.set(x, "recurrenceStartTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemoteChangeNumber(value: Double): Self = StObject.set(x, "remoteChangeNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartTime(value: js.Date): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
  }
}
