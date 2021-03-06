package typingsSlinky.webpackSources

import typingsSlinky.node.Buffer
import typingsSlinky.sourceMap.mod.RawSourceMap
import typingsSlinky.sourceMap.mod.SourceMapGenerator
import typingsSlinky.webpackSources.cachedSourceMod.^
import typingsSlinky.webpackSources.libMod.CachedData
import typingsSlinky.webpackSources.libMod.SourceLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Decorates a Source and caches returned results of map, source, size and sourceAndMap in memory.
    * Every other operation is delegated to the wrapped Source.
    */
  @JSImport("webpack-sources", "CachedSource")
  @js.native
  class CachedSource protected () extends ^ {
    def this(source: typingsSlinky.webpackSources.sourceMod.^) = this()
    def this(source: js.Function0[typingsSlinky.webpackSources.sourceMod.^], cachedData: CachedData) = this()
    def this(source: Null, cachedData: CachedData) = this()
  }
  
  @JSImport("webpack-sources", "CompatSource")
  @js.native
  class CompatSource protected ()
    extends typingsSlinky.webpackSources.compatSourceMod.^ {
    def this(sourceLike: SourceLike) = this()
  }
  object CompatSource {
    
    /* static member */
    @JSImport("webpack-sources", "CompatSource.from")
    @js.native
    def from(sourceLike: SourceLike): typingsSlinky.webpackSources.sourceMod.^ | typingsSlinky.webpackSources.compatSourceMod.CompatSource = js.native
  }
  
  /**
    * Concatenate multiple Sources or strings to a single source.
    */
  @JSImport("webpack-sources", "ConcatSource")
  @js.native
  class ConcatSource protected ()
    extends typingsSlinky.webpackSources.concatSourceMod.^ {
    def this(args: (String | typingsSlinky.webpackSources.sourceMod.^)*) = this()
  }
  
  /**
    * Represents source code, which is a copy of the original file
    */
  @JSImport("webpack-sources", "OriginalSource")
  @js.native
  class OriginalSource protected ()
    extends typingsSlinky.webpackSources.originalSourceMod.^ {
    /**
      * OriginalSource tries to create column mappings if requested, by splitting the source code at typical statement borders (;, {, }).
      */
    def this(sourceCode: String, name: String) = this()
    def this(sourceCode: Buffer, name: String) = this()
  }
  
  /**
    * Prefix every line of the decorated Source with a provided string.
    */
  @JSImport("webpack-sources", "PrefixSource")
  @js.native
  class PrefixSource protected ()
    extends typingsSlinky.webpackSources.prefixSourceMod.^ {
    def this(prefix: String, source: String) = this()
    def this(prefix: String, source: typingsSlinky.webpackSources.sourceMod.^) = this()
    def this(prefix: typingsSlinky.webpackSources.sourceMod.^, source: String) = this()
    def this(prefix: typingsSlinky.webpackSources.sourceMod.^, source: typingsSlinky.webpackSources.sourceMod.^) = this()
  }
  
  /**
    * Represents source code without SourceMap
    */
  @JSImport("webpack-sources", "RawSource")
  @js.native
  class RawSource protected ()
    extends typingsSlinky.webpackSources.rawSourceMod.^ {
    def this(value: String) = this()
  }
  
  /**
    * Decorates a Source with replacements and insertions of source code.
    *
    */
  @JSImport("webpack-sources", "ReplaceSource")
  @js.native
  class ReplaceSource protected ()
    extends typingsSlinky.webpackSources.replaceSourceMod.^ {
    /**
      * The ReplaceSource supports "identity" mappings for child source.
      * When original source matches generated source for a mapping it's assumed to be mapped char by char allowing to split mappings at replacements/insertions.
      */
    def this(source: typingsSlinky.webpackSources.sourceMod.^) = this()
    def this(source: typingsSlinky.webpackSources.sourceMod.^, name: String) = this()
  }
  
  @JSImport("webpack-sources", "SizeOnlySource")
  @js.native
  class SizeOnlySource protected ()
    extends typingsSlinky.webpackSources.sizeOnlySourceMod.^ {
    def this(size: Double) = this()
  }
  
  /**
    * Base class for all sources.
    * A Source can be asked for source code, size, source map and hash.
    */
  @JSImport("webpack-sources", "Source")
  @js.native
  abstract class Source ()
    extends typingsSlinky.webpackSources.sourceMod.^
  
  /**
    * Represents source code with SourceMap, optionally having an additional SourceMap for the original source.
    */
  @JSImport("webpack-sources", "SourceMapSource")
  @js.native
  class SourceMapSource protected ()
    extends typingsSlinky.webpackSources.sourceMapSourceMod.^ {
    def this(sourceCode: String, name: String, sourceMap: RawSourceMap) = this()
    def this(sourceCode: String, name: String, sourceMap: SourceMapGenerator) = this()
    def this(sourceCode: String, name: String, sourceMap: RawSourceMap, originalSource: String) = this()
    def this(sourceCode: String, name: String, sourceMap: SourceMapGenerator, originalSource: String) = this()
    def this(
      sourceCode: String,
      name: String,
      sourceMap: RawSourceMap,
      originalSource: js.UndefOr[scala.Nothing],
      innerSourceMap: String
    ) = this()
    def this(
      sourceCode: String,
      name: String,
      sourceMap: RawSourceMap,
      originalSource: js.UndefOr[scala.Nothing],
      innerSourceMap: RawSourceMap
    ) = this()
    def this(
      sourceCode: String,
      name: String,
      sourceMap: RawSourceMap,
      originalSource: String,
      innerSourceMap: String
    ) = this()
    def this(
      sourceCode: String,
      name: String,
      sourceMap: RawSourceMap,
      originalSource: String,
      innerSourceMap: RawSourceMap
    ) = this()
    def this(
      sourceCode: String,
      name: String,
      sourceMap: SourceMapGenerator,
      originalSource: js.UndefOr[scala.Nothing],
      innerSourceMap: String
    ) = this()
    def this(
      sourceCode: String,
      name: String,
      sourceMap: SourceMapGenerator,
      originalSource: js.UndefOr[scala.Nothing],
      innerSourceMap: RawSourceMap
    ) = this()
    def this(
      sourceCode: String,
      name: String,
      sourceMap: SourceMapGenerator,
      originalSource: String,
      innerSourceMap: String
    ) = this()
    def this(
      sourceCode: String,
      name: String,
      sourceMap: SourceMapGenerator,
      originalSource: String,
      innerSourceMap: RawSourceMap
    ) = this()
    def this(
      sourceCode: String,
      name: String,
      sourceMap: RawSourceMap,
      originalSource: js.UndefOr[scala.Nothing],
      innerSourceMap: js.UndefOr[scala.Nothing],
      removeOriginalSource: Boolean
    ) = this()
    def this(
      sourceCode: String,
      name: String,
      sourceMap: RawSourceMap,
      originalSource: js.UndefOr[scala.Nothing],
      innerSourceMap: String,
      removeOriginalSource: Boolean
    ) = this()
    def this(
      sourceCode: String,
      name: String,
      sourceMap: RawSourceMap,
      originalSource: js.UndefOr[scala.Nothing],
      innerSourceMap: RawSourceMap,
      removeOriginalSource: Boolean
    ) = this()
    def this(
      sourceCode: String,
      name: String,
      sourceMap: RawSourceMap,
      originalSource: String,
      innerSourceMap: js.UndefOr[scala.Nothing],
      removeOriginalSource: Boolean
    ) = this()
    def this(
      sourceCode: String,
      name: String,
      sourceMap: RawSourceMap,
      originalSource: String,
      innerSourceMap: String,
      removeOriginalSource: Boolean
    ) = this()
    def this(
      sourceCode: String,
      name: String,
      sourceMap: RawSourceMap,
      originalSource: String,
      innerSourceMap: RawSourceMap,
      removeOriginalSource: Boolean
    ) = this()
    def this(
      sourceCode: String,
      name: String,
      sourceMap: SourceMapGenerator,
      originalSource: js.UndefOr[scala.Nothing],
      innerSourceMap: js.UndefOr[scala.Nothing],
      removeOriginalSource: Boolean
    ) = this()
    def this(
      sourceCode: String,
      name: String,
      sourceMap: SourceMapGenerator,
      originalSource: js.UndefOr[scala.Nothing],
      innerSourceMap: String,
      removeOriginalSource: Boolean
    ) = this()
    def this(
      sourceCode: String,
      name: String,
      sourceMap: SourceMapGenerator,
      originalSource: js.UndefOr[scala.Nothing],
      innerSourceMap: RawSourceMap,
      removeOriginalSource: Boolean
    ) = this()
    def this(
      sourceCode: String,
      name: String,
      sourceMap: SourceMapGenerator,
      originalSource: String,
      innerSourceMap: js.UndefOr[scala.Nothing],
      removeOriginalSource: Boolean
    ) = this()
    def this(
      sourceCode: String,
      name: String,
      sourceMap: SourceMapGenerator,
      originalSource: String,
      innerSourceMap: String,
      removeOriginalSource: Boolean
    ) = this()
    def this(
      sourceCode: String,
      name: String,
      sourceMap: SourceMapGenerator,
      originalSource: String,
      innerSourceMap: RawSourceMap,
      removeOriginalSource: Boolean
    ) = this()
  }
}
