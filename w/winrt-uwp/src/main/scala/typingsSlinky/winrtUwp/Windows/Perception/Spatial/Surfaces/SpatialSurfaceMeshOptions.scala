package typingsSlinky.winrtUwp.Windows.Perception.Spatial.Surfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SpatialSurfaceMeshOptions extends js.Object {
   /* unmapped type */ var includeVertexNormals: js.Any = js.native
   /* unmapped type */ var triangleIndexFormat: js.Any = js.native
   /* unmapped type */ var vertexNormalFormat: js.Any = js.native
   /* unmapped type */ var vertexPositionFormat: js.Any = js.native
}

object SpatialSurfaceMeshOptions {
  @scala.inline
  def apply(
    includeVertexNormals: js.Any,
    triangleIndexFormat: js.Any,
    vertexNormalFormat: js.Any,
    vertexPositionFormat: js.Any
  ): SpatialSurfaceMeshOptions = {
    val __obj = js.Dynamic.literal(includeVertexNormals = includeVertexNormals.asInstanceOf[js.Any], triangleIndexFormat = triangleIndexFormat.asInstanceOf[js.Any], vertexNormalFormat = vertexNormalFormat.asInstanceOf[js.Any], vertexPositionFormat = vertexPositionFormat.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpatialSurfaceMeshOptions]
  }
  @scala.inline
  implicit class SpatialSurfaceMeshOptionsOps[Self <: SpatialSurfaceMeshOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIncludeVertexNormals(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeVertexNormals")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTriangleIndexFormat(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("triangleIndexFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVertexNormalFormat(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vertexNormalFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVertexPositionFormat(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vertexPositionFormat")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

