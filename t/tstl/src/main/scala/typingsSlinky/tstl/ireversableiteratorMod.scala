package typingsSlinky.tstl

import typingsSlinky.tstl.ibidirectionaliteratorMod.IBidirectionalIterator
import typingsSlinky.tstl.ireverseiteratorMod.IReverseIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("tstl/iterator/IReversableIterator", JSImport.Namespace)
@js.native
object ireversableiteratorMod extends js.Object {
  
  @js.native
  trait IReversableIterator[T, IteratorT /* <: IReversableIterator[T, IteratorT, ReverseT] */, ReverseT /* <: IReverseIterator[T, IteratorT, ReverseT] */] extends IBidirectionalIterator[T, IteratorT] {
    
    /**
      * Construct reverse iterator.
      *
      * @return The reverse iterator.
      */
    def reverse(): ReverseT = js.native
  }
}
