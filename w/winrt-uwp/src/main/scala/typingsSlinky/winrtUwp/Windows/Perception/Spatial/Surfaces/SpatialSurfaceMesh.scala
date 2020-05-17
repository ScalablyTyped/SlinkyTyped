package typingsSlinky.winrtUwp.Windows.Perception.Spatial.Surfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SpatialSurfaceMesh extends js.Object {
  var coordinateSystem: js.Any = js.native
   /* unmapped type */ var surfaceInfo: js.Any = js.native
   /* unmapped type */ var triangleIndices: js.Any = js.native
   /* unmapped type */ var vertexNormals: js.Any = js.native
   /* unmapped type */ var vertexPositionScale: js.Any = js.native
   /* unmapped type */ var vertexPositions: js.Any = js.native
}

object SpatialSurfaceMesh {
  @scala.inline
  def apply(
    coordinateSystem: js.Any,
    surfaceInfo: js.Any,
    triangleIndices: js.Any,
    vertexNormals: js.Any,
    vertexPositionScale: js.Any,
    vertexPositions: js.Any
  ): SpatialSurfaceMesh = {
    val __obj = js.Dynamic.literal(coordinateSystem = coordinateSystem.asInstanceOf[js.Any], surfaceInfo = surfaceInfo.asInstanceOf[js.Any], triangleIndices = triangleIndices.asInstanceOf[js.Any], vertexNormals = vertexNormals.asInstanceOf[js.Any], vertexPositionScale = vertexPositionScale.asInstanceOf[js.Any], vertexPositions = vertexPositions.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpatialSurfaceMesh]
  }
  @scala.inline
  implicit class SpatialSurfaceMeshOps[Self <: SpatialSurfaceMesh] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCoordinateSystem(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("coordinateSystem")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSurfaceInfo(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("surfaceInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTriangleIndices(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("triangleIndices")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVertexNormals(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vertexNormals")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVertexPositionScale(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vertexPositionScale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVertexPositions(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vertexPositions")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

