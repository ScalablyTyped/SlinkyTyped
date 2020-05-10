package typingsSlinky.systeminformation.mod.Systeminformation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MemLayoutData extends js.Object {
  var bank: String = js.native
  var clockSpeed: Double = js.native
  var formFactor: String = js.native
  var partNum: String = js.native
  var serialNum: String = js.native
  var size: Double = js.native
  var `type`: String = js.native
  var voltageConfigured: Double = js.native
  var voltageMax: Double = js.native
  var voltageMin: Double = js.native
}

object MemLayoutData {
  @scala.inline
  def apply(
    bank: String,
    clockSpeed: Double,
    formFactor: String,
    partNum: String,
    serialNum: String,
    size: Double,
    `type`: String,
    voltageConfigured: Double,
    voltageMax: Double,
    voltageMin: Double
  ): MemLayoutData = {
    val __obj = js.Dynamic.literal(bank = bank.asInstanceOf[js.Any], clockSpeed = clockSpeed.asInstanceOf[js.Any], formFactor = formFactor.asInstanceOf[js.Any], partNum = partNum.asInstanceOf[js.Any], serialNum = serialNum.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], voltageConfigured = voltageConfigured.asInstanceOf[js.Any], voltageMax = voltageMax.asInstanceOf[js.Any], voltageMin = voltageMin.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MemLayoutData]
  }
  @scala.inline
  implicit class MemLayoutDataOps[Self <: MemLayoutData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBank(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bank")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClockSpeed(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clockSpeed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFormFactor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formFactor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPartNum(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("partNum")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSerialNum(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serialNum")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVoltageConfigured(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("voltageConfigured")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVoltageMax(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("voltageMax")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVoltageMin(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("voltageMin")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

