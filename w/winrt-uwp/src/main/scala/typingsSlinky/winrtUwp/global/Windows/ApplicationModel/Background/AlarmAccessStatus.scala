package typingsSlinky.winrtUwp.global.Windows.ApplicationModel.Background

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Indicates whether the user has given permission for the app to set alarms. */
@JSGlobal("Windows.ApplicationModel.Background.AlarmAccessStatus")
@js.native
object AlarmAccessStatus extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[
    typingsSlinky.winrtUwp.Windows.ApplicationModel.Background.AlarmAccessStatus with Double
  ] = js.native
  
  /* 1 */ val allowedWithWakeupCapability: typingsSlinky.winrtUwp.Windows.ApplicationModel.Background.AlarmAccessStatus.allowedWithWakeupCapability with Double = js.native
  
  /* 2 */ val allowedWithoutWakeupCapability: typingsSlinky.winrtUwp.Windows.ApplicationModel.Background.AlarmAccessStatus.allowedWithoutWakeupCapability with Double = js.native
  
  /* 3 */ val denied: typingsSlinky.winrtUwp.Windows.ApplicationModel.Background.AlarmAccessStatus.denied with Double = js.native
  
  /* 0 */ val unspecified: typingsSlinky.winrtUwp.Windows.ApplicationModel.Background.AlarmAccessStatus.unspecified with Double = js.native
}
