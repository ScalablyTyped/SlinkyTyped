package typingsSlinky.socks

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object constantsMod {
  type SocksClientBoundEvent = typingsSlinky.socks.constantsMod.SocksClientEstablishedEvent
  /**
    * Represents a SocksProxy
    */
  type SocksProxy = typingsSlinky.socks.utilMod.RequireOnlyOne[
    typingsSlinky.socks.AnonHost, 
    typingsSlinky.socks.socksStrings.host | typingsSlinky.socks.socksStrings.ipaddress
  ]
}
