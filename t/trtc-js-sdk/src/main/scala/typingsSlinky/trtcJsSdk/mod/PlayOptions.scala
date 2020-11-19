package typingsSlinky.trtcJsSdk.mod

import typingsSlinky.trtcJsSdk.trtcJsSdkStrings.`scale-down`
import typingsSlinky.trtcJsSdk.trtcJsSdkStrings.contain
import typingsSlinky.trtcJsSdk.trtcJsSdkStrings.cover
import typingsSlinky.trtcJsSdk.trtcJsSdkStrings.fill
import typingsSlinky.trtcJsSdk.trtcJsSdkStrings.none
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PlayOptions extends js.Object {
  
  /** 是否需要 mute 声音，对于本地流通常需要 mute 声音以防止播放从麦克风采集回来的声音。 */
  var muted: Boolean = js.native
  
  /** 视频画面显示模式，参考 [CSS object-fit 属性](https://developer.mozilla.org/zh-CN/docs/Web/CSS/object-fit) */
  var objectFit: contain | cover | fill | none | `scale-down` = js.native
}
object PlayOptions {
  
  @scala.inline
  def apply(muted: Boolean, objectFit: contain | cover | fill | none | `scale-down`): PlayOptions = {
    val __obj = js.Dynamic.literal(muted = muted.asInstanceOf[js.Any], objectFit = objectFit.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlayOptions]
  }
  
  @scala.inline
  implicit class PlayOptionsOps[Self <: PlayOptions] (val x: Self) extends AnyVal {
    
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
    def setMuted(value: Boolean): Self = this.set("muted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjectFit(value: contain | cover | fill | none | `scale-down`): Self = this.set("objectFit", value.asInstanceOf[js.Any])
  }
}
