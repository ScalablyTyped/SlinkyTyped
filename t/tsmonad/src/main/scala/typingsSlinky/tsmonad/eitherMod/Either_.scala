package typingsSlinky.tsmonad.eitherMod

import typingsSlinky.std.Partial
import typingsSlinky.tsmonad.monadMod.Eq_
import typingsSlinky.tsmonad.monadMod.Functor
import typingsSlinky.tsmonad.monadMod.Monad
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tsmonad/lib/src/either", "Either")
@js.native
class Either_[L, R] protected ()
  extends Monad[R]
     with Functor[R]
     with Eq_[Either_[L, R]] {
  def this(`type`: EitherType) = this()
  def this(`type`: EitherType, l: L) = this()
  def this(`type`: EitherType, l: L, r: R) = this()
  var l: js.Any = js.native
  var r: js.Any = js.native
  var `type`: js.Any = js.native
  def caseOf[T](pattern: EitherPatterns[L, R, T]): T = js.native
  def `do`(): Either_[L, R] = js.native
  def `do`(patterns: Partial[EitherPatterns[L, R, Unit]]): Either_[L, R] = js.native
}

/* static members */
@JSImport("tsmonad/lib/src/either", "Either")
@js.native
object Either_ extends js.Object {
  def left[L, R](l: L): Either_[L, R] = js.native
  def right[L, R](r: R): Either_[L, R] = js.native
}

