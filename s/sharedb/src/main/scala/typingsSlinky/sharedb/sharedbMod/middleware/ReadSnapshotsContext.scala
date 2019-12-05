package typingsSlinky.sharedb.sharedbMod.middleware

import typingsSlinky.sharedb.libSharedbMod.Snapshot
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

trait ReadSnapshotsContext extends BaseContext {
  var collection: String
  var snapshotType: SnapshotType
  var snapshots: js.Array[Snapshot]
}

object ReadSnapshotsContext {
  @scala.inline
  def apply(
    action: afterSubmit | apply | commit | connect | doc | op | query | readSnapshots | receive | reply | submit,
    agent: typingsSlinky.sharedb.libAgentMod.^,
    backend: typingsSlinky.sharedb.sharedbMod.sharedb,
    collection: String,
    snapshotType: SnapshotType,
    snapshots: js.Array[Snapshot]
  ): ReadSnapshotsContext = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], agent = agent.asInstanceOf[js.Any], backend = backend.asInstanceOf[js.Any], collection = collection.asInstanceOf[js.Any], snapshotType = snapshotType.asInstanceOf[js.Any], snapshots = snapshots.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ReadSnapshotsContext]
  }
}

