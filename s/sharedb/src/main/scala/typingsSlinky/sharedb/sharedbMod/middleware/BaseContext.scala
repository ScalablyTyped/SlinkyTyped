package typingsSlinky.sharedb.sharedbMod.middleware

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

trait BaseContext extends js.Object {
  var action: afterSubmit | apply | commit | connect | doc | op | query | readSnapshots | receive | reply | submit
  var agent: typingsSlinky.sharedb.libAgentMod.^
  var backend: typingsSlinky.sharedb.sharedbMod.sharedb
}

object BaseContext {
  @scala.inline
  def apply(
    action: afterSubmit | apply | commit | connect | doc | op | query | readSnapshots | receive | reply | submit,
    agent: typingsSlinky.sharedb.libAgentMod.^,
    backend: typingsSlinky.sharedb.sharedbMod.sharedb
  ): BaseContext = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], agent = agent.asInstanceOf[js.Any], backend = backend.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[BaseContext]
  }
}

