package typingsSlinky.sipJs

import typingsSlinky.sipJs.simpleUserOptionsMod.SimpleUserOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object simpleUserMod {
  
  @JSImport("sip.js/lib/platform/web/simple-user", "SimpleUser")
  @js.native
  class SimpleUser protected ()
    extends typingsSlinky.sipJs.simpleUserSimpleUserMod.SimpleUser {
    /**
      * Constructs a new instance of the `SimpleUser` class.
      * @param server - SIP WebSocket Server URL.
      * @param options - Options bucket. See {@link SimpleUserOptions} for details.
      */
    def this(server: String) = this()
    def this(server: String, options: SimpleUserOptions) = this()
  }
}
