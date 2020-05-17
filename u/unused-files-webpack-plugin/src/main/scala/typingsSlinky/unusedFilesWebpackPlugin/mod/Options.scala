package typingsSlinky.unusedFilesWebpackPlugin.mod

import typingsSlinky.unusedFilesWebpackPlugin.anon.Ignore
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  var cwd: js.UndefOr[String] = js.native
  var failOnUnused: Boolean = js.native
  var globOptions: js.UndefOr[Ignore] = js.native
  var ignore: js.UndefOr[String | js.Array[String]] = js.native
  var patterns: js.UndefOr[js.Array[String]] = js.native
}

object Options {
  @scala.inline
  def apply(failOnUnused: Boolean): Options = {
    val __obj = js.Dynamic.literal(failOnUnused = failOnUnused.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFailOnUnused(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("failOnUnused")(value.asInstanceOf[js.Any])
        ret
    }
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
    def withGlobOptions(value: Ignore): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("globOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGlobOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("globOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withIgnore(value: String | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignore")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIgnore: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignore")(js.undefined)
        ret
    }
    @scala.inline
    def withPatterns(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("patterns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPatterns: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("patterns")(js.undefined)
        ret
    }
  }
  
}

