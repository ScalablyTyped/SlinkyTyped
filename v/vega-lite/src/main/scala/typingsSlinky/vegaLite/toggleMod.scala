package typingsSlinky.vegaLite

import org.scalablytyped.runtime.Shortcut
import typingsSlinky.vegaLite.transformsMod.TransformCompiler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object toggleMod extends Shortcut {
  
  @JSImport("vega-lite/build/src/compile/selection/transforms/toggle", JSImport.Default)
  @js.native
  val default: TransformCompiler = js.native
  
  @JSImport("vega-lite/build/src/compile/selection/transforms/toggle", "TOGGLE")
  @js.native
  val TOGGLE: /* "_toggle" */ String = js.native
  
  type _To = TransformCompiler
  
  /* This means you don't have to write `default`, but can instead just say `toggleMod.foo` */
  override def _to: TransformCompiler = default
}
