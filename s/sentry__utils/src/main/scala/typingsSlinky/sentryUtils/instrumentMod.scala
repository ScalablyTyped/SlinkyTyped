package typingsSlinky.sentryUtils

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object instrumentMod {
  
  @JSImport("@sentry/utils/dist/instrument", "addInstrumentationHandler")
  @js.native
  def addInstrumentationHandler(handler: InstrumentHandler): Unit = js.native
  
  @js.native
  trait InstrumentHandler extends StObject {
    
    def callback(data: js.Any): Unit = js.native
    @JSName("callback")
    var callback_Original: InstrumentHandlerCallback = js.native
    
    var `type`: InstrumentHandlerType = js.native
  }
  
  type InstrumentHandlerCallback = js.Function1[/* data */ js.Any, Unit]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.sentryUtils.sentryUtilsStrings.console
    - typingsSlinky.sentryUtils.sentryUtilsStrings.dom
    - typingsSlinky.sentryUtils.sentryUtilsStrings.fetch
    - typingsSlinky.sentryUtils.sentryUtilsStrings.history
    - typingsSlinky.sentryUtils.sentryUtilsStrings.sentry
    - typingsSlinky.sentryUtils.sentryUtilsStrings.xhr
    - typingsSlinky.sentryUtils.sentryUtilsStrings.error
    - typingsSlinky.sentryUtils.sentryUtilsStrings.unhandledrejection
  */
  trait InstrumentHandlerType extends StObject
  object InstrumentHandlerType {
    
    @scala.inline
    def console: typingsSlinky.sentryUtils.sentryUtilsStrings.console = "console".asInstanceOf[typingsSlinky.sentryUtils.sentryUtilsStrings.console]
    
    @scala.inline
    def dom: typingsSlinky.sentryUtils.sentryUtilsStrings.dom = "dom".asInstanceOf[typingsSlinky.sentryUtils.sentryUtilsStrings.dom]
    
    @scala.inline
    def error: typingsSlinky.sentryUtils.sentryUtilsStrings.error = "error".asInstanceOf[typingsSlinky.sentryUtils.sentryUtilsStrings.error]
    
    @scala.inline
    def fetch: typingsSlinky.sentryUtils.sentryUtilsStrings.fetch = "fetch".asInstanceOf[typingsSlinky.sentryUtils.sentryUtilsStrings.fetch]
    
    @scala.inline
    def history: typingsSlinky.sentryUtils.sentryUtilsStrings.history = "history".asInstanceOf[typingsSlinky.sentryUtils.sentryUtilsStrings.history]
    
    @scala.inline
    def sentry: typingsSlinky.sentryUtils.sentryUtilsStrings.sentry = "sentry".asInstanceOf[typingsSlinky.sentryUtils.sentryUtilsStrings.sentry]
    
    @scala.inline
    def unhandledrejection: typingsSlinky.sentryUtils.sentryUtilsStrings.unhandledrejection = "unhandledrejection".asInstanceOf[typingsSlinky.sentryUtils.sentryUtilsStrings.unhandledrejection]
    
    @scala.inline
    def xhr: typingsSlinky.sentryUtils.sentryUtilsStrings.xhr = "xhr".asInstanceOf[typingsSlinky.sentryUtils.sentryUtilsStrings.xhr]
  }
}
