package typingsSlinky.typedoc

import typingsSlinky.typedoc.anon.TypealiasSymbolSymbol
import typingsSlinky.typedoc.componentsMod.TypeConverter
import typingsSlinky.typedoc.contextMod.Context
import typingsSlinky.typedoc.converterConverterMod.Converter
import typingsSlinky.typedoc.modelsMod.ReferenceType
import typingsSlinky.typescript.mod.Type
import typingsSlinky.typescript.mod.TypeReferenceNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesAliasMod {
  
  @JSImport("typedoc/dist/lib/converter/types/alias", "AliasConverter")
  @js.native
  class AliasConverter protected () extends TypeConverter[Type, TypeReferenceNode] {
    def this(owner: js.Symbol) = this()
    def this(owner: Converter) = this()
    
    def convertType(context: Context, `type`: TypealiasSymbolSymbol): ReferenceType = js.native
  }
}
