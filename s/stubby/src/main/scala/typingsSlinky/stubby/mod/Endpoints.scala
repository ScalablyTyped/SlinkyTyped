package typingsSlinky.stubby.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Endpoints extends js.Object {
  
  def create(
    endpoint: js.Array[StubbyData],
    callback: js.Function2[/* err */ js.UndefOr[js.Error], /* endpoint */ Endpoint, Unit],
    datadir: String
  ): Unit = js.native
  def create(
    endpoint: StubbyData,
    callback: js.Function2[/* err */ js.UndefOr[js.Error], /* endpoint */ Endpoint, Unit],
    datadir: String
  ): Unit = js.native
  
  def delete(id: String, callback: js.Function1[/* err */ js.UndefOr[js.Error], Unit]): Unit = js.native
  
  def gather(callback: js.Function2[/* err */ js.UndefOr[js.Error], /* endpoints */ js.Array[Endpoint], Unit]): Unit = js.native
  
  def retrieve(id: String, callback: js.Function2[/* err */ js.UndefOr[js.Error], /* endpoint */ Endpoint, Unit]): Unit = js.native
  
  def update(id: String, data: StubbyData, callback: js.Function1[/* err */ js.UndefOr[js.Error], Unit]): Unit = js.native
}
