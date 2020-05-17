package typingsSlinky.tcomb.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.tcomb.mod.Constructor[js.Any]
  - typingsSlinky.tcomb.mod.Function1
*/
trait Clause extends js.Object

object Clause {
  @scala.inline
  implicit def apply(value: Constructor[js.Any]): Clause = value.asInstanceOf[Clause]
  @scala.inline
  implicit def apply(value: Function1): Clause = value.asInstanceOf[Clause]
}

