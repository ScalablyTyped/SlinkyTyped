package typingsSlinky.storybookClientApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChannelChannel extends js.Object {
  
  var channel: typingsSlinky.storybookChannels.mod.Channel = js.native
}
object ChannelChannel {
  
  @scala.inline
  def apply(channel: typingsSlinky.storybookChannels.mod.Channel): ChannelChannel = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChannelChannel]
  }
  
  @scala.inline
  implicit class ChannelChannelOps[Self <: ChannelChannel] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setChannel(value: typingsSlinky.storybookChannels.mod.Channel): Self = this.set("channel", value.asInstanceOf[js.Any])
  }
}
