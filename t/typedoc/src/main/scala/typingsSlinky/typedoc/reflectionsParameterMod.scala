package typingsSlinky.typedoc

import typingsSlinky.typedoc.abstractMod.DefaultValueContainer
import typingsSlinky.typedoc.modelsTypesMod.Type
import typingsSlinky.typedoc.reflectionsSignatureMod.SignatureReflection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/models/reflections/parameter", JSImport.Namespace)
@js.native
object reflectionsParameterMod extends js.Object {
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - typingsSlinky.typedoc.abstractMod.Reflection because Already inherited
  - typingsSlinky.typedoc.abstractMod.TypeContainer because var conflicts: _alias, _aliases, anchor, comment, cssClasses, decorates, decorators, flags, hasOwnDocument, id, kind, kindString, name, originalName, parent, sources, url. Inlined `type` */ @js.native
  class ParameterReflection () extends DefaultValueContainer {
    @JSName("parent")
    var parent_ParameterReflection: js.UndefOr[SignatureReflection] = js.native
    var `type`: js.UndefOr[Type] = js.native
  }
  
}

