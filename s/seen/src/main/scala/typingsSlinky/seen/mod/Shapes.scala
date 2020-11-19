package typingsSlinky.seen.mod

import typingsSlinky.seen.anon.PartialSurface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("seen", "Shapes")
@js.native
object Shapes extends js.Object {
  
  def arrow(): Shape = js.native
  def arrow(
    thickness: js.UndefOr[scala.Nothing],
    tailLength: js.UndefOr[scala.Nothing],
    tailWidth: js.UndefOr[scala.Nothing],
    headLength: js.UndefOr[scala.Nothing],
    headPointiness: Double
  ): Shape = js.native
  def arrow(
    thickness: js.UndefOr[scala.Nothing],
    tailLength: js.UndefOr[scala.Nothing],
    tailWidth: js.UndefOr[scala.Nothing],
    headLength: Double
  ): Shape = js.native
  def arrow(
    thickness: js.UndefOr[scala.Nothing],
    tailLength: js.UndefOr[scala.Nothing],
    tailWidth: js.UndefOr[scala.Nothing],
    headLength: Double,
    headPointiness: Double
  ): Shape = js.native
  def arrow(thickness: js.UndefOr[scala.Nothing], tailLength: js.UndefOr[scala.Nothing], tailWidth: Double): Shape = js.native
  def arrow(
    thickness: js.UndefOr[scala.Nothing],
    tailLength: js.UndefOr[scala.Nothing],
    tailWidth: Double,
    headLength: js.UndefOr[scala.Nothing],
    headPointiness: Double
  ): Shape = js.native
  def arrow(
    thickness: js.UndefOr[scala.Nothing],
    tailLength: js.UndefOr[scala.Nothing],
    tailWidth: Double,
    headLength: Double
  ): Shape = js.native
  def arrow(
    thickness: js.UndefOr[scala.Nothing],
    tailLength: js.UndefOr[scala.Nothing],
    tailWidth: Double,
    headLength: Double,
    headPointiness: Double
  ): Shape = js.native
  def arrow(thickness: js.UndefOr[scala.Nothing], tailLength: Double): Shape = js.native
  def arrow(
    thickness: js.UndefOr[scala.Nothing],
    tailLength: Double,
    tailWidth: js.UndefOr[scala.Nothing],
    headLength: js.UndefOr[scala.Nothing],
    headPointiness: Double
  ): Shape = js.native
  def arrow(
    thickness: js.UndefOr[scala.Nothing],
    tailLength: Double,
    tailWidth: js.UndefOr[scala.Nothing],
    headLength: Double
  ): Shape = js.native
  def arrow(
    thickness: js.UndefOr[scala.Nothing],
    tailLength: Double,
    tailWidth: js.UndefOr[scala.Nothing],
    headLength: Double,
    headPointiness: Double
  ): Shape = js.native
  def arrow(thickness: js.UndefOr[scala.Nothing], tailLength: Double, tailWidth: Double): Shape = js.native
  def arrow(
    thickness: js.UndefOr[scala.Nothing],
    tailLength: Double,
    tailWidth: Double,
    headLength: js.UndefOr[scala.Nothing],
    headPointiness: Double
  ): Shape = js.native
  def arrow(thickness: js.UndefOr[scala.Nothing], tailLength: Double, tailWidth: Double, headLength: Double): Shape = js.native
  def arrow(
    thickness: js.UndefOr[scala.Nothing],
    tailLength: Double,
    tailWidth: Double,
    headLength: Double,
    headPointiness: Double
  ): Shape = js.native
  def arrow(thickness: Double): Shape = js.native
  def arrow(
    thickness: Double,
    tailLength: js.UndefOr[scala.Nothing],
    tailWidth: js.UndefOr[scala.Nothing],
    headLength: js.UndefOr[scala.Nothing],
    headPointiness: Double
  ): Shape = js.native
  def arrow(
    thickness: Double,
    tailLength: js.UndefOr[scala.Nothing],
    tailWidth: js.UndefOr[scala.Nothing],
    headLength: Double
  ): Shape = js.native
  def arrow(
    thickness: Double,
    tailLength: js.UndefOr[scala.Nothing],
    tailWidth: js.UndefOr[scala.Nothing],
    headLength: Double,
    headPointiness: Double
  ): Shape = js.native
  def arrow(thickness: Double, tailLength: js.UndefOr[scala.Nothing], tailWidth: Double): Shape = js.native
  def arrow(
    thickness: Double,
    tailLength: js.UndefOr[scala.Nothing],
    tailWidth: Double,
    headLength: js.UndefOr[scala.Nothing],
    headPointiness: Double
  ): Shape = js.native
  def arrow(thickness: Double, tailLength: js.UndefOr[scala.Nothing], tailWidth: Double, headLength: Double): Shape = js.native
  def arrow(
    thickness: Double,
    tailLength: js.UndefOr[scala.Nothing],
    tailWidth: Double,
    headLength: Double,
    headPointiness: Double
  ): Shape = js.native
  def arrow(thickness: Double, tailLength: Double): Shape = js.native
  def arrow(
    thickness: Double,
    tailLength: Double,
    tailWidth: js.UndefOr[scala.Nothing],
    headLength: js.UndefOr[scala.Nothing],
    headPointiness: Double
  ): Shape = js.native
  def arrow(thickness: Double, tailLength: Double, tailWidth: js.UndefOr[scala.Nothing], headLength: Double): Shape = js.native
  def arrow(
    thickness: Double,
    tailLength: Double,
    tailWidth: js.UndefOr[scala.Nothing],
    headLength: Double,
    headPointiness: Double
  ): Shape = js.native
  def arrow(thickness: Double, tailLength: Double, tailWidth: Double): Shape = js.native
  def arrow(
    thickness: Double,
    tailLength: Double,
    tailWidth: Double,
    headLength: js.UndefOr[scala.Nothing],
    headPointiness: Double
  ): Shape = js.native
  def arrow(thickness: Double, tailLength: Double, tailWidth: Double, headLength: Double): Shape = js.native
  def arrow(
    thickness: Double,
    tailLength: Double,
    tailWidth: Double,
    headLength: Double,
    headPointiness: Double
  ): Shape = js.native
  
  def cube(): Shape = js.native
  
  def custom(s: Shape): Shape = js.native
  
  def extrude(points: js.Array[Point], offset: Point): Shape = js.native
  
  def icosahedron(): Shape = js.native
  
  def mapPointsToSurfaces(points: js.Array[Point], coordinateMap: js.Array[js.Array[Double]]): js.Array[Surface] = js.native
  
  def obj(objContents: String): Shape = js.native
  def obj(objContents: String, cullBackfaces: Boolean): Shape = js.native
  
  def patch(): Shape = js.native
  def patch(nx: js.UndefOr[scala.Nothing], ny: Double): Shape = js.native
  def patch(nx: Double): Shape = js.native
  def patch(nx: Double, ny: Double): Shape = js.native
  
  def path(points: js.Array[Point]): Shape = js.native
  
  def pipe(point1: Point, point2: Point): Shape = js.native
  def pipe(point1: Point, point2: Point, radius: js.UndefOr[scala.Nothing], segments: Double): Shape = js.native
  def pipe(point1: Point, point2: Point, radius: Double): Shape = js.native
  def pipe(point1: Point, point2: Point, radius: Double, segments: Double): Shape = js.native
  
  def pyramid(): Shape = js.native
  
  def rectangle(point1: Point, point2: Point): Shape = js.native
  
  def sphere(): Shape = js.native
  def sphere(subdivisions: Double): Shape = js.native
  
  def tetrahedron(): Shape = js.native
  
  def text(text: String): Shape = js.native
  def text(text: String, surfaceOptions: PartialSurface): Shape = js.native
  
  def unitcube(): Shape = js.native
}
