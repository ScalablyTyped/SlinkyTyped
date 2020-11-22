package typingsSlinky.wechatMiniprogram.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ErrCodeNumber extends js.Object {
  
  /**
    * 错误码
    *
    * - `1000` 后端错误调用失败 该项错误不是开发者的异常情况 一般情况下忽略一段时间即可恢复。
    * - `1001` 参数错误 使用方法错误 可以前往developers.weixin.qq.com 确认具体教程 (小程序和小游戏分别有各自的教程，可以在顶部选项中，“设计”一栏的右侧进行切换)。
    * - `1002` 广告单元无效 可能是拼写错误、或者误用了其他APP的广告ID 请重新前往mp.weixin.qq.com确认广告位ID。
    * - `1003` 内部错误 该项错误不是开发者的异常情况 一般情况下忽略一段时间即可恢复。
    * - `1004` 无适合的广告 广告不是每一次都会出现，这次没有出现可能是由于该用户不适合浏览广告 属于正常情况，且开发者需要针对这种情况做形态上的兼容。
    * - `1005` 广告组件审核中 你的广告正在被审核，无法展现广告 请前往mp.weixin.qq.com确认审核状态，且开发者需要针对这种情况做形态上的兼容。
    * - `1006` 广告组件被驳回 你的广告审核失败，无法展现广告 请前往mp.weixin.qq.com确认审核状态，且开发者需要针对这种情况做形态上的兼容。
    * - `1007` 广告组件被驳回 你的广告能力已经被封禁，封禁期间无法展现广告 请前往mp.weixin.qq.com确认小程序广告封禁状态。
    * - `1008` 广告单元已关闭 该广告位的广告能力已经被关闭 请前往mp.weixin.qq.com重新打开对应广告位的展现。
    */
  var errCode: Double = js.native
}
object ErrCodeNumber {
  
  @scala.inline
  def apply(errCode: Double): ErrCodeNumber = {
    val __obj = js.Dynamic.literal(errCode = errCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[ErrCodeNumber]
  }
  
  @scala.inline
  implicit class ErrCodeNumberOps[Self <: ErrCodeNumber] (val x: Self) extends AnyVal {
    
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
    def setErrCode(value: Double): Self = this.set("errCode", value.asInstanceOf[js.Any])
  }
}
