package typingsSlinky.uuid1345

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type ASCIICallback = js.Function2[/* error */ java.lang.String, /* result */ java.lang.String, scala.Unit]
  type BinaryCallback = js.Function2[/* error */ java.lang.String, /* result */ typingsSlinky.node.Buffer, scala.Unit]
  type ObjectCallback = js.Function2[
    /* error */ java.lang.String, 
    /* result */ typingsSlinky.uuid1345.mod.UUID, 
    scala.Unit
  ]
  type UuidTypes = java.lang.String | typingsSlinky.node.Buffer | typingsSlinky.uuid1345.mod.UUID
}
