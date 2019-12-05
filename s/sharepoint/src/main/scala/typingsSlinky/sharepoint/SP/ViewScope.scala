package typingsSlinky.sharepoint.SP

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ViewScope extends js.Object

@JSGlobal("SP.ViewScope")
@js.native
object ViewScope extends js.Object {
  @js.native
  sealed trait defaultValue extends ViewScope
  
  @js.native
  sealed trait filesOnly extends ViewScope
  
  @js.native
  sealed trait recursive extends ViewScope
  
  @js.native
  sealed trait recursiveAll extends ViewScope
  
  /* 0 */ val defaultValue: typingsSlinky.sharepoint.SP.ViewScope.defaultValue with Double = js.native
  /* 3 */ val filesOnly: typingsSlinky.sharepoint.SP.ViewScope.filesOnly with Double = js.native
  /* 1 */ val recursive: typingsSlinky.sharepoint.SP.ViewScope.recursive with Double = js.native
  /* 2 */ val recursiveAll: typingsSlinky.sharepoint.SP.ViewScope.recursiveAll with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ViewScope with Double] = js.native
}

