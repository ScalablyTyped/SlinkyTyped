package typingsSlinky.wallabyjs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IWallabyConfig extends js.Object {
  var compilers: js.UndefOr[IWallabyCompilers] = js.native
  var debug: js.UndefOr[Boolean] = js.native
  var env: js.UndefOr[IWallabyEnvironment] = js.native
  var files: js.Array[IWallabyFilePattern | String] = js.native
  var postprocessor: js.UndefOr[IWallabyProcessor] = js.native
  var preprocessors: js.UndefOr[IWallabyProcessor] = js.native
  var testFramework: js.UndefOr[String] = js.native
  var tests: js.Array[IWallabyFilePattern | String] = js.native
  var workers: js.UndefOr[IWallabyWorkers] = js.native
}

object IWallabyConfig {
  @scala.inline
  def apply(files: js.Array[IWallabyFilePattern | String], tests: js.Array[IWallabyFilePattern | String]): IWallabyConfig = {
    val __obj = js.Dynamic.literal(files = files.asInstanceOf[js.Any], tests = tests.asInstanceOf[js.Any])
    __obj.asInstanceOf[IWallabyConfig]
  }
  @scala.inline
  implicit class IWallabyConfigOps[Self <: IWallabyConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFiles(value: js.Array[IWallabyFilePattern | String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("files")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTests(value: js.Array[IWallabyFilePattern | String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tests")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCompilers(value: IWallabyCompilers): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compilers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCompilers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compilers")(js.undefined)
        ret
    }
    @scala.inline
    def withDebug(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debug")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDebug: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debug")(js.undefined)
        ret
    }
    @scala.inline
    def withEnv(value: IWallabyEnvironment): Self = {
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
    def withPostprocessor(value: IWallabyProcessor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("postprocessor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPostprocessor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("postprocessor")(js.undefined)
        ret
    }
    @scala.inline
    def withPreprocessors(value: IWallabyProcessor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preprocessors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreprocessors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preprocessors")(js.undefined)
        ret
    }
    @scala.inline
    def withTestFramework(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("testFramework")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTestFramework: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("testFramework")(js.undefined)
        ret
    }
    @scala.inline
    def withWorkers(value: IWallabyWorkers): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWorkers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workers")(js.undefined)
        ret
    }
  }
  
}

