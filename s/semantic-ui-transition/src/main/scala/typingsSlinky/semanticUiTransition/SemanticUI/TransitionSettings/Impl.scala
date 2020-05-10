package typingsSlinky.semanticUiTransition.SemanticUI.TransitionSettings

import typingsSlinky.semanticUiTransition.SemanticUI.Transition.ClassNameSettings
import typingsSlinky.semanticUiTransition.SemanticUI.Transition.ErrorSettings
import typingsSlinky.semanticUiTransition.semanticUiTransitionBooleans.`false`
import typingsSlinky.semanticUiTransition.semanticUiTransitionStrings.auto
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Impl extends js.Object {
  /**
    * If enabled will allow same animation to be queued while it is already occurring
    */
  var allowRepeats: Boolean = js.native
  // region Transition Settings
  /**
    * Named animation event to used. Must be defined in CSS.
    *
    * @default 'fade'
    */
  var animation: String = js.native
  // endregion
  // region DOM Settings
  /**
    * Class names used to attach style to state
    */
  var className: ClassNameSettings = js.native
  /**
    * Debug output to console
    */
  var debug: Boolean = js.native
  /**
    * Specify the final display type (block, inline-block etc) so that it doesn't have to be calculated.
    *
    * @default false
    */
  var displayType: `false` | String = js.native
  /**
    * Duration of the CSS transition animation
    *
    * @default 500
    */
  var duration: Double = js.native
  // endregion
  // region Debug Settings
  var error: ErrorSettings = js.native
  /**
    * Interval in MS between each elements transition
    *
    * @default 0
    */
  var interval: Double = js.native
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
    * Show console.table output with performance metrics
    */
  var performance: Boolean = js.native
  /**
    * Whether to automatically queue animation if another is occurring
    */
  var queue: Boolean = js.native
  /**
    * When an interval is specified, sets order of animations. auto reverses only animations that are hiding.
    *
    * @default 'auto'
    */
  var reverse: auto | Boolean = js.native
  /**
    * Silences all console output including error messages, regardless of other debug settings.
    */
  var silent: Boolean = js.native
  /**
    * If enabled a timeout will be added to ensure animationend callback occurs even if element is hidden
    */
  var useFailSafe: Boolean = js.native
  /**
    * Debug output includes all internal behaviors
    */
  var verbose: Boolean = js.native
  /**
    * Callback on each transition complete
    */
  def onComplete(): Unit = js.native
  /**
    * Callback on each transition that changes visibility to hidden
    */
  def onHide(): Unit = js.native
  // endregion
  // region Callbacks
  /**
    * Callback on each transition that changes visibility to shown
    */
  def onShow(): Unit = js.native
  /**
    * Callback on animation start, useful for queued animations
    */
  def onStart(): Unit = js.native
}

object Impl {
  @scala.inline
  def apply(
    allowRepeats: Boolean,
    animation: String,
    className: ClassNameSettings,
    debug: Boolean,
    displayType: `false` | String,
    duration: Double,
    error: ErrorSettings,
    interval: Double,
    name: String,
    namespace: String,
    onComplete: () => Unit,
    onHide: () => Unit,
    onShow: () => Unit,
    onStart: () => Unit,
    performance: Boolean,
    queue: Boolean,
    reverse: auto | Boolean,
    silent: Boolean,
    useFailSafe: Boolean,
    verbose: Boolean
  ): Impl = {
    val __obj = js.Dynamic.literal(allowRepeats = allowRepeats.asInstanceOf[js.Any], animation = animation.asInstanceOf[js.Any], className = className.asInstanceOf[js.Any], debug = debug.asInstanceOf[js.Any], displayType = displayType.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], interval = interval.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], namespace = namespace.asInstanceOf[js.Any], onComplete = js.Any.fromFunction0(onComplete), onHide = js.Any.fromFunction0(onHide), onShow = js.Any.fromFunction0(onShow), onStart = js.Any.fromFunction0(onStart), performance = performance.asInstanceOf[js.Any], queue = queue.asInstanceOf[js.Any], reverse = reverse.asInstanceOf[js.Any], silent = silent.asInstanceOf[js.Any], useFailSafe = useFailSafe.asInstanceOf[js.Any], verbose = verbose.asInstanceOf[js.Any])
    __obj.asInstanceOf[Impl]
  }
  @scala.inline
  implicit class ImplOps[Self <: Impl] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowRepeats(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowRepeats")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAnimation(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClassName(value: ClassNameSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDebug(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debug")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDisplayType(value: `false` | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayType")(value.asInstanceOf[js.Any])
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
    def withInterval(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interval")(value.asInstanceOf[js.Any])
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
    def withOnComplete(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onComplete")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withOnHide(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onHide")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withOnShow(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onShow")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withOnStart(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onStart")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withPerformance(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("performance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQueue(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReverse(value: auto | Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reverse")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSilent(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("silent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUseFailSafe(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useFailSafe")(value.asInstanceOf[js.Any])
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

