package typingsSlinky.sentryTypes.errorMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExtendedError
  extends Error
     with /* key */ StringDictionary[js.Any]
object ExtendedError {
  
  @scala.inline
  def apply(message: String, name: String): ExtendedError = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExtendedError]
  }
}
