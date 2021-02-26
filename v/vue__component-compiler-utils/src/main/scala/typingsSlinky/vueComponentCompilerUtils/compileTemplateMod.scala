package typingsSlinky.vueComponentCompilerUtils

import typingsSlinky.vueComponentCompilerUtils.assetUrlMod.AssetURLOptions
import typingsSlinky.vueComponentCompilerUtils.assetUrlMod.TransformAssetUrlsOptions
import typingsSlinky.vueComponentCompilerUtils.typesMod.ErrorWithRange
import typingsSlinky.vueComponentCompilerUtils.typesMod.VueTemplateCompiler
import typingsSlinky.vueComponentCompilerUtils.typesMod.VueTemplateCompilerOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object compileTemplateMod {
  
  @JSImport("@vue/component-compiler-utils/dist/compileTemplate", "compileTemplate")
  @js.native
  def compileTemplate(options: TemplateCompileOptions): TemplateCompileResult = js.native
  
  @js.native
  trait TemplateCompileOptions extends StObject {
    
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
    
    var transformAssetUrlsOptions: js.UndefOr[TransformAssetUrlsOptions] = js.native
    
    var transpileOptions: js.UndefOr[js.Any] = js.native
  }
  object TemplateCompileOptions {
    
    @scala.inline
    def apply(compiler: VueTemplateCompiler, filename: String, source: String): TemplateCompileOptions = {
      val __obj = js.Dynamic.literal(compiler = compiler.asInstanceOf[js.Any], filename = filename.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
      __obj.asInstanceOf[TemplateCompileOptions]
    }
    
    @scala.inline
    implicit class TemplateCompileOptionsMutableBuilder[Self <: TemplateCompileOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCompiler(value: VueTemplateCompiler): Self = StObject.set(x, "compiler", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCompilerOptions(value: VueTemplateCompilerOptions): Self = StObject.set(x, "compilerOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCompilerOptionsUndefined: Self = StObject.set(x, "compilerOptions", js.undefined)
      
      @scala.inline
      def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsFunctional(value: Boolean): Self = StObject.set(x, "isFunctional", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsFunctionalUndefined: Self = StObject.set(x, "isFunctional", js.undefined)
      
      @scala.inline
      def setIsProduction(value: Boolean): Self = StObject.set(x, "isProduction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsProductionUndefined: Self = StObject.set(x, "isProduction", js.undefined)
      
      @scala.inline
      def setOptimizeSSR(value: Boolean): Self = StObject.set(x, "optimizeSSR", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptimizeSSRUndefined: Self = StObject.set(x, "optimizeSSR", js.undefined)
      
      @scala.inline
      def setPreprocessLang(value: String): Self = StObject.set(x, "preprocessLang", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreprocessLangUndefined: Self = StObject.set(x, "preprocessLang", js.undefined)
      
      @scala.inline
      def setPreprocessOptions(value: js.Any): Self = StObject.set(x, "preprocessOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreprocessOptionsUndefined: Self = StObject.set(x, "preprocessOptions", js.undefined)
      
      @scala.inline
      def setPrettify(value: Boolean): Self = StObject.set(x, "prettify", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrettifyUndefined: Self = StObject.set(x, "prettify", js.undefined)
      
      @scala.inline
      def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransformAssetUrls(value: AssetURLOptions | Boolean): Self = StObject.set(x, "transformAssetUrls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransformAssetUrlsOptions(value: TransformAssetUrlsOptions): Self = StObject.set(x, "transformAssetUrlsOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransformAssetUrlsOptionsUndefined: Self = StObject.set(x, "transformAssetUrlsOptions", js.undefined)
      
      @scala.inline
      def setTransformAssetUrlsUndefined: Self = StObject.set(x, "transformAssetUrls", js.undefined)
      
      @scala.inline
      def setTranspileOptions(value: js.Any): Self = StObject.set(x, "transpileOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTranspileOptionsUndefined: Self = StObject.set(x, "transpileOptions", js.undefined)
    }
  }
  
  @js.native
  trait TemplateCompileResult extends StObject {
    
    var ast: js.UndefOr[js.Object] = js.native
    
    var code: String = js.native
    
    var errors: js.Array[String | ErrorWithRange] = js.native
    
    var source: String = js.native
    
    var tips: js.Array[String | ErrorWithRange] = js.native
  }
  object TemplateCompileResult {
    
    @scala.inline
    def apply(
      code: String,
      errors: js.Array[String | ErrorWithRange],
      source: String,
      tips: js.Array[String | ErrorWithRange]
    ): TemplateCompileResult = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], errors = errors.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], tips = tips.asInstanceOf[js.Any])
      __obj.asInstanceOf[TemplateCompileResult]
    }
    
    @scala.inline
    implicit class TemplateCompileResultMutableBuilder[Self <: TemplateCompileResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAst(value: js.Object): Self = StObject.set(x, "ast", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAstUndefined: Self = StObject.set(x, "ast", js.undefined)
      
      @scala.inline
      def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrors(value: js.Array[String | ErrorWithRange]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorsVarargs(value: (String | ErrorWithRange)*): Self = StObject.set(x, "errors", js.Array(value :_*))
      
      @scala.inline
      def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTips(value: js.Array[String | ErrorWithRange]): Self = StObject.set(x, "tips", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTipsVarargs(value: (String | ErrorWithRange)*): Self = StObject.set(x, "tips", js.Array(value :_*))
    }
  }
}
