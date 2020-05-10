package typingsSlinky.senchaTouch.Ext.util

import typingsSlinky.senchaTouch.Ext.IEvented
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IGeolocation extends IEvented {
  /** [Property] (Number) */
  var accuracy: js.UndefOr[Double] = js.native
  /** [Config Option] (Boolean) */
  var allowHighAccuracy: js.UndefOr[Boolean] = js.native
  /** [Property] (Number) */
  var altitude: js.UndefOr[Double] = js.native
  /** [Property] (Number) */
  var altitudeAccuracy: js.UndefOr[Double] = js.native
  /** [Config Option] (Boolean) */
  var autoUpdate: js.UndefOr[Boolean] = js.native
  /** [Config Option] (Number) */
  var frequency: js.UndefOr[Double] = js.native
  /** [Method] Returns the value of allowHighAccuracy
  		* @returns Boolean
  		*/
  var getAllowHighAccuracy: js.UndefOr[js.Function0[Boolean]] = js.native
  /** [Method] Returns the value of autoUpdate
  		* @returns Boolean
  		*/
  var getAutoUpdate: js.UndefOr[js.Function0[Boolean]] = js.native
  /** [Method] Returns the value of frequency
  		* @returns Number
  		*/
  var getFrequency: js.UndefOr[js.Function0[Double]] = js.native
  /** [Method] Returns the value of maximumAge
  		* @returns Number
  		*/
  var getMaximumAge: js.UndefOr[js.Function0[Double]] = js.native
  /** [Method] Returns the value of timeout
  		* @returns Number
  		*/
  var getTimeout: js.UndefOr[js.Function0[Double]] = js.native
  /** [Property] (Number) */
  var heading: js.UndefOr[Double] = js.native
  /** [Property] (Number) */
  var latitude: js.UndefOr[Double] = js.native
  /** [Property] (Number) */
  var longitude: js.UndefOr[Double] = js.native
  /** [Config Option] (Number) */
  var maximumAge: js.UndefOr[Double] = js.native
  /** [Method] Sets the value of allowHighAccuracy
  		* @param allowHighAccuracy Boolean The new value.
  		*/
  var setAllowHighAccuracy: js.UndefOr[js.Function1[/* allowHighAccuracy */ js.UndefOr[Boolean], Unit]] = js.native
  /** [Method] Sets the value of autoUpdate
  		* @param autoUpdate Boolean The new value.
  		*/
  var setAutoUpdate: js.UndefOr[js.Function1[/* autoUpdate */ js.UndefOr[Boolean], Unit]] = js.native
  /** [Method] Sets the value of frequency
  		* @param frequency Number The new value.
  		*/
  var setFrequency: js.UndefOr[js.Function1[/* frequency */ js.UndefOr[Double], Unit]] = js.native
  /** [Method] Sets the value of maximumAge
  		* @param maximumAge Number The new value.
  		*/
  var setMaximumAge: js.UndefOr[js.Function1[/* maximumAge */ js.UndefOr[Double], Unit]] = js.native
  /** [Method] Sets the value of timeout
  		* @param timeout Number The new value.
  		*/
  var setTimeout: js.UndefOr[js.Function1[/* timeout */ js.UndefOr[Double], Unit]] = js.native
  /** [Property] (Number) */
  var speed: js.UndefOr[Double] = js.native
  /** [Config Option] (Number) */
  var timeout: js.UndefOr[Double] = js.native
  /** [Property] (Date) */
  var timestamp: js.UndefOr[js.Any] = js.native
  /** [Method] Executes a onetime location update operation raising either a locationupdate or locationerror event
  		* @param callback Function A callback method to be called when the location retrieval has been completed. Will be called on both success and failure. The method will be passed one parameter, Ext.util.Geolocation (this reference), set to null on failure. geo.updateLocation(function (geo) {  alert('Latitude: ' + (geo !== null ? geo.latitude : 'failed')); });
  		* @param scope Object The scope (this reference) in which the handler function is executed. If omitted, defaults to the object which fired the event.
  		*/
  var updateLocation: js.UndefOr[
    js.Function2[/* callback */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], Unit]
  ] = js.native
}

object IGeolocation {
  @scala.inline
  def apply(): IGeolocation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IGeolocation]
  }
  @scala.inline
  implicit class IGeolocationOps[Self <: IGeolocation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccuracy(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accuracy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccuracy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accuracy")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowHighAccuracy(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowHighAccuracy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowHighAccuracy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowHighAccuracy")(js.undefined)
        ret
    }
    @scala.inline
    def withAltitude(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("altitude")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAltitude: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("altitude")(js.undefined)
        ret
    }
    @scala.inline
    def withAltitudeAccuracy(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("altitudeAccuracy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAltitudeAccuracy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("altitudeAccuracy")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoUpdate(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoUpdate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoUpdate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoUpdate")(js.undefined)
        ret
    }
    @scala.inline
    def withFrequency(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("frequency")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFrequency: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("frequency")(js.undefined)
        ret
    }
    @scala.inline
    def withGetAllowHighAccuracy(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAllowHighAccuracy")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetAllowHighAccuracy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAllowHighAccuracy")(js.undefined)
        ret
    }
    @scala.inline
    def withGetAutoUpdate(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAutoUpdate")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetAutoUpdate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAutoUpdate")(js.undefined)
        ret
    }
    @scala.inline
    def withGetFrequency(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getFrequency")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetFrequency: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getFrequency")(js.undefined)
        ret
    }
    @scala.inline
    def withGetMaximumAge(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getMaximumAge")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetMaximumAge: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getMaximumAge")(js.undefined)
        ret
    }
    @scala.inline
    def withGetTimeout(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getTimeout")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getTimeout")(js.undefined)
        ret
    }
    @scala.inline
    def withHeading(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("heading")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeading: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("heading")(js.undefined)
        ret
    }
    @scala.inline
    def withLatitude(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("latitude")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLatitude: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("latitude")(js.undefined)
        ret
    }
    @scala.inline
    def withLongitude(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("longitude")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLongitude: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("longitude")(js.undefined)
        ret
    }
    @scala.inline
    def withMaximumAge(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maximumAge")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaximumAge: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maximumAge")(js.undefined)
        ret
    }
    @scala.inline
    def withSetAllowHighAccuracy(value: /* allowHighAccuracy */ js.UndefOr[Boolean] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setAllowHighAccuracy")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetAllowHighAccuracy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setAllowHighAccuracy")(js.undefined)
        ret
    }
    @scala.inline
    def withSetAutoUpdate(value: /* autoUpdate */ js.UndefOr[Boolean] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setAutoUpdate")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetAutoUpdate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setAutoUpdate")(js.undefined)
        ret
    }
    @scala.inline
    def withSetFrequency(value: /* frequency */ js.UndefOr[Double] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setFrequency")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetFrequency: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setFrequency")(js.undefined)
        ret
    }
    @scala.inline
    def withSetMaximumAge(value: /* maximumAge */ js.UndefOr[Double] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setMaximumAge")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetMaximumAge: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setMaximumAge")(js.undefined)
        ret
    }
    @scala.inline
    def withSetTimeout(value: /* timeout */ js.UndefOr[Double] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setTimeout")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setTimeout")(js.undefined)
        ret
    }
    @scala.inline
    def withSpeed(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("speed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpeed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("speed")(js.undefined)
        ret
    }
    @scala.inline
    def withTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeout")(js.undefined)
        ret
    }
    @scala.inline
    def withTimestamp(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timestamp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimestamp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timestamp")(js.undefined)
        ret
    }
    @scala.inline
    def withUpdateLocation(value: (/* callback */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateLocation")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutUpdateLocation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateLocation")(js.undefined)
        ret
    }
  }
  
}

