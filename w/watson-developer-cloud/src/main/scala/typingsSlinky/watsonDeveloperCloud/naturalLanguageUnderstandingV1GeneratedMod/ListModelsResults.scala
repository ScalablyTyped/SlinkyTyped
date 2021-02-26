package typingsSlinky.watsonDeveloperCloud.naturalLanguageUnderstandingV1GeneratedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Custom models that are available for entities and relations. */
@js.native
trait ListModelsResults extends StObject {
  
  /** An array of available models. */
  var models: js.UndefOr[js.Array[Model]] = js.native
}
object ListModelsResults {
  
  @scala.inline
  def apply(): ListModelsResults = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListModelsResults]
  }
  
  @scala.inline
  implicit class ListModelsResultsMutableBuilder[Self <: ListModelsResults] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setModels(value: js.Array[Model]): Self = StObject.set(x, "models", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModelsUndefined: Self = StObject.set(x, "models", js.undefined)
    
    @scala.inline
    def setModelsVarargs(value: Model*): Self = StObject.set(x, "models", js.Array(value :_*))
  }
}
