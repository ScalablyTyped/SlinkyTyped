package typingsSlinky.sinonTest.mod

import typingsSlinky.sinonTest.sinonTestStrings.clock
import typingsSlinky.sinonTest.sinonTestStrings.mock
import typingsSlinky.sinonTest.sinonTestStrings.requests
import typingsSlinky.sinonTest.sinonTestStrings.server
import typingsSlinky.sinonTest.sinonTestStrings.spy
import typingsSlinky.sinonTest.sinonTestStrings.stub
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Configuration extends js.Object {
  var injectInto: js.UndefOr[js.Any] = js.native
  var injectIntoThis: js.UndefOr[Boolean] = js.native
  var properties: js.UndefOr[js.Array[spy | stub | mock | clock | server | requests]] = js.native
  var useFakeServer: js.UndefOr[Boolean] = js.native
  var useFakeTimers: js.UndefOr[Boolean] = js.native
}

object Configuration {
  @scala.inline
  def apply(): Configuration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Configuration]
  }
  @scala.inline
  implicit class ConfigurationOps[Self <: Configuration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInjectInto(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("injectInto")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInjectInto: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("injectInto")(js.undefined)
        ret
    }
    @scala.inline
    def withInjectIntoThis(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("injectIntoThis")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInjectIntoThis: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("injectIntoThis")(js.undefined)
        ret
    }
    @scala.inline
    def withProperties(value: js.Array[spy | stub | mock | clock | server | requests]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("properties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProperties: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("properties")(js.undefined)
        ret
    }
    @scala.inline
    def withUseFakeServer(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useFakeServer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseFakeServer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useFakeServer")(js.undefined)
        ret
    }
    @scala.inline
    def withUseFakeTimers(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useFakeTimers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseFakeTimers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useFakeTimers")(js.undefined)
        ret
    }
  }
  
}

