package typingsSlinky.skyway

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobalScope
@js.native
object global extends js.Object {
  @js.native
  class DataConnection ()
    extends typingsSlinky.skyway.DataConnection
  
  @js.native
  class MediaConnection ()
    extends typingsSlinky.skyway.MediaConnection
  
  @js.native
  class MeshRoom ()
    extends typingsSlinky.skyway.MeshRoom
  
  @js.native
  class Peer protected ()
    extends typingsSlinky.skyway.Peer {
    def this(options: Options) = this()
    def this(id: String, options: Options) = this()
  }
  
  @js.native
  class SFURoom ()
    extends typingsSlinky.skyway.SFURoom
  
}

