package typingsSlinky.winrt.Windows.Foundation.Diagnostics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IErrorReportingSettings extends js.Object {
  def getErrorOptions(): ErrorOptions = js.native
  def setErrorOptions(value: ErrorOptions): Unit = js.native
}

object IErrorReportingSettings {
  @scala.inline
  def apply(getErrorOptions: () => ErrorOptions, setErrorOptions: ErrorOptions => Unit): IErrorReportingSettings = {
    val __obj = js.Dynamic.literal(getErrorOptions = js.Any.fromFunction0(getErrorOptions), setErrorOptions = js.Any.fromFunction1(setErrorOptions))
    __obj.asInstanceOf[IErrorReportingSettings]
  }
  @scala.inline
  implicit class IErrorReportingSettingsOps[Self <: IErrorReportingSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetErrorOptions(value: () => ErrorOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getErrorOptions")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSetErrorOptions(value: ErrorOptions => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setErrorOptions")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

