package typingsSlinky.seleniumStandalone.mod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.node.childProcessMod.ChildProcess
import typingsSlinky.node.childProcessMod.SpawnOptions
import typingsSlinky.node.httpMod.RequestOptions
import typingsSlinky.node.urlMod.URL_
import typingsSlinky.seleniumStandalone.anon.Arch
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StartOpts extends js.Object {
  var basePath: js.UndefOr[String] = js.native
  var cb: js.UndefOr[js.Function2[/* error */ js.Error, /* child */ ChildProcess, Unit]] = js.native
  var drivers: js.UndefOr[StringDictionary[Arch]] = js.native
  var javaArgs: js.UndefOr[js.Array[String]] = js.native
  var javaPath: js.UndefOr[String] = js.native
  var requestOpts: js.UndefOr[RequestOptions | String | URL_] = js.native
  var seleniumArgs: js.UndefOr[js.Array[String]] = js.native
  var spawnCb: js.UndefOr[js.Function1[/* selenium */ js.UndefOr[ChildProcess], Unit]] = js.native
  var spawnOptions: js.UndefOr[SpawnOptions] = js.native
  var version: js.UndefOr[String] = js.native
}

object StartOpts {
  @scala.inline
  def apply(): StartOpts = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StartOpts]
  }
  @scala.inline
  implicit class StartOptsOps[Self <: StartOpts] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBasePath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("basePath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBasePath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("basePath")(js.undefined)
        ret
    }
    @scala.inline
    def withCb(value: (/* error */ js.Error, /* child */ ChildProcess) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cb")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutCb: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cb")(js.undefined)
        ret
    }
    @scala.inline
    def withDrivers(value: StringDictionary[Arch]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drivers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDrivers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drivers")(js.undefined)
        ret
    }
    @scala.inline
    def withJavaArgs(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("javaArgs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJavaArgs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("javaArgs")(js.undefined)
        ret
    }
    @scala.inline
    def withJavaPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("javaPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJavaPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("javaPath")(js.undefined)
        ret
    }
    @scala.inline
    def withRequestOpts(value: RequestOptions | String | URL_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestOpts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequestOpts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestOpts")(js.undefined)
        ret
    }
    @scala.inline
    def withSeleniumArgs(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("seleniumArgs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSeleniumArgs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("seleniumArgs")(js.undefined)
        ret
    }
    @scala.inline
    def withSpawnCb(value: /* selenium */ js.UndefOr[ChildProcess] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spawnCb")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSpawnCb: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spawnCb")(js.undefined)
        ret
    }
    @scala.inline
    def withSpawnOptions(value: SpawnOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spawnOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpawnOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spawnOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(js.undefined)
        ret
    }
  }
  
}

