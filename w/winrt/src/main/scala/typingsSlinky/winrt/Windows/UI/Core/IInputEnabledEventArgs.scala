package typingsSlinky.winrt.Windows.UI.Core

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IInputEnabledEventArgs extends ICoreWindowEventArgs {
  
  var inputEnabled: Boolean = js.native
}
object IInputEnabledEventArgs {
  
  @scala.inline
  def apply(handled: Boolean, inputEnabled: Boolean): IInputEnabledEventArgs = {
    val __obj = js.Dynamic.literal(handled = handled.asInstanceOf[js.Any], inputEnabled = inputEnabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[IInputEnabledEventArgs]
  }
  
  @scala.inline
  implicit class IInputEnabledEventArgsMutableBuilder[Self <: IInputEnabledEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInputEnabled(value: Boolean): Self = StObject.set(x, "inputEnabled", value.asInstanceOf[js.Any])
  }
}
