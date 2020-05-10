package typingsSlinky.tstl

import typingsSlinky.tstl.iemptyMod.IEmpty
import typingsSlinky.tstl.ipushMod.IPush
import typingsSlinky.tstl.isizeMod.ISize
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/internal/container/linear/AdaptorContainer", JSImport.Namespace)
@js.native
object adaptorContainerMod extends js.Object {
  @js.native
  abstract class AdaptorContainer[T, Source /* <: IEmpty with ISize with IPush[T] */, This /* <: AdaptorContainer[T, Source, This] */] protected ()
    extends IEmpty
       with ISize
       with IPush[T] {
    protected def this(source: Source) = this()
    var source_ : Source = js.native
    /**
      * Remove element.
      */
    def pop(): Unit = js.native
    /**
      * Swap elements.
      *
      * @param obj Target container to swap.
      */
    def swap(obj: This): Unit = js.native
  }
  
}

