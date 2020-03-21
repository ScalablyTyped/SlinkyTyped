package typingsSlinky.typedoc

import typingsSlinky.typedoc.abstractMod.Reflection
import typingsSlinky.typedoc.abstractMod.ReflectionKind
import typingsSlinky.typedoc.reflectionCategoryMod.ReflectionCategory
import typingsSlinky.typedoc.reflectionGroupMod.ReflectionGroup
import typingsSlinky.typedoc.reflectionsDeclarationMod.DeclarationReflection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/models/reflections/container", JSImport.Namespace)
@js.native
object containerMod extends js.Object {
  @js.native
  class ContainerReflection () extends Reflection {
    var categories: js.UndefOr[js.Array[ReflectionCategory]] = js.native
    var children: js.UndefOr[js.Array[DeclarationReflection]] = js.native
    var groups: js.UndefOr[js.Array[ReflectionGroup]] = js.native
    def getChildrenByKind(kind: ReflectionKind): js.Array[DeclarationReflection] = js.native
  }
  
}

