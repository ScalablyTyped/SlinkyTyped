package typingsSlinky.winrt.Windows.Networking

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait HostNameType extends js.Object
@JSGlobal("Windows.Networking.HostNameType")
@js.native
object HostNameType extends js.Object {
  
  @js.native
  sealed trait bluetooth extends HostNameType
  
  @js.native
  sealed trait domainName extends HostNameType
  
  @js.native
  sealed trait ipv4 extends HostNameType
  
  @js.native
  sealed trait ipv6 extends HostNameType
}
