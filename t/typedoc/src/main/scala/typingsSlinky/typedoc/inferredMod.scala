package typingsSlinky.typedoc

import typingsSlinky.typedoc.componentsMod.TypeNodeConverter
import typingsSlinky.typedoc.contextMod.Context
import typingsSlinky.typescript.mod.InferTypeNode
import typingsSlinky.typescript.mod.Type
import typingsSlinky.typescript.mod.TypeNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typedoc/dist/lib/converter/types/inferred", JSImport.Namespace)
@js.native
object inferredMod extends js.Object {
  
  @js.native
  class InferredConverter () extends TypeNodeConverter[Type, InferTypeNode] {
    
    def supportsNode(_context: Context, node: TypeNode): Boolean = js.native
  }
}
