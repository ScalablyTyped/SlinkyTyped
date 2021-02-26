package typingsSlinky.webpackSources

import typingsSlinky.node.Buffer
import typingsSlinky.sourceMap.mod.RawSourceMap
import typingsSlinky.webpackSources.libMod.MapOptions
import typingsSlinky.webpackSources.libMod.SourceAndMapMixin
import typingsSlinky.webpackSources.libMod.SourceAndMapResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object originalSourceMod {
  
  /**
    * Represents source code, which is a copy of the original file
    */
  @JSImport("webpack-sources/lib/OriginalSource", JSImport.Namespace)
  @js.native
  class ^ protected () extends OriginalSource {
    /**
      * OriginalSource tries to create column mappings if requested, by splitting the source code at typical statement borders (;, {, }).
      */
    def this(sourceCode: String, name: String) = this()
    def this(sourceCode: Buffer, name: String) = this()
  }
  
  /**
    * Represents source code, which is a copy of the original file
    */
  @js.native
  trait OriginalSource
    extends typingsSlinky.webpackSources.sourceMod.^
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
}
