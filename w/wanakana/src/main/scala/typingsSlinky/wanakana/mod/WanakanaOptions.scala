package typingsSlinky.wanakana.mod

import typingsSlinky.std.Record
import typingsSlinky.wanakana.wanakanaStrings.hepburn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WanakanaOptions extends js.Object {
  var IMEMode: js.UndefOr[IMEModes] = js.native
  var customKanaMapping: js.UndefOr[Record[String, String]] = js.native
  var customRomajiMapping: js.UndefOr[Record[String, String]] = js.native
  var passRomaji: js.UndefOr[Boolean] = js.native
  var romanization: js.UndefOr[hepburn] = js.native
  var upcaseKatakana: js.UndefOr[Boolean] = js.native
  var useObsoleteKana: js.UndefOr[Boolean] = js.native
}

object WanakanaOptions {
  @scala.inline
  def apply(): WanakanaOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WanakanaOptions]
  }
  @scala.inline
  implicit class WanakanaOptionsOps[Self <: WanakanaOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIMEMode(value: IMEModes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IMEMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIMEMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IMEMode")(js.undefined)
        ret
    }
    @scala.inline
    def withCustomKanaMapping(value: Record[String, String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customKanaMapping")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomKanaMapping: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customKanaMapping")(js.undefined)
        ret
    }
    @scala.inline
    def withCustomRomajiMapping(value: Record[String, String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customRomajiMapping")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomRomajiMapping: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customRomajiMapping")(js.undefined)
        ret
    }
    @scala.inline
    def withPassRomaji(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("passRomaji")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPassRomaji: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("passRomaji")(js.undefined)
        ret
    }
    @scala.inline
    def withRomanization(value: hepburn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("romanization")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRomanization: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("romanization")(js.undefined)
        ret
    }
    @scala.inline
    def withUpcaseKatakana(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("upcaseKatakana")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpcaseKatakana: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("upcaseKatakana")(js.undefined)
        ret
    }
    @scala.inline
    def withUseObsoleteKana(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useObsoleteKana")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseObsoleteKana: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useObsoleteKana")(js.undefined)
        ret
    }
  }
  
}

