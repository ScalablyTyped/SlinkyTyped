package typingsSlinky.typedoc

import typingsSlinky.typedoc.componentsMod.TypeNodeConverter
import typingsSlinky.typescript.mod.Type
import typingsSlinky.typescript.mod.TypeReferenceNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typedoc/dist/lib/converter/types/alias", JSImport.Namespace)
@js.native
object typesAliasMod extends js.Object {
  
  @js.native
  class AliasConverter () extends TypeNodeConverter[Type, TypeReferenceNode]
}
