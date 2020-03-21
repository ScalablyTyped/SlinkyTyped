package typingsSlinky.zchatBrowser.mod

import typingsSlinky.zchatBrowser.zchatBrowserStrings.offline
import typingsSlinky.zchatBrowser.zchatBrowserStrings.online
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Department extends js.Object {
  var id: Double
  var name: String
  var status: online | offline
}

object Department {
  @scala.inline
  def apply(id: Double, name: String, status: online | offline): Department = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Department]
  }
}

