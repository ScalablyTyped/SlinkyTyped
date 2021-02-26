package typingsSlinky.vueServerRenderer

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import typingsSlinky.std.Plugin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pluginMod {
  
  @js.native
  trait WebpackPlugin
    extends Instantiable0[Plugin]
       with Instantiable1[/* options */ WebpackPluginOptions, Plugin]
  
  @js.native
  trait WebpackPluginOptions extends StObject {
    
    var filename: js.UndefOr[String] = js.native
  }
  object WebpackPluginOptions {
    
    @scala.inline
    def apply(): WebpackPluginOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WebpackPluginOptions]
    }
    
    @scala.inline
    implicit class WebpackPluginOptionsMutableBuilder[Self <: WebpackPluginOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilenameUndefined: Self = StObject.set(x, "filename", js.undefined)
    }
  }
}
