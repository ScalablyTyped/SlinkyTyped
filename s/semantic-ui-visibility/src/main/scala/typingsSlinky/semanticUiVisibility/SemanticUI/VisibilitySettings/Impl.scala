package typingsSlinky.semanticUiVisibility.SemanticUI.VisibilitySettings

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

@js.native
trait Impl extends js.Object {
  /**
    * Whether visibility conditions should be checked on calls to refresh.
    * These calls can be triggered from either resize, load or manually calling $('.foo').visibility('refresh')
    *
    * @default true
    */
  var checkOnRefresh: Boolean = js.native
  // endregion
  // region DOM Settings
  /**
    * Class names used to attach style to state
    */
  var className: ClassNameSettings = js.native
  /**
    * The scroll context visibility should use.
    *
    * @default 'window'
    */
  var context: String | JQuery = js.native
  /**
    * When set to true a callback will occur anytime an element passes a condition not just immediately after the threshold is met.
    *
    * @default false
    */
  var continuous: Boolean = js.native
  /**
    * Debug output to console
    */
  var debug: Boolean = js.native
  /**
    * When using type: image allows you to specify transition duration
    *
    * @default 1000
    */
  var duration: Double = js.native
  // endregion
  // region Debug Settings
  var error: ErrorSettings = js.native
  /**
    * Whether element calculations should include its margin
    *
    * @default false
    */
  var includeMargin: Boolean = js.native
  /**
    * Whether visibility conditions should be checked immediately on init
    *
    * @default true
    */
  var initialCheck: Boolean = js.native
  // endregion
  // region Debug Settings
  /**
    * Name used in log statements
    */
  var name: String = js.native
  // endregion
  // region Component Settings
  // region DOM Settings
  /**
    * Event namespace. Makes sure module teardown does not effect other events attached to an element.
    */
  var namespace: String = js.native
  /**
    * Whether to automatically refresh content when changes are made to the element's DOM subtree
    *
    * @default true
    */
  var observeChanges: Boolean = js.native
  /**
    * Value that context scrollTop should be adjusted in pixels. Useful for making content appear below content fixed to the page.
    *
    * @default 0
    */
  var offset: Double = js.native
  // region Functionality
  /**
    * When set to false a callback will occur each time an element passes the threshold for a condition.
    *
    * @default true
    */
  var once: Boolean = js.native
  /**
    * Show console.table output with performance metrics
    */
  var performance: Boolean = js.native
  /**
    * Whether visibility conditions should be checked on window load. This ensures that after images load content positions will be updated correctly.
    *
    * @default true
    */
  var refreshOnLoad: Boolean = js.native
  /**
    * Whether visibility conditions should be checked on window resize. Useful when content resizes causes continuous changes in position
    *
    * @default true
    */
  var refreshOnResize: Boolean = js.native
  /**
    * Silences all console output including error messages, regardless of other debug settings.
    */
  var silent: Boolean = js.native
  /**
    * When set to an integer, scroll position will be debounced using this ms value. false will debounce with requestAnimationFrame.
    *
    * @default false
    */
  var throttle: `false` | Double = js.native
  /**
    * When using type: image allows you to specify transition when showing a loaded image
    *
    * @default false
    */
  var transition: `false` | String = js.native
  /**
    * Set to image to load images when on screen. Set to fixed to add class name fixed when passed.
    *
    * @default false
    */
  var `type`: `false` | image | fixed = js.native
  /**
    * Debug output includes all internal behaviors
    */
  var verbose: Boolean = js.native
  /**
    * Specify a z-index when using type: 'fixed'.
    *
    * @default 1
    * @since 2.2
    */
  var zIndex: Double = js.native
  /**
    * Occurs after all img initialized at the same time have loaded.
    *
    * @since 2.2
    */
  def onAllLoaded(): Unit = js.native
  /**
    * Element's bottom edge has passed top of screen
    */
  def onBottomPassed(): Unit = js.native
  /**
    * Element's bottom edge has not passed top of screen
    */
  def onBottomPassedReverse(): Unit = js.native
  /**
    * Element's bottom edge has passed bottom of screen
    */
  def onBottomVisible(): Unit = js.native
  /**
    * Element's bottom edge has not passed bottom of screen
    */
  def onBottomVisibleReverse(): Unit = js.native
  // endregion
  // region Fixed Callbacks
  /**
    * Occurs after element has been assigned position fixed
    *
    * @since 2.2
    */
  def onFixed(): Unit = js.native
  // endregion
  // region Image Callbacks
  /**
    * Occurs after an image has completed loading
    *
    * @since 2.2
    */
  def onLoad(): Unit = js.native
  def onOffScreen(): Unit = js.native
  def onOnScreen(): Unit = js.native
  /**
    * Any part of an element is visible on screen
    */
  def onPassing(): Unit = js.native
  /**
    * Element's top has not passed top of screen but bottom has
    */
  def onPassingReverse(): Unit = js.native
  /**
    * Occurs whenever element's visibility is refreshed
    */
  def onRefresh(): Unit = js.native
  /**
    * Element's top edge has passed top of the screen
    */
  def onTopPassed(): Unit = js.native
  /**
    * Element's top edge has not passed top of the screen
    */
  def onTopPassedReverse(): Unit = js.native
  // endregion
  // region Visibility Callbacks
  /**
    * Element's top edge has passed bottom of screen
    */
  def onTopVisible(): Unit = js.native
  /**
    * Element's top edge has not passed bottom of screen
    */
  def onTopVisibleReverse(): Unit = js.native
  /**
    * Occurs after element has been removed from fixed position
    *
    * @since 2.2
    */
  def onUnfixed(): Unit = js.native
  // endregion
  // region Utility Callbacks
  /**
    * Occurs each time an elements calculations are updated
    */
  def onUpdate(calculations: ElementCalculations): Unit = js.native
}

object Impl {
  @scala.inline
  def apply(
    checkOnRefresh: Boolean,
    className: ClassNameSettings,
    context: String | JQuery,
    continuous: Boolean,
    debug: Boolean,
    duration: Double,
    error: ErrorSettings,
    includeMargin: Boolean,
    initialCheck: Boolean,
    name: String,
    namespace: String,
    observeChanges: Boolean,
    offset: Double,
    onAllLoaded: () => Unit,
    onBottomPassed: () => Unit,
    onBottomPassedReverse: () => Unit,
    onBottomVisible: () => Unit,
    onBottomVisibleReverse: () => Unit,
    onFixed: () => Unit,
    onLoad: () => Unit,
    onOffScreen: () => Unit,
    onOnScreen: () => Unit,
    onPassing: () => Unit,
    onPassingReverse: () => Unit,
    onRefresh: () => Unit,
    onTopPassed: () => Unit,
    onTopPassedReverse: () => Unit,
    onTopVisible: () => Unit,
    onTopVisibleReverse: () => Unit,
    onUnfixed: () => Unit,
    onUpdate: ElementCalculations => Unit,
    once: Boolean,
    performance: Boolean,
    refreshOnLoad: Boolean,
    refreshOnResize: Boolean,
    silent: Boolean,
    throttle: `false` | Double,
    transition: `false` | String,
    `type`: `false` | image | fixed,
    verbose: Boolean,
    zIndex: Double
  ): Impl = {
    val __obj = js.Dynamic.literal(checkOnRefresh = checkOnRefresh.asInstanceOf[js.Any], className = className.asInstanceOf[js.Any], context = context.asInstanceOf[js.Any], continuous = continuous.asInstanceOf[js.Any], debug = debug.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], includeMargin = includeMargin.asInstanceOf[js.Any], initialCheck = initialCheck.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], namespace = namespace.asInstanceOf[js.Any], observeChanges = observeChanges.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], onAllLoaded = js.Any.fromFunction0(onAllLoaded), onBottomPassed = js.Any.fromFunction0(onBottomPassed), onBottomPassedReverse = js.Any.fromFunction0(onBottomPassedReverse), onBottomVisible = js.Any.fromFunction0(onBottomVisible), onBottomVisibleReverse = js.Any.fromFunction0(onBottomVisibleReverse), onFixed = js.Any.fromFunction0(onFixed), onLoad = js.Any.fromFunction0(onLoad), onOffScreen = js.Any.fromFunction0(onOffScreen), onOnScreen = js.Any.fromFunction0(onOnScreen), onPassing = js.Any.fromFunction0(onPassing), onPassingReverse = js.Any.fromFunction0(onPassingReverse), onRefresh = js.Any.fromFunction0(onRefresh), onTopPassed = js.Any.fromFunction0(onTopPassed), onTopPassedReverse = js.Any.fromFunction0(onTopPassedReverse), onTopVisible = js.Any.fromFunction0(onTopVisible), onTopVisibleReverse = js.Any.fromFunction0(onTopVisibleReverse), onUnfixed = js.Any.fromFunction0(onUnfixed), onUpdate = js.Any.fromFunction1(onUpdate), once = once.asInstanceOf[js.Any], performance = performance.asInstanceOf[js.Any], refreshOnLoad = refreshOnLoad.asInstanceOf[js.Any], refreshOnResize = refreshOnResize.asInstanceOf[js.Any], silent = silent.asInstanceOf[js.Any], throttle = throttle.asInstanceOf[js.Any], transition = transition.asInstanceOf[js.Any], verbose = verbose.asInstanceOf[js.Any], zIndex = zIndex.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Impl]
  }
  @scala.inline
  implicit class ImplOps[Self <: Impl] (val x: Self) extends AnyVal {
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
    def withClassName(value: ClassNameSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContext(value: String | JQuery): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("context")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContinuous(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("continuous")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDebug(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debug")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDuration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("duration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withError(value: ErrorSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIncludeMargin(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeMargin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInitialCheck(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialCheck")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNamespace(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("namespace")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withObserveChanges(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("observeChanges")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOffset(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnAllLoaded(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onAllLoaded")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withOnBottomPassed(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onBottomPassed")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withOnBottomPassedReverse(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onBottomPassedReverse")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withOnBottomVisible(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onBottomVisible")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withOnBottomVisibleReverse(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onBottomVisibleReverse")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withOnFixed(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onFixed")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withOnLoad(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLoad")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withOnOffScreen(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onOffScreen")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withOnOnScreen(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onOnScreen")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withOnPassing(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPassing")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withOnPassingReverse(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPassingReverse")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withOnRefresh(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRefresh")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withOnTopPassed(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTopPassed")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withOnTopPassedReverse(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTopPassedReverse")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withOnTopVisible(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTopVisible")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withOnTopVisibleReverse(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTopVisibleReverse")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withOnUnfixed(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onUnfixed")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withOnUpdate(value: ElementCalculations => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onUpdate")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOnce(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("once")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPerformance(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("performance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRefreshOnLoad(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("refreshOnLoad")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRefreshOnResize(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("refreshOnResize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSilent(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("silent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withThrottle(value: `false` | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("throttle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTransition(value: `false` | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: `false` | image | fixed): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVerbose(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verbose")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withZIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zIndex")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

