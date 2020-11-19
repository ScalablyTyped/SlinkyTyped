package typingsSlinky.winrtUwp.Windows.Devices.Geolocation

import typingsSlinky.winrtUwp.Windows.Foundation.EventHandler
import typingsSlinky.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typingsSlinky.winrtUwp.Windows.Foundation.TypedEventHandler
import typingsSlinky.winrtUwp.Windows.WinRTEvent
import typingsSlinky.winrtUwp.winrtUwpStrings.positionchanged
import typingsSlinky.winrtUwp.winrtUwpStrings.statuschanged
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides access to the current geographic location. */
@js.native
trait Geolocator extends js.Object {
  
  def addEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_positionchanged(`type`: positionchanged, listener: TypedEventHandler[Geolocator, PositionChangedEventArgs]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_statuschanged(`type`: statuschanged, listener: TypedEventHandler[Geolocator, StatusChangedEventArgs]): Unit = js.native
  
  /** The accuracy level at which the Geolocator provides location updates. */
  var desiredAccuracy: PositionAccuracy = js.native
  
  /** Gets or sets the desired accuracy in meters for data returned from the location service. */
  var desiredAccuracyInMeters: Double = js.native
  
  /**
    * Starts an asynchronous operation to retrieve the current location of the device.
    * @return Provides methods for starting the asynchronous request for location data and handling its completion.
    */
  def getGeopositionAsync(): IPromiseWithIAsyncOperation[Geoposition] = js.native
  /**
    * Starts an asynchronous operation to retrieve the current location of the device.
    * @param maximumAge The maximum acceptable age of cached location data. A TimeSpan is a time period expressed in 100-nanosecond units.
    * @param timeout The timeout. A TimeSpan is a time period expressed in 100-nanosecond units.
    * @return Provides methods for starting the asynchronous request for location data and handling its completion.
    */
  def getGeopositionAsync(maximumAge: Double, timeout: Double): IPromiseWithIAsyncOperation[Geoposition] = js.native
  
  /** The status that indicates the ability of the Geolocator to provide location updates. */
  var locationStatus: PositionStatus = js.native
  
  /** Gets and sets the distance of movement, in meters, relative to the coordinate from the last PositionChanged event, that is required for the Geolocator to raise a PositionChanged event. */
  var movementThreshold: Double = js.native
  
  /** Raised when the location is updated. */
  def onpositionchanged(ev: PositionChangedEventArgs with WinRTEvent[Geolocator]): Unit = js.native
  /** Raised when the location is updated. */
  @JSName("onpositionchanged")
  var onpositionchanged_Original: TypedEventHandler[Geolocator, PositionChangedEventArgs] = js.native
  
  /** Raised when the ability of the Geolocator to provide updated location changes. */
  def onstatuschanged(ev: StatusChangedEventArgs with WinRTEvent[Geolocator]): Unit = js.native
  /** Raised when the ability of the Geolocator to provide updated location changes. */
  @JSName("onstatuschanged")
  var onstatuschanged_Original: TypedEventHandler[Geolocator, StatusChangedEventArgs] = js.native
  
  def removeEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_positionchanged(`type`: positionchanged, listener: TypedEventHandler[Geolocator, PositionChangedEventArgs]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_statuschanged(`type`: statuschanged, listener: TypedEventHandler[Geolocator, StatusChangedEventArgs]): Unit = js.native
  
  /** The requested minimum time interval between location updates, in milliseconds. If your application requires updates infrequently, set this value so that location services can conserve power by calculating location only when needed. */
  var reportInterval: Double = js.native
}
