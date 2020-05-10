package typingsSlinky.webdriver.WebDriver

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChromeOptions extends js.Object {
  var args: js.UndefOr[js.Array[String]] = js.native
  var binary: js.UndefOr[String] = js.native
  var debuggerAddress: js.UndefOr[String] = js.native
  var detach: js.UndefOr[Boolean] = js.native
  var excludeSwitches: js.UndefOr[js.Array[String]] = js.native
  var extensions: js.UndefOr[js.Array[String]] = js.native
  var localState: js.UndefOr[StringDictionary[js.Any]] = js.native
  var minidumpPath: js.UndefOr[String] = js.native
  var mobileEmulation: js.UndefOr[StringDictionary[js.Any]] = js.native
  var perfLoggingPrefs: js.UndefOr[StringDictionary[js.Any]] = js.native
  var prefs: js.UndefOr[StringDictionary[String | Double | Boolean]] = js.native
  var windowTypes: js.UndefOr[js.Array[String]] = js.native
}

object ChromeOptions {
  @scala.inline
  def apply(): ChromeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChromeOptions]
  }
  @scala.inline
  implicit class ChromeOptionsOps[Self <: ChromeOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArgs(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("args")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArgs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("args")(js.undefined)
        ret
    }
    @scala.inline
    def withBinary(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("binary")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBinary: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("binary")(js.undefined)
        ret
    }
    @scala.inline
    def withDebuggerAddress(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debuggerAddress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDebuggerAddress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debuggerAddress")(js.undefined)
        ret
    }
    @scala.inline
    def withDetach(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("detach")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDetach: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("detach")(js.undefined)
        ret
    }
    @scala.inline
    def withExcludeSwitches(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("excludeSwitches")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExcludeSwitches: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("excludeSwitches")(js.undefined)
        ret
    }
    @scala.inline
    def withExtensions(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extensions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExtensions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extensions")(js.undefined)
        ret
    }
    @scala.inline
    def withLocalState(value: StringDictionary[js.Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("localState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocalState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("localState")(js.undefined)
        ret
    }
    @scala.inline
    def withMinidumpPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minidumpPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinidumpPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minidumpPath")(js.undefined)
        ret
    }
    @scala.inline
    def withMobileEmulation(value: StringDictionary[js.Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mobileEmulation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMobileEmulation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mobileEmulation")(js.undefined)
        ret
    }
    @scala.inline
    def withPerfLoggingPrefs(value: StringDictionary[js.Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("perfLoggingPrefs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPerfLoggingPrefs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("perfLoggingPrefs")(js.undefined)
        ret
    }
    @scala.inline
    def withPrefs(value: StringDictionary[String | Double | Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prefs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrefs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prefs")(js.undefined)
        ret
    }
    @scala.inline
    def withWindowTypes(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("windowTypes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWindowTypes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("windowTypes")(js.undefined)
        ret
    }
  }
  
}

