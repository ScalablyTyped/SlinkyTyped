package typingsSlinky.typescript.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Diagnostic extends DiagnosticRelatedInformation {
  
  var relatedInformation: js.UndefOr[js.Array[DiagnosticRelatedInformation]] = js.native
  
  var reportsDeprecated: js.UndefOr[js.Object] = js.native
  
  /** May store more in future. For now, this will simply be `true` to indicate when a diagnostic is an unused-identifier diagnostic. */
  var reportsUnnecessary: js.UndefOr[js.Object] = js.native
  
  var source: js.UndefOr[java.lang.String] = js.native
}
object Diagnostic {
  
  @scala.inline
  def apply(category: DiagnosticCategory, code: Double, messageText: java.lang.String | DiagnosticMessageChain): Diagnostic = {
    val __obj = js.Dynamic.literal(category = category.asInstanceOf[js.Any], code = code.asInstanceOf[js.Any], messageText = messageText.asInstanceOf[js.Any])
    __obj.asInstanceOf[Diagnostic]
  }
  
  @scala.inline
  implicit class DiagnosticMutableBuilder[Self <: Diagnostic] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRelatedInformation(value: js.Array[DiagnosticRelatedInformation]): Self = StObject.set(x, "relatedInformation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRelatedInformationUndefined: Self = StObject.set(x, "relatedInformation", js.undefined)
    
    @scala.inline
    def setRelatedInformationVarargs(value: DiagnosticRelatedInformation*): Self = StObject.set(x, "relatedInformation", js.Array(value :_*))
    
    @scala.inline
    def setReportsDeprecated(value: js.Object): Self = StObject.set(x, "reportsDeprecated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReportsDeprecatedUndefined: Self = StObject.set(x, "reportsDeprecated", js.undefined)
    
    @scala.inline
    def setReportsUnnecessary(value: js.Object): Self = StObject.set(x, "reportsUnnecessary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReportsUnnecessaryUndefined: Self = StObject.set(x, "reportsUnnecessary", js.undefined)
    
    @scala.inline
    def setSource(value: java.lang.String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
  }
}
