package typingsSlinky.sharedb.sharedbMod.middleware

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.sharedb.libAgentMod.^
import typingsSlinky.sharedb.sharedbMod.DB
import typingsSlinky.sharedb.sharedbMod.Projection
import typingsSlinky.sharedb.sharedbMod.ProjectionFields
import typingsSlinky.sharedb.sharedbMod.sharedb
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

trait QueryContext extends BaseContext {
  var channel: String
  var collection: String
  var db: DB | Null
  var fields: js.UndefOr[ProjectionFields] = js.undefined
  var index: String
  var options: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  var projection: js.UndefOr[Projection] = js.undefined
  var query: js.Any
  var snapshotProjection: Projection | Null
}

object QueryContext {
  @scala.inline
  def apply(
    action: afterSubmit | apply | commit | connect | doc | op | query | readSnapshots | receive | reply | submit,
    agent: ^,
    backend: sharedb,
    channel: String,
    collection: String,
    index: String,
    query: js.Any,
    db: DB = null,
    fields: ProjectionFields = null,
    options: StringDictionary[js.Any] = null,
    projection: Projection = null,
    snapshotProjection: Projection = null
  ): QueryContext = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], agent = agent.asInstanceOf[js.Any], backend = backend.asInstanceOf[js.Any], channel = channel.asInstanceOf[js.Any], collection = collection.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    if (db != null) __obj.updateDynamic("db")(db.asInstanceOf[js.Any])
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (projection != null) __obj.updateDynamic("projection")(projection.asInstanceOf[js.Any])
    if (snapshotProjection != null) __obj.updateDynamic("snapshotProjection")(snapshotProjection.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryContext]
  }
}

