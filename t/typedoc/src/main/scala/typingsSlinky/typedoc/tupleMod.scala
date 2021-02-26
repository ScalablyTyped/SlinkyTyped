package typingsSlinky.typedoc

import typingsSlinky.typedoc.componentsMod.TypeConverter
import typingsSlinky.typedoc.componentsMod.TypeNodeConverter
import typingsSlinky.typedoc.contextMod.Context
import typingsSlinky.typedoc.converterConverterMod.Converter
import typingsSlinky.typescript.mod.NamedTupleMember
import typingsSlinky.typescript.mod.Node
import typingsSlinky.typescript.mod.TupleTypeNode
import typingsSlinky.typescript.mod.Type
import typingsSlinky.typescript.mod.TypeReference
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tupleMod {
  
  @JSImport("typedoc/dist/lib/converter/types/tuple", "NamedTupleMemberConverter")
  @js.native
  class NamedTupleMemberConverter protected () extends TypeNodeConverter[Type, NamedTupleMember] {
    def this(owner: js.Symbol) = this()
    def this(owner: Converter) = this()
    
    def supportsNode(_context: Context, node: Node): Boolean = js.native
  }
  
  @JSImport("typedoc/dist/lib/converter/types/tuple", "TupleConverter")
  @js.native
  class TupleConverter protected () extends TypeConverter[TypeReference, TupleTypeNode] {
    def this(owner: js.Symbol) = this()
    def this(owner: Converter) = this()
  }
}
