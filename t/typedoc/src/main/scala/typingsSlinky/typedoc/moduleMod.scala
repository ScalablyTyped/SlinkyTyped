package typingsSlinky.typedoc

import typingsSlinky.typedoc.componentsMod.ConverterNodeComponent
import typingsSlinky.typedoc.converterConverterMod.Converter
import typingsSlinky.typescript.mod.ModuleDeclaration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object moduleMod {
  
  @JSImport("typedoc/dist/lib/converter/nodes/module", "ModuleConverter")
  @js.native
  class ModuleConverter protected () extends ConverterNodeComponent[ModuleDeclaration] {
    def this(owner: js.Symbol) = this()
    def this(owner: Converter) = this()
  }
}
