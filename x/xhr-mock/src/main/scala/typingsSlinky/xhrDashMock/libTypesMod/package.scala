package typingsSlinky.xhrDashMock

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libTypesMod {
  import typingsSlinky.xhrDashMock.libMockRequestMod.default

  type Mock = MockObject | MockFunction
  type MockFunction = js.Function2[
    /* request */ default, 
    /* response */ typingsSlinky.xhrDashMock.libMockResponseMod.default, 
    js.UndefOr[
      typingsSlinky.xhrDashMock.libMockResponseMod.default | js.Promise[js.UndefOr[typingsSlinky.xhrDashMock.libMockResponseMod.default]]
    ]
  ]
}
