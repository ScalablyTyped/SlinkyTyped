package typingsSlinky.tstl

import typingsSlinky.tstl.comparatorMod.Comparator
import typingsSlinky.tstl.mapElementListMod.MapElementList.Iterator
import typingsSlinky.tstl.mapElementListMod.MapElementList.ReverseIterator
import typingsSlinky.tstl.mapTreeMod.MapTree
import typingsSlinky.tstl.multiTreeMapMod.MultiTreeMap
import typingsSlinky.tstl.tstlBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/internal/tree/MultiMapTree", JSImport.Namespace)
@js.native
object multiMapTreeMod extends js.Object {
  @js.native
  class MultiMapTree[Key, T, Source /* <: MultiTreeMap[
    Key, 
    T, 
    Source, 
    Iterator[Key, T, `false`, Source], 
    ReverseIterator[Key, T, `false`, Source]
  ] */] protected () extends MapTree[Key, T, `false`, Source] {
    def this(source: Source, comp: Comparator[Key, Key]) = this()
    var _Nearest_by_key: js.Any = js.native
    @JSName("insert")
    def insert_false(`val`: Iterator[Key, T, `false`, Source]): Unit = js.native
  }
  
}

