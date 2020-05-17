package typingsSlinky.serverless.anon

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Commands extends js.Object {
  var commands: js.UndefOr[StringDictionary[js.Object]] = js.native
  var lifecycleEvents: js.UndefOr[js.Array[String]] = js.native
  var options: js.UndefOr[StringDictionary[Required]] = js.native
  var usage: js.UndefOr[String] = js.native
}

object Commands {
  @scala.inline
  def apply(): Commands = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Commands]
  }
  @scala.inline
  implicit class CommandsOps[Self <: Commands] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCommands(value: StringDictionary[js.Object]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("commands")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCommands: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("commands")(js.undefined)
        ret
    }
    @scala.inline
    def withLifecycleEvents(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lifecycleEvents")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLifecycleEvents: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lifecycleEvents")(js.undefined)
        ret
    }
    @scala.inline
    def withOptions(value: StringDictionary[Required]): Self = {
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
    @scala.inline
    def withUsage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("usage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUsage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("usage")(js.undefined)
        ret
    }
  }
  
}

