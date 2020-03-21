package typingsSlinky.sipJs.coreMod

import typingsSlinky.sipJs.bodyMod.Body
import typingsSlinky.sipJs.outgoingRequestMessageMod.OutgoingRequestMessageOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/core", "OutgoingRequestMessage")
@js.native
class OutgoingRequestMessage protected ()
  extends typingsSlinky.sipJs.messagesMod.OutgoingRequestMessage {
  def this(
    method: String,
    ruri: typingsSlinky.sipJs.uriMod.URI,
    fromURI: typingsSlinky.sipJs.uriMod.URI,
    toURI: typingsSlinky.sipJs.uriMod.URI
  ) = this()
  def this(
    method: String,
    ruri: typingsSlinky.sipJs.uriMod.URI,
    fromURI: typingsSlinky.sipJs.uriMod.URI,
    toURI: typingsSlinky.sipJs.uriMod.URI,
    options: OutgoingRequestMessageOptions
  ) = this()
  def this(
    method: String,
    ruri: typingsSlinky.sipJs.uriMod.URI,
    fromURI: typingsSlinky.sipJs.uriMod.URI,
    toURI: typingsSlinky.sipJs.uriMod.URI,
    options: OutgoingRequestMessageOptions,
    extraHeaders: js.Array[String]
  ) = this()
  def this(
    method: String,
    ruri: typingsSlinky.sipJs.uriMod.URI,
    fromURI: typingsSlinky.sipJs.uriMod.URI,
    toURI: typingsSlinky.sipJs.uriMod.URI,
    options: OutgoingRequestMessageOptions,
    extraHeaders: js.Array[String],
    body: Body
  ) = this()
}

/* static members */
@JSImport("sip.js/lib/core", "OutgoingRequestMessage")
@js.native
object OutgoingRequestMessage extends js.Object {
  /** Get a copy of the default options. */
  var getDefaultOptions: js.Any = js.native
  var makeNameAddrHeader: js.Any = js.native
}

