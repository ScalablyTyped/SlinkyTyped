package typingsSlinky.typedoc

import typingsSlinky.typedoc.componentsMod.TypeNodeConverter
import typingsSlinky.typedoc.contextMod.Context
import typingsSlinky.typedoc.converterConverterMod.Converter
import typingsSlinky.typescript.mod.ParenthesizedTypeNode
import typingsSlinky.typescript.mod.Type
import typingsSlinky.typescript.mod.TypeNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object parensMod {
  
  @JSImport("typedoc/dist/lib/converter/types/parens", "ParensConverter")
  @js.native
  class ParensConverter protected () extends TypeNodeConverter[Type, ParenthesizedTypeNode] {
    def this(owner: js.Symbol) = this()
    def this(owner: Converter) = this()
    
    def supportsNode(_context: Context, node: TypeNode): Boolean = js.native
  }
}
