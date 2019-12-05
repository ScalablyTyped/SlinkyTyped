package typingsSlinky.ydnDashDb.ydn.db

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Op extends js.Object

@JSGlobal("ydn.db.Op")
@js.native
object Op extends js.Object {
  @js.native
  sealed trait `<` extends Op
  
  @js.native
  sealed trait `<=` extends Op
  
  @js.native
  sealed trait `=` extends Op
  
  @js.native
  sealed trait `>` extends Op
  
  @js.native
  sealed trait `>=` extends Op
  
  @js.native
  sealed trait ^ extends Op
  
  /* 1 */ val `<`: typingsSlinky.ydnDashDb.ydn.db.Op.`<` with Double = js.native
  /* 4 */ val `<=`: typingsSlinky.ydnDashDb.ydn.db.Op.`<=` with Double = js.native
  /* 2 */ val `=`: typingsSlinky.ydnDashDb.ydn.db.Op.`=` with Double = js.native
  /* 0 */ val `>`: typingsSlinky.ydnDashDb.ydn.db.Op.`>` with Double = js.native
  /* 3 */ val `>=`: typingsSlinky.ydnDashDb.ydn.db.Op.`>=` with Double = js.native
  /* 5 */ val ^ : typingsSlinky.ydnDashDb.ydn.db.Op.^  with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Op with Double] = js.native
}

