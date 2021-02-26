package typingsSlinky.webpackPkgPluginV4

import typingsSlinky.std.Plugin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("webpack-pkg-plugin-v4", "WebpackPkgPlugin")
  @js.native
  class WebpackPkgPlugin protected () extends Plugin {
    def this(config: Configuration) = this()
  }
  
  @js.native
  trait Configuration extends StObject {
    
    var output: String = js.native
    
    var targets: js.UndefOr[js.Array[String]] = js.native
  }
  object Configuration {
    
    @scala.inline
    def apply(output: String): Configuration = {
      val __obj = js.Dynamic.literal(output = output.asInstanceOf[js.Any])
      __obj.asInstanceOf[Configuration]
    }
    
    @scala.inline
    implicit class ConfigurationMutableBuilder[Self <: Configuration] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOutput(value: String): Self = StObject.set(x, "output", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargets(value: js.Array[String]): Self = StObject.set(x, "targets", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetsUndefined: Self = StObject.set(x, "targets", js.undefined)
      
      @scala.inline
      def setTargetsVarargs(value: String*): Self = StObject.set(x, "targets", js.Array(value :_*))
    }
  }
}
