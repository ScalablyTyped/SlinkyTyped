package typingsSlinky.webpack.anon

import typingsSlinky.webpack.dllReferencePluginMod.DllReferencePluginOptions
import typingsSlinky.webpack.dllReferencePluginMod.DllReferencePluginOptionsManifest
import typingsSlinky.webpack.dllReferencePluginMod.DllReferencePluginOptionsSourceType
import typingsSlinky.webpack.webpackStrings.`object`
import typingsSlinky.webpack.webpackStrings.require
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Context extends DllReferencePluginOptions {
  
  /**
  			 * (absolute path) context of requests in the manifest (or content property)
  			 */
  var context: js.UndefOr[String] = js.native
  
  /**
  			 * Extensions used to resolve modules in the dll bundle (only used when using 'scope')
  			 */
  var extensions: js.UndefOr[js.Array[String]] = js.native
  
  /**
  			 * An object containing content and name or a string to the absolute path of the JSON manifest to be loaded upon compilation
  			 */
  var manifest: DllReferencePluginOptionsManifest | String = js.native
  
  /**
  			 * The name where the dll is exposed (external name, defaults to manifest.name)
  			 */
  var name: js.UndefOr[String] = js.native
  
  /**
  			 * Prefix which is used for accessing the content of the dll
  			 */
  var scope: js.UndefOr[String] = js.native
  
  /**
  			 * How the dll is exposed (libraryTarget, defaults to manifest.type)
  			 */
  var sourceType: js.UndefOr[DllReferencePluginOptionsSourceType] = js.native
  
  /**
  			 * The way how the export of the dll bundle is used
  			 */
  var `type`: js.UndefOr[require | `object`] = js.native
}
object Context {
  
  @scala.inline
  def apply(manifest: DllReferencePluginOptionsManifest | String): Context = {
    val __obj = js.Dynamic.literal(manifest = manifest.asInstanceOf[js.Any])
    __obj.asInstanceOf[Context]
  }
  
  @scala.inline
  implicit class ContextMutableBuilder[Self <: Context] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContext(value: String): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
    
    @scala.inline
    def setExtensions(value: js.Array[String]): Self = StObject.set(x, "extensions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtensionsUndefined: Self = StObject.set(x, "extensions", js.undefined)
    
    @scala.inline
    def setExtensionsVarargs(value: String*): Self = StObject.set(x, "extensions", js.Array(value :_*))
    
    @scala.inline
    def setManifest(value: DllReferencePluginOptionsManifest | String): Self = StObject.set(x, "manifest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setScope(value: String): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
    
    @scala.inline
    def setSourceType(value: DllReferencePluginOptionsSourceType): Self = StObject.set(x, "sourceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceTypeUndefined: Self = StObject.set(x, "sourceType", js.undefined)
    
    @scala.inline
    def setType(value: require | `object`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
