package typingsSlinky.styledComponents.styledComponentsMod

import typingsSlinky.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - js.Function1[
/ * props * / typingsSlinky.styledComponents.styledComponentsMod.ThemedStyledProps[P, T], 
A]
  - A
*/
trait Attrs[P, A /* <: Partial[P] */, T] extends js.Object

object Attrs {
  @scala.inline
  implicit def apply[P, A, T](value: A): Attrs[P, A, T] = value.asInstanceOf[Attrs[P, A, T]]
  @scala.inline
  implicit def apply[P, A, T](value: js.Function1[/* props */ ThemedStyledProps[P, T], A]): Attrs[P, A, T] = value.asInstanceOf[Attrs[P, A, T]]
}

