package typingsSlinky.tokgen.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - scala.Double
  - java.lang.String
  - typingsSlinky.tokgen.mod.OptionsObject
*/
trait Options extends js.Object

object Options {
  @scala.inline
  implicit def apply(value: Double): Options = value.asInstanceOf[Options]
  @scala.inline
  implicit def apply(value: OptionsObject): Options = value.asInstanceOf[Options]
  @scala.inline
  implicit def apply(value: String): Options = value.asInstanceOf[Options]
}

