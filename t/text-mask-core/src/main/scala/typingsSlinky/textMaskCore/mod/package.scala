package typingsSlinky.textMaskCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Mask = js.Array[java.lang.String | js.RegExp]
  type Pipe = js.Function2[
    /* conformedValue */ java.lang.String, 
    /* config */ js.Any, 
    typingsSlinky.textMaskCore.mod.PipeResult
  ]
}
