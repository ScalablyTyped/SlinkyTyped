package typingsSlinky.youtubePlayer.anon

import typingsSlinky.youtubePlayer.youtubePlayerNumbers.`0`
import typingsSlinky.youtubePlayer.youtubePlayerNumbers.`1`
import typingsSlinky.youtubePlayer.youtubePlayerNumbers.`3`
import typingsSlinky.youtubePlayer.youtubePlayerStrings.playlist
import typingsSlinky.youtubePlayer.youtubePlayerStrings.red
import typingsSlinky.youtubePlayer.youtubePlayerStrings.search
import typingsSlinky.youtubePlayer.youtubePlayerStrings.user_uploads
import typingsSlinky.youtubePlayer.youtubePlayerStrings.white
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Autoplay extends js.Object {
  
  var autoplay: js.UndefOr[`0` | `1`] = js.native
  
  var cc_lang_pref: js.UndefOr[String] = js.native
  
  var cc_load_policy: js.UndefOr[`1`] = js.native
  
  var color: js.UndefOr[red | white] = js.native
  
  var controls: js.UndefOr[`0` | `1`] = js.native
  
  var disablekb: js.UndefOr[`0` | `1`] = js.native
  
  var enablejsapi: js.UndefOr[`0` | `1`] = js.native
  
  var end: js.UndefOr[Double] = js.native
  
  var fs: js.UndefOr[`0` | `1`] = js.native
  
  var hl: js.UndefOr[String] = js.native
  
  var iv_load_policy: js.UndefOr[`1` | `3`] = js.native
  
  var list: js.UndefOr[String] = js.native
  
  var listType: js.UndefOr[playlist | search | user_uploads] = js.native
  
  var loop: js.UndefOr[`0` | `1`] = js.native
  
  var modestbranding: js.UndefOr[`1`] = js.native
  
  var origin: js.UndefOr[String] = js.native
  
  var playlist: js.UndefOr[String] = js.native
  
  var playsinline: js.UndefOr[`0` | `1`] = js.native
  
  var rel: js.UndefOr[`0` | `1`] = js.native
  
  var start: js.UndefOr[Double] = js.native
  
  var widget_referrer: js.UndefOr[String] = js.native
}
object Autoplay {
  
  @scala.inline
  def apply(): Autoplay = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Autoplay]
  }
  
  @scala.inline
  implicit class AutoplayOps[Self <: Autoplay] (val x: Self) extends AnyVal {
    
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
    def setAutoplay(value: `0` | `1`): Self = this.set("autoplay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoplay: Self = this.set("autoplay", js.undefined)
    
    @scala.inline
    def setCc_lang_pref(value: String): Self = this.set("cc_lang_pref", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCc_lang_pref: Self = this.set("cc_lang_pref", js.undefined)
    
    @scala.inline
    def setCc_load_policy(value: `1`): Self = this.set("cc_load_policy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCc_load_policy: Self = this.set("cc_load_policy", js.undefined)
    
    @scala.inline
    def setColor(value: red | white): Self = this.set("color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    
    @scala.inline
    def setControls(value: `0` | `1`): Self = this.set("controls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteControls: Self = this.set("controls", js.undefined)
    
    @scala.inline
    def setDisablekb(value: `0` | `1`): Self = this.set("disablekb", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisablekb: Self = this.set("disablekb", js.undefined)
    
    @scala.inline
    def setEnablejsapi(value: `0` | `1`): Self = this.set("enablejsapi", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnablejsapi: Self = this.set("enablejsapi", js.undefined)
    
    @scala.inline
    def setEnd(value: Double): Self = this.set("end", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnd: Self = this.set("end", js.undefined)
    
    @scala.inline
    def setFs(value: `0` | `1`): Self = this.set("fs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFs: Self = this.set("fs", js.undefined)
    
    @scala.inline
    def setHl(value: String): Self = this.set("hl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHl: Self = this.set("hl", js.undefined)
    
    @scala.inline
    def setIv_load_policy(value: `1` | `3`): Self = this.set("iv_load_policy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIv_load_policy: Self = this.set("iv_load_policy", js.undefined)
    
    @scala.inline
    def setList(value: String): Self = this.set("list", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteList: Self = this.set("list", js.undefined)
    
    @scala.inline
    def setListType(value: playlist | search | user_uploads): Self = this.set("listType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteListType: Self = this.set("listType", js.undefined)
    
    @scala.inline
    def setLoop(value: `0` | `1`): Self = this.set("loop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLoop: Self = this.set("loop", js.undefined)
    
    @scala.inline
    def setModestbranding(value: `1`): Self = this.set("modestbranding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModestbranding: Self = this.set("modestbranding", js.undefined)
    
    @scala.inline
    def setOrigin(value: String): Self = this.set("origin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOrigin: Self = this.set("origin", js.undefined)
    
    @scala.inline
    def setPlaylist(value: String): Self = this.set("playlist", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlaylist: Self = this.set("playlist", js.undefined)
    
    @scala.inline
    def setPlaysinline(value: `0` | `1`): Self = this.set("playsinline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlaysinline: Self = this.set("playsinline", js.undefined)
    
    @scala.inline
    def setRel(value: `0` | `1`): Self = this.set("rel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRel: Self = this.set("rel", js.undefined)
    
    @scala.inline
    def setStart(value: Double): Self = this.set("start", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStart: Self = this.set("start", js.undefined)
    
    @scala.inline
    def setWidget_referrer(value: String): Self = this.set("widget_referrer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidget_referrer: Self = this.set("widget_referrer", js.undefined)
  }
}
