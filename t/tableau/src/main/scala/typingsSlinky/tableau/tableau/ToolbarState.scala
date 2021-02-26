package typingsSlinky.tableau.tableau

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ToolbarState extends StObject {
  
  /** Gets the Viz object associated with the toolbar. */
  def getViz(): Viz = js.native
  
  /**
    * Gets a value indicating whether the specified toolbar button is enabled.
    * The supported buttons are defined in the ToobarButtonName enum.
    * Currently, only Undo and Redo are supported.
    * Checking this property with a toolbar button that is not supported causes an InvalidToolbarButtonName error.
    */
  def isButtonEnabled(toolbarButtonName: ToolbarButtonName): Boolean = js.native
}
object ToolbarState {
  
  @scala.inline
  def apply(getViz: () => Viz, isButtonEnabled: ToolbarButtonName => Boolean): ToolbarState = {
    val __obj = js.Dynamic.literal(getViz = js.Any.fromFunction0(getViz), isButtonEnabled = js.Any.fromFunction1(isButtonEnabled))
    __obj.asInstanceOf[ToolbarState]
  }
  
  @scala.inline
  implicit class ToolbarStateMutableBuilder[Self <: ToolbarState] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetViz(value: () => Viz): Self = StObject.set(x, "getViz", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsButtonEnabled(value: ToolbarButtonName => Boolean): Self = StObject.set(x, "isButtonEnabled", js.Any.fromFunction1(value))
  }
}
