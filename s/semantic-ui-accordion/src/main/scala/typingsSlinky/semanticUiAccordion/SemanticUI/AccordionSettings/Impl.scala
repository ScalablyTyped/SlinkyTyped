package typingsSlinky.semanticUiAccordion.SemanticUI.AccordionSettings

import typingsSlinky.semanticUiAccordion.SemanticUI.Accordion.ClassNameSettings
import typingsSlinky.semanticUiAccordion.SemanticUI.Accordion.ErrorSettings
import typingsSlinky.semanticUiAccordion.SemanticUI.Accordion.SelectorSettings
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Impl extends js.Object {
  /**
    * Whether child content opacity should be animated (may cause performance issues with many child elements)
    *
    * @default true
    */
  var animateChildren: Boolean = js.native
  /**
    * Class names used to determine element state
    */
  var className: ClassNameSettings = js.native
  /**
    * Close open nested accordion content when an element closes
    *
    * @default true
    */
  var closeNested: Boolean = js.native
  /**
    * Allow active sections to collapse
    *
    * @default true
    */
  var collapsible: Boolean = js.native
  /**
    * Debug output to console
    */
  var debug: Boolean = js.native
  /**
    * Duration in ms of opening animation
    *
    * @default 500
    */
  var duration: Double = js.native
  /**
    * Easing of opening animation. EaseInOutQuint is included with accordion, for additional options you must include easing equations.
    *
    * @default 'easeInOutQuint'
    * @see {@link http://gsgd.co.uk/sandbox/jquery/easing/}
    */
  var easing: String = js.native
  // endregion
  // region Debug Settings
  var error: ErrorSettings = js.native
  // region Behavior
  /**
    * Only allow one section open at a time
    *
    * @default true
    */
  var exclusive: Boolean = js.native
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
    * whether accordion should automatically refresh on DOM insertion
    *
    * @default true
    */
  var observeChanges: Boolean = js.native
  /**
    * Event on title that will cause accordion to open
    *
    * @default 'click'
    */
  var on: String = js.native
  /**
    * Show console.table output with performance metrics
    */
  var performance: Boolean = js.native
  // endregion
  // region DOM Settings
  /**
    * Selectors used to find parts of a module
    */
  var selector: SelectorSettings = js.native
  /**
    * Silences all console output including error messages, regardless of other debug settings.
    */
  var silent: Boolean = js.native
  /**
    * Debug output includes all internal behaviors
    */
  var verbose: Boolean = js.native
  /**
    * Callback on element open or close
    */
  def onChange(): Unit = js.native
  /**
    * Callback after element is closed
    */
  def onClose(): Unit = js.native
  /**
    * Callback before element closes
    */
  def onClosing(): Unit = js.native
  /**
    * Callback after element is open
    */
  def onOpen(): Unit = js.native
  // endregion
  // region Callbacks
  /**
    * Callback before element opens
    */
  def onOpening(): Unit = js.native
}

object Impl {
  @scala.inline
  def apply(
    animateChildren: Boolean,
    className: ClassNameSettings,
    closeNested: Boolean,
    collapsible: Boolean,
    debug: Boolean,
    duration: Double,
    easing: String,
    error: ErrorSettings,
    exclusive: Boolean,
    name: String,
    namespace: String,
    observeChanges: Boolean,
    on: String,
    onChange: () => Unit,
    onClose: () => Unit,
    onClosing: () => Unit,
    onOpen: () => Unit,
    onOpening: () => Unit,
    performance: Boolean,
    selector: SelectorSettings,
    silent: Boolean,
    verbose: Boolean
  ): Impl = {
    val __obj = js.Dynamic.literal(animateChildren = animateChildren.asInstanceOf[js.Any], className = className.asInstanceOf[js.Any], closeNested = closeNested.asInstanceOf[js.Any], collapsible = collapsible.asInstanceOf[js.Any], debug = debug.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], easing = easing.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], exclusive = exclusive.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], namespace = namespace.asInstanceOf[js.Any], observeChanges = observeChanges.asInstanceOf[js.Any], on = on.asInstanceOf[js.Any], onChange = js.Any.fromFunction0(onChange), onClose = js.Any.fromFunction0(onClose), onClosing = js.Any.fromFunction0(onClosing), onOpen = js.Any.fromFunction0(onOpen), onOpening = js.Any.fromFunction0(onOpening), performance = performance.asInstanceOf[js.Any], selector = selector.asInstanceOf[js.Any], silent = silent.asInstanceOf[js.Any], verbose = verbose.asInstanceOf[js.Any])
    __obj.asInstanceOf[Impl]
  }
  @scala.inline
  implicit class ImplOps[Self <: Impl] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnimateChildren(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animateChildren")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClassName(value: ClassNameSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCloseNested(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closeNested")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCollapsible(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collapsible")(value.asInstanceOf[js.Any])
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
    def withEasing(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("easing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withError(value: ErrorSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExclusive(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exclusive")(value.asInstanceOf[js.Any])
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
    def withOn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("on")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnChange(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChange")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withOnClose(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClose")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withOnClosing(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClosing")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withOnOpen(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onOpen")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withOnOpening(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onOpening")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withPerformance(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("performance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSelector(value: SelectorSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selector")(value.asInstanceOf[js.Any])
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

