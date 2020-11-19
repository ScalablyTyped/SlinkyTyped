package typingsSlinky.unimodulesReactNativeAdapter

import typingsSlinky.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@unimodules/react-native-adapter/build/errors/CodedError", JSImport.Namespace)
@js.native
object codedErrorMod extends js.Object {
  
  @js.native
  class CodedError protected () extends Error {
    def this(code: String, message: String) = this()
    
    var code: String = js.native
    
    var info: js.UndefOr[js.Any] = js.native
  }
}
