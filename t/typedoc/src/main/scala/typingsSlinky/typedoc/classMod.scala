package typingsSlinky.typedoc

import typingsSlinky.typedoc.componentsMod.ConverterNodeComponent
import typingsSlinky.typescript.mod.ClassDeclaration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typedoc/dist/lib/converter/nodes/class", JSImport.Namespace)
@js.native
object classMod extends js.Object {
  
  @js.native
  class ClassConverter () extends ConverterNodeComponent[ClassDeclaration]
}
