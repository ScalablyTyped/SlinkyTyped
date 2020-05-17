package typingsSlinky.tstl.backInsertIteratorMod

import typingsSlinky.tstl.backInsertIteratorMod.BackInsertIterator.ValueType
import typingsSlinky.tstl.insertIteratorBaseMod.InsertIteratorBase
import typingsSlinky.tstl.ipushbackMod.IPushBack
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/iterator/BackInsertIterator", "BackInsertIterator")
@js.native
class BackInsertIterator_[Source /* <: IPushBack[ValueType[Source]] */] protected () extends InsertIteratorBase[ValueType[Source], BackInsertIterator[Source]] {
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
  def value_MBackInsertIterator_(`val`: ValueType[Source]): js.Any = js.native
}

