package typingsSlinky.winrt.Windows.UI.Core

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InputEnabledEventArgs extends IInputEnabledEventArgs
object InputEnabledEventArgs {
  
  @scala.inline
  def apply(handled: Boolean, inputEnabled: Boolean): InputEnabledEventArgs = {
    val __obj = js.Dynamic.literal(handled = handled.asInstanceOf[js.Any], inputEnabled = inputEnabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[InputEnabledEventArgs]
  }
}
