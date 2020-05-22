package typingsSlinky.weixinApp.anon

import typingsSlinky.weixinApp.wx.networkType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IsConnected extends js.Object {
  var isConnected: Boolean
  var networkType: typingsSlinky.weixinApp.wx.networkType
}

object IsConnected {
  @scala.inline
  def apply(isConnected: Boolean, networkType: networkType): IsConnected = {
    val __obj = js.Dynamic.literal(isConnected = isConnected.asInstanceOf[js.Any], networkType = networkType.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsConnected]
  }
}

