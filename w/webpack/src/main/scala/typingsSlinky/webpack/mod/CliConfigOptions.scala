package typingsSlinky.webpack.mod

import typingsSlinky.webpack.webpackStrings.development
import typingsSlinky.webpack.webpackStrings.none
import typingsSlinky.webpack.webpackStrings.production
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CliConfigOptions extends js.Object {
  var config: js.UndefOr[String] = js.native
  var `config-name`: js.UndefOr[String] = js.native
  var `config-register`: js.UndefOr[String] = js.native
  var configName: js.UndefOr[String] = js.native
  var configRegister: js.UndefOr[String] = js.native
  var env: js.UndefOr[String] = js.native
  var mode: js.UndefOr[development | production | none] = js.native
}

object CliConfigOptions {
  @scala.inline
  def apply(): CliConfigOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CliConfigOptions]
  }
  @scala.inline
  implicit class CliConfigOptionsOps[Self <: CliConfigOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConfig(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("config")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("config")(js.undefined)
        ret
    }
    @scala.inline
    def `withConfig-name`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("config-name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutConfig-name`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("config-name")(js.undefined)
        ret
    }
    @scala.inline
    def `withConfig-register`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("config-register")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutConfig-register`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("config-register")(js.undefined)
        ret
    }
    @scala.inline
    def withConfigName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("configName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConfigName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("configName")(js.undefined)
        ret
    }
    @scala.inline
    def withConfigRegister(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("configRegister")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConfigRegister: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("configRegister")(js.undefined)
        ret
    }
    @scala.inline
    def withEnv(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("env")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnv: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("env")(js.undefined)
        ret
    }
    @scala.inline
    def withMode(value: development | production | none): Self = {
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
  }
  
}

