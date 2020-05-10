package typingsSlinky.semanticUiEmbed.SemanticUI.EmbedSettings

import typingsSlinky.semanticUiEmbed.SemanticUI.Embed.ClassNameSettings
import typingsSlinky.semanticUiEmbed.SemanticUI.Embed.ErrorSettings
import typingsSlinky.semanticUiEmbed.SemanticUI.Embed.MetadataSettings
import typingsSlinky.semanticUiEmbed.SemanticUI.Embed.ParametersSettings
import typingsSlinky.semanticUiEmbed.SemanticUI.Embed.SelectorSettings
import typingsSlinky.semanticUiEmbed.SemanticUI.Embed.TemplatesSettings
import typingsSlinky.semanticUiEmbed.semanticUiEmbedBooleans.`false`
import typingsSlinky.semanticUiEmbed.semanticUiEmbedStrings.auto
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Impl extends js.Object {
  // endregion
  // region Video Settings
  /**
    * Default setting auto will only autoplay content when a placeholder is specified. Setting to true or false will force autoplay.
    *
    * @default 'auto'
    */
  var autoplay: auto | Boolean = js.native
  /**
    * Whether to show networks branded UI like title cards, or after video calls to action.
    *
    * @default false
    */
  var brandedUI: Boolean = js.native
  /**
    * Class names used to attach style to state
    */
  var className: ClassNameSettings = js.native
  /**
    * Specifies a default chrome color with Vimeo or YouTube.
    *
    * @default '#444444'
    */
  var color: String = js.native
  /**
    * Debug output to console
    */
  var debug: Boolean = js.native
  // endregion
  // region Debug Settings
  var error: ErrorSettings = js.native
  /**
    * Whether to prefer HD content
    *
    * @default true
    */
  var hd: Boolean = js.native
  // region Embed Settings
  /**
    * Specifies an icon to use with placeholder content
    *
    * @default false
    */
  var icon: `false` | String = js.native
  /**
    * Specifies an id value to replace with the {id} value found in templated urls
    *
    * @default false
    */
  var id: `false` | String = js.native
  /**
    * HTML Data attributes used to store data
    */
  var metadata: MetadataSettings = js.native
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
    * Specify an object containing key/value pairs to add to the iframes GET parameters
    *
    * @default false
    */
  var parameters: `false` | ParametersSettings = js.native
  /**
    * Show console.table output with performance metrics
    */
  var performance: Boolean = js.native
  // endregion
  // region DOM Settings
  /**
    * DOM Selectors used internally
    */
  var selector: SelectorSettings = js.native
  /**
    * Silences all console output including error messages, regardless of other debug settings.
    */
  var silent: Boolean = js.native
  /**
    * Specifies a source to use, if no source is provided it will be determined from the domain of a specified url.
    *
    * @default false
    */
  var source: `false` | String = js.native
  var templates: TemplatesSettings = js.native
  /**
    * Specifies a url to use for embed
    *
    * @default false
    */
  var url: `false` | String = js.native
  /**
    * Debug output includes all internal behaviors
    */
  var verbose: Boolean = js.native
  // endregion
  // region Callbacks
  /**
    * Callback when iframe is generated
    */
  def onCreate(url: String): Unit = js.native
  /**
    * Whenever an iframe contents is shown
    */
  def onDisplay(): Unit = js.native
  /**
    * Callback when module parameters are determined. Allows you to adjust parameters at run time by returning a new parameters object.
    */
  def onEmbed(parameters: ParametersSettings): ParametersSettings = js.native
  /**
    * Callback immediately before Embed is removed from DOM
    */
  def onPlaceholderDisplay(): Unit = js.native
}

object Impl {
  @scala.inline
  def apply(
    autoplay: auto | Boolean,
    brandedUI: Boolean,
    className: ClassNameSettings,
    color: String,
    debug: Boolean,
    error: ErrorSettings,
    hd: Boolean,
    icon: `false` | String,
    id: `false` | String,
    metadata: MetadataSettings,
    name: String,
    namespace: String,
    onCreate: String => Unit,
    onDisplay: () => Unit,
    onEmbed: ParametersSettings => ParametersSettings,
    onPlaceholderDisplay: () => Unit,
    parameters: `false` | ParametersSettings,
    performance: Boolean,
    selector: SelectorSettings,
    silent: Boolean,
    source: `false` | String,
    templates: TemplatesSettings,
    url: `false` | String,
    verbose: Boolean
  ): Impl = {
    val __obj = js.Dynamic.literal(autoplay = autoplay.asInstanceOf[js.Any], brandedUI = brandedUI.asInstanceOf[js.Any], className = className.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], debug = debug.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], hd = hd.asInstanceOf[js.Any], icon = icon.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], namespace = namespace.asInstanceOf[js.Any], onCreate = js.Any.fromFunction1(onCreate), onDisplay = js.Any.fromFunction0(onDisplay), onEmbed = js.Any.fromFunction1(onEmbed), onPlaceholderDisplay = js.Any.fromFunction0(onPlaceholderDisplay), parameters = parameters.asInstanceOf[js.Any], performance = performance.asInstanceOf[js.Any], selector = selector.asInstanceOf[js.Any], silent = silent.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], templates = templates.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], verbose = verbose.asInstanceOf[js.Any])
    __obj.asInstanceOf[Impl]
  }
  @scala.inline
  implicit class ImplOps[Self <: Impl] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutoplay(value: auto | Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoplay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBrandedUI(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("brandedUI")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClassName(value: ClassNameSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(value.asInstanceOf[js.Any])
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
    def withHd(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIcon(value: `false` | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: `false` | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMetadata(value: MetadataSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metadata")(value.asInstanceOf[js.Any])
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
    def withOnCreate(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCreate")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOnDisplay(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDisplay")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withOnEmbed(value: ParametersSettings => ParametersSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onEmbed")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOnPlaceholderDisplay(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPlaceholderDisplay")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withParameters(value: `false` | ParametersSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parameters")(value.asInstanceOf[js.Any])
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
    def withSource(value: `false` | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTemplates(value: TemplatesSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("templates")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUrl(value: `false` | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
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

