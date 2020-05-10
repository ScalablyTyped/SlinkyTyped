package typingsSlinky.slimerjs

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SystemModule extends js.Object {
  var args: js.Array[String] = js.native
  var env: StringDictionary[String] = js.native
  var os: AnonArchitecture = js.native
  var pid: Double = js.native
  var platform: String = js.native
  var standarderr: Std = js.native
  var standardin: Std = js.native
  var standardout: Std = js.native
  var stderr: Std = js.native
  var stdin: Std = js.native
  var stdout: Std = js.native
}

object SystemModule {
  @scala.inline
  def apply(
    args: js.Array[String],
    env: StringDictionary[String],
    os: AnonArchitecture,
    pid: Double,
    platform: String,
    standarderr: Std,
    standardin: Std,
    standardout: Std,
    stderr: Std,
    stdin: Std,
    stdout: Std
  ): SystemModule = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], env = env.asInstanceOf[js.Any], os = os.asInstanceOf[js.Any], pid = pid.asInstanceOf[js.Any], platform = platform.asInstanceOf[js.Any], standarderr = standarderr.asInstanceOf[js.Any], standardin = standardin.asInstanceOf[js.Any], standardout = standardout.asInstanceOf[js.Any], stderr = stderr.asInstanceOf[js.Any], stdin = stdin.asInstanceOf[js.Any], stdout = stdout.asInstanceOf[js.Any])
    __obj.asInstanceOf[SystemModule]
  }
  @scala.inline
  implicit class SystemModuleOps[Self <: SystemModule] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArgs(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("args")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEnv(value: StringDictionary[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("env")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOs(value: AnonArchitecture): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("os")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPid(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPlatform(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("platform")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStandarderr(value: Std): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("standarderr")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStandardin(value: Std): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("standardin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStandardout(value: Std): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("standardout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStderr(value: Std): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stderr")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStdin(value: Std): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stdin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStdout(value: Std): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stdout")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

