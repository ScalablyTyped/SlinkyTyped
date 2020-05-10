package typingsSlinky.webpackBundleAnalyzer.mod.BundleAnalyzerPlugin

import typingsSlinky.webpack.mod.Stats.ToJsonOptionsObject
import typingsSlinky.webpackBundleAnalyzer.webpackBundleAnalyzerStrings.auto
import typingsSlinky.webpackBundleAnalyzer.webpackBundleAnalyzerStrings.disabled
import typingsSlinky.webpackBundleAnalyzer.webpackBundleAnalyzerStrings.error
import typingsSlinky.webpackBundleAnalyzer.webpackBundleAnalyzerStrings.gzip
import typingsSlinky.webpackBundleAnalyzer.webpackBundleAnalyzerStrings.info
import typingsSlinky.webpackBundleAnalyzer.webpackBundleAnalyzerStrings.parsed
import typingsSlinky.webpackBundleAnalyzer.webpackBundleAnalyzerStrings.server
import typingsSlinky.webpackBundleAnalyzer.webpackBundleAnalyzerStrings.silent
import typingsSlinky.webpackBundleAnalyzer.webpackBundleAnalyzerStrings.stat
import typingsSlinky.webpackBundleAnalyzer.webpackBundleAnalyzerStrings.static
import typingsSlinky.webpackBundleAnalyzer.webpackBundleAnalyzerStrings.warn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  /**
    * Host that will be used in `server` mode to start HTTP server.
    * Defaults to 127.0.0.1
    */
  var analyzerHost: js.UndefOr[String] = js.native
  /**
    * Can be "server", "static" or "disabled".
    * Defaults to "server".
    * In "server" mode analyzer will start HTTP server to show bundle report.
    * In "static" mode single HTML file with bundle report will be generated.
    * In "disabled" mode you can use this plugin to just generate Webpack Stats JSON file by setting "generateStatsFile" to true.
    */
  var analyzerMode: js.UndefOr[server | static | disabled] = js.native
  /**
    * Port that will be used in `server` mode to start HTTP server.
    * Defaults to 8888
    */
  var analyzerPort: js.UndefOr[Double | auto] = js.native
  /**
    * Module sizes to show in report by default.
    * Should be one of "stat", "parsed" or "gzip".
    * Defaults to "parsed"
    */
  var defaultSizes: js.UndefOr[parsed | stat | gzip] = js.native
  /**
    * Default: `null`.
    * Patterns that will be used to match against asset names to exclude them from the report.
    * If pattern is a string it will be converted to RegExp via `new RegExp(str)`.
    * If pattern is a function it should have the following signature `(assetName: string) => boolean`
    * and should return true to exclude matching asset.
    * If multiple patterns are provided asset should match at least one of them to be excluded.
    */
  var excludeAssets: js.UndefOr[Null | ExcludeAssetsPattern | js.Array[ExcludeAssetsPattern]] = js.native
  /**
    * If true, Webpack Stats JSON file will be generated in bundles output directory.
    * Defaults to false
    */
  var generateStatsFile: js.UndefOr[Boolean] = js.native
  /**
    * Log level. Can be "info", "warn", "error" or "silent".
    * Defaults to "info"
    */
  var logLevel: js.UndefOr[info | warn | error | silent] = js.native
  /**
    * Automatically open report in default browser.
    * Defaults to true
    */
  var openAnalyzer: js.UndefOr[Boolean] = js.native
  /**
    * Path to bundle report file that will be generated in "static" mode.
    * Relative to bundles output directory.
    * Defaults to "report.html"
    */
  var reportFilename: js.UndefOr[String] = js.native
  /**
    * Name of Webpack Stats JSON file that will be generated if generateStatsFile is true.
    * Relative to bundles output directory.
    * Defaults to "stats.json"
    */
  var statsFilename: js.UndefOr[String] = js.native
  /**
    * Options for stats.toJson() method.
    * For example you can exclude sources of your modules from stats file with "source: false" option.
    */
  var statsOptions: js.UndefOr[Null | ToJsonOptionsObject] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnalyzerHost(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("analyzerHost")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnalyzerHost: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("analyzerHost")(js.undefined)
        ret
    }
    @scala.inline
    def withAnalyzerMode(value: server | static | disabled): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("analyzerMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnalyzerMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("analyzerMode")(js.undefined)
        ret
    }
    @scala.inline
    def withAnalyzerPort(value: Double | auto): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("analyzerPort")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnalyzerPort: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("analyzerPort")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultSizes(value: parsed | stat | gzip): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultSizes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultSizes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultSizes")(js.undefined)
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
    def withExcludeAssets(value: ExcludeAssetsPattern | js.Array[ExcludeAssetsPattern]): Self = {
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
    def withExcludeAssetsNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("excludeAssets")(null)
        ret
    }
    @scala.inline
    def withGenerateStatsFile(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("generateStatsFile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGenerateStatsFile: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("generateStatsFile")(js.undefined)
        ret
    }
    @scala.inline
    def withLogLevel(value: info | warn | error | silent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logLevel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLogLevel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logLevel")(js.undefined)
        ret
    }
    @scala.inline
    def withOpenAnalyzer(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("openAnalyzer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOpenAnalyzer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("openAnalyzer")(js.undefined)
        ret
    }
    @scala.inline
    def withReportFilename(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reportFilename")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReportFilename: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reportFilename")(js.undefined)
        ret
    }
    @scala.inline
    def withStatsFilename(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("statsFilename")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatsFilename: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("statsFilename")(js.undefined)
        ret
    }
    @scala.inline
    def withStatsOptions(value: ToJsonOptionsObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("statsOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatsOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("statsOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withStatsOptionsNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("statsOptions")(null)
        ret
    }
  }
  
}

