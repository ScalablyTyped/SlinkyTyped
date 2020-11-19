package typingsSlinky.tstl

import typingsSlinky.tstl.ibidirectionaliteratorMod.IBidirectionalIterator
import typingsSlinky.tstl.ireversableiteratorMod.IReversableIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("tstl/iterator/IReverseIterator", JSImport.Namespace)
@js.native
object ireverseiteratorMod extends js.Object {
  
  @js.native
  trait IReverseIterator[T, Base /* <: IReversableIterator[T, Base, This] */, This /* <: IReverseIterator[T, Base, This] */] extends IBidirectionalIterator[T, This] {
    
    /**
      * Get base iterator.
      *
      * @return The base iterator.
      */
    def base(): Base = js.native
  }
}
