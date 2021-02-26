package typingsSlinky.wordpressDependencyExtractionWebpackPlugin

import typingsSlinky.std.Set
import typingsSlinky.wordpressDependencyExtractionWebpackPlugin.anon.PartialOptions
import typingsSlinky.wordpressDependencyExtractionWebpackPlugin.wordpressDependencyExtractionWebpackPluginStrings.json
import typingsSlinky.wordpressDependencyExtractionWebpackPlugin.wordpressDependencyExtractionWebpackPluginStrings.php
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Map module request to an external.
    *
    * @callback RequestToExternal
    *
    * @param {string} request Module request.
    *
    * @return {string|string[]|void} Return `undefined` to ignore the request.
    *                                     Return `string|string[]` to map the request to an external.
    */
  /**
    * Map module request to a script handle.
    *
    * @callback RequestToHandle
    *
    * @param {string} request Module request.
    *
    * @return {string|void} Return `undefined` to use the same name as the module.
    *                            Return `string` to map the request to a specific script handle.
    */
  /**
    * @typedef AssetData
    *
    * @property {string}   version      String representing a particular build
    * @property {string[]} dependencies The script dependencies
    */
  /**
    * @typedef Options
    *
    * @property {boolean}                     injectPolyfill      Force wp-polyfill to be included in each entry point's dependency list. This is like importing `@wordpress/polyfill` for each entry point.
    * @property {boolean}                     useDefaults         Set to `false` to disable the default WordPress script request handling.
    * @property {'php'|'json'}                outputFormat        The output format for the generated asset file.
    * @property {RequestToExternal|undefined} [requestToExternal] Map module requests to an external.
    * @property {RequestToHandle|undefined}   [requestToHandle]   Map module requests to a script handle.
    * @property {string|null}                 combinedOutputFile  This option is useful only when the combineAssets option is enabled. It allows providing a custom output file for the generated single assets file. It's possible to provide a path that is relative to the output directory.
    * @property {boolean|undefined}           combineAssets       By default, one asset file is created for each entry point. When this flag is set to true, all information about assets is combined into a single assets.(json|php) file generated in the output directory.
    */
  @JSImport("@wordpress/dependency-extraction-webpack-plugin", JSImport.Namespace)
  @js.native
  class ^ protected () extends DependencyExtractionWebpackPlugin {
    /**
      * @param {Partial<Options>} options
      */
    def this(options: PartialOptions) = this()
  }
  
  @js.native
  trait AssetData extends StObject {
    
    /**
      * The script dependencies
      */
    var dependencies: js.Array[String] = js.native
    
    /**
      * String representing a particular build
      */
    var version: String = js.native
  }
  object AssetData {
    
    @scala.inline
    def apply(dependencies: js.Array[String], version: String): AssetData = {
      val __obj = js.Dynamic.literal(dependencies = dependencies.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[AssetData]
    }
    
    @scala.inline
    implicit class AssetDataMutableBuilder[Self <: AssetData] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDependencies(value: js.Array[String]): Self = StObject.set(x, "dependencies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDependenciesVarargs(value: String*): Self = StObject.set(x, "dependencies", js.Array(value :_*))
      
      @scala.inline
      def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * Map module request to an external.
    *
    * @callback RequestToExternal
    *
    * @param {string} request Module request.
    *
    * @return {string|string[]|void} Return `undefined` to ignore the request.
    *                                     Return `string|string[]` to map the request to an external.
    */
  /**
    * Map module request to a script handle.
    *
    * @callback RequestToHandle
    *
    * @param {string} request Module request.
    *
    * @return {string|void} Return `undefined` to use the same name as the module.
    *                            Return `string` to map the request to a specific script handle.
    */
  /**
    * @typedef AssetData
    *
    * @property {string}   version      String representing a particular build
    * @property {string[]} dependencies The script dependencies
    */
  /**
    * @typedef Options
    *
    * @property {boolean}                     injectPolyfill      Force wp-polyfill to be included in each entry point's dependency list. This is like importing `@wordpress/polyfill` for each entry point.
    * @property {boolean}                     useDefaults         Set to `false` to disable the default WordPress script request handling.
    * @property {'php'|'json'}                outputFormat        The output format for the generated asset file.
    * @property {RequestToExternal|undefined} [requestToExternal] Map module requests to an external.
    * @property {RequestToHandle|undefined}   [requestToHandle]   Map module requests to a script handle.
    * @property {string|null}                 combinedOutputFile  This option is useful only when the combineAssets option is enabled. It allows providing a custom output file for the generated single assets file. It's possible to provide a path that is relative to the output directory.
    * @property {boolean|undefined}           combineAssets       By default, one asset file is created for each entry point. When this flag is set to true, all information about assets is combined into a single assets.(json|php) file generated in the output directory.
    */
  @js.native
  trait DependencyExtractionWebpackPlugin extends StObject {
    
    /**
      * @param {WebpackCompiler} compiler
      * @return {void}
      */
    @JSName("apply")
    def apply(
      compiler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_webpack.Compiler */ js.Any
    ): Unit = js.native
    
    /**
      * @param {Parameters<WebpackExternalsFunction>[0]} _context
      * @param {Parameters<WebpackExternalsFunction>[1]} request
      * @param {Parameters<WebpackExternalsFunction>[2]} callback
      */
    def externalizeWpDeps(
      _context: js.Any,
      request: js.Any,
      callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_webpack.ExternalsFunctionCallback */ js.Any
    ): Unit = js.native
    
    /**
      * Track requests that are externalized.
      *
      * Because we don't have a closed set of dependencies, we need to track what has
      * been externalized so we can recognize them in a later phase when the dependency
      * lists are generated.
      *
      * @type {Set<string>}
      */
    var externalizedDeps: Set[String] = js.native
    
    var externalsPlugin: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_webpack.ExternalsPlugin */ js.Any = js.native
    
    /**
      * @param {string} request
      * @return {string} Transformed request
      */
    def mapRequestToDependency(request: String): String = js.native
    
    /** @type {Options} */
    var options: Options = js.native
    
    /**
      * @param {Object} asset
      * @return {string} Stringified asset
      */
    def stringify(asset: js.Object): String = js.native
  }
  object DependencyExtractionWebpackPlugin {
    
    @scala.inline
    def apply(
      apply: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_webpack.Compiler */ js.Any => Unit,
      externalizeWpDeps: (js.Any, js.Any, /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_webpack.ExternalsFunctionCallback */ js.Any) => Unit,
      externalizedDeps: Set[String],
      externalsPlugin: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_webpack.ExternalsPlugin */ js.Any,
      mapRequestToDependency: String => String,
      options: Options,
      stringify: js.Object => String
    ): DependencyExtractionWebpackPlugin = {
      val __obj = js.Dynamic.literal(apply = js.Any.fromFunction1(apply), externalizeWpDeps = js.Any.fromFunction3(externalizeWpDeps), externalizedDeps = externalizedDeps.asInstanceOf[js.Any], externalsPlugin = externalsPlugin.asInstanceOf[js.Any], mapRequestToDependency = js.Any.fromFunction1(mapRequestToDependency), options = options.asInstanceOf[js.Any], stringify = js.Any.fromFunction1(stringify))
      __obj.asInstanceOf[DependencyExtractionWebpackPlugin]
    }
    
    @scala.inline
    implicit class DependencyExtractionWebpackPluginMutableBuilder[Self <: DependencyExtractionWebpackPlugin] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setApply(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_webpack.Compiler */ js.Any => Unit
      ): Self = StObject.set(x, "apply", js.Any.fromFunction1(value))
      
      @scala.inline
      def setExternalizeWpDeps(
        value: (js.Any, js.Any, /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_webpack.ExternalsFunctionCallback */ js.Any) => Unit
      ): Self = StObject.set(x, "externalizeWpDeps", js.Any.fromFunction3(value))
      
      @scala.inline
      def setExternalizedDeps(value: Set[String]): Self = StObject.set(x, "externalizedDeps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExternalsPlugin(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_webpack.ExternalsPlugin */ js.Any
      ): Self = StObject.set(x, "externalsPlugin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMapRequestToDependency(value: String => String): Self = StObject.set(x, "mapRequestToDependency", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOptions(value: Options): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStringify(value: js.Object => String): Self = StObject.set(x, "stringify", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait Options extends StObject {
    
    /**
      * By default, one asset file is created for each entry point. When this flag is set to true, all information about assets is combined into a single assets.(json|php) file generated in the output directory.
      */
    var combineAssets: js.UndefOr[Boolean] = js.native
    
    /**
      * This option is useful only when the combineAssets option is enabled. It allows providing a custom output file for the generated single assets file. It's possible to provide a path that is relative to the output directory.
      */
    var combinedOutputFile: String | Null = js.native
    
    /**
      * Force wp-polyfill to be included in each entry point's dependency list. This is like importing `@wordpress/polyfill` for each entry point.
      */
    var injectPolyfill: Boolean = js.native
    
    /**
      * The output format for the generated asset file.
      */
    var outputFormat: json | php = js.native
    
    /**
      * Map module requests to an external.
      */
    var requestToExternal: js.UndefOr[RequestToExternal] = js.native
    
    /**
      * Map module requests to a script handle.
      */
    var requestToHandle: js.UndefOr[RequestToHandle] = js.native
    
    /**
      * Set to `false` to disable the default WordPress script request handling.
      */
    var useDefaults: Boolean = js.native
  }
  object Options {
    
    @scala.inline
    def apply(injectPolyfill: Boolean, outputFormat: json | php, useDefaults: Boolean): Options = {
      val __obj = js.Dynamic.literal(injectPolyfill = injectPolyfill.asInstanceOf[js.Any], outputFormat = outputFormat.asInstanceOf[js.Any], useDefaults = useDefaults.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCombineAssets(value: Boolean): Self = StObject.set(x, "combineAssets", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCombineAssetsUndefined: Self = StObject.set(x, "combineAssets", js.undefined)
      
      @scala.inline
      def setCombinedOutputFile(value: String): Self = StObject.set(x, "combinedOutputFile", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCombinedOutputFileNull: Self = StObject.set(x, "combinedOutputFile", null)
      
      @scala.inline
      def setInjectPolyfill(value: Boolean): Self = StObject.set(x, "injectPolyfill", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOutputFormat(value: json | php): Self = StObject.set(x, "outputFormat", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequestToExternal(value: /* request */ String => String | Unit | js.Array[String]): Self = StObject.set(x, "requestToExternal", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRequestToExternalUndefined: Self = StObject.set(x, "requestToExternal", js.undefined)
      
      @scala.inline
      def setRequestToHandle(value: /* request */ String => String | Unit): Self = StObject.set(x, "requestToHandle", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRequestToHandleUndefined: Self = StObject.set(x, "requestToHandle", js.undefined)
      
      @scala.inline
      def setUseDefaults(value: Boolean): Self = StObject.set(x, "useDefaults", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * Map module request to an external.
    */
  type RequestToExternal = js.Function1[/* request */ String, String | Unit | js.Array[String]]
  
  /**
    * Map module request to a script handle.
    */
  type RequestToHandle = js.Function1[/* request */ String, String | Unit]
  
  type WebpackCompiler = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_webpack.Compiler */ js.Any
  
  type WebpackExternalsFunction = js.Function3[
    /* context */ js.Any, 
    /* request */ js.Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_webpack.ExternalsFunctionCallback */ /* callback */ js.Any, 
    js.Any
  ]
}
