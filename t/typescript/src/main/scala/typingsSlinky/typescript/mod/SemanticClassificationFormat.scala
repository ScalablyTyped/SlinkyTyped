package typingsSlinky.typescript.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SemanticClassificationFormat extends StObject
@JSImport("typescript", "SemanticClassificationFormat")
@js.native
object SemanticClassificationFormat extends StObject {
  
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[SemanticClassificationFormat with java.lang.String] = js.native
  
  @js.native
  sealed trait Original extends SemanticClassificationFormat
  /* "original" */ val Original: typingsSlinky.typescript.mod.SemanticClassificationFormat.Original with java.lang.String = js.native
  
  @js.native
  sealed trait TwentyTwenty extends SemanticClassificationFormat
  /* "2020" */ val TwentyTwenty: typingsSlinky.typescript.mod.SemanticClassificationFormat.TwentyTwenty with java.lang.String = js.native
}
