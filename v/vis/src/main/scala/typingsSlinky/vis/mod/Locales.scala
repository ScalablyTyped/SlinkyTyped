package typingsSlinky.vis.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Locales
  extends /* language */ StringDictionary[js.UndefOr[LocaleMessages]] {
  var cn: js.UndefOr[LocaleMessages] = js.native
  var de: js.UndefOr[LocaleMessages] = js.native
  var en: js.UndefOr[LocaleMessages] = js.native
  var es: js.UndefOr[LocaleMessages] = js.native
  var it: js.UndefOr[LocaleMessages] = js.native
  var nl: js.UndefOr[LocaleMessages] = js.native
  var `pt-br`: js.UndefOr[LocaleMessages] = js.native
  var ru: js.UndefOr[LocaleMessages] = js.native
}

object Locales {
  @scala.inline
  def apply(): Locales = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Locales]
  }
  @scala.inline
  implicit class LocalesOps[Self <: Locales] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCn(value: LocaleMessages): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cn")(js.undefined)
        ret
    }
    @scala.inline
    def withDe(value: LocaleMessages): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("de")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDe: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("de")(js.undefined)
        ret
    }
    @scala.inline
    def withEn(value: LocaleMessages): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("en")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("en")(js.undefined)
        ret
    }
    @scala.inline
    def withEs(value: LocaleMessages): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("es")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("es")(js.undefined)
        ret
    }
    @scala.inline
    def withIt(value: LocaleMessages): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("it")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("it")(js.undefined)
        ret
    }
    @scala.inline
    def withNl(value: LocaleMessages): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nl")(js.undefined)
        ret
    }
    @scala.inline
    def `withPt-br`(value: LocaleMessages): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pt-br")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutPt-br`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pt-br")(js.undefined)
        ret
    }
    @scala.inline
    def withRu(value: LocaleMessages): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ru")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRu: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ru")(js.undefined)
        ret
    }
  }
  
}

