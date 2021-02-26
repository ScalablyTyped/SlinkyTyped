package typingsSlinky.startServerWebpackPlugin

import typingsSlinky.startServerWebpackPlugin.startServerWebpackPluginBooleans.`false`
import typingsSlinky.startServerWebpackPlugin.startServerWebpackPluginBooleans.`true`
import typingsSlinky.startServerWebpackPlugin.startServerWebpackPluginStrings.SIGUSR2
import typingsSlinky.std.Plugin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("start-server-webpack-plugin", JSImport.Namespace)
  @js.native
  class ^ () extends Plugin {
    def this(options: String) = this()
    def this(options: Options) = this()
  }
  
  @js.native
  trait Options extends StObject {
    
    /**
      * Arguments for the script.
      * Default: `[]`.
      */
    var args: js.UndefOr[js.Array[String]] = js.native
    
    /**
      * Allow typing 'rs' to restart the server.
      * Default: 'true' if in 'development' mode, 'false' otherwise.
      */
    var keyboard: js.UndefOr[Boolean] = js.native
    
    /**
      * Name of the server to start (built asset from webpack).
      * If not provided, the plugin will tell you the available names.
      */
    var name: js.UndefOr[String] = js.native
    
    /**
      * Arguments for node.
      * Default: `[]`.
      */
    var nodeArgs: js.UndefOr[js.Array[String]] = js.native
    
    /**
      * Signal to send for HMR.
      * Default: 'false'.
      */
    var signal: js.UndefOr[`false` | `true` | SIGUSR2] = js.native
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
      def setArgs(value: js.Array[String]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArgsUndefined: Self = StObject.set(x, "args", js.undefined)
      
      @scala.inline
      def setArgsVarargs(value: String*): Self = StObject.set(x, "args", js.Array(value :_*))
      
      @scala.inline
      def setKeyboard(value: Boolean): Self = StObject.set(x, "keyboard", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyboardUndefined: Self = StObject.set(x, "keyboard", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setNodeArgs(value: js.Array[String]): Self = StObject.set(x, "nodeArgs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNodeArgsUndefined: Self = StObject.set(x, "nodeArgs", js.undefined)
      
      @scala.inline
      def setNodeArgsVarargs(value: String*): Self = StObject.set(x, "nodeArgs", js.Array(value :_*))
      
      @scala.inline
      def setSignal(value: `false` | `true` | SIGUSR2): Self = StObject.set(x, "signal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSignalUndefined: Self = StObject.set(x, "signal", js.undefined)
    }
  }
  
  type StartServerWebpackPlugin = Plugin
}
