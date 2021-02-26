package typingsSlinky.zetapushJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClientOptions extends Options {
  
  def authentication(): AbstractHandshake = js.native
}
object ClientOptions {
  
  @scala.inline
  def apply(authentication: () => AbstractHandshake, sandboxId: String): ClientOptions = {
    val __obj = js.Dynamic.literal(authentication = js.Any.fromFunction0(authentication), sandboxId = sandboxId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClientOptions]
  }
  
  @scala.inline
  implicit class ClientOptionsMutableBuilder[Self <: ClientOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuthentication(value: () => AbstractHandshake): Self = StObject.set(x, "authentication", js.Any.fromFunction0(value))
  }
}
