package typingsSlinky.tsmonad.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("tsmonad", "Maybe")
@js.native
class Maybe_[T] protected ()
  extends typingsSlinky.tsmonad.maybeMod.Maybe_[T] {
  def this(`type`: typingsSlinky.tsmonad.maybeMod.MaybeType) = this()
  def this(`type`: typingsSlinky.tsmonad.maybeMod.MaybeType, value: T) = this()
}
/* static members */
@JSImport("tsmonad", "Maybe")
@js.native
object Maybe_ extends js.Object {
  
  def all(t: StringDictionary[typingsSlinky.tsmonad.maybeMod.Maybe_[_]]): typingsSlinky.tsmonad.maybeMod.Maybe_[StringDictionary[_]] = js.native
  
  def isJust[T](t: typingsSlinky.tsmonad.maybeMod.Maybe_[T]): Boolean = js.native
  
  def isNothing[T](t: typingsSlinky.tsmonad.maybeMod.Maybe_[T]): Boolean = js.native
  
  def just[T](t: T): typingsSlinky.tsmonad.maybeMod.Maybe_[T] = js.native
  
  def maybe[T](): typingsSlinky.tsmonad.maybeMod.Maybe_[T] = js.native
  def maybe[T](t: T): typingsSlinky.tsmonad.maybeMod.Maybe_[T] = js.native
  
  def nothing[T](): typingsSlinky.tsmonad.maybeMod.Maybe_[T] = js.native
  
  def sequence[T](t: StringDictionary[typingsSlinky.tsmonad.maybeMod.Maybe_[T]]): typingsSlinky.tsmonad.maybeMod.Maybe_[StringDictionary[T]] = js.native
}
