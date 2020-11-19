package typingsSlinky.titanium

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object Titanium {
  
  /**
    * The top-level API module, containing methods to output messages to the system log.
    */
  type API = typingsSlinky.titanium.Titanium.Module
  
  /**
    * The top-level Accelerometer module, used to determine the device's physical position.
    */
  type Accelerometer = typingsSlinky.titanium.Titanium.Module
  
  /**
    * Used for transmitting developer-defined Analytics events to the Appcelerator Analytics product.
    */
  type Analytics = typingsSlinky.titanium.Titanium.Module
  
  /**
    * The top-level Android module.
    */
  type Android = typingsSlinky.titanium.Titanium.Module
  
  /**
    * The top-level App module is mainly used for accessing information about the
    * application at runtime, and for sending or listening for system events.
    */
  type App = typingsSlinky.titanium.Titanium.Module
  
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
    * The Calendar module provides an API for accessing the native calendar functionality.
    */
  type Calendar = typingsSlinky.titanium.Titanium.Module
  
  /**
    * Fired when the database backing the EventKit module is modified.
    */
  type CalendarChangeEvent = typingsSlinky.titanium.Titanium.CalendarBaseEvent
  
  /**
    * A module for translating between primitive types and raw byte streams.
    */
  type Codec = typingsSlinky.titanium.Titanium.Module
  
  /**
    * The top-level Contacts module, used for accessing and modifying the system contacts address book.
    */
  type Contacts = typingsSlinky.titanium.Titanium.Module
  
  /**
    * Fired when the database backing the contacts module is modified externally.
    */
  type ContactsReloadEvent = typingsSlinky.titanium.Titanium.ContactsBaseEvent
  
  /**
    * The top-level `Database` module, used for creating and accessing the
    * in-application SQLite database.
    */
  type Database = typingsSlinky.titanium.Titanium.Module
  
  /**
    * The top level filesystem module, used to access files and directories on the device.
    */
  type Filesystem = typingsSlinky.titanium.Titanium.Module
  
  /**
    * The top level Geolocation module. The Geolocation module is used for accessing device location based information.
    */
  type Geolocation = typingsSlinky.titanium.Titanium.Module
  
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
    * The Gesture module is responsible for high-level device gestures such as orientation changes
    * and shake gestures.
    */
  type Gesture = typingsSlinky.titanium.Titanium.Module
  
  /**
    * The top level Locale module.
    */
  type Locale = typingsSlinky.titanium.Titanium.Module
  
  /**
    * Fired when the device locale changes.
    */
  type LocaleChangeEvent = typingsSlinky.titanium.Titanium.LocaleBaseEvent
  
  /**
    * The top-level Media module.
    */
  type Media = typingsSlinky.titanium.Titanium.Module
  
  /**
    * Fires when the camera overlay is ready to take pictures.
    */
  type MediaCamerareadyEvent = typingsSlinky.titanium.Titanium.MediaBaseEvent
  
  /**
    * Base type for all Titanium modules.
    */
  type Module = typingsSlinky.titanium.Titanium.Proxy
  
  /**
    * The top level network module.
    */
  type Network = typingsSlinky.titanium.Titanium.Module
  
  /**
    * The top-level Platform module.  The Platform module is used to access the device's platform-related
    * functionality.
    */
  type Platform = typingsSlinky.titanium.Titanium.Module
  
  /**
    * Stream module containing stream utility methods.
    */
  type Stream = typingsSlinky.titanium.Titanium.Module
  
  /**
    * The main <Titanium.UI> module.
    */
  type UI = typingsSlinky.titanium.Titanium.Module
  
  /**
    * The top-level Utils module, containing a set of JavaScript methods that are often useful when
    * building applications.
    */
  type Utils = typingsSlinky.titanium.Titanium.Module
  
  /**
    * Used to enable data and file transfers between a watchOS and iOS application.
    */
  type WatchSession = typingsSlinky.titanium.Titanium.Module
  
  /**
    * The top level XML module.  The XML module is used for parsing and processing XML-based content.
    */
  type XML = typingsSlinky.titanium.Titanium.Module
}
