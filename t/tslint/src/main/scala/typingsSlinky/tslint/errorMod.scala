package typingsSlinky.tslint

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object errorMod {
  
  @JSImport("tslint/lib/error", "Error")
  @js.native
  class Error () extends StObject {
    def this(message: String) = this()
    
    var message: String = js.native
    
    var name: js.UndefOr[String] = js.native
    
    var stack: js.UndefOr[String] = js.native
  }
  
  @JSImport("tslint/lib/error", "FatalError")
  @js.native
  class FatalError protected () extends Error {
    def this(message: String) = this()
    def this(message: String, innerError: Error) = this()
    
    var innerError: js.UndefOr[Error] = js.native
  }
  /* static members */
  object FatalError {
    
    @JSImport("tslint/lib/error", "FatalError")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("tslint/lib/error", "FatalError.NAME")
    @js.native
    def NAME: String = js.native
    @scala.inline
    def NAME_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NAME")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("tslint/lib/error", "isError")
  @js.native
  def isError(possibleError: js.Any): /* is tslint.tslint/lib/error.Error */ Boolean = js.native
  
  @JSImport("tslint/lib/error", "showRuleCrashWarning")
  @js.native
  def showRuleCrashWarning(message: String, ruleName: String, fileName: String): Unit = js.native
  
  @JSImport("tslint/lib/error", "showWarningOnce")
  @js.native
  def showWarningOnce(message: String): Unit = js.native
}
