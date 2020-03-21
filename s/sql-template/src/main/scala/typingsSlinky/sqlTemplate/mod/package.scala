package typingsSlinky.sqlTemplate

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type ChainFn = js.Function2[/* values */ js.Array[js.Any], /* part */ java.lang.String, java.lang.String]
  type Transformer = js.Function3[
    /* values */ js.Array[js.Any], 
    /* str */ java.lang.String, 
    /* chain */ typingsSlinky.sqlTemplate.mod.ChainFn, 
    scala.Unit
  ]
}
