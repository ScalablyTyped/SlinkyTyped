package typingsSlinky.typescript.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SemicolonPreference extends js.Object
@JSImport("typescript", "SemicolonPreference")
@js.native
object SemicolonPreference extends js.Object {
  
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[SemicolonPreference with java.lang.String] = js.native
  
  @js.native
  sealed trait Ignore extends SemicolonPreference
  /* "ignore" */ @js.native
  object Ignore
    extends TopLevel[Ignore with java.lang.String]
  
  @js.native
  sealed trait Insert extends SemicolonPreference
  /* "insert" */ @js.native
  object Insert
    extends TopLevel[Insert with java.lang.String]
  
  @js.native
  sealed trait Remove extends SemicolonPreference
  /* "remove" */ @js.native
  object Remove
    extends TopLevel[Remove with java.lang.String]
}
