package typingsSlinky.tanemSvgInjector

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object typesMod {
  type AfterAll = js.Function1[/* elementsLoaded */ scala.Double, scala.Unit]
  type BeforeEach = js.Function1[/* svg */ org.scalajs.dom.raw.SVGElement, scala.Unit]
  type Errback = js.Function2[
    /* error */ js.Error | scala.Null, 
    /* svg */ js.UndefOr[org.scalajs.dom.raw.SVGElement], 
    scala.Unit
  ]
}
