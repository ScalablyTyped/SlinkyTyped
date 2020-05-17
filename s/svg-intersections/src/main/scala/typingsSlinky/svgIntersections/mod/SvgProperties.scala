package typingsSlinky.svgIntersections.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.svgIntersections.mod.PathProps
  - typingsSlinky.svgIntersections.mod.PolylineProps
  - typingsSlinky.svgIntersections.mod.PolygonProps
  - typingsSlinky.svgIntersections.mod.EllipseProps
  - typingsSlinky.svgIntersections.mod.CircleProps
  - typingsSlinky.svgIntersections.mod.RectProps
  - typingsSlinky.svgIntersections.mod.LineProps
*/
trait SvgProperties[T /* <: SvgElements */] extends js.Object

object SvgProperties {
  @scala.inline
  implicit def apply[T](value: PolygonProps | PolylineProps): SvgProperties[T] = value.asInstanceOf[SvgProperties[T]]
  @scala.inline
  implicit def apply[T](value: CircleProps): SvgProperties[T] = value.asInstanceOf[SvgProperties[T]]
  @scala.inline
  implicit def apply[T](value: EllipseProps): SvgProperties[T] = value.asInstanceOf[SvgProperties[T]]
  @scala.inline
  implicit def apply[T](value: LineProps): SvgProperties[T] = value.asInstanceOf[SvgProperties[T]]
  @scala.inline
  implicit def apply[T](value: PathProps): SvgProperties[T] = value.asInstanceOf[SvgProperties[T]]
  @scala.inline
  implicit def apply[T](value: RectProps): SvgProperties[T] = value.asInstanceOf[SvgProperties[T]]
}

