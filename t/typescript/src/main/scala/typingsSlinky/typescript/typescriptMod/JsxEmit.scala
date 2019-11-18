package typingsSlinky.typescript.typescriptMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait JsxEmit extends js.Object

@JSImport("typescript", "JsxEmit")
@js.native
object JsxEmit extends js.Object {
  @js.native
  sealed trait None extends JsxEmit
  
  @js.native
  sealed trait Preserve extends JsxEmit
  
  @js.native
  sealed trait React extends JsxEmit
  
  @js.native
  sealed trait ReactNative extends JsxEmit
  
  /* 0 */ val None: typingsSlinky.typescript.typescriptMod.JsxEmit.None with Double = js.native
  /* 1 */ val Preserve: typingsSlinky.typescript.typescriptMod.JsxEmit.Preserve with Double = js.native
  /* 2 */ val React: typingsSlinky.typescript.typescriptMod.JsxEmit.React with Double = js.native
  /* 3 */ val ReactNative: typingsSlinky.typescript.typescriptMod.JsxEmit.ReactNative with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[JsxEmit with Double] = js.native
}

