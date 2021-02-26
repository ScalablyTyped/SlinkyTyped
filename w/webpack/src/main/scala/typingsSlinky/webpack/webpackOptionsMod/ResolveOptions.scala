package typingsSlinky.webpack.webpackOptionsMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.webpack.anon.Alias
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResolveOptions extends StObject {
  
  /**
  	 * Redirect module requests
  	 */
  var alias: js.UndefOr[(/**
  				 * New request
  				 */
  StringDictionary[String]) | js.Array[Alias]] = js.native
  
  /**
  	 * Fields in the description file (package.json) which are used to redirect requests inside the module
  	 */
  var aliasFields: js.UndefOr[ArrayOfStringOrStringArrayValues] = js.native
  
  /**
  	 * Predicate function to decide which requests should be cached
  	 */
  var cachePredicate: js.UndefOr[js.Function] = js.native
  
  /**
  	 * Include the context information in the cache identifier when caching
  	 */
  var cacheWithContext: js.UndefOr[Boolean] = js.native
  
  /**
  	 * Enable concord resolving extras
  	 */
  var concord: js.UndefOr[Boolean] = js.native
  
  /**
  	 * Filenames used to find a description file
  	 */
  var descriptionFiles: js.UndefOr[ArrayOfStringValues] = js.native
  
  /**
  	 * Enforce using one of the extensions from the extensions option
  	 */
  var enforceExtension: js.UndefOr[Boolean] = js.native
  
  /**
  	 * Enforce using one of the module extensions from the moduleExtensions option
  	 */
  var enforceModuleExtension: js.UndefOr[Boolean] = js.native
  
  /**
  	 * Extensions added to the request when trying to find the file
  	 */
  var extensions: js.UndefOr[ArrayOfStringValues] = js.native
  
  /**
  	 * Filesystem for the resolver
  	 */
  var fileSystem: js.UndefOr[StringDictionary[js.Any]] = js.native
  
  /**
  	 * Field names from the description file (package.json) which are used to find the default entry point
  	 */
  var mainFields: js.UndefOr[ArrayOfStringOrStringArrayValues] = js.native
  
  /**
  	 * Filenames used to find the default entry point if there is no description file or main field
  	 */
  var mainFiles: js.UndefOr[ArrayOfStringValues] = js.native
  
  /**
  	 * Extensions added to the module request when trying to find the module
  	 */
  var moduleExtensions: js.UndefOr[ArrayOfStringValues] = js.native
  
  /**
  	 * Folder names or directory paths where to find modules
  	 */
  var modules: js.UndefOr[ArrayOfStringValues] = js.native
  
  /**
  	 * Plugins for the resolver
  	 */
  var plugins: js.UndefOr[js.Array[WebpackPluginInstance | WebpackPluginFunction]] = js.native
  
  /**
  	 * Custom resolver
  	 */
  var resolver: js.UndefOr[StringDictionary[js.Any]] = js.native
  
  /**
  	 * A list of directories in which requests that are server-relative URLs (starting with '/') are resolved. On non-windows system these requests are tried to resolve as absolute path first.
  	 */
  var roots: js.UndefOr[js.Array[String]] = js.native
  
  /**
  	 * Enable resolving symlinks to the original location
  	 */
  var symlinks: js.UndefOr[Boolean] = js.native
  
  /**
  	 * Enable caching of successfully resolved requests
  	 */
  var unsafeCache: js.UndefOr[Boolean | StringDictionary[js.Any]] = js.native
  
  /**
  	 * Use synchronous filesystem calls for the resolver
  	 */
  var useSyncFileSystemCalls: js.UndefOr[Boolean] = js.native
}
object ResolveOptions {
  
  @scala.inline
  def apply(): ResolveOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResolveOptions]
  }
  
  @scala.inline
  implicit class ResolveOptionsMutableBuilder[Self <: ResolveOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlias(value: (/**
    				 * New request
    				 */
    StringDictionary[String]) | js.Array[Alias]): Self = StObject.set(x, "alias", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAliasFields(value: ArrayOfStringOrStringArrayValues): Self = StObject.set(x, "aliasFields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAliasFieldsUndefined: Self = StObject.set(x, "aliasFields", js.undefined)
    
    @scala.inline
    def setAliasFieldsVarargs(value: (String | js.Array[String])*): Self = StObject.set(x, "aliasFields", js.Array(value :_*))
    
    @scala.inline
    def setAliasUndefined: Self = StObject.set(x, "alias", js.undefined)
    
    @scala.inline
    def setAliasVarargs(value: Alias*): Self = StObject.set(x, "alias", js.Array(value :_*))
    
    @scala.inline
    def setCachePredicate(value: js.Function): Self = StObject.set(x, "cachePredicate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCachePredicateUndefined: Self = StObject.set(x, "cachePredicate", js.undefined)
    
    @scala.inline
    def setCacheWithContext(value: Boolean): Self = StObject.set(x, "cacheWithContext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCacheWithContextUndefined: Self = StObject.set(x, "cacheWithContext", js.undefined)
    
    @scala.inline
    def setConcord(value: Boolean): Self = StObject.set(x, "concord", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConcordUndefined: Self = StObject.set(x, "concord", js.undefined)
    
    @scala.inline
    def setDescriptionFiles(value: ArrayOfStringValues): Self = StObject.set(x, "descriptionFiles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionFilesUndefined: Self = StObject.set(x, "descriptionFiles", js.undefined)
    
    @scala.inline
    def setDescriptionFilesVarargs(value: String*): Self = StObject.set(x, "descriptionFiles", js.Array(value :_*))
    
    @scala.inline
    def setEnforceExtension(value: Boolean): Self = StObject.set(x, "enforceExtension", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnforceExtensionUndefined: Self = StObject.set(x, "enforceExtension", js.undefined)
    
    @scala.inline
    def setEnforceModuleExtension(value: Boolean): Self = StObject.set(x, "enforceModuleExtension", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnforceModuleExtensionUndefined: Self = StObject.set(x, "enforceModuleExtension", js.undefined)
    
    @scala.inline
    def setExtensions(value: ArrayOfStringValues): Self = StObject.set(x, "extensions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtensionsUndefined: Self = StObject.set(x, "extensions", js.undefined)
    
    @scala.inline
    def setExtensionsVarargs(value: String*): Self = StObject.set(x, "extensions", js.Array(value :_*))
    
    @scala.inline
    def setFileSystem(value: StringDictionary[js.Any]): Self = StObject.set(x, "fileSystem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileSystemUndefined: Self = StObject.set(x, "fileSystem", js.undefined)
    
    @scala.inline
    def setMainFields(value: ArrayOfStringOrStringArrayValues): Self = StObject.set(x, "mainFields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMainFieldsUndefined: Self = StObject.set(x, "mainFields", js.undefined)
    
    @scala.inline
    def setMainFieldsVarargs(value: (String | js.Array[String])*): Self = StObject.set(x, "mainFields", js.Array(value :_*))
    
    @scala.inline
    def setMainFiles(value: ArrayOfStringValues): Self = StObject.set(x, "mainFiles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMainFilesUndefined: Self = StObject.set(x, "mainFiles", js.undefined)
    
    @scala.inline
    def setMainFilesVarargs(value: String*): Self = StObject.set(x, "mainFiles", js.Array(value :_*))
    
    @scala.inline
    def setModuleExtensions(value: ArrayOfStringValues): Self = StObject.set(x, "moduleExtensions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModuleExtensionsUndefined: Self = StObject.set(x, "moduleExtensions", js.undefined)
    
    @scala.inline
    def setModuleExtensionsVarargs(value: String*): Self = StObject.set(x, "moduleExtensions", js.Array(value :_*))
    
    @scala.inline
    def setModules(value: ArrayOfStringValues): Self = StObject.set(x, "modules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModulesUndefined: Self = StObject.set(x, "modules", js.undefined)
    
    @scala.inline
    def setModulesVarargs(value: String*): Self = StObject.set(x, "modules", js.Array(value :_*))
    
    @scala.inline
    def setPlugins(value: js.Array[WebpackPluginInstance | WebpackPluginFunction]): Self = StObject.set(x, "plugins", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPluginsUndefined: Self = StObject.set(x, "plugins", js.undefined)
    
    @scala.inline
    def setPluginsVarargs(value: (WebpackPluginInstance | WebpackPluginFunction)*): Self = StObject.set(x, "plugins", js.Array(value :_*))
    
    @scala.inline
    def setResolver(value: StringDictionary[js.Any]): Self = StObject.set(x, "resolver", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResolverUndefined: Self = StObject.set(x, "resolver", js.undefined)
    
    @scala.inline
    def setRoots(value: js.Array[String]): Self = StObject.set(x, "roots", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRootsUndefined: Self = StObject.set(x, "roots", js.undefined)
    
    @scala.inline
    def setRootsVarargs(value: String*): Self = StObject.set(x, "roots", js.Array(value :_*))
    
    @scala.inline
    def setSymlinks(value: Boolean): Self = StObject.set(x, "symlinks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSymlinksUndefined: Self = StObject.set(x, "symlinks", js.undefined)
    
    @scala.inline
    def setUnsafeCache(value: Boolean | StringDictionary[js.Any]): Self = StObject.set(x, "unsafeCache", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnsafeCacheUndefined: Self = StObject.set(x, "unsafeCache", js.undefined)
    
    @scala.inline
    def setUseSyncFileSystemCalls(value: Boolean): Self = StObject.set(x, "useSyncFileSystemCalls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseSyncFileSystemCallsUndefined: Self = StObject.set(x, "useSyncFileSystemCalls", js.undefined)
  }
}
