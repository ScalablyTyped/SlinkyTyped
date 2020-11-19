package typingsSlinky.twilioChat.userchannelsMod

import typingsSlinky.twilioChat.channeldescriptorMod.ChannelDescriptor
import typingsSlinky.twilioChat.mod.Client
import typingsSlinky.twilioChat.restpaginatorMod.RestPaginator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Users channels collection
  * It's a cassandra-backed pull-based collection
  */
@JSImport("twilio-chat/lib/data/userchannels", "UserChannels")
@js.native
class UserChannels protected () extends js.Object {
  def this(client: Client, services: UserChannelServices, url: String) = this()
  
  var client: js.Any = js.native
  
  def getChannels(): js.Promise[RestPaginator[ChannelDescriptor]] = js.native
  def getChannels(args: js.Any): js.Promise[RestPaginator[ChannelDescriptor]] = js.native
  
  var services: js.Any = js.native
  
  var url: js.Any = js.native
}
