package typingsSlinky.typedoc

import typingsSlinky.typedoc.componentsMod.ConverterNodeComponent
import typingsSlinky.typescript.mod.ModuleDeclaration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typedoc/dist/lib/converter/nodes/module", JSImport.Namespace)
@js.native
object moduleMod extends js.Object {
  
  @js.native
  class ModuleConverter () extends ConverterNodeComponent[ModuleDeclaration]
}
