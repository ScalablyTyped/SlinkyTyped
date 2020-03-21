package typingsSlinky.websequencediagrams

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type diagramCallback = js.Function3[
    /* error */ js.Error | scala.Null, 
    /* buffer */ js.UndefOr[typingsSlinky.node.Buffer], 
    /* mimeType */ js.UndefOr[java.lang.String], 
    scala.Unit
  ]
  type diagramUrlCallback = js.Function2[
    /* error */ js.Error | scala.Null, 
    /* url */ js.UndefOr[java.lang.String], 
    scala.Unit
  ]
}
