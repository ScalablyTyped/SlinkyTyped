package typingsSlinky.typescript.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ScriptElementKindModifier extends StObject
@JSImport("typescript", "ScriptElementKindModifier")
@js.native
object ScriptElementKindModifier extends StObject {
  
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[ScriptElementKindModifier with java.lang.String] = js.native
  
  @js.native
  sealed trait abstractModifier extends ScriptElementKindModifier
  /* "abstract" */ val abstractModifier: typingsSlinky.typescript.mod.ScriptElementKindModifier.abstractModifier with java.lang.String = js.native
  
  @js.native
  sealed trait ambientModifier extends ScriptElementKindModifier
  /* "declare" */ val ambientModifier: typingsSlinky.typescript.mod.ScriptElementKindModifier.ambientModifier with java.lang.String = js.native
  
  @js.native
  sealed trait deprecatedModifier extends ScriptElementKindModifier
  /* "deprecated" */ val deprecatedModifier: typingsSlinky.typescript.mod.ScriptElementKindModifier.deprecatedModifier with java.lang.String = js.native
  
  @js.native
  sealed trait dtsModifier extends ScriptElementKindModifier
  /* ".d.ts" */ val dtsModifier: typingsSlinky.typescript.mod.ScriptElementKindModifier.dtsModifier with java.lang.String = js.native
  
  @js.native
  sealed trait exportedModifier extends ScriptElementKindModifier
  /* "export" */ val exportedModifier: typingsSlinky.typescript.mod.ScriptElementKindModifier.exportedModifier with java.lang.String = js.native
  
  @js.native
  sealed trait jsModifier extends ScriptElementKindModifier
  /* ".js" */ val jsModifier: typingsSlinky.typescript.mod.ScriptElementKindModifier.jsModifier with java.lang.String = js.native
  
  @js.native
  sealed trait jsonModifier extends ScriptElementKindModifier
  /* ".json" */ val jsonModifier: typingsSlinky.typescript.mod.ScriptElementKindModifier.jsonModifier with java.lang.String = js.native
  
  @js.native
  sealed trait jsxModifier extends ScriptElementKindModifier
  /* ".jsx" */ val jsxModifier: typingsSlinky.typescript.mod.ScriptElementKindModifier.jsxModifier with java.lang.String = js.native
  
  @js.native
  sealed trait none extends ScriptElementKindModifier
  /* "" */ val none: typingsSlinky.typescript.mod.ScriptElementKindModifier.none with java.lang.String = js.native
  
  @js.native
  sealed trait optionalModifier extends ScriptElementKindModifier
  /* "optional" */ val optionalModifier: typingsSlinky.typescript.mod.ScriptElementKindModifier.optionalModifier with java.lang.String = js.native
  
  @js.native
  sealed trait privateMemberModifier extends ScriptElementKindModifier
  /* "private" */ val privateMemberModifier: typingsSlinky.typescript.mod.ScriptElementKindModifier.privateMemberModifier with java.lang.String = js.native
  
  @js.native
  sealed trait protectedMemberModifier extends ScriptElementKindModifier
  /* "protected" */ val protectedMemberModifier: typingsSlinky.typescript.mod.ScriptElementKindModifier.protectedMemberModifier with java.lang.String = js.native
  
  @js.native
  sealed trait publicMemberModifier extends ScriptElementKindModifier
  /* "public" */ val publicMemberModifier: typingsSlinky.typescript.mod.ScriptElementKindModifier.publicMemberModifier with java.lang.String = js.native
  
  @js.native
  sealed trait staticModifier extends ScriptElementKindModifier
  /* "static" */ val staticModifier: typingsSlinky.typescript.mod.ScriptElementKindModifier.staticModifier with java.lang.String = js.native
  
  @js.native
  sealed trait tsModifier extends ScriptElementKindModifier
  /* ".ts" */ val tsModifier: typingsSlinky.typescript.mod.ScriptElementKindModifier.tsModifier with java.lang.String = js.native
  
  @js.native
  sealed trait tsxModifier extends ScriptElementKindModifier
  /* ".tsx" */ val tsxModifier: typingsSlinky.typescript.mod.ScriptElementKindModifier.tsxModifier with java.lang.String = js.native
}
