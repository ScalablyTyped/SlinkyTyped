package typingsSlinky.twilioDashChat.libChannelMod

import typingsSlinky.twilioDashChat.libDataUsersMod.Users
import typingsSlinky.twilioDashChat.libServicesConsumptionhorizonMod.ConsumptionHorizon
import typingsSlinky.twilioDashChat.libServicesNetworkMod.Network
import typingsSlinky.twilioDashChat.libServicesTypingindicatorMod.TypingIndicator
import typingsSlinky.twilioDashChat.libSessionMod.Session
import typingsSlinky.twilioDashMcsDashClient.twilioDashMcsDashClientMod.McsClient
import typingsSlinky.twilioDashSync.twilioDashSyncMod.SyncClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChannelServices extends js.Object {
  var consumptionHorizon: ConsumptionHorizon
  var mcsClient: McsClient
  var network: Network
  var session: Session
  var syncClient: SyncClient
  var typingIndicator: TypingIndicator
  var users: Users
}

object ChannelServices {
  @scala.inline
  def apply(
    consumptionHorizon: ConsumptionHorizon,
    mcsClient: McsClient,
    network: Network,
    session: Session,
    syncClient: SyncClient,
    typingIndicator: TypingIndicator,
    users: Users
  ): ChannelServices = {
    val __obj = js.Dynamic.literal(consumptionHorizon = consumptionHorizon.asInstanceOf[js.Any], mcsClient = mcsClient.asInstanceOf[js.Any], network = network.asInstanceOf[js.Any], session = session.asInstanceOf[js.Any], syncClient = syncClient.asInstanceOf[js.Any], typingIndicator = typingIndicator.asInstanceOf[js.Any], users = users.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ChannelServices]
  }
}

