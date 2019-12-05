package typingsSlinky.webpackDashSources.webpackDashSourcesMod

import typingsSlinky.sourceDashListDashMap.sourceDashListDashMapMod.SourceListMap
import typingsSlinky.sourceDashMap.sourceDashMapMod.RawSourceMap
import typingsSlinky.sourceDashMap.sourceDashMapMod.SourceMapGenerator
import typingsSlinky.webpackDashSources.Anon_Columns
import typingsSlinky.webpackDashSources.Anon_Map
import typingsSlinky.webpackDashSources.Anon_Module
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
  var _innerSourceMap: RawSourceMap = js.native
  var _name: String = js.native
  var _originalSource: String = js.native
  var _sourceMap: SourceMapGenerator | RawSourceMap = js.native
  var _value: String = js.native
  def listMap(options: Anon_Module): SourceListMap = js.native
  /* CompleteClass */
  override def map(options: Anon_Columns): RawSourceMap = js.native
  /* CompleteClass */
  override def sourceAndMap(options: Anon_Columns): Anon_Map = js.native
}

