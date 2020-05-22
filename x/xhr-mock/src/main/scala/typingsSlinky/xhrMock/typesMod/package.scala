package typingsSlinky.xhrMock

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object typesMod {
  type Mock = typingsSlinky.xhrMock.typesMod.MockObject | typingsSlinky.xhrMock.typesMod.MockFunction
  type MockFunction = js.Function2[
    /* request */ typingsSlinky.xhrMock.mockRequestMod.default, 
    /* response */ typingsSlinky.xhrMock.mockResponseMod.default, 
    js.UndefOr[
      typingsSlinky.xhrMock.mockResponseMod.default | js.Promise[js.UndefOr[typingsSlinky.xhrMock.mockResponseMod.default]]
    ]
  ]
}
