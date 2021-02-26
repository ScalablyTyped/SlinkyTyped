package typingsSlinky.tizenCommonWeb.applicationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ApplicationUsage extends StObject {
  
  /**
    * An attribute to store the ID of an application.
    */
  val appId: ApplicationId = js.native
  
  /**
    * An attribute to store the last time when the application was used.
    */
  val lastTime: js.Date = js.native
  
  /**
    * An attribute to store the total number of times the application was in the foreground.
    */
  val totalCount: Double = js.native
  
  /**
    * An attribute to store the total time of application usage in seconds.
    */
  val totalDuration: Double = js.native
}
object ApplicationUsage {
  
  @scala.inline
  def apply(appId: ApplicationId, lastTime: js.Date, totalCount: Double, totalDuration: Double): ApplicationUsage = {
    val __obj = js.Dynamic.literal(appId = appId.asInstanceOf[js.Any], lastTime = lastTime.asInstanceOf[js.Any], totalCount = totalCount.asInstanceOf[js.Any], totalDuration = totalDuration.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationUsage]
  }
  
  @scala.inline
  implicit class ApplicationUsageMutableBuilder[Self <: ApplicationUsage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAppId(value: ApplicationId): Self = StObject.set(x, "appId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastTime(value: js.Date): Self = StObject.set(x, "lastTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalCount(value: Double): Self = StObject.set(x, "totalCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalDuration(value: Double): Self = StObject.set(x, "totalDuration", value.asInstanceOf[js.Any])
  }
}
