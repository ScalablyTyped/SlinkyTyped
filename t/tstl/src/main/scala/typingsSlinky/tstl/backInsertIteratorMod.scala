package typingsSlinky.tstl

import typingsSlinky.tstl.backInsertIteratorMod.BackInsertIterator.ValueType
import typingsSlinky.tstl.insertIteratorBaseMod.InsertIteratorBase
import typingsSlinky.tstl.ipushbackMod.IPushBack
import typingsSlinky.tstl.vectorMod.Vector
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/iterator/BackInsertIterator", JSImport.Namespace)
@js.native
object backInsertIteratorMod extends js.Object {
  @js.native
  class BackInsertIterator[Source /* <: IPushBack[ValueType[Source]] */] protected () extends InsertIteratorBase[ValueType[Source], BackInsertIterator[Source]] {
    /**
      * Initializer Constructor.
      *
      * @param source The source container.
      */
    def this(source: Source) = this()
    var source_ : js.Any = js.native
    /**
      * @inheritDoc
      */
    @JSName("value")
    def value_MBackInsertIterator(`val`: ValueType[Source]): js.Any = js.native
  }
  
  @js.native
  object BackInsertIterator extends js.Object {
    type SourceType[Source /* <: js.Array[_] | IPushBack[_] */] = Source | Vector[js.Any]
    type ValueType[Source /* <: IPushBack[_] */] = js.Any
  }
  
}

