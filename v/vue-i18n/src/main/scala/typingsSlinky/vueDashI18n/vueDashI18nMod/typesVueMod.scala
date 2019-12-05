package typingsSlinky.vueDashI18n.vueDashI18nMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.std.Date
import typingsSlinky.vueDashI18n.Fn_Args
import typingsSlinky.vueDashI18n.Fn_ArgsKey
import typingsSlinky.vueDashI18n.Fn_Choice
import typingsSlinky.vueDashI18n.Fn_Key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vue/types/vue", JSImport.Namespace)
@js.native
object typesVueMod extends js.Object {
  @js.native
  trait Vue extends js.Object {
    @JSName("$d")
    var $d_Original: Fn_Args = js.native
    @JSName("$i18n")
    val $i18n: VueI18n with IVueI18n = js.native
    @JSName("$n")
    var $n_Original: Fn_ArgsKey = js.native
    @JSName("$t")
    var $t_Original: Fn_Key = js.native
    @JSName("$tc")
    var $tc_Original: Fn_Choice = js.native
    @JSName("$te")
    var $te_Original: js.Function2[
        /* key */ typingsSlinky.vueDashI18n.vueDashI18nMod.VueI18n.Path, 
        /* locale */ js.UndefOr[typingsSlinky.vueDashI18n.vueDashI18nMod.VueI18n.Locale], 
        Boolean
      ] = js.native
    @JSName("$d")
    def $d(value: Double): typingsSlinky.vueDashI18n.vueDashI18nMod.VueI18n.DateTimeFormatResult = js.native
    @JSName("$d")
    def $d(value: Double, args: StringDictionary[String]): typingsSlinky.vueDashI18n.vueDashI18nMod.VueI18n.DateTimeFormatResult = js.native
    @JSName("$d")
    def $d(value: Double, key: typingsSlinky.vueDashI18n.vueDashI18nMod.VueI18n.Path): typingsSlinky.vueDashI18n.vueDashI18nMod.VueI18n.DateTimeFormatResult = js.native
    @JSName("$d")
    def $d(
      value: Double,
      key: typingsSlinky.vueDashI18n.vueDashI18nMod.VueI18n.Path,
      locale: typingsSlinky.vueDashI18n.vueDashI18nMod.VueI18n.Locale
    ): typingsSlinky.vueDashI18n.vueDashI18nMod.VueI18n.DateTimeFormatResult = js.native
    @JSName("$d")
    def $d(value: Date): typingsSlinky.vueDashI18n.vueDashI18nMod.VueI18n.DateTimeFormatResult = js.native
    @JSName("$d")
    def $d(value: Date, args: StringDictionary[String]): typingsSlinky.vueDashI18n.vueDashI18nMod.VueI18n.DateTimeFormatResult = js.native
    @JSName("$d")
    def $d(value: Date, key: typingsSlinky.vueDashI18n.vueDashI18nMod.VueI18n.Path): typingsSlinky.vueDashI18n.vueDashI18nMod.VueI18n.DateTimeFormatResult = js.native
    @JSName("$d")
    def $d(
      value: Date,
      key: typingsSlinky.vueDashI18n.vueDashI18nMod.VueI18n.Path,
      locale: typingsSlinky.vueDashI18n.vueDashI18nMod.VueI18n.Locale
    ): typingsSlinky.vueDashI18n.vueDashI18nMod.VueI18n.DateTimeFormatResult = js.native
    @JSName("$n")
    def $n(value: Double): typingsSlinky.vueDashI18n.vueDashI18nMod.VueI18n.NumberFormatResult = js.native
    @JSName("$n")
    def $n(value: Double, args: StringDictionary[String]): typingsSlinky.vueDashI18n.vueDashI18nMod.VueI18n.NumberFormatResult = js.native
    @JSName("$n")
    def $n(value: Double, key: typingsSlinky.vueDashI18n.vueDashI18nMod.VueI18n.Path): typingsSlinky.vueDashI18n.vueDashI18nMod.VueI18n.NumberFormatResult = js.native
    @JSName("$n")
    def $n(
      value: Double,
      key: typingsSlinky.vueDashI18n.vueDashI18nMod.VueI18n.Path,
      locale: typingsSlinky.vueDashI18n.vueDashI18nMod.VueI18n.Locale
    ): typingsSlinky.vueDashI18n.vueDashI18nMod.VueI18n.NumberFormatResult = js.native
    @JSName("$t")
    def $t(key: typingsSlinky.vueDashI18n.vueDashI18nMod.VueI18n.Path): typingsSlinky.vueDashI18n.vueDashI18nMod.VueI18n.TranslateResult = js.native
    @JSName("$t")
    def $t(
      key: typingsSlinky.vueDashI18n.vueDashI18nMod.VueI18n.Path,
      locale: typingsSlinky.vueDashI18n.vueDashI18nMod.VueI18n.Locale
    ): typingsSlinky.vueDashI18n.vueDashI18nMod.VueI18n.TranslateResult = js.native
    @JSName("$t")
    def $t(
      key: typingsSlinky.vueDashI18n.vueDashI18nMod.VueI18n.Path,
      locale: typingsSlinky.vueDashI18n.vueDashI18nMod.VueI18n.Locale,
      values: typingsSlinky.vueDashI18n.vueDashI18nMod.VueI18n.Values
    ): typingsSlinky.vueDashI18n.vueDashI18nMod.VueI18n.TranslateResult = js.native
    @JSName("$t")
    def $t(
      key: typingsSlinky.vueDashI18n.vueDashI18nMod.VueI18n.Path,
      values: typingsSlinky.vueDashI18n.vueDashI18nMod.VueI18n.Values
    ): typingsSlinky.vueDashI18n.vueDashI18nMod.VueI18n.TranslateResult = js.native
    @JSName("$tc")
    def $tc(key: typingsSlinky.vueDashI18n.vueDashI18nMod.VueI18n.Path): String = js.native
    @JSName("$tc")
    def $tc(
      key: typingsSlinky.vueDashI18n.vueDashI18nMod.VueI18n.Path,
      choice: typingsSlinky.vueDashI18n.vueDashI18nMod.VueI18n.Choice
    ): String = js.native
    @JSName("$tc")
    def $tc(
      key: typingsSlinky.vueDashI18n.vueDashI18nMod.VueI18n.Path,
      choice: typingsSlinky.vueDashI18n.vueDashI18nMod.VueI18n.Choice,
      locale: typingsSlinky.vueDashI18n.vueDashI18nMod.VueI18n.Locale
    ): String = js.native
    @JSName("$tc")
    def $tc(
      key: typingsSlinky.vueDashI18n.vueDashI18nMod.VueI18n.Path,
      choice: typingsSlinky.vueDashI18n.vueDashI18nMod.VueI18n.Choice,
      locale: typingsSlinky.vueDashI18n.vueDashI18nMod.VueI18n.Locale,
      values: typingsSlinky.vueDashI18n.vueDashI18nMod.VueI18n.Values
    ): String = js.native
    @JSName("$tc")
    def $tc(
      key: typingsSlinky.vueDashI18n.vueDashI18nMod.VueI18n.Path,
      choice: typingsSlinky.vueDashI18n.vueDashI18nMod.VueI18n.Choice,
      values: typingsSlinky.vueDashI18n.vueDashI18nMod.VueI18n.Values
    ): String = js.native
    @JSName("$te")
    def $te(key: typingsSlinky.vueDashI18n.vueDashI18nMod.VueI18n.Path): Boolean = js.native
    @JSName("$te")
    def $te(
      key: typingsSlinky.vueDashI18n.vueDashI18nMod.VueI18n.Path,
      locale: typingsSlinky.vueDashI18n.vueDashI18nMod.VueI18n.Locale
    ): Boolean = js.native
  }
  
}

