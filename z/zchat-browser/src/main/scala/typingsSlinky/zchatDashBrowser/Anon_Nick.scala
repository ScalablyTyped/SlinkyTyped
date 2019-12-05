package typingsSlinky.zchatDashBrowser

import typingsSlinky.zchatDashBrowser.zchatDashBrowserMod._EventData
import typingsSlinky.zchatDashBrowser.zchatDashBrowserStrings.typing
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Nick extends _EventData {
  var nick: String
  var `type`: typing
  var typing: Boolean
}

object Anon_Nick {
  @scala.inline
  def apply(nick: String, `type`: typing, typing: Boolean): Anon_Nick = {
    val __obj = js.Dynamic.literal(nick = nick.asInstanceOf[js.Any], typing = typing.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Nick]
  }
}

