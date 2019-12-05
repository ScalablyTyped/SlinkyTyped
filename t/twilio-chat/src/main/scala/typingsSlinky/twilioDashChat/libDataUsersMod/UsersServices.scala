package typingsSlinky.twilioDashChat.libDataUsersMod

import typingsSlinky.twilioDashChat.libServicesNetworkMod.Network
import typingsSlinky.twilioDashChat.libSessionMod.Session
import typingsSlinky.twilioDashSync.twilioDashSyncMod.SyncClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UsersServices extends js.Object {
  var network: Network
  var session: Session
  var syncClient: SyncClient
}

object UsersServices {
  @scala.inline
  def apply(network: Network, session: Session, syncClient: SyncClient): UsersServices = {
    val __obj = js.Dynamic.literal(network = network.asInstanceOf[js.Any], session = session.asInstanceOf[js.Any], syncClient = syncClient.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[UsersServices]
  }
}

