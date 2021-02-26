package typingsSlinky.xrm.Xrm.Controls

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Interface for a Timeline control.
  * @see {@link Control}
  */
@js.native
trait TimelineWall extends Control {
  
  /**
    * Refreshes the data displayed in a timelinewall and timer control.
    */
  def refresh(): Unit = js.native
}
object TimelineWall {
  
  @scala.inline
  def apply(
    getControlType: () => ControlType | String,
    getLabel: () => String,
    getName: () => String,
    getParent: () => Section,
    getVisible: () => Boolean,
    refresh: () => Unit,
    setLabel: String => Unit
  ): TimelineWall = {
    val __obj = js.Dynamic.literal(getControlType = js.Any.fromFunction0(getControlType), getLabel = js.Any.fromFunction0(getLabel), getName = js.Any.fromFunction0(getName), getParent = js.Any.fromFunction0(getParent), getVisible = js.Any.fromFunction0(getVisible), refresh = js.Any.fromFunction0(refresh), setLabel = js.Any.fromFunction1(setLabel))
    __obj.asInstanceOf[TimelineWall]
  }
  
  @scala.inline
  implicit class TimelineWallMutableBuilder[Self <: TimelineWall] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRefresh(value: () => Unit): Self = StObject.set(x, "refresh", js.Any.fromFunction0(value))
  }
}
