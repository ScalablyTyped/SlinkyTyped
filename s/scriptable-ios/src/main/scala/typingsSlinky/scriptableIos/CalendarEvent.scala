package typingsSlinky.scriptableIos

import typingsSlinky.scriptableIos.CalendarEvent.Attendees
import typingsSlinky.scriptableIos.scriptableIosStrings.busy
import typingsSlinky.scriptableIos.scriptableIosStrings.free
import typingsSlinky.scriptableIos.scriptableIosStrings.tentative
import typingsSlinky.scriptableIos.scriptableIosStrings.unavailable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * _Manages events in calendars._
  *
  * In order to add the event to your calendar, you must call the save() function.
  * @see https://docs.scriptable.app/calendarevent/#-new-calendarevent
  */
@js.native
trait CalendarEvent extends StObject {
  
  /**
    * _Adds a recurrence rule._
    *
    * Recurrence rules specify when the event or reminder should be repeated. See the documentation of RecurrenceRule for more information on creating rules.
    * @param recurrenceRule - Recurrence rule to add to the reminder.
    * @see https://docs.scriptable.app/calendarevent/#-addrecurrencerule
    */
  def addRecurrenceRule(recurrenceRule: RecurrenceRule): Unit = js.native
  
  /**
    * _Attendees associated with the event._
    *
    * An array of objects on the following form:
    *
    *     {
    *       "isCurrentUser": false,
    *       "name": "John Appleseed",
    *       "status": "accepted",
    *       "type": "person",
    *       "role": "required"
    *     }
    *
    * Note that the property is read-only since iOS does not expose API to modify the attendees of an event.
    * @see https://docs.scriptable.app/calendarevent/#attendees
    */
  var attendees: js.Array[Attendees] = js.native
  
  /**
    * _Availability during the event._
    *
    * Indicates how the event should be treated for scheduling purposes. The following values are supported:
    *
    * *   busy
    * *   free
    * *   tentative
    * *   unavailable
    *
    * Be aware that not all calendars support all of these availabilities and some calendars may not support availability at all. Use `Calendar.supportsAvailability()` to check if a
    * calendar supports a specific availability.
    * @see https://docs.scriptable.app/calendarevent/#availability
    */
  var availability: busy | free | tentative | unavailable = js.native
  
  /**
    * _Calendar the event is stored in._
    * @see https://docs.scriptable.app/calendarevent/#calendar
    */
  var calendar: Calendar = js.native
  
  /**
    * _End date of event._
    * @see https://docs.scriptable.app/calendarevent/#enddate
    */
  var endDate: js.Date = js.native
  
  /**
    * _Identifier of event._
    * @see https://docs.scriptable.app/calendarevent/#identifier
    */
  var identifier: String = js.native
  
  /**
    * _Whether the event is an all-day event._
    * @see https://docs.scriptable.app/calendarevent/#isallday
    */
  var isAllDay: Boolean = js.native
  
  /**
    * _Location of event._
    * @see https://docs.scriptable.app/calendarevent/#location
    */
  var location: String = js.native
  
  /**
    * _Notes associated with event._
    * @see https://docs.scriptable.app/calendarevent/#notes
    */
  var notes: String = js.native
  
  /**
    * _Presents a view for editing the calendar event._
    *
    * The presented view supports editing various attributes of the event, including title, location, dates, recurrence and alerts.
    * @see https://docs.scriptable.app/calendarevent/#-presentedit
    */
  def presentEdit(): js.Promise[CalendarEvent] = js.native
  
  /**
    * _Removes event from calendar._
    * @see https://docs.scriptable.app/calendarevent/#-remove
    */
  def remove(): Unit = js.native
  
  /**
    * _Removes all recurrence rules._
    * @see https://docs.scriptable.app/calendarevent/#-removeallrecurrencerules
    */
  def removeAllRecurrenceRules(): Unit = js.native
  
  /**
    * _Saves event._
    *
    * Saves changes to an event, inserting it into the calendar if it is newly created.
    * @see https://docs.scriptable.app/calendarevent/#-save
    */
  def save(): Unit = js.native
  
  /**
    * _Start date of event._
    * @see https://docs.scriptable.app/calendarevent/#startdate
    */
  var startDate: js.Date = js.native
  
  /**
    * _Time zone of event._
    *
    * Geopolitical region identifier that identifies the time zone, e.g. "Europe/Copenhagen", "America/New\_York" and "Asia/Tokyo".
    * @see https://docs.scriptable.app/calendarevent/#timezone
    */
  var timeZone: String = js.native
  
  /**
    * _Title of event._
    * @see https://docs.scriptable.app/calendarevent/#title
    */
  var title: String = js.native
}
object CalendarEvent {
  
  @scala.inline
  def apply(
    addRecurrenceRule: RecurrenceRule => Unit,
    attendees: js.Array[Attendees],
    availability: busy | free | tentative | unavailable,
    calendar: Calendar,
    endDate: js.Date,
    identifier: String,
    isAllDay: Boolean,
    location: String,
    notes: String,
    presentEdit: () => js.Promise[CalendarEvent],
    remove: () => Unit,
    removeAllRecurrenceRules: () => Unit,
    save: () => Unit,
    startDate: js.Date,
    timeZone: String,
    title: String
  ): CalendarEvent = {
    val __obj = js.Dynamic.literal(addRecurrenceRule = js.Any.fromFunction1(addRecurrenceRule), attendees = attendees.asInstanceOf[js.Any], availability = availability.asInstanceOf[js.Any], calendar = calendar.asInstanceOf[js.Any], endDate = endDate.asInstanceOf[js.Any], identifier = identifier.asInstanceOf[js.Any], isAllDay = isAllDay.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], notes = notes.asInstanceOf[js.Any], presentEdit = js.Any.fromFunction0(presentEdit), remove = js.Any.fromFunction0(remove), removeAllRecurrenceRules = js.Any.fromFunction0(removeAllRecurrenceRules), save = js.Any.fromFunction0(save), startDate = startDate.asInstanceOf[js.Any], timeZone = timeZone.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[CalendarEvent]
  }
  
  @js.native
  trait Attendees extends StObject {
    
    var isCurrentUser: Boolean = js.native
    
    var name: String = js.native
    
    var role: String = js.native
    
    var status: String = js.native
    
    var `type`: String = js.native
  }
  object Attendees {
    
    @scala.inline
    def apply(isCurrentUser: Boolean, name: String, role: String, status: String, `type`: String): Attendees = {
      val __obj = js.Dynamic.literal(isCurrentUser = isCurrentUser.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], role = role.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Attendees]
    }
    
    @scala.inline
    implicit class AttendeesMutableBuilder[Self <: Attendees] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIsCurrentUser(value: Boolean): Self = StObject.set(x, "isCurrentUser", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @scala.inline
  implicit class CalendarEventMutableBuilder[Self <: CalendarEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddRecurrenceRule(value: RecurrenceRule => Unit): Self = StObject.set(x, "addRecurrenceRule", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAttendees(value: js.Array[Attendees]): Self = StObject.set(x, "attendees", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttendeesVarargs(value: Attendees*): Self = StObject.set(x, "attendees", js.Array(value :_*))
    
    @scala.inline
    def setAvailability(value: busy | free | tentative | unavailable): Self = StObject.set(x, "availability", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCalendar(value: Calendar): Self = StObject.set(x, "calendar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndDate(value: js.Date): Self = StObject.set(x, "endDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdentifier(value: String): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsAllDay(value: Boolean): Self = StObject.set(x, "isAllDay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocation(value: String): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotes(value: String): Self = StObject.set(x, "notes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPresentEdit(value: () => js.Promise[CalendarEvent]): Self = StObject.set(x, "presentEdit", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRemove(value: () => Unit): Self = StObject.set(x, "remove", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRemoveAllRecurrenceRules(value: () => Unit): Self = StObject.set(x, "removeAllRecurrenceRules", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSave(value: () => Unit): Self = StObject.set(x, "save", js.Any.fromFunction0(value))
    
    @scala.inline
    def setStartDate(value: js.Date): Self = StObject.set(x, "startDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeZone(value: String): Self = StObject.set(x, "timeZone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
  }
}
