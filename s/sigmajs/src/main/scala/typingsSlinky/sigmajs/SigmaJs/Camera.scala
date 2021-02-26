package typingsSlinky.sigmajs.SigmaJs

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.sigmajs.anon.X
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Camera extends StObject {
  
  var angle: Double = js.native
  
  def cameraPosition(x: Double, y: Double): X = js.native
  
  def goTo(settings: StringDictionary[js.Any]): Unit = js.native
  
  def graphPosition(x: Double, y: Double): X = js.native
  
  var ratio: Double = js.native
  
  var readPrefix: String = js.native
  
  def settings(setting: String): js.Any = js.native
  
  var x: Double = js.native
  
  var y: Double = js.native
}
object Camera {
  
  @scala.inline
  def apply(
    angle: Double,
    cameraPosition: (Double, Double) => X,
    goTo: StringDictionary[js.Any] => Unit,
    graphPosition: (Double, Double) => X,
    ratio: Double,
    readPrefix: String,
    settings: String => js.Any,
    x: Double,
    y: Double
  ): Camera = {
    val __obj = js.Dynamic.literal(angle = angle.asInstanceOf[js.Any], cameraPosition = js.Any.fromFunction2(cameraPosition), goTo = js.Any.fromFunction1(goTo), graphPosition = js.Any.fromFunction2(graphPosition), ratio = ratio.asInstanceOf[js.Any], readPrefix = readPrefix.asInstanceOf[js.Any], settings = js.Any.fromFunction1(settings), x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[Camera]
  }
  
  @scala.inline
  implicit class CameraMutableBuilder[Self <: Camera] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAngle(value: Double): Self = StObject.set(x, "angle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCameraPosition(value: (Double, Double) => X): Self = StObject.set(x, "cameraPosition", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGoTo(value: StringDictionary[js.Any] => Unit): Self = StObject.set(x, "goTo", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGraphPosition(value: (Double, Double) => X): Self = StObject.set(x, "graphPosition", js.Any.fromFunction2(value))
    
    @scala.inline
    def setRatio(value: Double): Self = StObject.set(x, "ratio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadPrefix(value: String): Self = StObject.set(x, "readPrefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSettings(value: String => js.Any): Self = StObject.set(x, "settings", js.Any.fromFunction1(value))
    
    @scala.inline
    def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
