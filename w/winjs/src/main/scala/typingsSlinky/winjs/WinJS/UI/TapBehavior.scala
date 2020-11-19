package typingsSlinky.winjs.WinJS.UI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TapBehavior extends js.Object
/**
  * Specifies how items in a ListView respond to the tap interaction.
  **/
@JSGlobal("WinJS.UI.TapBehavior")
@js.native
object TapBehavior extends js.Object {
  
  /**
    * The item is selected and invoked.
    **/
  @js.native
  sealed trait directSelect extends TapBehavior
  
  /**
    * The item is invoked but not selected.
    **/
  @js.native
  sealed trait invokeOnly extends TapBehavior
  
  /**
    * Nothing happens.
    **/
  @js.native
  sealed trait none extends TapBehavior
  
  /**
    * The item is selected if was not already selected, and its deselected if it was already selected.
    **/
  @js.native
  sealed trait toggleSelect extends TapBehavior
}
