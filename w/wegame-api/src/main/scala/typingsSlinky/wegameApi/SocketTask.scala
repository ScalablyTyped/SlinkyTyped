package typingsSlinky.wegameApi

import typingsSlinky.wegameApi.wx.types.SocketCloseParams
import typingsSlinky.wegameApi.wx.types.SocketErrorCallback
import typingsSlinky.wegameApi.wx.types.SocketMessageCallback
import typingsSlinky.wegameApi.wx.types.SocketOpenCallback
import typingsSlinky.wegameApi.wx.types.SocketSendParams
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SocketTask")
@js.native
class SocketTask () extends js.Object {
  /**
    * 关闭WebSocket连接
    */
  def close(param: SocketCloseParams): Unit = js.native
  /**
    * 监听WebSocket 连接关闭事件
    */
  def onClose(callback: js.Function0[Unit]): Unit = js.native
  /**
    * 监听WebSocket 错误事件
    */
  def onError(callback: SocketErrorCallback): Unit = js.native
  /**
    * 监听WebSocket 接受到服务器的消息事件
    */
  def onMessage(callback: SocketMessageCallback): Unit = js.native
  /**
    * 监听WebSocket 连接打开事件
    */
  def onOpen(callback: SocketOpenCallback): Unit = js.native
  /**
    * 通过WebSocket发送数据
    */
  def send(param: SocketSendParams): Unit = js.native
}

