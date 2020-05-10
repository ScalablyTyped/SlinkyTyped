package typingsSlinky.semanticUiDimmer.SemanticUI.DimmerSettings

import typingsSlinky.semanticUiDimmer.SemanticUI.Dimmer.ClassNameSettings
import typingsSlinky.semanticUiDimmer.SemanticUI.Dimmer.DurationSettings
import typingsSlinky.semanticUiDimmer.SemanticUI.Dimmer.ErrorSettings
import typingsSlinky.semanticUiDimmer.SemanticUI.Dimmer.SelectorSettings
import typingsSlinky.semanticUiDimmer.SemanticUI.Dimmer.TemplateSettings
import typingsSlinky.semanticUiDimmer.semanticUiDimmerBooleans.`false`
import typingsSlinky.semanticUiDimmer.semanticUiDimmerStrings.auto
import typingsSlinky.semanticUiDimmer.semanticUiDimmerStrings.click
import typingsSlinky.semanticUiDimmer.semanticUiDimmerStrings.hover
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Impl extends js.Object {
  /**
    * Class names used to attach style to state
    */
  var className: ClassNameSettings = js.native
  /**
    * Whether clicking on the dimmer should hide the dimmer (Defaults to auto, closable only when settings.on is not hover
    *
    * @default 'auto'
    */
  var closable: auto | Boolean = js.native
  /**
    * Debug output to console
    */
  var debug: Boolean = js.native
  /**
    * If initializing a dimmer on a dimmable context, you can use dimmerName to distinguish between multiple dimmers in that context.
    *
    * @default false
    */
  var dimmerName: `false` | String = js.native
  /**
    * Animation duration of dimming. If an integer is used, that value will apply to both show and hide animations.
    */
  var duration: Double | DurationSettings = js.native
  // endregion
  // region Debug Settings
  /**
    * Error messages displayed to console
    */
  var error: ErrorSettings = js.native
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
    * Can be set to hover or click to show/hide dimmer on dimmable event
    *
    * @default false
    */
  var on: `false` | hover | click = js.native
  // region Behavior
  /**
    * Dimmers opacity from 0-1. Defaults to auto which uses the CSS specified opacity.
    *
    * @default 'auto'
    */
  var opacity: auto | Double = js.native
  /**
    * Show console.table output with performance metrics
    */
  var performance: Boolean = js.native
  // endregion
  // region DOM Settings
  /**
    * Object containing selectors used by module.
    */
  var selector: SelectorSettings = js.native
  /**
    * Silences all console output including error messages, regardless of other debug settings.
    */
  var silent: Boolean = js.native
  /**
    * Templates used to generate dimmer content
    */
  var template: TemplateSettings = js.native
  /**
    * Named transition to use when animating menu in and out. Fade and slide down are available without including ui transitions
    *
    * @default 'fade'
    * @see {@link http://semantic-ui.com/modules/transition.html}
    */
  var transition: String = js.native
  /**
    * Whether to dim dimmers using CSS transitions.
    *
    * @default true
    */
  var useCSS: Boolean = js.native
  /**
    * Specify a variation to add when generating dimmer, like inverted
    *
    * @default false
    */
  var variation: `false` | String = js.native
  /**
    * Debug output includes all internal behaviors
    */
  var verbose: Boolean = js.native
  /**
    * Callback on element show or hide
    */
  def onChange(): Unit = js.native
  /**
    * Callback on element hide
    */
  def onHide(): Unit = js.native
  // endregion
  // region Callbacks
  /**
    * Callback on element show
    */
  def onShow(): Unit = js.native
}

object Impl {
  @scala.inline
  def apply(
    className: ClassNameSettings,
    closable: auto | Boolean,
    debug: Boolean,
    dimmerName: `false` | String,
    duration: Double | DurationSettings,
    error: ErrorSettings,
    name: String,
    namespace: String,
    on: `false` | hover | click,
    onChange: () => Unit,
    onHide: () => Unit,
    onShow: () => Unit,
    opacity: auto | Double,
    performance: Boolean,
    selector: SelectorSettings,
    silent: Boolean,
    template: TemplateSettings,
    transition: String,
    useCSS: Boolean,
    variation: `false` | String,
    verbose: Boolean
  ): Impl = {
    val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any], closable = closable.asInstanceOf[js.Any], debug = debug.asInstanceOf[js.Any], dimmerName = dimmerName.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], namespace = namespace.asInstanceOf[js.Any], on = on.asInstanceOf[js.Any], onChange = js.Any.fromFunction0(onChange), onHide = js.Any.fromFunction0(onHide), onShow = js.Any.fromFunction0(onShow), opacity = opacity.asInstanceOf[js.Any], performance = performance.asInstanceOf[js.Any], selector = selector.asInstanceOf[js.Any], silent = silent.asInstanceOf[js.Any], template = template.asInstanceOf[js.Any], transition = transition.asInstanceOf[js.Any], useCSS = useCSS.asInstanceOf[js.Any], variation = variation.asInstanceOf[js.Any], verbose = verbose.asInstanceOf[js.Any])
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
    def withClosable(value: auto | Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDebug(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debug")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDimmerName(value: `false` | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dimmerName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDuration(value: Double | DurationSettings): Self = {
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
    def withOn(value: `false` | hover | click): Self = {
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
    def withOpacity(value: auto | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("opacity")(value.asInstanceOf[js.Any])
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
    def withTemplate(value: TemplateSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("template")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTransition(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUseCSS(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useCSS")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVariation(value: `false` | String): Self = {
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

