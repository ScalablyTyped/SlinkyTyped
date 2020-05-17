package typingsSlinky.scriptableIos

import typingsSlinky.scriptableIos.CalendarEvent.Attendees
import typingsSlinky.scriptableIos.scriptableIosStrings.busy
import typingsSlinky.scriptableIos.scriptableIosStrings.free
import typingsSlinky.scriptableIos.scriptableIosStrings.tentative
import typingsSlinky.scriptableIos.scriptableIosStrings.unavailable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * _Manages events in calendars._
  *
  * In order to add the event to your calendar, you must call the save() function.
  * @see https://docs.scriptable.app/calendarevent/#-new-calendarevent
  */
@js.native
trait CalendarEvent_ extends js.Object {
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
  /**
    * _Adds a recurrence rule._
    *
    * Recurrence rules specify when the reminder should be repeated. See the documentation of RecurrenceRule for more information on creating rules.
    * @param recurrenceRule - Recurrence rule to add to the reminder.
    * @see https://docs.scriptable.app/calendarevent/#-addrecurrencerule
    */
  def addRecurrenceRule(recurrenceRule: RecurrenceRule): Unit = js.native
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
}

object CalendarEvent_ {
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
  ): CalendarEvent_ = {
    val __obj = js.Dynamic.literal(addRecurrenceRule = js.Any.fromFunction1(addRecurrenceRule), attendees = attendees.asInstanceOf[js.Any], availability = availability.asInstanceOf[js.Any], calendar = calendar.asInstanceOf[js.Any], endDate = endDate.asInstanceOf[js.Any], identifier = identifier.asInstanceOf[js.Any], isAllDay = isAllDay.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], notes = notes.asInstanceOf[js.Any], presentEdit = js.Any.fromFunction0(presentEdit), remove = js.Any.fromFunction0(remove), removeAllRecurrenceRules = js.Any.fromFunction0(removeAllRecurrenceRules), save = js.Any.fromFunction0(save), startDate = startDate.asInstanceOf[js.Any], timeZone = timeZone.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[CalendarEvent_]
  }
  @scala.inline
  implicit class CalendarEvent_Ops[Self <: CalendarEvent_] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddRecurrenceRule(value: RecurrenceRule => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addRecurrenceRule")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withAttendees(value: js.Array[Attendees]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attendees")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAvailability(value: busy | free | tentative | unavailable): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("availability")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCalendar(value: Calendar): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("calendar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEndDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIdentifier(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("identifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsAllDay(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isAllDay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLocation(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("location")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNotes(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPresentEdit(value: () => js.Promise[CalendarEvent]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("presentEdit")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withRemove(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remove")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withRemoveAllRecurrenceRules(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeAllRecurrenceRules")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSave(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("save")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withStartDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTimeZone(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeZone")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

