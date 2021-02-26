package typingsSlinky.winjs.global.WinJS.UI

import org.scalajs.dom.raw.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Displays a modal dialog which can display arbitrary HTML content.
  **/
@JSGlobal("WinJS.UI.ContentDialog")
@js.native
/**
  * Creates a new ContentDialog control.
  * @constructor
  * @param The DOM element that hosts the ContentDialog control.
  * @param options An object that contains one or more property/value pairs to apply to the new control. Each property of the options object corresponds to one of the control's properties or events.
  **/
class ContentDialog ()
  extends typingsSlinky.winjs.WinJS.UI.ContentDialog {
  def this(element: HTMLElement) = this()
  def this(element: js.UndefOr[scala.Nothing], options: js.Any) = this()
  def this(element: HTMLElement, options: js.Any) = this()
}
object ContentDialog {
  
  @JSGlobal("WinJS.UI.ContentDialog")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Specifies the result of dismissing the ContentDialog.
    **/
  /* static member */
  object DismissalResult {
    
    @JSGlobal("WinJS.UI.ContentDialog.DismissalResult")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * The dialog was dismissed without the user selecting any of the commands. The user may have dismissed the dialog by hitting the escape key or pressing the hardware back button.
      **/
    @JSGlobal("WinJS.UI.ContentDialog.DismissalResult.none")
    @js.native
    def none: String = js.native
    @scala.inline
    def none_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("none")(x.asInstanceOf[js.Any])
    
    /**
      * The user dismissed the dialog by pressing the primary command.
      **/
    @JSGlobal("WinJS.UI.ContentDialog.DismissalResult.primary")
    @js.native
    def primary: String = js.native
    @scala.inline
    def primary_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("primary")(x.asInstanceOf[js.Any])
    
    /**
      * The user dismissed the dialog by pressing the secondary command.
      **/
    @JSGlobal("WinJS.UI.ContentDialog.DismissalResult.secondary")
    @js.native
    def secondary: String = js.native
    @scala.inline
    def secondary_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("secondary")(x.asInstanceOf[js.Any])
  }
  
  /**
    * Indicates that the object is compatibile with declarative processing.
    **/
  /* static member */
  @JSGlobal("WinJS.UI.ContentDialog.supportedForProcessing")
  @js.native
  def supportedForProcessing: Boolean = js.native
  @scala.inline
  def supportedForProcessing_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("supportedForProcessing")(x.asInstanceOf[js.Any])
}
