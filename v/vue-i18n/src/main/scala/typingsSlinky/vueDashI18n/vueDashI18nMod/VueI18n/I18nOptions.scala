package typingsSlinky.vueDashI18n.vueDashI18nMod.VueI18n

import typingsSlinky.vue.typesVueMod.Vue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line:interface-name
trait I18nOptions extends js.Object {
  var dateTimeFormats: js.UndefOr[typingsSlinky.vueDashI18n.vueDashI18nMod.VueI18n.DateTimeFormats] = js.undefined
  var fallbackLocale: js.UndefOr[typingsSlinky.vueDashI18n.vueDashI18nMod.VueI18n.Locale] = js.undefined
  var fallbackRoot: js.UndefOr[Boolean] = js.undefined
  var formatFallbackMessages: js.UndefOr[Boolean] = js.undefined
  var formatter: js.UndefOr[typingsSlinky.vueDashI18n.vueDashI18nMod.VueI18n.Formatter] = js.undefined
  var locale: js.UndefOr[typingsSlinky.vueDashI18n.vueDashI18nMod.VueI18n.Locale] = js.undefined
  var messages: js.UndefOr[typingsSlinky.vueDashI18n.vueDashI18nMod.VueI18n.LocaleMessages] = js.undefined
  var missing: js.UndefOr[typingsSlinky.vueDashI18n.vueDashI18nMod.VueI18n.MissingHandler] = js.undefined
  var modifiers: js.UndefOr[Modifiers] = js.undefined
  var numberFormats: js.UndefOr[typingsSlinky.vueDashI18n.vueDashI18nMod.VueI18n.NumberFormats] = js.undefined
  var pluralizationRules: js.UndefOr[PluralizationRulesMap] = js.undefined
  var preserveDirectiveContent: js.UndefOr[Boolean] = js.undefined
  var sharedMessages: js.UndefOr[typingsSlinky.vueDashI18n.vueDashI18nMod.VueI18n.LocaleMessages] = js.undefined
  var silentFallbackWarn: js.UndefOr[Boolean | js.RegExp] = js.undefined
  var silentTranslationWarn: js.UndefOr[Boolean | js.RegExp] = js.undefined
  var sync: js.UndefOr[Boolean] = js.undefined
  var warnHtmlInMessage: js.UndefOr[typingsSlinky.vueDashI18n.vueDashI18nMod.VueI18n.WarnHtmlInMessageLevel] = js.undefined
}

object I18nOptions {
  @scala.inline
  def apply(
    dateTimeFormats: typingsSlinky.vueDashI18n.vueDashI18nMod.VueI18n.DateTimeFormats = null,
    fallbackLocale: typingsSlinky.vueDashI18n.vueDashI18nMod.VueI18n.Locale = null,
    fallbackRoot: js.UndefOr[Boolean] = js.undefined,
    formatFallbackMessages: js.UndefOr[Boolean] = js.undefined,
    formatter: typingsSlinky.vueDashI18n.vueDashI18nMod.VueI18n.Formatter = null,
    locale: typingsSlinky.vueDashI18n.vueDashI18nMod.VueI18n.Locale = null,
    messages: typingsSlinky.vueDashI18n.vueDashI18nMod.VueI18n.LocaleMessages = null,
    missing: (/* locale */ typingsSlinky.vueDashI18n.vueDashI18nMod.VueI18n.Locale, /* key */ typingsSlinky.vueDashI18n.vueDashI18nMod.VueI18n.Path, /* vm */ Vue | Null, /* values */ js.Any) => String | Unit = null,
    modifiers: Modifiers = null,
    numberFormats: typingsSlinky.vueDashI18n.vueDashI18nMod.VueI18n.NumberFormats = null,
    pluralizationRules: PluralizationRulesMap = null,
    preserveDirectiveContent: js.UndefOr[Boolean] = js.undefined,
    sharedMessages: typingsSlinky.vueDashI18n.vueDashI18nMod.VueI18n.LocaleMessages = null,
    silentFallbackWarn: Boolean | js.RegExp = null,
    silentTranslationWarn: Boolean | js.RegExp = null,
    sync: js.UndefOr[Boolean] = js.undefined,
    warnHtmlInMessage: typingsSlinky.vueDashI18n.vueDashI18nMod.VueI18n.WarnHtmlInMessageLevel = null
  ): I18nOptions = {
    val __obj = js.Dynamic.literal()
    if (dateTimeFormats != null) __obj.updateDynamic("dateTimeFormats")(dateTimeFormats.asInstanceOf[js.Any])
    if (fallbackLocale != null) __obj.updateDynamic("fallbackLocale")(fallbackLocale.asInstanceOf[js.Any])
    if (!js.isUndefined(fallbackRoot)) __obj.updateDynamic("fallbackRoot")(fallbackRoot.asInstanceOf[js.Any])
    if (!js.isUndefined(formatFallbackMessages)) __obj.updateDynamic("formatFallbackMessages")(formatFallbackMessages.asInstanceOf[js.Any])
    if (formatter != null) __obj.updateDynamic("formatter")(formatter.asInstanceOf[js.Any])
    if (locale != null) __obj.updateDynamic("locale")(locale.asInstanceOf[js.Any])
    if (messages != null) __obj.updateDynamic("messages")(messages.asInstanceOf[js.Any])
    if (missing != null) __obj.updateDynamic("missing")(js.Any.fromFunction4(missing))
    if (modifiers != null) __obj.updateDynamic("modifiers")(modifiers.asInstanceOf[js.Any])
    if (numberFormats != null) __obj.updateDynamic("numberFormats")(numberFormats.asInstanceOf[js.Any])
    if (pluralizationRules != null) __obj.updateDynamic("pluralizationRules")(pluralizationRules.asInstanceOf[js.Any])
    if (!js.isUndefined(preserveDirectiveContent)) __obj.updateDynamic("preserveDirectiveContent")(preserveDirectiveContent.asInstanceOf[js.Any])
    if (sharedMessages != null) __obj.updateDynamic("sharedMessages")(sharedMessages.asInstanceOf[js.Any])
    if (silentFallbackWarn != null) __obj.updateDynamic("silentFallbackWarn")(silentFallbackWarn.asInstanceOf[js.Any])
    if (silentTranslationWarn != null) __obj.updateDynamic("silentTranslationWarn")(silentTranslationWarn.asInstanceOf[js.Any])
    if (!js.isUndefined(sync)) __obj.updateDynamic("sync")(sync.asInstanceOf[js.Any])
    if (warnHtmlInMessage != null) __obj.updateDynamic("warnHtmlInMessage")(warnHtmlInMessage.asInstanceOf[js.Any])
    __obj.asInstanceOf[I18nOptions]
  }
}

