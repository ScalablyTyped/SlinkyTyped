package typingsSlinky.stubby.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StubbyData extends js.Object {
  /**
    * This object is used to match an incoming request to stubby against the
    * available endpoints that have been configured.
    */
  var request: StubbyRequest = js.native
  /**
    * Assuming a match has been made against the given `request` object, data from
    * `response` is used to build the stubbed response back to the client.
    *
    * **ALSO**: The `response` property can also be a yaml sequence of responses
    * that cycle as each request is made.
    *
    * **ALSO**: The `response` property can also be a url (string) or sequence
    * of object/urls. The url will be used to record a response object to be
    * used in calls to stubby. When used this way, data from the `request`
    * portion of the endpoint will be used to assemble a request to the url
    * given as the `response`.
    */
  var response: js.UndefOr[String | StubbyResponse | (js.Array[String | StubbyResponse])] = js.native
}

object StubbyData {
  @scala.inline
  def apply(request: StubbyRequest): StubbyData = {
    val __obj = js.Dynamic.literal(request = request.asInstanceOf[js.Any])
    __obj.asInstanceOf[StubbyData]
  }
  @scala.inline
  implicit class StubbyDataOps[Self <: StubbyData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRequest(value: StubbyRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("request")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResponse(value: String | StubbyResponse | (js.Array[String | StubbyResponse])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("response")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResponse: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("response")(js.undefined)
        ret
    }
  }
  
}

