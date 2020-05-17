package typingsSlinky.styledComponents.styledComponentsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.styledComponents.styledComponentsMod.InterpolationValue
  - typingsSlinky.styledComponents.styledComponentsMod.FlattenInterpolation[P]
  - typingsSlinky.styledComponents.styledComponentsMod.InterpolationFunction[P]
*/
trait Interpolation[P] extends js.Object

object Interpolation {
  @scala.inline
  implicit def apply[P](value: FlattenInterpolation[P]): Interpolation[P] = value.asInstanceOf[Interpolation[P]]
  @scala.inline
  implicit def apply[P](value: InterpolationFunction[P]): Interpolation[P] = value.asInstanceOf[Interpolation[P]]
  @scala.inline
  implicit def apply[P](value: InterpolationValue): Interpolation[P] = value.asInstanceOf[Interpolation[P]]
}

