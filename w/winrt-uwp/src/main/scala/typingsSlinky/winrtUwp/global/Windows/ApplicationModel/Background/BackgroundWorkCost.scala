package typingsSlinky.winrtUwp.global.Windows.ApplicationModel.Background

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Retrieves a hint about resource availability for background tasks. Background tasks can use this hint to decide how much work to do when they are activated. */
@JSGlobal("Windows.ApplicationModel.Background.BackgroundWorkCost")
@js.native
abstract class BackgroundWorkCost ()
  extends typingsSlinky.winrtUwp.Windows.ApplicationModel.Background.BackgroundWorkCost
/* static members */
@JSGlobal("Windows.ApplicationModel.Background.BackgroundWorkCost")
@js.native
object BackgroundWorkCost extends js.Object {
  
  /** Retrieves a hint about resource availability for background tasks. */
  var currentBackgroundWorkCost: typingsSlinky.winrtUwp.Windows.ApplicationModel.Background.BackgroundWorkCostValue = js.native
}
