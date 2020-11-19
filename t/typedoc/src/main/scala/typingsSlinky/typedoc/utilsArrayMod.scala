package typingsSlinky.typedoc

import typingsSlinky.typedoc.anon.Priority
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typedoc/dist/lib/utils/array", JSImport.Namespace)
@js.native
object utilsArrayMod extends js.Object {
  
  def binaryFindPartition[T](arr: js.Array[T], partition: js.Function1[/* item */ T, Boolean]): Double = js.native
  
  def insertPrioritySorted[T /* <: Priority */](arr: js.Array[T], item: T): js.Array[T] = js.native
  
  def removeIfPresent[T](arr: js.UndefOr[scala.Nothing], item: T): Unit = js.native
  def removeIfPresent[T](arr: js.Array[T], item: T): Unit = js.native
}
