package typingsSlinky.unimodulesReactNativeAdapter

import typingsSlinky.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object codedErrorMod {
  
  @JSImport("@unimodules/react-native-adapter/build/errors/CodedError", "CodedError")
  @js.native
  class CodedError protected () extends Error {
    def this(code: String, message: String) = this()
    
    var code: String = js.native
    
    var info: js.UndefOr[js.Any] = js.native
  }
}
