package typingsSlinky.webpackSources.mod

import typingsSlinky.sourceListMap.mod.SourceListMap
import typingsSlinky.sourceMap.mod.RawSourceMap
import typingsSlinky.sourceMap.mod.SourceMapGenerator
import typingsSlinky.webpackSources.AnonColumns
import typingsSlinky.webpackSources.AnonMap
import typingsSlinky.webpackSources.AnonModule
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
  def listMap(options: AnonModule): SourceListMap = js.native
  /* CompleteClass */
  override def map(options: AnonColumns): RawSourceMap = js.native
  /* CompleteClass */
  override def sourceAndMap(options: AnonColumns): AnonMap = js.native
}

