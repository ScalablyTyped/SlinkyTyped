package typingsSlinky.typedoc

import typingsSlinky.typedoc.componentsMod.TypeNodeConverter
import typingsSlinky.typedoc.contextMod.Context
import typingsSlinky.typescript.mod.Node
import typingsSlinky.typescript.mod.Type
import typingsSlinky.typescript.mod.TypeQueryNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typedoc/dist/lib/converter/types/query", JSImport.Namespace)
@js.native
object queryMod extends js.Object {
  
  @js.native
  class QueryConverter () extends TypeNodeConverter[Type, TypeQueryNode] {
    
    def supportsNode(_context: Context, node: Node): Boolean = js.native
  }
}
