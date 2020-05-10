package typingsSlinky.semanticUiSticky.SemanticUI.StickySettings

import typingsSlinky.semanticUiSticky.JQuery
import typingsSlinky.semanticUiSticky.SemanticUI.Sticky.ClassNameSettings
import typingsSlinky.semanticUiSticky.SemanticUI.Sticky.ErrorSettings
import typingsSlinky.semanticUiSticky.semanticUiStickyBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Impl extends js.Object {
  /**
    * Offset in pixels from the bottom of the screen when fixing element to viewport
    *
    * @default 0
    */
  var bottomOffset: Double = js.native
  // endregion
  // region DOM Settings
  /**
    * Class names used to attach style to state
    */
  var className: ClassNameSettings = js.native
  /**
    * Context which sticky element should stick to
    *
    * @default false
    */
  var context: `false` | String | JQuery = js.native
  /**
    * Debug output to console
    */
  var debug: Boolean = js.native
  // endregion
  // region Debug Settings
  var error: ErrorSettings = js.native
  /**
    * Sticky container height will only be set if the difference between heights of container and context is larger than this jitter value.
    *
    * @default 5
    */
  var jitter: Double = js.native
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
    * Whether any change in context DOM should automatically refresh cached sticky positions
    *
    * @default false
    */
  var observeChanges: Boolean = js.native
  /**
    * Offset in pixels from the top of the screen when fixing element to viewport
    *
    * @default 0
    */
  var offset: Double = js.native
  /**
    * Show console.table output with performance metrics
    */
  var performance: Boolean = js.native
  // region Sticky Settings
  /**
    * Whether element should be "pushed" by the viewport, attaching to the bottom of the screen when scrolling up
    *
    * @default false
    */
  var pushing: Boolean = js.native
  /**
    * Context which sticky should attach onscroll events.
    *
    * @default 'window'
    */
  var scrollContext: String | JQuery = js.native
  /**
    * Sets size of fixed content to match its width before fixing to screen dynamically.
    * This is used because fixed may display block or 100% width content differently than it appears before sticking.
    *
    * @default true
    * @since 2.2.11
    */
  var setSize: Boolean = js.native
  /**
    * Silences all console output including error messages, regardless of other debug settings.
    */
  var silent: Boolean = js.native
  /**
    * Debug output includes all internal behaviors
    */
  var verbose: Boolean = js.native
  /**
    * Callback when element is bound to bottom of parent container
    */
  def onBottom(): Unit = js.native
  // endregion
  // region Callbacks
  /**
    * Callback when element is repositioned from layout change
    */
  def onReposition(): Unit = js.native
  /**
    * Callback when requestAnimationFrame fires from scroll handler.
    */
  def onScroll(): Unit = js.native
  /**
    * Callback when element is fixed to page
    */
  def onStick(): Unit = js.native
  /**
    * Callback when element is bound to top of parent container
    */
  def onTop(): Unit = js.native
  /**
    * Callback when element is unfixed from page
    */
  def onUnstick(): Unit = js.native
}

object Impl {
  @scala.inline
  def apply(
    bottomOffset: Double,
    className: ClassNameSettings,
    context: `false` | String | JQuery,
    debug: Boolean,
    error: ErrorSettings,
    jitter: Double,
    name: String,
    namespace: String,
    observeChanges: Boolean,
    offset: Double,
    onBottom: () => Unit,
    onReposition: () => Unit,
    onScroll: () => Unit,
    onStick: () => Unit,
    onTop: () => Unit,
    onUnstick: () => Unit,
    performance: Boolean,
    pushing: Boolean,
    scrollContext: String | JQuery,
    setSize: Boolean,
    silent: Boolean,
    verbose: Boolean
  ): Impl = {
    val __obj = js.Dynamic.literal(bottomOffset = bottomOffset.asInstanceOf[js.Any], className = className.asInstanceOf[js.Any], context = context.asInstanceOf[js.Any], debug = debug.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], jitter = jitter.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], namespace = namespace.asInstanceOf[js.Any], observeChanges = observeChanges.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], onBottom = js.Any.fromFunction0(onBottom), onReposition = js.Any.fromFunction0(onReposition), onScroll = js.Any.fromFunction0(onScroll), onStick = js.Any.fromFunction0(onStick), onTop = js.Any.fromFunction0(onTop), onUnstick = js.Any.fromFunction0(onUnstick), performance = performance.asInstanceOf[js.Any], pushing = pushing.asInstanceOf[js.Any], scrollContext = scrollContext.asInstanceOf[js.Any], setSize = setSize.asInstanceOf[js.Any], silent = silent.asInstanceOf[js.Any], verbose = verbose.asInstanceOf[js.Any])
    __obj.asInstanceOf[Impl]
  }
  @scala.inline
  implicit class ImplOps[Self <: Impl] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBottomOffset(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bottomOffset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClassName(value: ClassNameSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContext(value: `false` | String | JQuery): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("context")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDebug(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debug")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withError(value: ErrorSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withJitter(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jitter")(value.asInstanceOf[js.Any])
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
    def withOnBottom(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onBottom")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withOnReposition(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onReposition")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withOnScroll(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onScroll")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withOnStick(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onStick")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withOnTop(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTop")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withOnUnstick(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onUnstick")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withPerformance(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("performance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPushing(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pushing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScrollContext(value: String | JQuery): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollContext")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSetSize(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSilent(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("silent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVerbose(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verbose")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

