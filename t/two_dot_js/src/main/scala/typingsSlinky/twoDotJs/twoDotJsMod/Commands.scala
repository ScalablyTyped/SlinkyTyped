package typingsSlinky.twoDotJs.twoDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Commands extends js.Object

@JSImport("two.js", "Commands")
@js.native
object Commands extends js.Object {
  @js.native
  sealed trait arc extends Commands
  
  @js.native
  sealed trait close extends Commands
  
  @js.native
  sealed trait curve extends Commands
  
  @js.native
  sealed trait line extends Commands
  
  @js.native
  sealed trait move extends Commands
  
  /* 3 */ val arc: typingsSlinky.twoDotJs.twoDotJsMod.Commands.arc with Double = js.native
  /* 4 */ val close: typingsSlinky.twoDotJs.twoDotJsMod.Commands.close with Double = js.native
  /* 2 */ val curve: typingsSlinky.twoDotJs.twoDotJsMod.Commands.curve with Double = js.native
  /* 1 */ val line: typingsSlinky.twoDotJs.twoDotJsMod.Commands.line with Double = js.native
  /* 0 */ val move: typingsSlinky.twoDotJs.twoDotJsMod.Commands.move with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Commands with Double] = js.native
}

