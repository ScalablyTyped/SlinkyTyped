package typingsSlinky.tuyaPanelKit.mod

import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PopupCustomProps extends PopupProps {
  
  var content: ReactElement = js.native
}
object PopupCustomProps {
  
  @scala.inline
  def apply(): PopupCustomProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PopupCustomProps]
  }
  
  @scala.inline
  implicit class PopupCustomPropsMutableBuilder[Self <: PopupCustomProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContent(value: ReactElement): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
  }
}
