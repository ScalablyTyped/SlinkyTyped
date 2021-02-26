package typingsSlinky.watsonDeveloperCloud.naturalLanguageUnderstandingV1GeneratedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** The extracted action from the sentence. */
@js.native
trait SemanticRolesResultAction extends StObject {
  
  /** normalized version of the action. */
  var normalized: js.UndefOr[String] = js.native
  
  /** Analyzed text that corresponds to the action. */
  var text: js.UndefOr[String] = js.native
  
  var verb: js.UndefOr[SemanticRolesVerb] = js.native
}
object SemanticRolesResultAction {
  
  @scala.inline
  def apply(): SemanticRolesResultAction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SemanticRolesResultAction]
  }
  
  @scala.inline
  implicit class SemanticRolesResultActionMutableBuilder[Self <: SemanticRolesResultAction] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNormalized(value: String): Self = StObject.set(x, "normalized", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNormalizedUndefined: Self = StObject.set(x, "normalized", js.undefined)
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    
    @scala.inline
    def setVerb(value: SemanticRolesVerb): Self = StObject.set(x, "verb", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVerbUndefined: Self = StObject.set(x, "verb", js.undefined)
  }
}
