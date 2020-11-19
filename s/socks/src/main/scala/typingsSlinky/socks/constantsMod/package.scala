package typingsSlinky.socks

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object constantsMod {
  
  type SocksClientBoundEvent = typingsSlinky.socks.constantsMod.SocksClientEstablishedEvent
  
  /**
    * Represents a SocksProxy
    */
  type SocksProxy = typingsSlinky.socks.utilMod.RequireOnlyOne[
    typingsSlinky.socks.anon.Host, 
    typingsSlinky.socks.socksStrings.host | typingsSlinky.socks.socksStrings.ipaddress
  ]
}
