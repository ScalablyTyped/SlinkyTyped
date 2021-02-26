package typingsSlinky.winjs.global.WinJS.UI

import org.scalajs.dom.raw.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Displays a collection, such as a set of photos, one item at a time.
  **/
@JSGlobal("WinJS.UI.FlipView")
@js.native
//#region Constructors
/**
  * Creates a new FlipView.
  * @constructor
  * @param element The DOM element that hosts the control.
  * @param options An object that contains one or more property/value pairs to apply to the new control. Each property corresponds to one of the control's properties or events. Event names must begin with "on". For example, to provide a handler for the pageselected event, add a property named "onpageselected" and set its value to the event handler.
  **/
class FlipView[T] ()
  extends typingsSlinky.winjs.WinJS.UI.FlipView[T] {
  def this(element: HTMLElement) = this()
  def this(element: js.UndefOr[scala.Nothing], options: js.Any) = this()
  def this(element: HTMLElement, options: js.Any) = this()
}
object FlipView {
  
  @JSGlobal("WinJS.UI.FlipView")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Event Name
    **/
  /* static member */
  @JSGlobal("WinJS.UI.FlipView.datasourceCountChangedEvent")
  @js.native
  def datasourceCountChangedEvent: String = js.native
  @scala.inline
  def datasourceCountChangedEvent_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("datasourceCountChangedEvent")(x.asInstanceOf[js.Any])
  
  /**
    * Event Name
    **/
  /* static member */
  @JSGlobal("WinJS.UI.FlipView.pageCompletedEvent")
  @js.native
  def pageCompletedEvent: String = js.native
  @scala.inline
  def pageCompletedEvent_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("pageCompletedEvent")(x.asInstanceOf[js.Any])
  
  /**
    * Event Name
    **/
  /* static member */
  @JSGlobal("WinJS.UI.FlipView.pageSelectedEvent")
  @js.native
  def pageSelectedEvent: String = js.native
  @scala.inline
  def pageSelectedEvent_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("pageSelectedEvent")(x.asInstanceOf[js.Any])
  
  /**
    * Event Name
    **/
  /* static member */
  @JSGlobal("WinJS.UI.FlipView.pageVisibilityChangedEvent")
  @js.native
  def pageVisibilityChangedEvent: String = js.native
  @scala.inline
  def pageVisibilityChangedEvent_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("pageVisibilityChangedEvent")(x.asInstanceOf[js.Any])
  
  /**
    * Indicates that the object is compatibile with declarative processing.
    **/
  /* static member */
  @JSGlobal("WinJS.UI.FlipView.supportedForProcessing")
  @js.native
  def supportedForProcessing: Boolean = js.native
  @scala.inline
  def supportedForProcessing_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("supportedForProcessing")(x.asInstanceOf[js.Any])
}
