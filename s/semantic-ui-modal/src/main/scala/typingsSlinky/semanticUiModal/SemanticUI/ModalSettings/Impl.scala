package typingsSlinky.semanticUiModal.SemanticUI.ModalSettings

import typingsSlinky.semanticUiDimmer.SemanticUI.DimmerSettings
import typingsSlinky.semanticUiModal.JQuery
import typingsSlinky.semanticUiModal.SemanticUI.Modal.ClassNameSettings
import typingsSlinky.semanticUiModal.SemanticUI.Modal.ErrorSettings
import typingsSlinky.semanticUiModal.SemanticUI.Modal.SelectorSettings
import typingsSlinky.semanticUiModal.semanticUiModalBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Impl extends js.Object {
  /**
    * If set to true will not close other visible modals when opening a new one
    *
    * @default false
    */
  var allowMultiple: Boolean = js.native
  /**
    * When true, the first form input inside the modal will receive focus when shown. Set this to false to prevent this behavior.
    *
    * @default true
    */
  var autofocus: Boolean = js.native
  var className: ClassNameSettings = js.native
  /**
    * Setting to false will not allow you to close the modal by clicking on the dimmer
    *
    * @default true
    */
  var closable: Boolean = js.native
  /**
    * Selector or jquery object specifying the area to dim
    *
    * @default 'body'
    */
  var context: String | JQuery = js.native
  /**
    * Debug output to console
    */
  var debug: Boolean = js.native
  // region Modal Settings
  /**
    * If set to false will prevent the modal from being moved to inside the dimmer
    *
    * @default true
    */
  var detachable: Boolean = js.native
  /**
    * You can specify custom settings to extend UI dimmer
    *
    * @see {@link http://semantic-ui.com/modules/dimmer.html}
    */
  var dimmerSettings: DimmerSettings = js.native
  /**
    * Duration of animation
    *
    * @default 400
    */
  var duration: Double = js.native
  // endregion
  // region Debug Settings
  var error: ErrorSettings = js.native
  /**
    * Whether to automatically bind keyboard shortcuts
    *
    * @default true
    */
  var keyboardShortcuts: Boolean = js.native
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
    * Whether any change in modal DOM should automatically refresh cached positions
    *
    * @default false
    */
  var observeChanges: Boolean = js.native
  /**
    * A vertical offset to allow for content outside of modal, for example a close button, to be centered.
    *
    * @default 0
    */
  var offset: Double = js.native
  /**
    * Show console.table output with performance metrics
    */
  var performance: Boolean = js.native
  /**
    * Whether additional animations should queue
    *
    * @default false
    */
  var queue: Boolean = js.native
  // endregion
  // region DOM Settings
  var selector: SelectorSettings = js.native
  /**
    * Silences all console output including error messages, regardless of other debug settings.
    */
  var silent: Boolean = js.native
  /**
    * Named transition to use when animating menu in and out, full list can be found in ui transitions docs.
    *
    * @default 'scale'
    * @see {@link http://semantic-ui.com/modules/transition.html}
    */
  var transition: String = js.native
  /**
    * Debug output includes all internal behaviors
    */
  var verbose: Boolean = js.native
  /**
    * Is called after a positive, approve or ok button is pressed. If the function returns false, the modal will not hide.
    */
  def onApprove($element: JQuery): `false` | Unit = js.native
  /**
    * Is called after a negative, deny or cancel button is pressed. If the function returns false the modal will not hide.
    */
  def onDeny($element: JQuery): `false` | Unit = js.native
  /**
    * Is called after a modal has finished hiding animation.
    */
  def onHidden(): Unit = js.native
  /**
    * Is called after a modal starts to hide. If the function returns false, the modal will not hide.
    */
  def onHide($element: JQuery): `false` | Unit = js.native
  // endregion
  // region Callbacks
  /**
    * Is called when a modal starts to show.
    */
  def onShow(): Unit = js.native
  /**
    * Is called after a modal has finished showing animating.
    */
  def onVisible(): Unit = js.native
}

object Impl {
  @scala.inline
  def apply(
    allowMultiple: Boolean,
    autofocus: Boolean,
    className: ClassNameSettings,
    closable: Boolean,
    context: String | JQuery,
    debug: Boolean,
    detachable: Boolean,
    dimmerSettings: DimmerSettings,
    duration: Double,
    error: ErrorSettings,
    keyboardShortcuts: Boolean,
    name: String,
    namespace: String,
    observeChanges: Boolean,
    offset: Double,
    onApprove: JQuery => `false` | Unit,
    onDeny: JQuery => `false` | Unit,
    onHidden: () => Unit,
    onHide: JQuery => `false` | Unit,
    onShow: () => Unit,
    onVisible: () => Unit,
    performance: Boolean,
    queue: Boolean,
    selector: SelectorSettings,
    silent: Boolean,
    transition: String,
    verbose: Boolean
  ): Impl = {
    val __obj = js.Dynamic.literal(allowMultiple = allowMultiple.asInstanceOf[js.Any], autofocus = autofocus.asInstanceOf[js.Any], className = className.asInstanceOf[js.Any], closable = closable.asInstanceOf[js.Any], context = context.asInstanceOf[js.Any], debug = debug.asInstanceOf[js.Any], detachable = detachable.asInstanceOf[js.Any], dimmerSettings = dimmerSettings.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], keyboardShortcuts = keyboardShortcuts.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], namespace = namespace.asInstanceOf[js.Any], observeChanges = observeChanges.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], onApprove = js.Any.fromFunction1(onApprove), onDeny = js.Any.fromFunction1(onDeny), onHidden = js.Any.fromFunction0(onHidden), onHide = js.Any.fromFunction1(onHide), onShow = js.Any.fromFunction0(onShow), onVisible = js.Any.fromFunction0(onVisible), performance = performance.asInstanceOf[js.Any], queue = queue.asInstanceOf[js.Any], selector = selector.asInstanceOf[js.Any], silent = silent.asInstanceOf[js.Any], transition = transition.asInstanceOf[js.Any], verbose = verbose.asInstanceOf[js.Any])
    __obj.asInstanceOf[Impl]
  }
  @scala.inline
  implicit class ImplOps[Self <: Impl] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowMultiple(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowMultiple")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAutofocus(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autofocus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClassName(value: ClassNameSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClosable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContext(value: String | JQuery): Self = {
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
    def withDetachable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("detachable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDimmerSettings(value: DimmerSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dimmerSettings")(value.asInstanceOf[js.Any])
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
    def withKeyboardShortcuts(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyboardShortcuts")(value.asInstanceOf[js.Any])
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
    def withOnApprove(value: JQuery => `false` | Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onApprove")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOnDeny(value: JQuery => `false` | Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDeny")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOnHidden(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onHidden")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withOnHide(value: JQuery => `false` | Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onHide")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOnShow(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onShow")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withOnVisible(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onVisible")(js.Any.fromFunction0(value))
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
    def withTransition(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transition")(value.asInstanceOf[js.Any])
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

