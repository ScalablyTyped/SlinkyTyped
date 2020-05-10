package typingsSlinky.tensorflowTfjsLayers.typesMod

import typingsSlinky.std.Extract
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BaseSerialization[N /* <: String */, T /* <: PyJson[Extract[/* keyof T */ String, String]] */] extends PyJsonDict {
  var class_name: N = js.native
  var config: T = js.native
}

object BaseSerialization {
  @scala.inline
  def apply[N, T](class_name: N, config: T): BaseSerialization[N, T] = {
    val __obj = js.Dynamic.literal(class_name = class_name.asInstanceOf[js.Any], config = config.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseSerialization[N, T]]
  }
  @scala.inline
  implicit class BaseSerializationOps[Self[n, t] <: BaseSerialization[n, t], N, T] (val x: Self[N, T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[N, T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[N, T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[N, T]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[N, T]) with Other]
    @scala.inline
    def withClass_name(value: N): Self[N, T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("class_name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConfig(value: T): Self[N, T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("config")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

