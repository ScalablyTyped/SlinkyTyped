package typingsSlinky.timsort

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("timsort", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def sort(array: js.Array[_], lo: Double): Unit = js.native
  def sort(array: js.Array[_], lo: Double, hi: Double): Unit = js.native
  def sort[T](array: js.Array[T]): Unit = js.native
  def sort[T](array: js.Array[T], compare: js.UndefOr[scala.Nothing], lo: js.UndefOr[scala.Nothing], hi: Double): Unit = js.native
  def sort[T](array: js.Array[T], compare: js.UndefOr[scala.Nothing], lo: Double): Unit = js.native
  def sort[T](array: js.Array[T], compare: js.UndefOr[scala.Nothing], lo: Double, hi: Double): Unit = js.native
  def sort[T](array: js.Array[T], compare: js.Function2[/* a */ T, /* b */ T, Double]): Unit = js.native
  def sort[T](
    array: js.Array[T],
    compare: js.Function2[/* a */ T, /* b */ T, Double],
    lo: js.UndefOr[scala.Nothing],
    hi: Double
  ): Unit = js.native
  def sort[T](array: js.Array[T], compare: js.Function2[/* a */ T, /* b */ T, Double], lo: Double): Unit = js.native
  def sort[T](array: js.Array[T], compare: js.Function2[/* a */ T, /* b */ T, Double], lo: Double, hi: Double): Unit = js.native
}
