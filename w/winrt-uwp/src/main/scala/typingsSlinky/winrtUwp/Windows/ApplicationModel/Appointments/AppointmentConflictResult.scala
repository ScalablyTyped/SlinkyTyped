package typingsSlinky.winrtUwp.Windows.ApplicationModel.Appointments

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a conflict between appointments. */
@js.native
trait AppointmentConflictResult extends StObject {
  
  /** Gets the date of the appointment conflict. */
  var date: js.Date = js.native
  
  /** Gets a value indicating the type of appointment conflict. */
  var `type`: AppointmentConflictType = js.native
}
object AppointmentConflictResult {
  
  @scala.inline
  def apply(date: js.Date, `type`: AppointmentConflictType): AppointmentConflictResult = {
    val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppointmentConflictResult]
  }
  
  @scala.inline
  implicit class AppointmentConflictResultMutableBuilder[Self <: AppointmentConflictResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDate(value: js.Date): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: AppointmentConflictType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
