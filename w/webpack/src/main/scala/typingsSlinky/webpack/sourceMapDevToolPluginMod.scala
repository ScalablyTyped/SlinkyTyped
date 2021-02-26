package typingsSlinky.webpack

import typingsSlinky.webpack.anon.Include
import typingsSlinky.webpack.webpackBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sourceMapDevToolPluginMod {
  
  type Rule = js.RegExp | String
  
  type Rules = js.Array[Rule] | Rule
  
  @js.native
  trait SourceMapDevToolPluginOptions extends StObject {
    
    /**
    	 * Appends the given value to the original asset. Usually the #sourceMappingURL comment. [url] is replaced with a URL to the source map file. false disables the appending
    	 */
    var append: js.UndefOr[`false` | Null | String] = js.native
    
    /**
    	 * Indicates whether column mappings should be used (defaults to true)
    	 */
    var columns: js.UndefOr[Boolean] = js.native
    
    /**
    	 * Exclude modules that match the given value from source map generation
    	 */
    var exclude: js.UndefOr[Rules] = js.native
    
    /**
    	 * Generator string or function to create identifiers of modules for the 'sources' array in the SourceMap used only if 'moduleFilenameTemplate' would result in a conflict
    	 */
    var fallbackModuleFilenameTemplate: js.UndefOr[js.Function | String] = js.native
    
    /**
    	 * Path prefix to which the [file] placeholder is relative to
    	 */
    var fileContext: js.UndefOr[String] = js.native
    
    /**
    	 * Defines the output filename of the SourceMap (will be inlined if no value is provided)
    	 */
    var filename: js.UndefOr[`false` | Null | String] = js.native
    
    /**
    	 * Include source maps for module paths that match the given value
    	 */
    var include: js.UndefOr[Rules] = js.native
    
    /**
    	 * (deprecated) try to map original files line to line to generated files
    	 */
    var lineToLine: js.UndefOr[Boolean | Include] = js.native
    
    /**
    	 * Indicates whether SourceMaps from loaders should be used (defaults to true)
    	 */
    var module: js.UndefOr[Boolean] = js.native
    
    /**
    	 * Generator string or function to create identifiers of modules for the 'sources' array in the SourceMap
    	 */
    var moduleFilenameTemplate: js.UndefOr[js.Function | String] = js.native
    
    /**
    	 * Namespace prefix to allow multiple webpack roots in the devtools
    	 */
    var namespace: js.UndefOr[String] = js.native
    
    /**
    	 * Omit the 'sourceContents' array from the SourceMap
    	 */
    var noSources: js.UndefOr[Boolean] = js.native
    
    /**
    	 * Provide a custom public path for the SourceMapping comment
    	 */
    var publicPath: js.UndefOr[String] = js.native
    
    /**
    	 * Provide a custom value for the 'sourceRoot' property in the SourceMap
    	 */
    var sourceRoot: js.UndefOr[String] = js.native
    
    /**
    	 * Include source maps for modules based on their extension (defaults to .js and .css)
    	 */
    var test: js.UndefOr[Rules] = js.native
  }
  object SourceMapDevToolPluginOptions {
    
    @scala.inline
    def apply(): SourceMapDevToolPluginOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SourceMapDevToolPluginOptions]
    }
    
    @scala.inline
    implicit class SourceMapDevToolPluginOptionsMutableBuilder[Self <: SourceMapDevToolPluginOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAppend(value: `false` | String): Self = StObject.set(x, "append", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAppendNull: Self = StObject.set(x, "append", null)
      
      @scala.inline
      def setAppendUndefined: Self = StObject.set(x, "append", js.undefined)
      
      @scala.inline
      def setColumns(value: Boolean): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColumnsUndefined: Self = StObject.set(x, "columns", js.undefined)
      
      @scala.inline
      def setExclude(value: Rules): Self = StObject.set(x, "exclude", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExcludeRegExp(value: js.RegExp): Self = StObject.set(x, "exclude", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExcludeUndefined: Self = StObject.set(x, "exclude", js.undefined)
      
      @scala.inline
      def setExcludeVarargs(value: Rule*): Self = StObject.set(x, "exclude", js.Array(value :_*))
      
      @scala.inline
      def setFallbackModuleFilenameTemplate(value: js.Function | String): Self = StObject.set(x, "fallbackModuleFilenameTemplate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFallbackModuleFilenameTemplateUndefined: Self = StObject.set(x, "fallbackModuleFilenameTemplate", js.undefined)
      
      @scala.inline
      def setFileContext(value: String): Self = StObject.set(x, "fileContext", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFileContextUndefined: Self = StObject.set(x, "fileContext", js.undefined)
      
      @scala.inline
      def setFilename(value: `false` | String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilenameNull: Self = StObject.set(x, "filename", null)
      
      @scala.inline
      def setFilenameUndefined: Self = StObject.set(x, "filename", js.undefined)
      
      @scala.inline
      def setInclude(value: Rules): Self = StObject.set(x, "include", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIncludeRegExp(value: js.RegExp): Self = StObject.set(x, "include", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIncludeUndefined: Self = StObject.set(x, "include", js.undefined)
      
      @scala.inline
      def setIncludeVarargs(value: Rule*): Self = StObject.set(x, "include", js.Array(value :_*))
      
      @scala.inline
      def setLineToLine(value: Boolean | Include): Self = StObject.set(x, "lineToLine", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLineToLineUndefined: Self = StObject.set(x, "lineToLine", js.undefined)
      
      @scala.inline
      def setModule(value: Boolean): Self = StObject.set(x, "module", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModuleFilenameTemplate(value: js.Function | String): Self = StObject.set(x, "moduleFilenameTemplate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModuleFilenameTemplateUndefined: Self = StObject.set(x, "moduleFilenameTemplate", js.undefined)
      
      @scala.inline
      def setModuleUndefined: Self = StObject.set(x, "module", js.undefined)
      
      @scala.inline
      def setNamespace(value: String): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNamespaceUndefined: Self = StObject.set(x, "namespace", js.undefined)
      
      @scala.inline
      def setNoSources(value: Boolean): Self = StObject.set(x, "noSources", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNoSourcesUndefined: Self = StObject.set(x, "noSources", js.undefined)
      
      @scala.inline
      def setPublicPath(value: String): Self = StObject.set(x, "publicPath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPublicPathUndefined: Self = StObject.set(x, "publicPath", js.undefined)
      
      @scala.inline
      def setSourceRoot(value: String): Self = StObject.set(x, "sourceRoot", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSourceRootUndefined: Self = StObject.set(x, "sourceRoot", js.undefined)
      
      @scala.inline
      def setTest(value: Rules): Self = StObject.set(x, "test", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTestRegExp(value: js.RegExp): Self = StObject.set(x, "test", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTestUndefined: Self = StObject.set(x, "test", js.undefined)
      
      @scala.inline
      def setTestVarargs(value: Rule*): Self = StObject.set(x, "test", js.Array(value :_*))
    }
  }
}
