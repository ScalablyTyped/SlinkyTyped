package typingsSlinky.standardError.mod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
