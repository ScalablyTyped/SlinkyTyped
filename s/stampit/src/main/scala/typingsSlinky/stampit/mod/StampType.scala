package typingsSlinky.stampit.mod

import typingsSlinky.stampit.mod.stampit.Stamp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @internal Extracts the `Stamp` type.
  * @template Original The type to extract the `Stamp` type from.
  */
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.stampit.mod.stampit.Stamp[js.Any | Original]
  - Original
  - js.Any
*/
trait StampType[Original] extends js.Object

object StampType {
  @scala.inline
  implicit def apply[Original](value: js.Any): StampType[Original] = value.asInstanceOf[StampType[Original]]
  @scala.inline
  implicit def apply[Original](value: Original): StampType[Original] = value.asInstanceOf[StampType[Original]]
  @scala.inline
  implicit def apply[Original](value: Stamp[js.Any | Original]): StampType[Original] = value.asInstanceOf[StampType[Original]]
}

