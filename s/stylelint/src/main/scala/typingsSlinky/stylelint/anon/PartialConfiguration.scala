package typingsSlinky.stylelint.anon

import typingsSlinky.std.Record
import typingsSlinky.stylelint.mod.Severity
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<stylelint.stylelint.Configuration> */
@js.native
trait PartialConfiguration extends js.Object {
  var defaultSeverity: js.UndefOr[Severity] = js.native
  var `extends`: js.UndefOr[String | js.Array[String]] = js.native
  var ignoreFiles: js.UndefOr[String | js.Array[String]] = js.native
  var plugins: js.UndefOr[js.Array[String]] = js.native
  var processors: js.UndefOr[js.Array[String]] = js.native
  var rules: js.UndefOr[Record[String, _]] = js.native
}

object PartialConfiguration {
  @scala.inline
  def apply(): PartialConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialConfiguration]
  }
  @scala.inline
  implicit class PartialConfigurationOps[Self <: PartialConfiguration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDefaultSeverity(value: Severity): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultSeverity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultSeverity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultSeverity")(js.undefined)
        ret
    }
    @scala.inline
    def withExtends(value: String | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extends")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExtends: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extends")(js.undefined)
        ret
    }
    @scala.inline
    def withIgnoreFiles(value: String | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreFiles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIgnoreFiles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreFiles")(js.undefined)
        ret
    }
    @scala.inline
    def withPlugins(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plugins")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlugins: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plugins")(js.undefined)
        ret
    }
    @scala.inline
    def withProcessors(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("processors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProcessors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("processors")(js.undefined)
        ret
    }
    @scala.inline
    def withRules(value: Record[String, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rules")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRules: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rules")(js.undefined)
        ret
    }
  }
  
}

