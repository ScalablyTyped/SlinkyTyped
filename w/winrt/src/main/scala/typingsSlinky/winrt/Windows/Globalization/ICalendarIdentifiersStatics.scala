package typingsSlinky.winrt.Windows.Globalization

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICalendarIdentifiersStatics extends js.Object {
  var gregorian: String = js.native
  var hebrew: String = js.native
  var hijri: String = js.native
  var japanese: String = js.native
  var julian: String = js.native
  var korean: String = js.native
  var taiwan: String = js.native
  var thai: String = js.native
  var umAlQura: String = js.native
}

object ICalendarIdentifiersStatics {
  @scala.inline
  def apply(
    gregorian: String,
    hebrew: String,
    hijri: String,
    japanese: String,
    julian: String,
    korean: String,
    taiwan: String,
    thai: String,
    umAlQura: String
  ): ICalendarIdentifiersStatics = {
    val __obj = js.Dynamic.literal(gregorian = gregorian.asInstanceOf[js.Any], hebrew = hebrew.asInstanceOf[js.Any], hijri = hijri.asInstanceOf[js.Any], japanese = japanese.asInstanceOf[js.Any], julian = julian.asInstanceOf[js.Any], korean = korean.asInstanceOf[js.Any], taiwan = taiwan.asInstanceOf[js.Any], thai = thai.asInstanceOf[js.Any], umAlQura = umAlQura.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICalendarIdentifiersStatics]
  }
  @scala.inline
  implicit class ICalendarIdentifiersStaticsOps[Self <: ICalendarIdentifiersStatics] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGregorian(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gregorian")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHebrew(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hebrew")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHijri(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hijri")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withJapanese(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("japanese")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withJulian(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("julian")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKorean(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("korean")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTaiwan(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("taiwan")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withThai(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thai")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUmAlQura(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("umAlQura")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

