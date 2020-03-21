package typingsSlinky.snappy

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type booleanCallback = js.Function2[/* err */ js.Error | scala.Null, /* data */ scala.Boolean, scala.Unit]
  type bufferCallback = js.Function2[/* err */ js.Error | scala.Null, /* data */ typingsSlinky.node.Buffer, scala.Unit]
  type bufferOrStringCallback = js.Function2[
    /* err */ js.Error | scala.Null, 
    /* data */ typingsSlinky.node.Buffer | java.lang.String, 
    scala.Unit
  ]
}
