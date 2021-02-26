package typingsSlinky.typedoc

import typingsSlinky.typedoc.componentsMod.TypeNodeConverter
import typingsSlinky.typedoc.contextMod.Context
import typingsSlinky.typedoc.converterConverterMod.Converter
import typingsSlinky.typescript.mod.IndexedAccessTypeNode
import typingsSlinky.typescript.mod.Type
import typingsSlinky.typescript.mod.TypeNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object indexedAccessMod {
  
  @JSImport("typedoc/dist/lib/converter/types/indexed-access", "IndexedAccessConverter")
  @js.native
  class IndexedAccessConverter protected () extends TypeNodeConverter[Type, IndexedAccessTypeNode] {
    def this(owner: js.Symbol) = this()
    def this(owner: Converter) = this()
    
    def supportsNode(context: Context, node: TypeNode): Boolean = js.native
  }
}
