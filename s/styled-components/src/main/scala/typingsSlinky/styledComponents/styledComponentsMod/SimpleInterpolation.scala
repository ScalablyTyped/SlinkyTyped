package typingsSlinky.styledComponents.styledComponentsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.styledComponents.styledComponentsMod.InterpolationValue
  - typingsSlinky.styledComponents.styledComponentsMod.FlattenSimpleInterpolation
*/
trait SimpleInterpolation extends js.Object

object SimpleInterpolation {
  @scala.inline
  implicit def apply(value: FlattenSimpleInterpolation): SimpleInterpolation = value.asInstanceOf[SimpleInterpolation]
  @scala.inline
  implicit def apply(value: InterpolationValue): SimpleInterpolation = value.asInstanceOf[SimpleInterpolation]
}

