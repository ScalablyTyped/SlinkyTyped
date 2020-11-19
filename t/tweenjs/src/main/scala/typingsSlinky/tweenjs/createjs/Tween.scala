package typingsSlinky.tweenjs.createjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Tween extends AbstractTween {
  
  def call(callback: js.Function1[/* repeated */ js.Any, Unit]): Tween = js.native
  def call(
    callback: js.Function1[/* repeated */ js.Any, Unit],
    params: js.UndefOr[scala.Nothing],
    scope: js.Any
  ): Tween = js.native
  def call(callback: js.Function1[/* repeated */ js.Any, Unit], params: js.Array[_]): Tween = js.native
  def call(callback: js.Function1[/* repeated */ js.Any, Unit], params: js.Array[_], scope: js.Any): Tween = js.native
  
  def label(name: String): Tween = js.native
  
  var passive: Boolean = js.native
  
  def pause(): Tween = js.native
  def pause(tween: Tween): Tween = js.native
  
  def play(): Tween = js.native
  def play(tween: Tween): Tween = js.native
  
  var pluginData: js.Any = js.native
  
  def set(props: js.Any): Tween = js.native
  def set(props: js.Any, target: js.Any): Tween = js.native
  
  // properties
  var target: js.Any = js.native
  
  def to(props: js.Any): Tween = js.native
  def to(props: js.Any, duration: js.UndefOr[scala.Nothing], ease: js.Function): Tween = js.native
  def to(props: js.Any, duration: Double): Tween = js.native
  def to(props: js.Any, duration: Double, ease: js.Function): Tween = js.native
  
  def wait(duration: Double): Tween = js.native
  def wait(duration: Double, passive: Boolean): Tween = js.native
}
