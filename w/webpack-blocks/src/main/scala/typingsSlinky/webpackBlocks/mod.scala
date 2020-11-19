package typingsSlinky.webpackBlocks

import typingsSlinky.std.Plugin
import typingsSlinky.webpackBlocksAssets.mod.css.CssOptions
import typingsSlinky.webpackBlocksAssets.mod.css.FileOptions
import typingsSlinky.webpackBlocksAssets.mod.css.ModuleOptions
import typingsSlinky.webpackBlocksAssets.mod.css.UrlOptions
import typingsSlinky.webpackBlocksCore.mod.Block
import typingsSlinky.webpackBlocksCore.mod.Context
import typingsSlinky.webpackBlocksCore.mod.MatchOptions
import typingsSlinky.webpackBlocksDevServer.mod.Options
import typingsSlinky.webpackBlocksWebpack.mod.ConstantOptions
import typingsSlinky.webpackBlocksWebpack.mod.OptimizationOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("webpack-blocks", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def addPlugins(plugins: js.Array[Plugin]): Block[Context] = js.native
  
  def createConfig(configSetters: js.Array[Block[Context]]): js.Any = js.native
  def createConfig(configSetters: Block[Context]): js.Any = js.native
  
  def customConfig(wpConfig: js.Any): js.Any = js.native
  
  def defineConstants(constants: ConstantOptions): Block[Context] = js.native
  
  def entryPoint(entry: String): Block[Context] = js.native
  def entryPoint(
    entry: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Entry */ js.Any
  ): Block[Context] = js.native
  def entryPoint(entry: js.Array[String]): Block[Context] = js.native
  
  def env(envName: String, configSetters: js.Array[Block[Context]]): Block[Context] = js.native
  
  def file(): js.Any = js.native
  def file(options: FileOptions): js.Any = js.native
  
  def group(configSetters: js.Array[Block[Context]]): Block[Context] = js.native
  
  def `match`(test: String, configSetters: js.Array[Block[Context]]): Block[Context] = js.native
  def `match`(test: String, options: MatchOptions, configSetters: js.Array[Block[Context]]): Block[Context] = js.native
  def `match`(test: js.Array[String], configSetters: js.Array[Block[Context]]): Block[Context] = js.native
  def `match`(test: js.Array[String], options: MatchOptions, configSetters: js.Array[Block[Context]]): Block[Context] = js.native
  
  def optimization(optimizationOptions: OptimizationOptions): Block[Context] = js.native
  
  def performance(
    performanceBudget: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Options.Performance */ js.Any
  ): Block[Context] = js.native
  
  def resolve(
    config: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Resolve */ js.Any
  ): Block[Context] = js.native
  
  def setContext(contextPath: String): Block[Context] = js.native
  
  def setDevTool(devtool: String): Block[Context] = js.native
  
  def setEnv(constants: ConstantOptions): js.Any = js.native
  
  def setMode(mode: js.Any): Block[Context] = js.native
  
  def setOutput(): Block[Context] = js.native
  def setOutput(output: String): Block[Context] = js.native
  def setOutput(
    output: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Output */ js.Any
  ): Block[Context] = js.native
  
  def sourceMaps(): Block[Context] = js.native
  def sourceMaps(
    devtool: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Options.Devtool */ js.Any
  ): Block[Context] = js.native
  
  def url(): js.Any = js.native
  def url(options: UrlOptions): js.Any = js.native
  
  def when(condition: Boolean, configSetters: js.Array[Block[Context]]): Block[Context] = js.native
  
  @js.native
  object babel extends js.Object {
    
    def apply(): js.Any = js.native
    def apply(options: typingsSlinky.webpackBlocksBabel.mod.babel): js.Any = js.native
  }
  
  @js.native
  object css extends js.Object {
    
    def apply(): js.Any = js.native
    def apply(options: CssOptions): js.Any = js.native
    
    def modules(): js.Any = js.native
    def modules(options: ModuleOptions): js.Any = js.native
  }
  
  @js.native
  object devServer extends js.Object {
    
    def apply(): js.Any = js.native
    def apply(options: js.UndefOr[scala.Nothing], entry: String): js.Any = js.native
    def apply(options: js.UndefOr[scala.Nothing], entry: js.Array[String]): js.Any = js.native
    def apply(options: Options): js.Any = js.native
    def apply(options: Options, entry: String): js.Any = js.native
    def apply(options: Options, entry: js.Array[String]): js.Any = js.native
  }
  
  @js.native
  object extractText extends js.Object {
    
    def apply(): js.Any = js.native
    def apply(outputFilePattern: String): js.Any = js.native
  }
  
  @js.native
  object postcss extends js.Object {
    
    def apply(): js.Any = js.native
    def apply(options: typingsSlinky.webpackBlocksPostcss.mod.Options): js.Any = js.native
  }
  
  @js.native
  object sass extends js.Object {
    
    def apply(): js.Any = js.native
    def apply(options: typingsSlinky.webpackBlocksSass.mod.Options): js.Any = js.native
  }
  
  @js.native
  object typescript extends js.Object {
    
    def apply(): js.Any = js.native
    def apply(options: typingsSlinky.webpackBlocksTypescript.mod.Options): js.Any = js.native
  }
  
  @js.native
  object uglify extends js.Object {
    
    def apply(): js.Any = js.native
    def apply(options: typingsSlinky.webpackBlocksUglify.mod.Options): js.Any = js.native
  }
}
