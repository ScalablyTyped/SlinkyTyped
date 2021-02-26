package typingsSlinky.webpackBlocksAssets

import typingsSlinky.webpackBlocksAssets.mod.css.FileOptions
import typingsSlinky.webpackBlocksAssets.mod.css.UrlOptions
import typingsSlinky.webpackBlocksAssets.webpackBlocksAssetsNumbers.`0`
import typingsSlinky.webpackBlocksAssets.webpackBlocksAssetsNumbers.`1`
import typingsSlinky.webpackBlocksAssets.webpackBlocksAssetsNumbers.`2`
import typingsSlinky.webpackBlocksAssets.webpackBlocksAssetsStrings.asIs
import typingsSlinky.webpackBlocksAssets.webpackBlocksAssetsStrings.camelCase
import typingsSlinky.webpackBlocksAssets.webpackBlocksAssetsStrings.camelCaseOnly
import typingsSlinky.webpackBlocksAssets.webpackBlocksAssetsStrings.dashes
import typingsSlinky.webpackBlocksAssets.webpackBlocksAssetsStrings.dashesOnly
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object css {
    
    @JSImport("@webpack-blocks/assets", "css")
    @js.native
    def apply(): js.Any = js.native
    @JSImport("@webpack-blocks/assets", "css")
    @js.native
    def apply(options: CssOptions): js.Any = js.native
    
    @JSImport("@webpack-blocks/assets", "css.modules")
    @js.native
    def modules(): js.Any = js.native
    @JSImport("@webpack-blocks/assets", "css.modules")
    @js.native
    def modules(options: ModuleOptions): js.Any = js.native
    
    @js.native
    trait CssOptions extends StObject {
      
      var `import`: js.UndefOr[Boolean | ImportFilter] = js.native
      
      var modules: js.UndefOr[Boolean | String | ModuleOptions] = js.native
      
      var sourceMap: js.UndefOr[Boolean] = js.native
      
      var url: js.UndefOr[Boolean | UrlFilter] = js.native
    }
    object CssOptions {
      
      @scala.inline
      def apply(): CssOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[CssOptions]
      }
      
      @scala.inline
      implicit class CssOptionsMutableBuilder[Self <: CssOptions] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setImport(value: Boolean | ImportFilter): Self = StObject.set(x, "import", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setImportFunction2(value: (/* parseImport */ ParseImportOptions, /* resourcePath */ String) => Boolean): Self = StObject.set(x, "import", js.Any.fromFunction2(value))
        
        @scala.inline
        def setImportUndefined: Self = StObject.set(x, "import", js.undefined)
        
        @scala.inline
        def setModules(value: Boolean | String | ModuleOptions): Self = StObject.set(x, "modules", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setModulesUndefined: Self = StObject.set(x, "modules", js.undefined)
        
        @scala.inline
        def setSourceMap(value: Boolean): Self = StObject.set(x, "sourceMap", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSourceMapUndefined: Self = StObject.set(x, "sourceMap", js.undefined)
        
        @scala.inline
        def setUrl(value: Boolean | UrlFilter): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setUrlFunction2(value: (/* url */ String, /* resourcePath */ String) => Boolean): Self = StObject.set(x, "url", js.Any.fromFunction2(value))
        
        @scala.inline
        def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
      }
    }
    
    @js.native
    trait FileOptions extends StObject {
      
      var context: js.UndefOr[String] = js.native
      
      var emitFile: js.UndefOr[Boolean] = js.native
      
      var name: js.UndefOr[String | NameFunction] = js.native
      
      var outputPath: js.UndefOr[String | PathFunction] = js.native
      
      var postTransformPublicPath: js.UndefOr[js.Function1[/* p */ String, String]] = js.native
      
      var publicPath: js.UndefOr[String | PathFunction] = js.native
      
      var regExp: js.UndefOr[js.RegExp] = js.native
    }
    object FileOptions {
      
      @scala.inline
      def apply(): FileOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[FileOptions]
      }
      
      @scala.inline
      implicit class FileOptionsMutableBuilder[Self <: FileOptions] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setContext(value: String): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
        
        @scala.inline
        def setEmitFile(value: Boolean): Self = StObject.set(x, "emitFile", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setEmitFileUndefined: Self = StObject.set(x, "emitFile", js.undefined)
        
        @scala.inline
        def setName(value: String | NameFunction): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setNameFunction1(value: /* file */ String => js.Any): Self = StObject.set(x, "name", js.Any.fromFunction1(value))
        
        @scala.inline
        def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
        
        @scala.inline
        def setOutputPath(value: String | PathFunction): Self = StObject.set(x, "outputPath", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOutputPathFunction3(value: (/* url */ String, /* resourcePath */ String, /* context */ String) => js.Any): Self = StObject.set(x, "outputPath", js.Any.fromFunction3(value))
        
        @scala.inline
        def setOutputPathUndefined: Self = StObject.set(x, "outputPath", js.undefined)
        
        @scala.inline
        def setPostTransformPublicPath(value: /* p */ String => String): Self = StObject.set(x, "postTransformPublicPath", js.Any.fromFunction1(value))
        
        @scala.inline
        def setPostTransformPublicPathUndefined: Self = StObject.set(x, "postTransformPublicPath", js.undefined)
        
        @scala.inline
        def setPublicPath(value: String | PathFunction): Self = StObject.set(x, "publicPath", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPublicPathFunction3(value: (/* url */ String, /* resourcePath */ String, /* context */ String) => js.Any): Self = StObject.set(x, "publicPath", js.Any.fromFunction3(value))
        
        @scala.inline
        def setPublicPathUndefined: Self = StObject.set(x, "publicPath", js.undefined)
        
        @scala.inline
        def setRegExp(value: js.RegExp): Self = StObject.set(x, "regExp", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRegExpUndefined: Self = StObject.set(x, "regExp", js.undefined)
      }
    }
    
    type GetLocalIdent = js.Function4[
        /* context */ js.Any, 
        /* localIdentName */ js.Any, 
        /* localName */ js.Any, 
        /* options */ js.Any, 
        String
      ]
    
    type ImportFilter = js.Function2[/* parseImport */ ParseImportOptions, /* resourcePath */ String, Boolean]
    
    @js.native
    trait ModuleOptions extends StObject {
      
      var context: js.UndefOr[String] = js.native
      
      var getLocalIdent: js.UndefOr[GetLocalIdent] = js.native
      
      var hashPrefix: js.UndefOr[String] = js.native
      
      /**
        * 0 => no loaders (default);
        * 1 => postcss-loader;
        * 2 => postcss-loader, sass-loader
        */
      var importLoaders: js.UndefOr[`0` | `1` | `2`] = js.native
      
      var localIdentName: js.UndefOr[String] = js.native
      
      var localIdentRegExp: js.UndefOr[String | js.RegExp] = js.native
      
      var localsConvention: js.UndefOr[asIs | camelCase | camelCaseOnly | dashes | dashesOnly] = js.native
      
      var mode: js.UndefOr[String] = js.native
      
      var onlyLocals: js.UndefOr[Boolean] = js.native
    }
    object ModuleOptions {
      
      @scala.inline
      def apply(): ModuleOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ModuleOptions]
      }
      
      @scala.inline
      implicit class ModuleOptionsMutableBuilder[Self <: ModuleOptions] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setContext(value: String): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
        
        @scala.inline
        def setGetLocalIdent(
          value: (/* context */ js.Any, /* localIdentName */ js.Any, /* localName */ js.Any, /* options */ js.Any) => String
        ): Self = StObject.set(x, "getLocalIdent", js.Any.fromFunction4(value))
        
        @scala.inline
        def setGetLocalIdentUndefined: Self = StObject.set(x, "getLocalIdent", js.undefined)
        
        @scala.inline
        def setHashPrefix(value: String): Self = StObject.set(x, "hashPrefix", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setHashPrefixUndefined: Self = StObject.set(x, "hashPrefix", js.undefined)
        
        @scala.inline
        def setImportLoaders(value: `0` | `1` | `2`): Self = StObject.set(x, "importLoaders", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setImportLoadersUndefined: Self = StObject.set(x, "importLoaders", js.undefined)
        
        @scala.inline
        def setLocalIdentName(value: String): Self = StObject.set(x, "localIdentName", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLocalIdentNameUndefined: Self = StObject.set(x, "localIdentName", js.undefined)
        
        @scala.inline
        def setLocalIdentRegExp(value: String | js.RegExp): Self = StObject.set(x, "localIdentRegExp", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLocalIdentRegExpRegExp(value: js.RegExp): Self = StObject.set(x, "localIdentRegExp", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLocalIdentRegExpUndefined: Self = StObject.set(x, "localIdentRegExp", js.undefined)
        
        @scala.inline
        def setLocalsConvention(value: asIs | camelCase | camelCaseOnly | dashes | dashesOnly): Self = StObject.set(x, "localsConvention", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLocalsConventionUndefined: Self = StObject.set(x, "localsConvention", js.undefined)
        
        @scala.inline
        def setMode(value: String): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
        
        @scala.inline
        def setOnlyLocals(value: Boolean): Self = StObject.set(x, "onlyLocals", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOnlyLocalsUndefined: Self = StObject.set(x, "onlyLocals", js.undefined)
      }
    }
    
    type NameFunction = js.Function1[/* file */ String, js.Any]
    
    @js.native
    trait ParseImportOptions extends StObject {
      
      var media: String = js.native
      
      var url: String = js.native
    }
    object ParseImportOptions {
      
      @scala.inline
      def apply(media: String, url: String): ParseImportOptions = {
        val __obj = js.Dynamic.literal(media = media.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
        __obj.asInstanceOf[ParseImportOptions]
      }
      
      @scala.inline
      implicit class ParseImportOptionsMutableBuilder[Self <: ParseImportOptions] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setMedia(value: String): Self = StObject.set(x, "media", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      }
    }
    
    type PathFunction = js.Function3[/* url */ String, /* resourcePath */ String, /* context */ String, js.Any]
    
    type UrlFilter = js.Function2[/* url */ String, /* resourcePath */ String, Boolean]
    
    @js.native
    trait UrlOptions extends StObject {
      
      var fallback: js.UndefOr[String] = js.native
      
      var limit: js.UndefOr[Double | Boolean | String] = js.native
      
      var mimetype: js.UndefOr[String] = js.native
    }
    object UrlOptions {
      
      @scala.inline
      def apply(): UrlOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[UrlOptions]
      }
      
      @scala.inline
      implicit class UrlOptionsMutableBuilder[Self <: UrlOptions] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setFallback(value: String): Self = StObject.set(x, "fallback", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFallbackUndefined: Self = StObject.set(x, "fallback", js.undefined)
        
        @scala.inline
        def setLimit(value: Double | Boolean | String): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
        
        @scala.inline
        def setMimetype(value: String): Self = StObject.set(x, "mimetype", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMimetypeUndefined: Self = StObject.set(x, "mimetype", js.undefined)
      }
    }
  }
  
  @JSImport("@webpack-blocks/assets", "file")
  @js.native
  def file(): js.Any = js.native
  @JSImport("@webpack-blocks/assets", "file")
  @js.native
  def file(options: FileOptions): js.Any = js.native
  
  @JSImport("@webpack-blocks/assets", "url")
  @js.native
  def url(): js.Any = js.native
  @JSImport("@webpack-blocks/assets", "url")
  @js.native
  def url(options: UrlOptions): js.Any = js.native
}
