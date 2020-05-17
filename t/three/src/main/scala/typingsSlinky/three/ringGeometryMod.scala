package typingsSlinky.three

import typingsSlinky.three.anon.InnerRadius
import typingsSlinky.three.bufferGeometryMod.BufferGeometry
import typingsSlinky.three.geometryMod.Geometry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/geometries/RingGeometry", JSImport.Namespace)
@js.native
object ringGeometryMod extends js.Object {
  @js.native
  class RingBufferGeometry protected () extends BufferGeometry {
    def this(
      innerRadius: js.UndefOr[Double],
      outerRadius: js.UndefOr[Double],
      thetaSegments: js.UndefOr[Double],
      phiSegments: js.UndefOr[Double],
      thetaStart: js.UndefOr[Double],
      thetaLength: js.UndefOr[Double]
    ) = this()
    var parameters: InnerRadius = js.native
  }
  
  @js.native
  class RingGeometry protected () extends Geometry {
    def this(
      innerRadius: js.UndefOr[Double],
      outerRadius: js.UndefOr[Double],
      thetaSegments: js.UndefOr[Double],
      phiSegments: js.UndefOr[Double],
      thetaStart: js.UndefOr[Double],
      thetaLength: js.UndefOr[Double]
    ) = this()
    var parameters: InnerRadius = js.native
  }
  
}

