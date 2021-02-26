package typingsSlinky.typescript.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ElementFlags extends StObject
@JSImport("typescript", "ElementFlags")
@js.native
object ElementFlags extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ElementFlags with Double] = js.native
  
  @js.native
  sealed trait Optional extends ElementFlags
  /* 2 */ val Optional: typingsSlinky.typescript.mod.ElementFlags.Optional with Double = js.native
  
  @js.native
  sealed trait Required extends ElementFlags
  /* 1 */ val Required: typingsSlinky.typescript.mod.ElementFlags.Required with Double = js.native
  
  @js.native
  sealed trait Rest extends ElementFlags
  /* 4 */ val Rest: typingsSlinky.typescript.mod.ElementFlags.Rest with Double = js.native
  
  @js.native
  sealed trait Variable extends ElementFlags
  /* 12 */ val Variable: typingsSlinky.typescript.mod.ElementFlags.Variable with Double = js.native
  
  @js.native
  sealed trait Variadic extends ElementFlags
  /* 8 */ val Variadic: typingsSlinky.typescript.mod.ElementFlags.Variadic with Double = js.native
}
