package typingsSlinky.webix.webix

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Undo extends StObject {
  
  def ignoreUndo(functor: WebixCallback): Unit = js.native
  
  def removeUndo(id: String): Unit = js.native
  
  def undo(id: String): Unit = js.native
}
object Undo {
  
  @scala.inline
  def apply(ignoreUndo: WebixCallback => Unit, removeUndo: String => Unit, undo: String => Unit): Undo = {
    val __obj = js.Dynamic.literal(ignoreUndo = js.Any.fromFunction1(ignoreUndo), removeUndo = js.Any.fromFunction1(removeUndo), undo = js.Any.fromFunction1(undo))
    __obj.asInstanceOf[Undo]
  }
  
  @scala.inline
  implicit class UndoMutableBuilder[Self <: Undo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIgnoreUndo(value: WebixCallback => Unit): Self = StObject.set(x, "ignoreUndo", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRemoveUndo(value: String => Unit): Self = StObject.set(x, "removeUndo", js.Any.fromFunction1(value))
    
    @scala.inline
    def setUndo(value: String => Unit): Self = StObject.set(x, "undo", js.Any.fromFunction1(value))
  }
}
