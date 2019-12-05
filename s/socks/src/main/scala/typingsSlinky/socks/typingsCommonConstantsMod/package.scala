package typingsSlinky.socks

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object typingsCommonConstantsMod {
  import typingsSlinky.socks.Anon_Host
  import typingsSlinky.socks.socksStrings.host
  import typingsSlinky.socks.socksStrings.ipaddress
  import typingsSlinky.socks.typingsCommonUtilMod.RequireOnlyOne

  type SocksClientBoundEvent = SocksClientEstablishedEvent
  /**
    * Represents a SocksProxy
    */
  type SocksProxy = RequireOnlyOne[Anon_Host, host | ipaddress]
}
