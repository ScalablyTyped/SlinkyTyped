package typingsSlinky.semanticUiEmbed.SemanticUI

import typingsSlinky.semanticUiEmbed.JQuery
import typingsSlinky.semanticUiEmbed.SemanticUI.Embed.ClassNameSettings
import typingsSlinky.semanticUiEmbed.SemanticUI.Embed.ErrorSettings
import typingsSlinky.semanticUiEmbed.SemanticUI.Embed.MetadataSettings
import typingsSlinky.semanticUiEmbed.SemanticUI.Embed.ParametersSettings
import typingsSlinky.semanticUiEmbed.SemanticUI.Embed.SelectorSettings
import typingsSlinky.semanticUiEmbed.SemanticUI.Embed.TemplatesSettings
import typingsSlinky.semanticUiEmbed.semanticUiEmbedBooleans.`false`
import typingsSlinky.semanticUiEmbed.semanticUiEmbedStrings.`get id`
import typingsSlinky.semanticUiEmbed.semanticUiEmbedStrings.`get placeholder`
import typingsSlinky.semanticUiEmbed.semanticUiEmbedStrings.`get sources`
import typingsSlinky.semanticUiEmbed.semanticUiEmbedStrings.`get type`
import typingsSlinky.semanticUiEmbed.semanticUiEmbedStrings.`get url`
import typingsSlinky.semanticUiEmbed.semanticUiEmbedStrings.`has placeholder`
import typingsSlinky.semanticUiEmbed.semanticUiEmbedStrings.auto
import typingsSlinky.semanticUiEmbed.semanticUiEmbedStrings.autoplay
import typingsSlinky.semanticUiEmbed.semanticUiEmbedStrings.brandedUI
import typingsSlinky.semanticUiEmbed.semanticUiEmbedStrings.change
import typingsSlinky.semanticUiEmbed.semanticUiEmbedStrings.className
import typingsSlinky.semanticUiEmbed.semanticUiEmbedStrings.color
import typingsSlinky.semanticUiEmbed.semanticUiEmbedStrings.debug
import typingsSlinky.semanticUiEmbed.semanticUiEmbedStrings.destroy
import typingsSlinky.semanticUiEmbed.semanticUiEmbedStrings.error
import typingsSlinky.semanticUiEmbed.semanticUiEmbedStrings.hd
import typingsSlinky.semanticUiEmbed.semanticUiEmbedStrings.hide
import typingsSlinky.semanticUiEmbed.semanticUiEmbedStrings.icon
import typingsSlinky.semanticUiEmbed.semanticUiEmbedStrings.id
import typingsSlinky.semanticUiEmbed.semanticUiEmbedStrings.metadata
import typingsSlinky.semanticUiEmbed.semanticUiEmbedStrings.name
import typingsSlinky.semanticUiEmbed.semanticUiEmbedStrings.namespace
import typingsSlinky.semanticUiEmbed.semanticUiEmbedStrings.onCreate
import typingsSlinky.semanticUiEmbed.semanticUiEmbedStrings.onDisplay
import typingsSlinky.semanticUiEmbed.semanticUiEmbedStrings.onEmbed
import typingsSlinky.semanticUiEmbed.semanticUiEmbedStrings.onPlaceholderDisplay
import typingsSlinky.semanticUiEmbed.semanticUiEmbedStrings.parameters
import typingsSlinky.semanticUiEmbed.semanticUiEmbedStrings.performance
import typingsSlinky.semanticUiEmbed.semanticUiEmbedStrings.reset
import typingsSlinky.semanticUiEmbed.semanticUiEmbedStrings.selector
import typingsSlinky.semanticUiEmbed.semanticUiEmbedStrings.setting
import typingsSlinky.semanticUiEmbed.semanticUiEmbedStrings.show
import typingsSlinky.semanticUiEmbed.semanticUiEmbedStrings.silent
import typingsSlinky.semanticUiEmbed.semanticUiEmbedStrings.source
import typingsSlinky.semanticUiEmbed.semanticUiEmbedStrings.templates
import typingsSlinky.semanticUiEmbed.semanticUiEmbedStrings.url
import typingsSlinky.semanticUiEmbed.semanticUiEmbedStrings.verbose
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Embed_ extends js.Object {
  var settings: EmbedSettings = js.native
  def apply(): JQuery = js.native
  /**
    * Returns current content id
    */
  def apply(behavior: `get id`): String = js.native
  /**
    * Returns placeholder image url
    */
  def apply(behavior: `get placeholder`): String = js.native
  /**
    * Returns source name
    */
  def apply(behavior: `get sources`): String = js.native
  /**
    * Returns source type
    */
  def apply(behavior: `get type`): String = js.native
  /**
    * Returns URL with all parameters added
    */
  def apply(behavior: `get url`): String = js.native
  /**
    * Returns whether embed content has placeholder
    */
  def apply(behavior: `has placeholder`): Boolean = js.native
  /**
    * Changes iframe to a new content source
    */
  def apply(behavior: change, source: String, id: String, url: String): JQuery = js.native
  /**
    * Destroys instance and removes all events
    */
  def apply(behavior: destroy): JQuery = js.native
  /**
    * Hides embed content and shows placeholder content
    */
  def apply(behavior: hide): JQuery = js.native
  /**
    * Removes embed and shows placeholder content if available
    */
  def apply(behavior: reset): JQuery = js.native
  def apply(behavior: setting, name: autoplay): auto | Boolean = js.native
  def apply(behavior: setting, name: autoplay, value: Boolean): JQuery = js.native
  def apply(behavior: setting, name: autoplay, value: auto): JQuery = js.native
  def apply(behavior: setting, name: brandedUI): Boolean = js.native
  def apply(behavior: setting, name: brandedUI, value: Boolean): JQuery = js.native
  def apply(behavior: setting, name: className): ClassNameSettings = js.native
  def apply(behavior: setting, name: className, value: ClassNameSettings): JQuery = js.native
  def apply(behavior: setting, name: color): String = js.native
  def apply(behavior: setting, name: color, value: String): JQuery = js.native
  def apply(behavior: setting, name: debug): Boolean = js.native
  def apply(behavior: setting, name: debug, value: Boolean): JQuery = js.native
  def apply(behavior: setting, name: error): ErrorSettings = js.native
  def apply(behavior: setting, name: error, value: ErrorSettings): JQuery = js.native
  def apply(behavior: setting, name: hd): Boolean = js.native
  def apply(behavior: setting, name: hd, value: Boolean): JQuery = js.native
  def apply(behavior: setting, name: icon): `false` | String = js.native
  def apply(behavior: setting, name: icon, value: String): JQuery = js.native
  def apply(behavior: setting, name: icon, value: `false`): JQuery = js.native
  def apply(behavior: setting, name: id): `false` | String = js.native
  def apply(behavior: setting, name: id, value: String): JQuery = js.native
  def apply(behavior: setting, name: id, value: `false`): JQuery = js.native
  def apply(behavior: setting, name: metadata): MetadataSettings = js.native
  def apply(behavior: setting, name: metadata, value: MetadataSettings): JQuery = js.native
  def apply(behavior: setting, name: name): String = js.native
  def apply(behavior: setting, name: namespace): String = js.native
  def apply(behavior: setting, name: namespace, value: String): JQuery = js.native
  def apply(behavior: setting, name: name, value: String): JQuery = js.native
  def apply(behavior: setting, name: onCreate): js.ThisFunction1[/* this */ JQuery, /* url */ String, Unit] = js.native
  def apply(
    behavior: setting,
    name: onCreate,
    value: js.ThisFunction1[/* this */ JQuery, /* url */ String, Unit]
  ): JQuery = js.native
  def apply(behavior: setting, name: onDisplay): js.ThisFunction0[/* this */ JQuery, Unit] = js.native
  def apply(behavior: setting, name: onDisplay, value: js.ThisFunction0[/* this */ JQuery, Unit]): JQuery = js.native
  def apply(behavior: setting, name: onEmbed): js.ThisFunction1[/* this */ JQuery, /* parameters */ ParametersSettings, ParametersSettings] = js.native
  def apply(
    behavior: setting,
    name: onEmbed,
    value: js.ThisFunction1[/* this */ JQuery, /* parameters */ ParametersSettings, ParametersSettings]
  ): JQuery = js.native
  def apply(behavior: setting, name: onPlaceholderDisplay): js.ThisFunction0[/* this */ JQuery, Unit] = js.native
  def apply(behavior: setting, name: onPlaceholderDisplay, value: js.ThisFunction0[/* this */ JQuery, Unit]): JQuery = js.native
  def apply(behavior: setting, name: parameters): `false` | ParametersSettings = js.native
  def apply(behavior: setting, name: parameters, value: ParametersSettings): JQuery = js.native
  def apply(behavior: setting, name: parameters, value: `false`): JQuery = js.native
  def apply(behavior: setting, name: performance): Boolean = js.native
  def apply(behavior: setting, name: performance, value: Boolean): JQuery = js.native
  def apply(behavior: setting, name: selector): SelectorSettings = js.native
  def apply(behavior: setting, name: selector, value: SelectorSettings): JQuery = js.native
  def apply(behavior: setting, name: silent): Boolean = js.native
  def apply(behavior: setting, name: silent, value: Boolean): JQuery = js.native
  def apply(behavior: setting, name: source): `false` | String = js.native
  def apply(behavior: setting, name: source, value: String): JQuery = js.native
  def apply(behavior: setting, name: source, value: `false`): JQuery = js.native
  def apply(behavior: setting, name: templates): TemplatesSettings = js.native
  def apply(behavior: setting, name: templates, value: TemplatesSettings): JQuery = js.native
  def apply(behavior: setting, name: url): `false` | String = js.native
  def apply(behavior: setting, name: url, value: String): JQuery = js.native
  def apply(behavior: setting, name: url, value: `false`): JQuery = js.native
  def apply(behavior: setting, name: verbose): Boolean = js.native
  def apply(behavior: setting, name: verbose, value: Boolean): JQuery = js.native
  def apply(behavior: setting, value: EmbedSettings): JQuery = js.native
  /**
    * Shows embed content
    */
  def apply(behavior: show): JQuery = js.native
  def apply(settings: EmbedSettings): JQuery = js.native
}

