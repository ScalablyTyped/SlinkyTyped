package typingsSlinky.winjs.mod.UI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a layout for the ListView in which items are arranged in a vertical list.
  **/
@JSImport("winjs", "UI.ListLayout")
@js.native
//#region Constructors
/**
  * Creates a new ListLayout.
  * @constructor
  * @param options An object that contains one or more property/value pairs to apply to the new ListLayout. Each property of the options object corresponds to one of the object's properties or events. Event names must begin with "on".
  **/
class ListLayout ()
  extends typingsSlinky.winjs.WinJS.UI.ListLayout {
  def this(options: js.Any) = this()
}
object ListLayout {
  
  @JSImport("winjs", "UI.ListLayout")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Indicates that the object is compatibile with declarative processing.
    **/
  /* static member */
  @JSImport("winjs", "UI.ListLayout.supportedForProcessing")
  @js.native
  def supportedForProcessing: Boolean = js.native
  @scala.inline
  def supportedForProcessing_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("supportedForProcessing")(x.asInstanceOf[js.Any])
}
