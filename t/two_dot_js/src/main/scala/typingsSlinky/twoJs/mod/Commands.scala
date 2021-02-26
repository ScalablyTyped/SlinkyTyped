package typingsSlinky.twoJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait Commands extends StObject
@JSImport("two.js", "Commands")
@js.native
object Commands extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Commands with Double] = js.native
  
  @js.native
  sealed trait arc extends Commands
  /* 3 */ val arc: typingsSlinky.twoJs.mod.Commands.arc with Double = js.native
  
  @js.native
  sealed trait close extends Commands
  /* 4 */ val close: typingsSlinky.twoJs.mod.Commands.close with Double = js.native
  
  @js.native
  sealed trait curve extends Commands
  /* 2 */ val curve: typingsSlinky.twoJs.mod.Commands.curve with Double = js.native
  
  @js.native
  sealed trait line extends Commands
  /* 1 */ val line: typingsSlinky.twoJs.mod.Commands.line with Double = js.native
  
  @js.native
  sealed trait move extends Commands
  /* 0 */ val move: typingsSlinky.twoJs.mod.Commands.move with Double = js.native
}
