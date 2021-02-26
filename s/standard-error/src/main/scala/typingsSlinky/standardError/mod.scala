package typingsSlinky.standardError

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("standard-error", JSImport.Namespace)
  @js.native
  class ^ protected () extends StandardError {
    def this(message: String) = this()
    def this(props: js.Any) = this()
    def this(message: String, props: js.Any) = this()
  }
  
  @js.native
  trait StandardError
    extends Error
       with /* key */ StringDictionary[js.Any]
  object StandardError {
    
    @scala.inline
    def apply(message: String, name: String): StandardError = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[StandardError]
    }
  }
}
