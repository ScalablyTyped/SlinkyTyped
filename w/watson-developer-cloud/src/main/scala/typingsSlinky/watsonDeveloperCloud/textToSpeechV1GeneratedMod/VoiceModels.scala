package typingsSlinky.watsonDeveloperCloud.textToSpeechV1GeneratedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** VoiceModels. */
@js.native
trait VoiceModels extends StObject {
  
  /** An array of `VoiceModel` objects that provides information about each available custom voice model. The array is empty if the requesting service credentials own no custom voice models (if no language is specified) or own no custom voice models for the specified language. */
  var customizations: js.Array[VoiceModel] = js.native
}
object VoiceModels {
  
  @scala.inline
  def apply(customizations: js.Array[VoiceModel]): VoiceModels = {
    val __obj = js.Dynamic.literal(customizations = customizations.asInstanceOf[js.Any])
    __obj.asInstanceOf[VoiceModels]
  }
  
  @scala.inline
  implicit class VoiceModelsMutableBuilder[Self <: VoiceModels] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCustomizations(value: js.Array[VoiceModel]): Self = StObject.set(x, "customizations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomizationsVarargs(value: VoiceModel*): Self = StObject.set(x, "customizations", js.Array(value :_*))
  }
}
