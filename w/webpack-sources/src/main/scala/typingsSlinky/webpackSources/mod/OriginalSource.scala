package typingsSlinky.webpackSources.mod

import typingsSlinky.sourceMap.mod.SourceNode
import typingsSlinky.webpackSources.AnonColumns
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("webpack-sources", "OriginalSource")
@js.native
class OriginalSource protected ()
  extends Source
     with SourceAndMapMixin {
  def this(value: String, name: String) = this()
  var _name: String = js.native
  var _value: String = js.native
  def node(options: AnonColumns): SourceNode = js.native
}

