package typingsSlinky.winrtUwp.Windows.ApplicationModel.Activation

import typingsSlinky.winrtUwp.Windows.Foundation.Collections.IVectorView
import typingsSlinky.winrtUwp.Windows.Storage.IStorageItem
import typingsSlinky.winrtUwp.Windows.Storage.Search.StorageFileQueryResult
import typingsSlinky.winrtUwp.Windows.UI.ViewManagement.ActivationViewSwitcher
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data when an app is activated because it is the app associated with a file. */
@js.native
trait FileActivatedEventArgs extends js.Object {
  /** The package family name of the app that launched your app. */
  var callerPackageFamilyName: String = js.native
  /** Gets the identifier for the currently shown app view. */
  var currentlyShownApplicationViewId: Double = js.native
  /** Gets the files for which the app was activated. */
  var files: IVectorView[IStorageItem] = js.native
  /** Gets the activation type. */
  var kind: ActivationKind = js.native
  /** Gets the neighboring files of the files for which the app was activated. */
  var neighboringFilesQuery: StorageFileQueryResult = js.native
  /** Gets the execution state of the app before it was activated. */
  var previousExecutionState: ApplicationExecutionState = js.native
  /** Gets the splash screen object that provides information about the transition from the splash screen to the activated app. */
  var splashScreen: SplashScreen = js.native
  /** Gets the action associated with the activated file. */
  var verb: String = js.native
  /** Provides the object that allows you to set the view for the application. */
  var viewSwitcher: ActivationViewSwitcher = js.native
}

object FileActivatedEventArgs {
  @scala.inline
  def apply(
    callerPackageFamilyName: String,
    currentlyShownApplicationViewId: Double,
    files: IVectorView[IStorageItem],
    kind: ActivationKind,
    neighboringFilesQuery: StorageFileQueryResult,
    previousExecutionState: ApplicationExecutionState,
    splashScreen: SplashScreen,
    verb: String,
    viewSwitcher: ActivationViewSwitcher
  ): FileActivatedEventArgs = {
    val __obj = js.Dynamic.literal(callerPackageFamilyName = callerPackageFamilyName.asInstanceOf[js.Any], currentlyShownApplicationViewId = currentlyShownApplicationViewId.asInstanceOf[js.Any], files = files.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], neighboringFilesQuery = neighboringFilesQuery.asInstanceOf[js.Any], previousExecutionState = previousExecutionState.asInstanceOf[js.Any], splashScreen = splashScreen.asInstanceOf[js.Any], verb = verb.asInstanceOf[js.Any], viewSwitcher = viewSwitcher.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileActivatedEventArgs]
  }
  @scala.inline
  implicit class FileActivatedEventArgsOps[Self <: FileActivatedEventArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCallerPackageFamilyName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callerPackageFamilyName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCurrentlyShownApplicationViewId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentlyShownApplicationViewId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFiles(value: IVectorView[IStorageItem]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("files")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKind(value: ActivationKind): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNeighboringFilesQuery(value: StorageFileQueryResult): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("neighboringFilesQuery")(value.asInstanceOf[js.Any])
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
    @scala.inline
    def withVerb(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verb")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withViewSwitcher(value: ActivationViewSwitcher): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewSwitcher")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

