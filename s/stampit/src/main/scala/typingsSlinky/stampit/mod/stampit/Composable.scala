package typingsSlinky.stampit.mod.stampit

import typingsSlinky.stampit.mod.StampSignature
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** A composable object (either a `Stamp` or a `ExtendedDescriptor`.) */
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.stampit.mod.StampSignature
  - typingsSlinky.stampit.mod.stampit.ExtendedDescriptor[js.Any, js.Any]
*/
trait Composable extends js.Object

object Composable {
  @scala.inline
  implicit def apply(value: ExtendedDescriptor[js.Any, js.Any]): Composable = value.asInstanceOf[Composable]
  @scala.inline
  implicit def apply(value: StampSignature): Composable = value.asInstanceOf[Composable]
}

