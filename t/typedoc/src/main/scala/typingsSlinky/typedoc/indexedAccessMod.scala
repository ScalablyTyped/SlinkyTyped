package typingsSlinky.typedoc

import typingsSlinky.typedoc.componentsMod.TypeNodeConverter
import typingsSlinky.typedoc.contextMod.Context
import typingsSlinky.typescript.mod.IndexedAccessTypeNode
import typingsSlinky.typescript.mod.Type
import typingsSlinky.typescript.mod.TypeNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typedoc/dist/lib/converter/types/indexed-access", JSImport.Namespace)
@js.native
object indexedAccessMod extends js.Object {
  
  @js.native
  class IndexedAccessConverter () extends TypeNodeConverter[Type, IndexedAccessTypeNode] {
    
    def supportsNode(context: Context, node: TypeNode): Boolean = js.native
  }
}
