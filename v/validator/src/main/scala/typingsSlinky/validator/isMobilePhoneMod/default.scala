package typingsSlinky.validator.isMobilePhoneMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("validator/lib/isMobilePhone", JSImport.Default)
@js.native
object default extends js.Object {
  /**
    * Check if the string is a mobile phone number.
    *
    * @param [locale] - MobilePhoneLocale(s)
    * @param [options] - Options
    */
  def apply(str: String): Boolean = js.native
  def apply(str: String, locale: js.Array[typingsSlinky.validator.mod.validator.MobilePhoneLocale]): Boolean = js.native
  def apply(
    str: String,
    locale: js.Array[typingsSlinky.validator.mod.validator.MobilePhoneLocale],
    options: typingsSlinky.validator.mod.validator.IsMobilePhoneOptions
  ): Boolean = js.native
  def apply(str: String, locale: typingsSlinky.validator.mod.validator.MobilePhoneLocale): Boolean = js.native
  def apply(
    str: String,
    locale: typingsSlinky.validator.mod.validator.MobilePhoneLocale,
    options: typingsSlinky.validator.mod.validator.IsMobilePhoneOptions
  ): Boolean = js.native
}

