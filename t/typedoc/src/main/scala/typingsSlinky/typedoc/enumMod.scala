package typingsSlinky.typedoc

import typingsSlinky.typedoc.componentsMod.ConverterNodeComponent
import typingsSlinky.typedoc.converterConverterMod.Converter
import typingsSlinky.typescript.mod.EnumDeclaration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object enumMod {
  
  @JSImport("typedoc/dist/lib/converter/nodes/enum", "EnumConverter")
  @js.native
  class EnumConverter protected () extends ConverterNodeComponent[EnumDeclaration] {
    def this(owner: js.Symbol) = this()
    def this(owner: Converter) = this()
    
    var convertMember: js.Any = js.native
  }
}
