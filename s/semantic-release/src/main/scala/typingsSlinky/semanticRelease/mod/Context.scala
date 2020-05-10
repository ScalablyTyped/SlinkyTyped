package typingsSlinky.semanticRelease.mod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.semanticRelease.AnonError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Context extends js.Object {
  /**
  		 * Environment variables.
  		 */
  var env: StringDictionary[String] = js.native
  /**
  		 * The previous release details.
  		 */
  var lastRelease: js.UndefOr[LastRelease] = js.native
  /**
  		 * The shared logger instance of semantic release.
  		 */
  var logger: AnonError = js.native
  /**
  		 * The next release details.
  		 */
  var nextRelease: js.UndefOr[NextRelease] = js.native
  /**
  		 * The semantic release configuration itself.
  		 */
  var options: js.UndefOr[GlobalConfig] = js.native
}

object Context {
  @scala.inline
  def apply(env: StringDictionary[String], logger: AnonError): Context = {
    val __obj = js.Dynamic.literal(env = env.asInstanceOf[js.Any], logger = logger.asInstanceOf[js.Any])
    __obj.asInstanceOf[Context]
  }
  @scala.inline
  implicit class ContextOps[Self <: Context] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEnv(value: StringDictionary[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("env")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLogger(value: AnonError): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logger")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLastRelease(value: LastRelease): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastRelease")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastRelease: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastRelease")(js.undefined)
        ret
    }
    @scala.inline
    def withNextRelease(value: NextRelease): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextRelease")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextRelease: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextRelease")(js.undefined)
        ret
    }
    @scala.inline
    def withOptions(value: GlobalConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(js.undefined)
        ret
    }
  }
  
}

