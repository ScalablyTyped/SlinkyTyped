package typingsSlinky.styledComponents.styledComponentsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - P
  - typingsSlinky.styledComponents.styledComponentsMod.Defaultize[P, js.Any]
*/
trait ReactDefaultizedProps[C, P] extends js.Object

object ReactDefaultizedProps {
  @scala.inline
  implicit def apply[C, P](value: Defaultize[P, js.Any]): ReactDefaultizedProps[C, P] = value.asInstanceOf[ReactDefaultizedProps[C, P]]
  @scala.inline
  implicit def apply[C, P](value: P): ReactDefaultizedProps[C, P] = value.asInstanceOf[ReactDefaultizedProps[C, P]]
}

