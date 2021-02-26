package typingsSlinky.winjs.global.WinJS.UI

import org.scalajs.dom.raw.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Displays data items in a customizable list or grid.
  **/
@JSGlobal("WinJS.UI.ListView")
@js.native
//#region Constructors
/**
  * Creates a new ListView.
  * @constructor
  * @param element The DOM element that hosts the ListView control.
  * @param options An object that contains one or more property/value pairs to apply to the new control. Each property of the options object corresponds to one of the control's properties or events. Event names must begin with "on". For example, to provide a handler for the selectionchanged event, add a property named "onselectionchanged" to the options object and set its value to the event handler.
  **/
class ListView[T] ()
  extends typingsSlinky.winjs.WinJS.UI.ListView[T] {
  def this(element: HTMLElement) = this()
  def this(element: js.UndefOr[scala.Nothing], options: js.Any) = this()
  def this(element: HTMLElement, options: js.Any) = this()
}
object ListView {
  
  @JSGlobal("WinJS.UI.ListView")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Indicates that the object is compatibile with declarative processing.
    **/
  /* static member */
  @JSGlobal("WinJS.UI.ListView.supportedForProcessing")
  @js.native
  def supportedForProcessing: Boolean = js.native
  @scala.inline
  def supportedForProcessing_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("supportedForProcessing")(x.asInstanceOf[js.Any])
  
  /**
    * Triggers the ListView disposal service manually.
    **/
  /* static member */
  @JSGlobal("WinJS.UI.ListView.triggerDispose")
  @js.native
  def triggerDispose(): Unit = js.native
}
