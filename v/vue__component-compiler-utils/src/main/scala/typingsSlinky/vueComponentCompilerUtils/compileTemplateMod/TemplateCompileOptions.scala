package typingsSlinky.vueComponentCompilerUtils.compileTemplateMod

import typingsSlinky.vueComponentCompilerUtils.assetUrlMod.AssetURLOptions
import typingsSlinky.vueComponentCompilerUtils.typesMod.VueTemplateCompiler
import typingsSlinky.vueComponentCompilerUtils.typesMod.VueTemplateCompilerOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TemplateCompileOptions extends js.Object {
  var compiler: VueTemplateCompiler = js.native
  var compilerOptions: js.UndefOr[VueTemplateCompilerOptions] = js.native
  var filename: String = js.native
  var isFunctional: js.UndefOr[Boolean] = js.native
  var isProduction: js.UndefOr[Boolean] = js.native
  var optimizeSSR: js.UndefOr[Boolean] = js.native
  var preprocessLang: js.UndefOr[String] = js.native
  var preprocessOptions: js.UndefOr[js.Any] = js.native
  var prettify: js.UndefOr[Boolean] = js.native
  var source: String = js.native
  var transformAssetUrls: js.UndefOr[AssetURLOptions | Boolean] = js.native
  var transpileOptions: js.UndefOr[js.Any] = js.native
}

object TemplateCompileOptions {
  @scala.inline
  def apply(compiler: VueTemplateCompiler, filename: String, source: String): TemplateCompileOptions = {
    val __obj = js.Dynamic.literal(compiler = compiler.asInstanceOf[js.Any], filename = filename.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[TemplateCompileOptions]
  }
  @scala.inline
  implicit class TemplateCompileOptionsOps[Self <: TemplateCompileOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCompiler(value: VueTemplateCompiler): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compiler")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFilename(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filename")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSource(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCompilerOptions(value: VueTemplateCompilerOptions): Self = {
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
    def withIsFunctional(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isFunctional")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsFunctional: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isFunctional")(js.undefined)
        ret
    }
    @scala.inline
    def withIsProduction(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isProduction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsProduction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isProduction")(js.undefined)
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
    def withPreprocessLang(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preprocessLang")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreprocessLang: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preprocessLang")(js.undefined)
        ret
    }
    @scala.inline
    def withPreprocessOptions(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preprocessOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreprocessOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preprocessOptions")(js.undefined)
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
    def withTransformAssetUrls(value: AssetURLOptions | Boolean): Self = {
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
    def withTranspileOptions(value: js.Any): Self = {
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

