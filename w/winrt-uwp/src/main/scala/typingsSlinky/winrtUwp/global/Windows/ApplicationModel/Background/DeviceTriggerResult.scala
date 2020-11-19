package typingsSlinky.winrtUwp.global.Windows.ApplicationModel.Background

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Indicates whether the device background task operation was allowed or denied, and if it was denied specifies the reason. */
@JSGlobal("Windows.ApplicationModel.Background.DeviceTriggerResult")
@js.native
object DeviceTriggerResult extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[
    typingsSlinky.winrtUwp.Windows.ApplicationModel.Background.DeviceTriggerResult with Double
  ] = js.native
  
  /* 0 */ val allowed: typingsSlinky.winrtUwp.Windows.ApplicationModel.Background.DeviceTriggerResult.allowed with Double = js.native
  
  /* 2 */ val deniedBySystem: typingsSlinky.winrtUwp.Windows.ApplicationModel.Background.DeviceTriggerResult.deniedBySystem with Double = js.native
  
  /* 1 */ val deniedByUser: typingsSlinky.winrtUwp.Windows.ApplicationModel.Background.DeviceTriggerResult.deniedByUser with Double = js.native
  
  /* 3 */ val lowBattery: typingsSlinky.winrtUwp.Windows.ApplicationModel.Background.DeviceTriggerResult.lowBattery with Double = js.native
}
