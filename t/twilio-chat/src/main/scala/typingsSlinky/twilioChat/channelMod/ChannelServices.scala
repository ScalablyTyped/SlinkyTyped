package typingsSlinky.twilioChat.channelMod

import typingsSlinky.twilioChat.consumptionhorizonMod.ConsumptionHorizon
import typingsSlinky.twilioChat.networkMod.Network
import typingsSlinky.twilioChat.sessionMod.Session
import typingsSlinky.twilioChat.typingindicatorMod.TypingIndicator
import typingsSlinky.twilioChat.usersMod.Users
import typingsSlinky.twilioMcsClient.mod.McsClient
import typingsSlinky.twilioSync.mod.SyncClient
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

