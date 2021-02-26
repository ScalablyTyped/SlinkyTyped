package typingsSlinky.tizenCommonWeb.systeminfoMod

import typingsSlinky.tizenCommonWeb.tizenCommonWebStrings.NORMAL
import typingsSlinky.tizenCommonWeb.tizenCommonWebStrings.WARNING
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SystemInfoMemory extends SystemInfoProperty {
  
  /**
    * Represents the low memory state.
    */
  val status: SystemInfoLowMemoryStatus | NORMAL | WARNING = js.native
}
object SystemInfoMemory {
  
  @scala.inline
  def apply(status: SystemInfoLowMemoryStatus | NORMAL | WARNING): SystemInfoMemory = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[SystemInfoMemory]
  }
  
  @scala.inline
  implicit class SystemInfoMemoryMutableBuilder[Self <: SystemInfoMemory] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStatus(value: SystemInfoLowMemoryStatus | NORMAL | WARNING): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
