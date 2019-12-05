package typingsSlinky.umbraco.umbraco.resources

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Direction extends js.Object

/**
  * Can be Ascending or Descending - Default: Ascending
  */
@JSGlobal("umbraco.resources.Direction")
@js.native
object Direction extends js.Object {
  @js.native
  sealed trait Ascending extends Direction
  
  @js.native
  sealed trait Descending extends Direction
  
  /* 0 */ val Ascending: typingsSlinky.umbraco.umbraco.resources.Direction.Ascending with Double = js.native
  /* 1 */ val Descending: typingsSlinky.umbraco.umbraco.resources.Direction.Descending with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Direction with Double] = js.native
}

