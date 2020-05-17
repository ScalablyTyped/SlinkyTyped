package typingsSlinky.winrtUwp.Windows.ApplicationModel.Activation

import typingsSlinky.winrtUwp.Windows.Foundation.Collections.ValueSet
import typingsSlinky.winrtUwp.Windows.Storage.StorageFolder
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides information about an activated event that fires after the app was suspended for a folder picker operation. */
@js.native
trait FolderPickerContinuationEventArgs extends js.Object {
  /** Gets a set of values populated by the app before a FolderPicker operation that deactivates the app in order to provide context when the app is activated. */
  var continuationData: ValueSet = js.native
  /** Gets the folder selected by the user during the folder picker operation. */
  var folder: StorageFolder = js.native
  /** Gets the activation type. */
  var kind: ActivationKind = js.native
  /** Gets the execution state of the app before it was activated. */
  var previousExecutionState: ApplicationExecutionState = js.native
  /** Gets a SplashScreen object that provides information about the transition from the splash screen to the activated app. */
  var splashScreen: SplashScreen = js.native
}

object FolderPickerContinuationEventArgs {
  @scala.inline
  def apply(
    continuationData: ValueSet,
    folder: StorageFolder,
    kind: ActivationKind,
    previousExecutionState: ApplicationExecutionState,
    splashScreen: SplashScreen
  ): FolderPickerContinuationEventArgs = {
    val __obj = js.Dynamic.literal(continuationData = continuationData.asInstanceOf[js.Any], folder = folder.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], previousExecutionState = previousExecutionState.asInstanceOf[js.Any], splashScreen = splashScreen.asInstanceOf[js.Any])
    __obj.asInstanceOf[FolderPickerContinuationEventArgs]
  }
  @scala.inline
  implicit class FolderPickerContinuationEventArgsOps[Self <: FolderPickerContinuationEventArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContinuationData(value: ValueSet): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("continuationData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFolder(value: StorageFolder): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("folder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKind(value: ActivationKind): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPreviousExecutionState(value: ApplicationExecutionState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("previousExecutionState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSplashScreen(value: SplashScreen): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("splashScreen")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

