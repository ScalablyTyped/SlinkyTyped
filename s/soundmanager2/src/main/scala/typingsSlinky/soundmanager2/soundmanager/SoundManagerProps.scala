package typingsSlinky.soundmanager2.soundmanager

import typingsSlinky.soundmanager2.soundmanager2Booleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SoundManagerProps extends js.Object {
  var allowScriptAccess: js.UndefOr[ScriptAccess] = js.native
  var altURL: js.UndefOr[String] = js.native
  var bgColor: js.UndefOr[String] = js.native
  var consoleOnly: js.UndefOr[Boolean] = js.native
  var debugFlash: js.UndefOr[Boolean] = js.native
  var debugMode: js.UndefOr[Boolean] = js.native
  var defaultOptions: js.UndefOr[DefaultOptions] = js.native
  /**
    * Some properties are dynamic, determined at initialisation or later
    * during runtime, and should be treated as read-only.
    */
  val features: js.UndefOr[js.Object] = js.native
  var flash9Options: js.UndefOr[Flash9Options] = js.native
  // html5PollingInterval: number;
  // html5Test: string;
  var flashLoadTimeout: js.UndefOr[Double] = js.native
  var flashVersion: js.UndefOr[Double] = js.native
  // flashPollingInterval: number;
  var forceUseGlobalHTML5Audio: js.UndefOr[Boolean] = js.native
  val html5Only: js.UndefOr[Boolean] = js.native
  var idPrefix: js.UndefOr[String] = js.native
  var ignoreMobileRestrications: js.UndefOr[Boolean] = js.native
  var movieStarOptions: js.UndefOr[MovieStarOptions] = js.native
  var noSWFCache: js.UndefOr[Boolean] = js.native
  var onready: js.UndefOr[js.Function0[Unit]] = js.native
  var ontimeout: js.UndefOr[js.Function0[Unit]] = js.native
  var preferFlash: js.UndefOr[Boolean] = js.native
  /**
    * The directory where SM2 can find the flash movies (soundmanager2.swf,
    * soundmanager2_flash9.swf and debug versions etc.) Note that SM2 will
    * append the correct SWF file name, depending on flashVersion and
    * debugMode settings.
    */
  var url: js.UndefOr[String] = js.native
  var useAltURL: js.UndefOr[Boolean] = js.native
  var useConsole: js.UndefOr[Boolean] = js.native
  var useFlashBlock: js.UndefOr[Boolean] = js.native
  var useHTML5Audio: js.UndefOr[Boolean] = js.native
  var useHighPerformance: js.UndefOr[Boolean] = js.native
  var waitForWindowLoad: js.UndefOr[`false`] = js.native
  var wmode: js.UndefOr[String | Null] = js.native
}

object SoundManagerProps {
  @scala.inline
  def apply(): SoundManagerProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SoundManagerProps]
  }
  @scala.inline
  implicit class SoundManagerPropsOps[Self <: SoundManagerProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowScriptAccess(value: ScriptAccess): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowScriptAccess")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowScriptAccess: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowScriptAccess")(js.undefined)
        ret
    }
    @scala.inline
    def withAltURL(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("altURL")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAltURL: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("altURL")(js.undefined)
        ret
    }
    @scala.inline
    def withBgColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bgColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBgColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bgColor")(js.undefined)
        ret
    }
    @scala.inline
    def withConsoleOnly(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("consoleOnly")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConsoleOnly: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("consoleOnly")(js.undefined)
        ret
    }
    @scala.inline
    def withDebugFlash(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debugFlash")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDebugFlash: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debugFlash")(js.undefined)
        ret
    }
    @scala.inline
    def withDebugMode(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debugMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDebugMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debugMode")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultOptions(value: DefaultOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withFeatures(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("features")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFeatures: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("features")(js.undefined)
        ret
    }
    @scala.inline
    def withFlash9Options(value: Flash9Options): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flash9Options")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFlash9Options: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flash9Options")(js.undefined)
        ret
    }
    @scala.inline
    def withFlashLoadTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flashLoadTimeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFlashLoadTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flashLoadTimeout")(js.undefined)
        ret
    }
    @scala.inline
    def withFlashVersion(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flashVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFlashVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flashVersion")(js.undefined)
        ret
    }
    @scala.inline
    def withForceUseGlobalHTML5Audio(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forceUseGlobalHTML5Audio")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutForceUseGlobalHTML5Audio: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forceUseGlobalHTML5Audio")(js.undefined)
        ret
    }
    @scala.inline
    def withHtml5Only(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("html5Only")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHtml5Only: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("html5Only")(js.undefined)
        ret
    }
    @scala.inline
    def withIdPrefix(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("idPrefix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIdPrefix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("idPrefix")(js.undefined)
        ret
    }
    @scala.inline
    def withIgnoreMobileRestrications(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreMobileRestrications")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIgnoreMobileRestrications: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreMobileRestrications")(js.undefined)
        ret
    }
    @scala.inline
    def withMovieStarOptions(value: MovieStarOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("movieStarOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMovieStarOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("movieStarOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withNoSWFCache(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noSWFCache")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNoSWFCache: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noSWFCache")(js.undefined)
        ret
    }
    @scala.inline
    def withOnready(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onready")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnready: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onready")(js.undefined)
        ret
    }
    @scala.inline
    def withOntimeout(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ontimeout")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOntimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ontimeout")(js.undefined)
        ret
    }
    @scala.inline
    def withPreferFlash(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preferFlash")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreferFlash: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preferFlash")(js.undefined)
        ret
    }
    @scala.inline
    def withUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(js.undefined)
        ret
    }
    @scala.inline
    def withUseAltURL(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useAltURL")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseAltURL: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useAltURL")(js.undefined)
        ret
    }
    @scala.inline
    def withUseConsole(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useConsole")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseConsole: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useConsole")(js.undefined)
        ret
    }
    @scala.inline
    def withUseFlashBlock(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useFlashBlock")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseFlashBlock: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useFlashBlock")(js.undefined)
        ret
    }
    @scala.inline
    def withUseHTML5Audio(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useHTML5Audio")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseHTML5Audio: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useHTML5Audio")(js.undefined)
        ret
    }
    @scala.inline
    def withUseHighPerformance(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useHighPerformance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseHighPerformance: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useHighPerformance")(js.undefined)
        ret
    }
    @scala.inline
    def withWaitForWindowLoad(value: `false`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("waitForWindowLoad")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWaitForWindowLoad: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("waitForWindowLoad")(js.undefined)
        ret
    }
    @scala.inline
    def withWmode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wmode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWmode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wmode")(js.undefined)
        ret
    }
    @scala.inline
    def withWmodeNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wmode")(null)
        ret
    }
  }
  
}

