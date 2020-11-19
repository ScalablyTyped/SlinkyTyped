package typingsSlinky.webpackSources.mod

import typingsSlinky.sourceListMap.mod.SourceListMap
import typingsSlinky.sourceMap.mod.RawSourceMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("webpack-sources", "ConcatSource")
@js.native
class ConcatSource protected ()
  extends Source
     with SourceAndMapMixin {
  def this(args: (String | Source)*) = this()
  
  /**
    * Adds an item to the source.
    */
  def add(item: String): Unit = js.native
  def add(item: Source): Unit = js.native
  
  var children: js.Array[String | Source] = js.native
  
  def listMap(options: MapOptions): SourceListMap = js.native
  
  /**
    * Returns the SourceMap of the represented source code as JSON.
    * May return `null` if no SourceMap is available.
    */
  /* InferMemberOverrides */
  override def map(): RawSourceMap | Null = js.native
  /* InferMemberOverrides */
  override def map(options: MapOptions): RawSourceMap | Null = js.native
  
  /**
    * Returns both, source code (like `Source.prototype.source()` and SourceMap (like `Source.prototype.map()`).
    * This method could have better performance than calling `source()` and `map()` separately.
    */
  /* InferMemberOverrides */
  override def sourceAndMap(): SourceAndMapResult = js.native
  /* InferMemberOverrides */
  override def sourceAndMap(options: MapOptions): SourceAndMapResult = js.native
}
