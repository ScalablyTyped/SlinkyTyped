package typingsSlinky.typedoc

import typingsSlinky.typedoc.distLibModelsReflectionCategoryMod.ReflectionCategory
import typingsSlinky.typedoc.distLibModelsReflectionGroupMod.ReflectionGroup
import typingsSlinky.typedoc.distLibModelsReflectionsAbstractMod.Reflection
import typingsSlinky.typedoc.distLibModelsReflectionsAbstractMod.ReflectionKind
import typingsSlinky.typedoc.distLibModelsReflectionsDeclarationMod.DeclarationReflection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/models/reflections/container", JSImport.Namespace)
@js.native
object distLibModelsReflectionsContainerMod extends js.Object {
  @js.native
  class ContainerReflection () extends Reflection {
    var categories: js.UndefOr[js.Array[ReflectionCategory]] = js.native
    var children: js.UndefOr[js.Array[DeclarationReflection]] = js.native
    var groups: js.UndefOr[js.Array[ReflectionGroup]] = js.native
    def getChildrenByKind(kind: ReflectionKind): js.Array[DeclarationReflection] = js.native
  }
  
}

