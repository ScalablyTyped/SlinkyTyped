package typingsSlinky.uifabricUtilities.createRefMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RefObject[T] extends IRefObject[T] {
  var current: T | Null = js.native
  def apply(): Unit = js.native
  def apply(component: T): Unit = js.native
}

