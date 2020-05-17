package typingsSlinky.sharepoint.SP

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpgradeInfo extends ClientValueObject {
  def get_errorFile(): String = js.native
  def get_errors(): Double = js.native
  def get_lastUpdated(): js.Date = js.native
  def get_logFile(): String = js.native
  def get_requestDate(): js.Date = js.native
  def get_retryCount(): Double = js.native
  def get_startTime(): js.Date = js.native
  def get_status(): UpgradeStatus = js.native
  def get_upgradeType(): UpgradeType = js.native
  def get_warnings(): Double = js.native
}

object UpgradeInfo {
  @scala.inline
  def apply(
    customFromJson: js.Any => Boolean,
    customWriteToXml: (XmlWriter, SerializationContext) => Boolean,
    fromJson: js.Any => Unit,
    get_errorFile: () => String,
    get_errors: () => Double,
    get_lastUpdated: () => js.Date,
    get_logFile: () => String,
    get_requestDate: () => js.Date,
    get_retryCount: () => Double,
    get_startTime: () => js.Date,
    get_status: () => UpgradeStatus,
    get_typeId: () => String,
    get_upgradeType: () => UpgradeType,
    get_warnings: () => Double,
    writeToXml: (XmlWriter, SerializationContext) => Unit
  ): UpgradeInfo = {
    val __obj = js.Dynamic.literal(customFromJson = js.Any.fromFunction1(customFromJson), customWriteToXml = js.Any.fromFunction2(customWriteToXml), fromJson = js.Any.fromFunction1(fromJson), get_errorFile = js.Any.fromFunction0(get_errorFile), get_errors = js.Any.fromFunction0(get_errors), get_lastUpdated = js.Any.fromFunction0(get_lastUpdated), get_logFile = js.Any.fromFunction0(get_logFile), get_requestDate = js.Any.fromFunction0(get_requestDate), get_retryCount = js.Any.fromFunction0(get_retryCount), get_startTime = js.Any.fromFunction0(get_startTime), get_status = js.Any.fromFunction0(get_status), get_typeId = js.Any.fromFunction0(get_typeId), get_upgradeType = js.Any.fromFunction0(get_upgradeType), get_warnings = js.Any.fromFunction0(get_warnings), writeToXml = js.Any.fromFunction2(writeToXml))
    __obj.asInstanceOf[UpgradeInfo]
  }
  @scala.inline
  implicit class UpgradeInfoOps[Self <: UpgradeInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGet_errorFile(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get_errorFile")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGet_errors(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get_errors")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGet_lastUpdated(value: () => js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get_lastUpdated")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGet_logFile(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get_logFile")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGet_requestDate(value: () => js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get_requestDate")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGet_retryCount(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get_retryCount")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGet_startTime(value: () => js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get_startTime")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGet_status(value: () => UpgradeStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get_status")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGet_upgradeType(value: () => UpgradeType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get_upgradeType")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGet_warnings(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get_warnings")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

