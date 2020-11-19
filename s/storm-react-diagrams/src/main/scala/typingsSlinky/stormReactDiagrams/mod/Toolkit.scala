package typingsSlinky.stormReactDiagrams.mod

import org.scalajs.dom.raw.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("storm-react-diagrams", "Toolkit")
@js.native
class Toolkit ()
  extends typingsSlinky.stormReactDiagrams.toolkitMod.Toolkit
/* static members */
@JSImport("storm-react-diagrams", "Toolkit")
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
  
  def generateCurvePath(
    firstPoint: typingsSlinky.stormReactDiagrams.pointModelMod.PointModel,
    lastPoint: typingsSlinky.stormReactDiagrams.pointModelMod.PointModel
  ): String = js.native
  def generateCurvePath(
    firstPoint: typingsSlinky.stormReactDiagrams.pointModelMod.PointModel,
    lastPoint: typingsSlinky.stormReactDiagrams.pointModelMod.PointModel,
    curvy: Double
  ): String = js.native
  
  def generateDynamicPath(pathCoords: js.Array[js.Array[Double]]): js.Any = js.native
  
  def generateLinePath(
    firstPoint: typingsSlinky.stormReactDiagrams.pointModelMod.PointModel,
    lastPoint: typingsSlinky.stormReactDiagrams.pointModelMod.PointModel
  ): String = js.native
}
