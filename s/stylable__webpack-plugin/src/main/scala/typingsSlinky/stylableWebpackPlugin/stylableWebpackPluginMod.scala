package typingsSlinky.stylableWebpackPlugin

import typingsSlinky.stylableCore.mod.Stylable
import typingsSlinky.stylableWebpackPlugin.anon.Options
import typingsSlinky.stylableWebpackPlugin.anon.ShallowPartialStylableWeb
import typingsSlinky.stylableWebpackPlugin.stylableBootstrapModuleMod.StylableBootstrapModule
import typingsSlinky.stylableWebpackPlugin.typesMod.StylableWebpackPluginOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stylableWebpackPluginMod {
  
  @JSImport("@stylable/webpack-plugin/cjs/stylable-webpack-plugin", "StylableWebpackPlugin")
  @js.native
  class StylableWebpackPlugin () extends StObject {
    def this(options: ShallowPartialStylableWeb) = this()
    
    @JSName("apply")
    def apply(
      compiler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.Compiler */ js.Any
    ): Unit = js.native
    
    def applyDeprecatedProcess(
      chunks: js.Array[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.compilation.Chunk */ _
        ],
      compiler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.Compiler */ js.Any,
      compilation: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.compilation.Compilation */ js.Any
    ): Unit = js.native
    
    def createBootstrapModule(
      compiler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.Compiler */ js.Any,
      chunk: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.compilation.Chunk */ js.Any
    ): StylableBootstrapModule = js.native
    
    def createChunkCSSBundle(
      chunk: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.compilation.Chunk */ js.Any,
      compilation: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.compilation.Compilation */ js.Any
    ): Unit = js.native
    
    def createStylable(
      compiler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.Compiler */ js.Any
    ): Unit = js.native
    
    def injectChunkOptimizer(
      compiler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.Compiler */ js.Any
    ): Unit = js.native
    
    def injectInitToEntryModule(
      chunk: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.compilation.Chunk */ js.Any,
      compilation: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.compilation.Compilation */ js.Any
    ): Unit = js.native
    
    def injectPlugins(
      compiler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.Compiler */ js.Any
    ): Unit = js.native
    
    def injectRuntimeCodeToMainTemplate(
      compiler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.Compiler */ js.Any,
      compilation: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.compilation.Compilation */ js.Any
    ): Unit = js.native
    
    def injectRuntimeSource(
      _compiler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.Compiler */ js.Any,
      compilation: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.compilation.Compilation */ js.Any
    ): Unit = js.native
    
    def injectStylableCSSOptimizer(
      compiler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.Compiler */ js.Any
    ): Unit = js.native
    
    def injectStylableCompilation(
      compiler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.Compiler */ js.Any
    ): Unit = js.native
    
    def injectStylableModuleRuleSet(
      compiler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.Compiler */ js.Any
    ): Unit = js.native
    
    def injectStylableRuntimeChunk(
      compiler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.Compiler */ js.Any
    ): Unit = js.native
    
    def injectStylableRuntimeInfo(
      compiler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.Compiler */ js.Any
    ): Unit = js.native
    
    def loadLocalStylableConfig(dir: String): js.UndefOr[Options] = js.native
    
    def normalizeOptions(): Unit = js.native
    @JSName("normalizeOptions")
    def normalizeOptions_mode(
      mode: /* import warning: importer.ImportType#apply Failed type conversion: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.Configuration * / any['mode'] */ js.Any
    ): Unit = js.native
    
    def optimizeChunks(
      chunks: js.Array[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.compilation.Chunk */ _
        ]
    ): Unit = js.native
    
    var options: StylableWebpackPluginOptions = js.native
    
    def overrideOptionsWithLocalConfig(context: String): Unit = js.native
    
    var processStylableModuleAssets: js.Any = js.native
    
    var stylable: Stylable = js.native
    
    var userOptions: js.Any = js.native
  }
}
