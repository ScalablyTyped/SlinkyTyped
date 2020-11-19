package typingsSlinky.supertest

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type CallbackHandler = js.Function2[/* err */ js.Any, /* res */ typingsSlinky.supertest.mod.Response, scala.Unit]
  
  type Request = typingsSlinky.superagent.mod.SuperAgentRequest
  
  type Response = typingsSlinky.superagent.mod.Response
  
  type SuperTest[T /* <: typingsSlinky.superagent.mod.SuperAgentRequest */] = typingsSlinky.superagent.mod.SuperAgent[T]
}
