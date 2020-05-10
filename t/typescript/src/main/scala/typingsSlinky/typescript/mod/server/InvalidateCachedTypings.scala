package typingsSlinky.typescript.mod.server

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InvalidateCachedTypings extends ProjectResponse {
  @JSName("kind")
  val kind_InvalidateCachedTypings: ActionInvalidate = js.native
}

object InvalidateCachedTypings {
  @scala.inline
  def apply(kind: ActionInvalidate, projectName: String): InvalidateCachedTypings = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], projectName = projectName.asInstanceOf[js.Any])
    __obj.asInstanceOf[InvalidateCachedTypings]
  }
  @scala.inline
  implicit class InvalidateCachedTypingsOps[Self <: InvalidateCachedTypings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withKind(value: ActionInvalidate): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

