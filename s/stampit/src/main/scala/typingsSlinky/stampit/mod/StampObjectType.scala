package typingsSlinky.stampit.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @internal The type of the object produced by the `Stamp`.
  * @template Original The type (either a `Stamp` or a `ExtendedDescriptor`) to get the object type from.
  */
/* Rewritten from type alias, can be one of: 
  - Original
  - js.Any
*/
trait StampObjectType[Original] extends js.Object

object StampObjectType {
  @scala.inline
  implicit def apply[Original](value: js.Any): StampObjectType[Original] = value.asInstanceOf[StampObjectType[Original]]
  @scala.inline
  implicit def apply[Original](value: Original): StampObjectType[Original] = value.asInstanceOf[StampObjectType[Original]]
}

