package typingsSlinky.webpackSources.sourceMapSourceMod

import typingsSlinky.sourceMap.mod.RawSourceMap
import typingsSlinky.webpackSources.libMod.MapOptions
import typingsSlinky.webpackSources.libMod.SourceAndMapMixin
import typingsSlinky.webpackSources.libMod.SourceAndMapResult
import typingsSlinky.webpackSources.sourceMod.Source
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents source code with SourceMap, optionally having an additional SourceMap for the original source.
  */
@js.native
trait SourceMapSource
  extends Source
     with SourceAndMapMixin {
  
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
