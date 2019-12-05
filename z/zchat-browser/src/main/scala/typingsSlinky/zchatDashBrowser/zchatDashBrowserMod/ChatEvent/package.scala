package typingsSlinky.zchatDashBrowser.zchatDashBrowserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object ChatEvent {
  import typingsSlinky.zchatDashBrowser.Anon_Attachment
  import typingsSlinky.zchatDashBrowser.Anon_Chatcomment
  import typingsSlinky.zchatDashBrowser.Anon_Chatmemberjoin
  import typingsSlinky.zchatDashBrowser.Anon_Chatmemberleave
  import typingsSlinky.zchatDashBrowser.Anon_Chatmsg
  import typingsSlinky.zchatDashBrowser.Anon_Chatrating
  import typingsSlinky.zchatDashBrowser.Anon_Chatrequestrating

  type ChatEventData = (BaseChatEventData with Anon_Chatmsg) | (BaseChatEventData with Anon_Attachment) | (BaseChatEventData with Anon_Chatmemberjoin) | (BaseChatEventData with Anon_Chatmemberleave) | (BaseChatEventData with Anon_Chatrequestrating) | (BaseChatEventData with Anon_Chatrating) | (BaseChatEventData with Anon_Chatcomment)
}
