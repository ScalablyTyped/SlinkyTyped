package typingsSlinky.webpackDashBundleDashAnalyzer.webpackDashBundleDashAnalyzerMod.BundleAnalyzerPlugin

import typingsSlinky.webpack.webpackMod.Stats.ToJsonOptionsObject
import typingsSlinky.webpackDashBundleDashAnalyzer.webpackDashBundleDashAnalyzerStrings.auto
import typingsSlinky.webpackDashBundleDashAnalyzer.webpackDashBundleDashAnalyzerStrings.disabled
import typingsSlinky.webpackDashBundleDashAnalyzer.webpackDashBundleDashAnalyzerStrings.error
import typingsSlinky.webpackDashBundleDashAnalyzer.webpackDashBundleDashAnalyzerStrings.gzip
import typingsSlinky.webpackDashBundleDashAnalyzer.webpackDashBundleDashAnalyzerStrings.info
import typingsSlinky.webpackDashBundleDashAnalyzer.webpackDashBundleDashAnalyzerStrings.parsed
import typingsSlinky.webpackDashBundleDashAnalyzer.webpackDashBundleDashAnalyzerStrings.server
import typingsSlinky.webpackDashBundleDashAnalyzer.webpackDashBundleDashAnalyzerStrings.silent
import typingsSlinky.webpackDashBundleDashAnalyzer.webpackDashBundleDashAnalyzerStrings.stat
import typingsSlinky.webpackDashBundleDashAnalyzer.webpackDashBundleDashAnalyzerStrings.static
import typingsSlinky.webpackDashBundleDashAnalyzer.webpackDashBundleDashAnalyzerStrings.warn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
    * Host that will be used in `server` mode to start HTTP server.
    * Defaults to 127.0.0.1
    */
  var analyzerHost: js.UndefOr[String] = js.undefined
  /**
    * Can be "server", "static" or "disabled".
    * Defaults to "server".
    * In "server" mode analyzer will start HTTP server to show bundle report.
    * In "static" mode single HTML file with bundle report will be generated.
    * In "disabled" mode you can use this plugin to just generate Webpack Stats JSON file by setting "generateStatsFile" to true.
    */
  var analyzerMode: js.UndefOr[server | static | disabled] = js.undefined
  /**
    * Port that will be used in `server` mode to start HTTP server.
    * Defaults to 8888
    */
  var analyzerPort: js.UndefOr[Double | auto] = js.undefined
  /**
    * Module sizes to show in report by default.
    * Should be one of "stat", "parsed" or "gzip".
    * Defaults to "parsed"
    */
  var defaultSizes: js.UndefOr[parsed | stat | gzip] = js.undefined
  /**
    * Default: `null`.
    * Patterns that will be used to match against asset names to exclude them from the report.
    * If pattern is a string it will be converted to RegExp via `new RegExp(str)`.
    * If pattern is a function it should have the following signature `(assetName: string) => boolean`
    * and should return true to exclude matching asset.
    * If multiple patterns are provided asset should match at least one of them to be excluded.
    */
  var excludeAssets: js.UndefOr[Null | ExcludeAssetsPattern | js.Array[ExcludeAssetsPattern]] = js.undefined
  /**
    * If true, Webpack Stats JSON file will be generated in bundles output directory.
    * Defaults to false
    */
  var generateStatsFile: js.UndefOr[Boolean] = js.undefined
  /**
    * Log level. Can be "info", "warn", "error" or "silent".
    * Defaults to "info"
    */
  var logLevel: js.UndefOr[info | warn | error | silent] = js.undefined
  /**
    * Automatically open report in default browser.
    * Defaults to true
    */
  var openAnalyzer: js.UndefOr[Boolean] = js.undefined
  /**
    * Path to bundle report file that will be generated in "static" mode.
    * Relative to bundles output directory.
    * Defaults to "report.html"
    */
  var reportFilename: js.UndefOr[String] = js.undefined
  /**
    * Name of Webpack Stats JSON file that will be generated if generateStatsFile is true.
    * Relative to bundles output directory.
    * Defaults to "stats.json"
    */
  var statsFilename: js.UndefOr[String] = js.undefined
  /**
    * Options for stats.toJson() method.
    * For example you can exclude sources of your modules from stats file with "source: false" option.
    */
  var statsOptions: js.UndefOr[Null | ToJsonOptionsObject] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    analyzerHost: String = null,
    analyzerMode: server | static | disabled = null,
    analyzerPort: Double | auto = null,
    defaultSizes: parsed | stat | gzip = null,
    excludeAssets: ExcludeAssetsPattern | js.Array[ExcludeAssetsPattern] = null,
    generateStatsFile: js.UndefOr[Boolean] = js.undefined,
    logLevel: info | warn | error | silent = null,
    openAnalyzer: js.UndefOr[Boolean] = js.undefined,
    reportFilename: String = null,
    statsFilename: String = null,
    statsOptions: ToJsonOptionsObject = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (analyzerHost != null) __obj.updateDynamic("analyzerHost")(analyzerHost.asInstanceOf[js.Any])
    if (analyzerMode != null) __obj.updateDynamic("analyzerMode")(analyzerMode.asInstanceOf[js.Any])
    if (analyzerPort != null) __obj.updateDynamic("analyzerPort")(analyzerPort.asInstanceOf[js.Any])
    if (defaultSizes != null) __obj.updateDynamic("defaultSizes")(defaultSizes.asInstanceOf[js.Any])
    if (excludeAssets != null) __obj.updateDynamic("excludeAssets")(excludeAssets.asInstanceOf[js.Any])
    if (!js.isUndefined(generateStatsFile)) __obj.updateDynamic("generateStatsFile")(generateStatsFile.asInstanceOf[js.Any])
    if (logLevel != null) __obj.updateDynamic("logLevel")(logLevel.asInstanceOf[js.Any])
    if (!js.isUndefined(openAnalyzer)) __obj.updateDynamic("openAnalyzer")(openAnalyzer.asInstanceOf[js.Any])
    if (reportFilename != null) __obj.updateDynamic("reportFilename")(reportFilename.asInstanceOf[js.Any])
    if (statsFilename != null) __obj.updateDynamic("statsFilename")(statsFilename.asInstanceOf[js.Any])
    if (statsOptions != null) __obj.updateDynamic("statsOptions")(statsOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

