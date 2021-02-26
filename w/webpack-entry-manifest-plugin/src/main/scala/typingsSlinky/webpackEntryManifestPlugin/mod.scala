package typingsSlinky.webpackEntryManifestPlugin

import typingsSlinky.std.Plugin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Webpack plugin for generating an asset manifest with grouped entry chunks
    */
  @JSImport("webpack-entry-manifest-plugin", JSImport.Namespace)
  @js.native
  class ^ () extends WebpackEntryManifestPlugin {
    def this(options: Options) = this()
  }
  
  @js.native
  trait Options extends StObject {
    
    /**
      * Assets manifest filename
      * @default 'manifest.json'
      */
    var filename: js.UndefOr[String] = js.native
    
    /**
      * Assets path filter function
      * @default () => true
      */
    var filter: js.UndefOr[js.Function2[/* path */ String, /* chunk */ String, Boolean]] = js.native
    
    /**
      * Assets path map function
      * @default path => path
      */
    var map: js.UndefOr[js.Function2[/* path */ String, /* chunk */ String, String]] = js.native
    
    /**
      * Assets manifest serialize function
      * @default manifest => JSON.stringify(manifest)
      */
    var serialize: js.UndefOr[js.Function1[/* manifest */ js.Any, String]] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilenameUndefined: Self = StObject.set(x, "filename", js.undefined)
      
      @scala.inline
      def setFilter(value: (/* path */ String, /* chunk */ String) => Boolean): Self = StObject.set(x, "filter", js.Any.fromFunction2(value))
      
      @scala.inline
      def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
      
      @scala.inline
      def setMap(value: (/* path */ String, /* chunk */ String) => String): Self = StObject.set(x, "map", js.Any.fromFunction2(value))
      
      @scala.inline
      def setMapUndefined: Self = StObject.set(x, "map", js.undefined)
      
      @scala.inline
      def setSerialize(value: /* manifest */ js.Any => String): Self = StObject.set(x, "serialize", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSerializeUndefined: Self = StObject.set(x, "serialize", js.undefined)
    }
  }
  
  /**
    * Webpack plugin for generating an asset manifest with grouped entry chunks
    */
  @js.native
  trait WebpackEntryManifestPlugin extends Plugin {
    
    @JSName("name")
    var name_WebpackEntryManifestPlugin: typingsSlinky.webpackEntryManifestPlugin.webpackEntryManifestPluginStrings.WebpackEntryManifestPlugin = js.native
  }
}
