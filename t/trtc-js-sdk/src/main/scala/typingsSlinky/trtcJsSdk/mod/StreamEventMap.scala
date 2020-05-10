package typingsSlinky.trtcJsSdk.mod

import typingsSlinky.trtcJsSdk.AnonState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StreamEventMap extends js.Object {
  /** Audio/Video Player 状态变化事件 App 可根据状态变化来更新 UI，比如，通过监听 video player 状态变化来关闭或打开遮板。 */
  var `player-state-changed`: AnonState = js.native
  /** 本地屏幕分享停止事件通知，仅对本地屏幕分享流有效。 */
  var `screen-sharing-stopped`: js.UndefOr[scala.Nothing] = js.native
}

object StreamEventMap {
  @scala.inline
  def apply(`player-state-changed`: AnonState): StreamEventMap = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("player-state-changed")(`player-state-changed`.asInstanceOf[js.Any])
    __obj.asInstanceOf[StreamEventMap]
  }
  @scala.inline
  implicit class StreamEventMapOps[Self <: StreamEventMap] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def `withPlayer-state-changed`(value: AnonState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("player-state-changed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withScreen-sharing-stopped`(value: scala.Nothing): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("screen-sharing-stopped")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutScreen-sharing-stopped`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("screen-sharing-stopped")(js.undefined)
        ret
    }
  }
  
}

