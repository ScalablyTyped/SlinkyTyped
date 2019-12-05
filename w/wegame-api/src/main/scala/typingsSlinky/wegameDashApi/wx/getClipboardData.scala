package typingsSlinky.wegameDashApi.wx

import typingsSlinky.wegameDashApi.wx.types.CallbacksWithType
import typingsSlinky.wegameDashApi.wx.types.ClipboardData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("wx.getClipboardData")
@js.native
object getClipboardData extends js.Object {
  // --剪贴板
  /**
    * 取得系统剪贴板的内容
    */
  def apply(cb: CallbacksWithType[ClipboardData]): Unit = js.native
}

