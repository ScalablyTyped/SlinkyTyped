package typingsSlinky.tanemSvgInjector

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.raw.SVGElement
import typingsSlinky.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object svgCacheMod extends Shortcut {
  
  @JSImport("@tanem/svg-injector/dist/svg-cache", JSImport.Default)
  @js.native
  val default: Map[String, js.UndefOr[js.Error | SVGElement]] = js.native
  
  type _To = Map[String, js.UndefOr[js.Error | SVGElement]]
  
  /* This means you don't have to write `default`, but can instead just say `svgCacheMod.foo` */
  override def _to: Map[String, js.UndefOr[js.Error | SVGElement]] = default
}
