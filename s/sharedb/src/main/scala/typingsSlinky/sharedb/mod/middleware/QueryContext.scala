package typingsSlinky.sharedb.mod.middleware

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.sharedb.agentMod.^
import typingsSlinky.sharedb.mod.DB
import typingsSlinky.sharedb.mod.Projection
import typingsSlinky.sharedb.mod.ProjectionFields
import typingsSlinky.sharedb.mod.sharedb
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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait QueryContext extends BaseContext {
  
  var channel: String = js.native
  
  var collection: String = js.native
  
  var db: DB | Null = js.native
  
  var fields: js.UndefOr[ProjectionFields] = js.native
  
  var index: String = js.native
  
  var options: js.UndefOr[StringDictionary[js.Any]] = js.native
  
  var projection: js.UndefOr[Projection] = js.native
  
  var query: js.Any = js.native
  
  var snapshotProjection: Projection | Null = js.native
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
    query: js.Any
  ): QueryContext = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], agent = agent.asInstanceOf[js.Any], backend = backend.asInstanceOf[js.Any], channel = channel.asInstanceOf[js.Any], collection = collection.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryContext]
  }
  
  @scala.inline
  implicit class QueryContextOps[Self <: QueryContext] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setChannel(value: String): Self = this.set("channel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCollection(value: String): Self = this.set("collection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndex(value: String): Self = this.set("index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuery(value: js.Any): Self = this.set("query", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDb(value: DB): Self = this.set("db", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDbNull: Self = this.set("db", null)
    
    @scala.inline
    def setFields(value: ProjectionFields): Self = this.set("fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFields: Self = this.set("fields", js.undefined)
    
    @scala.inline
    def setOptions(value: StringDictionary[js.Any]): Self = this.set("options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOptions: Self = this.set("options", js.undefined)
    
    @scala.inline
    def setProjection(value: Projection): Self = this.set("projection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProjection: Self = this.set("projection", js.undefined)
    
    @scala.inline
    def setSnapshotProjection(value: Projection): Self = this.set("snapshotProjection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSnapshotProjectionNull: Self = this.set("snapshotProjection", null)
  }
}
