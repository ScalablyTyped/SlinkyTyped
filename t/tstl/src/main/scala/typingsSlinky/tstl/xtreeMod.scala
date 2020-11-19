package typingsSlinky.tstl

import typingsSlinky.tstl.comparatorMod.Comparator
import typingsSlinky.tstl.xtreenodeMod.XTreeNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("tstl/internal/tree/XTree", JSImport.Namespace)
@js.native
object xtreeMod extends js.Object {
  
  @js.native
  abstract class XTree[T] protected () extends js.Object {
    protected def this(comp: Comparator[T, T]) = this()
    
    var _Erase_case1: js.Any = js.native
    
    var _Erase_case2: js.Any = js.native
    
    var _Erase_case3: js.Any = js.native
    
    var _Erase_case4: js.Any = js.native
    
    var _Erase_case5: js.Any = js.native
    
    var _Erase_case6: js.Any = js.native
    
    var _Fetch_color: js.Any = js.native
    
    var _Fetch_maximum: js.Any = js.native
    
    var _Insert_case1: js.Any = js.native
    
    var _Insert_case2: js.Any = js.native
    
    var _Insert_case3: js.Any = js.native
    
    var _Insert_case4: js.Any = js.native
    
    var _Insert_case5: js.Any = js.native
    
    var _Replace_node: js.Any = js.native
    
    var _Rotate_left: js.Any = js.native
    
    var _Rotate_right: js.Any = js.native
    
    def clear(): Unit = js.native
    
    var comp_ : js.Any = js.native
    
    var equal_ : js.Any = js.native
    
    def erase(`val`: T): Unit = js.native
    
    def get(`val`: T): XTreeNode[T] | Null = js.native
    
    def insert(`val`: T): Unit = js.native
    
    def nearest(`val`: T): XTreeNode[T] | Null = js.native
    
    def root(): XTreeNode[T] | Null = js.native
    
    var root_ : XTreeNode[T] | Null = js.native
  }
}
