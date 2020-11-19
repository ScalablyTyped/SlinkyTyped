package typingsSlinky.stormReactDiagrams

import org.scalajs.dom.raw.Element
import typingsSlinky.stormReactDiagrams.pointModelMod.PointModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("storm-react-diagrams/dist/src/Toolkit", JSImport.Namespace)
@js.native
object toolkitMod extends js.Object {
  
  @js.native
  class Toolkit () extends js.Object
  /* static members */
  @js.native
  object Toolkit extends js.Object {
    
    var TESTING: Boolean = js.native
    
    var TESTING_UID: Double = js.native
    
    /**
      * Generats a unique ID (thanks Stack overflow :3)
      * @returns {String}
      */
    def UID(): String = js.native
    
    /**
      * Finds the closest element as a polyfill
      *
      * @param  {Element} element  [description]
      * @param  {string}  selector [description]
      */
    def closest(element: Element, selector: String): js.Any = js.native
    
    def generateCurvePath(firstPoint: PointModel, lastPoint: PointModel): String = js.native
    def generateCurvePath(firstPoint: PointModel, lastPoint: PointModel, curvy: Double): String = js.native
    
    def generateDynamicPath(pathCoords: js.Array[js.Array[Double]]): js.Any = js.native
    
    def generateLinePath(firstPoint: PointModel, lastPoint: PointModel): String = js.native
  }
}
