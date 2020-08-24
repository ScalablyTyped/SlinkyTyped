package typingsSlinky.tweenJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tweenjs/tween.js", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class Group ()
    extends typingsSlinky.tweenJs.TWEEN.Group
  
  @js.native
  class Tween ()
    extends typingsSlinky.tweenJs.TWEEN.Tween {
    def this(`object`: js.Any) = this()
    def this(`object`: js.UndefOr[scala.Nothing], group: typingsSlinky.tweenJs.TWEEN.Group) = this()
    def this(`object`: js.Any, group: typingsSlinky.tweenJs.TWEEN.Group) = this()
  }
  
  var Easing: typingsSlinky.tweenJs.Easing = js.native
  var Interpolation: typingsSlinky.tweenJs.Interpolation = js.native
  def add(tween: typingsSlinky.tweenJs.TWEEN.Tween): Unit = js.native
  def getAll(): js.Array[typingsSlinky.tweenJs.TWEEN.Tween] = js.native
  def now(): Double = js.native
  def remove(tween: typingsSlinky.tweenJs.TWEEN.Tween): Unit = js.native
  def removeAll(): Unit = js.native
  def update(): Boolean = js.native
  def update(time: js.UndefOr[scala.Nothing], preserve: Boolean): Boolean = js.native
  def update(time: Double): Boolean = js.native
  def update(time: Double, preserve: Boolean): Boolean = js.native
}

