package typingsSlinky.tabris.clientMockMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.tabris.tabrisStrings.set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClientSetCall extends js.Object {
  var id: String = js.native
  var op: set = js.native
  var properties: StringDictionary[js.Any] = js.native
}

object ClientSetCall {
  @scala.inline
  def apply(id: String, op: set, properties: StringDictionary[js.Any]): ClientSetCall = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], op = op.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClientSetCall]
  }
  @scala.inline
  implicit class ClientSetCallOps[Self <: ClientSetCall] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOp(value: set): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("op")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProperties(value: StringDictionary[js.Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("properties")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

