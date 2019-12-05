package typingsSlinky.shot

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object shotMod {
  import org.scalablytyped.runtime.StringDictionary
  import typingsSlinky.node.httpMod.ServerResponse
  import typingsSlinky.node.streamMod.Readable

  type Headers = StringDictionary[String | js.Array[String]]
  type Listener = js.Function2[/* req */ SimulatedRequestObject, /* res */ SimulatedResponseObject, Unit]
  type SimulatedRequestObject = Readable
  type SimulatedResponseObject = ServerResponse
}
