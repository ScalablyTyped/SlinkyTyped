package typingsSlinky.semanticUiSidebar.SemanticUI.SidebarSettings

import typingsSlinky.semanticUiSidebar.JQuery
import typingsSlinky.semanticUiSidebar.SemanticUI.Sidebar.ClassNameSettings
import typingsSlinky.semanticUiSidebar.SemanticUI.Sidebar.DefaultTransitionSettings
import typingsSlinky.semanticUiSidebar.SemanticUI.Sidebar.ErrorSettings
import typingsSlinky.semanticUiSidebar.SemanticUI.Sidebar.RegExpSettings
import typingsSlinky.semanticUiSidebar.SemanticUI.Sidebar.SelectorSettings
import typingsSlinky.semanticUiSidebar.semanticUiSidebarStrings.auto
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Impl extends js.Object {
  // endregion
  // region DOM Settings
  var className: ClassNameSettings = js.native
  /**
    * Whether sidebar can be closed by clicking on page
    *
    * @default true
    */
  var closable: Boolean = js.native
  // region Behavior
  /**
    * Context which sidebar will appear inside
    *
    * @default 'body'
    */
  var context: String | JQuery = js.native
  /**
    * Debug output to console
    */
  var debug: Boolean = js.native
  /**
    * Default transitions for each direction and screen size, used with transition: auto
    */
  var defaultTransition: DefaultTransitionSettings = js.native
  /**
    * When sidebar is initialized without the proper HTML, using this option will defer creation of DOM to use requestAnimationFrame.
    *
    * @default false
    */
  var delaySetup: Boolean = js.native
  /**
    * Whether to dim page contents when sidebar is visible
    *
    * @default true
    */
  var dimPage: Boolean = js.native
  /**
    * Duration of sidebar animation when using legacy Javascript animation
    *
    * @default 500
    */
  var duration: Double = js.native
  /**
    * Easing to use when using legacy Javascript animation
    *
    * @default 'easeInOutQuint'
    */
  var easing: String = js.native
  // endregion
  // region Debug Settings
  var error: ErrorSettings = js.native
  /**
    * Whether multiple sidebars can be open at once
    *
    * @default false
    */
  var exclusive: Boolean = js.native
  /**
    * Named transition to use when animating when detecting mobile device. Defaults to 'auto' which selects transition from defaultTransition based on direction.
    *
    * @default 'auto'
    */
  var mobileTransition: String = js.native
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
  var regExp: RegExpSettings = js.native
  /**
    * Whether to return to original scroll position when sidebar is hidden, automatically occurs with transition: scale
    *
    * @default false
    */
  var returnScroll: Boolean = js.native
  /**
    * Whether to lock page scroll when sidebar is visible
    *
    * @default false
    */
  var scrollLock: Boolean = js.native
  var selector: SelectorSettings = js.native
  /**
    * Silences all console output including error messages, regardless of other debug settings.
    */
  var silent: Boolean = js.native
  // endregion
  // region Animation
  /**
    * Named transition to use when animating sidebar. Defaults to 'auto' which selects transition from defaultTransition based on direction.
    *
    * @default 'auto'
    */
  var transition: String = js.native
  /**
    * Whether Javascript animations should be used. Defaults to false. Setting to auto will use legacy animations only for browsers that do not support CSS transforms
    *
    * @default false
    */
  var useLegacy: auto | Boolean = js.native
  /**
    * Debug output includes all internal behaviors
    */
  var verbose: Boolean = js.native
  /**
    * Is called when a sidebar begins to hide or show
    */
  def onChange(): Unit = js.native
  /**
    * Is called after a sidebar has finished animating out.
    */
  def onHidden(): Unit = js.native
  /**
    * Is called before a sidebar begins to animate out.
    */
  def onHide(): Unit = js.native
  /**
    * Is called when a sidebar has finished animating in.
    */
  def onShow(): Unit = js.native
  // endregion
  // region Callbacks
  /**
    * Is called when a sidebar begins animating in.
    */
  def onVisible(): Unit = js.native
}

object Impl {
  @scala.inline
  def apply(
    className: ClassNameSettings,
    closable: Boolean,
    context: String | JQuery,
    debug: Boolean,
    defaultTransition: DefaultTransitionSettings,
    delaySetup: Boolean,
    dimPage: Boolean,
    duration: Double,
    easing: String,
    error: ErrorSettings,
    exclusive: Boolean,
    mobileTransition: String,
    name: String,
    namespace: String,
    onChange: () => Unit,
    onHidden: () => Unit,
    onHide: () => Unit,
    onShow: () => Unit,
    onVisible: () => Unit,
    performance: Boolean,
    regExp: RegExpSettings,
    returnScroll: Boolean,
    scrollLock: Boolean,
    selector: SelectorSettings,
    silent: Boolean,
    transition: String,
    useLegacy: auto | Boolean,
    verbose: Boolean
  ): Impl = {
    val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any], closable = closable.asInstanceOf[js.Any], context = context.asInstanceOf[js.Any], debug = debug.asInstanceOf[js.Any], defaultTransition = defaultTransition.asInstanceOf[js.Any], delaySetup = delaySetup.asInstanceOf[js.Any], dimPage = dimPage.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], easing = easing.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], exclusive = exclusive.asInstanceOf[js.Any], mobileTransition = mobileTransition.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], namespace = namespace.asInstanceOf[js.Any], onChange = js.Any.fromFunction0(onChange), onHidden = js.Any.fromFunction0(onHidden), onHide = js.Any.fromFunction0(onHide), onShow = js.Any.fromFunction0(onShow), onVisible = js.Any.fromFunction0(onVisible), performance = performance.asInstanceOf[js.Any], regExp = regExp.asInstanceOf[js.Any], returnScroll = returnScroll.asInstanceOf[js.Any], scrollLock = scrollLock.asInstanceOf[js.Any], selector = selector.asInstanceOf[js.Any], silent = silent.asInstanceOf[js.Any], transition = transition.asInstanceOf[js.Any], useLegacy = useLegacy.asInstanceOf[js.Any], verbose = verbose.asInstanceOf[js.Any])
    __obj.asInstanceOf[Impl]
  }
  @scala.inline
  implicit class ImplOps[Self <: Impl] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withDefaultTransition(value: DefaultTransitionSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultTransition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDelaySetup(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delaySetup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDimPage(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dimPage")(value.asInstanceOf[js.Any])
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
    def withMobileTransition(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mobileTransition")(value.asInstanceOf[js.Any])
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
    def withOnChange(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChange")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withOnHidden(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onHidden")(js.Any.fromFunction0(value))
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
    def withRegExp(value: RegExpSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("regExp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReturnScroll(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("returnScroll")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScrollLock(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollLock")(value.asInstanceOf[js.Any])
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
    def withUseLegacy(value: auto | Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useLegacy")(value.asInstanceOf[js.Any])
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

