package typingsSlinky.soap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libServerMod {
  import typingsSlinky.node.httpMod.IncomingMessage
  import typingsSlinky.node.httpMod.ServerResponse
  import typingsSlinky.soap.Anon_Body

  type Request = IncomingMessage with Anon_Body
  type Response = ServerResponse
  type ServerType = typingsSlinky.node.httpMod.Server | IExpressApp
}
