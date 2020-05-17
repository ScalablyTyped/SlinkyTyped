package typingsSlinky.winrtUwp.Windows.ApplicationModel.Activation

import typingsSlinky.winrtUwp.Windows.ApplicationModel.Search.SearchPaneQueryLinguisticDetails
import typingsSlinky.winrtUwp.Windows.UI.ViewManagement.ActivationViewSwitcher
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides information about the activated event that fires when the user searches the app from the Search charm and the app isn't the main app on screen. */
@js.native
trait SearchActivatedEventArgs extends js.Object {
  /** Gets the identifier for the currently shown app view. */
  var currentlyShownApplicationViewId: Double = js.native
  /** Gets the activation type. */
  var kind: ActivationKind = js.native
  /** Gets the Internet Engineering Task Force (IETF) language tag (BCP 47 standard) that identifies the language currently associated with the user's text input device. */
  var language: String = js.native
  /** Gets a SearchPaneQueryLinguisticDetails object that provides info about query text that the user enters through an Input Method Editor (IME). */
  var linguisticDetails: SearchPaneQueryLinguisticDetails = js.native
  /** Gets the execution state of the app before it was activated. */
  var previousExecutionState: ApplicationExecutionState = js.native
  /** Gets the text that the user wants the app to search for. The user entered this text into the search box of the search pane. */
  var queryText: String = js.native
  /** Gets a SplashScreen object that provides information about the transition from the splash screen to the activated app. */
  var splashScreen: SplashScreen = js.native
  /** Gets the view switcher object that allows you to set the view for the application. */
  var viewSwitcher: ActivationViewSwitcher = js.native
}

object SearchActivatedEventArgs {
  @scala.inline
  def apply(
    currentlyShownApplicationViewId: Double,
    kind: ActivationKind,
    language: String,
    linguisticDetails: SearchPaneQueryLinguisticDetails,
    previousExecutionState: ApplicationExecutionState,
    queryText: String,
    splashScreen: SplashScreen,
    viewSwitcher: ActivationViewSwitcher
  ): SearchActivatedEventArgs = {
    val __obj = js.Dynamic.literal(currentlyShownApplicationViewId = currentlyShownApplicationViewId.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], language = language.asInstanceOf[js.Any], linguisticDetails = linguisticDetails.asInstanceOf[js.Any], previousExecutionState = previousExecutionState.asInstanceOf[js.Any], queryText = queryText.asInstanceOf[js.Any], splashScreen = splashScreen.asInstanceOf[js.Any], viewSwitcher = viewSwitcher.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchActivatedEventArgs]
  }
  @scala.inline
  implicit class SearchActivatedEventArgsOps[Self <: SearchActivatedEventArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCurrentlyShownApplicationViewId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentlyShownApplicationViewId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKind(value: ActivationKind): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLanguage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("language")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLinguisticDetails(value: SearchPaneQueryLinguisticDetails): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linguisticDetails")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPreviousExecutionState(value: ApplicationExecutionState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("previousExecutionState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQueryText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queryText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSplashScreen(value: SplashScreen): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("splashScreen")(value.asInstanceOf[js.Any])
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

