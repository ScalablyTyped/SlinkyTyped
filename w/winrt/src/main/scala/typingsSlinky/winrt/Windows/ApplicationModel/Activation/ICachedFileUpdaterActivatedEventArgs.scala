package typingsSlinky.winrt.Windows.ApplicationModel.Activation

import typingsSlinky.winrt.Windows.Storage.Provider.CachedFileUpdaterUI
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICachedFileUpdaterActivatedEventArgs extends IActivatedEventArgs {
  var cachedFileUpdaterUI: CachedFileUpdaterUI = js.native
}

object ICachedFileUpdaterActivatedEventArgs {
  @scala.inline
  def apply(
    cachedFileUpdaterUI: CachedFileUpdaterUI,
    kind: ActivationKind,
    previousExecutionState: ApplicationExecutionState,
    splashScreen: SplashScreen
  ): ICachedFileUpdaterActivatedEventArgs = {
    val __obj = js.Dynamic.literal(cachedFileUpdaterUI = cachedFileUpdaterUI.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], previousExecutionState = previousExecutionState.asInstanceOf[js.Any], splashScreen = splashScreen.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICachedFileUpdaterActivatedEventArgs]
  }
  @scala.inline
  implicit class ICachedFileUpdaterActivatedEventArgsOps[Self <: ICachedFileUpdaterActivatedEventArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCachedFileUpdaterUI(value: CachedFileUpdaterUI): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cachedFileUpdaterUI")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

