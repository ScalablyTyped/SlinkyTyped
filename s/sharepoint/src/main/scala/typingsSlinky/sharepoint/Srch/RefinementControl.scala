package typingsSlinky.sharepoint.Srch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RefinementControl extends StObject {
  
  var alternateRenderContext: js.Any = js.native
  
  var alternateRenderer: js.Any = js.native
  
  var containerId: String = js.native
  
  var countDisplay: String = js.native
  
  var deepHits: Double = js.native
  
  var overrideDisplayName: String = js.native
  
  var propertyName: String = js.native
  
  var renderTemplateId: String = js.native
  
  var spec: String = js.native
  
  var useDefaultDateIntervals: Boolean = js.native
}
object RefinementControl {
  
  @scala.inline
  def apply(
    alternateRenderContext: js.Any,
    alternateRenderer: js.Any,
    containerId: String,
    countDisplay: String,
    deepHits: Double,
    overrideDisplayName: String,
    propertyName: String,
    renderTemplateId: String,
    spec: String,
    useDefaultDateIntervals: Boolean
  ): RefinementControl = {
    val __obj = js.Dynamic.literal(alternateRenderContext = alternateRenderContext.asInstanceOf[js.Any], alternateRenderer = alternateRenderer.asInstanceOf[js.Any], containerId = containerId.asInstanceOf[js.Any], countDisplay = countDisplay.asInstanceOf[js.Any], deepHits = deepHits.asInstanceOf[js.Any], overrideDisplayName = overrideDisplayName.asInstanceOf[js.Any], propertyName = propertyName.asInstanceOf[js.Any], renderTemplateId = renderTemplateId.asInstanceOf[js.Any], spec = spec.asInstanceOf[js.Any], useDefaultDateIntervals = useDefaultDateIntervals.asInstanceOf[js.Any])
    __obj.asInstanceOf[RefinementControl]
  }
  
  @scala.inline
  implicit class RefinementControlMutableBuilder[Self <: RefinementControl] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlternateRenderContext(value: js.Any): Self = StObject.set(x, "alternateRenderContext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlternateRenderer(value: js.Any): Self = StObject.set(x, "alternateRenderer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainerId(value: String): Self = StObject.set(x, "containerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCountDisplay(value: String): Self = StObject.set(x, "countDisplay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeepHits(value: Double): Self = StObject.set(x, "deepHits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverrideDisplayName(value: String): Self = StObject.set(x, "overrideDisplayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPropertyName(value: String): Self = StObject.set(x, "propertyName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRenderTemplateId(value: String): Self = StObject.set(x, "renderTemplateId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpec(value: String): Self = StObject.set(x, "spec", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseDefaultDateIntervals(value: Boolean): Self = StObject.set(x, "useDefaultDateIntervals", value.asInstanceOf[js.Any])
  }
}
