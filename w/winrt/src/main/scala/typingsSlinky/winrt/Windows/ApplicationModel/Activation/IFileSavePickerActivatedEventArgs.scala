package typingsSlinky.winrt.Windows.ApplicationModel.Activation

import typingsSlinky.winrt.Windows.Storage.Pickers.Provider.FileSavePickerUI
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IFileSavePickerActivatedEventArgs extends IActivatedEventArgs {
  
  var fileSavePickerUI: FileSavePickerUI = js.native
}
object IFileSavePickerActivatedEventArgs {
  
  @scala.inline
  def apply(
    fileSavePickerUI: FileSavePickerUI,
    kind: ActivationKind,
    previousExecutionState: ApplicationExecutionState,
    splashScreen: SplashScreen
  ): IFileSavePickerActivatedEventArgs = {
    val __obj = js.Dynamic.literal(fileSavePickerUI = fileSavePickerUI.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], previousExecutionState = previousExecutionState.asInstanceOf[js.Any], splashScreen = splashScreen.asInstanceOf[js.Any])
    __obj.asInstanceOf[IFileSavePickerActivatedEventArgs]
  }
  
  @scala.inline
  implicit class IFileSavePickerActivatedEventArgsMutableBuilder[Self <: IFileSavePickerActivatedEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFileSavePickerUI(value: FileSavePickerUI): Self = StObject.set(x, "fileSavePickerUI", value.asInstanceOf[js.Any])
  }
}
