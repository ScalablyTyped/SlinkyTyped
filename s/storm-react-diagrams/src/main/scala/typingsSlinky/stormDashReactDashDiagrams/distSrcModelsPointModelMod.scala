package typingsSlinky.stormDashReactDashDiagrams

import typingsSlinky.stormDashReactDashDiagrams.distSrcModelsBaseModelMod.BaseModel
import typingsSlinky.stormDashReactDashDiagrams.distSrcModelsBaseModelMod.BaseModelListener
import typingsSlinky.stormDashReactDashDiagrams.distSrcModelsLinkModelMod.LinkModel
import typingsSlinky.stormDashReactDashDiagrams.distSrcModelsLinkModelMod.LinkModelListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("storm-react-diagrams/dist/src/models/PointModel", JSImport.Namespace)
@js.native
object distSrcModelsPointModelMod extends js.Object {
  @js.native
  class PointModel protected () extends BaseModel[LinkModel[LinkModelListener], BaseModelListener] {
    def this(link: LinkModel[LinkModelListener], points: Anon_X) = this()
    var x: Double = js.native
    var y: Double = js.native
    def getLink(): LinkModel[LinkModelListener] = js.native
    def getX(): Double = js.native
    def getY(): Double = js.native
    def isConnectedToPort(): Boolean = js.native
    def updateLocation(points: Anon_X): Unit = js.native
  }
  
}

