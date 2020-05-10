package typingsSlinky.ukCoWorkingedgePhonegapPluginLaunchnavigator.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LaunchNavigatorOptions extends js.Object {
  /**
    * name of the navigation app to use for directions.
    * Specify using launchnavigator.APP constants.
    * e.g. `launchnavigator.APP.GOOGLE_MAPS`.
    * If not specified, defaults to User Selection.
    */
  var app: js.UndefOr[String] = js.native
  /**
    * options related to the default native actionsheet picker which enables user to select which navigation app to launch if `app` is not specified.
    */
  var appSelection: js.UndefOr[AppSelectionOptions] = js.native
  /**
    * nickname to display in app for destination. e.g. "Bob's House".
    */
  var destinationName: js.UndefOr[String] = js.native
  /**
    * (Android and iOS only) If true, and input location type(s) doesn't match those required by the app, use geocoding to obtain the address/coords as required. Defaults to true.
    */
  var enableGeocoding: js.UndefOr[Boolean] = js.native
  /**
    * (Windows only) If false, the plugin will NOT attempt to use the geolocation plugin to determine the current device position when the start location parameter is omitted. Defaults to true.
    */
  var enableGeolocation: js.UndefOr[Boolean] = js.native
  /**
    * A callback to invoke if an error is encountered while launching the app.
    * A single string argument containing the error message will be passed in.
    */
  var errorCallback: js.UndefOr[js.Function1[/* error */ String, Unit]] = js.native
  /**
    * a key/value map of extra app-specific parameters. For example, to tell Google Maps on Android to display Satellite view in "maps" launch mode: `{"t": "k"}`
    */
  var extras: js.UndefOr[js.Any] = js.native
  /**
    * (iOS only) method to use to open Apple Maps app.
    * `launchnavigator.LAUNCH_MODE.URI_SCHEME` or `launchnavigator.LAUNCH_MODE.MAPKIT`
    * Defaults to `launchnavigator.LAUNCH_MODE.URI_SCHEME` if not specified.
    */
  var launchModeAppleMaps: js.UndefOr[String] = js.native
  /**
    * (Android only) mode in which to open Google Maps app.
    * `launchnavigator.LAUNCH_MODE.MAPS` or `launchnavigator.LAUNCH_MODE.TURN_BY_TURN`
    * Defaults to `launchnavigator.LAUNCH_MODE.MAPS` if not specified.
    */
  var launchModeGoogleMaps: js.UndefOr[String] = js.native
  /**
    * Start point of the navigation.
    * If not specified, the current device location will be used.
    * Either:
    *  - a {string} containing the address. e.g. "Buckingham Palace, London"
    *  - a {string} containing a latitude/longitude coordinate. e.g. "50.1. -4.0"
    *  - an {array}, where the first element is the latitude and the second element is a longitude, as decimal numbers. e.g. [50.1, -4.0]
    */
  var start: js.UndefOr[String | js.Array[Double]] = js.native
  /**
    * nickname to display in app for start . e.g. "My House".
    */
  var startName: js.UndefOr[String] = js.native
  /**
    * A callback to invoke when the navigation app is successfully launched.
    */
  var successCallback: js.UndefOr[js.Function] = js.native
  /**
    * Transportation mode for navigation: "driving", "walking" or "transit". Defaults to "driving" if not specified.
    */
  var transportMode: js.UndefOr[String] = js.native
}

object LaunchNavigatorOptions {
  @scala.inline
  def apply(): LaunchNavigatorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LaunchNavigatorOptions]
  }
  @scala.inline
  implicit class LaunchNavigatorOptionsOps[Self <: LaunchNavigatorOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApp(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("app")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("app")(js.undefined)
        ret
    }
    @scala.inline
    def withAppSelection(value: AppSelectionOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appSelection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAppSelection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appSelection")(js.undefined)
        ret
    }
    @scala.inline
    def withDestinationName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destinationName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDestinationName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destinationName")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableGeocoding(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableGeocoding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableGeocoding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableGeocoding")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableGeolocation(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableGeolocation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableGeolocation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableGeolocation")(js.undefined)
        ret
    }
    @scala.inline
    def withErrorCallback(value: /* error */ String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorCallback")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutErrorCallback: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorCallback")(js.undefined)
        ret
    }
    @scala.inline
    def withExtras(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extras")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExtras: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extras")(js.undefined)
        ret
    }
    @scala.inline
    def withLaunchModeAppleMaps(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("launchModeAppleMaps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLaunchModeAppleMaps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("launchModeAppleMaps")(js.undefined)
        ret
    }
    @scala.inline
    def withLaunchModeGoogleMaps(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("launchModeGoogleMaps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLaunchModeGoogleMaps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("launchModeGoogleMaps")(js.undefined)
        ret
    }
    @scala.inline
    def withStart(value: String | js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start")(js.undefined)
        ret
    }
    @scala.inline
    def withStartName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startName")(js.undefined)
        ret
    }
    @scala.inline
    def withSuccessCallback(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("successCallback")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSuccessCallback: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("successCallback")(js.undefined)
        ret
    }
    @scala.inline
    def withTransportMode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transportMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransportMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transportMode")(js.undefined)
        ret
    }
  }
  
}

