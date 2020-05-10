package typingsSlinky.webpackBlocksTypescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  var babelCore: js.UndefOr[String] = js.native
  var babelOptions: js.UndefOr[BabelOptions] = js.native
  var cacheDirectory: js.UndefOr[String] = js.native
  var compiler: js.UndefOr[String] = js.native
  var configFileName: js.UndefOr[String] = js.native
  var errorsAsWarnings: js.UndefOr[Boolean] = js.native
  var forceIsolatedModules: js.UndefOr[Boolean] = js.native
  var getCustomTransformers: js.UndefOr[String | CustomTransformersFunction] = js.native
  var ignoreDiagnostics: js.UndefOr[js.Array[Double]] = js.native
  var instance: js.UndefOr[String] = js.native
  var reportFiles: js.UndefOr[js.Array[String]] = js.native
  var silent: js.UndefOr[Boolean] = js.native
  var transpileOnly: js.UndefOr[Boolean] = js.native
  var useBabel: js.UndefOr[Boolean] = js.native
  var useCache: js.UndefOr[Boolean] = js.native
  var usePrecompiledFiles: js.UndefOr[Boolean] = js.native
  var useTranspileModule: js.UndefOr[Boolean] = js.native
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
    def withBabelCore(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("babelCore")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBabelCore: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("babelCore")(js.undefined)
        ret
    }
    @scala.inline
    def withBabelOptions(value: BabelOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("babelOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBabelOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("babelOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withCacheDirectory(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cacheDirectory")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCacheDirectory: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cacheDirectory")(js.undefined)
        ret
    }
    @scala.inline
    def withCompiler(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compiler")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCompiler: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compiler")(js.undefined)
        ret
    }
    @scala.inline
    def withConfigFileName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("configFileName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConfigFileName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("configFileName")(js.undefined)
        ret
    }
    @scala.inline
    def withErrorsAsWarnings(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorsAsWarnings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutErrorsAsWarnings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorsAsWarnings")(js.undefined)
        ret
    }
    @scala.inline
    def withForceIsolatedModules(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forceIsolatedModules")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutForceIsolatedModules: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forceIsolatedModules")(js.undefined)
        ret
    }
    @scala.inline
    def withGetCustomTransformersFunction1(value: /* program */ js.Any => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getCustomTransformers")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetCustomTransformers(value: String | CustomTransformersFunction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getCustomTransformers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGetCustomTransformers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getCustomTransformers")(js.undefined)
        ret
    }
    @scala.inline
    def withIgnoreDiagnostics(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreDiagnostics")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIgnoreDiagnostics: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreDiagnostics")(js.undefined)
        ret
    }
    @scala.inline
    def withInstance(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInstance: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instance")(js.undefined)
        ret
    }
    @scala.inline
    def withReportFiles(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reportFiles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReportFiles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reportFiles")(js.undefined)
        ret
    }
    @scala.inline
    def withSilent(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("silent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSilent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("silent")(js.undefined)
        ret
    }
    @scala.inline
    def withTranspileOnly(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transpileOnly")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTranspileOnly: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transpileOnly")(js.undefined)
        ret
    }
    @scala.inline
    def withUseBabel(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useBabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseBabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useBabel")(js.undefined)
        ret
    }
    @scala.inline
    def withUseCache(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useCache")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseCache: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useCache")(js.undefined)
        ret
    }
    @scala.inline
    def withUsePrecompiledFiles(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("usePrecompiledFiles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUsePrecompiledFiles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("usePrecompiledFiles")(js.undefined)
        ret
    }
    @scala.inline
    def withUseTranspileModule(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useTranspileModule")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseTranspileModule: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useTranspileModule")(js.undefined)
        ret
    }
  }
  
}

