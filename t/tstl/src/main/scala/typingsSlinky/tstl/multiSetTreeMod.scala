package typingsSlinky.tstl

import typingsSlinky.tstl.comparatorMod.Comparator
import typingsSlinky.tstl.multiTreeSetMod.MultiTreeSet
import typingsSlinky.tstl.setElementListMod.SetElementList.Iterator
import typingsSlinky.tstl.setElementListMod.SetElementList.ReverseIterator
import typingsSlinky.tstl.setTreeMod.SetTree
import typingsSlinky.tstl.tstlBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("tstl/internal/tree/MultiSetTree", JSImport.Namespace)
@js.native
object multiSetTreeMod extends js.Object {
  
  @js.native
  class MultiSetTree[Key, Source /* <: MultiTreeSet[Key, Source, Iterator[Key, `false`, Source], ReverseIterator[Key, `false`, Source]] */] protected () extends SetTree[Key, `false`, Source] {
    def this(source: Source, comp: Comparator[Key, Key]) = this()
    
    var _Nearest_by_key: js.Any = js.native
    
    @JSName("insert")
    def insert_false(`val`: Iterator[Key, `false`, Source]): Unit = js.native
  }
}
