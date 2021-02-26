package typingsSlinky.winrt.Windows.UI.Core

import typingsSlinky.winrt.Windows.Foundation.Point
import typingsSlinky.winrt.Windows.Foundation.Rect
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ITouchHitTestingEventArgs extends ICoreWindowEventArgs {
  
  var boundingBox: Rect = js.native
  
  def evaluateProximity(controlBoundingBox: Rect): CoreProximityEvaluation = js.native
  def evaluateProximity(controlVertices: js.Array[Point]): CoreProximityEvaluation = js.native
  
  var point: Point = js.native
  
  var proximityEvaluation: CoreProximityEvaluation = js.native
}
