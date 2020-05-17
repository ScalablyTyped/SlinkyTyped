package typingsSlinky.superagent

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type BrowserParser = js.Function1[/* str */ java.lang.String, js.Any]
  type CallbackHandler = js.Function2[/* err */ js.Any, /* res */ typingsSlinky.superagent.mod.Response, scala.Unit]
  type NodeParser = js.Function2[
    /* res */ typingsSlinky.superagent.mod.Response, 
    /* callback */ js.Function2[/* err */ js.Error | scala.Null, /* body */ js.Any, scala.Unit], 
    scala.Unit
  ]
  type Plugin = js.Function1[/* req */ typingsSlinky.superagent.mod.SuperAgentRequest, scala.Unit]
  type Serializer = js.Function1[/* obj */ js.Any, java.lang.String]
}
