package typingsSlinky.waterline.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Config extends js.Object {
  var adapters: StringDictionary[Adapter] = js.native
  var connections: StringDictionary[Connection] = js.native
}

object Config {
  @scala.inline
  def apply(adapters: StringDictionary[Adapter], connections: StringDictionary[Connection]): Config = {
    val __obj = js.Dynamic.literal(adapters = adapters.asInstanceOf[js.Any], connections = connections.asInstanceOf[js.Any])
    __obj.asInstanceOf[Config]
  }
  @scala.inline
  implicit class ConfigOps[Self <: Config] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdapters(value: StringDictionary[Adapter]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("adapters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConnections(value: StringDictionary[Connection]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connections")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

