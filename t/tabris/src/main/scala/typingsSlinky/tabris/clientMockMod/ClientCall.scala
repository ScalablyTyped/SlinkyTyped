package typingsSlinky.tabris.clientMockMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.tabris.tabrisStrings.call
import typingsSlinky.tabris.tabrisStrings.create
import typingsSlinky.tabris.tabrisStrings.destroy
import typingsSlinky.tabris.tabrisStrings.get
import typingsSlinky.tabris.tabrisStrings.listen
import typingsSlinky.tabris.tabrisStrings.set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClientCall extends js.Object {
  var event: String = js.native
  var id: String = js.native
  var listen: Boolean = js.native
  var method: String = js.native
  var op: create | set | get | listen | call | destroy = js.native
  var parameters: StringDictionary[js.Any] = js.native
  var properties: StringDictionary[js.Any] = js.native
  var property: String = js.native
  var `type`: String = js.native
}

object ClientCall {
  @scala.inline
  def apply(
    event: String,
    id: String,
    listen: Boolean,
    method: String,
    op: create | set | get | listen | call | destroy,
    parameters: StringDictionary[js.Any],
    properties: StringDictionary[js.Any],
    property: String,
    `type`: String
  ): ClientCall = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], listen = listen.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], op = op.asInstanceOf[js.Any], parameters = parameters.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], property = property.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClientCall]
  }
  @scala.inline
  implicit class ClientCallOps[Self <: ClientCall] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEvent(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("event")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListen(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listen")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMethod(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("method")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOp(value: create | set | get | listen | call | destroy): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("op")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParameters(value: StringDictionary[js.Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parameters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProperties(value: StringDictionary[js.Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("properties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProperty(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("property")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

