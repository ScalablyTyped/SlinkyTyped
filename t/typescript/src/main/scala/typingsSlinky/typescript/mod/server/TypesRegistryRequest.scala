package typingsSlinky.typescript.mod.server

import typingsSlinky.typescript.typescriptStrings.typesRegistry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypesRegistryRequest extends js.Object {
  val kind: typesRegistry = js.native
}

object TypesRegistryRequest {
  @scala.inline
  def apply(kind: typesRegistry): TypesRegistryRequest = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypesRegistryRequest]
  }
  @scala.inline
  implicit class TypesRegistryRequestOps[Self <: TypesRegistryRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withKind(value: typesRegistry): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

