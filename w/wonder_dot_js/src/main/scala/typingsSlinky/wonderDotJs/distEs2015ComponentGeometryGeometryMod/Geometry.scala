package typingsSlinky.wonderDotJs.distEs2015ComponentGeometryGeometryMod

import typingsSlinky.wonderDotJs.distEs2015ComponentGeometryDataBasicGeometryDataMod.BasicGeometryData
import typingsSlinky.wonderDotJs.distEs2015ComponentGeometryDataBufferContainerMod.BufferContainer
import typingsSlinky.wonderDotJs.distEs2015ComponentGeometryDataGeometryDataMod.GeometryData
import typingsSlinky.wonderDotJs.distEs2015CoreComponentMod.Component
import typingsSlinky.wonderDotJs.distEs2015CoreEntityObjectGameObjectGameObjectMod.GameObject
import typingsSlinky.wonderDotJs.distEs2015MaterialMaterialMod.Material
import typingsSlinky.wonderDotJs.distEs2015RendererEDrawModeMod.EDrawMode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder.js/dist/es2015/component/geometry/Geometry", "Geometry")
@js.native
abstract class Geometry () extends Component {
  var buffers: BufferContainer = js.native
  var drawMode: EDrawMode = js.native
  @JSName("entityObject")
  var entityObject_Geometry: GameObject = js.native
  val geometryData: GeometryData = js.native
  var material: Material = js.native
  def computeData(): GeometryDataType = js.native
  /* protected */ def createBasicGeometryData(computedData: GeometryDataType): BasicGeometryData = js.native
  /* protected */ def createBufferContainer(): BufferContainer = js.native
  def createBuffersFromGeometryData(): Unit = js.native
  /* protected */ def createGeometryData(computedData: GeometryDataType): GeometryData = js.native
}

