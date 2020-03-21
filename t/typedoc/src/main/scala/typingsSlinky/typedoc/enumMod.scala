package typingsSlinky.typedoc

import typingsSlinky.typedoc.componentsMod.ConverterNodeComponent
import typingsSlinky.typescript.mod.EnumDeclaration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/converter/nodes/enum", JSImport.Namespace)
@js.native
object enumMod extends js.Object {
  @js.native
  class EnumConverter () extends ConverterNodeComponent[EnumDeclaration] {
    var convertMember: js.Any = js.native
  }
  
}

