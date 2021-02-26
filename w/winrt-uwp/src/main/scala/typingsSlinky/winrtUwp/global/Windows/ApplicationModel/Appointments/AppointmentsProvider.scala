package typingsSlinky.winrtUwp.global.Windows.ApplicationModel.Appointments

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Defines operations classes for add appointment and remove appointment requests through activations that an appointments provider interacts with. */
object AppointmentsProvider {
  
  /** Represents the operation object associated with adding a new appointment. Appointments provider apps use this info to perform the operation. */
  @JSGlobal("Windows.ApplicationModel.Appointments.AppointmentsProvider.AddAppointmentOperation")
  @js.native
  abstract class AddAppointmentOperation ()
    extends typingsSlinky.winrtUwp.Windows.ApplicationModel.Appointments.AppointmentsProvider.AddAppointmentOperation
  
  /** Represents the object associated with retrieving the operation of the appointments provider. */
  @JSGlobal("Windows.ApplicationModel.Appointments.AppointmentsProvider.AppointmentsProviderLaunchActionVerbs")
  @js.native
  abstract class AppointmentsProviderLaunchActionVerbs ()
    extends typingsSlinky.winrtUwp.Windows.ApplicationModel.Appointments.AppointmentsProvider.AppointmentsProviderLaunchActionVerbs
  object AppointmentsProviderLaunchActionVerbs {
    
    @JSGlobal("Windows.ApplicationModel.Appointments.AppointmentsProvider.AppointmentsProviderLaunchActionVerbs")
    @js.native
    val ^ : js.Any = js.native
    
    /** Gets the add-appointment action that the appointments provider performs. */
    /* static member */
    @JSGlobal("Windows.ApplicationModel.Appointments.AppointmentsProvider.AppointmentsProviderLaunchActionVerbs.addAppointment")
    @js.native
    def addAppointment: String = js.native
    @scala.inline
    def addAppointment_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("addAppointment")(x.asInstanceOf[js.Any])
    
    /** Gets the remove-appointment action that the appointments provider performs. */
    /* static member */
    @JSGlobal("Windows.ApplicationModel.Appointments.AppointmentsProvider.AppointmentsProviderLaunchActionVerbs.removeAppointment")
    @js.native
    def removeAppointment: String = js.native
    @scala.inline
    def removeAppointment_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("removeAppointment")(x.asInstanceOf[js.Any])
    
    /** Gets the replace-appointment action that the appointments provider performs. */
    /* static member */
    @JSGlobal("Windows.ApplicationModel.Appointments.AppointmentsProvider.AppointmentsProviderLaunchActionVerbs.replaceAppointment")
    @js.native
    def replaceAppointment: String = js.native
    @scala.inline
    def replaceAppointment_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("replaceAppointment")(x.asInstanceOf[js.Any])
    
    /** Gets the show-appointment-details action that the appointments provider performs. */
    /* static member */
    @JSGlobal("Windows.ApplicationModel.Appointments.AppointmentsProvider.AppointmentsProviderLaunchActionVerbs.showAppointmentDetails")
    @js.native
    def showAppointmentDetails: String = js.native
    @scala.inline
    def showAppointmentDetails_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("showAppointmentDetails")(x.asInstanceOf[js.Any])
    
    /** Gets the show-time-frame action of an appointment that the appointments provider performs. */
    /* static member */
    @JSGlobal("Windows.ApplicationModel.Appointments.AppointmentsProvider.AppointmentsProviderLaunchActionVerbs.showTimeFrame")
    @js.native
    def showTimeFrame: String = js.native
    @scala.inline
    def showTimeFrame_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("showTimeFrame")(x.asInstanceOf[js.Any])
  }
  
  /** Represents the operation object associated with removing an appointment. Appointments provider apps use this info to perform the operation. */
  @JSGlobal("Windows.ApplicationModel.Appointments.AppointmentsProvider.RemoveAppointmentOperation")
  @js.native
  abstract class RemoveAppointmentOperation ()
    extends typingsSlinky.winrtUwp.Windows.ApplicationModel.Appointments.AppointmentsProvider.RemoveAppointmentOperation
  
  /** Represents the operation object associated with replacing an appointment. Appointments provider apps use this info to perform the operation. */
  @JSGlobal("Windows.ApplicationModel.Appointments.AppointmentsProvider.ReplaceAppointmentOperation")
  @js.native
  abstract class ReplaceAppointmentOperation ()
    extends typingsSlinky.winrtUwp.Windows.ApplicationModel.Appointments.AppointmentsProvider.ReplaceAppointmentOperation
}
