package typingsSlinky.supertestDashAsDashPromised

import typingsSlinky.bluebird.bluebirdMod.^
import typingsSlinky.supertestDashAsDashPromised.supertestDashAsDashPromisedMod.Request
import typingsSlinky.supertestDashAsDashPromised.supertestDashAsDashPromisedMod.Response
import typingsSlinky.supertestDashAsDashPromised.supertestDashAsDashPromisedMod.SuperTest
import typingsSlinky.supertestDashAsDashPromised.supertestDashAsDashPromisedMod.Test
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("supertest-as-promised", JSImport.Namespace)
@js.native
object supertestDashAsDashPromisedMod extends js.Object {
  @js.native
  trait Test
    extends typingsSlinky.supertest.supertestMod.Test {
    def timeout(): js.Promise[Response] with this.type = js.native
    def toPromise(): ^[Response] = js.native
  }
  
  def apply(app: js.Any): SuperTest[Test] = js.native
  def agent(): SuperTest[Test] = js.native
  def agent(app: js.Any): SuperTest[Test] = js.native
  type CallbackHandler = js.Function2[/* err */ js.Any, /* res */ Response, Unit]
  type Request = typingsSlinky.supertest.supertestMod.Request
  type Response = typingsSlinky.supertest.supertestMod.Response
  type SuperTest[T /* <: Request */] = typingsSlinky.supertest.supertestMod.SuperTest[T]
}

