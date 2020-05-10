package typingsSlinky.signale.mod

import typingsSlinky.node.processMod._Global_.NodeJS.WriteStream
import typingsSlinky.std.Map
import typingsSlinky.std.Partial
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SignaleOptions[TTypes /* <: String */] extends js.Object {
  /** Sets the configuration of an instance overriding any existing global or local configuration. */
  var config: js.UndefOr[SignaleConfig] = js.native
  var disabled: js.UndefOr[Boolean] = js.native
  var interactive: js.UndefOr[Boolean] = js.native
  var logLevel: js.UndefOr[String] = js.native
  /**
    * Name of the scope.
    */
  var scope: js.UndefOr[String] = js.native
  var secrets: js.UndefOr[js.Array[String | Double]] = js.native
  /**
    * Destination to which the data is written, can be any valid
    * [Writable stream](https://nodejs.org/api/stream.html#stream_writable_streams).
    */
  var stream: js.UndefOr[WriteStream | js.Array[WriteStream]] = js.native
  var timers: js.UndefOr[Map[String, js.Date]] = js.native
  /**
    * Holds the configuration of the custom and default loggers.
    */
  var types: js.UndefOr[Partial[Record[TTypes, CommandType]]] = js.native
}

object SignaleOptions {
  @scala.inline
  def apply[TTypes](): SignaleOptions[TTypes] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SignaleOptions[TTypes]]
  }
  @scala.inline
  implicit class SignaleOptionsOps[Self[ttypes] <: SignaleOptions[ttypes], TTypes] (val x: Self[TTypes]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TTypes] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TTypes]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[TTypes] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[TTypes] with Other]
    @scala.inline
    def withConfig(value: SignaleConfig): Self[TTypes] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("config")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConfig: Self[TTypes] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("config")(js.undefined)
        ret
    }
    @scala.inline
    def withDisabled(value: Boolean): Self[TTypes] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisabled: Self[TTypes] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabled")(js.undefined)
        ret
    }
    @scala.inline
    def withInteractive(value: Boolean): Self[TTypes] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interactive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInteractive: Self[TTypes] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interactive")(js.undefined)
        ret
    }
    @scala.inline
    def withLogLevel(value: String): Self[TTypes] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logLevel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLogLevel: Self[TTypes] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logLevel")(js.undefined)
        ret
    }
    @scala.inline
    def withScope(value: String): Self[TTypes] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scope")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScope: Self[TTypes] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scope")(js.undefined)
        ret
    }
    @scala.inline
    def withSecrets(value: js.Array[String | Double]): Self[TTypes] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secrets")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSecrets: Self[TTypes] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secrets")(js.undefined)
        ret
    }
    @scala.inline
    def withStream(value: WriteStream | js.Array[WriteStream]): Self[TTypes] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stream")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStream: Self[TTypes] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stream")(js.undefined)
        ret
    }
    @scala.inline
    def withTimers(value: Map[String, js.Date]): Self[TTypes] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimers: Self[TTypes] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timers")(js.undefined)
        ret
    }
    @scala.inline
    def withTypes(value: Partial[Record[TTypes, CommandType]]): Self[TTypes] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("types")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTypes: Self[TTypes] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("types")(js.undefined)
        ret
    }
  }
  
}

