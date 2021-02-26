package typingsSlinky.supertestAsPromised

import typingsSlinky.bluebird.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("supertest-as-promised", JSImport.Namespace)
  @js.native
  def apply(app: js.Any): SuperTest[Test] = js.native
  
  @JSImport("supertest-as-promised", "agent")
  @js.native
  def agent(): SuperTest[Test] = js.native
  @JSImport("supertest-as-promised", "agent")
  @js.native
  def agent(app: js.Any): SuperTest[Test] = js.native
  
  type CallbackHandler = js.Function2[/* err */ js.Any, /* res */ Response, Unit]
  
  type Request = typingsSlinky.supertest.mod.Request
  
  type Response = typingsSlinky.supertest.mod.Response
  
  type SuperTest[T /* <: Request */] = typingsSlinky.supertest.mod.SuperTest[T]
  
  @js.native
  trait Test
    extends typingsSlinky.supertest.mod.Test {
    
    def timeout(): js.Promise[Response] with this.type = js.native
    
    def toPromise(): ^[Response] = js.native
  }
}
