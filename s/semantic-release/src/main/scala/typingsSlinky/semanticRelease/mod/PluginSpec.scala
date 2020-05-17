package typingsSlinky.semanticRelease.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
	 * Specifies a plugin to use.
	 *
	 * The plugin is specified by its module name.
	 *
	 * To pass options to a plugin, specify an array containing the plugin module
	 * name and an options object.
	 */
/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - js.Tuple2[java.lang.String, js.Any]
*/
trait PluginSpec extends js.Object

object PluginSpec {
  @scala.inline
  implicit def apply(value: String): PluginSpec = value.asInstanceOf[PluginSpec]
  @scala.inline
  implicit def apply(value: js.Tuple2[String, js.Any]): PluginSpec = value.asInstanceOf[PluginSpec]
}

