package typingsSlinky.zepto.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Chrome extends js.Object {
  /**
  		* Specific browser
  		**/
  var chrome: Boolean = js.native
  var firefox: Boolean = js.native
  var playbook: Boolean = js.native
  var silk: Boolean = js.native
  /**
  		* Browser version.
  		**/
  var version: String = js.native
}

object Chrome {
  @scala.inline
  def apply(chrome: Boolean, firefox: Boolean, playbook: Boolean, silk: Boolean, version: String): Chrome = {
    val __obj = js.Dynamic.literal(chrome = chrome.asInstanceOf[js.Any], firefox = firefox.asInstanceOf[js.Any], playbook = playbook.asInstanceOf[js.Any], silk = silk.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[Chrome]
  }
  @scala.inline
  implicit class ChromeOps[Self <: Chrome] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChrome(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chrome")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFirefox(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firefox")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPlaybook(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("playbook")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSilk(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("silk")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

