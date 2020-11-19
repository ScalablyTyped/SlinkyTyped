package typingsSlinky.winjs.global.WinJS.UI

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.winjs.anon.Complete
import typingsSlinky.winjs.anon.ContentTransition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Creates a hub navigation pattern consisting of sections that can be navigated to. Each section is defined by a HubSection object.
  **/
@JSGlobal("WinJS.UI.Hub")
@js.native
//#region Constructors
/**
  * Creates a new Hub control.
  * @constructor
  * @param element The DOM element that will host the Hub control.
  * @param options An object that contains one or more property/value pairs to apply to the new control. Each property of the options object corresponds to one of the control's properties or events. Event names must begin with "on". For example, to provide a handler for the contentanimating event, add a property named "oncontentanimating" to the options object and set its value to the event handler.
  **/
class Hub ()
  extends typingsSlinky.winjs.WinJS.UI.Hub {
  def this(element: HTMLElement) = this()
  def this(element: js.UndefOr[scala.Nothing], options: js.Any) = this()
  def this(element: HTMLElement, options: js.Any) = this()
}
/* static members */
@JSGlobal("WinJS.UI.Hub")
@js.native
object Hub extends js.Object {
  
  /**
    * Specifies whether the Hub animation is an entrance animation or a transition animation.
    **/
  var AnimationType: ContentTransition = js.native
  
  /**
    * Gets the current loading state of the Hub.
    **/
  var LoadingState: Complete = js.native
  
  /**
    * Indicates that the object is compatibile with declarative processing.
    **/
  var supportedForProcessing: Boolean = js.native
}
