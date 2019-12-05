package typingsSlinky.typedoc

import typingsSlinky.typedoc.distLibConverterComponentsMod.TypeTypeConverter
import typingsSlinky.typedoc.distLibConverterContextMod.Context
import typingsSlinky.typedoc.distLibModelsTypesAbstractMod.Type
import typingsSlinky.typedoc.distLibModelsTypesMod.IntersectionType
import typingsSlinky.typedoc.distLibModelsTypesMod.UnionType
import typingsSlinky.typescript.typescriptMod.UnionOrIntersectionType
import typingsSlinky.typescript.typescriptMod.UnionOrIntersectionTypeNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/converter/types/union-or-intersection", JSImport.Namespace)
@js.native
object distLibConverterTypesUnionDashOrDashIntersectionMod extends js.Object {
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - typings.typedoc.distLibUtilsComponentMod.ComponentHost because Already inherited
  - typings.typedoc.distLibUtilsEventsMod.EventDispatcher because Already inherited
  - typings.typedoc.distLibUtilsComponentMod.AbstractComponent because Already inherited
  - typings.typedoc.distLibConverterComponentsMod.ConverterTypeComponent because Already inherited
  - typings.typedoc.distLibConverterComponentsMod.TypeNodeConverter because var conflicts: _componentOptions, _componentOwner, _events, _listeners, _listeningTo, _savedListenId, application, componentName, internalOn, priority. Inlined supportsNode, supportsNode, convertNode, convertNode */ @js.native
  class UnionOrIntersectionConverter () extends TypeTypeConverter[UnionOrIntersectionType] {
    def convertNode(context: Context, node: UnionOrIntersectionTypeNode): UnionType | IntersectionType = js.native
    def convertNode(context: Context, node: UnionOrIntersectionTypeNode, `type`: UnionOrIntersectionType): js.UndefOr[Type] = js.native
    def supportsNode(context: Context, node: UnionOrIntersectionTypeNode): Boolean = js.native
    def supportsNode(context: Context, node: UnionOrIntersectionTypeNode, `type`: UnionOrIntersectionType): Boolean = js.native
  }
  
}

