package typingsSlinky.winrt.Windows.ApplicationModel.Background

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SystemTrigger extends ISystemTrigger
object SystemTrigger {
  
  @scala.inline
  def apply(oneShot: Boolean, triggerType: SystemTriggerType): SystemTrigger = {
    val __obj = js.Dynamic.literal(oneShot = oneShot.asInstanceOf[js.Any], triggerType = triggerType.asInstanceOf[js.Any])
    __obj.asInstanceOf[SystemTrigger]
  }
}
