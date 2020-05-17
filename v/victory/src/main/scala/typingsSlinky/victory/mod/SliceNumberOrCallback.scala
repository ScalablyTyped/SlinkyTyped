package typingsSlinky.victory.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - scala.Double
  - js.Function1[/ * props * / typingsSlinky.victory.mod.Omit[T, P], scala.Double]
*/
trait SliceNumberOrCallback[T, P] extends js.Object

object SliceNumberOrCallback {
  @scala.inline
  implicit def apply[T, P](value: Double): SliceNumberOrCallback[T, P] = value.asInstanceOf[SliceNumberOrCallback[T, P]]
  @scala.inline
  implicit def apply[T, P](value: js.Function1[/* props */ Omit[T, P], Double]): SliceNumberOrCallback[T, P] = value.asInstanceOf[SliceNumberOrCallback[T, P]]
}

