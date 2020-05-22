package typingsSlinky.tstl

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.std.Pick
import typingsSlinky.tstl.icomputableMod.IComputable
import typingsSlinky.tstl.inegatableMod.INegatable
import typingsSlinky.tstl.tstlStrings.divides
import typingsSlinky.tstl.tstlStrings.minus
import typingsSlinky.tstl.tstlStrings.modules
import typingsSlinky.tstl.tstlStrings.multiplies
import typingsSlinky.tstl.tstlStrings.negate
import typingsSlinky.tstl.tstlStrings.plus
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/numeric/operators", JSImport.Namespace)
@js.native
object operatorsMod extends js.Object {
  def divides[X /* <: Param[Y, Ret, typingsSlinky.tstl.tstlStrings.divides] */, Y, Ret](x: X, y: Y): Ret = js.native
  def minus[X /* <: Param[Y, Ret, typingsSlinky.tstl.tstlStrings.minus] */, Y, Ret](x: X, y: Y): Ret = js.native
  def modules[X /* <: Param[Y, Ret, typingsSlinky.tstl.tstlStrings.modules] */, Y, Ret](x: X, y: Y): Ret = js.native
  def multiplies[X /* <: Param[Y, Ret, typingsSlinky.tstl.tstlStrings.multiplies] */, Y, Ret](x: X, y: Y): Ret = js.native
  def negate[Ret](x: Double): Ret = js.native
  def negate[Ret](x: INegatable[Ret]): Ret = js.native
  def plus[Y, Ret](x: String, y: Y): Ret = js.native
  def plus[Y, Ret](x: Double, y: Y): Ret = js.native
  def plus[X /* <: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in 'plus' ]: tstl.tstl/numeric/IComputable.IComputable<Y, Ret>[P]}
    */ typingsSlinky.tstl.tstlStrings.plus with (TopLevel[IComputable[Y, Ret]]) */, Y, Ret](x: X, y: Y): Ret = js.native
  type Param[Y, Ret, Key /* <: /* keyof tstl.tstl/numeric/IComputable.IComputable<Y, Ret> */ plus | minus | multiplies | divides | modules | negate */] = Double | (Pick[IComputable[Y, Ret], Key])
  type PlusParam[Y, Ret] = Double | String | (Pick[IComputable[Y, Ret], plus])
}

