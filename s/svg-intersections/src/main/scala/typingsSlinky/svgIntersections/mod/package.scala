package typingsSlinky.svgIntersections

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type PolylineProps = typingsSlinky.svgIntersections.mod.PolygonProps
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.svgIntersections.mod.PathProps
    - typingsSlinky.svgIntersections.mod.PolylineProps
    - typingsSlinky.svgIntersections.mod.PolygonProps
    - typingsSlinky.svgIntersections.mod.EllipseProps
    - typingsSlinky.svgIntersections.mod.CircleProps
    - typingsSlinky.svgIntersections.mod.RectProps
    - typingsSlinky.svgIntersections.mod.LineProps
  */
  type SvgProperties[T /* <: typingsSlinky.svgIntersections.mod.SvgElements */] = typingsSlinky.svgIntersections.mod._SvgProperties[T] | typingsSlinky.svgIntersections.mod.PolylineProps
}
