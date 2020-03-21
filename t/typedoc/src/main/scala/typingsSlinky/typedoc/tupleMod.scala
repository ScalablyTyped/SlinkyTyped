package typingsSlinky.typedoc

import typingsSlinky.typedoc.componentsMod.TypeTypeConverter
import typingsSlinky.typedoc.contextMod.Context
import typingsSlinky.typedoc.modelsTypesMod.TupleType
import typingsSlinky.typedoc.typesAbstractMod.Type
import typingsSlinky.typescript.mod.TupleTypeNode
import typingsSlinky.typescript.mod.TypeReference
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/converter/types/tuple", JSImport.Namespace)
@js.native
object tupleMod extends js.Object {
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - typingsSlinky.typedoc.componentMod.ComponentHost because Already inherited
  - typingsSlinky.typedoc.utilsEventsMod.EventDispatcher because Already inherited
  - typingsSlinky.typedoc.componentMod.AbstractComponent because Already inherited
  - typingsSlinky.typedoc.componentsMod.ConverterTypeComponent because Already inherited
  - typingsSlinky.typedoc.componentsMod.TypeNodeConverter because var conflicts: _componentOptions, _componentOwner, _events, _listeners, _listeningTo, _savedListenId, application, componentName, internalOn, priority. Inlined supportsNode, supportsNode, convertNode, convertNode */ @js.native
  class TupleConverter () extends TypeTypeConverter[TypeReference] {
    def convertNode(context: Context, node: TupleTypeNode): js.UndefOr[Type] = js.native
    def convertNode(context: Context, node: TupleTypeNode, `type`: TypeReference): js.UndefOr[Type] = js.native
    @JSName("convertNode")
    def convertNode_TupleType(context: Context, node: TupleTypeNode): TupleType = js.native
    def supportsNode(context: Context, node: TupleTypeNode): Boolean = js.native
    def supportsNode(context: Context, node: TupleTypeNode, `type`: TypeReference): Boolean = js.native
  }
  
}

