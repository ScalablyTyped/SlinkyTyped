package typingsSlinky.sharedb.mod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.sharedb.mod.middleware.ApplyContext
import typingsSlinky.sharedb.mod.middleware.CommitContext
import typingsSlinky.sharedb.mod.middleware.ConnectContext
import typingsSlinky.sharedb.mod.middleware.DocContext
import typingsSlinky.sharedb.mod.middleware.OpContext
import typingsSlinky.sharedb.mod.middleware.QueryContext
import typingsSlinky.sharedb.mod.middleware.ReadSnapshotsContext
import typingsSlinky.sharedb.mod.middleware.ReceiveContext
import typingsSlinky.sharedb.mod.middleware.ReplyContext
import typingsSlinky.sharedb.mod.middleware.SubmitContext
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

@js.native
trait sharedb extends js.Object {
  var db: DB = js.native
  var extraDbs: StringDictionary[ExtraDB] = js.native
  var pubsub: PubSub = js.native
  /**
    * Registers a projection that can be used from clients just like a normal collection.
    *
    * @param name name of the projection
    * @param collection name of the backing collection
    * @param fields field whitelist for the projection
    */
  def addProjection(name: String, collection: String, fields: ProjectionFields): Unit = js.native
  def close(): Unit = js.native
  def close(callback: BasicCallback): Unit = js.native
  def connect(): Connection = js.native
  def connect(connection: js.Any): Connection = js.native
  def connect(connection: js.Any, req: js.Any): Connection = js.native
  def listen(stream: js.Any): Unit = js.native
  /**
    * Registers a server middleware function.
    *
    * @param action name of an action from https://github.com/share/sharedb#middlewares
    * @param fn listener invoked when the specified action occurs
    */
  @JSName("use")
  def use_afterSubmit(
    action: afterSubmit,
    fn: js.Function2[
      /* context */ SubmitContext, 
      /* callback */ js.Function1[/* err */ js.UndefOr[js.Any], Unit], 
      Unit
    ]
  ): Unit = js.native
  @JSName("use")
  def use_apply(
    action: apply,
    fn: js.Function2[
      /* context */ ApplyContext, 
      /* callback */ js.Function1[/* err */ js.UndefOr[js.Any], Unit], 
      Unit
    ]
  ): Unit = js.native
  @JSName("use")
  def use_commit(
    action: commit,
    fn: js.Function2[
      /* context */ CommitContext, 
      /* callback */ js.Function1[/* err */ js.UndefOr[js.Any], Unit], 
      Unit
    ]
  ): Unit = js.native
  @JSName("use")
  def use_connect(
    action: connect,
    fn: js.Function2[
      /* context */ ConnectContext, 
      /* callback */ js.Function1[/* err */ js.UndefOr[js.Any], Unit], 
      Unit
    ]
  ): Unit = js.native
  @JSName("use")
  def use_doc(
    action: doc,
    fn: js.Function2[
      /* context */ DocContext, 
      /* callback */ js.Function1[/* err */ js.UndefOr[js.Any], Unit], 
      Unit
    ]
  ): Unit = js.native
  @JSName("use")
  def use_op(
    action: op,
    fn: js.Function2[
      /* context */ OpContext, 
      /* callback */ js.Function1[/* err */ js.UndefOr[js.Any], Unit], 
      Unit
    ]
  ): Unit = js.native
  @JSName("use")
  def use_query(
    action: query,
    fn: js.Function2[
      /* context */ QueryContext, 
      /* callback */ js.Function1[/* err */ js.UndefOr[js.Any], Unit], 
      Unit
    ]
  ): Unit = js.native
  @JSName("use")
  def use_readSnapshots(
    action: readSnapshots,
    fn: js.Function2[
      /* context */ ReadSnapshotsContext, 
      /* callback */ js.Function1[/* err */ js.UndefOr[js.Any], Unit], 
      Unit
    ]
  ): Unit = js.native
  @JSName("use")
  def use_receive(
    action: receive,
    fn: js.Function2[
      /* context */ ReceiveContext, 
      /* callback */ js.Function1[/* err */ js.UndefOr[js.Any], Unit], 
      Unit
    ]
  ): Unit = js.native
  @JSName("use")
  def use_reply(
    action: reply,
    fn: js.Function2[
      /* context */ ReplyContext, 
      /* callback */ js.Function1[/* err */ js.UndefOr[js.Any], Unit], 
      Unit
    ]
  ): Unit = js.native
  @JSName("use")
  def use_submit(
    action: submit,
    fn: js.Function2[
      /* context */ SubmitContext, 
      /* callback */ js.Function1[/* err */ js.UndefOr[js.Any], Unit], 
      Unit
    ]
  ): Unit = js.native
}

