package typingsSlinky.tstl.operatorsMod

import typingsSlinky.std.Pick
import typingsSlinky.tstl.icomputableMod.IComputable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - scala.Double
  - typingsSlinky.std.Pick[typingsSlinky.tstl.icomputableMod.IComputable[Y, Ret], Key]
*/
trait Param[Y, Ret, Key /* <: /* keyof tstl.tstl/numeric/IComputable.IComputable<Y, Ret> */ typingsSlinky.tstl.tstlStrings.plus | typingsSlinky.tstl.tstlStrings.minus | typingsSlinky.tstl.tstlStrings.multiplies | typingsSlinky.tstl.tstlStrings.divides | typingsSlinky.tstl.tstlStrings.modules | typingsSlinky.tstl.tstlStrings.negate */] extends js.Object

object Param {
  @scala.inline
  implicit def apply[Y, Ret, Key](value: Double): Param[Y, Ret, Key] = value.asInstanceOf[Param[Y, Ret, Key]]
  @scala.inline
  implicit def apply[Y, Ret, Key](value: Pick[IComputable[Y, Ret], Key]): Param[Y, Ret, Key] = value.asInstanceOf[Param[Y, Ret, Key]]
}

