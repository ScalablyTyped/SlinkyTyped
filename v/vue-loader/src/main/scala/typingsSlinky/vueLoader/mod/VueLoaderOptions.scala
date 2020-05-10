package typingsSlinky.vueLoader.mod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.vueComponentCompilerUtils.typesMod.VueTemplateCompiler
import typingsSlinky.vueTemplateCompiler.mod.CompilerOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VueLoaderOptions extends js.Object {
  var cacheDirectory: js.UndefOr[String] = js.native
  var cacheIdentifier: js.UndefOr[String] = js.native
  var compiler: js.UndefOr[VueTemplateCompiler] = js.native
  var compilerOptions: js.UndefOr[CompilerOptions] = js.native
  var exposeFilename: js.UndefOr[Boolean] = js.native
  var hotReload: js.UndefOr[Boolean] = js.native
  var optimizeSSR: js.UndefOr[Boolean] = js.native
  var prettify: js.UndefOr[Boolean] = js.native
  var productionMode: js.UndefOr[Boolean] = js.native
  var shadowMode: js.UndefOr[Boolean] = js.native
  var transformAssetUrls: js.UndefOr[StringDictionary[String | js.Array[String]]] = js.native
  var transpileOptions: js.UndefOr[js.Object] = js.native
}

object VueLoaderOptions {
  @scala.inline
  def apply(): VueLoaderOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VueLoaderOptions]
  }
  @scala.inline
  implicit class VueLoaderOptionsOps[Self <: VueLoaderOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withCacheIdentifier(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cacheIdentifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCacheIdentifier: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cacheIdentifier")(js.undefined)
        ret
    }
    @scala.inline
    def withCompiler(value: VueTemplateCompiler): Self = {
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
    def withCompilerOptions(value: CompilerOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compilerOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCompilerOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compilerOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withExposeFilename(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exposeFilename")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExposeFilename: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exposeFilename")(js.undefined)
        ret
    }
    @scala.inline
    def withHotReload(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hotReload")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHotReload: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hotReload")(js.undefined)
        ret
    }
    @scala.inline
    def withOptimizeSSR(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("optimizeSSR")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOptimizeSSR: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("optimizeSSR")(js.undefined)
        ret
    }
    @scala.inline
    def withPrettify(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prettify")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrettify: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prettify")(js.undefined)
        ret
    }
    @scala.inline
    def withProductionMode(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("productionMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProductionMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("productionMode")(js.undefined)
        ret
    }
    @scala.inline
    def withShadowMode(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shadowMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShadowMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shadowMode")(js.undefined)
        ret
    }
    @scala.inline
    def withTransformAssetUrls(value: StringDictionary[String | js.Array[String]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transformAssetUrls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransformAssetUrls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transformAssetUrls")(js.undefined)
        ret
    }
    @scala.inline
    def withTranspileOptions(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transpileOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTranspileOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transpileOptions")(js.undefined)
        ret
    }
  }
  
}

