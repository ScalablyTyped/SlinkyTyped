package typingsSlinky.typedoc

import typingsSlinky.typedoc.anon.TypealiasSymbolSymbol
import typingsSlinky.typedoc.componentsMod.TypeTypeConverter
import typingsSlinky.typedoc.contextMod.Context
import typingsSlinky.typedoc.modelsMod.ReferenceType
import typingsSlinky.typescript.mod.Type
import typingsSlinky.typescript.mod.TypeReferenceNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typedoc/dist/lib/converter/types/alias", JSImport.Namespace)
@js.native
object typesAliasMod extends js.Object {
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typingsSlinky.typedoc.componentMod.ComponentHost because Already inherited
  - typingsSlinky.typedoc.utilsEventsMod.EventDispatcher because Already inherited
  - typingsSlinky.typedoc.componentMod.AbstractComponent because Already inherited
  - typingsSlinky.typedoc.componentsMod.ConverterTypeComponent because Already inherited
  - typingsSlinky.typedoc.componentsMod.TypeNodeConverter because var conflicts: _componentOptions, _componentOwner, _events, _listeners, _listeningTo, _savedListenId, application, componentName, internalOn, priority. Inlined supportsNode, supportsNode, convertNode, convertNode */ @js.native
  class AliasConverter () extends TypeTypeConverter[Type] {
    
    def convertNode(context: Context, node: TypeReferenceNode): ReferenceType = js.native
    def convertNode(context: Context, node: TypeReferenceNode, `type`: Type): js.UndefOr[typingsSlinky.typedoc.typesAbstractMod.Type] = js.native
    @JSName("convertNode")
    def convertNode_Union(context: Context, node: TypeReferenceNode): js.UndefOr[typingsSlinky.typedoc.typesAbstractMod.Type] = js.native
    
    def convertType(context: Context, `type`: TypealiasSymbolSymbol): ReferenceType = js.native
    
    def supportsNode(context: Context, node: TypeReferenceNode): Boolean = js.native
    def supportsNode(context: Context, node: TypeReferenceNode, `type`: Type): Boolean = js.native
  }
}
