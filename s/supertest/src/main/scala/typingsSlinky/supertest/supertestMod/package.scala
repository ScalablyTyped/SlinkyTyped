package typingsSlinky.supertest

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object supertestMod {
  import typingsSlinky.superagent.superagentMod.SuperAgent
  import typingsSlinky.superagent.superagentMod.SuperAgentRequest

  type CallbackHandler = js.Function2[/* err */ js.Any, /* res */ Response, Unit]
  type Request = SuperAgentRequest
  type Response = typingsSlinky.superagent.superagentMod.Response
  type SuperTest[T /* <: SuperAgentRequest */] = SuperAgent[T]
}
