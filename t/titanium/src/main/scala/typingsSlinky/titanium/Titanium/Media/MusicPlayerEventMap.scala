package typingsSlinky.titanium.Titanium.Media

import typingsSlinky.titanium.ProxyEventMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MusicPlayerEventMap extends ProxyEventMap {
  var playingchange: MusicPlayerPlayingchangeEvent = js.native
  var statechange: MusicPlayerStatechangeEvent = js.native
}

object MusicPlayerEventMap {
  @scala.inline
  def apply(playingchange: MusicPlayerPlayingchangeEvent, statechange: MusicPlayerStatechangeEvent): MusicPlayerEventMap = {
    val __obj = js.Dynamic.literal(playingchange = playingchange.asInstanceOf[js.Any], statechange = statechange.asInstanceOf[js.Any])
    __obj.asInstanceOf[MusicPlayerEventMap]
  }
  @scala.inline
  implicit class MusicPlayerEventMapOps[Self <: MusicPlayerEventMap] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPlayingchange(value: MusicPlayerPlayingchangeEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("playingchange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatechange(value: MusicPlayerStatechangeEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("statechange")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

