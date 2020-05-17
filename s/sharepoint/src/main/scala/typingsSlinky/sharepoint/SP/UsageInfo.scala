package typingsSlinky.sharepoint.SP

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UsageInfo extends ClientValueObject {
  def get_bandwidth(): Double = js.native
  def get_discussionStorage(): Double = js.native
  def get_hits(): Double = js.native
  def get_storage(): Double = js.native
  def get_storagePercentageUsed(): Double = js.native
  def get_visits(): Double = js.native
}

object UsageInfo {
  @scala.inline
  def apply(
    customFromJson: js.Any => Boolean,
    customWriteToXml: (XmlWriter, SerializationContext) => Boolean,
    fromJson: js.Any => Unit,
    get_bandwidth: () => Double,
    get_discussionStorage: () => Double,
    get_hits: () => Double,
    get_storage: () => Double,
    get_storagePercentageUsed: () => Double,
    get_typeId: () => String,
    get_visits: () => Double,
    writeToXml: (XmlWriter, SerializationContext) => Unit
  ): UsageInfo = {
    val __obj = js.Dynamic.literal(customFromJson = js.Any.fromFunction1(customFromJson), customWriteToXml = js.Any.fromFunction2(customWriteToXml), fromJson = js.Any.fromFunction1(fromJson), get_bandwidth = js.Any.fromFunction0(get_bandwidth), get_discussionStorage = js.Any.fromFunction0(get_discussionStorage), get_hits = js.Any.fromFunction0(get_hits), get_storage = js.Any.fromFunction0(get_storage), get_storagePercentageUsed = js.Any.fromFunction0(get_storagePercentageUsed), get_typeId = js.Any.fromFunction0(get_typeId), get_visits = js.Any.fromFunction0(get_visits), writeToXml = js.Any.fromFunction2(writeToXml))
    __obj.asInstanceOf[UsageInfo]
  }
  @scala.inline
  implicit class UsageInfoOps[Self <: UsageInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGet_bandwidth(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get_bandwidth")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGet_discussionStorage(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get_discussionStorage")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGet_hits(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get_hits")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGet_storage(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get_storage")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGet_storagePercentageUsed(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get_storagePercentageUsed")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGet_visits(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get_visits")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

