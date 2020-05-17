package typingsSlinky.stampit.mod.stampit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @internal Checks that a type is a ExtendedDescriptor (except `any` and `unknown`).
  * @template Type A type to check if a ExtendedDescriptor.
  */
// TODO: Improve test by checking the type of common keys
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.stampit.stampitBooleans.`false`
  - typingsSlinky.stampit.stampitBooleans.`true`
*/
trait IsADescriptor[Type] extends js.Object

object IsADescriptor {
  @scala.inline
  def `false`[Type]: typingsSlinky.stampit.stampitBooleans.`false` = false.asInstanceOf[typingsSlinky.stampit.stampitBooleans.`false`]
  @scala.inline
  def `true`[Type]: typingsSlinky.stampit.stampitBooleans.`true` = true.asInstanceOf[typingsSlinky.stampit.stampitBooleans.`true`]
}

