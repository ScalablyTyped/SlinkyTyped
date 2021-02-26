package typingsSlinky.xrm.Xrm.Controls

import typingsSlinky.xrm.Xrm.Collection.ItemCollection
import typingsSlinky.xrm.Xrm.DisplayState
import typingsSlinky.xrm.Xrm.Events.ContextSensitiveHandler
import typingsSlinky.xrm.Xrm.Ui
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Interface for a form tab.
  * @see {@link UiElement}
  * @see {@link UiFocusable}
  */
@js.native
trait Tab
  extends UiStandardElement
     with UiFocusable {
  
  /**
    * Adds a function to be called when the TabStateChange event occurs.
    * @param handler The function to be executed on the TabStateChange event.
    */
  def addTabStateChange(handler: ContextSensitiveHandler): Unit = js.native
  
  /**
    * Gets display state of the tab.
    * @returns The display state, as either "expanded" or "collapsed"
    */
  def getDisplayState(): DisplayState = js.native
  
  /**
    * Gets the name of the tab.
    * @returns The name.
    */
  def getName(): String = js.native
  
  /**
    * Gets a reference to the {@link FormContext.ui formContext.ui} parent of the tab.
    * @returns The parent.
    */
  def getParent(): Ui = js.native
  
  /**
    * Removes a function to be called when the TabStateChange event occurs.
    * @param handler The function to be removed from the TabStateChange event.
    */
  def removeTabStateChange(handler: ContextSensitiveHandler): Unit = js.native
  
  /**
    * A reference to the collection of form sections within this tab.
    * @see {@link https://docs.microsoft.com/en-us/dynamics365/customer-engagement/developer/clientapi/reference/collections External Link: Collections (Client API reference)}
    */
  var sections: ItemCollection[Section] = js.native
  
  /**
    * Sets display state of the tab.
    * @param displayState Display state of the tab, as either "expanded" or "collapsed"
    */
  def setDisplayState(displayState: DisplayState): Unit = js.native
}
object Tab {
  
  @scala.inline
  def apply(
    addTabStateChange: ContextSensitiveHandler => Unit,
    getDisplayState: () => DisplayState,
    getLabel: () => String,
    getName: () => String,
    getParent: () => Ui,
    getVisible: () => Boolean,
    removeTabStateChange: ContextSensitiveHandler => Unit,
    sections: ItemCollection[Section],
    setDisplayState: DisplayState => Unit,
    setFocus: () => Unit,
    setLabel: String => Unit,
    setVisible: Boolean => Unit
  ): Tab = {
    val __obj = js.Dynamic.literal(addTabStateChange = js.Any.fromFunction1(addTabStateChange), getDisplayState = js.Any.fromFunction0(getDisplayState), getLabel = js.Any.fromFunction0(getLabel), getName = js.Any.fromFunction0(getName), getParent = js.Any.fromFunction0(getParent), getVisible = js.Any.fromFunction0(getVisible), removeTabStateChange = js.Any.fromFunction1(removeTabStateChange), sections = sections.asInstanceOf[js.Any], setDisplayState = js.Any.fromFunction1(setDisplayState), setFocus = js.Any.fromFunction0(setFocus), setLabel = js.Any.fromFunction1(setLabel), setVisible = js.Any.fromFunction1(setVisible))
    __obj.asInstanceOf[Tab]
  }
  
  @scala.inline
  implicit class TabMutableBuilder[Self <: Tab] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddTabStateChange(value: ContextSensitiveHandler => Unit): Self = StObject.set(x, "addTabStateChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetDisplayState(value: () => DisplayState): Self = StObject.set(x, "getDisplayState", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetName(value: () => String): Self = StObject.set(x, "getName", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetParent(value: () => Ui): Self = StObject.set(x, "getParent", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRemoveTabStateChange(value: ContextSensitiveHandler => Unit): Self = StObject.set(x, "removeTabStateChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSections(value: ItemCollection[Section]): Self = StObject.set(x, "sections", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetDisplayState(value: DisplayState => Unit): Self = StObject.set(x, "setDisplayState", js.Any.fromFunction1(value))
  }
}
