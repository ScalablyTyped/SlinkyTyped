package typingsSlinky.tdweb.mod

import typingsSlinky.tdweb.tdwebStrings.asmjs
import typingsSlinky.tdweb.tdwebStrings.auto
import typingsSlinky.tdweb.tdwebStrings.debug
import typingsSlinky.tdweb.tdwebStrings.error
import typingsSlinky.tdweb.tdwebStrings.info
import typingsSlinky.tdweb.tdwebStrings.log
import typingsSlinky.tdweb.tdwebStrings.warning
import typingsSlinky.tdweb.tdwebStrings.wasm
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TdOptions extends js.Object {
  /**
    * Name of the TDLib instance. Currently only one instance of TdClient with a given name is allowed.
    * All but one instances with the same name will be automatically closed. Usually, the newest non-background instance is kept alive.
    * Files will be stored in an IndexedDb table with the same name.
    */
  var instanceName: js.UndefOr[String] = js.native
  /**
    * Pass true, if the instance is opened from the background.
    */
  var isBackground: js.UndefOr[Boolean] = js.native
  /**
    * The initial verbosity level of the JavaScript part of the code (one of 'error', 'warning', 'info', 'log', 'debug').
    */
  var jsLogVerbosityLevel: js.UndefOr[error | warning | info | log | debug] = js.native
  /**
    * The initial verbosity level for the TDLib internal logging (0-1023).
    */
  var logVerbosityLevel: js.UndefOr[Double] = js.native
  /**
    * For debug only. The type of the TDLib build to use. 'asmjs' for asm.js and 'wasm' for WebAssembly.
    * If mode == 'auto' WebAbassembly will be used if supported by browser, asm.js otherwise.
    */
  var mode: js.UndefOr[auto | asmjs | wasm] = js.native
  /**
    * Callback for all incoming updates.
    */
  var onUpdate: js.UndefOr[js.Function1[/* update */ TdObject, _]] = js.native
  /**
    * For debug only. PaPass false to use TDLib without database and secret chats.
    * It will significantly improve loading time, but some functionality will be unavailable.ss true
    * to open TDLib database in read-only mode
    */
  var readOnly: js.UndefOr[Boolean] = js.native
  /**
    * Pass false to use TDLib without database and secret chats. It will significantly improve loading time, but some functionality will be unavailable.
    */
  var useDatabase: js.UndefOr[Boolean] = js.native
}

object TdOptions {
  @scala.inline
  def apply(): TdOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TdOptions]
  }
  @scala.inline
  implicit class TdOptionsOps[Self <: TdOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInstanceName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instanceName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInstanceName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instanceName")(js.undefined)
        ret
    }
    @scala.inline
    def withIsBackground(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isBackground")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsBackground: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isBackground")(js.undefined)
        ret
    }
    @scala.inline
    def withJsLogVerbosityLevel(value: error | warning | info | log | debug): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jsLogVerbosityLevel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJsLogVerbosityLevel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jsLogVerbosityLevel")(js.undefined)
        ret
    }
    @scala.inline
    def withLogVerbosityLevel(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logVerbosityLevel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLogVerbosityLevel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logVerbosityLevel")(js.undefined)
        ret
    }
    @scala.inline
    def withMode(value: auto | asmjs | wasm): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mode")(js.undefined)
        ret
    }
    @scala.inline
    def withOnUpdate(value: /* update */ TdObject => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onUpdate")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnUpdate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onUpdate")(js.undefined)
        ret
    }
    @scala.inline
    def withReadOnly(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readOnly")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReadOnly: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readOnly")(js.undefined)
        ret
    }
    @scala.inline
    def withUseDatabase(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useDatabase")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseDatabase: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useDatabase")(js.undefined)
        ret
    }
  }
  
}

