package typingsSlinky.twilioChat.channelsMod

import typingsSlinky.twilioChat.consumptionhorizonMod.ConsumptionHorizon
import typingsSlinky.twilioChat.networkMod.Network
import typingsSlinky.twilioChat.sessionMod.Session
import typingsSlinky.twilioChat.synclistMod.SyncList
import typingsSlinky.twilioChat.typingindicatorMod.TypingIndicator
import typingsSlinky.twilioChat.usersMod.Users
import typingsSlinky.twilioMcsClient.mod.McsClient
import typingsSlinky.twilioSync.mod.SyncClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChannelsServices extends js.Object {
  var consumptionHorizon: ConsumptionHorizon = js.native
  var mcsClient: McsClient = js.native
  var network: Network = js.native
  var session: Session = js.native
  var syncClient: SyncClient = js.native
  var syncList: SyncList = js.native
  var typingIndicator: TypingIndicator = js.native
  var users: Users = js.native
}

object ChannelsServices {
  @scala.inline
  def apply(
    consumptionHorizon: ConsumptionHorizon,
    mcsClient: McsClient,
    network: Network,
    session: Session,
    syncClient: SyncClient,
    syncList: SyncList,
    typingIndicator: TypingIndicator,
    users: Users
  ): ChannelsServices = {
    val __obj = js.Dynamic.literal(consumptionHorizon = consumptionHorizon.asInstanceOf[js.Any], mcsClient = mcsClient.asInstanceOf[js.Any], network = network.asInstanceOf[js.Any], session = session.asInstanceOf[js.Any], syncClient = syncClient.asInstanceOf[js.Any], syncList = syncList.asInstanceOf[js.Any], typingIndicator = typingIndicator.asInstanceOf[js.Any], users = users.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChannelsServices]
  }
  @scala.inline
  implicit class ChannelsServicesOps[Self <: ChannelsServices] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConsumptionHorizon(value: ConsumptionHorizon): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("consumptionHorizon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMcsClient(value: McsClient): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mcsClient")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNetwork(value: Network): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("network")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSession(value: Session): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("session")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSyncClient(value: SyncClient): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("syncClient")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSyncList(value: SyncList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("syncList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTypingIndicator(value: TypingIndicator): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("typingIndicator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUsers(value: Users): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("users")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

