package typingsSlinky.webpackSources.mod

import typingsSlinky.sourceMap.mod.RawSourceMap
import typingsSlinky.sourceMap.mod.SourceNode
import typingsSlinky.webpackSources.anon.Columns
import typingsSlinky.webpackSources.anon.Map
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
  /* CompleteClass */
  override def map(options: Columns): RawSourceMap = js.native
  def node(options: Columns): SourceNode = js.native
  /* CompleteClass */
  override def sourceAndMap(options: Columns): Map = js.native
}

