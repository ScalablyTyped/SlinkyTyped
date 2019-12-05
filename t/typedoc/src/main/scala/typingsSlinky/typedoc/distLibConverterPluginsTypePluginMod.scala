package typingsSlinky.typedoc

import typingsSlinky.typedoc.distLibConverterConverterMod.Converter
import typingsSlinky.typedoc.distLibModelsReflectionsMod.DeclarationReflection
import typingsSlinky.typedoc.distLibUtilsComponentMod.AbstractComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/converter/plugins/TypePlugin", JSImport.Namespace)
@js.native
object distLibConverterPluginsTypePluginMod extends js.Object {
  @js.native
  class TypePlugin () extends AbstractComponent[Converter] {
    var onResolve: js.Any = js.native
    var onResolveEnd: js.Any = js.native
    var postpone: js.Any = js.native
    var reflections: js.Array[DeclarationReflection] = js.native
  }
  
}

