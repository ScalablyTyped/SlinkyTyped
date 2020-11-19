package typingsSlinky.tstl

import typingsSlinky.tstl.comparatorMod.Comparator
import typingsSlinky.tstl.mapElementListMod.MapElementList.Iterator
import typingsSlinky.tstl.mapElementListMod.MapElementList.ReverseIterator
import typingsSlinky.tstl.mapTreeMod.MapTree
import typingsSlinky.tstl.tstlBooleans.`true`
import typingsSlinky.tstl.uniqueTreeMapMod.UniqueTreeMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("tstl/internal/tree/UniqueMapTree", JSImport.Namespace)
@js.native
object uniqueMapTreeMod extends js.Object {
  
  @js.native
  class UniqueMapTree[Key, T, Source /* <: UniqueTreeMap[
    Key, 
    T, 
    Source, 
    Iterator[Key, T, `true`, Source], 
    ReverseIterator[Key, T, `true`, Source]
  ] */] protected () extends MapTree[Key, T, `true`, Source] {
    def this(source: Source, comp: Comparator[Key, Key]) = this()
  }
}
