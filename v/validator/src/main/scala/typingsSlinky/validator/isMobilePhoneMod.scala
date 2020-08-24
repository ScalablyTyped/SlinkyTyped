package typingsSlinky.validator

import typingsSlinky.validator.validatorStrings.any
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("validator/lib/isMobilePhone", JSImport.Namespace)
@js.native
object isMobilePhoneMod extends js.Object {
  /**
    * Check if the string is a mobile phone number.
    *
    * @param [locale] - MobilePhoneLocale(s)
    * @param [options] - Options
    */
  def default(str: String): Boolean = js.native
  def default(
    str: String,
    locale: js.UndefOr[scala.Nothing],
    options: typingsSlinky.validator.mod.validator.IsMobilePhoneOptions
  ): Boolean = js.native
  def default(str: String, locale: js.Array[typingsSlinky.validator.mod.validator.MobilePhoneLocale]): Boolean = js.native
  def default(
    str: String,
    locale: js.Array[typingsSlinky.validator.mod.validator.MobilePhoneLocale],
    options: typingsSlinky.validator.mod.validator.IsMobilePhoneOptions
  ): Boolean = js.native
  def default(str: String, locale: typingsSlinky.validator.mod.validator.MobilePhoneLocale): Boolean = js.native
  def default(
    str: String,
    locale: typingsSlinky.validator.mod.validator.MobilePhoneLocale,
    options: typingsSlinky.validator.mod.validator.IsMobilePhoneOptions
  ): Boolean = js.native
  @JSName("default")
  def default_any(str: String, locale: any): Boolean = js.native
  @JSName("default")
  def default_any(str: String, locale: any, options: typingsSlinky.validator.mod.validator.IsMobilePhoneOptions): Boolean = js.native
  type IsMobilePhoneOptions = typingsSlinky.validator.mod.validator.IsMobilePhoneOptions
  type MobilePhoneLocale = typingsSlinky.validator.mod.validator.MobilePhoneLocale
}

