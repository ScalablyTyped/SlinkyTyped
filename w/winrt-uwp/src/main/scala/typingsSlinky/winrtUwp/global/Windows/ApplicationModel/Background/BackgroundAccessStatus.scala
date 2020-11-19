package typingsSlinky.winrtUwp.global.Windows.ApplicationModel.Background

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** On Windows, this enumeration specifies an app's ability to perform background activity and display a tile on the lock screen. For Windows Phone Store apps, it only indicates an app's ability to perform background activity. */
@JSGlobal("Windows.ApplicationModel.Background.BackgroundAccessStatus")
@js.native
object BackgroundAccessStatus extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[
    typingsSlinky.winrtUwp.Windows.ApplicationModel.Background.BackgroundAccessStatus with Double
  ] = js.native
  
  /* 2 */ val allowedMayUseActiveRealTimeConnectivity: typingsSlinky.winrtUwp.Windows.ApplicationModel.Background.BackgroundAccessStatus.allowedMayUseActiveRealTimeConnectivity with Double = js.native
  
  /* 1 */ val allowedWithAlwaysOnRealTimeConnectivity: typingsSlinky.winrtUwp.Windows.ApplicationModel.Background.BackgroundAccessStatus.allowedWithAlwaysOnRealTimeConnectivity with Double = js.native
  
  /* 3 */ val denied: typingsSlinky.winrtUwp.Windows.ApplicationModel.Background.BackgroundAccessStatus.denied with Double = js.native
  
  /* 0 */ val unspecified: typingsSlinky.winrtUwp.Windows.ApplicationModel.Background.BackgroundAccessStatus.unspecified with Double = js.native
}
