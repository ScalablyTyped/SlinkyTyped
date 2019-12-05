package typingsSlinky.svgDashInjector

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object svgDashInjectorMod {
  import org.scalajs.dom.raw.Node
  import org.scalajs.dom.raw.NodeList

  type SVGInjector = js.Function3[
    /* elements */ Node | NodeList | js.Array[Node], 
    /* options */ js.UndefOr[SVGInjectorOptions], 
    /* done */ js.UndefOr[js.Function1[/* elementCount */ Double, Unit]], 
    Unit
  ]
}
