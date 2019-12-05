package typingsSlinky.wegameDashApi.wx

import typingsSlinky.wegameDashApi.Anon_Auto
import typingsSlinky.wegameDashApi.Camera
import typingsSlinky.wegameDashApi.wx.types.Callbacks
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("wx.createCamera")
@js.native
object createCamera extends js.Object {
  // --相机
  /**
    * 创建相机
    * @param param 创建相机所需的初始化信息
    */
  def apply(): Camera = js.native
  def apply(param: Callbacks with Anon_Auto): Camera = js.native
}

