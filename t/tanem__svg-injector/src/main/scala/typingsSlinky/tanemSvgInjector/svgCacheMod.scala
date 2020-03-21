package typingsSlinky.tanemSvgInjector

import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.SVGSVGElement
import typingsSlinky.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tanem/svg-injector/dist/svg-cache", JSImport.Namespace)
@js.native
object svgCacheMod extends js.Object {
  val default: Map[String, js.UndefOr[js.Error | HTMLElement | SVGSVGElement]] = js.native
}

