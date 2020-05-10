package typingsSlinky.seleniumWebdriver.remoteMod.SeleniumServer

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Options for the Selenium server
  */
@js.native
trait Options extends js.Object {
  /** The arguments to pass to the service. If a promise is provided, the
    service will wait for it to resolve before starting. */
  var args: js.UndefOr[js.Array[String] | js.Promise[js.Array[String]]] = js.native
  /** The environment variables that should be visible to the server process.
    Defaults to inheriting the current process's environment.*/
  var env: js.UndefOr[StringDictionary[String]] = js.native
  /** The arguments to pass to the JVM. If a promise is provided, the service
    will wait for it to resolve before starting. */
  var jvmArgs: js.UndefOr[js.Array[String] | js.Promise[js.Array[String]]] = js.native
  /** Whether the server should only be accessed on this host's loopback address.*/
  var loopback: js.UndefOr[Boolean] = js.native
  /** The port to start the server on (must be > 0). If the port is provided
    as a promise, the service will wait for the promise to resolve before starting. */
  var port: js.UndefOr[Double | js.Promise[Double]] = js.native
  /** IO configuration for the spawned server process. For more information,
    refer to the documentation of `child_process.spawn`*/
  var stdio: js.UndefOr[String | (js.Array[String | Double])] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArgs(value: js.Array[String] | js.Promise[js.Array[String]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("args")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArgs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("args")(js.undefined)
        ret
    }
    @scala.inline
    def withEnv(value: StringDictionary[String]): Self = {
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
    def withJvmArgs(value: js.Array[String] | js.Promise[js.Array[String]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jvmArgs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJvmArgs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jvmArgs")(js.undefined)
        ret
    }
    @scala.inline
    def withLoopback(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loopback")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLoopback: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loopback")(js.undefined)
        ret
    }
    @scala.inline
    def withPort(value: Double | js.Promise[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("port")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPort: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("port")(js.undefined)
        ret
    }
    @scala.inline
    def withStdio(value: String | (js.Array[String | Double])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stdio")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStdio: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stdio")(js.undefined)
        ret
    }
  }
  
}

