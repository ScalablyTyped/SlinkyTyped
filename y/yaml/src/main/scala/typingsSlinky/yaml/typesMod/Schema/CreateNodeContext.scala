package typingsSlinky.yaml.typesMod.Schema

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateNodeContext
  extends /* key */ StringDictionary[js.Any] {
  var wrapScalars: js.UndefOr[Boolean] = js.native
}

object CreateNodeContext {
  @scala.inline
  def apply(): CreateNodeContext = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateNodeContext]
  }
  @scala.inline
  implicit class CreateNodeContextOps[Self <: CreateNodeContext] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withWrapScalars(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wrapScalars")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWrapScalars: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wrapScalars")(js.undefined)
        ret
    }
  }
  
}

