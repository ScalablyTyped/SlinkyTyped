package typingsSlinky.titanium.Titanium.Calendar

import typingsSlinky.titanium.Titanium.Proxy
import typingsSlinky.titanium.Titanium.UI.TabGroup
import typingsSlinky.titanium.Titanium.UI.Window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * An object that represents a single alert for an event in an calendar.
		 */
trait Alert extends Proxy {
  /**
  			 * The absolute date for the alarm.
  			 */
  var absoluteDate: js.Date
  /**
  			 * Date/time at which this alert alarm is set to trigger.
  			 */
  val alarmTime: js.Date
  /**
  			 * Start date/time for the corresponding event.
  			 */
  val begin: js.Date
  /**
  			 * End date/time for the corresponding event.
  			 */
  val end: js.Date
  /**
  			 * Identifier of the event for which this alert is set.
  			 */
  val eventId: Double
  /**
  			 * Identifier of this alert.
  			 */
  val id: String
  /**
  			 * Reminder notice period in minutes, that determines how long prior to the event this alert
  			 * should trigger.
  			 */
  val minutes: Double
  /**
  			 * The offset from the start of an event, at which the alarm fires.
  			 */
  var relativeOffset: Double
  /**
  			 * The current state of the alert.
  			 */
  val state: Double
  /**
  			 * Gets the value of the <Titanium.Calendar.Alert.absoluteDate> property.
  			 */
  def getAbsoluteDate(): js.Date
  /**
  			 * Gets the value of the <Titanium.Calendar.Alert.alarmTime> property.
  			 */
  def getAlarmTime(): js.Date
  /**
  			 * Gets the value of the <Titanium.Calendar.Alert.begin> property.
  			 */
  def getBegin(): js.Date
  /**
  			 * Gets the value of the <Titanium.Calendar.Alert.end> property.
  			 */
  def getEnd(): js.Date
  /**
  			 * Gets the value of the <Titanium.Calendar.Alert.eventId> property.
  			 */
  def getEventId(): Double
  /**
  			 * Gets the value of the <Titanium.Calendar.Alert.id> property.
  			 */
  def getId(): String
  /**
  			 * Gets the value of the <Titanium.Calendar.Alert.minutes> property.
  			 */
  def getMinutes(): Double
  /**
  			 * Gets the value of the <Titanium.Calendar.Alert.relativeOffset> property.
  			 */
  def getRelativeOffset(): Double
  /**
  			 * Gets the value of the <Titanium.Calendar.Alert.state> property.
  			 */
  def getState(): Double
  /**
  			 * Sets the value of the <Titanium.Calendar.Alert.absoluteDate> property.
  			 */
  def setAbsoluteDate(absoluteDate: js.Date): Unit
  /**
  			 * Sets the value of the <Titanium.Calendar.Alert.relativeOffset> property.
  			 */
  def setRelativeOffset(relativeOffset: Double): Unit
}

object Alert {
  @scala.inline
  def apply(
    absoluteDate: js.Date,
    addEventListener: (String, js.Function1[/* param0 */ js.Any, _]) => Unit,
    alarmTime: js.Date,
    apiName: String,
    applyProperties: js.Any => Unit,
    begin: js.Date,
    bubbleParent: Boolean,
    end: js.Date,
    eventId: Double,
    fireEvent: (String, js.Any) => Unit,
    getAbsoluteDate: () => js.Date,
    getAlarmTime: () => js.Date,
    getApiName: () => String,
    getBegin: () => js.Date,
    getBubbleParent: () => Boolean,
    getEnd: () => js.Date,
    getEventId: () => Double,
    getId: () => String,
    getMinutes: () => Double,
    getRelativeOffset: () => Double,
    getState: () => Double,
    id: String,
    minutes: Double,
    relativeOffset: Double,
    removeEventListener: (String, js.Function1[/* param0 */ js.Any, _]) => Unit,
    setAbsoluteDate: js.Date => Unit,
    setBubbleParent: Boolean => Unit,
    setRelativeOffset: Double => Unit,
    state: Double,
    getLifecycleContainer: () => Window | TabGroup = null,
    lifecycleContainer: Window | TabGroup = null,
    setLifecycleContainer: (js.Function1[/* lifecycleContainer */ Window, Unit]) with (js.Function1[/* lifecycleContainer */ TabGroup, Unit]) = null
  ): Alert = {
    val __obj = js.Dynamic.literal(absoluteDate = absoluteDate.asInstanceOf[js.Any], addEventListener = js.Any.fromFunction2(addEventListener), alarmTime = alarmTime.asInstanceOf[js.Any], apiName = apiName.asInstanceOf[js.Any], applyProperties = js.Any.fromFunction1(applyProperties), begin = begin.asInstanceOf[js.Any], bubbleParent = bubbleParent.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], eventId = eventId.asInstanceOf[js.Any], fireEvent = js.Any.fromFunction2(fireEvent), getAbsoluteDate = js.Any.fromFunction0(getAbsoluteDate), getAlarmTime = js.Any.fromFunction0(getAlarmTime), getApiName = js.Any.fromFunction0(getApiName), getBegin = js.Any.fromFunction0(getBegin), getBubbleParent = js.Any.fromFunction0(getBubbleParent), getEnd = js.Any.fromFunction0(getEnd), getEventId = js.Any.fromFunction0(getEventId), getId = js.Any.fromFunction0(getId), getMinutes = js.Any.fromFunction0(getMinutes), getRelativeOffset = js.Any.fromFunction0(getRelativeOffset), getState = js.Any.fromFunction0(getState), id = id.asInstanceOf[js.Any], minutes = minutes.asInstanceOf[js.Any], relativeOffset = relativeOffset.asInstanceOf[js.Any], removeEventListener = js.Any.fromFunction2(removeEventListener), setAbsoluteDate = js.Any.fromFunction1(setAbsoluteDate), setBubbleParent = js.Any.fromFunction1(setBubbleParent), setRelativeOffset = js.Any.fromFunction1(setRelativeOffset), state = state.asInstanceOf[js.Any])
    if (getLifecycleContainer != null) __obj.updateDynamic("getLifecycleContainer")(js.Any.fromFunction0(getLifecycleContainer))
    if (lifecycleContainer != null) __obj.updateDynamic("lifecycleContainer")(lifecycleContainer.asInstanceOf[js.Any])
    if (setLifecycleContainer != null) __obj.updateDynamic("setLifecycleContainer")(setLifecycleContainer.asInstanceOf[js.Any])
    __obj.asInstanceOf[Alert]
  }
}

