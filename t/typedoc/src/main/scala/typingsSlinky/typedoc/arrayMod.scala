package typingsSlinky.typedoc

import typingsSlinky.typedoc.componentsMod.TypeTypeConverter
import typingsSlinky.typedoc.contextMod.Context
import typingsSlinky.typedoc.modelsMod.Type
import typingsSlinky.typescript.mod.ArrayTypeNode
import typingsSlinky.typescript.mod.TypeReference
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typedoc/dist/lib/converter/types/array", JSImport.Namespace)
@js.native
object arrayMod extends js.Object {
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typingsSlinky.typedoc.componentMod.ComponentHost because Already inherited
  - typingsSlinky.typedoc.utilsEventsMod.EventDispatcher because Already inherited
  - typingsSlinky.typedoc.componentMod.AbstractComponent because Already inherited
  - typingsSlinky.typedoc.componentsMod.ConverterTypeComponent because Already inherited
  - typingsSlinky.typedoc.componentsMod.TypeNodeConverter because var conflicts: _componentOptions, _componentOwner, _events, _listeners, _listeningTo, _savedListenId, application, componentName, internalOn, priority. Inlined supportsNode, supportsNode, convertNode, convertNode */ @js.native
  class ArrayConverter () extends TypeTypeConverter[TypeReference] {
    
    def convertNode(context: Context, node: ArrayTypeNode): js.UndefOr[Type] = js.native
    def convertNode(context: Context, node: ArrayTypeNode, `type`: TypeReference): js.UndefOr[typingsSlinky.typedoc.typesAbstractMod.Type] = js.native
    
    def supportsNode(context: Context, node: ArrayTypeNode): Boolean = js.native
    def supportsNode(context: Context, node: ArrayTypeNode, `type`: TypeReference): Boolean = js.native
  }
}
