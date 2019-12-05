package typingsSlinky.tsmonad.libSrcEitherMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EitherType extends js.Object

@JSImport("tsmonad/lib/src/either", "EitherType")
@js.native
object EitherType extends js.Object {
  @js.native
  sealed trait Left extends EitherType
  
  @js.native
  sealed trait Right extends EitherType
  
  /* 0 */ val Left: typingsSlinky.tsmonad.libSrcEitherMod.EitherType.Left with Double = js.native
  /* 1 */ val Right: typingsSlinky.tsmonad.libSrcEitherMod.EitherType.Right with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EitherType with Double] = js.native
}

