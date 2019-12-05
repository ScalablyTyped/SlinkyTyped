package typingsSlinky.undertaker

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object undertakerMod {
  import org.scalablytyped.runtime.StringDictionary
  import typingsSlinky.node.NodeJS.Process
  import typingsSlinky.node.streamMod.Duplex

  type Task = String | TaskFunction
  type TaskFlags = StringDictionary[String]
  type TaskFunctionBase = js.Function1[
    /* done */ js.Function1[/* error */ js.UndefOr[js.Any], Unit], 
    Unit | Duplex | Process | js.Promise[scala.Nothing] | js.Any
  ]
}
