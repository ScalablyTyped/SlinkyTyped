package typingsSlinky.typedoc

import typingsSlinky.typedoc.componentsMod.ConverterNodeComponent
import typingsSlinky.typedoc.converterConverterMod.Converter
import typingsSlinky.typescript.mod.TypeAliasDeclaration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object aliasMod {
  
  @JSImport("typedoc/dist/lib/converter/nodes/alias", "AliasConverter")
  @js.native
  class AliasConverter protected () extends ConverterNodeComponent[TypeAliasDeclaration] {
    def this(owner: js.Symbol) = this()
    def this(owner: Converter) = this()
  }
}
