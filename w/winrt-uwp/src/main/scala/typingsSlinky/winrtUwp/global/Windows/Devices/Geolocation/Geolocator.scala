package typingsSlinky.winrtUwp.global.Windows.Devices.Geolocation

import typingsSlinky.winrtUwp.Windows.Foundation.Collections.IVectorView
import typingsSlinky.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides access to the current geographic location. */
@JSGlobal("Windows.Devices.Geolocation.Geolocator")
@js.native
/** Initializes a new Geolocator object. */
class Geolocator ()
  extends typingsSlinky.winrtUwp.Windows.Devices.Geolocation.Geolocator

/* static members */
@JSGlobal("Windows.Devices.Geolocation.Geolocator")
@js.native
object Geolocator extends js.Object {
  /**
    * Starts an asynchronous operation to retrieve the location history of the device.
    * @param startTime Represents the beginning of the time span for which positions are to be returned.
    * @return Positions (of type Geoposition ) that were collected during the specified time span.
    */
  def getGeopositionHistoryAsync(startTime: js.Date): IPromiseWithIAsyncOperation[IVectorView[_]] = js.native
  /**
    * Starts an asynchronous operation to retrieve the location history of the device.
    * @param startTime Represents the beginning of the time span for which positions are to be returned.
    * @param duration Represents the length of time after startTime for which positions are to be returned.
    * @return Positions (of type Geoposition ) that were collected during the specified time span.
    */
  def getGeopositionHistoryAsync(startTime: js.Date, duration: Double): IPromiseWithIAsyncOperation[IVectorView[_]] = js.native
  /**
    * Requests permission to access location data.
    * @return A GeolocationAccessStatus that indicates if permission to location data has been granted.
    */
  def requestAccessAsync(): IPromiseWithIAsyncOperation[typingsSlinky.winrtUwp.Windows.Devices.Geolocation.GeolocationAccessStatus] = js.native
}

