package typingsSlinky.webpack.mod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.webpack.mod.Options.Devtool
import typingsSlinky.webpack.mod.Options.Optimization
import typingsSlinky.webpack.mod.Options.Performance
import typingsSlinky.webpack.webpackBooleans.`false`
import typingsSlinky.webpack.webpackStrings.`async-node`
import typingsSlinky.webpack.webpackStrings.`electron-main`
import typingsSlinky.webpack.webpackStrings.`electron-preload`
import typingsSlinky.webpack.webpackStrings.`electron-renderer`
import typingsSlinky.webpack.webpackStrings.`node-webkit`
import typingsSlinky.webpack.webpackStrings.atom
import typingsSlinky.webpack.webpackStrings.development
import typingsSlinky.webpack.webpackStrings.electron
import typingsSlinky.webpack.webpackStrings.node
import typingsSlinky.webpack.webpackStrings.none
import typingsSlinky.webpack.webpackStrings.production
import typingsSlinky.webpack.webpackStrings.web
import typingsSlinky.webpack.webpackStrings.webworker
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Configuration extends js.Object {
  /** Set the value of require.amd and define.amd. */
  var amd: js.UndefOr[StringDictionary[Boolean]] = js.native
  /** Report the first error as a hard error instead of tolerating it. */
  var bail: js.UndefOr[Boolean] = js.native
  /** Cache generated modules and chunks to improve performance for multiple incremental builds. */
  var cache: js.UndefOr[Boolean | js.Object] = js.native
  /**
    * The base directory (absolute path!) for resolving the `entry` option.
    * If `output.pathinfo` is set, the included pathinfo is shortened to this directory.
    */
  var context: js.UndefOr[String] = js.native
  /** Choose a style of source mapping to enhance the debugging process. These values can affect build and rebuild speed dramatically. */
  var devtool: js.UndefOr[Devtool] = js.native
  var entry: js.UndefOr[String | js.Array[String] | Entry | EntryFunc] = js.native
  /**
    * Specify dependencies that shouldn’t be resolved by webpack, but should become dependencies of the resulting bundle.
    * The kind of the dependency depends on output.libraryTarget.
    */
  var externals: js.UndefOr[ExternalsElement | js.Array[ExternalsElement]] = js.native
  /** Enable production optimizations or development hints. */
  var mode: js.UndefOr[development | production | none] = js.native
  /** Options affecting the normal modules (NormalModuleFactory) */
  var module: js.UndefOr[Module] = js.native
  /** Name of the configuration. Used when loading multiple configurations. */
  var name: js.UndefOr[String] = js.native
  /** Include polyfills or mocks for various node stuff */
  var node: js.UndefOr[Node | `false`] = js.native
  /** Optimization options */
  var optimization: js.UndefOr[Optimization] = js.native
  /** Options affecting the output. */
  var output: js.UndefOr[Output] = js.native
  /** Limit the number of parallel processed modules. Can be used to fine tune performance or to get more reliable profiling results */
  var parallelism: js.UndefOr[Double] = js.native
  /** Performance options */
  var performance: js.UndefOr[Performance | `false`] = js.native
  /** Add additional plugins to the compiler. */
  var plugins: js.UndefOr[js.Array[Plugin]] = js.native
  /** Capture timing information for each module. */
  var profile: js.UndefOr[Boolean] = js.native
  /** Load compiler state from a json file. */
  var recordsInputPath: js.UndefOr[String] = js.native
  /** Store compiler state to a json file. */
  var recordsOutputPath: js.UndefOr[String] = js.native
  /** Used for recordsInputPath and recordsOutputPath */
  var recordsPath: js.UndefOr[String] = js.native
  /** Options affecting the resolving of modules. */
  var resolve: js.UndefOr[Resolve] = js.native
  /** Like resolve but for loaders. */
  var resolveLoader: js.UndefOr[ResolveLoader] = js.native
  /** Stats options for logging  */
  var stats: js.UndefOr[typingsSlinky.webpack.mod.Options.Stats] = js.native
  /**
    * - "web" Compile for usage in a browser-like environment (default).
    * - "webworker" Compile as WebWorker.
    * - "node" Compile for usage in a node.js-like environment (use require to load chunks).
    * - "async-node" Compile for usage in a node.js-like environment (use fs and vm to load chunks async).
    * - "node-webkit" Compile for usage in webkit, uses jsonp chunk loading but also supports builtin node.js modules plus require(“nw.gui”) (experimental)
    * - "atom" Compile for usage in electron (formerly known as atom-shell), supports require for modules necessary to run Electron.
    * - "electron-renderer" Compile for Electron for renderer process, providing a target using JsonpTemplatePlugin, FunctionModulePlugin for browser
    *   environments and NodeTargetPlugin and ExternalsPlugin for CommonJS and Electron built-in modules.
    * - "electron-preload" Compile for Electron for renderer process, providing a target using NodeTemplatePlugin with asyncChunkLoading set to true,
    *   FunctionModulePlugin for browser environments and NodeTargetPlugin and ExternalsPlugin for CommonJS and Electron built-in modules.
    * - "electron-main" Compile for Electron for main process.
    * - "atom" Alias for electron-main.
    * - "electron" Alias for electron-main.
    */
  var target: js.UndefOr[
    web | webworker | node | `async-node` | `node-webkit` | atom | electron | `electron-renderer` | `electron-preload` | `electron-main` | (js.Function1[/* compiler */ js.UndefOr[js.Any], Unit])
  ] = js.native
  /** Enter watch mode, which rebuilds on file change. */
  var watch: js.UndefOr[Boolean] = js.native
  var watchOptions: js.UndefOr[typingsSlinky.webpack.mod.Options.WatchOptions] = js.native
}

object Configuration {
  @scala.inline
  def apply(): Configuration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Configuration]
  }
  @scala.inline
  implicit class ConfigurationOps[Self <: Configuration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAmd(value: StringDictionary[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("amd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAmd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("amd")(js.undefined)
        ret
    }
    @scala.inline
    def withBail(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bail")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBail: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bail")(js.undefined)
        ret
    }
    @scala.inline
    def withCache(value: Boolean | js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cache")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCache: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cache")(js.undefined)
        ret
    }
    @scala.inline
    def withContext(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("context")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContext: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("context")(js.undefined)
        ret
    }
    @scala.inline
    def withDevtool(value: Devtool): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("devtool")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDevtool: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("devtool")(js.undefined)
        ret
    }
    @scala.inline
    def withEntryFunction0(value: () => String | js.Array[String] | Entry | (js.Promise[String | js.Array[String] | Entry])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entry")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withEntry(value: String | js.Array[String] | Entry | EntryFunc): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entry")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEntry: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entry")(js.undefined)
        ret
    }
    @scala.inline
    def withExternalsRegExp(value: js.RegExp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("externals")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExternalsFunction3(
      value: (/* context */ js.Any, /* request */ js.Any, /* callback */ js.Function2[/* error */ js.Any, /* result */ js.Any, Unit]) => js.Any
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("externals")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withExternals(value: ExternalsElement | js.Array[ExternalsElement]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("externals")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExternals: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("externals")(js.undefined)
        ret
    }
    @scala.inline
    def withMode(value: development | production | none): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mode")(js.undefined)
        ret
    }
    @scala.inline
    def withModule(value: Module): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("module")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutModule: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("module")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withNode(value: Node | `false`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("node")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("node")(js.undefined)
        ret
    }
    @scala.inline
    def withOptimization(value: Optimization): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("optimization")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOptimization: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("optimization")(js.undefined)
        ret
    }
    @scala.inline
    def withOutput(value: Output): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("output")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOutput: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("output")(js.undefined)
        ret
    }
    @scala.inline
    def withParallelism(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parallelism")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParallelism: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parallelism")(js.undefined)
        ret
    }
    @scala.inline
    def withPerformance(value: Performance | `false`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("performance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPerformance: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("performance")(js.undefined)
        ret
    }
    @scala.inline
    def withPlugins(value: js.Array[Plugin]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plugins")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlugins: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plugins")(js.undefined)
        ret
    }
    @scala.inline
    def withProfile(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("profile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProfile: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("profile")(js.undefined)
        ret
    }
    @scala.inline
    def withRecordsInputPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recordsInputPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRecordsInputPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recordsInputPath")(js.undefined)
        ret
    }
    @scala.inline
    def withRecordsOutputPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recordsOutputPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRecordsOutputPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recordsOutputPath")(js.undefined)
        ret
    }
    @scala.inline
    def withRecordsPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recordsPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRecordsPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recordsPath")(js.undefined)
        ret
    }
    @scala.inline
    def withResolve(value: Resolve): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolve")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResolve: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolve")(js.undefined)
        ret
    }
    @scala.inline
    def withResolveLoader(value: ResolveLoader): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolveLoader")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResolveLoader: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolveLoader")(js.undefined)
        ret
    }
    @scala.inline
    def withStats(value: typingsSlinky.webpack.mod.Options.Stats): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stats")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStats: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stats")(js.undefined)
        ret
    }
    @scala.inline
    def withTargetFunction1(value: /* compiler */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withTarget(
      value: web | webworker | node | `async-node` | `node-webkit` | atom | electron | `electron-renderer` | `electron-preload` | `electron-main` | (js.Function1[/* compiler */ js.UndefOr[js.Any], Unit])
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTarget: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target")(js.undefined)
        ret
    }
    @scala.inline
    def withWatch(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("watch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWatch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("watch")(js.undefined)
        ret
    }
    @scala.inline
    def withWatchOptions(value: typingsSlinky.webpack.mod.Options.WatchOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("watchOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWatchOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("watchOptions")(js.undefined)
        ret
    }
  }
  
}

