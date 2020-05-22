package typingsSlinky.twilioSync.syncmapMod

import typingsSlinky.twilioSync.entityMod.RemovalHandler
import typingsSlinky.twilioSync.entityMod.SyncEntity
import typingsSlinky.twilioSync.mapitemMod.MapItem
import typingsSlinky.twilioSync.mutatorMod.Mutator
import typingsSlinky.twilioSync.paginatorMod.Paginator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("twilio-sync/lib/syncmap", "SyncMapImpl")
@js.native
class SyncMapImpl protected () extends SyncEntity {
  /**
    * @private
    */
  def this(services: MapServices, descriptor: MapDescriptor, removalHandler: RemovalHandler) = this()
  var _getItemFromServer: js.Any = js.native
  var _handleItemMutated: js.Any = js.native
  var _putItemToServer: js.Any = js.native
  var _putItemUnconditionally: js.Any = js.native
  var _putItemWithIfMatch: js.Any = js.native
  var _updateRootDateUpdated: js.Any = js.native
  val cache: js.Any = js.native
  val descriptor: js.Any = js.native
  var emitItemMutationEvent: js.Any = js.native
  var shouldIgnoreEvent: js.Any = js.native
  val updateMergingQueue: js.Any = js.native
  /**
    * @private
    */
  /* protected */ def _handleItemRemoved(key: js.Any, eventId: js.Any, oldData: js.Any, dateUpdated: js.Date, remote: Boolean): Unit = js.native
  def dateExpires: String = js.native
  def dateUpdated: js.Date = js.native
  def get(key: String): js.Promise[MapItem] = js.native
  def getItems(): js.Promise[Paginator[MapItem]] = js.native
  def getItems(args: js.Any): js.Promise[Paginator[MapItem]] = js.native
  def links: js.Any = js.native
  def mutate(key: String, mutator: Mutator): js.Promise[MapItem] = js.native
  def mutate(key: String, mutator: Mutator, itemMetadataUpdates: ItemMetadata): js.Promise[MapItem] = js.native
  /**
    * @private
    */
  /* protected */ def queryItems(): js.Promise[Paginator[MapItem]] = js.native
  /* protected */ def queryItems(args: js.Any): js.Promise[Paginator[MapItem]] = js.native
  def remove(key: String): js.Promise[Unit] = js.native
  def removeMap(): js.Promise[Unit] = js.native
  def revision: String = js.native
  def set(key: String, value: js.Object): js.Promise[MapItem] = js.native
  def set(key: String, value: js.Object, itemMetadataUpdates: ItemMetadata): js.Promise[MapItem] = js.native
  def setItemTtl(key: String, ttl: Double): js.Promise[Unit] = js.native
  def setTtl(ttl: Double): js.Promise[Unit] = js.native
  def update(key: String, obj: js.Object): js.Promise[MapItem] = js.native
  def update(key: String, obj: js.Object, itemMetadataUpdates: ItemMetadata): js.Promise[MapItem] = js.native
  def uri: String = js.native
}

/* static members */
@JSImport("twilio-sync/lib/syncmap", "SyncMapImpl")
@js.native
object SyncMapImpl extends js.Object {
  def `type`: String = js.native
}

