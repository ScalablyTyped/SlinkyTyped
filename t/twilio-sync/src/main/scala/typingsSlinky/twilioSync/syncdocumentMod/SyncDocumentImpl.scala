package typingsSlinky.twilioSync.syncdocumentMod

import typingsSlinky.twilioSync.entityMod.RemovalHandler
import typingsSlinky.twilioSync.entityMod.SyncEntity
import typingsSlinky.twilioSync.mutatorMod.Mutator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("twilio-sync/lib/syncdocument", "SyncDocumentImpl")
@js.native
class SyncDocumentImpl protected () extends SyncEntity {
  /**
    * @private
    */
  def this(services: DocumentServices, descriptor: DocumentDescriptor, removalHandler: RemovalHandler) = this()
  
  /**
    * @private
    */
  var _handleSuccessfulUpdateResult: js.Any = js.native
  
  /**
    * @private
    */
  var _postUpdateToServer: js.Any = js.native
  
  /**
    * @private
    */
  var _setUnconditionally: js.Any = js.native
  
  /**
    * @private
    */
  var _setWithIfMatch: js.Any = js.native
  
  /**
    * Get new data from server
    * @private
    */
  var _softSync: js.Any = js.native
  
  /**
    * Update data entity with new data
    * @private
    */
  def _update(update: js.Any): Unit = js.native
  
  def dateExpires: String = js.native
  
  def dateUpdated: js.Date = js.native
  
  val descriptor: js.Any = js.native
  
  var isDeleted: js.Any = js.native
  
  def mutate(mutator: Mutator): js.Promise[js.Object] = js.native
  def mutate(mutator: Mutator, metadataUpdates: DocumentMetadata): js.Promise[js.Object] = js.native
  
  def removeDocument(): js.Promise[scala.Nothing] = js.native
  
  def revision: String = js.native
  
  def set(value: js.Object): js.Promise[js.Object] = js.native
  def set(value: js.Object, metadataUpdates: DocumentMetadata): js.Promise[js.Object] = js.native
  
  def setTtl(ttl: Double): js.Promise[Unit] = js.native
  
  def update(obj: js.Object): js.Promise[js.Object] = js.native
  def update(obj: js.Object, metadataUpdates: DocumentMetadata): js.Promise[js.Object] = js.native
  
  val updateMergingQueue: js.Any = js.native
  
  def uri: String = js.native
  
  def value: js.Object = js.native
}
/* static members */
@JSImport("twilio-sync/lib/syncdocument", "SyncDocumentImpl")
@js.native
object SyncDocumentImpl extends js.Object {
  
  def `type`: String = js.native
}
