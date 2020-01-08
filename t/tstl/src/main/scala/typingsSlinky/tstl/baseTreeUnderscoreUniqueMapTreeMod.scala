package typingsSlinky.tstl

import typingsSlinky.tstl.baseContainerMapElementListMod.MapElementList.Iterator
import typingsSlinky.tstl.baseContainerMapElementListMod.MapElementList.ReverseIterator
import typingsSlinky.tstl.baseContainerUniqueMapMod.UniqueMap
import typingsSlinky.tstl.baseTreeUnderscoreMapTreeMod._MapTree
import typingsSlinky.tstl.tstlBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/base/tree/_UniqueMapTree", JSImport.Namespace)
@js.native
object baseTreeUnderscoreUniqueMapTreeMod extends js.Object {
  @js.native
  class _UniqueMapTree[Key, T, Source /* <: UniqueMap[
    Key, 
    T, 
    Source, 
    Iterator[Key, T, `true`, Source], 
    ReverseIterator[Key, T, `true`, Source]
  ] */] protected () extends _MapTree[Key, T, `true`, Source] {
    def this(source: Source, comp: js.Function2[/* x */ Key, /* y */ Key, Boolean]) = this()
  }
  
}

