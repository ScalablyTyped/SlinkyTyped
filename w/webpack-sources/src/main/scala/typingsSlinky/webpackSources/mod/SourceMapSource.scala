package typingsSlinky.webpackSources.mod

import typingsSlinky.sourceListMap.mod.SourceListMap
import typingsSlinky.sourceMap.mod.RawSourceMap
import typingsSlinky.sourceMap.mod.SourceMapGenerator
import typingsSlinky.webpackSources.anon.Columns
import typingsSlinky.webpackSources.anon.Map
import typingsSlinky.webpackSources.anon.Module
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("webpack-sources", "SourceMapSource")
@js.native
class SourceMapSource protected ()
  extends Source
     with SourceAndMapMixin {
  def this(value: String, name: String, sourceMap: RawSourceMap) = this()
  def this(value: String, name: String, sourceMap: SourceMapGenerator) = this()
  def this(value: String, name: String, sourceMap: RawSourceMap, originalSource: String) = this()
  def this(value: String, name: String, sourceMap: SourceMapGenerator, originalSource: String) = this()
  def this(
    value: String,
    name: String,
    sourceMap: RawSourceMap,
    originalSource: String,
    innerSourceMap: RawSourceMap
  ) = this()
  def this(
    value: String,
    name: String,
    sourceMap: SourceMapGenerator,
    originalSource: String,
    innerSourceMap: RawSourceMap
  ) = this()
  def this(
    value: String,
    name: String,
    sourceMap: RawSourceMap,
    originalSource: String,
    innerSourceMap: RawSourceMap,
    removeOriginalSource: Boolean
  ) = this()
  def this(
    value: String,
    name: String,
    sourceMap: SourceMapGenerator,
    originalSource: String,
    innerSourceMap: RawSourceMap,
    removeOriginalSource: Boolean
  ) = this()
  var _innerSourceMap: RawSourceMap = js.native
  var _name: String = js.native
  var _originalSource: String = js.native
  var _sourceMap: SourceMapGenerator | RawSourceMap = js.native
  var _value: String = js.native
  def listMap(options: Module): SourceListMap = js.native
  /* CompleteClass */
  override def map(options: Columns): RawSourceMap = js.native
  /* CompleteClass */
  override def sourceAndMap(options: Columns): Map = js.native
}

