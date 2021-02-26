package typingsSlinky.typedoc

import typingsSlinky.typedoc.componentsMod.TypeNodeConverter
import typingsSlinky.typedoc.contextMod.Context
import typingsSlinky.typedoc.converterConverterMod.Converter
import typingsSlinky.typescript.mod.InferTypeNode
import typingsSlinky.typescript.mod.Type
import typingsSlinky.typescript.mod.TypeNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object inferredMod {
  
  @JSImport("typedoc/dist/lib/converter/types/inferred", "InferredConverter")
  @js.native
  class InferredConverter protected () extends TypeNodeConverter[Type, InferTypeNode] {
    def this(owner: js.Symbol) = this()
    def this(owner: Converter) = this()
    
    def supportsNode(_context: Context, node: TypeNode): Boolean = js.native
  }
}
