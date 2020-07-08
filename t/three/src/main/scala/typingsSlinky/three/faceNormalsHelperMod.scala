package typingsSlinky.three

import typingsSlinky.three.lineSegmentsMod.LineSegments
import typingsSlinky.three.object3DMod.Object3D
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/helpers/FaceNormalsHelper", JSImport.Namespace)
@js.native
object faceNormalsHelperMod extends js.Object {
  @js.native
  class FaceNormalsHelper protected () extends LineSegments {
    def this(`object`: Object3D) = this()
    def this(`object`: Object3D, size: Double) = this()
    def this(`object`: Object3D, size: js.UndefOr[scala.Nothing], hex: Double) = this()
    def this(`object`: Object3D, size: Double, hex: Double) = this()
    def this(
      `object`: Object3D,
      size: js.UndefOr[scala.Nothing],
      hex: js.UndefOr[scala.Nothing],
      linewidth: Double
    ) = this()
    def this(`object`: Object3D, size: js.UndefOr[scala.Nothing], hex: Double, linewidth: Double) = this()
    def this(`object`: Object3D, size: Double, hex: js.UndefOr[scala.Nothing], linewidth: Double) = this()
    def this(`object`: Object3D, size: Double, hex: Double, linewidth: Double) = this()
    var `object`: Object3D = js.native
    var size: Double = js.native
    def update(): Unit = js.native
    def update(`object`: Object3D): Unit = js.native
  }
  
}

