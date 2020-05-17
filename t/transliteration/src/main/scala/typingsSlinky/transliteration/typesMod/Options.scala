package typingsSlinky.transliteration.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.transliteration.typesMod.OptionsTransliterate
  - typingsSlinky.transliteration.typesMod.OptionsSlugify
*/
trait Options extends js.Object

object Options {
  @scala.inline
  implicit def apply(value: OptionsSlugify): Options = value.asInstanceOf[Options]
  @scala.inline
  implicit def apply(value: OptionsTransliterate): Options = value.asInstanceOf[Options]
}

