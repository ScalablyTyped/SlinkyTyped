package typingsSlinky.winjs.mod.UI

import org.scalajs.dom.raw.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Defines a section of a Hub.
  **/
@JSImport("winjs", "UI.HubSection")
@js.native
//#region Constructors
/**
  * Creates a new HubSection.
  * @constructor
  * @param element The DOM element hosts the new HubSection.
  * @param options An object that contains one or more property/value pairs to apply to the new control. Each property of the options object corresponds to one of the control's properties or events.
  **/
class HubSection ()
  extends typingsSlinky.winjs.WinJS.UI.HubSection {
  def this(element: HTMLElement) = this()
  def this(element: js.UndefOr[scala.Nothing], options: js.Any) = this()
  def this(element: HTMLElement, options: js.Any) = this()
}
object HubSection {
  
  @JSImport("winjs", "UI.HubSection")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * This object supports the WinJS infrastructure and is not intended to be used directly from your code.
    **/
  /* static member */
  @JSImport("winjs", "UI.HubSection.isDeclarativeControlContainer")
  @js.native
  def isDeclarativeControlContainer: js.Any = js.native
  @scala.inline
  def isDeclarativeControlContainer_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isDeclarativeControlContainer")(x.asInstanceOf[js.Any])
  
  /**
    * Indicates that the object is compatibile with declarative processing.
    **/
  /* static member */
  @JSImport("winjs", "UI.HubSection.supportedForProcessing")
  @js.native
  def supportedForProcessing: Boolean = js.native
  @scala.inline
  def supportedForProcessing_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("supportedForProcessing")(x.asInstanceOf[js.Any])
}
