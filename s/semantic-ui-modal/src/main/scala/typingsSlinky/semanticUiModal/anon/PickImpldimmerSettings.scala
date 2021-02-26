package typingsSlinky.semanticUiModal.anon

import typingsSlinky.semanticUiDimmer.SemanticUI.DimmerSettings
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-modal.SemanticUI.ModalSettings._Impl, 'dimmerSettings'> */
@js.native
trait PickImpldimmerSettings extends StObject {
  
  var dimmerSettings: DimmerSettings = js.native
}
object PickImpldimmerSettings {
  
  @scala.inline
  def apply(dimmerSettings: DimmerSettings): PickImpldimmerSettings = {
    val __obj = js.Dynamic.literal(dimmerSettings = dimmerSettings.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImpldimmerSettings]
  }
  
  @scala.inline
  implicit class PickImpldimmerSettingsMutableBuilder[Self <: PickImpldimmerSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDimmerSettings(value: DimmerSettings): Self = StObject.set(x, "dimmerSettings", value.asInstanceOf[js.Any])
  }
}
