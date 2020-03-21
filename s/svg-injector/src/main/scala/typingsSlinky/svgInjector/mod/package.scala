package typingsSlinky.svgInjector

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type SVGInjector = js.Function3[
    /* elements */ org.scalajs.dom.raw.Node | org.scalajs.dom.raw.NodeList | js.Array[org.scalajs.dom.raw.Node], 
    /* options */ js.UndefOr[typingsSlinky.svgInjector.mod.SVGInjectorOptions], 
    /* done */ js.UndefOr[js.Function1[/* elementCount */ scala.Double, scala.Unit]], 
    scala.Unit
  ]
}
