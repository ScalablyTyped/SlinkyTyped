package typingsSlinky.stylelint.mod

import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Configuration extends js.Object {
  var defaultSeverity: Severity = js.native
  var `extends`: String | js.Array[String] = js.native
  var ignoreFiles: String | js.Array[String] = js.native
  var plugins: js.Array[String] = js.native
  var processors: js.Array[String] = js.native
  var rules: Record[String, _] = js.native
}

object Configuration {
  @scala.inline
  def apply(
    defaultSeverity: Severity,
    `extends`: String | js.Array[String],
    ignoreFiles: String | js.Array[String],
    plugins: js.Array[String],
    processors: js.Array[String],
    rules: Record[String, _]
  ): Configuration = {
    val __obj = js.Dynamic.literal(defaultSeverity = defaultSeverity.asInstanceOf[js.Any], ignoreFiles = ignoreFiles.asInstanceOf[js.Any], plugins = plugins.asInstanceOf[js.Any], processors = processors.asInstanceOf[js.Any], rules = rules.asInstanceOf[js.Any])
    __obj.updateDynamic("extends")(`extends`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Configuration]
  }
  @scala.inline
  implicit class ConfigurationOps[Self <: Configuration] (val x: Self) extends AnyVal {
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
    def withExtends(value: String | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extends")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIgnoreFiles(value: String | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreFiles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPlugins(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plugins")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProcessors(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("processors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRules(value: Record[String, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rules")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

