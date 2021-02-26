package typingsSlinky.watsonDeveloperCloud.speechToTextV1GeneratedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** SpeechModels. */
@js.native
trait SpeechModels extends StObject {
  
  /** An array of `SpeechModel` objects that provides information about each available model. */
  var models: js.Array[SpeechModel] = js.native
}
object SpeechModels {
  
  @scala.inline
  def apply(models: js.Array[SpeechModel]): SpeechModels = {
    val __obj = js.Dynamic.literal(models = models.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpeechModels]
  }
  
  @scala.inline
  implicit class SpeechModelsMutableBuilder[Self <: SpeechModels] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setModels(value: js.Array[SpeechModel]): Self = StObject.set(x, "models", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModelsVarargs(value: SpeechModel*): Self = StObject.set(x, "models", js.Array(value :_*))
  }
}
