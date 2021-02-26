package typingsSlinky.tizenCommonWeb.applicationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ApplicationBatteryUsage extends StObject {
  
  /**
    * An attribute storing ID of an application.
    */
  val appId: ApplicationId = js.native
  
  /**
    * An attribute which stores information about battery usage of an application with ApplicationId `appId`.
    * Battery usage is a ratio of battery consumption of the application with ApplicationId `appId` to the total battery consumption of all applications.
    * The attribute value scales from ***0*** to ***1***, the higher value, the more battery is consumed.
    */
  val batteryUsage: Double = js.native
}
object ApplicationBatteryUsage {
  
  @scala.inline
  def apply(appId: ApplicationId, batteryUsage: Double): ApplicationBatteryUsage = {
    val __obj = js.Dynamic.literal(appId = appId.asInstanceOf[js.Any], batteryUsage = batteryUsage.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationBatteryUsage]
  }
  
  @scala.inline
  implicit class ApplicationBatteryUsageMutableBuilder[Self <: ApplicationBatteryUsage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAppId(value: ApplicationId): Self = StObject.set(x, "appId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBatteryUsage(value: Double): Self = StObject.set(x, "batteryUsage", value.asInstanceOf[js.Any])
  }
}
