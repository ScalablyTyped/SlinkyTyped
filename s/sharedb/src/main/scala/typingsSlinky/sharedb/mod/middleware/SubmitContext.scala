package typingsSlinky.sharedb.mod.middleware

import typingsSlinky.sharedb.agentMod.^
import typingsSlinky.sharedb.mod.Op
import typingsSlinky.sharedb.mod.Projection
import typingsSlinky.sharedb.mod.SubmitRequest
import typingsSlinky.sharedb.mod.sharedb
import typingsSlinky.sharedb.sharedbMod.Snapshot
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

trait SubmitContext
  extends BaseContext
     with SubmitRequest

object SubmitContext {
  @scala.inline
  def apply(
    action: afterSubmit | apply | commit | connect | doc | op | query | readSnapshots | receive | reply | submit,
    agent: ^,
    backend: sharedb,
    collection: String,
    id: String,
    index: String,
    op: Op,
    ops: js.Array[typingsSlinky.sharedb.sharedbMod.Op],
    options: js.Any,
    retries: Double,
    start: Double,
    channels: js.Array[String] = null,
    maxRetries: Double = null.asInstanceOf[Double],
    projection: Projection = null,
    saveMilestoneSnapshot: Boolean = null.asInstanceOf[Boolean],
    snapshot: Snapshot = null,
    suppressPublish: Boolean = null.asInstanceOf[Boolean]
  ): SubmitContext = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], agent = agent.asInstanceOf[js.Any], backend = backend.asInstanceOf[js.Any], collection = collection.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], op = op.asInstanceOf[js.Any], ops = ops.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], retries = retries.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], channels = channels.asInstanceOf[js.Any], maxRetries = maxRetries.asInstanceOf[js.Any], saveMilestoneSnapshot = saveMilestoneSnapshot.asInstanceOf[js.Any], snapshot = snapshot.asInstanceOf[js.Any], suppressPublish = suppressPublish.asInstanceOf[js.Any])
    if (projection != null) __obj.updateDynamic("projection")(projection.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubmitContext]
  }
}

