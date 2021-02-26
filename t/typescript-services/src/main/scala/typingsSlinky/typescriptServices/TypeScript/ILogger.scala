package typingsSlinky.typescriptServices.TypeScript

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ILogger extends StObject {
  
  def debug(): Boolean = js.native
  
  def error(): Boolean = js.native
  
  def fatal(): Boolean = js.native
  
  def information(): Boolean = js.native
  
  def log(s: String): Unit = js.native
  
  def warning(): Boolean = js.native
}
object ILogger {
  
  @scala.inline
  def apply(
    debug: () => Boolean,
    error: () => Boolean,
    fatal: () => Boolean,
    information: () => Boolean,
    log: String => Unit,
    warning: () => Boolean
  ): ILogger = {
    val __obj = js.Dynamic.literal(debug = js.Any.fromFunction0(debug), error = js.Any.fromFunction0(error), fatal = js.Any.fromFunction0(fatal), information = js.Any.fromFunction0(information), log = js.Any.fromFunction1(log), warning = js.Any.fromFunction0(warning))
    __obj.asInstanceOf[ILogger]
  }
  
  @scala.inline
  implicit class ILoggerMutableBuilder[Self <: ILogger] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDebug(value: () => Boolean): Self = StObject.set(x, "debug", js.Any.fromFunction0(value))
    
    @scala.inline
    def setError(value: () => Boolean): Self = StObject.set(x, "error", js.Any.fromFunction0(value))
    
    @scala.inline
    def setFatal(value: () => Boolean): Self = StObject.set(x, "fatal", js.Any.fromFunction0(value))
    
    @scala.inline
    def setInformation(value: () => Boolean): Self = StObject.set(x, "information", js.Any.fromFunction0(value))
    
    @scala.inline
    def setLog(value: String => Unit): Self = StObject.set(x, "log", js.Any.fromFunction1(value))
    
    @scala.inline
    def setWarning(value: () => Boolean): Self = StObject.set(x, "warning", js.Any.fromFunction0(value))
  }
}
