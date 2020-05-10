package typingsSlinky.semanticUiPopup.SemanticUI.PopupSettings

import typingsSlinky.semanticUiPopup.JQuery
import typingsSlinky.semanticUiPopup.SemanticUI.Popup.ClassNameSettings
import typingsSlinky.semanticUiPopup.SemanticUI.Popup.DelaySettings
import typingsSlinky.semanticUiPopup.SemanticUI.Popup.ErrorSettings
import typingsSlinky.semanticUiPopup.SemanticUI.Popup.MetadataSettings
import typingsSlinky.semanticUiPopup.SemanticUI.Popup.SelectorSettings
import typingsSlinky.semanticUiPopup.semanticUiPopupBooleans.`false`
import typingsSlinky.semanticUiPopup.semanticUiPopupStrings.adjacent
import typingsSlinky.semanticUiPopup.semanticUiPopupStrings.auto
import typingsSlinky.semanticUiPopup.semanticUiPopupStrings.click
import typingsSlinky.semanticUiPopup.semanticUiPopupStrings.focus
import typingsSlinky.semanticUiPopup.semanticUiPopupStrings.hover
import typingsSlinky.semanticUiPopup.semanticUiPopupStrings.manual
import typingsSlinky.semanticUiPopup.semanticUiPopupStrings.opposite
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Impl extends js.Object {
  /**
    * When using on: 'hover' whether touchstart events should be added to allow the popup to be triggered
    */
  var addTouchEvents: Boolean = js.native
  /**
    * When the popup surpasses the boundary of this element, it will attempt to find another display position.
    */
  var boundary: String | JQuery = js.native
  /**
    * Class names used to attach style to state
    */
  var className: ClassNameSettings = js.native
  /**
    * When using on: 'click' specifies whether clicking the page should close the popup
    *
    * @default true
    */
  var closable: Boolean = js.native
  /**
    * Content to display
    */
  var content: String = js.native
  /**
    * Selector or jquery object specifying where the popup should be created.
    *
    * @default 'body'
    */
  var context: String | JQuery = js.native
  /**
    * Debug output to console
    */
  var debug: Boolean = js.native
  /**
    * Delay in milliseconds before showing or hiding a popup on hover or focus
    */
  var delay: DelaySettings = js.native
  /**
    * Offset for distance of popup from element
    *
    * @default 0
    */
  var distanceAway: Double = js.native
  /**
    * Duration of animation events
    *
    * @default 200
    */
  var duration: Double = js.native
  // endregion
  // region Debug Settings
  var error: ErrorSettings = js.native
  /**
    * Whether all other popups should be hidden when this popup is opened
    *
    * @default false
    */
  var exclusive: Boolean = js.native
  /**
    * Whether popup should hide on scroll or touchmove, auto only hides for popups without on: 'click'.
    * Set this to false to prevent mobile browsers from closing popups when you tap inside input fields.
    *
    * @default 'auto'
    */
  var hideOnScroll: auto | `false` = js.native
  /**
    * Whether popup should not close on hover (useful for popup navigation menus)
    *
    * @default false
    */
  var hoverable: Boolean = js.native
  /**
    * HTML content to display instead of preformatted title and content
    */
  var html: String | JQuery = js.native
  /**
    * If a popup is inline it will be created next to current element, allowing for local css rules to apply.
    * It will not be removed from the DOM after being hidden.
    * Otherwise popups will appended to body and removed after being hidden.
    *
    * @default false
    */
  var `inline`: Boolean = js.native
  /**
    * Number of pixels that a popup is allowed to appear outside the boundaries of its context.
    * This allows for permissible rounding errors when an element is against the edge of its context.
    *
    * @default 2
    */
  var jitter: Double = js.native
  /**
    * When set to false, a popup will not appear and produce an error message if it cannot entirely fit on page.
    * Setting this to a position like, right center forces the popup to use this position as a last resort even if it is partially offstage.
    * Setting this to true will use the last attempted position.
    *
    * @default false
    */
  var lastResort: Boolean | String = js.native
  /**
    * Number of iterations before giving up search for popup position when a popup cannot fit on screen
    *
    * @default 10
    */
  var maxSearchDepth: Double = js.native
  /**
    * HTML Data attributes used to store data
    */
  var metadata: MetadataSettings = js.native
  /**
    * Whether to move popup to same offset container as target element when popup already exists on the page.
    * Using a popup inside of an element without overflow:visible, like a sidebar, may require you to set this to false
    *
    * @default true
    */
  var movePopup: Boolean = js.native
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
    * Whether popup should attach mutationObservers to automatically run destroy when the element is removed from the page's DOM.
    *
    * @default true
    */
  var observeChanges: Boolean = js.native
  /**
    * Offset in pixels from calculated position
    *
    * @default 0
    */
  var offset: Double = js.native
  /**
    * Event used to trigger popup. Can be either focus, click, hover, or manual. Manual popups must be triggered with $('.element').popup('show');
    *
    * @default 'hover'
    */
  var on: focus | click | hover | manual = js.native
  /**
    * Show console.table output with performance metrics
    */
  var performance: Boolean = js.native
  // region Popup Settings
  /**
    * Can specify a DOM element that should be used as the popup. This is useful for including a pre-formatted popup.
    *
    * @default false
    */
  var popup: `false` | String | JQuery = js.native
  /**
    * Position that the popup should appear
    *
    * @default 'top left'
    */
  var position: String = js.native
  /**
    * Can be set to adjacent or opposite to prefer adjacent or opposite position if popup cannot fit on screen
    *
    * @default 'adjacent'
    */
  var prefer: adjacent | opposite = js.native
  /**
    * Whether popup contents should be preserved in the page after being hidden, allowing it to re-appear slightly faster on subsequent loads.
    *
    * @default false
    */
  var preserve: Boolean = js.native
  /**
    * Will automatically hide a popup on scroll event in this context
    */
  var scrollContext: String | JQuery = js.native
  // endregion
  // region DOM Settings
  /**
    * DOM Selectors used internally
    */
  var selector: SelectorSettings = js.native
  /**
    * Whether popup should set fluid popup variation width on load to avoid width: 100% including padding
    *
    * @default true
    */
  var setFluidWidth: Boolean = js.native
  /**
    * Silences all console output including error messages, regardless of other debug settings.
    */
  var silent: Boolean = js.native
  /**
    * If a selector or jQuery object is specified this allows the popup to be positioned relative to that element.
    *
    * @default false
    */
  var target: `false` | String | JQuery = js.native
  /**
    * Title to display alongside content
    */
  var title: String = js.native
  /**
    * Named transition to use when animating menu in and out. Fade and slide down are available without including ui transitions
    *
    * @default 'slide down'
    * @see {@link http://semantic-ui.com/modules/transition.html}
    */
  var transition: String = js.native
  // endregion
  // region Content Settings
  /**
    * Popup variation to use, can use multiple variations with a space delimiter
    */
  var variation: String = js.native
  /**
    * Debug output includes all internal behaviors
    */
  var verbose: Boolean = js.native
  // endregion
  // region Callbacks
  /**
    * Callback on popup element creation, with created popup
    */
  def onCreate($module: JQuery): Unit = js.native
  /**
    * Callback after popup is hidden
    */
  def onHidden($module: JQuery): Unit = js.native
  /**
    * Callback before popup is hidden. Returning false from this callback will cancel the popup from hiding.
    */
  def onHide($module: JQuery): `false` | Unit = js.native
  /**
    * Callback immediately before Popup is removed from DOM
    */
  def onRemove($module: JQuery): Unit = js.native
  /**
    * Callback before popup is shown. Returning false from this callback will cancel the popup from showing.
    */
  def onShow($module: JQuery): `false` | Unit = js.native
  /**
    * Callback after popup cannot be placed on screen
    */
  def onUnplaceable($module: JQuery): Unit = js.native
  /**
    * Callback after popup is shown
    */
  def onVisible($module: JQuery): Unit = js.native
}

object Impl {
  @scala.inline
  def apply(
    addTouchEvents: Boolean,
    boundary: String | JQuery,
    className: ClassNameSettings,
    closable: Boolean,
    content: String,
    context: String | JQuery,
    debug: Boolean,
    delay: DelaySettings,
    distanceAway: Double,
    duration: Double,
    error: ErrorSettings,
    exclusive: Boolean,
    hideOnScroll: auto | `false`,
    hoverable: Boolean,
    html: String | JQuery,
    `inline`: Boolean,
    jitter: Double,
    lastResort: Boolean | String,
    maxSearchDepth: Double,
    metadata: MetadataSettings,
    movePopup: Boolean,
    name: String,
    namespace: String,
    observeChanges: Boolean,
    offset: Double,
    on: focus | click | hover | manual,
    onCreate: JQuery => Unit,
    onHidden: JQuery => Unit,
    onHide: JQuery => `false` | Unit,
    onRemove: JQuery => Unit,
    onShow: JQuery => `false` | Unit,
    onUnplaceable: JQuery => Unit,
    onVisible: JQuery => Unit,
    performance: Boolean,
    popup: `false` | String | JQuery,
    position: String,
    prefer: adjacent | opposite,
    preserve: Boolean,
    scrollContext: String | JQuery,
    selector: SelectorSettings,
    setFluidWidth: Boolean,
    silent: Boolean,
    target: `false` | String | JQuery,
    title: String,
    transition: String,
    variation: String,
    verbose: Boolean
  ): Impl = {
    val __obj = js.Dynamic.literal(addTouchEvents = addTouchEvents.asInstanceOf[js.Any], boundary = boundary.asInstanceOf[js.Any], className = className.asInstanceOf[js.Any], closable = closable.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], context = context.asInstanceOf[js.Any], debug = debug.asInstanceOf[js.Any], delay = delay.asInstanceOf[js.Any], distanceAway = distanceAway.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], exclusive = exclusive.asInstanceOf[js.Any], hideOnScroll = hideOnScroll.asInstanceOf[js.Any], hoverable = hoverable.asInstanceOf[js.Any], html = html.asInstanceOf[js.Any], jitter = jitter.asInstanceOf[js.Any], lastResort = lastResort.asInstanceOf[js.Any], maxSearchDepth = maxSearchDepth.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], movePopup = movePopup.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], namespace = namespace.asInstanceOf[js.Any], observeChanges = observeChanges.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], on = on.asInstanceOf[js.Any], onCreate = js.Any.fromFunction1(onCreate), onHidden = js.Any.fromFunction1(onHidden), onHide = js.Any.fromFunction1(onHide), onRemove = js.Any.fromFunction1(onRemove), onShow = js.Any.fromFunction1(onShow), onUnplaceable = js.Any.fromFunction1(onUnplaceable), onVisible = js.Any.fromFunction1(onVisible), performance = performance.asInstanceOf[js.Any], popup = popup.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], prefer = prefer.asInstanceOf[js.Any], preserve = preserve.asInstanceOf[js.Any], scrollContext = scrollContext.asInstanceOf[js.Any], selector = selector.asInstanceOf[js.Any], setFluidWidth = setFluidWidth.asInstanceOf[js.Any], silent = silent.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], transition = transition.asInstanceOf[js.Any], variation = variation.asInstanceOf[js.Any], verbose = verbose.asInstanceOf[js.Any])
    __obj.updateDynamic("inline")(`inline`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Impl]
  }
  @scala.inline
  implicit class ImplOps[Self <: Impl] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddTouchEvents(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addTouchEvents")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBoundary(value: String | JQuery): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("boundary")(value.asInstanceOf[js.Any])
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
    def withContent(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("content")(value.asInstanceOf[js.Any])
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
    def withDelay(value: DelaySettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDistanceAway(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("distanceAway")(value.asInstanceOf[js.Any])
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
    def withExclusive(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exclusive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHideOnScroll(value: auto | `false`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideOnScroll")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHoverable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hoverable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHtml(value: String | JQuery): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("html")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInline(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inline")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withJitter(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jitter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLastResort(value: Boolean | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastResort")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaxSearchDepth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxSearchDepth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMetadata(value: MetadataSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metadata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMovePopup(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("movePopup")(value.asInstanceOf[js.Any])
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
    def withOn(value: focus | click | hover | manual): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("on")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnCreate(value: JQuery => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCreate")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOnHidden(value: JQuery => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onHidden")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOnHide(value: JQuery => `false` | Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onHide")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOnRemove(value: JQuery => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRemove")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOnShow(value: JQuery => `false` | Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onShow")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOnUnplaceable(value: JQuery => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onUnplaceable")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOnVisible(value: JQuery => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onVisible")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withPerformance(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("performance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPopup(value: `false` | String | JQuery): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("popup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPosition(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrefer(value: adjacent | opposite): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prefer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPreserve(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preserve")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScrollContext(value: String | JQuery): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollContext")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSelector(value: SelectorSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selector")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSetFluidWidth(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setFluidWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSilent(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("silent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTarget(value: `false` | String | JQuery): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTransition(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVariation(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("variation")(value.asInstanceOf[js.Any])
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

