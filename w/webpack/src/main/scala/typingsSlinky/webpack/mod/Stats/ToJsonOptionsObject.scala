package typingsSlinky.webpack.mod.Stats

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ToJsonOptionsObject extends ToJsonOptions {
  /** fallback value for stats options when an option is not defined (has precedence over local webpack defaults) */
  var all: js.UndefOr[Boolean] = js.native
  /** Add asset Information */
  var assets: js.UndefOr[Boolean] = js.native
  /** Sort assets by a field */
  var assetsSort: js.UndefOr[String] = js.native
  /** Add built at time information */
  var builtAt: js.UndefOr[Boolean] = js.native
  /** Add information about cached (not built) modules */
  var cached: js.UndefOr[Boolean] = js.native
  /** Show cached assets (setting this to `false` only shows emitted files) */
  var cachedAssets: js.UndefOr[Boolean] = js.native
  /** Add children information */
  var children: js.UndefOr[Boolean] = js.native
  /** Add information about the `namedChunkGroups` */
  var chunkGroups: js.UndefOr[Boolean] = js.native
  /** Add built modules information to chunk information */
  var chunkModules: js.UndefOr[Boolean] = js.native
  /** Add the origins of chunks and chunk merging info */
  var chunkOrigins: js.UndefOr[Boolean] = js.native
  /** Add chunk information (setting this to `false` allows for a less verbose output) */
  var chunks: js.UndefOr[Boolean] = js.native
  /** Sort the chunks by a field */
  var chunksSort: js.UndefOr[String] = js.native
  /** Context directory for request shortening */
  var context: js.UndefOr[String] = js.native
  /** Display the distance from the entry point for each module */
  var depth: js.UndefOr[Boolean] = js.native
  /** Display the entry points with the corresponding bundles */
  var entrypoints: js.UndefOr[Boolean] = js.native
  /** Add --env information */
  var env: js.UndefOr[Boolean] = js.native
  /** Add details to errors (like resolving log) */
  var errorDetails: js.UndefOr[Boolean] = js.native
  /** Add errors */
  var errors: js.UndefOr[Boolean] = js.native
  /** See excludeModules */
  var exclude: js.UndefOr[StatsExcludeFilter] = js.native
  /** Exclude assets from being displayed in stats */
  var excludeAssets: js.UndefOr[StatsExcludeFilter] = js.native
  /** Exclude modules from being displayed in stats */
  var excludeModules: js.UndefOr[StatsExcludeFilter] = js.native
  /** Add the hash of the compilation */
  var hash: js.UndefOr[Boolean] = js.native
  /** Set the maximum number of modules to be shown */
  var maxModules: js.UndefOr[Double] = js.native
  /** Show dependencies and origin of warnings/errors */
  var moduleTrace: js.UndefOr[Boolean] = js.native
  /** Add built modules information */
  var modules: js.UndefOr[Boolean] = js.native
  /** Sort the modules by a field */
  var modulesSort: js.UndefOr[String] = js.native
  /** Show performance hint when file size exceeds `performance.maxAssetSize` */
  var performance: js.UndefOr[Boolean] = js.native
  /** Show the exports of the modules */
  var providedExports: js.UndefOr[Boolean] = js.native
  /** Add public path information */
  var publicPath: js.UndefOr[Boolean] = js.native
  /** Add information about the reasons why modules are included */
  var reasons: js.UndefOr[Boolean] = js.native
  /** Add the source code of modules */
  var source: js.UndefOr[Boolean] = js.native
  /** Add timing information */
  var timings: js.UndefOr[Boolean] = js.native
  /** Show which exports of a module are used */
  var usedExports: js.UndefOr[Boolean] = js.native
  /** Add webpack version information */
  var version: js.UndefOr[Boolean] = js.native
  /** Add warnings */
  var warnings: js.UndefOr[Boolean] = js.native
  /** Filter warnings to be shown */
  var warningsFilter: js.UndefOr[
    String | js.RegExp | (js.Array[String | js.RegExp]) | (js.Function1[/* warning */ String, Boolean])
  ] = js.native
}

object ToJsonOptionsObject {
  @scala.inline
  def apply(): ToJsonOptionsObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ToJsonOptionsObject]
  }
  @scala.inline
  implicit class ToJsonOptionsObjectOps[Self <: ToJsonOptionsObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAll(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("all")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAll: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("all")(js.undefined)
        ret
    }
    @scala.inline
    def withAssets(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("assets")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAssets: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("assets")(js.undefined)
        ret
    }
    @scala.inline
    def withAssetsSort(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("assetsSort")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAssetsSort: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("assetsSort")(js.undefined)
        ret
    }
    @scala.inline
    def withBuiltAt(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("builtAt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBuiltAt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("builtAt")(js.undefined)
        ret
    }
    @scala.inline
    def withCached(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cached")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCached: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cached")(js.undefined)
        ret
    }
    @scala.inline
    def withCachedAssets(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cachedAssets")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCachedAssets: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cachedAssets")(js.undefined)
        ret
    }
    @scala.inline
    def withChildren(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChildren: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(js.undefined)
        ret
    }
    @scala.inline
    def withChunkGroups(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chunkGroups")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChunkGroups: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chunkGroups")(js.undefined)
        ret
    }
    @scala.inline
    def withChunkModules(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chunkModules")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChunkModules: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chunkModules")(js.undefined)
        ret
    }
    @scala.inline
    def withChunkOrigins(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chunkOrigins")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChunkOrigins: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chunkOrigins")(js.undefined)
        ret
    }
    @scala.inline
    def withChunks(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chunks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChunks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chunks")(js.undefined)
        ret
    }
    @scala.inline
    def withChunksSort(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chunksSort")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChunksSort: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chunksSort")(js.undefined)
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
    def withDepth(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("depth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDepth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("depth")(js.undefined)
        ret
    }
    @scala.inline
    def withEntrypoints(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entrypoints")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEntrypoints: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entrypoints")(js.undefined)
        ret
    }
    @scala.inline
    def withEnv(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("env")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnv: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("env")(js.undefined)
        ret
    }
    @scala.inline
    def withErrorDetails(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorDetails")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutErrorDetails: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorDetails")(js.undefined)
        ret
    }
    @scala.inline
    def withErrors(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutErrors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errors")(js.undefined)
        ret
    }
    @scala.inline
    def withExcludeFunction1(value: /* assetName */ String => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exclude")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withExcludeRegExp(value: js.RegExp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exclude")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExclude(value: StatsExcludeFilter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exclude")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExclude: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exclude")(js.undefined)
        ret
    }
    @scala.inline
    def withExcludeAssetsFunction1(value: /* assetName */ String => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("excludeAssets")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withExcludeAssetsRegExp(value: js.RegExp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("excludeAssets")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExcludeAssets(value: StatsExcludeFilter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("excludeAssets")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExcludeAssets: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("excludeAssets")(js.undefined)
        ret
    }
    @scala.inline
    def withExcludeModulesFunction1(value: /* assetName */ String => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("excludeModules")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withExcludeModulesRegExp(value: js.RegExp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("excludeModules")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExcludeModules(value: StatsExcludeFilter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("excludeModules")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExcludeModules: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("excludeModules")(js.undefined)
        ret
    }
    @scala.inline
    def withHash(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hash")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHash: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hash")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxModules(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxModules")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxModules: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxModules")(js.undefined)
        ret
    }
    @scala.inline
    def withModuleTrace(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("moduleTrace")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutModuleTrace: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("moduleTrace")(js.undefined)
        ret
    }
    @scala.inline
    def withModules(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modules")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutModules: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modules")(js.undefined)
        ret
    }
    @scala.inline
    def withModulesSort(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modulesSort")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutModulesSort: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modulesSort")(js.undefined)
        ret
    }
    @scala.inline
    def withPerformance(value: Boolean): Self = {
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
    def withProvidedExports(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("providedExports")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProvidedExports: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("providedExports")(js.undefined)
        ret
    }
    @scala.inline
    def withPublicPath(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("publicPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPublicPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("publicPath")(js.undefined)
        ret
    }
    @scala.inline
    def withReasons(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reasons")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReasons: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reasons")(js.undefined)
        ret
    }
    @scala.inline
    def withSource(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source")(js.undefined)
        ret
    }
    @scala.inline
    def withTimings(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timings")(js.undefined)
        ret
    }
    @scala.inline
    def withUsedExports(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("usedExports")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUsedExports: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("usedExports")(js.undefined)
        ret
    }
    @scala.inline
    def withVersion(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(js.undefined)
        ret
    }
    @scala.inline
    def withWarnings(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("warnings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWarnings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("warnings")(js.undefined)
        ret
    }
    @scala.inline
    def withWarningsFilterFunction1(value: /* warning */ String => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("warningsFilter")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withWarningsFilterRegExp(value: js.RegExp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("warningsFilter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWarningsFilter(
      value: String | js.RegExp | (js.Array[String | js.RegExp]) | (js.Function1[/* warning */ String, Boolean])
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("warningsFilter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWarningsFilter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("warningsFilter")(js.undefined)
        ret
    }
  }
  
}

