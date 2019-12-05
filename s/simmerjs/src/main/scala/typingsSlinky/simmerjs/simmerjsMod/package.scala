package typingsSlinky.simmerjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object simmerjsMod {
  import org.scalajs.dom.raw.Element
  import typingsSlinky.std.ArrayLike

  type QueryEngine = js.Function2[
    /* selector */ String, 
    /* onError */ js.Function1[/* error */ js.Any, Unit], 
    ArrayLike[Element]
  ]
}
