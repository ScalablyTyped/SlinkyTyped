package typingsSlinky.winrtUwp.Windows.Devices.Perception

import typingsSlinky.winrtUwp.Windows.Foundation.Collections.CollectionChange
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains information about an attempt to change properties on a frame source. */
@js.native
trait PerceptionFrameSourcePropertiesChangedEventArgs extends js.Object {
  /** Gets the type of change that occurred as a result of the property change request. */
  var collectionChange: CollectionChange = js.native
  /** Gets a string key indicating the location of the change in the collection. */
  var key: String = js.native
}

object PerceptionFrameSourcePropertiesChangedEventArgs {
  @scala.inline
  def apply(collectionChange: CollectionChange, key: String): PerceptionFrameSourcePropertiesChangedEventArgs = {
    val __obj = js.Dynamic.literal(collectionChange = collectionChange.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[PerceptionFrameSourcePropertiesChangedEventArgs]
  }
  @scala.inline
  implicit class PerceptionFrameSourcePropertiesChangedEventArgsOps[Self <: PerceptionFrameSourcePropertiesChangedEventArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCollectionChange(value: CollectionChange): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collectionChange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

