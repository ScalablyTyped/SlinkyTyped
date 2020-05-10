package typingsSlinky.xrm.Xrm.Controls

import typingsSlinky.xrm.Xrm.Collection.ItemCollection
import typingsSlinky.xrm.Xrm.DisplayState
import typingsSlinky.xrm.Xrm.Events.ContextSensitiveHandler
import typingsSlinky.xrm.Xrm.Ui
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
    * A reference to the collection of form sections within this tab.
    * @see {@link https://docs.microsoft.com/en-us/dynamics365/customer-engagement/developer/clientapi/reference/collections External Link: Collections (Client API reference)}
    */
  var sections: ItemCollection[Section] = js.native
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
  implicit class TabOps[Self <: Tab] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddTabStateChange(value: ContextSensitiveHandler => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addTabStateChange")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetDisplayState(value: () => DisplayState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDisplayState")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetName(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getName")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetParent(value: () => Ui): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getParent")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withRemoveTabStateChange(value: ContextSensitiveHandler => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeTabStateChange")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSections(value: ItemCollection[Section]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sections")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSetDisplayState(value: DisplayState => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setDisplayState")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

