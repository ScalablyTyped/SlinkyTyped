package typingsSlinky.winrt.Windows.Networking.Connectivity

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IDataPlanUsage extends StObject {
  
  var lastSyncTime: js.Date = js.native
  
  var megabytesUsed: Double = js.native
}
object IDataPlanUsage {
  
  @scala.inline
  def apply(lastSyncTime: js.Date, megabytesUsed: Double): IDataPlanUsage = {
    val __obj = js.Dynamic.literal(lastSyncTime = lastSyncTime.asInstanceOf[js.Any], megabytesUsed = megabytesUsed.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDataPlanUsage]
  }
  
  @scala.inline
  implicit class IDataPlanUsageMutableBuilder[Self <: IDataPlanUsage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLastSyncTime(value: js.Date): Self = StObject.set(x, "lastSyncTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMegabytesUsed(value: Double): Self = StObject.set(x, "megabytesUsed", value.asInstanceOf[js.Any])
  }
}
