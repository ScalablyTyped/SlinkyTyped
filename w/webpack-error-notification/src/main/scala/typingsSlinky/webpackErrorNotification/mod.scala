package typingsSlinky.webpackErrorNotification

import typingsSlinky.std.Plugin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("webpack-error-notification", JSImport.Namespace)
  @js.native
  /**
    * You can supply some strategy for the plugin to display notification.
    * If you don't supply anything, it will use process.platform as a strategy name.
    * `darwin` and `linux` are supported out of the box now.
    * You can also supply function(msg) {} as a strategy that will use your notification CLI tool of choice.
    */
  class ^ () extends WebpackErrorNotificationPlugin {
    def this(strategy: Strategy) = this()
    def this(strategy: js.UndefOr[Strategy], options: Options) = this()
  }
  
  @js.native
  trait Options extends StObject {
    
    /** if you do not want to notify warnings, set this to `false` */
    var notifyWarnings: js.UndefOr[Boolean] = js.native
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
      def setNotifyWarnings(value: Boolean): Self = StObject.set(x, "notifyWarnings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNotifyWarningsUndefined: Self = StObject.set(x, "notifyWarnings", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.webpackErrorNotification.webpackErrorNotificationStrings.darwin
    - typingsSlinky.webpackErrorNotification.webpackErrorNotificationStrings.linux
    - js.Function1[/ * msg * / java.lang.String, scala.Unit]
  */
  type Strategy = _Strategy | (js.Function1[/* msg */ String, Unit])
  
  @js.native
  trait WebpackErrorNotificationPlugin extends Plugin {
    
    def compilationDone(
      stats: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Stats */ js.Any
    ): Unit = js.native
    
    def compileMessage(
      stats: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Stats */ js.Any
    ): String = js.native
  }
  
  trait _Strategy extends StObject
}
