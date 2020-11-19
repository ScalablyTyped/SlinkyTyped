package typingsSlinky.winrtUwp.global.Windows.Devices.Geolocation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Indicates if your app has permission to access location data. */
@JSGlobal("Windows.Devices.Geolocation.GeolocationAccessStatus")
@js.native
object GeolocationAccessStatus extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[
    typingsSlinky.winrtUwp.Windows.Devices.Geolocation.GeolocationAccessStatus with Double
  ] = js.native
  
  /* 1 */ val allowed: typingsSlinky.winrtUwp.Windows.Devices.Geolocation.GeolocationAccessStatus.allowed with Double = js.native
  
  /* 2 */ val denied: typingsSlinky.winrtUwp.Windows.Devices.Geolocation.GeolocationAccessStatus.denied with Double = js.native
  
  /* 0 */ val unspecified: typingsSlinky.winrtUwp.Windows.Devices.Geolocation.GeolocationAccessStatus.unspecified with Double = js.native
}
