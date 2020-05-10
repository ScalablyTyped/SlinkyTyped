package typingsSlinky.senchaTouch.Ext

import typingsSlinky.senchaTouch.Ext.util.IGeolocation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IMap extends IContainer {
  /** [Config Option] (Ext.util.Geolocation) */
  var geo: js.UndefOr[IGeolocation] = js.native
  /** [Method] Returns the value of geo
  		* @returns Ext.util.Geolocation
  		*/
  var getGeo: js.UndefOr[js.Function0[IGeolocation]] = js.native
  /** [Method] Returns the value of map
  		* @returns google.maps.Map
  		*/
  var getMap: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns the value of mapListeners
  		* @returns Object
  		*/
  var getMapListeners: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns the state of the Map
  		* @returns Object mapOptions
  		*/
  var getState: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns the value of useCurrentLocation
  		* @returns Boolean/Ext.util.Geolocation
  		*/
  var getUseCurrentLocation: js.UndefOr[js.Function0[_]] = js.native
  /** [Config Option] (google.maps.Map) */
  var map: js.UndefOr[js.Any] = js.native
  /** [Config Option] (Object) */
  var mapListeners: js.UndefOr[js.Any] = js.native
  /** [Config Option] (Object) */
  var mapOptions: js.UndefOr[js.Any] = js.native
  /** [Config Option] (Boolean) */
  var maskMap: js.UndefOr[Boolean] = js.native
  /** [Config Option] (String) */
  var maskMapCls: js.UndefOr[java.lang.String] = js.native
  /** [Method] Sets the value of geo
  		* @param geo Ext.util.Geolocation The new value.
  		*/
  var setGeo: js.UndefOr[js.Function1[/* geo */ js.UndefOr[IGeolocation], Unit]] = js.native
  /** [Method] Sets the value of map
  		* @param map google.maps.Map The new value.
  		*/
  var setMap: js.UndefOr[js.Function1[/* map */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Moves the map center to the designated coordinates hash of the form  latitude 37 381592 longitude  122 135672
  		* @param coordinates Object/google.maps.LatLng Object representing the desired Latitude and longitude upon which to center the map.
  		*/
  var setMapCenter: js.UndefOr[js.Function1[/* coordinates */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Sets the value of mapListeners
  		* @param mapListeners Object The new value.
  		*/
  var setMapListeners: js.UndefOr[js.Function1[/* mapListeners */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Sets the value of mapOptions
  		* @param mapOptions Object The new value.
  		*/
  var setMapOptions: js.UndefOr[js.Function1[/* mapOptions */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Sets the value of useCurrentLocation
  		* @param useCurrentLocation Boolean/Ext.util.Geolocation The new value.
  		*/
  var setUseCurrentLocation: js.UndefOr[js.Function1[/* useCurrentLocation */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Moves the map center to the designated coordinates hash of the form  latitude 37 381592 longitude  122 135672
  		* @param coordinates Object/google.maps.LatLng Object representing the desired Latitude and longitude upon which to center the map.
  		*/
  @JSName("update")
  var update_IMap: js.UndefOr[js.Function1[/* coordinates */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Config Option] (Boolean/Ext.util.Geolocation) */
  var useCurrentLocation: js.UndefOr[js.Any] = js.native
}

object IMap {
  @scala.inline
  def apply(): IMap = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IMap]
  }
  @scala.inline
  implicit class IMapOps[Self <: IMap] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGeo(value: IGeolocation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("geo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGeo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("geo")(js.undefined)
        ret
    }
    @scala.inline
    def withGetGeo(value: () => IGeolocation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getGeo")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetGeo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getGeo")(js.undefined)
        ret
    }
    @scala.inline
    def withGetMap(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getMap")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetMap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getMap")(js.undefined)
        ret
    }
    @scala.inline
    def withGetMapListeners(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getMapListeners")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetMapListeners: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getMapListeners")(js.undefined)
        ret
    }
    @scala.inline
    def withGetState(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getState")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getState")(js.undefined)
        ret
    }
    @scala.inline
    def withGetUseCurrentLocation(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getUseCurrentLocation")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetUseCurrentLocation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getUseCurrentLocation")(js.undefined)
        ret
    }
    @scala.inline
    def withMap(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("map")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("map")(js.undefined)
        ret
    }
    @scala.inline
    def withMapListeners(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mapListeners")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMapListeners: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mapListeners")(js.undefined)
        ret
    }
    @scala.inline
    def withMapOptions(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mapOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMapOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mapOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withMaskMap(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maskMap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaskMap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maskMap")(js.undefined)
        ret
    }
    @scala.inline
    def withMaskMapCls(value: java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maskMapCls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaskMapCls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maskMapCls")(js.undefined)
        ret
    }
    @scala.inline
    def withSetGeo(value: /* geo */ js.UndefOr[IGeolocation] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setGeo")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetGeo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setGeo")(js.undefined)
        ret
    }
    @scala.inline
    def withSetMap(value: /* map */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setMap")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetMap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setMap")(js.undefined)
        ret
    }
    @scala.inline
    def withSetMapCenter(value: /* coordinates */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setMapCenter")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetMapCenter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setMapCenter")(js.undefined)
        ret
    }
    @scala.inline
    def withSetMapListeners(value: /* mapListeners */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setMapListeners")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetMapListeners: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setMapListeners")(js.undefined)
        ret
    }
    @scala.inline
    def withSetMapOptions(value: /* mapOptions */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setMapOptions")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetMapOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setMapOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withSetUseCurrentLocation(value: /* useCurrentLocation */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setUseCurrentLocation")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetUseCurrentLocation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setUseCurrentLocation")(js.undefined)
        ret
    }
    @scala.inline
    def withUpdate(value: /* coordinates */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutUpdate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.undefined)
        ret
    }
    @scala.inline
    def withUseCurrentLocation(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useCurrentLocation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseCurrentLocation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useCurrentLocation")(js.undefined)
        ret
    }
  }
  
}

