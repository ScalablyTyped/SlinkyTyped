package typingsSlinky.winrtUwp.global.Windows.Media.Protection.PlayReady

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Sends PlayReady-ND messages and challenges using the TCP network protocol. */
@JSGlobal("Windows.Media.Protection.PlayReady.NDTCPMessenger")
@js.native
class NDTCPMessenger protected ()
  extends typingsSlinky.winrtUwp.Windows.Media.Protection.PlayReady.NDTCPMessenger {
  /**
    * Creates a new instance of the NDTCPMessenger class.
    * @param remoteHostName The IP address of the remote host that will receive messages. The format is either an IPv4 address in dotted-decimal notation or an IPv6 address in colon-hex notation.
    * @param remoteHostPort The TCP port of the remote host that will receive messages.
    */
  def this(remoteHostName: String, remoteHostPort: Double) = this()
}
