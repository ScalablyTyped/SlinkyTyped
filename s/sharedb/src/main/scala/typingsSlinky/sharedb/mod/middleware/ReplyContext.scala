package typingsSlinky.sharedb.mod.middleware

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.sharedb.agentMod.^
import typingsSlinky.sharedb.mod.sharedb
import typingsSlinky.sharedb.sharedbMod.ClientRequest
import typingsSlinky.sharedb.sharedbStrings.afterSubmit
import typingsSlinky.sharedb.sharedbStrings.apply
import typingsSlinky.sharedb.sharedbStrings.commit
import typingsSlinky.sharedb.sharedbStrings.connect
import typingsSlinky.sharedb.sharedbStrings.doc
import typingsSlinky.sharedb.sharedbStrings.op
import typingsSlinky.sharedb.sharedbStrings.query
import typingsSlinky.sharedb.sharedbStrings.readSnapshots
import typingsSlinky.sharedb.sharedbStrings.receive
import typingsSlinky.sharedb.sharedbStrings.reply
import typingsSlinky.sharedb.sharedbStrings.submit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReplyContext extends BaseContext {
  var reply: StringDictionary[js.Any]
  var request: ClientRequest
}

object ReplyContext {
  @scala.inline
  def apply(
    action: afterSubmit | apply | commit | connect | doc | op | query | readSnapshots | receive | reply | submit,
    agent: ^,
    backend: sharedb,
    reply: StringDictionary[js.Any],
    request: ClientRequest
  ): ReplyContext = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], agent = agent.asInstanceOf[js.Any], backend = backend.asInstanceOf[js.Any], reply = reply.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ReplyContext]
  }
}

