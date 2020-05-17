package typingsSlinky.tstl.operatorsMod

import typingsSlinky.std.Pick
import typingsSlinky.tstl.icomputableMod.IComputable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - scala.Double
  - java.lang.String
  - typingsSlinky.std.Pick[
typingsSlinky.tstl.icomputableMod.IComputable[Y, Ret], 
typingsSlinky.tstl.tstlStrings.plus]
*/
trait PlusParam[Y, Ret] extends js.Object

object PlusParam {
  @scala.inline
  implicit def apply[Y, Ret](value: Double): PlusParam[Y, Ret] = value.asInstanceOf[PlusParam[Y, Ret]]
  @scala.inline
  implicit def apply[Y, Ret](value: Pick[IComputable[Y, Ret], typingsSlinky.tstl.tstlStrings.plus]): PlusParam[Y, Ret] = value.asInstanceOf[PlusParam[Y, Ret]]
  @scala.inline
  implicit def apply[Y, Ret](value: String): PlusParam[Y, Ret] = value.asInstanceOf[PlusParam[Y, Ret]]
}

