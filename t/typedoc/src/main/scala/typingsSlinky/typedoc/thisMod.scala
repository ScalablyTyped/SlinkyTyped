package typingsSlinky.typedoc

import typingsSlinky.typedoc.componentsMod.TypeNodeConverter
import typingsSlinky.typescript.mod.ThisTypeNode
import typingsSlinky.typescript.mod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/converter/types/this", JSImport.Namespace)
@js.native
object thisMod extends js.Object {
  @js.native
  class ThisConverter () extends TypeNodeConverter[Type, ThisTypeNode]
  
}

