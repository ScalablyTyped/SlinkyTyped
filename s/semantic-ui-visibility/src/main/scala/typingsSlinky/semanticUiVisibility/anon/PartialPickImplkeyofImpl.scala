package typingsSlinky.semanticUiVisibility.anon

import typingsSlinky.semanticUiVisibility.JQuery
import typingsSlinky.semanticUiVisibility.SemanticUI.Visibility.ClassNameSettings
import typingsSlinky.semanticUiVisibility.SemanticUI.Visibility.ElementCalculations
import typingsSlinky.semanticUiVisibility.SemanticUI.Visibility.ErrorSettings
import typingsSlinky.semanticUiVisibility.semanticUiVisibilityBooleans.`false`
import typingsSlinky.semanticUiVisibility.semanticUiVisibilityStrings.fixed
import typingsSlinky.semanticUiVisibility.semanticUiVisibilityStrings.image
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<std.Pick<semantic-ui-visibility.SemanticUI.VisibilitySettings._Impl, keyof semantic-ui-visibility.SemanticUI.VisibilitySettings._Impl>> */
@js.native
trait PartialPickImplkeyofImpl extends js.Object {
  var checkOnRefresh: js.UndefOr[Boolean] = js.native
  var className: js.UndefOr[ClassNameSettings] = js.native
  var context: js.UndefOr[String | JQuery] = js.native
  var continuous: js.UndefOr[Boolean] = js.native
  var debug: js.UndefOr[Boolean] = js.native
  var duration: js.UndefOr[Double] = js.native
  var error: js.UndefOr[ErrorSettings] = js.native
  var includeMargin: js.UndefOr[Boolean] = js.native
  var initialCheck: js.UndefOr[Boolean] = js.native
  var name: js.UndefOr[String] = js.native
  var namespace: js.UndefOr[String] = js.native
  var observeChanges: js.UndefOr[Boolean] = js.native
  var offset: js.UndefOr[Double] = js.native
  var onAllLoaded: js.UndefOr[js.ThisFunction0[/* this */ JQuery, Unit]] = js.native
  var onBottomPassed: js.UndefOr[js.ThisFunction0[/* this */ JQuery, Unit]] = js.native
  var onBottomPassedReverse: js.UndefOr[js.ThisFunction0[/* this */ JQuery, Unit]] = js.native
  var onBottomVisible: js.UndefOr[js.ThisFunction0[/* this */ JQuery, Unit]] = js.native
  var onBottomVisibleReverse: js.UndefOr[js.ThisFunction0[/* this */ JQuery, Unit]] = js.native
  var onFixed: js.UndefOr[js.ThisFunction0[/* this */ JQuery, Unit]] = js.native
  var onLoad: js.UndefOr[js.ThisFunction0[/* this */ JQuery, Unit]] = js.native
  var onOffScreen: js.UndefOr[js.ThisFunction0[/* this */ JQuery, Unit]] = js.native
  var onOnScreen: js.UndefOr[js.ThisFunction0[/* this */ JQuery, Unit]] = js.native
  var onPassing: js.UndefOr[js.ThisFunction0[/* this */ JQuery, Unit]] = js.native
  var onPassingReverse: js.UndefOr[js.ThisFunction0[/* this */ JQuery, Unit]] = js.native
  var onRefresh: js.UndefOr[js.ThisFunction0[/* this */ JQuery, Unit]] = js.native
  var onTopPassed: js.UndefOr[js.ThisFunction0[/* this */ JQuery, Unit]] = js.native
  var onTopPassedReverse: js.UndefOr[js.ThisFunction0[/* this */ JQuery, Unit]] = js.native
  var onTopVisible: js.UndefOr[js.ThisFunction0[/* this */ JQuery, Unit]] = js.native
  var onTopVisibleReverse: js.UndefOr[js.ThisFunction0[/* this */ JQuery, Unit]] = js.native
  var onUnfixed: js.UndefOr[js.ThisFunction0[/* this */ JQuery, Unit]] = js.native
  var onUpdate: js.UndefOr[
    js.ThisFunction1[/* this */ JQuery, /* calculations */ ElementCalculations, Unit]
  ] = js.native
  var once: js.UndefOr[Boolean] = js.native
  var performance: js.UndefOr[Boolean] = js.native
  var refreshOnLoad: js.UndefOr[Boolean] = js.native
  var refreshOnResize: js.UndefOr[Boolean] = js.native
  var silent: js.UndefOr[Boolean] = js.native
  var throttle: js.UndefOr[`false` | Double] = js.native
  var transition: js.UndefOr[`false` | String] = js.native
  var `type`: js.UndefOr[`false` | image | fixed] = js.native
  var verbose: js.UndefOr[Boolean] = js.native
  var zIndex: js.UndefOr[Double] = js.native
}

object PartialPickImplkeyofImpl {
  @scala.inline
  def apply(): PartialPickImplkeyofImpl = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialPickImplkeyofImpl]
  }
  @scala.inline
  implicit class PartialPickImplkeyofImplOps[Self <: PartialPickImplkeyofImpl] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCheckOnRefresh(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkOnRefresh")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCheckOnRefresh: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkOnRefresh")(js.undefined)
        ret
    }
    @scala.inline
    def withClassName(value: ClassNameSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(js.undefined)
        ret
    }
    @scala.inline
    def withContext(value: String | JQuery): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("context")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContext: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("context")(js.undefined)
        ret
    }
    @scala.inline
    def withContinuous(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("continuous")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContinuous: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("continuous")(js.undefined)
        ret
    }
    @scala.inline
    def withDebug(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debug")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDebug: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debug")(js.undefined)
        ret
    }
    @scala.inline
    def withDuration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("duration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDuration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("duration")(js.undefined)
        ret
    }
    @scala.inline
    def withError(value: ErrorSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutError: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(js.undefined)
        ret
    }
    @scala.inline
    def withIncludeMargin(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeMargin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIncludeMargin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeMargin")(js.undefined)
        ret
    }
    @scala.inline
    def withInitialCheck(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialCheck")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInitialCheck: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialCheck")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withNamespace(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("namespace")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNamespace: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("namespace")(js.undefined)
        ret
    }
    @scala.inline
    def withObserveChanges(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("observeChanges")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutObserveChanges: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("observeChanges")(js.undefined)
        ret
    }
    @scala.inline
    def withOffset(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOffset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offset")(js.undefined)
        ret
    }
    @scala.inline
    def withOnAllLoaded(value: js.ThisFunction0[/* this */ JQuery, Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onAllLoaded")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnAllLoaded: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onAllLoaded")(js.undefined)
        ret
    }
    @scala.inline
    def withOnBottomPassed(value: js.ThisFunction0[/* this */ JQuery, Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onBottomPassed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnBottomPassed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onBottomPassed")(js.undefined)
        ret
    }
    @scala.inline
    def withOnBottomPassedReverse(value: js.ThisFunction0[/* this */ JQuery, Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onBottomPassedReverse")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnBottomPassedReverse: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onBottomPassedReverse")(js.undefined)
        ret
    }
    @scala.inline
    def withOnBottomVisible(value: js.ThisFunction0[/* this */ JQuery, Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onBottomVisible")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnBottomVisible: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onBottomVisible")(js.undefined)
        ret
    }
    @scala.inline
    def withOnBottomVisibleReverse(value: js.ThisFunction0[/* this */ JQuery, Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onBottomVisibleReverse")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnBottomVisibleReverse: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onBottomVisibleReverse")(js.undefined)
        ret
    }
    @scala.inline
    def withOnFixed(value: js.ThisFunction0[/* this */ JQuery, Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onFixed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnFixed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onFixed")(js.undefined)
        ret
    }
    @scala.inline
    def withOnLoad(value: js.ThisFunction0[/* this */ JQuery, Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLoad")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnLoad: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLoad")(js.undefined)
        ret
    }
    @scala.inline
    def withOnOffScreen(value: js.ThisFunction0[/* this */ JQuery, Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onOffScreen")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnOffScreen: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onOffScreen")(js.undefined)
        ret
    }
    @scala.inline
    def withOnOnScreen(value: js.ThisFunction0[/* this */ JQuery, Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onOnScreen")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnOnScreen: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onOnScreen")(js.undefined)
        ret
    }
    @scala.inline
    def withOnPassing(value: js.ThisFunction0[/* this */ JQuery, Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPassing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnPassing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPassing")(js.undefined)
        ret
    }
    @scala.inline
    def withOnPassingReverse(value: js.ThisFunction0[/* this */ JQuery, Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPassingReverse")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnPassingReverse: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPassingReverse")(js.undefined)
        ret
    }
    @scala.inline
    def withOnRefresh(value: js.ThisFunction0[/* this */ JQuery, Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRefresh")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnRefresh: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRefresh")(js.undefined)
        ret
    }
    @scala.inline
    def withOnTopPassed(value: js.ThisFunction0[/* this */ JQuery, Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTopPassed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnTopPassed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTopPassed")(js.undefined)
        ret
    }
    @scala.inline
    def withOnTopPassedReverse(value: js.ThisFunction0[/* this */ JQuery, Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTopPassedReverse")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnTopPassedReverse: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTopPassedReverse")(js.undefined)
        ret
    }
    @scala.inline
    def withOnTopVisible(value: js.ThisFunction0[/* this */ JQuery, Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTopVisible")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnTopVisible: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTopVisible")(js.undefined)
        ret
    }
    @scala.inline
    def withOnTopVisibleReverse(value: js.ThisFunction0[/* this */ JQuery, Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTopVisibleReverse")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnTopVisibleReverse: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTopVisibleReverse")(js.undefined)
        ret
    }
    @scala.inline
    def withOnUnfixed(value: js.ThisFunction0[/* this */ JQuery, Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onUnfixed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnUnfixed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onUnfixed")(js.undefined)
        ret
    }
    @scala.inline
    def withOnUpdate(value: js.ThisFunction1[/* this */ JQuery, /* calculations */ ElementCalculations, Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onUpdate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnUpdate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onUpdate")(js.undefined)
        ret
    }
    @scala.inline
    def withOnce(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("once")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnce: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("once")(js.undefined)
        ret
    }
    @scala.inline
    def withPerformance(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("performance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPerformance: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("performance")(js.undefined)
        ret
    }
    @scala.inline
    def withRefreshOnLoad(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("refreshOnLoad")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRefreshOnLoad: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("refreshOnLoad")(js.undefined)
        ret
    }
    @scala.inline
    def withRefreshOnResize(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("refreshOnResize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRefreshOnResize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("refreshOnResize")(js.undefined)
        ret
    }
    @scala.inline
    def withSilent(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("silent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSilent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("silent")(js.undefined)
        ret
    }
    @scala.inline
    def withThrottle(value: `false` | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("throttle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThrottle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("throttle")(js.undefined)
        ret
    }
    @scala.inline
    def withTransition(value: `false` | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transition")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: `false` | image | fixed): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
    @scala.inline
    def withVerbose(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verbose")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVerbose: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verbose")(js.undefined)
        ret
    }
    @scala.inline
    def withZIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zIndex")(js.undefined)
        ret
    }
  }
  
}

