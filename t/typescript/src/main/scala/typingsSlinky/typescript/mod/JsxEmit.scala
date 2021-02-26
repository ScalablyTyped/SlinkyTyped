package typingsSlinky.typescript.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait JsxEmit extends StObject
@JSImport("typescript", "JsxEmit")
@js.native
object JsxEmit extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[JsxEmit with Double] = js.native
  
  @js.native
  sealed trait None extends JsxEmit
  /* 0 */ val None: typingsSlinky.typescript.mod.JsxEmit.None with Double = js.native
  
  @js.native
  sealed trait Preserve extends JsxEmit
  /* 1 */ val Preserve: typingsSlinky.typescript.mod.JsxEmit.Preserve with Double = js.native
  
  @js.native
  sealed trait React extends JsxEmit
  /* 2 */ val React: typingsSlinky.typescript.mod.JsxEmit.React with Double = js.native
  
  @js.native
  sealed trait ReactJSX extends JsxEmit
  /* 4 */ val ReactJSX: typingsSlinky.typescript.mod.JsxEmit.ReactJSX with Double = js.native
  
  @js.native
  sealed trait ReactJSXDev extends JsxEmit
  /* 5 */ val ReactJSXDev: typingsSlinky.typescript.mod.JsxEmit.ReactJSXDev with Double = js.native
  
  @js.native
  sealed trait ReactNative extends JsxEmit
  /* 3 */ val ReactNative: typingsSlinky.typescript.mod.JsxEmit.ReactNative with Double = js.native
}
