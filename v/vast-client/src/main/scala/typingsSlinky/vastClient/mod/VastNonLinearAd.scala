package typingsSlinky.vastClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VastNonLinearAd extends StObject {
  
  var adParameters: String | Null = js.native
  
  var apiFramework: String = js.native
  
  var expandedHeight: String = js.native
  
  var expandedWidth: String = js.native
  
  var height: String = js.native
  
  var htmlResource: String | Null = js.native
  
  var id: String | Null = js.native
  
  var iframeResource: String | Null = js.native
  
  var maintainAspectRatio: Boolean = js.native
  
  var minSuggestedDuration: Double = js.native
  
  var nonLinearClickThroughURLTemplate: String | Null = js.native
  
  var nonLinearClickTrackingURLTemplates: js.Array[String] = js.native
  
  var scalable: Boolean = js.native
  
  var staticResource: String | Null = js.native
  
  var `type`: String | Null = js.native
  
  var width: String = js.native
}
object VastNonLinearAd {
  
  @scala.inline
  def apply(
    apiFramework: String,
    expandedHeight: String,
    expandedWidth: String,
    height: String,
    maintainAspectRatio: Boolean,
    minSuggestedDuration: Double,
    nonLinearClickTrackingURLTemplates: js.Array[String],
    scalable: Boolean,
    width: String
  ): VastNonLinearAd = {
    val __obj = js.Dynamic.literal(apiFramework = apiFramework.asInstanceOf[js.Any], expandedHeight = expandedHeight.asInstanceOf[js.Any], expandedWidth = expandedWidth.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], maintainAspectRatio = maintainAspectRatio.asInstanceOf[js.Any], minSuggestedDuration = minSuggestedDuration.asInstanceOf[js.Any], nonLinearClickTrackingURLTemplates = nonLinearClickTrackingURLTemplates.asInstanceOf[js.Any], scalable = scalable.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[VastNonLinearAd]
  }
  
  @scala.inline
  implicit class VastNonLinearAdMutableBuilder[Self <: VastNonLinearAd] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdParameters(value: String): Self = StObject.set(x, "adParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdParametersNull: Self = StObject.set(x, "adParameters", null)
    
    @scala.inline
    def setApiFramework(value: String): Self = StObject.set(x, "apiFramework", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpandedHeight(value: String): Self = StObject.set(x, "expandedHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpandedWidth(value: String): Self = StObject.set(x, "expandedWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeight(value: String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHtmlResource(value: String): Self = StObject.set(x, "htmlResource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHtmlResourceNull: Self = StObject.set(x, "htmlResource", null)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdNull: Self = StObject.set(x, "id", null)
    
    @scala.inline
    def setIframeResource(value: String): Self = StObject.set(x, "iframeResource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIframeResourceNull: Self = StObject.set(x, "iframeResource", null)
    
    @scala.inline
    def setMaintainAspectRatio(value: Boolean): Self = StObject.set(x, "maintainAspectRatio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinSuggestedDuration(value: Double): Self = StObject.set(x, "minSuggestedDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNonLinearClickThroughURLTemplate(value: String): Self = StObject.set(x, "nonLinearClickThroughURLTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNonLinearClickThroughURLTemplateNull: Self = StObject.set(x, "nonLinearClickThroughURLTemplate", null)
    
    @scala.inline
    def setNonLinearClickTrackingURLTemplates(value: js.Array[String]): Self = StObject.set(x, "nonLinearClickTrackingURLTemplates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNonLinearClickTrackingURLTemplatesVarargs(value: String*): Self = StObject.set(x, "nonLinearClickTrackingURLTemplates", js.Array(value :_*))
    
    @scala.inline
    def setScalable(value: Boolean): Self = StObject.set(x, "scalable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStaticResource(value: String): Self = StObject.set(x, "staticResource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStaticResourceNull: Self = StObject.set(x, "staticResource", null)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeNull: Self = StObject.set(x, "type", null)
    
    @scala.inline
    def setWidth(value: String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
