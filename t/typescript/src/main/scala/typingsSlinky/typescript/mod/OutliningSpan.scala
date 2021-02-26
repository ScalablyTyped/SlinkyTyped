package typingsSlinky.typescript.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OutliningSpan extends StObject {
  
  /**
    * Whether or not this region should be automatically collapsed when
    * the 'Collapse to Definitions' command is invoked.
    */
  var autoCollapse: Boolean = js.native
  
  /** The text to display in the editor for the collapsed region. */
  var bannerText: java.lang.String = js.native
  
  /** The span of the document to display when the user hovers over the collapsed span. */
  var hintSpan: TextSpan = js.native
  
  /**
    * Classification of the contents of the span
    */
  var kind: OutliningSpanKind = js.native
  
  /** The span of the document to actually collapse. */
  var textSpan: TextSpan = js.native
}
object OutliningSpan {
  
  @scala.inline
  def apply(
    autoCollapse: Boolean,
    bannerText: java.lang.String,
    hintSpan: TextSpan,
    kind: OutliningSpanKind,
    textSpan: TextSpan
  ): OutliningSpan = {
    val __obj = js.Dynamic.literal(autoCollapse = autoCollapse.asInstanceOf[js.Any], bannerText = bannerText.asInstanceOf[js.Any], hintSpan = hintSpan.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], textSpan = textSpan.asInstanceOf[js.Any])
    __obj.asInstanceOf[OutliningSpan]
  }
  
  @scala.inline
  implicit class OutliningSpanMutableBuilder[Self <: OutliningSpan] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutoCollapse(value: Boolean): Self = StObject.set(x, "autoCollapse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBannerText(value: java.lang.String): Self = StObject.set(x, "bannerText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHintSpan(value: TextSpan): Self = StObject.set(x, "hintSpan", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKind(value: OutliningSpanKind): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextSpan(value: TextSpan): Self = StObject.set(x, "textSpan", value.asInstanceOf[js.Any])
  }
}
