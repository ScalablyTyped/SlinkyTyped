package typingsSlinky.vueI18n.mod.VueI18n

import typingsSlinky.vue.vueMod.Vue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line:interface-name
@js.native
trait I18nOptions extends js.Object {
  var dateTimeFormats: js.UndefOr[DateTimeFormats] = js.native
  var fallbackLocale: js.UndefOr[Locale] = js.native
  var fallbackRoot: js.UndefOr[Boolean] = js.native
  var formatFallbackMessages: js.UndefOr[Boolean] = js.native
  var formatter: js.UndefOr[Formatter] = js.native
  var locale: js.UndefOr[Locale] = js.native
  var messages: js.UndefOr[LocaleMessages] = js.native
  var missing: js.UndefOr[MissingHandler] = js.native
  var modifiers: js.UndefOr[Modifiers] = js.native
  var numberFormats: js.UndefOr[NumberFormats] = js.native
  var pluralizationRules: js.UndefOr[PluralizationRulesMap] = js.native
  var preserveDirectiveContent: js.UndefOr[Boolean] = js.native
  var sharedMessages: js.UndefOr[LocaleMessages] = js.native
  var silentFallbackWarn: js.UndefOr[Boolean | js.RegExp] = js.native
  var silentTranslationWarn: js.UndefOr[Boolean | js.RegExp] = js.native
  var sync: js.UndefOr[Boolean] = js.native
  var warnHtmlInMessage: js.UndefOr[WarnHtmlInMessageLevel] = js.native
}

object I18nOptions {
  @scala.inline
  def apply(): I18nOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[I18nOptions]
  }
  @scala.inline
  implicit class I18nOptionsOps[Self <: I18nOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDateTimeFormats(value: DateTimeFormats): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dateTimeFormats")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDateTimeFormats: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dateTimeFormats")(js.undefined)
        ret
    }
    @scala.inline
    def withFallbackLocale(value: Locale): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fallbackLocale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFallbackLocale: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fallbackLocale")(js.undefined)
        ret
    }
    @scala.inline
    def withFallbackRoot(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fallbackRoot")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFallbackRoot: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fallbackRoot")(js.undefined)
        ret
    }
    @scala.inline
    def withFormatFallbackMessages(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formatFallbackMessages")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFormatFallbackMessages: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formatFallbackMessages")(js.undefined)
        ret
    }
    @scala.inline
    def withFormatter(value: Formatter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formatter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFormatter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formatter")(js.undefined)
        ret
    }
    @scala.inline
    def withLocale(value: Locale): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocale: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locale")(js.undefined)
        ret
    }
    @scala.inline
    def withMessages(value: LocaleMessages): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("messages")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMessages: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("messages")(js.undefined)
        ret
    }
    @scala.inline
    def withMissing(
      value: (/* locale */ Locale, /* key */ Path, /* vm */ Vue | Null, /* values */ js.Any) => String | Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("missing")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withoutMissing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("missing")(js.undefined)
        ret
    }
    @scala.inline
    def withModifiers(value: Modifiers): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modifiers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutModifiers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modifiers")(js.undefined)
        ret
    }
    @scala.inline
    def withNumberFormats(value: NumberFormats): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numberFormats")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNumberFormats: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numberFormats")(js.undefined)
        ret
    }
    @scala.inline
    def withPluralizationRules(value: PluralizationRulesMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pluralizationRules")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPluralizationRules: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pluralizationRules")(js.undefined)
        ret
    }
    @scala.inline
    def withPreserveDirectiveContent(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preserveDirectiveContent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreserveDirectiveContent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preserveDirectiveContent")(js.undefined)
        ret
    }
    @scala.inline
    def withSharedMessages(value: LocaleMessages): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sharedMessages")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSharedMessages: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sharedMessages")(js.undefined)
        ret
    }
    @scala.inline
    def withSilentFallbackWarnRegExp(value: js.RegExp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("silentFallbackWarn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSilentFallbackWarn(value: Boolean | js.RegExp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("silentFallbackWarn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSilentFallbackWarn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("silentFallbackWarn")(js.undefined)
        ret
    }
    @scala.inline
    def withSilentTranslationWarnRegExp(value: js.RegExp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("silentTranslationWarn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSilentTranslationWarn(value: Boolean | js.RegExp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("silentTranslationWarn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSilentTranslationWarn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("silentTranslationWarn")(js.undefined)
        ret
    }
    @scala.inline
    def withSync(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sync")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSync: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sync")(js.undefined)
        ret
    }
    @scala.inline
    def withWarnHtmlInMessage(value: WarnHtmlInMessageLevel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("warnHtmlInMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWarnHtmlInMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("warnHtmlInMessage")(js.undefined)
        ret
    }
  }
  
}

