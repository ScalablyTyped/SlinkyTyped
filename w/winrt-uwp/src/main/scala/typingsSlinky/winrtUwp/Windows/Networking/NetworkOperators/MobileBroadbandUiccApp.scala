package typingsSlinky.winrtUwp.Windows.Networking.NetworkOperators

import typingsSlinky.winrtUwp.Windows.Foundation.Collections.IIterable
import typingsSlinky.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typingsSlinky.winrtUwp.Windows.Storage.Streams.IBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a UICC (SIM card) application. */
@js.native
trait MobileBroadbandUiccApp extends js.Object {
  /** Gets the ID of this UICC application. */
  var id: IBuffer = js.native
  /** Gets what kind of UICC application this instance represents. */
  var kind: UiccAppKind = js.native
  /**
    * Asynchronously retrieves details about a UICC application.
    * @param uiccFilePath A sequence of characters specifying the UICC file path of the application. Use the MobileBroadbandUiccApp.Id property value of this instance, to get app record details for this application.
    * @return An asynchronous retrieval operation. On successful completion, returns a MobileBroadbandUiccAppRecordDetailsResult instance initialized for the specified application's details.
    */
  def getRecordDetailsAsync(uiccFilePath: IIterable[Double]): IPromiseWithIAsyncOperation[MobileBroadbandUiccAppRecordDetailsResult] = js.native
  /**
    * Asynchronously reads a UICC application record.
    * @param uiccFilePath A sequence of characters specifying the path to the UICC application.
    * @param recordIndex The record index within the UICC application's records.
    * @return An asynchronous retrieval operation. On successful completion, returns a MobileBroadbandUiccAppReadRecordResult with the result of the operation.
    */
  def readRecordAsync(uiccFilePath: IIterable[Double], recordIndex: Double): IPromiseWithIAsyncOperation[MobileBroadbandUiccAppReadRecordResult] = js.native
}

object MobileBroadbandUiccApp {
  @scala.inline
  def apply(
    getRecordDetailsAsync: IIterable[Double] => IPromiseWithIAsyncOperation[MobileBroadbandUiccAppRecordDetailsResult],
    id: IBuffer,
    kind: UiccAppKind,
    readRecordAsync: (IIterable[Double], Double) => IPromiseWithIAsyncOperation[MobileBroadbandUiccAppReadRecordResult]
  ): MobileBroadbandUiccApp = {
    val __obj = js.Dynamic.literal(getRecordDetailsAsync = js.Any.fromFunction1(getRecordDetailsAsync), id = id.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], readRecordAsync = js.Any.fromFunction2(readRecordAsync))
    __obj.asInstanceOf[MobileBroadbandUiccApp]
  }
  @scala.inline
  implicit class MobileBroadbandUiccAppOps[Self <: MobileBroadbandUiccApp] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetRecordDetailsAsync(value: IIterable[Double] => IPromiseWithIAsyncOperation[MobileBroadbandUiccAppRecordDetailsResult]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getRecordDetailsAsync")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withId(value: IBuffer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKind(value: UiccAppKind): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReadRecordAsync(
      value: (IIterable[Double], Double) => IPromiseWithIAsyncOperation[MobileBroadbandUiccAppReadRecordResult]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readRecordAsync")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

