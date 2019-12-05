package typingsSlinky.sipDotJs.sipDotJsMod.Core

import typingsSlinky.sipDotJs.libCoreMessagesBodyMod.Body
import typingsSlinky.sipDotJs.libCoreMessagesOutgoingDashRequestDashMessageMod.OutgoingRequestMessageOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js", "Core.OutgoingRequestMessage")
@js.native
class OutgoingRequestMessage protected ()
  extends typingsSlinky.sipDotJs.libCoreMod.OutgoingRequestMessage {
  def this(
    method: String,
    ruri: typingsSlinky.sipDotJs.libCoreMessagesUriMod.URI,
    fromURI: typingsSlinky.sipDotJs.libCoreMessagesUriMod.URI,
    toURI: typingsSlinky.sipDotJs.libCoreMessagesUriMod.URI
  ) = this()
  def this(
    method: String,
    ruri: typingsSlinky.sipDotJs.libCoreMessagesUriMod.URI,
    fromURI: typingsSlinky.sipDotJs.libCoreMessagesUriMod.URI,
    toURI: typingsSlinky.sipDotJs.libCoreMessagesUriMod.URI,
    options: OutgoingRequestMessageOptions
  ) = this()
  def this(
    method: String,
    ruri: typingsSlinky.sipDotJs.libCoreMessagesUriMod.URI,
    fromURI: typingsSlinky.sipDotJs.libCoreMessagesUriMod.URI,
    toURI: typingsSlinky.sipDotJs.libCoreMessagesUriMod.URI,
    options: OutgoingRequestMessageOptions,
    extraHeaders: js.Array[String]
  ) = this()
  def this(
    method: String,
    ruri: typingsSlinky.sipDotJs.libCoreMessagesUriMod.URI,
    fromURI: typingsSlinky.sipDotJs.libCoreMessagesUriMod.URI,
    toURI: typingsSlinky.sipDotJs.libCoreMessagesUriMod.URI,
    options: OutgoingRequestMessageOptions,
    extraHeaders: js.Array[String],
    body: Body
  ) = this()
}

/* static members */
@JSImport("sip.js", "Core.OutgoingRequestMessage")
@js.native
object OutgoingRequestMessage extends js.Object {
  /** Get a copy of the default options. */
  var getDefaultOptions: js.Any = js.native
  var makeNameAddrHeader: js.Any = js.native
}

