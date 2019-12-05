package typingsSlinky.wegameDashApi.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object types {
  import typingsSlinky.wegameDashApi.Anon_DataArrayBuffer
  import typingsSlinky.wegameDashApi.Anon_ErrMsg
  import typingsSlinky.wegameDashApi.Anon_Header

  type SocketErrorCallback = js.Function1[/* res */ Anon_ErrMsg, Unit]
  type SocketMessageCallback = js.Function1[/* res */ Anon_DataArrayBuffer, Unit]
  type SocketOpenCallback = js.Function1[/* res */ Anon_Header, Unit]
}
