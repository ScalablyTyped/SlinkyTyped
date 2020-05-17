package typingsSlinky.winrtUwp.Windows.Foundation.Diagnostics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents diagnostic error reporting settings. */
@js.native
trait RuntimeBrokerErrorSettings extends js.Object {
  /**
    * Gets the type of error reporting for the error object.
    * @return One of the enumeration values.
    */
  def getErrorOptions(): ErrorOptions = js.native
  /**
    * Sets the type of error reporting for the error object.
    * @param value One of the enumeration values.
    */
  def setErrorOptions(value: ErrorOptions): Unit = js.native
}

object RuntimeBrokerErrorSettings {
  @scala.inline
  def apply(getErrorOptions: () => ErrorOptions, setErrorOptions: ErrorOptions => Unit): RuntimeBrokerErrorSettings = {
    val __obj = js.Dynamic.literal(getErrorOptions = js.Any.fromFunction0(getErrorOptions), setErrorOptions = js.Any.fromFunction1(setErrorOptions))
    __obj.asInstanceOf[RuntimeBrokerErrorSettings]
  }
  @scala.inline
  implicit class RuntimeBrokerErrorSettingsOps[Self <: RuntimeBrokerErrorSettings] (val x: Self) extends AnyVal {
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

