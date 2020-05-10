package typingsSlinky.sinon.mod

import typingsSlinky.sinon.PartialSinonFakeTimersCon
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SinonSandboxConfig extends js.Object {
  /**
    * The sandbox’s methods can be injected into another object for convenience.
    * The injectInto configuration option can name an object to add properties to.
    */
  var injectInto: js.Object | Null = js.native
  /**
    * What properties to inject.
    * Note that simply naming “server” here is not sufficient to have a server property show up in the target object,
    * you also have to set useFakeServer to true.
    */
  var properties: js.Array[String] = js.native
  /**
    * If true, server and requests properties are added to the sandbox. Can also be an object to use for fake server.
    * The default one is sinon.fakeServer, but if you’re using jQuery 1.3.x or some other library that does not set the XHR’s onreadystatechange handler,
    * you might want to do:
    */
  var useFakeServer: Boolean | SinonFakeServer = js.native
  /**
    * If set to true, the sandbox will have a clock property.
    * You can optionally pass in a configuration object that follows the specification for fake timers, such as { toFake: ["setTimeout", "setInterval"] }.
    */
  var useFakeTimers: Boolean | PartialSinonFakeTimersCon = js.native
}

object SinonSandboxConfig {
  @scala.inline
  def apply(
    properties: js.Array[String],
    useFakeServer: Boolean | SinonFakeServer,
    useFakeTimers: Boolean | PartialSinonFakeTimersCon
  ): SinonSandboxConfig = {
    val __obj = js.Dynamic.literal(properties = properties.asInstanceOf[js.Any], useFakeServer = useFakeServer.asInstanceOf[js.Any], useFakeTimers = useFakeTimers.asInstanceOf[js.Any])
    __obj.asInstanceOf[SinonSandboxConfig]
  }
  @scala.inline
  implicit class SinonSandboxConfigOps[Self <: SinonSandboxConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withProperties(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("properties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUseFakeServer(value: Boolean | SinonFakeServer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useFakeServer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUseFakeTimers(value: Boolean | PartialSinonFakeTimersCon): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useFakeTimers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInjectInto(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("injectInto")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInjectIntoNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("injectInto")(null)
        ret
    }
  }
  
}

