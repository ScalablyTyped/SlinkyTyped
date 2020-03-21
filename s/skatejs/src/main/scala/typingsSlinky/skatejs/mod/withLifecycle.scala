package typingsSlinky.skatejs.mod

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.skatejs.typesMod.Constructor
import typingsSlinky.skatejs.typesMod.WithLifecycle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("skatejs", "withLifecycle")
@js.native
object withLifecycle extends js.Object {
  def apply[T /* <: Constructor[HTMLElement] */](): Constructor[WithLifecycle] with T = js.native
  def apply[T /* <: Constructor[HTMLElement] */](Base: T): Constructor[WithLifecycle] with T = js.native
}

