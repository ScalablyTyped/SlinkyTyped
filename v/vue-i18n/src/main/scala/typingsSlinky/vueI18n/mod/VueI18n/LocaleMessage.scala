package typingsSlinky.vueI18n.mod.VueI18n

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - typingsSlinky.vueI18n.mod.VueI18n.LocaleMessageObject
  - typingsSlinky.vueI18n.mod.VueI18n.LocaleMessageArray
*/
trait LocaleMessage extends js.Object

object LocaleMessage {
  @scala.inline
  implicit def apply(value: LocaleMessageArray): LocaleMessage = value.asInstanceOf[LocaleMessage]
  @scala.inline
  implicit def apply(value: LocaleMessageObject): LocaleMessage = value.asInstanceOf[LocaleMessage]
  @scala.inline
  implicit def apply(value: String): LocaleMessage = value.asInstanceOf[LocaleMessage]
}

