package typingsSlinky.typescript.typescriptMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ScriptElementKindModifier extends js.Object

@JSImport("typescript", "ScriptElementKindModifier")
@js.native
object ScriptElementKindModifier extends js.Object {
  @js.native
  sealed trait abstractModifier extends ScriptElementKindModifier
  
  @js.native
  sealed trait ambientModifier extends ScriptElementKindModifier
  
  @js.native
  sealed trait dtsModifier extends ScriptElementKindModifier
  
  @js.native
  sealed trait exportedModifier extends ScriptElementKindModifier
  
  @js.native
  sealed trait jsModifier extends ScriptElementKindModifier
  
  @js.native
  sealed trait jsonModifier extends ScriptElementKindModifier
  
  @js.native
  sealed trait jsxModifier extends ScriptElementKindModifier
  
  @js.native
  sealed trait none extends ScriptElementKindModifier
  
  @js.native
  sealed trait optionalModifier extends ScriptElementKindModifier
  
  @js.native
  sealed trait privateMemberModifier extends ScriptElementKindModifier
  
  @js.native
  sealed trait protectedMemberModifier extends ScriptElementKindModifier
  
  @js.native
  sealed trait publicMemberModifier extends ScriptElementKindModifier
  
  @js.native
  sealed trait staticModifier extends ScriptElementKindModifier
  
  @js.native
  sealed trait tsModifier extends ScriptElementKindModifier
  
  @js.native
  sealed trait tsxModifier extends ScriptElementKindModifier
  
  /* "abstract" */ val abstractModifier: typingsSlinky.typescript.typescriptMod.ScriptElementKindModifier.abstractModifier with String = js.native
  /* "declare" */ val ambientModifier: typingsSlinky.typescript.typescriptMod.ScriptElementKindModifier.ambientModifier with String = js.native
  /* ".d.ts" */ val dtsModifier: typingsSlinky.typescript.typescriptMod.ScriptElementKindModifier.dtsModifier with String = js.native
  /* "export" */ val exportedModifier: typingsSlinky.typescript.typescriptMod.ScriptElementKindModifier.exportedModifier with String = js.native
  /* ".js" */ val jsModifier: typingsSlinky.typescript.typescriptMod.ScriptElementKindModifier.jsModifier with String = js.native
  /* ".json" */ val jsonModifier: typingsSlinky.typescript.typescriptMod.ScriptElementKindModifier.jsonModifier with String = js.native
  /* ".jsx" */ val jsxModifier: typingsSlinky.typescript.typescriptMod.ScriptElementKindModifier.jsxModifier with String = js.native
  /* "" */ val none: typingsSlinky.typescript.typescriptMod.ScriptElementKindModifier.none with String = js.native
  /* "optional" */ val optionalModifier: typingsSlinky.typescript.typescriptMod.ScriptElementKindModifier.optionalModifier with String = js.native
  /* "private" */ val privateMemberModifier: typingsSlinky.typescript.typescriptMod.ScriptElementKindModifier.privateMemberModifier with String = js.native
  /* "protected" */ val protectedMemberModifier: typingsSlinky.typescript.typescriptMod.ScriptElementKindModifier.protectedMemberModifier with String = js.native
  /* "public" */ val publicMemberModifier: typingsSlinky.typescript.typescriptMod.ScriptElementKindModifier.publicMemberModifier with String = js.native
  /* "static" */ val staticModifier: typingsSlinky.typescript.typescriptMod.ScriptElementKindModifier.staticModifier with String = js.native
  /* ".ts" */ val tsModifier: typingsSlinky.typescript.typescriptMod.ScriptElementKindModifier.tsModifier with String = js.native
  /* ".tsx" */ val tsxModifier: typingsSlinky.typescript.typescriptMod.ScriptElementKindModifier.tsxModifier with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ScriptElementKindModifier with String] = js.native
}

