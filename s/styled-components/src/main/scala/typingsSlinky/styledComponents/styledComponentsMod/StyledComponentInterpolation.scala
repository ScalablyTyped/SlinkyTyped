package typingsSlinky.styledComponents.styledComponentsMod

import typingsSlinky.styledComponents.anon.PickStyledComponentBasean
import typingsSlinky.styledComponents.anon.PickStyledComponentBaseanDefaultProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// remove the call signature from StyledComponent so Interpolation can still infer InterpolationFunction
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.styledComponents.anon.PickStyledComponentBasean
  - typingsSlinky.styledComponents.anon.PickStyledComponentBaseanDefaultProps
*/
trait StyledComponentInterpolation extends InterpolationValue

object StyledComponentInterpolation {
  @scala.inline
  implicit def apply(value: PickStyledComponentBasean): StyledComponentInterpolation = value.asInstanceOf[StyledComponentInterpolation]
  @scala.inline
  implicit def apply(value: PickStyledComponentBaseanDefaultProps): StyledComponentInterpolation = value.asInstanceOf[StyledComponentInterpolation]
}

