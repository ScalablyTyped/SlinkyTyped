package typingsSlinky.symbolTree

import typingsSlinky.symbolTree.symbolTreeNumbers.`16`
import typingsSlinky.symbolTree.symbolTreeNumbers.`1`
import typingsSlinky.symbolTree.symbolTreeNumbers.`2`
import typingsSlinky.symbolTree.symbolTreeNumbers.`4`
import typingsSlinky.symbolTree.symbolTreeNumbers.`8`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("symbol-tree", JSImport.Namespace)
  @js.native
  /**
    * @param [description='SymbolTree data'] Description used for the Symbol
    *
    *        **Default:** `'SymbolTree data'`
    */
  class ^[T /* <: js.Object */] ()
    extends typingsSlinky.symbolTree.symbolTreeMod.^[T] {
    def this(description: String) = this()
  }
  
  /* static member */
  object TreePosition {
    
    @JSImport("symbol-tree", "TreePosition.CONTAINED_BY")
    @js.native
    val CONTAINED_BY: `16` = js.native
    
    @JSImport("symbol-tree", "TreePosition.CONTAINS")
    @js.native
    val CONTAINS: `8` = js.native
    
    @JSImport("symbol-tree", "TreePosition.DISCONNECTED")
    @js.native
    val DISCONNECTED: `1` = js.native
    
    @JSImport("symbol-tree", "TreePosition.FOLLOWING")
    @js.native
    val FOLLOWING: `4` = js.native
    
    @JSImport("symbol-tree", "TreePosition.PRECEDING")
    @js.native
    val PRECEDING: `2` = js.native
  }
}
