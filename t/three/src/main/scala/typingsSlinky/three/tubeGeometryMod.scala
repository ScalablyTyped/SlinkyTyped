package typingsSlinky.three

import typingsSlinky.three.anon.Closed
import typingsSlinky.three.curveMod.Curve
import typingsSlinky.three.geometryMod.Geometry
import typingsSlinky.three.vector3Mod.Vector3
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("three/src/geometries/TubeGeometry", JSImport.Namespace)
@js.native
object tubeGeometryMod extends js.Object {
  
  @js.native
  class TubeGeometry protected () extends Geometry {
    /**
    	 * @param path
    	 * @param [tubularSegments=64]
    	 * @param [radius=1]
    	 * @param [radiusSegments=8]
    	 * @param [closed=false]
    	 */
    def this(path: Curve[Vector3]) = this()
    def this(path: Curve[Vector3], tubularSegments: Double) = this()
    def this(path: Curve[Vector3], tubularSegments: js.UndefOr[scala.Nothing], radius: Double) = this()
    def this(path: Curve[Vector3], tubularSegments: Double, radius: Double) = this()
    def this(
      path: Curve[Vector3],
      tubularSegments: js.UndefOr[scala.Nothing],
      radius: js.UndefOr[scala.Nothing],
      radiusSegments: Double
    ) = this()
    def this(
      path: Curve[Vector3],
      tubularSegments: js.UndefOr[scala.Nothing],
      radius: Double,
      radiusSegments: Double
    ) = this()
    def this(
      path: Curve[Vector3],
      tubularSegments: Double,
      radius: js.UndefOr[scala.Nothing],
      radiusSegments: Double
    ) = this()
    def this(path: Curve[Vector3], tubularSegments: Double, radius: Double, radiusSegments: Double) = this()
    def this(
      path: Curve[Vector3],
      tubularSegments: js.UndefOr[scala.Nothing],
      radius: js.UndefOr[scala.Nothing],
      radiusSegments: js.UndefOr[scala.Nothing],
      closed: Boolean
    ) = this()
    def this(
      path: Curve[Vector3],
      tubularSegments: js.UndefOr[scala.Nothing],
      radius: js.UndefOr[scala.Nothing],
      radiusSegments: Double,
      closed: Boolean
    ) = this()
    def this(
      path: Curve[Vector3],
      tubularSegments: js.UndefOr[scala.Nothing],
      radius: Double,
      radiusSegments: js.UndefOr[scala.Nothing],
      closed: Boolean
    ) = this()
    def this(
      path: Curve[Vector3],
      tubularSegments: js.UndefOr[scala.Nothing],
      radius: Double,
      radiusSegments: Double,
      closed: Boolean
    ) = this()
    def this(
      path: Curve[Vector3],
      tubularSegments: Double,
      radius: js.UndefOr[scala.Nothing],
      radiusSegments: js.UndefOr[scala.Nothing],
      closed: Boolean
    ) = this()
    def this(
      path: Curve[Vector3],
      tubularSegments: Double,
      radius: js.UndefOr[scala.Nothing],
      radiusSegments: Double,
      closed: Boolean
    ) = this()
    def this(
      path: Curve[Vector3],
      tubularSegments: Double,
      radius: Double,
      radiusSegments: js.UndefOr[scala.Nothing],
      closed: Boolean
    ) = this()
    def this(
      path: Curve[Vector3],
      tubularSegments: Double,
      radius: Double,
      radiusSegments: Double,
      closed: Boolean
    ) = this()
    
    var binormals: js.Array[Vector3] = js.native
    
    var normals: js.Array[Vector3] = js.native
    
    var parameters: Closed = js.native
    
    var tangents: js.Array[Vector3] = js.native
  }
}
