package typingsSlinky.titanium.Titanium.UI

import typingsSlinky.titanium.Font
import typingsSlinky.titanium.titaniumStrings.change
import typingsSlinky.titanium.titaniumStrings.click
import typingsSlinky.titanium.titaniumStrings.dblclick
import typingsSlinky.titanium.titaniumStrings.doubletap
import typingsSlinky.titanium.titaniumStrings.focus
import typingsSlinky.titanium.titaniumStrings.keypressed
import typingsSlinky.titanium.titaniumStrings.longclick
import typingsSlinky.titanium.titaniumStrings.longpress
import typingsSlinky.titanium.titaniumStrings.pinch
import typingsSlinky.titanium.titaniumStrings.postlayout
import typingsSlinky.titanium.titaniumStrings.singletap
import typingsSlinky.titanium.titaniumStrings.swipe
import typingsSlinky.titanium.titaniumStrings.touchcancel
import typingsSlinky.titanium.titaniumStrings.touchend
import typingsSlinky.titanium.titaniumStrings.touchmove
import typingsSlinky.titanium.titaniumStrings.touchstart
import typingsSlinky.titanium.titaniumStrings.twofingertap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A control used to select one or more fixed values.
  */
@js.native
trait Picker extends View {
  
  def add(data: PickerColumn): Unit = js.native
  def add(data: PickerRow): Unit = js.native
  
  /**
    * Adds the specified callback as an event listener for the named event.
    */
  @JSName("addEventListener")
  def addEventListener_change(
    name: change,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ PickerChangeEvent, Unit]
  ): Unit = js.native
  
  /**
    * Determines whether the calenderView is visible.
    */
  var calendarViewShown: Boolean = js.native
  
  /**
    * Columns used for this picker, as an array of <Titanium.UI.PickerColumn> objects.
    */
  var columns: js.Array[PickerColumn] = js.native
  
  /**
    * Duration in milliseconds used for a Countdown Timer picker.
    */
  var countDownDuration: Double = js.native
  
  /**
    * Sets the text color of date- and time-pickers.
    */
  var dateTimeColor: String = js.native
  
  /**
    * Fires a synthesized event to any registered listeners.
    */
  @JSName("fireEvent")
  def fireEvent_change(name: change): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_change(name: change, event: PickerChangeEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_click(name: click, event: PickerClickEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_dblclick(name: dblclick, event: PickerDblclickEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_doubletap(name: doubletap, event: PickerDoubletapEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_focus(name: focus, event: PickerFocusEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_keypressed(name: keypressed, event: PickerKeypressedEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_longclick(name: longclick, event: PickerLongclickEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_longpress(name: longpress, event: PickerLongpressEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_pinch(name: pinch, event: PickerPinchEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_postlayout(name: postlayout, event: PickerPostlayoutEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_singletap(name: singletap, event: PickerSingletapEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_swipe(name: swipe, event: PickerSwipeEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_touchcancel(name: touchcancel, event: PickerTouchcancelEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_touchend(name: touchend, event: PickerTouchendEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_touchmove(name: touchmove, event: PickerTouchmoveEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_touchstart(name: touchstart, event: PickerTouchstartEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_twofingertap(name: twofingertap, event: PickerTwofingertapEvent): Unit = js.native
  
  /**
    * Font to use for text.
    */
  var font: Font = js.native
  
  /**
    * Determines whether the Time pickers display in 24-hour or 12-hour clock format.
    */
  var format24: Boolean = js.native
  
  /**
    * Gets the value of the <Titanium.UI.Picker.calendarViewShown> property.
    * @deprecated Access <Titanium.UI.Picker.calendarViewShown> instead.
    */
  def getCalendarViewShown(): Boolean = js.native
  
  /**
    * Gets the value of the <Titanium.UI.Picker.columns> property.
    * @deprecated Access <Titanium.UI.Picker.columns> instead.
    */
  def getColumns(): js.Array[PickerColumn] = js.native
  
  /**
    * Gets the value of the <Titanium.UI.Picker.countDownDuration> property.
    * @deprecated Access <Titanium.UI.Picker.countDownDuration> instead.
    */
  def getCountDownDuration(): Double = js.native
  
  /**
    * Gets the value of the <Titanium.UI.Picker.dateTimeColor> property.
    * @deprecated Access <Titanium.UI.Picker.dateTimeColor> instead.
    */
  def getDateTimeColor(): String = js.native
  
  /**
    * Gets the value of the <Titanium.UI.Picker.font> property.
    * @deprecated Access <Titanium.UI.Picker.font> instead.
    */
  def getFont(): Font = js.native
  
  /**
    * Gets the value of the <Titanium.UI.Picker.format24> property.
    * @deprecated Access <Titanium.UI.Picker.format24> instead.
    */
  def getFormat24(): Boolean = js.native
  
  /**
    * Gets the value of the <Titanium.UI.Picker.locale> property.
    * @deprecated Access <Titanium.UI.Picker.locale> instead.
    */
  def getLocale(): String = js.native
  
  /**
    * Gets the value of the <Titanium.UI.Picker.maxDate> property.
    * @deprecated Access <Titanium.UI.Picker.maxDate> instead.
    */
  def getMaxDate(): js.Date = js.native
  
  /**
    * Gets the value of the <Titanium.UI.Picker.minDate> property.
    * @deprecated Access <Titanium.UI.Picker.minDate> instead.
    */
  def getMinDate(): js.Date = js.native
  
  /**
    * Gets the value of the <Titanium.UI.Picker.minuteInterval> property.
    * @deprecated Access <Titanium.UI.Picker.minuteInterval> instead.
    */
  def getMinuteInterval(): Double = js.native
  
  /**
    * Gets the value of the <Titanium.UI.Picker.nativeSpinner> property.
    * @deprecated Access <Titanium.UI.Picker.nativeSpinner> instead.
    */
  def getNativeSpinner(): Boolean = js.native
  
  /**
    * Gets the selected row for a column, or `null` if none exists.
    */
  def getSelectedRow(index: Double): PickerRow = js.native
  
  /**
    * Gets the value of the <Titanium.UI.Picker.selectionIndicator> property.
    * @deprecated Access <Titanium.UI.Picker.selectionIndicator> instead.
    */
  def getSelectionIndicator(): Boolean = js.native
  
  /**
    * Gets the value of the <Titanium.UI.Picker.selectionOpens> property.
    * @deprecated Access <Titanium.UI.Picker.selectionOpens> instead.
    */
  def getSelectionOpens(): Boolean = js.native
  
  /**
    * Gets the value of the <Titanium.UI.Picker.type> property.
    * @deprecated Access <Titanium.UI.Picker.type> instead.
    */
  def getType(): Double = js.native
  
  /**
    * Gets the value of the <Titanium.UI.Picker.useSpinner> property.
    * @deprecated This property is deprecated. Please use the default native "dropdown" style.
    */
  def getUseSpinner(): Boolean = js.native
  
  /**
    * Gets the value of the <Titanium.UI.Picker.value> property.
    * @deprecated Access <Titanium.UI.Picker.value> instead.
    */
  def getValue(): js.Date = js.native
  
  /**
    * Gets the value of the <Titanium.UI.Picker.visibleItems> property.
    * @deprecated Access <Titanium.UI.Picker.visibleItems> instead.
    */
  def getVisibleItems(): Double = js.native
  
  /**
    * Locale used when displaying Date and Time picker values.
    */
  var locale: String = js.native
  
  /**
    * Maximum date displayed when a Date picker is in use.
    */
  var maxDate: js.Date = js.native
  
  /**
    * Minimum date displayed when a Date picker is in use.
    */
  var minDate: js.Date = js.native
  
  /**
    * Interval in minutes displayed when one of the Time types of pickers is in use.
    */
  var minuteInterval: Double = js.native
  
  /**
    * Creates a native Android control for creating a Time Spinner with Type `Ti.UI.PICKER_TYPE_TIME`.
    * This is invoked rather than the default native "dropdown" style.
    */
  var nativeSpinner: Boolean = js.native
  
  /**
    * Repopulates values for a column.
    */
  def reloadColumn(column: PickerColumn): Unit = js.native
  
  /**
    * Removes the specified callback as an event listener for the named event.
    */
  @JSName("removeEventListener")
  def removeEventListener_change(
    name: change,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ PickerChangeEvent, Unit]
  ): Unit = js.native
  
  /**
    * Determines whether the visual selection indicator is shown.
    */
  var selectionIndicator: Boolean = js.native
  
  /**
    * Determines whether calling the method `setSelectedRow` opens when called
    */
  var selectionOpens: Boolean = js.native
  
  /**
    * Sets the value of the <Titanium.UI.Picker.calendarViewShown> property.
    * @deprecated Set the value using <Titanium.UI.Picker.calendarViewShown> instead.
    */
  def setCalendarViewShown(calendarViewShown: Boolean): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.UI.Picker.columns> property.
    * @deprecated Set the value using <Titanium.UI.Picker.columns> instead.
    */
  def setColumns(columns: js.Array[PickerColumn]): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.UI.Picker.countDownDuration> property.
    * @deprecated Set the value using <Titanium.UI.Picker.countDownDuration> instead.
    */
  def setCountDownDuration(countDownDuration: Double): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.UI.Picker.dateTimeColor> property.
    * @deprecated Set the value using <Titanium.UI.Picker.dateTimeColor> instead.
    */
  def setDateTimeColor(dateTimeColor: String): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.UI.Picker.font> property.
    * @deprecated Set the value using <Titanium.UI.Picker.font> instead.
    */
  def setFont(font: Font): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.UI.Picker.format24> property.
    * @deprecated Set the value using <Titanium.UI.Picker.format24> instead.
    */
  def setFormat24(format24: Boolean): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.UI.Picker.locale> property.
    * @deprecated Set the value using <Titanium.UI.Picker.locale> instead.
    */
  def setLocale(locale: String): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.UI.Picker.maxDate> property.
    * @deprecated Set the value using <Titanium.UI.Picker.maxDate> instead.
    */
  def setMaxDate(maxDate: js.Date): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.UI.Picker.minDate> property.
    * @deprecated Set the value using <Titanium.UI.Picker.minDate> instead.
    */
  def setMinDate(minDate: js.Date): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.UI.Picker.minuteInterval> property.
    * @deprecated Set the value using <Titanium.UI.Picker.minuteInterval> instead.
    */
  def setMinuteInterval(minuteInterval: Double): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.UI.Picker.nativeSpinner> property.
    * @deprecated Set the value using <Titanium.UI.Picker.nativeSpinner> instead.
    */
  def setNativeSpinner(nativeSpinner: Boolean): Unit = js.native
  
  /**
    * Selects a column's row.
    */
  def setSelectedRow(column: Double, row: Double): Unit = js.native
  def setSelectedRow(column: Double, row: Double, animated: Boolean): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.UI.Picker.selectionIndicator> property.
    * @deprecated Set the value using <Titanium.UI.Picker.selectionIndicator> instead.
    */
  def setSelectionIndicator(selectionIndicator: Boolean): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.UI.Picker.selectionOpens> property.
    * @deprecated Set the value using <Titanium.UI.Picker.selectionOpens> instead.
    */
  def setSelectionOpens(selectionOpens: Boolean): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.UI.Picker.type> property.
    * @deprecated Set the value using <Titanium.UI.Picker.type> instead.
    */
  def setType(`type`: Double): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.UI.Picker.useSpinner> property.
    * @deprecated This property is deprecated. Please use the default native "dropdown" style.
    */
  def setUseSpinner(useSpinner: Boolean): Unit = js.native
  
  /**
    * Sets the date and time value property for Date pickers.
    */
  def setValue(date: js.Any, suppressEvent: Boolean): PickerRow = js.native
  
  /**
    * Sets the value of the <Titanium.UI.Picker.visibleItems> property.
    * @deprecated Set the value using <Titanium.UI.Picker.visibleItems> instead.
    */
  def setVisibleItems(visibleItems: Double): Unit = js.native
  
  /**
    * Shows Date picker as a modal dialog.
    */
  def showDatePickerDialog(dictObj: js.Any): Unit = js.native
  
  /**
    * Shows Time picker as a modal dialog.
    */
  def showTimePickerDialog(dictObj: js.Any): Unit = js.native
  
  /**
    * Determines the type of picker displayed
    */
  var `type`: Double = js.native
  
  /**
    * Determines whether the non-native Android control, with a spinning wheel that looks and
    * behaves like the iOS picker, is invoked rather than the default native "dropdown" style.
    * @deprecated This property is deprecated. Please use the default native "dropdown" style.
    */
  var useSpinner: Boolean = js.native
  
  /**
    * Date and time value for Date and Time pickers.
    */
  var value: js.Date = js.native
  
  /**
    * Number of visible rows to display. This is only applicable to a plain picker and when the
    * `useSpinner` is `true`.
    */
  var visibleItems: Double = js.native
}
