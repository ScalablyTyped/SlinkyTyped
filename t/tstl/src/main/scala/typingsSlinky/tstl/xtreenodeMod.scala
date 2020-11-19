package typingsSlinky.tstl

import typingsSlinky.tstl.colorMod.Color
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("tstl/internal/tree/XTreeNode", JSImport.Namespace)
@js.native
object xtreenodeMod extends js.Object {
  
  @js.native
  class XTreeNode[T] protected () extends js.Object {
    def this(value: T, color: Color) = this()
    
    var color: Color = js.native
    
    def grand: XTreeNode[T] | Null = js.native
    
    var left: XTreeNode[T] | Null = js.native
    
    var parent: XTreeNode[T] | Null = js.native
    
    var right: XTreeNode[T] | Null = js.native
    
    def sibling: XTreeNode[T] | Null = js.native
    
    def uncle: XTreeNode[T] | Null = js.native
    
    var value: T = js.native
  }
}
