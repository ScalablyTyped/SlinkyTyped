package typingsSlinky.semanticRelease.mod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.node.processMod.global.NodeJS.WriteStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** semantic-release configuration specific for API usage. */
@js.native
trait Config extends js.Object {
  /**
  		 * The current working directory to use. It should be configured to
  		 * the root of the Git repository to release from.
  		 *
  		 * It allows to run semantic-release from a specific path without
  		 * having to change the local process cwd with process.chdir().
  		 *
  		 * @default process.cwd
  		 */
  var cwd: js.UndefOr[String] = js.native
  /**
  		 * The environment variables to use.
  		 *
  		 * It allows to run semantic-release with specific environment
  		 * variables without having to modify the local process.env.
  		 *
  		 * @default process.env
  		 */
  var env: js.UndefOr[StringDictionary[String]] = js.native
  /**
  		 * The writable stream used to log errors.
  		 *
  		 * It allows to configure semantic-release to write errors to a
  		 * specific stream rather than the local process.stderr.
  		 *
  		 * @default process.stderr
  		 */
  var stderr: js.UndefOr[WriteStream] = js.native
  /**
  		 * The writable stream used to log information.
  		 *
  		 * It allows to configure semantic-release to write logs to a specific
  		 * stream rather than the local process.stdout.
  		 *
  		 * @default process.stdout
  		 */
  var stdout: js.UndefOr[WriteStream] = js.native
}

object Config {
  @scala.inline
  def apply(): Config = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Config]
  }
  @scala.inline
  implicit class ConfigOps[Self <: Config] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCwd(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cwd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCwd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cwd")(js.undefined)
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
    def withStderr(value: WriteStream): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stderr")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStderr: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stderr")(js.undefined)
        ret
    }
    @scala.inline
    def withStdout(value: WriteStream): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stdout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStdout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stdout")(js.undefined)
        ret
    }
  }
  
}

