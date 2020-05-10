package typingsSlinky.xrm.Xrm.Controls

import typingsSlinky.xrm.Xrm.Events.ContextSensitiveHandler
import typingsSlinky.xrm.XrmEnum.GridControlContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface for a CRM grid control.
  *
  * @see {@link Control}
  */
@js.native
trait GridControl extends Control {
  /**
    * Use this method to add event handlers to the GridControl's OnLoad event.
    *
    * @param handler The event handler.
    */
  def addOnLoad(handler: ContextSensitiveHandler): Unit = js.native
  /**
    * This method returns context information about the GridControl.
    *
    * @returns The context type.
    */
  def getContextType(): GridControlContext = js.native
  /**
    * Use this method to get the logical name of the entity data displayed in the grid.
    *
    * @returns The entity name.
    */
  def getEntityName(): String = js.native
  /**
    * Use this method to get access to the Grid available in the GridControl.
    * @returns The grid.
    */
  def getGrid(): Grid = js.native
  /**
    * Use this method to get access to the ViewSelector available for the GridControl when it is configured to display views.
    * @returns The view selector.
    */
  def getViewSelector(): ViewSelector = js.native
  /**
    * Refreshes the sub grid.
    * @remarks Not available during the "on load" event of the form.
    */
  def refresh(): Unit = js.native
  /**
    * Use this method to remove event handlers from the GridControl's OnLoad event.
    * @param handler The handler.
    */
  def removeOnLoad(handler: js.Function0[Unit]): Unit = js.native
}

object GridControl {
  @scala.inline
  def apply(
    addOnLoad: ContextSensitiveHandler => Unit,
    getContextType: () => GridControlContext,
    getControlType: () => ControlType | String,
    getEntityName: () => String,
    getGrid: () => Grid,
    getLabel: () => String,
    getName: () => String,
    getParent: () => Section,
    getViewSelector: () => ViewSelector,
    getVisible: () => Boolean,
    refresh: () => Unit,
    removeOnLoad: js.Function0[Unit] => Unit,
    setLabel: String => Unit
  ): GridControl = {
    val __obj = js.Dynamic.literal(addOnLoad = js.Any.fromFunction1(addOnLoad), getContextType = js.Any.fromFunction0(getContextType), getControlType = js.Any.fromFunction0(getControlType), getEntityName = js.Any.fromFunction0(getEntityName), getGrid = js.Any.fromFunction0(getGrid), getLabel = js.Any.fromFunction0(getLabel), getName = js.Any.fromFunction0(getName), getParent = js.Any.fromFunction0(getParent), getViewSelector = js.Any.fromFunction0(getViewSelector), getVisible = js.Any.fromFunction0(getVisible), refresh = js.Any.fromFunction0(refresh), removeOnLoad = js.Any.fromFunction1(removeOnLoad), setLabel = js.Any.fromFunction1(setLabel))
    __obj.asInstanceOf[GridControl]
  }
  @scala.inline
  implicit class GridControlOps[Self <: GridControl] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddOnLoad(value: ContextSensitiveHandler => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addOnLoad")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetContextType(value: () => GridControlContext): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getContextType")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetEntityName(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getEntityName")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetGrid(value: () => Grid): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getGrid")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetViewSelector(value: () => ViewSelector): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getViewSelector")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withRefresh(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("refresh")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withRemoveOnLoad(value: js.Function0[Unit] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeOnLoad")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

