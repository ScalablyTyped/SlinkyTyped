package typingsSlinky.typestubDashIpfs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object typestubDashIpfsMod {
  import org.scalajs.dom.raw.Blob
  import typingsSlinky.node.Buffer
  import typingsSlinky.std.BufferSource

  type Big = js.Any
  type CID = js.Any
  type Callback[T] = js.Function2[/* error */ js.Error, /* result */ js.UndefOr[T], Unit]
  type DAGLink = js.Any
  type DAGLinkRef = DAGLink | js.Any
  type DAGNode = js.Any
  type FileContent = js.Object | Blob | String
  type KeyType = String | Buffer | CID | js.Any
  type Multihash = js.Any | String
  type Obj = BufferSource | js.Object
  type PeerId = js.Any
}
