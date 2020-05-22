package typingsSlinky.trtcJsSdk.mod

import typingsSlinky.trtcJsSdk.trtcJsSdkStrings.`scale-down`
import typingsSlinky.trtcJsSdk.trtcJsSdkStrings.contain
import typingsSlinky.trtcJsSdk.trtcJsSdkStrings.cover
import typingsSlinky.trtcJsSdk.trtcJsSdkStrings.fill
import typingsSlinky.trtcJsSdk.trtcJsSdkStrings.none
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlayOptions extends js.Object {
  /** 是否需要 mute 声音，对于本地流通常需要 mute 声音以防止播放从麦克风采集回来的声音。 */
  var muted: Boolean
  /** 视频画面显示模式，参考 [CSS object-fit 属性](https://developer.mozilla.org/zh-CN/docs/Web/CSS/object-fit) */
  var objectFit: contain | cover | fill | none | `scale-down`
}

object PlayOptions {
  @scala.inline
  def apply(muted: Boolean, objectFit: contain | cover | fill | none | `scale-down`): PlayOptions = {
    val __obj = js.Dynamic.literal(muted = muted.asInstanceOf[js.Any], objectFit = objectFit.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlayOptions]
  }
}

