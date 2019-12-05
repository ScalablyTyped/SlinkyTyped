package typingsSlinky.websequencediagrams

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object websequencediagramsMod {
  import typingsSlinky.node.Buffer

  type diagramCallback = js.Function3[
    /* error */ js.Error | Null, 
    /* buffer */ js.UndefOr[Buffer], 
    /* mimeType */ js.UndefOr[String], 
    Unit
  ]
  type diagramUrlCallback = js.Function2[/* error */ js.Error | Null, /* url */ js.UndefOr[String], Unit]
}
