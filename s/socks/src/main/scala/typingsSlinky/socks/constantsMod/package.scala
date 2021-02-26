package typingsSlinky.socks

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object constantsMod {
  
  @scala.inline
  def DEFAULT_TIMEOUT: /* 30000 */ scala.Double = typingsSlinky.socks.constantsMod.^.asInstanceOf[js.Dynamic].selectDynamic("DEFAULT_TIMEOUT").asInstanceOf[/* 30000 */ scala.Double]
  
  type SocksClientBoundEvent = typingsSlinky.socks.constantsMod.SocksClientEstablishedEvent
  
  /**
    * Represents a SocksProxy
    */
  type SocksProxy = typingsSlinky.socks.utilMod.RequireOnlyOne[
    typingsSlinky.socks.anon.Host, 
    typingsSlinky.socks.socksStrings.host | typingsSlinky.socks.socksStrings.ipaddress
  ]
}
