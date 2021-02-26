package typingsSlinky.storybookClientLogger

import typingsSlinky.storybookClientLogger.storybookClientLoggerStrings.debug
import typingsSlinky.storybookClientLogger.storybookClientLoggerStrings.error
import typingsSlinky.storybookClientLogger.storybookClientLoggerStrings.info
import typingsSlinky.storybookClientLogger.storybookClientLoggerStrings.log
import typingsSlinky.storybookClientLogger.storybookClientLoggerStrings.trace
import typingsSlinky.storybookClientLogger.storybookClientLoggerStrings.warn
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object logger {
    
    @JSImport("@storybook/client-logger", "logger.debug")
    @js.native
    def debug(message: js.Any, rest: js.Any*): Unit = js.native
    
    @JSImport("@storybook/client-logger", "logger.error")
    @js.native
    def error(message: js.Any, rest: js.Any*): Unit = js.native
    
    @JSImport("@storybook/client-logger", "logger.info")
    @js.native
    def info(message: js.Any, rest: js.Any*): Unit = js.native
    
    @JSImport("@storybook/client-logger", "logger.log")
    @js.native
    def log(message: js.Any, rest: js.Any*): Unit = js.native
    
    @JSImport("@storybook/client-logger", "logger.trace")
    @js.native
    def trace(message: js.Any, rest: js.Any*): Unit = js.native
    
    @JSImport("@storybook/client-logger", "logger.warn")
    @js.native
    def warn(message: js.Any, rest: js.Any*): Unit = js.native
  }
  
  object pretty {
    
    @JSImport("@storybook/client-logger", "pretty")
    @js.native
    def apply(`type`: /* keyof @storybook/client-logger.anon.Debug */ trace | debug | info | warn | error | log): js.Function1[/* repeated */ String, Unit] = js.native
    
    @JSImport("@storybook/client-logger", "pretty.debug")
    @js.native
    def debug(args: String*): Unit = js.native
    
    @JSImport("@storybook/client-logger", "pretty.error")
    @js.native
    def error(args: String*): Unit = js.native
    
    @JSImport("@storybook/client-logger", "pretty.info")
    @js.native
    def info(args: String*): Unit = js.native
    
    @JSImport("@storybook/client-logger", "pretty.trace")
    @js.native
    def trace(args: String*): Unit = js.native
    
    @JSImport("@storybook/client-logger", "pretty.warn")
    @js.native
    def warn(args: String*): Unit = js.native
  }
}
