package typingsSlinky.typedoc.tsInternalMod

import typingsSlinky.std.Map
import typingsSlinky.typedoc.typedocStrings.boolean
import typingsSlinky.typedoc.typedocStrings.list
import typingsSlinky.typedoc.typedocStrings.number
import typingsSlinky.typedoc.typedocStrings.object_
import typingsSlinky.typedoc.typedocStrings.string
import typingsSlinky.typescript.mod.DiagnosticMessage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CommandLineOptionBase extends js.Object {
  var description: js.UndefOr[DiagnosticMessage] = js.native
  var experimental: js.UndefOr[Boolean] = js.native
  var isFilePath: js.UndefOr[Boolean] = js.native
  var isTSConfigOnly: js.UndefOr[Boolean] = js.native
  var name: String = js.native
  var paramType: js.UndefOr[DiagnosticMessage] = js.native
  var shortName: js.UndefOr[String] = js.native
  var `type`: string | number | boolean | object_ | list | (Map[Double | String, _]) = js.native
}

object CommandLineOptionBase {
  @scala.inline
  def apply(name: String, `type`: string | number | boolean | object_ | list | (Map[Double | String, _])): CommandLineOptionBase = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommandLineOptionBase]
  }
  @scala.inline
  implicit class CommandLineOptionBaseOps[Self <: CommandLineOptionBase] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: string | number | boolean | object_ | list | (Map[Double | String, _])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDescription(value: DiagnosticMessage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(js.undefined)
        ret
    }
    @scala.inline
    def withExperimental(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("experimental")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExperimental: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("experimental")(js.undefined)
        ret
    }
    @scala.inline
    def withIsFilePath(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isFilePath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsFilePath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isFilePath")(js.undefined)
        ret
    }
    @scala.inline
    def withIsTSConfigOnly(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isTSConfigOnly")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsTSConfigOnly: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isTSConfigOnly")(js.undefined)
        ret
    }
    @scala.inline
    def withParamType(value: DiagnosticMessage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paramType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParamType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paramType")(js.undefined)
        ret
    }
    @scala.inline
    def withShortName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shortName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShortName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shortName")(js.undefined)
        ret
    }
  }
  
}

