package typingsSlinky.tsmonad.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tsmonad", "Either")
@js.native
class Either_[L, R] protected ()
  extends typingsSlinky.tsmonad.eitherMod.Either_[L, R] {
  def this(`type`: typingsSlinky.tsmonad.eitherMod.EitherType) = this()
  def this(`type`: typingsSlinky.tsmonad.eitherMod.EitherType, l: L) = this()
  def this(`type`: typingsSlinky.tsmonad.eitherMod.EitherType, l: L, r: R) = this()
  def this(`type`: typingsSlinky.tsmonad.eitherMod.EitherType, l: js.UndefOr[scala.Nothing], r: R) = this()
}

/* static members */
@JSImport("tsmonad", "Either")
@js.native
object Either_ extends js.Object {
  def left[L, R](l: L): typingsSlinky.tsmonad.eitherMod.Either_[L, R] = js.native
  def right[L, R](r: R): typingsSlinky.tsmonad.eitherMod.Either_[L, R] = js.native
}

