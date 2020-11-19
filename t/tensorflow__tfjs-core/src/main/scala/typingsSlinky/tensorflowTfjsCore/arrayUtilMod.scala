package typingsSlinky.tensorflowTfjsCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs-core/dist/backends/array_util", JSImport.Namespace)
@js.native
object arrayUtilMod extends js.Object {
  
  def binaryInsert[T](arr: js.Array[T], element: T): Unit = js.native
  def binaryInsert[T](arr: js.Array[T], element: T, comparator: js.Function2[/* a */ T, /* b */ T, Double]): Unit = js.native
  
  def binarySearch[T](arr: js.Array[T], target: T): Double = js.native
  def binarySearch[T](arr: js.Array[T], target: T, comparator: js.Function2[/* a */ T, /* b */ T, Double]): Double = js.native
}
