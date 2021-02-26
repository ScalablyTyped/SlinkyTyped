package typingsSlinky.vsoNodeApi.buildInterfacesMod

import typingsSlinky.vsoNodeApi.vssinterfacesMod.IdentityRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BuildSummary extends StObject {
  
  var build: XamlBuildReference = js.native
  
  var finishTime: js.Date = js.native
  
  var keepForever: Boolean = js.native
  
  var quality: String = js.native
  
  var reason: BuildReason = js.native
  
  var requestedFor: IdentityRef = js.native
  
  var startTime: js.Date = js.native
  
  var status: BuildStatus = js.native
}
object BuildSummary {
  
  @scala.inline
  def apply(
    build: XamlBuildReference,
    finishTime: js.Date,
    keepForever: Boolean,
    quality: String,
    reason: BuildReason,
    requestedFor: IdentityRef,
    startTime: js.Date,
    status: BuildStatus
  ): BuildSummary = {
    val __obj = js.Dynamic.literal(build = build.asInstanceOf[js.Any], finishTime = finishTime.asInstanceOf[js.Any], keepForever = keepForever.asInstanceOf[js.Any], quality = quality.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any], requestedFor = requestedFor.asInstanceOf[js.Any], startTime = startTime.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[BuildSummary]
  }
  
  @scala.inline
  implicit class BuildSummaryMutableBuilder[Self <: BuildSummary] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBuild(value: XamlBuildReference): Self = StObject.set(x, "build", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFinishTime(value: js.Date): Self = StObject.set(x, "finishTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeepForever(value: Boolean): Self = StObject.set(x, "keepForever", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuality(value: String): Self = StObject.set(x, "quality", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReason(value: BuildReason): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestedFor(value: IdentityRef): Self = StObject.set(x, "requestedFor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartTime(value: js.Date): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: BuildStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
