package typingsSlinky.storybookChannelPostmessage

import typingsSlinky.storybookChannelPostmessage.storybookChannelPostmessageStrings.manager
import typingsSlinky.storybookChannelPostmessage.storybookChannelPostmessageStrings.preview
import typingsSlinky.storybookChannels.mod.ChannelEvent
import typingsSlinky.storybookChannels.mod.ChannelHandler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@storybook/channel-postmessage", JSImport.Default)
  @js.native
  def default(hasPage: Config): typingsSlinky.storybookChannels.mod.default = js.native
  
  @JSImport("@storybook/channel-postmessage", "KEY")
  @js.native
  val KEY: /* "storybook-channel" */ String = js.native
  
  @JSImport("@storybook/channel-postmessage", "PostmsgTransport")
  @js.native
  class PostmsgTransport protected () extends StObject {
    def this(config: Config) = this()
    
    var buffer: js.Any = js.native
    
    val config: js.Any = js.native
    
    var connected: js.Any = js.native
    
    var flush: js.Any = js.native
    
    var getCurrentFrames: js.Any = js.native
    
    var getFrames: js.Any = js.native
    
    var getLocalFrame: js.Any = js.native
    
    var handleEvent: js.Any = js.native
    
    var handler: js.Any = js.native
    
    /**
      * Sends `event` to the associated window. If the window does not yet exist
      * the event will be stored in a buffer and sent when the window exists.
      * @param event
      */
    def send(event: ChannelEvent): js.Promise[_] = js.native
    def send(event: ChannelEvent, options: js.Any): js.Promise[_] = js.native
    
    def setHandler(handler: ChannelHandler): Unit = js.native
  }
  
  @js.native
  trait Config extends StObject {
    
    var page: manager | preview = js.native
  }
  object Config {
    
    @scala.inline
    def apply(page: manager | preview): Config = {
      val __obj = js.Dynamic.literal(page = page.asInstanceOf[js.Any])
      __obj.asInstanceOf[Config]
    }
    
    @scala.inline
    implicit class ConfigMutableBuilder[Self <: Config] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPage(value: manager | preview): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
    }
  }
}
