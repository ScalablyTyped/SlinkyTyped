package typingsSlinky.twilioChat.channelsMod

import typingsSlinky.node.eventsMod.EventEmitter
import typingsSlinky.std.Map
import typingsSlinky.twilioChat.channeldescriptorMod.ChannelDescriptor
import typingsSlinky.twilioChat.deferredMod.Deferred
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents channels collection
  * {@see Channel}
  */
@JSImport("twilio-chat/lib/data/channels", "Channels")
@js.native
class Channels_ protected () extends EventEmitter {
  def this(services: ChannelsServices) = this()
  
  var _wrapPaginator: js.Any = js.native
  
  /**
    * Add channel to server
    * @private
    * @returns {Promise<Channel|SessionError>} Channel
    */
  def addChannel(options: js.Any): js.Promise[typingsSlinky.twilioChat.channelMod.Channel] = js.native
  
  val channels: Map[String, typingsSlinky.twilioChat.channelMod.Channel] = js.native
  
  /**
    * Fetch channels list and instantiate all necessary objects
    */
  def fetchChannels(): Unit = js.native
  
  def getChannel(sid: String): js.Promise[typingsSlinky.twilioChat.channelMod.Channel] = js.native
  
  def getChannels(args: js.Any): js.Promise[_] = js.native
  
  var getMap: js.Any = js.native
  
  var onChannelRemoved: js.Any = js.native
  
  def pushChannel(descriptor: ChannelDescriptor): js.Promise[typingsSlinky.twilioChat.channelMod.Channel] = js.native
  
  var registerForEvents: js.Any = js.native
  
  var services: js.Any = js.native
  
  var syncListFetched: js.Any = js.native
  
  val syncListRead: Deferred[Boolean] = js.native
  
  val thumbstones: js.Any = js.native
  
  var upsertChannel: js.Any = js.native
}
