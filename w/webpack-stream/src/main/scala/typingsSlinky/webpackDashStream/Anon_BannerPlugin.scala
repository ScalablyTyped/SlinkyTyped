package typingsSlinky.webpackDashStream

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.webpack.webpackMod.Compiler
import typingsSlinky.webpack.webpackMod.Compiler.Handler
import typingsSlinky.webpack.webpackMod.Compiler.Watching
import typingsSlinky.webpack.webpackMod.Configuration
import typingsSlinky.webpack.webpackMod.ConfigurationFactory
import typingsSlinky.webpack.webpackMod.MultiCompiler
import typingsSlinky.webpack.webpackMod.MultiConfigurationFactory
import typingsSlinky.webpack.webpackMod.MultiWatching
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_BannerPlugin extends js.Object {
  /**
    * Plugins
    */
  var BannerPlugin: Instantiable1[/* options */ String, typingsSlinky.webpack.webpackMod.BannerPlugin] = js.native
  var Compiler: Instantiable0[typingsSlinky.webpack.webpackMod.Compiler] with TypeofCompiler = js.native
  var ContextReplacementPlugin: Instantiable1[
    /* resourceRegExp */ js.Any, 
    typingsSlinky.webpack.webpackMod.ContextReplacementPlugin
  ] = js.native
  var DefinePlugin: Instantiable1[
    /* definitions */ StringDictionary[js.Any], 
    typingsSlinky.webpack.webpackMod.DefinePlugin
  ] = js.native
  var DllPlugin: Instantiable1[
    /* options */ typingsSlinky.webpack.webpackMod.DllPlugin.Options, 
    typingsSlinky.webpack.webpackMod.DllPlugin
  ] = js.native
  var DllReferencePlugin: Instantiable1[
    /* options */ typingsSlinky.webpack.webpackMod.DllReferencePlugin.Options, 
    typingsSlinky.webpack.webpackMod.DllReferencePlugin
  ] = js.native
  var EnvironmentPlugin: Instantiable1[/* envs */ js.Array[String], typingsSlinky.webpack.webpackMod.EnvironmentPlugin] = js.native
  var EvalSourceMapDevToolPlugin: Instantiable0[typingsSlinky.webpack.webpackMod.EvalSourceMapDevToolPlugin] = js.native
  var ExtendedAPIPlugin: Instantiable0[typingsSlinky.webpack.webpackMod.ExtendedAPIPlugin] = js.native
  var HashedModuleIdsPlugin: Instantiable0[typingsSlinky.webpack.webpackMod.HashedModuleIdsPlugin] = js.native
  var HotModuleReplacementPlugin: Instantiable0[typingsSlinky.webpack.webpackMod.HotModuleReplacementPlugin] = js.native
  val ICompiler: js.Any = js.native
  var IgnorePlugin: Instantiable1[/* requestRegExp */ js.Any, typingsSlinky.webpack.webpackMod.IgnorePlugin] = js.native
  var LoaderOptionsPlugin: Instantiable1[/* options */ js.Any, typingsSlinky.webpack.webpackMod.LoaderOptionsPlugin] = js.native
  var MultiCompiler: Instantiable0[typingsSlinky.webpack.webpackMod.MultiCompiler] = js.native
  var MultiWatching: Instantiable0[typingsSlinky.webpack.webpackMod.MultiWatching] = js.native
  var NamedChunksPlugin: Instantiable0[typingsSlinky.webpack.webpackMod.NamedChunksPlugin] = js.native
  /** @deprecated use config.optimization.namedModules */
  var NamedModulesPlugin: Instantiable0[typingsSlinky.webpack.webpackMod.NamedModulesPlugin] = js.native
  /** @deprecated use config.optimization.noEmitOnErrors */
  var NoEmitOnErrorsPlugin: Instantiable0[typingsSlinky.webpack.webpackMod.NoEmitOnErrorsPlugin] = js.native
  var NormalModuleReplacementPlugin: Instantiable2[
    /* resourceRegExp */ js.Any, 
    /* newResource */ js.Any, 
    typingsSlinky.webpack.webpackMod.NormalModuleReplacementPlugin
  ] = js.native
  val Options: js.Any = js.native
  var Plugin: Instantiable0[typingsSlinky.webpack.webpackMod.Plugin] = js.native
  var PrefetchPlugin: Instantiable2[
    /* context */ js.Any, 
    /* request */ js.Any, 
    typingsSlinky.webpack.webpackMod.PrefetchPlugin
  ] = js.native
  var ProgressPlugin: Instantiable0[typingsSlinky.webpack.webpackMod.ProgressPlugin] = js.native
  var ProvidePlugin: Instantiable1[
    /* definitions */ StringDictionary[js.Any], 
    typingsSlinky.webpack.webpackMod.ProvidePlugin
  ] = js.native
  var ResolvePlugin: Instantiable0[typingsSlinky.webpack.webpackMod.ResolvePlugin] = js.native
  var SingleEntryPlugin: Instantiable3[
    /* context */ String, 
    /* entry */ String, 
    /* name */ String, 
    typingsSlinky.webpack.webpackMod.SingleEntryPlugin
  ] = js.native
  var SourceMapDevToolPlugin: Instantiable0[typingsSlinky.webpack.webpackMod.SourceMapDevToolPlugin] = js.native
  var SplitChunksPlugin: Instantiable0[typingsSlinky.webpack.webpackMod.SplitChunksPlugin] = js.native
  var Stats: TypeofClassStats = js.native
  val Template: TypeofTemplate = js.native
  var WatchIgnorePlugin: Instantiable1[
    /* paths */ js.Array[String | js.RegExp], 
    typingsSlinky.webpack.webpackMod.WatchIgnorePlugin
  ] = js.native
  val compilation: Typeofcompilation = js.native
  /** @deprecated */
  val compiler: js.Any = js.native
  val debug: Typeofdebug = js.native
  val dependencies: js.Any = js.native
  val loader: js.Any = js.native
  val optimize: Typeofoptimize = js.native
  /** Webpack package version. */
  val version: js.UndefOr[String] = js.native
  def apply(): Compiler = js.native
  def apply(
    options: ConfigurationFactory | MultiConfigurationFactory,
    handler: Handler | typingsSlinky.webpack.webpackMod.MultiCompiler.Handler
  ): MultiWatching | MultiCompiler = js.native
  def apply(options: js.Array[Configuration]): MultiCompiler = js.native
  def apply(options: js.Array[Configuration], handler: typingsSlinky.webpack.webpackMod.MultiCompiler.Handler): MultiWatching | MultiCompiler = js.native
  def apply(options: Configuration): Compiler = js.native
  def apply(options: Configuration, handler: Handler): Watching | Compiler = js.native
}

