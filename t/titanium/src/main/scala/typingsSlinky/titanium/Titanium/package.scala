package typingsSlinky.titanium

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object Titanium {
  type Android = typingsSlinky.titanium.Titanium.Android_
  type App = typingsSlinky.titanium.Titanium.App_
  /**
  	 * Fired by the system when the application is about to be terminated.
  	 */
  type AppCloseEvent = typingsSlinky.titanium.Titanium.AppBaseEvent
  /**
  	 * Fired when the app receives a warning from the operating system about low memory availability.
  	 */
  type AppMemorywarningEvent = typingsSlinky.titanium.Titanium.AppBaseEvent
  /**
  	 * Fired when the application transitions from active to inactive state on a multitasked system.
  	 */
  type AppPauseEvent = typingsSlinky.titanium.Titanium.AppBaseEvent
  /**
  	 * Fired when the application transitions to the background on a multitasked system.
  	 */
  type AppPausedEvent = typingsSlinky.titanium.Titanium.AppBaseEvent
  /**
  	 * Fired when the application returns to the foreground on a multitasked system.
  	 */
  type AppResumeEvent = typingsSlinky.titanium.Titanium.AppBaseEvent
  /**
  	 * Fired when the application returns to the foreground.
  	 */
  type AppResumedEvent = typingsSlinky.titanium.Titanium.AppBaseEvent
  /**
  	 * Fired when there is a significant change in the time.
  	 */
  type AppSignificanttimechangeEvent = typingsSlinky.titanium.Titanium.AppBaseEvent
  /**
  	 * Fired after the "app.js" or "alloy.js" gets executed during application startup.
  	 */
  type AppStartedEvent = typingsSlinky.titanium.Titanium.AppBaseEvent
  /**
  	 * Called whenever an interaction with the window occurred. To be used together with the <Titanium.App.trackUserInteraction> property.
  	 */
  type AppUserinteractionEvent = typingsSlinky.titanium.Titanium.AppBaseEvent
  /**
  	 * Fired when the database backing the EventKit module is modified.
  	 */
  type CalendarChangeEvent = typingsSlinky.titanium.Titanium.CalendarBaseEvent
  /**
  	 * Fired when the database backing the contacts module is modified externally.
  	 */
  type ContactsReloadEvent = typingsSlinky.titanium.Titanium.ContactsBaseEvent
  /**
  	 * Fired when the device detects interface and requires calibration.
  	 */
  type GeolocationCalibrationEvent = typingsSlinky.titanium.Titanium.GeolocationBaseEvent
  /**
  	 * Fired when location updates are paused by the OS.
  	 */
  type GeolocationLocationupdatepausedEvent = typingsSlinky.titanium.Titanium.GeolocationBaseEvent
  /**
  	 * Fired when location manager is resumed by the OS.
  	 */
  type GeolocationLocationupdateresumedEvent = typingsSlinky.titanium.Titanium.GeolocationBaseEvent
  /**
  	 * Fired when the device locale changes.
  	 */
  type LocaleChangeEvent = typingsSlinky.titanium.Titanium.LocaleBaseEvent
  type Media = typingsSlinky.titanium.Titanium.Media_
  /**
  	 * Fires when the camera overlay is ready to take pictures.
  	 */
  type MediaCamerareadyEvent = typingsSlinky.titanium.Titanium.MediaBaseEvent
  type Network = typingsSlinky.titanium.Titanium.Network_
  type UI = typingsSlinky.titanium.Titanium.UI_
}
