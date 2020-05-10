package typingsSlinky.winrtUwp.Windows.Foundation.Collections

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data for the changed event of a map collection. */
@js.native
trait IMapChangedEventArgs[K] extends js.Object {
  /** Gets the type of change that occurred in the map. */
  var collectionChange: CollectionChange = js.native
  /** Gets the key of the item that changed. */
  var key: K = js.native
}

object IMapChangedEventArgs {
  @scala.inline
  def apply[K](collectionChange: CollectionChange, key: K): IMapChangedEventArgs[K] = {
    val __obj = js.Dynamic.literal(collectionChange = collectionChange.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMapChangedEventArgs[K]]
  }
  @scala.inline
  implicit class IMapChangedEventArgsOps[Self[k] <: IMapChangedEventArgs[k], K] (val x: Self[K]) extends AnyVal {
    @scala.inline
    def duplicate: Self[K] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[K]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[K] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[K] with Other]
    @scala.inline
    def withCollectionChange(value: CollectionChange): Self[K] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collectionChange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKey(value: K): Self[K] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

