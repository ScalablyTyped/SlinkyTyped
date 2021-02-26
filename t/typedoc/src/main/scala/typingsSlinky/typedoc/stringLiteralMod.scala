package typingsSlinky.typedoc

import typingsSlinky.typedoc.componentsMod.TypeConverter
import typingsSlinky.typedoc.converterConverterMod.Converter
import typingsSlinky.typescript.mod.LiteralType
import typingsSlinky.typescript.mod.StringLiteral
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stringLiteralMod {
  
  @JSImport("typedoc/dist/lib/converter/types/string-literal", "StringLiteralConverter")
  @js.native
  class StringLiteralConverter protected () extends TypeConverter[LiteralType, StringLiteral] {
    def this(owner: js.Symbol) = this()
    def this(owner: Converter) = this()
  }
}
