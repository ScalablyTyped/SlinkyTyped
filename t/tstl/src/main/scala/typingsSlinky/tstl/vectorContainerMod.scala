package typingsSlinky.tstl

import typingsSlinky.tstl.arrayContainerMod.ArrayContainer
import typingsSlinky.tstl.arrayIteratorBaseMod.ArrayIteratorBase
import typingsSlinky.tstl.arrayReverseIteratorBaseMod.ArrayReverseIteratorBase
import typingsSlinky.tstl.icontainerMod.IContainer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("tstl/internal/container/linear/VectorContainer", JSImport.Namespace)
@js.native
object vectorContainerMod extends js.Object {
  
  @js.native
  /**
    * Default Constructor.
    */
  abstract class VectorContainer[T, SourceT /* <: IContainer[T, SourceT, IteratorT, ReverseT, T] */, ArrayT /* <: VectorContainer[T, SourceT, ArrayT, IteratorT, ReverseT] */, IteratorT /* <: ArrayIteratorBase[T, SourceT, ArrayT, IteratorT, ReverseT, T] */, ReverseT /* <: ArrayReverseIteratorBase[T, SourceT, ArrayT, IteratorT, ReverseT, T] */] protected () extends ArrayContainer[T, SourceT, ArrayT, IteratorT, ReverseT, T] {
    
    /**
      * @inheritDoc
      */
    def assign(n: Double, `val`: T): Unit = js.native
    
    /**
      * Access data.
      *
      * @return An array capsuled by this {@link Vector}.
      */
    def data(): js.Array[T] = js.native
    
    var data_ : js.Array[T] = js.native
  }
}
