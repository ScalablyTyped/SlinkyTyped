package typingsSlinky.twilioSync.livequeryMod

import typingsSlinky.twilioSync.entityMod.RemovalHandler
import typingsSlinky.twilioSync.entityMod.SyncEntity
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("twilio-sync/lib/livequery", "LiveQueryImpl")
@js.native
class LiveQueryImpl protected () extends SyncEntity {
  def this(descriptor: LiveQueryDescriptor, services: InsightsServices, removalHandler: RemovalHandler) = this()
  def this(
    descriptor: LiveQueryDescriptor,
    services: InsightsServices,
    removalHandler: RemovalHandler,
    items: js.Any
  ) = this()
  
  val cache: js.Any = js.native
  
  val descriptor: js.Any = js.native
  
  def getItems(): ItemsSnapshot = js.native
  
  var handleBatchUpdate: js.Any = js.native
  
  var handleItemMutated: js.Any = js.native
  
  var handleItemRemoved: js.Any = js.native
  
  def liveQueryDescriptor: LiveQueryDescriptor = js.native
  
  /* protected */ def onRemoved(): Unit = js.native
  
  def queryUri: String = js.native
  
  var shouldIgnoreEvent: js.Any = js.native
}
/* static members */
@JSImport("twilio-sync/lib/livequery", "LiveQueryImpl")
@js.native
object LiveQueryImpl extends js.Object {
  
  def `type`: String = js.native
}
