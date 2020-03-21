package typingsSlinky.wegameApi.wx

import typingsSlinky.wegameApi.wx.types.BatteryInfo
import typingsSlinky.wegameApi.wx.types.CallbacksWithType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("wx.getBatteryInfo")
@js.native
object getBatteryInfo extends js.Object {
  // --电量
  /**
    * 获取设备电量。同步 API wx.getBatteryInfoSync 在 iOS 上不可用。
    */
  def apply(cb: CallbacksWithType[BatteryInfo]): Unit = js.native
}

