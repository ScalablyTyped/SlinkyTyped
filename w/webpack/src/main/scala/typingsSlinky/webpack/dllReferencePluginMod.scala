package typingsSlinky.webpack

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.webpack.anon.BuildMeta
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dllReferencePluginMod {
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.webpack.anon.Context
    - typingsSlinky.webpack.anon.Content
  */
  trait DllReferencePluginOptions extends StObject
  object DllReferencePluginOptions {
    
    @scala.inline
    def Content(content: DllReferencePluginOptionsContent, name: String): typingsSlinky.webpack.anon.Content = {
      val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.webpack.anon.Content]
    }
    
    @scala.inline
    def Context(manifest: DllReferencePluginOptionsManifest | String): typingsSlinky.webpack.anon.Context = {
      val __obj = js.Dynamic.literal(manifest = manifest.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.webpack.anon.Context]
    }
  }
  
  type DllReferencePluginOptionsContent = /**
  	 * Module info
  	 */
  StringDictionary[BuildMeta]
  
  @js.native
  trait DllReferencePluginOptionsManifest extends StObject {
    
    /**
    	 * The mappings from request to module info
    	 */
    var content: DllReferencePluginOptionsContent = js.native
    
    /**
    	 * The name where the dll is exposed (external name)
    	 */
    var name: js.UndefOr[String] = js.native
    
    /**
    	 * The type how the dll is exposed (external type)
    	 */
    var `type`: js.UndefOr[DllReferencePluginOptionsSourceType] = js.native
  }
  object DllReferencePluginOptionsManifest {
    
    @scala.inline
    def apply(content: DllReferencePluginOptionsContent): DllReferencePluginOptionsManifest = {
      val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
      __obj.asInstanceOf[DllReferencePluginOptionsManifest]
    }
    
    @scala.inline
    implicit class DllReferencePluginOptionsManifestMutableBuilder[Self <: DllReferencePluginOptionsManifest] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContent(value: DllReferencePluginOptionsContent): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setType(value: DllReferencePluginOptionsSourceType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.webpack.webpackStrings.`var`
    - typingsSlinky.webpack.webpackStrings.assign
    - typingsSlinky.webpack.webpackStrings.`this`
    - typingsSlinky.webpack.webpackStrings.window
    - typingsSlinky.webpack.webpackStrings.global
    - typingsSlinky.webpack.webpackStrings.commonjs
    - typingsSlinky.webpack.webpackStrings.commonjs2
    - typingsSlinky.webpack.webpackStrings.`commonjs-module`
    - typingsSlinky.webpack.webpackStrings.amd
    - typingsSlinky.webpack.webpackStrings.`amd-require`
    - typingsSlinky.webpack.webpackStrings.umd
    - typingsSlinky.webpack.webpackStrings.umd2
    - typingsSlinky.webpack.webpackStrings.jsonp
  */
  trait DllReferencePluginOptionsSourceType extends StObject
  object DllReferencePluginOptionsSourceType {
    
    @scala.inline
    def amd: typingsSlinky.webpack.webpackStrings.amd = "amd".asInstanceOf[typingsSlinky.webpack.webpackStrings.amd]
    
    @scala.inline
    def `amd-require`: typingsSlinky.webpack.webpackStrings.`amd-require` = "amd-require".asInstanceOf[typingsSlinky.webpack.webpackStrings.`amd-require`]
    
    @scala.inline
    def assign: typingsSlinky.webpack.webpackStrings.assign = "assign".asInstanceOf[typingsSlinky.webpack.webpackStrings.assign]
    
    @scala.inline
    def commonjs: typingsSlinky.webpack.webpackStrings.commonjs = "commonjs".asInstanceOf[typingsSlinky.webpack.webpackStrings.commonjs]
    
    @scala.inline
    def `commonjs-module`: typingsSlinky.webpack.webpackStrings.`commonjs-module` = "commonjs-module".asInstanceOf[typingsSlinky.webpack.webpackStrings.`commonjs-module`]
    
    @scala.inline
    def commonjs2: typingsSlinky.webpack.webpackStrings.commonjs2 = "commonjs2".asInstanceOf[typingsSlinky.webpack.webpackStrings.commonjs2]
    
    @scala.inline
    def global: typingsSlinky.webpack.webpackStrings.global = "global".asInstanceOf[typingsSlinky.webpack.webpackStrings.global]
    
    @scala.inline
    def jsonp: typingsSlinky.webpack.webpackStrings.jsonp = "jsonp".asInstanceOf[typingsSlinky.webpack.webpackStrings.jsonp]
    
    @scala.inline
    def `this`: typingsSlinky.webpack.webpackStrings.`this` = "this".asInstanceOf[typingsSlinky.webpack.webpackStrings.`this`]
    
    @scala.inline
    def umd: typingsSlinky.webpack.webpackStrings.umd = "umd".asInstanceOf[typingsSlinky.webpack.webpackStrings.umd]
    
    @scala.inline
    def umd2: typingsSlinky.webpack.webpackStrings.umd2 = "umd2".asInstanceOf[typingsSlinky.webpack.webpackStrings.umd2]
    
    @scala.inline
    def `var`: typingsSlinky.webpack.webpackStrings.`var` = "var".asInstanceOf[typingsSlinky.webpack.webpackStrings.`var`]
    
    @scala.inline
    def window: typingsSlinky.webpack.webpackStrings.window = "window".asInstanceOf[typingsSlinky.webpack.webpackStrings.window]
  }
}
