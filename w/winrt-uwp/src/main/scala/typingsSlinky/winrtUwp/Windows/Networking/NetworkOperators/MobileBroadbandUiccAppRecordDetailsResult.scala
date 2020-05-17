package typingsSlinky.winrtUwp.Windows.Networking.NetworkOperators

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains details about results of a UICC application record read operation initiated with MobileBroadbandUiccAppClass.GetRecordDetailsAsync . */
@js.native
trait MobileBroadbandUiccAppRecordDetailsResult extends js.Object {
  /** Gets an enumeration value specifying what kind of record this is. */
  var kind: UiccAppRecordKind = js.native
  /** Gets a value specifying how read access to this record is determined. */
  var readAccessCondition: UiccAccessCondition = js.native
  /** Gets the count of this record in the list of records provided by this UICC application. */
  var recordCount: Double = js.native
  /** Gets the size in bytes of this record. */
  var recordSize: Double = js.native
  /** Gets the status of the operation to retrieve UICC application record details. If this value is not Success, then other properties might not contain valid values. */
  var status: MobileBroadbandUiccAppOperationStatus = js.native
  /** Gets a value specifying how write access to this record is determined. */
  var writeAccessCondition: UiccAccessCondition = js.native
}

object MobileBroadbandUiccAppRecordDetailsResult {
  @scala.inline
  def apply(
    kind: UiccAppRecordKind,
    readAccessCondition: UiccAccessCondition,
    recordCount: Double,
    recordSize: Double,
    status: MobileBroadbandUiccAppOperationStatus,
    writeAccessCondition: UiccAccessCondition
  ): MobileBroadbandUiccAppRecordDetailsResult = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], readAccessCondition = readAccessCondition.asInstanceOf[js.Any], recordCount = recordCount.asInstanceOf[js.Any], recordSize = recordSize.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], writeAccessCondition = writeAccessCondition.asInstanceOf[js.Any])
    __obj.asInstanceOf[MobileBroadbandUiccAppRecordDetailsResult]
  }
  @scala.inline
  implicit class MobileBroadbandUiccAppRecordDetailsResultOps[Self <: MobileBroadbandUiccAppRecordDetailsResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withKind(value: UiccAppRecordKind): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReadAccessCondition(value: UiccAccessCondition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readAccessCondition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRecordCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recordCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRecordSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recordSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatus(value: MobileBroadbandUiccAppOperationStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWriteAccessCondition(value: UiccAccessCondition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("writeAccessCondition")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

