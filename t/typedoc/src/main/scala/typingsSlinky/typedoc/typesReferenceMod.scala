package typingsSlinky.typedoc

import typingsSlinky.typedoc.componentsMod.TypeNodeConverter
import typingsSlinky.typedoc.contextMod.Context
import typingsSlinky.typedoc.converterConverterMod.Converter
import typingsSlinky.typedoc.modelsTypesMod.Type
import typingsSlinky.typescript.mod.TypeReference
import typingsSlinky.typescript.mod.TypeReferenceNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesReferenceMod {
  
  @JSImport("typedoc/dist/lib/converter/types/reference", "ReferenceConverter")
  @js.native
  class ReferenceConverter protected () extends TypeNodeConverter[TypeReference, TypeReferenceNode] {
    def this(owner: js.Symbol) = this()
    def this(owner: Converter) = this()
    
    var convertLiteral: js.Any = js.native
    
    def convertType(context: Context, `type`: TypeReference): js.UndefOr[Type] = js.native
    
    def supportsType(context: Context, `type`: TypeReference): Boolean = js.native
  }
}
