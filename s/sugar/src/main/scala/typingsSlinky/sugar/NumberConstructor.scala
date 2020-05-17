package typingsSlinky.sugar

import typingsSlinky.sugar.sugarjs.NativeConstructor
import typingsSlinky.sugar.sugarjs.Range
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NumberConstructor extends NativeConstructor {
  def random(): Double = js.native
  def random(n1: Double): Double = js.native
  def random(n1: Double, n2: Double): Double = js.native
  def range(): Range = js.native
  def range(start: Double): Range = js.native
  def range(start: Double, end: Double): Range = js.native
}

