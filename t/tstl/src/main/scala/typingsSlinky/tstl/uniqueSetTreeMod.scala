package typingsSlinky.tstl

import typingsSlinky.tstl.comparatorMod.Comparator
import typingsSlinky.tstl.setElementListMod.SetElementList.Iterator
import typingsSlinky.tstl.setElementListMod.SetElementList.ReverseIterator
import typingsSlinky.tstl.setTreeMod.SetTree
import typingsSlinky.tstl.tstlBooleans.`true`
import typingsSlinky.tstl.uniqueTreeSetMod.UniqueTreeSet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("tstl/internal/tree/UniqueSetTree", JSImport.Namespace)
@js.native
object uniqueSetTreeMod extends js.Object {
  
  @js.native
  class UniqueSetTree[Key, Source /* <: UniqueTreeSet[Key, Source, Iterator[Key, `true`, Source], ReverseIterator[Key, `true`, Source]] */] protected () extends SetTree[Key, `true`, Source] {
    def this(source: Source, comp: Comparator[Key, Key]) = this()
  }
}
