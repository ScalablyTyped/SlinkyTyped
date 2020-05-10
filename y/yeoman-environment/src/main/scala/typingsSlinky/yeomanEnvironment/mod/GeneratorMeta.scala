package typingsSlinky.yeomanEnvironment.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GeneratorMeta extends js.Object {
  var namespace: String = js.native
  var resolved: String = js.native
}

object GeneratorMeta {
  @scala.inline
  def apply(namespace: String, resolved: String): GeneratorMeta = {
    val __obj = js.Dynamic.literal(namespace = namespace.asInstanceOf[js.Any], resolved = resolved.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeneratorMeta]
  }
  @scala.inline
  implicit class GeneratorMetaOps[Self <: GeneratorMeta] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNamespace(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("namespace")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResolved(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolved")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

