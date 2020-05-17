package typingsSlinky.vueI18n.mod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.vueI18n.anon.Fn0
import typingsSlinky.vueI18n.anon.FnCall
import typingsSlinky.vueI18n.anon.FnCallKeyChoiceLocaleValues
import typingsSlinky.vueI18n.anon.FnCallValueKeyLocale
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vue/types/vue", JSImport.Namespace)
@js.native
object vueTypesVueAugmentingMod extends js.Object {
  @js.native
  trait Vue extends js.Object {
    @JSName("$d")
    var $d_Original: FnCallValueKeyLocale = js.native
    @JSName("$i18n")
    val $i18n: VueI18n with IVueI18n = js.native
    @JSName("$n")
    var $n_Original: Fn0 = js.native
    @JSName("$t")
    var $t_Original: FnCall = js.native
    @JSName("$tc")
    var $tc_Original: FnCallKeyChoiceLocaleValues = js.native
    @JSName("$te")
    var $te_Original: js.Function2[
        /* key */ typingsSlinky.vueI18n.mod.VueI18n.Path, 
        /* locale */ js.UndefOr[typingsSlinky.vueI18n.mod.VueI18n.Locale], 
        Boolean
      ] = js.native
    @JSName("$d")
    def $d(value: Double): typingsSlinky.vueI18n.mod.VueI18n.DateTimeFormatResult = js.native
    @JSName("$d")
    def $d(value: Double, args: StringDictionary[String]): typingsSlinky.vueI18n.mod.VueI18n.DateTimeFormatResult = js.native
    @JSName("$d")
    def $d(value: Double, key: typingsSlinky.vueI18n.mod.VueI18n.Path): typingsSlinky.vueI18n.mod.VueI18n.DateTimeFormatResult = js.native
    @JSName("$d")
    def $d(
      value: Double,
      key: typingsSlinky.vueI18n.mod.VueI18n.Path,
      locale: typingsSlinky.vueI18n.mod.VueI18n.Locale
    ): typingsSlinky.vueI18n.mod.VueI18n.DateTimeFormatResult = js.native
    @JSName("$d")
    def $d(value: js.Date): typingsSlinky.vueI18n.mod.VueI18n.DateTimeFormatResult = js.native
    @JSName("$d")
    def $d(value: js.Date, args: StringDictionary[String]): typingsSlinky.vueI18n.mod.VueI18n.DateTimeFormatResult = js.native
    @JSName("$d")
    def $d(value: js.Date, key: typingsSlinky.vueI18n.mod.VueI18n.Path): typingsSlinky.vueI18n.mod.VueI18n.DateTimeFormatResult = js.native
    @JSName("$d")
    def $d(
      value: js.Date,
      key: typingsSlinky.vueI18n.mod.VueI18n.Path,
      locale: typingsSlinky.vueI18n.mod.VueI18n.Locale
    ): typingsSlinky.vueI18n.mod.VueI18n.DateTimeFormatResult = js.native
    @JSName("$n")
    def $n(value: Double): typingsSlinky.vueI18n.mod.VueI18n.NumberFormatResult = js.native
    @JSName("$n")
    def $n(value: Double, args: StringDictionary[String]): typingsSlinky.vueI18n.mod.VueI18n.NumberFormatResult = js.native
    @JSName("$n")
    def $n(value: Double, key: typingsSlinky.vueI18n.mod.VueI18n.Path): typingsSlinky.vueI18n.mod.VueI18n.NumberFormatResult = js.native
    @JSName("$n")
    def $n(
      value: Double,
      key: typingsSlinky.vueI18n.mod.VueI18n.Path,
      locale: typingsSlinky.vueI18n.mod.VueI18n.Locale
    ): typingsSlinky.vueI18n.mod.VueI18n.NumberFormatResult = js.native
    @JSName("$t")
    def $t(key: typingsSlinky.vueI18n.mod.VueI18n.Path): typingsSlinky.vueI18n.mod.VueI18n.TranslateResult = js.native
    @JSName("$t")
    def $t(key: typingsSlinky.vueI18n.mod.VueI18n.Path, locale: typingsSlinky.vueI18n.mod.VueI18n.Locale): typingsSlinky.vueI18n.mod.VueI18n.TranslateResult = js.native
    @JSName("$t")
    def $t(
      key: typingsSlinky.vueI18n.mod.VueI18n.Path,
      locale: typingsSlinky.vueI18n.mod.VueI18n.Locale,
      values: typingsSlinky.vueI18n.mod.VueI18n.Values
    ): typingsSlinky.vueI18n.mod.VueI18n.TranslateResult = js.native
    @JSName("$t")
    def $t(key: typingsSlinky.vueI18n.mod.VueI18n.Path, values: typingsSlinky.vueI18n.mod.VueI18n.Values): typingsSlinky.vueI18n.mod.VueI18n.TranslateResult = js.native
    @JSName("$tc")
    def $tc(key: typingsSlinky.vueI18n.mod.VueI18n.Path): String = js.native
    @JSName("$tc")
    def $tc(key: typingsSlinky.vueI18n.mod.VueI18n.Path, choice: typingsSlinky.vueI18n.mod.VueI18n.Choice): String = js.native
    @JSName("$tc")
    def $tc(
      key: typingsSlinky.vueI18n.mod.VueI18n.Path,
      choice: typingsSlinky.vueI18n.mod.VueI18n.Choice,
      locale: typingsSlinky.vueI18n.mod.VueI18n.Locale
    ): String = js.native
    @JSName("$tc")
    def $tc(
      key: typingsSlinky.vueI18n.mod.VueI18n.Path,
      choice: typingsSlinky.vueI18n.mod.VueI18n.Choice,
      locale: typingsSlinky.vueI18n.mod.VueI18n.Locale,
      values: typingsSlinky.vueI18n.mod.VueI18n.Values
    ): String = js.native
    @JSName("$tc")
    def $tc(
      key: typingsSlinky.vueI18n.mod.VueI18n.Path,
      choice: typingsSlinky.vueI18n.mod.VueI18n.Choice,
      values: typingsSlinky.vueI18n.mod.VueI18n.Values
    ): String = js.native
    @JSName("$te")
    def $te(key: typingsSlinky.vueI18n.mod.VueI18n.Path): Boolean = js.native
    @JSName("$te")
    def $te(key: typingsSlinky.vueI18n.mod.VueI18n.Path, locale: typingsSlinky.vueI18n.mod.VueI18n.Locale): Boolean = js.native
  }
  
}

