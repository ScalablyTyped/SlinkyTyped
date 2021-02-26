package typingsSlinky.winrtUwp.Windows.ApplicationModel.VoiceCommands

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** The result obtained from the disambiguation screen displayed on the Cortana canvas. */
@js.native
trait VoiceCommandDisambiguationResult extends StObject {
  
  /** The item selected from the list of items displayed on the Cortana disambiguation screen. */
  var selectedItem: VoiceCommandContentTile = js.native
}
object VoiceCommandDisambiguationResult {
  
  @scala.inline
  def apply(selectedItem: VoiceCommandContentTile): VoiceCommandDisambiguationResult = {
    val __obj = js.Dynamic.literal(selectedItem = selectedItem.asInstanceOf[js.Any])
    __obj.asInstanceOf[VoiceCommandDisambiguationResult]
  }
  
  @scala.inline
  implicit class VoiceCommandDisambiguationResultMutableBuilder[Self <: VoiceCommandDisambiguationResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSelectedItem(value: VoiceCommandContentTile): Self = StObject.set(x, "selectedItem", value.asInstanceOf[js.Any])
  }
}
