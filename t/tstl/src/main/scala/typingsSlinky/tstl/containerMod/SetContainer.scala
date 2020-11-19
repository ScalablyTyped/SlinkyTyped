package typingsSlinky.tstl.containerMod

import typingsSlinky.tstl.ilinearcontainerbaseMod.ILinearContainerBase
import typingsSlinky.tstl.setContainerMod.SetContainer.Iterator
import typingsSlinky.tstl.setContainerMod.SetContainer.ReverseIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("tstl/base/container", "SetContainer")
@js.native
abstract class SetContainer[Key, Unique /* <: Boolean */, SourceT /* <: typingsSlinky.tstl.setContainerMod.SetContainer[Key, Unique, SourceT, IteratorT, ReverseT] */, IteratorT /* <: Iterator[Key, Unique, SourceT, IteratorT, ReverseT] */, ReverseT /* <: ReverseIterator[Key, Unique, SourceT, IteratorT, ReverseT] */] protected ()
  extends typingsSlinky.tstl.setContainerMod.SetContainer[Key, Unique, SourceT, IteratorT, ReverseT] {
  /**
    * Default Constructor.
    */
  protected def this(factory: js.Function1[
        /* thisArg */ SourceT, 
        ILinearContainerBase[Key, SourceT, IteratorT, ReverseT, Key]
      ]) = this()
}
