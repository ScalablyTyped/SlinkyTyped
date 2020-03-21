package typingsSlinky.typedoc

import typingsSlinky.typedoc.componentsMod.TypeTypeConverter
import typingsSlinky.typedoc.contextMod.Context
import typingsSlinky.typedoc.typesAbstractMod.Type
import typingsSlinky.typescript.mod.ConditionalType
import typingsSlinky.typescript.mod.ConditionalTypeNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/converter/types/conditional", JSImport.Namespace)
@js.native
object conditionalMod extends js.Object {
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - typingsSlinky.typedoc.componentMod.ComponentHost because Already inherited
  - typingsSlinky.typedoc.utilsEventsMod.EventDispatcher because Already inherited
  - typingsSlinky.typedoc.componentMod.AbstractComponent because Already inherited
  - typingsSlinky.typedoc.componentsMod.ConverterTypeComponent because Already inherited
  - typingsSlinky.typedoc.componentsMod.TypeNodeConverter because var conflicts: _componentOptions, _componentOwner, _events, _listeners, _listeningTo, _savedListenId, application, componentName, internalOn, priority. Inlined supportsNode, supportsNode, convertNode, convertNode */ @js.native
  class ConditionalConverter () extends TypeTypeConverter[ConditionalType] {
    def convertNode(context: Context, node: ConditionalTypeNode): js.UndefOr[typingsSlinky.typedoc.modelsTypesMod.ConditionalType] = js.native
    def convertNode(context: Context, node: ConditionalTypeNode, `type`: ConditionalType): js.UndefOr[Type] = js.native
    def supportsNode(context: Context, node: ConditionalTypeNode): Boolean = js.native
    def supportsNode(context: Context, node: ConditionalTypeNode, `type`: ConditionalType): Boolean = js.native
  }
  
}

