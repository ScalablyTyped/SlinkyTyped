package typingsSlinky.typedoc

import typingsSlinky.typedoc.componentsMod.TypeNodeConverter
import typingsSlinky.typedoc.contextMod.Context
import typingsSlinky.typescript.mod.ParenthesizedTypeNode
import typingsSlinky.typescript.mod.Type
import typingsSlinky.typescript.mod.TypeNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typedoc/dist/lib/converter/types/parens", JSImport.Namespace)
@js.native
object parensMod extends js.Object {
  
  @js.native
  class ParensConverter () extends TypeNodeConverter[Type, ParenthesizedTypeNode] {
    
    def supportsNode(_context: Context, node: TypeNode): Boolean = js.native
  }
}
