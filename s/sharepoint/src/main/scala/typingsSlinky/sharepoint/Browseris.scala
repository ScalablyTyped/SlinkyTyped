package typingsSlinky.sharepoint

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Browseris extends js.Object {
  var armProcessor: Boolean = js.native
  var chrome: Boolean = js.native
  var chrome7up: Boolean = js.native
  var chrome8up: Boolean = js.native
  var chrome9up: Boolean = js.native
  var firefox: Boolean = js.native
  var firefox36up: Boolean = js.native
  var firefox3up: Boolean = js.native
  var firefox4up: Boolean = js.native
  var ie: Boolean = js.native
  var ie55up: Boolean = js.native
  var ie5up: Boolean = js.native
  var ie7down: Boolean = js.native
  var ie8down: Boolean = js.native
  var ie8standard: Boolean = js.native
  var ie8standardUp: Boolean = js.native
  var ie9down: Boolean = js.native
  var ie9standardUp: Boolean = js.native
  var iever: Boolean = js.native
  var ipad: Boolean = js.native
  var isTouch: Boolean = js.native
  var mac: Boolean = js.native
  var major: Boolean = js.native
  var msTouch: Boolean = js.native
  var nav: Boolean = js.native
  var nav6: Boolean = js.native
  var nav6up: Boolean = js.native
  var nav7up: Boolean = js.native
  var osver: Boolean = js.native
  var safari: Boolean = js.native
  var safari125up: Boolean = js.native
  var safari3up: Boolean = js.native
  var verIEFull: Boolean = js.native
  var w3c: Boolean = js.native
  var webKit: Boolean = js.native
  var win: Boolean = js.native
  var win32: Boolean = js.native
  var win64bit: Boolean = js.native
  var win8AppHost: Boolean = js.native
  var windowsphone: Boolean = js.native
  var winnt: Boolean = js.native
}

object Browseris {
  @scala.inline
  def apply(
    armProcessor: Boolean,
    chrome: Boolean,
    chrome7up: Boolean,
    chrome8up: Boolean,
    chrome9up: Boolean,
    firefox: Boolean,
    firefox36up: Boolean,
    firefox3up: Boolean,
    firefox4up: Boolean,
    ie: Boolean,
    ie55up: Boolean,
    ie5up: Boolean,
    ie7down: Boolean,
    ie8down: Boolean,
    ie8standard: Boolean,
    ie8standardUp: Boolean,
    ie9down: Boolean,
    ie9standardUp: Boolean,
    iever: Boolean,
    ipad: Boolean,
    isTouch: Boolean,
    mac: Boolean,
    major: Boolean,
    msTouch: Boolean,
    nav: Boolean,
    nav6: Boolean,
    nav6up: Boolean,
    nav7up: Boolean,
    osver: Boolean,
    safari: Boolean,
    safari125up: Boolean,
    safari3up: Boolean,
    verIEFull: Boolean,
    w3c: Boolean,
    webKit: Boolean,
    win: Boolean,
    win32: Boolean,
    win64bit: Boolean,
    win8AppHost: Boolean,
    windowsphone: Boolean,
    winnt: Boolean
  ): Browseris = {
    val __obj = js.Dynamic.literal(armProcessor = armProcessor.asInstanceOf[js.Any], chrome = chrome.asInstanceOf[js.Any], chrome7up = chrome7up.asInstanceOf[js.Any], chrome8up = chrome8up.asInstanceOf[js.Any], chrome9up = chrome9up.asInstanceOf[js.Any], firefox = firefox.asInstanceOf[js.Any], firefox36up = firefox36up.asInstanceOf[js.Any], firefox3up = firefox3up.asInstanceOf[js.Any], firefox4up = firefox4up.asInstanceOf[js.Any], ie = ie.asInstanceOf[js.Any], ie55up = ie55up.asInstanceOf[js.Any], ie5up = ie5up.asInstanceOf[js.Any], ie7down = ie7down.asInstanceOf[js.Any], ie8down = ie8down.asInstanceOf[js.Any], ie8standard = ie8standard.asInstanceOf[js.Any], ie8standardUp = ie8standardUp.asInstanceOf[js.Any], ie9down = ie9down.asInstanceOf[js.Any], ie9standardUp = ie9standardUp.asInstanceOf[js.Any], iever = iever.asInstanceOf[js.Any], ipad = ipad.asInstanceOf[js.Any], isTouch = isTouch.asInstanceOf[js.Any], mac = mac.asInstanceOf[js.Any], major = major.asInstanceOf[js.Any], msTouch = msTouch.asInstanceOf[js.Any], nav = nav.asInstanceOf[js.Any], nav6 = nav6.asInstanceOf[js.Any], nav6up = nav6up.asInstanceOf[js.Any], nav7up = nav7up.asInstanceOf[js.Any], osver = osver.asInstanceOf[js.Any], safari = safari.asInstanceOf[js.Any], safari125up = safari125up.asInstanceOf[js.Any], safari3up = safari3up.asInstanceOf[js.Any], verIEFull = verIEFull.asInstanceOf[js.Any], w3c = w3c.asInstanceOf[js.Any], webKit = webKit.asInstanceOf[js.Any], win = win.asInstanceOf[js.Any], win32 = win32.asInstanceOf[js.Any], win64bit = win64bit.asInstanceOf[js.Any], win8AppHost = win8AppHost.asInstanceOf[js.Any], windowsphone = windowsphone.asInstanceOf[js.Any], winnt = winnt.asInstanceOf[js.Any])
    __obj.asInstanceOf[Browseris]
  }
  @scala.inline
  implicit class BrowserisOps[Self <: Browseris] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArmProcessor(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("armProcessor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChrome(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chrome")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChrome7up(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chrome7up")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChrome8up(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chrome8up")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChrome9up(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chrome9up")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFirefox(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firefox")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFirefox36up(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firefox36up")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFirefox3up(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firefox3up")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFirefox4up(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firefox4up")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIe(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ie")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIe55up(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ie55up")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIe5up(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ie5up")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIe7down(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ie7down")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIe8down(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ie8down")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIe8standard(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ie8standard")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIe8standardUp(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ie8standardUp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIe9down(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ie9down")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIe9standardUp(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ie9standardUp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIever(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iever")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIpad(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ipad")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsTouch(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isTouch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMac(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mac")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMajor(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("major")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMsTouch(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("msTouch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNav(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nav")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNav6(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nav6")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNav6up(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nav6up")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNav7up(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nav7up")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOsver(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("osver")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSafari(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("safari")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSafari125up(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("safari125up")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSafari3up(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("safari3up")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVerIEFull(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verIEFull")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withW3c(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("w3c")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWebKit(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("webKit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWin(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("win")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWin32(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("win32")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWin64bit(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("win64bit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWin8AppHost(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("win8AppHost")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWindowsphone(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("windowsphone")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWinnt(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("winnt")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

