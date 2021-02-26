package typingsSlinky.stormReactDiagrams.mod

import org.scalajs.dom.raw.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("storm-react-diagrams", "Toolkit")
@js.native
class Toolkit ()
  extends typingsSlinky.stormReactDiagrams.toolkitMod.Toolkit
/* static members */
object Toolkit {
  
  @JSImport("storm-react-diagrams", "Toolkit")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("storm-react-diagrams", "Toolkit.TESTING")
  @js.native
  def TESTING: Boolean = js.native
  @scala.inline
  def TESTING_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TESTING")(x.asInstanceOf[js.Any])
  
  @JSImport("storm-react-diagrams", "Toolkit.TESTING_UID")
  @js.native
  def TESTING_UID: Double = js.native
  @scala.inline
  def TESTING_UID_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TESTING_UID")(x.asInstanceOf[js.Any])
  
  /**
    * Generats a unique ID (thanks Stack overflow :3)
    * @returns {String}
    */
  @JSImport("storm-react-diagrams", "Toolkit.UID")
  @js.native
  def UID(): String = js.native
  
  /**
    * Finds the closest element as a polyfill
    *
    * @param  {Element} element  [description]
    * @param  {string}  selector [description]
    */
  @JSImport("storm-react-diagrams", "Toolkit.closest")
  @js.native
  def closest(element: Element, selector: String): js.Any = js.native
  
  @JSImport("storm-react-diagrams", "Toolkit.generateCurvePath")
  @js.native
  def generateCurvePath(
    firstPoint: typingsSlinky.stormReactDiagrams.pointModelMod.PointModel,
    lastPoint: typingsSlinky.stormReactDiagrams.pointModelMod.PointModel
  ): String = js.native
  @JSImport("storm-react-diagrams", "Toolkit.generateCurvePath")
  @js.native
  def generateCurvePath(
    firstPoint: typingsSlinky.stormReactDiagrams.pointModelMod.PointModel,
    lastPoint: typingsSlinky.stormReactDiagrams.pointModelMod.PointModel,
    curvy: Double
  ): String = js.native
  
  @JSImport("storm-react-diagrams", "Toolkit.generateDynamicPath")
  @js.native
  def generateDynamicPath(pathCoords: js.Array[js.Array[Double]]): js.Any = js.native
  
  @JSImport("storm-react-diagrams", "Toolkit.generateLinePath")
  @js.native
  def generateLinePath(
    firstPoint: typingsSlinky.stormReactDiagrams.pointModelMod.PointModel,
    lastPoint: typingsSlinky.stormReactDiagrams.pointModelMod.PointModel
  ): String = js.native
}
