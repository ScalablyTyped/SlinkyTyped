package typingsSlinky.styledComponents.styledComponentsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - scala.Double
  - typingsSlinky.styledComponents.styledComponentsMod.FalseyValue
  - typingsSlinky.styledComponents.styledComponentsMod.Keyframes_
  - typingsSlinky.styledComponents.styledComponentsMod.StyledComponentInterpolation
  - typingsSlinky.styledComponents.styledComponentsMod.CSSObject
*/
trait InterpolationValue
  extends Interpolation[js.Any]
     with SimpleInterpolation

object InterpolationValue {
  @scala.inline
  implicit def apply(value: CSSObject): InterpolationValue = value.asInstanceOf[InterpolationValue]
  @scala.inline
  implicit def apply(value: Double): InterpolationValue = value.asInstanceOf[InterpolationValue]
  @scala.inline
  implicit def apply(value: FalseyValue): InterpolationValue = value.asInstanceOf[InterpolationValue]
  @scala.inline
  implicit def apply(value: Keyframes_): InterpolationValue = value.asInstanceOf[InterpolationValue]
  @scala.inline
  implicit def apply(value: String): InterpolationValue = value.asInstanceOf[InterpolationValue]
  @scala.inline
  implicit def apply(value: StyledComponentInterpolation): InterpolationValue = value.asInstanceOf[InterpolationValue]
}

