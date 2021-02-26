package typingsSlinky.simperium.mod

import typingsSlinky.simperium.anon.Sync
import typingsSlinky.simperium.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Bucket[Name, T, Q] extends CustomEventEmitter[BucketEvent[T]] {
  
  def add(data: T): js.Promise[BucketObject[T]] = js.native
  
  def beforeNetworkChange(
    callback: js.Function4[
      /* entityId */ EntityId, 
      /* updatedEntity */ T, 
      /* baseEntity */ T, 
      /* patch */ JSONDiff[T], 
      T | Null
    ]
  ): Unit = js.native
  
  var channel: Channel[T] = js.native
  
  def find(query: Q): js.Promise[js.Array[BucketObject[T]]] = js.native
  
  def get(entityId: EntityId): js.Promise[BucketObject[T]] = js.native
  
  def getRevisions(entityId: EntityId): js.Promise[js.Array[Revision[T]]] = js.native
  
  def getVersion(entityId: EntityId): js.Promise[Double] = js.native
  
  def hasLocalChanges(): js.Promise[Boolean] = js.native
  
  var isIndexing: Boolean = js.native
  
  var name: Name = js.native
  
  def reload(): Unit = js.native
  
  def remove(entityId: EntityId): js.Promise[Unit] = js.native
  
  def touch(entityId: EntityId): js.Promise[BucketObject[T]] = js.native
  
  def update(entityId: EntityId, updatedEntity: T, options: Sync): js.Promise[BucketObject[T]] = js.native
  def update(entityId: EntityId, updatedEntity: T, remoteInfo: RemoteInfo[T]): js.Promise[BucketObject[T]] = js.native
  def update(entityId: EntityId, updatedEntity: T, remoteInfo: RemoteInfo[T], options: Sync): js.Promise[BucketObject[T]] = js.native
}
object Bucket {
  
  @scala.inline
  def apply[T](name: String, storeProvider: BucketStore[T, js.Object]): Bucket[T, Null, scala.Nothing] = (^.asInstanceOf[js.Dynamic].applyDynamic("Bucket")(name.asInstanceOf[js.Any], storeProvider.asInstanceOf[js.Any])).asInstanceOf[Bucket[T, Null, scala.Nothing]]
  @scala.inline
  def apply[T](name: String, storeProvider: BucketStore[T, js.Object], channel: Channel[T]): Bucket[T, Null, scala.Nothing] = (^.asInstanceOf[js.Dynamic].applyDynamic("Bucket")(name.asInstanceOf[js.Any], storeProvider.asInstanceOf[js.Any], channel.asInstanceOf[js.Any])).asInstanceOf[Bucket[T, Null, scala.Nothing]]
}
