package typingsSlinky.stormReactDiagrams

import typingsSlinky.stormReactDiagrams.anon.X
import typingsSlinky.stormReactDiagrams.baseModelMod.BaseModel
import typingsSlinky.stormReactDiagrams.baseModelMod.BaseModelListener
import typingsSlinky.stormReactDiagrams.linkModelMod.LinkModel
import typingsSlinky.stormReactDiagrams.linkModelMod.LinkModelListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pointModelMod {
  
  @JSImport("storm-react-diagrams/dist/src/models/PointModel", "PointModel")
  @js.native
  class PointModel protected () extends BaseModel[LinkModel[LinkModelListener], BaseModelListener] {
    def this(link: LinkModel[LinkModelListener], points: X) = this()
    
    def getLink(): LinkModel[LinkModelListener] = js.native
    
    def getX(): Double = js.native
    
    def getY(): Double = js.native
    
    def isConnectedToPort(): Boolean = js.native
    
    def updateLocation(points: X): Unit = js.native
    
    var x: Double = js.native
    
    var y: Double = js.native
  }
}
