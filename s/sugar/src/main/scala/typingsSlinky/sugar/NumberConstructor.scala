package typingsSlinky.sugar

import typingsSlinky.sugar.sugarjs.Range
import typingsSlinky.sugar.sugarjs._NativeConstructor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NumberConstructor extends _NativeConstructor {
  
  def random(): Double = js.native
  def random(n1: js.UndefOr[scala.Nothing], n2: Double): Double = js.native
  def random(n1: Double): Double = js.native
  def random(n1: Double, n2: Double): Double = js.native
  
  def range(): Range = js.native
  def range(start: js.UndefOr[scala.Nothing], end: Double): Range = js.native
  def range(start: Double): Range = js.native
  def range(start: Double, end: Double): Range = js.native
}
