package typingsSlinky.vegaTypings.configMod

import typingsSlinky.vegaTypings.streamMod.EventType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Record<'prevent' | 'allow', boolean | std.Array<vega-typings.vega-typings/types/spec.EventType>> */
@js.native
trait DefaultsConfig extends js.Object {
  var allow: Boolean | js.Array[EventType] = js.native
  var prevent: Boolean | js.Array[EventType] = js.native
}

object DefaultsConfig {
  @scala.inline
  def apply(allow: Boolean | js.Array[EventType], prevent: Boolean | js.Array[EventType]): DefaultsConfig = {
    val __obj = js.Dynamic.literal(allow = allow.asInstanceOf[js.Any], prevent = prevent.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefaultsConfig]
  }
  @scala.inline
  implicit class DefaultsConfigOps[Self <: DefaultsConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllow(value: Boolean | js.Array[EventType]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrevent(value: Boolean | js.Array[EventType]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prevent")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

