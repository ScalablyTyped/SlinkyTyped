package typingsSlinky.winrtUwp.Windows.ApplicationModel.Appointments

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait AppointmentCalendarSyncStatus extends StObject
/** Specifies the current sync status of an AppointmentCalendar . */
@JSGlobal("Windows.ApplicationModel.Appointments.AppointmentCalendarSyncStatus")
@js.native
object AppointmentCalendarSyncStatus extends StObject {
  
  /** An authentication error occurred when trying to connect to the server. */
  @js.native
  sealed trait authenticationError extends AppointmentCalendarSyncStatus
  
  /** There is no sync operation currently occurring. */
  @js.native
  sealed trait idle extends AppointmentCalendarSyncStatus
  
  /** The account must be manually removed. */
  @js.native
  sealed trait manualAccountRemovalRequired extends AppointmentCalendarSyncStatus
  
  /** A policy error occurred. */
  @js.native
  sealed trait policyError extends AppointmentCalendarSyncStatus
  
  /** A sync operation is in progress. */
  @js.native
  sealed trait syncing extends AppointmentCalendarSyncStatus
  
  /** An unknown error occurred. */
  @js.native
  sealed trait unknownError extends AppointmentCalendarSyncStatus
  
  /** The local machine and server are up to date. */
  @js.native
  sealed trait upToDate extends AppointmentCalendarSyncStatus
}
