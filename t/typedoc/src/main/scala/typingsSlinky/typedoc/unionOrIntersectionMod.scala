package typingsSlinky.typedoc

import typingsSlinky.typedoc.componentsMod.TypeTypeConverter
import typingsSlinky.typedoc.contextMod.Context
import typingsSlinky.typedoc.modelsTypesMod.IntersectionType
import typingsSlinky.typedoc.modelsTypesMod.UnionType
import typingsSlinky.typedoc.typesAbstractMod.Type
import typingsSlinky.typescript.mod.UnionOrIntersectionType
import typingsSlinky.typescript.mod.UnionOrIntersectionTypeNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typedoc/dist/lib/converter/types/union-or-intersection", JSImport.Namespace)
@js.native
object unionOrIntersectionMod extends js.Object {
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typingsSlinky.typedoc.componentMod.ComponentHost because Already inherited
  - typingsSlinky.typedoc.utilsEventsMod.EventDispatcher because Already inherited
  - typingsSlinky.typedoc.componentMod.AbstractComponent because Already inherited
  - typingsSlinky.typedoc.componentsMod.ConverterTypeComponent because Already inherited
  - typingsSlinky.typedoc.componentsMod.TypeNodeConverter because var conflicts: _componentOptions, _componentOwner, _events, _listeners, _listeningTo, _savedListenId, application, componentName, internalOn, priority. Inlined supportsNode, supportsNode, convertNode, convertNode */ @js.native
  class UnionOrIntersectionConverter () extends TypeTypeConverter[UnionOrIntersectionType] {
    
    def convertNode(context: Context, node: UnionOrIntersectionTypeNode): UnionType | IntersectionType = js.native
    def convertNode(context: Context, node: UnionOrIntersectionTypeNode, `type`: UnionOrIntersectionType): js.UndefOr[Type] = js.native
    
    def supportsNode(context: Context, node: UnionOrIntersectionTypeNode): Boolean = js.native
    def supportsNode(context: Context, node: UnionOrIntersectionTypeNode, `type`: UnionOrIntersectionType): Boolean = js.native
  }
}
