package typingsSlinky.winjs.WinJS.UI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ListViewAnimationType extends js.Object
/**
  * Specifies that type of animation for which a contentanimating event was raised.
  **/
@JSGlobal("WinJS.UI.ListViewAnimationType")
@js.native
object ListViewAnimationType extends js.Object {
  
  /**
    * The animation plays when the ListView is changing its content.
    **/
  @js.native
  sealed trait contentTransition extends ListViewAnimationType
  
  /**
    * The animation plays when the ListView is first displayed.
    **/
  @js.native
  sealed trait entrance extends ListViewAnimationType
}
