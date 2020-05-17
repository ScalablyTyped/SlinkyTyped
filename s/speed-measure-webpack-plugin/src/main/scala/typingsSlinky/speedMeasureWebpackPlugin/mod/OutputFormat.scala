package typingsSlinky.speedMeasureWebpackPlugin.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.speedMeasureWebpackPlugin.speedMeasureWebpackPluginStrings.json
  - typingsSlinky.speedMeasureWebpackPlugin.speedMeasureWebpackPluginStrings.human
  - typingsSlinky.speedMeasureWebpackPlugin.speedMeasureWebpackPluginStrings.humanVerbose
  - js.Function1[/ * json * / js.Any, java.lang.String]
*/
trait OutputFormat extends js.Object

object OutputFormat {
  @scala.inline
  def json: typingsSlinky.speedMeasureWebpackPlugin.speedMeasureWebpackPluginStrings.json = "json".asInstanceOf[typingsSlinky.speedMeasureWebpackPlugin.speedMeasureWebpackPluginStrings.json]
  @scala.inline
  def human: typingsSlinky.speedMeasureWebpackPlugin.speedMeasureWebpackPluginStrings.human = "human".asInstanceOf[typingsSlinky.speedMeasureWebpackPlugin.speedMeasureWebpackPluginStrings.human]
  @scala.inline
  def humanVerbose: typingsSlinky.speedMeasureWebpackPlugin.speedMeasureWebpackPluginStrings.humanVerbose = "humanVerbose".asInstanceOf[typingsSlinky.speedMeasureWebpackPlugin.speedMeasureWebpackPluginStrings.humanVerbose]
  @scala.inline
  implicit def apply(value: js.Function1[/* json */ js.Any, String]): OutputFormat = value.asInstanceOf[OutputFormat]
}

