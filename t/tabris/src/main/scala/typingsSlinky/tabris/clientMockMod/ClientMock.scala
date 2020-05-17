package typingsSlinky.tabris.clientMockMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.tabris.anon.PartialClientCallCall
import typingsSlinky.tabris.anon.PartialClientCreateCall
import typingsSlinky.tabris.anon.PartialClientDestroyCall
import typingsSlinky.tabris.anon.PartialClientGetCall
import typingsSlinky.tabris.anon.PartialClientListenCall
import typingsSlinky.tabris.anon.PartialClientSetCall
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClientMock extends js.Object {
  def calls(): js.Array[ClientCall] = js.native
  def calls(filter: PartialClientCallCall): js.Array[ClientCallCall] = js.native
  def calls(filter: PartialClientCreateCall): js.Array[ClientCreateCall] = js.native
  def calls(filter: PartialClientDestroyCall): js.Array[ClientDestroyCall] = js.native
  def calls(filter: PartialClientGetCall): js.Array[ClientGetCall] = js.native
  def calls(filter: PartialClientListenCall): js.Array[ClientListenCall] = js.native
  def calls(filter: PartialClientSetCall): js.Array[ClientSetCall] = js.native
  def properties(cid: String): StringDictionary[js.Any] = js.native
  def resetCalls(): Unit = js.native
}

