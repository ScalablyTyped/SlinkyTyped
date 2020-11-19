package typingsSlinky.weixinApp.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetBackgroundAudioPlayerStateOptions
  extends BaseOptions[js.Any, js.Any] {
  
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  @JSName("complete")
  var complete_GetBackgroundAudioPlayerStateOptions: js.UndefOr[js.Function0[Unit]] = js.native
  
  /** 接口调用失败的回调函数 */
  @JSName("fail")
  var fail_GetBackgroundAudioPlayerStateOptions: js.UndefOr[js.Function0[Unit]] = js.native
  
  /** 接口调用成功的回调函数 */
  @JSName("success")
  var success_GetBackgroundAudioPlayerStateOptions: js.UndefOr[js.Function1[/* state */ BackgroundAudioPlayerState, Unit]] = js.native
}
object GetBackgroundAudioPlayerStateOptions {
  
  @scala.inline
  def apply(): GetBackgroundAudioPlayerStateOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetBackgroundAudioPlayerStateOptions]
  }
  
  @scala.inline
  implicit class GetBackgroundAudioPlayerStateOptionsOps[Self <: GetBackgroundAudioPlayerStateOptions] (val x: Self) extends AnyVal {
    
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
    def setComplete(value: () => Unit): Self = this.set("complete", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteComplete: Self = this.set("complete", js.undefined)
    
    @scala.inline
    def setFail(value: () => Unit): Self = this.set("fail", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteFail: Self = this.set("fail", js.undefined)
    
    @scala.inline
    def setSuccess(value: /* state */ BackgroundAudioPlayerState => Unit): Self = this.set("success", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSuccess: Self = this.set("success", js.undefined)
  }
}
