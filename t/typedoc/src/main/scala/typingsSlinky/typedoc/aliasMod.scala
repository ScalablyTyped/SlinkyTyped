package typingsSlinky.typedoc

import typingsSlinky.typedoc.componentsMod.ConverterNodeComponent
import typingsSlinky.typescript.mod.TypeAliasDeclaration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typedoc/dist/lib/converter/nodes/alias", JSImport.Namespace)
@js.native
object aliasMod extends js.Object {
  
  @js.native
  class AliasConverter () extends ConverterNodeComponent[TypeAliasDeclaration]
}
