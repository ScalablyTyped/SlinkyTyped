package typingsSlinky.typescriptServices.TypeScript

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IBitMatrix extends StObject {
  
  def release(): Unit = js.native
  
  def setValueAt(x: Double, y: Double, value: Boolean): Unit = js.native
  
  def valueAt(x: Double, y: Double): Boolean = js.native
}
object IBitMatrix {
  
  @scala.inline
  def apply(
    release: () => Unit,
    setValueAt: (Double, Double, Boolean) => Unit,
    valueAt: (Double, Double) => Boolean
  ): IBitMatrix = {
    val __obj = js.Dynamic.literal(release = js.Any.fromFunction0(release), setValueAt = js.Any.fromFunction3(setValueAt), valueAt = js.Any.fromFunction2(valueAt))
    __obj.asInstanceOf[IBitMatrix]
  }
  
  @scala.inline
  implicit class IBitMatrixMutableBuilder[Self <: IBitMatrix] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRelease(value: () => Unit): Self = StObject.set(x, "release", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetValueAt(value: (Double, Double, Boolean) => Unit): Self = StObject.set(x, "setValueAt", js.Any.fromFunction3(value))
    
    @scala.inline
    def setValueAt(value: (Double, Double) => Boolean): Self = StObject.set(x, "valueAt", js.Any.fromFunction2(value))
  }
}
