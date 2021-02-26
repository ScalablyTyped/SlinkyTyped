package typingsSlinky.typescript.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait JsxFlags extends StObject
@JSImport("typescript", "JsxFlags")
@js.native
object JsxFlags extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[JsxFlags with Double] = js.native
  
  @js.native
  sealed trait IntrinsicElement extends JsxFlags
  /* 3 */ val IntrinsicElement: typingsSlinky.typescript.mod.JsxFlags.IntrinsicElement with Double = js.native
  
  /** An element inferred from the string index signature of the JSX.IntrinsicElements interface */
  @js.native
  sealed trait IntrinsicIndexedElement extends JsxFlags
  /* 2 */ val IntrinsicIndexedElement: typingsSlinky.typescript.mod.JsxFlags.IntrinsicIndexedElement with Double = js.native
  
  /** An element from a named property of the JSX.IntrinsicElements interface */
  @js.native
  sealed trait IntrinsicNamedElement extends JsxFlags
  /* 1 */ val IntrinsicNamedElement: typingsSlinky.typescript.mod.JsxFlags.IntrinsicNamedElement with Double = js.native
  
  @js.native
  sealed trait None extends JsxFlags
  /* 0 */ val None: typingsSlinky.typescript.mod.JsxFlags.None with Double = js.native
}
